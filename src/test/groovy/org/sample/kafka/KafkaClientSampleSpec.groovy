package org.sample.kafka

import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import org.sample.kafka.helpers.KafkaAssertionsHelper
import org.sample.kafka.helpers.KafkaConnectionHelper
import spock.lang.Shared
import spock.lang.Specification

class KafkaClientSampleSpec extends Specification {

    @Shared
    KafkaProducer kafkaProducer
    @Shared
    KafkaConsumer kafkaConsumer
    @Shared
    KafkaAssertionsHelper kafkaAssertions

    def setupSpec() {
        kafkaProducer = new KafkaProducer(KafkaConnectionHelper.getProperties())
        kafkaConsumer = new KafkaConsumer(KafkaConnectionHelper.getProperties())
        kafkaAssertions = new KafkaAssertionsHelper(kafkaConsumer)
    }

    def 'Send and check if the record is in the topic'() {
        given:
        String key = new Random().nextLong()
        String message = "key: $key, message: 'Hello World'"

        when:
        kafkaProducer.send(new ProducerRecord('test', key, message))

        then:
        kafkaAssertions.assertRecordExists(["test"], "Hello World")
    }

    def cleanupSpec() {
        kafkaProducer.close()
        kafkaConsumer.close()
    }
}
