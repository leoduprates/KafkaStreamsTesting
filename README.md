# kafka-test-sample

Sample project to send and consume records in Kafka topics using Apache Kafka Client.

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
gradle -Dtest.single=KafkaClientSampleSpec test
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
