package org.sample.kafka.helpers

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.clients.consumer.ConsumerRecords
import org.apache.kafka.clients.consumer.KafkaConsumer

class KafkaAssertionsHelper {

    KafkaConsumer kafkaConsumer

    KafkaAssertionsHelper(KafkaConsumer kafkaConsumer) {
        this.kafkaConsumer = kafkaConsumer
    }

    boolean assertRecordExists(Collection<String> topics, String value) {
        boolean exists = false
        boolean hasRecords = true
        this.kafkaConsumer.subscribe(topics)

        while (hasRecords) {
            ConsumerRecords<String, String> records = this.kafkaConsumer.poll(10000)

            if (records.size() != 0) {
                for (ConsumerRecord<String, String> record : records) {
                    if (record.value().contains(value))
                        exists = true
                }
            } else {
                hasRecords = false
            }
        }
        return exists
    }
}