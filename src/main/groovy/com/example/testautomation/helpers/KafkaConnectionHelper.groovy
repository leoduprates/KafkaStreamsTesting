package com.example.testautomation

class KafkaConnectionHelper {

    static Properties getProperties() {
        Properties properties = new Properties()
        properties.put('bootstrap.servers', '0.0.0.0:9092')
        properties.put('key.serializer', 'org.apache.kafka.common.serialization.StringSerializer')
        properties.put('value.serializer', 'org.apache.kafka.common.serialization.StringSerializer')
        properties.put('key.deserializer', 'org.apache.kafka.common.serialization.StringDeserializer')
        properties.put('value.deserializer', 'org.apache.kafka.common.serialization.StringDeserializer')
        properties.put('group.id', 'groovy-consumer')
        properties.put('auto.offset.reset', 'latest')

        return properties
    }

}
