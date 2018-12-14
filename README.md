# kafka-test-sample

Sample project to send and consume records in Kafka topics using Apache Kafka Client. This example inser a record in the topic and assert if value is enabled to consume.

### Prerequisites

```shell
JVM (>=1.8.0)
GROOVY (>=2.4.8)
GRADLE (>=4.7)
```

## Getting Started

1) Download dependencies:
```shell
gradle build
```

2) Run tests:
```shell
gradle clean -Dtest.single=KafkaClientSampleSpec test
```

### Docker

1) Install: https://docs.docker.com/install/

2) Pull Command:
```shell
docker pull spotify/kafka
```

3) Run:
```shell
docker run -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=0.0.0.0 --env ADVERTISED_PORT=9092 spotify/kafka
```

### Kafka Commands:

1) How to create a topic:
```shell
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```

2) How to produce a record in topic:
```shell
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
```

3) How to consume a record in topic:
```shell
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning
```

### Resources
* [Groovy](http://groovy-lang.org/)
* [Spock](http://spockframework.org/)
* [Kafka](https://kafka.apache.org/documentation/)
