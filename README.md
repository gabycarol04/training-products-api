# training-products-api

## Información del proyecto

### Framework

- Spring Boot 2.5.2

### Herramientas

- Java 11
- Maven Wrapper 3.8.1

### Dependencias

- Lombok
- Spring Boot DevTools
- Spring Web

## Información del API

- Port 8082
- Context Path = /training/api
- GET /test
- GET /accounts

Se incluye colección de Postman

## Construcción del proyecto

### Compilación usando Maven Wrapper
```
$ ./mvnw clean package
```

### Ejecución usando Maven Wrapper
```
$ ./mvnw spring-boot:run
```

### Ejecución usando Java
```
$ java -jar target/products-api-1.0.0-SNAPSHOT.jar
```
