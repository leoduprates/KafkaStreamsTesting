![Apache Groovy](https://img.shields.io/badge/Groovy-%234298B8.svg?style=for-the-badge&logo=Apache%20Groovy&logoColor=white)
![Apache Kafka](https://img.shields.io/badge/Kafka-%23231F20.svg?style=for-the-badge&logo=Apache%20Kafka&logoColor=white)
![Spock Framework](https://img.shields.io/badge/Spock-%230078D4.svg?style=for-the-badge&logo=Star%20Trek&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-%2325A162.svg?style=for-the-badge&logo=JUnit5&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-%2302303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
<a href="https://linkedin.com/in/leonardo-duprates">
  <img alt="LinkedIn" src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white"/>
</a>

# Kafka Streams Testing

Example project to test producer-consumer Kafka Streams using Spock Framework with Groovy.

## Built With

- [Apache Groovy](https://groovy-lang.org/)
- [Spock Framework](https://spockframework.org/)
- [HTTP Builder](https://mvnrepository.com/artifact/org.codehaus.groovy.modules.http-builder/http-builder)
- [Kafka Clients](https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients)
- [JUnit](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)

## Project Architecture

```shell
KafkaStreamsTesting
├── src
│   ├── main
│       ├── groovy/com/example/testautomation
│           ├── helpers
│   ├── test
│       ├── groovy/com/example/testautomation
│           ├── PublishSubscribeRecordSpec

```

## Getting Started

1\. Build:

```shell
$ gradle build
```

2\. Run Tests:

```shell
$ gradle -Dtest.single=PublishSubscribeRecordSpec test
```

## Docker

1\. Pull spotify/kafka:

```shell
$ docker pull spotify/kafka
```

2\. Run Container:

```shell
$ docker run -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=0.0.0.0 --env ADVERTISED_PORT=9092 spotify/kafka
```

2\. Open Container Bash:

```shell
$ docker exec -it <container_id> /bin/bash
```

## Links

- [Apache Groovy](https://groovy-lang.org/)
- [Spock Framework](https://spockframework.org/)
- [Java](https://java.com/)
- [Gadle](https://gradle.org/)
- [Maven](https://mvnrepository.com/)
