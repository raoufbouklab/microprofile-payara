# Eclipse MicroProfile based Java Micro service example

This is a simple example of writing java micro services based on https://microprofile.io[Eclipse MicroProfile].

## Eclipse MicroProfile
Eclipse MicroProfile version 1.1 with https://payara.fish[Payara Micro] runtime is used in this example.

MicroProfile 1.1 consists of
JAX-RS 2.0, CDI 1.2, JSON-P 1.0 and Eclipse Config 1.0 API.

## Build and Run Project 
Project uses maven to manage build lifecycle.

```
mvn clean install payara-micro:bundle
mvn payara-micro:start
```

## Stop service

`mvn payara-micro:stop`


## Access service
Service exposes below JAX RS Endpoints -

- GET http://localhost:8080/microprofile-service-example-0.0.1-SNAPSHOT/api/books
- POST http://localhost:8080/microprofile-service-example-0.0.1-SNAPSHOT/api/books
- GET http://localhost:8080/microprofile-service-example-0.0.1-SNAPSHOT/api/books/1
