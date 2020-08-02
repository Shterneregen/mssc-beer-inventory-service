[![CircleCI](https://circleci.com/gh/Shterneregen/mssc-beer-inventory-service.svg?style=svg)](https://circleci.com/gh/Shterneregen/mssc-beer-inventory-service)
# MSSC Beer Inventory Service

| Services                                                                                   |Port|
| ------------------------------------------------------------------------------------------ |----|
| [MSSC Beer Service](https://github.com/Shterneregen/mssc-beer-service)                     |8080|
| [MSSC Beer Order Service](https://github.com/Shterneregen/mssc-beer-service)               |8081|
| [MSSC Beer Inventory Service](https://github.com/Shterneregen/mssc-beer-inventory-service) |8082|
| [SFG Inventory Failover Service](https://github.com/Shterneregen/mssc-inventory-failover)  |8083|
| [SFG Brewery Gateway Service](https://github.com/Shterneregen/mssc-brewery-gateway)        |9090|
| [SFG Brewery Eureka Service](https://github.com/Shterneregen/mssc-brewery-eureka)          |8761|

---
[Dockerfile for the ActiveMQ Artemis Project](https://github.com/vromero/activemq-artemis-docker)
```console
docker run -it --rm -p 8161:8161 -p 61616:61616 vromero/activemq-artemis
``` 
Credentials: 
`artemis` / `simetraehcapa`

---
* Original repo:
[MSSC Beer Inventory Service](https://github.com/springframeworkguru/mssc-beer-inventory-service)
* Course: 
[Spring Boot Microservices with Spring Cloud Beginner to Guru](https://www.udemy.com/course/spring-boot-microservices-with-spring-cloud-beginner-to-guru/)