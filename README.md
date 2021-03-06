[![CircleCI](https://circleci.com/gh/Shterneregen/mssc-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/Shterneregen/mssc-beer-inventory-service)
# MSSC Beer Inventory Service

| Service                                                                                    | Port   |
| ------------------------------------------------------------------------------------------ |--------|
| [MSSC Beer Service](https://github.com/Shterneregen/mssc-beer-service)                     | 8080   |
| [MSSC Beer Order Service](https://github.com/Shterneregen/mssc-beer-order-service)         | 8081   |
| [MSSC Beer Inventory Service](https://github.com/Shterneregen/mssc-beer-inventory-service) | 8082   |
| [SFG Inventory Failover Service](https://github.com/Shterneregen/mssc-inventory-failover)  | 8083   |
| [SFG Brewery Gateway Service](https://github.com/Shterneregen/mssc-brewery-gateway)        | 9090   |
| [SFG Brewery Eureka Service](https://github.com/Shterneregen/mssc-brewery-eureka)          | 8761   |
| [SFG Brewery Configuration Service](https://github.com/Shterneregen/mssc-config-server)    | 8888   |
| [SFG Brewery Configuration Repo](https://github.com/Shterneregen/mssc-brewery-config-repo) | GitHub |
| ActiveMQ Artemis                                                                           | 8161   |
| Zipkin Server                                                                              | 9411   |

---
For this service should be up:
* [SFG Brewery Eureka Service](https://github.com/Shterneregen/mssc-brewery-eureka)
* [SFG Brewery Configuration Service](https://github.com/Shterneregen/mssc-config-server)
* ActiveMQ Artemis
* Zipkin

---
[Dockerfile for the ActiveMQ Artemis Project](https://github.com/vromero/activemq-artemis-docker)
```console
docker run -d -p 8161:8161 -p 61616:61616 --name artemis vromero/activemq-artemis
``` 
Credentials: `artemis` / `simetraehcapa`

[Zipkin Quickstart](https://zipkin.io/pages/quickstart)
```console
docker run -d -p 9411:9411 --name zipkin openzipkin/zipkin
``` 

---
* Original repo:
[MSSC Beer Inventory Service](https://github.com/springframeworkguru/mssc-beer-inventory-service)
* Course: 
[Spring Boot Microservices with Spring Cloud Beginner to Guru](https://www.udemy.com/course/spring-boot-microservices-with-spring-cloud-beginner-to-guru/)