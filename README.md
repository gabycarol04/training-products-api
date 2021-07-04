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

### Compilación usando Gradle Wrapper
```
$ ./gradlew clean build
```

### Ejecución usando Gradle Wrapper
```
$ ./gradlew bootRun
```

### Ejecución usando Java
```
$ java -jar build/libs/products-api-1.0.0-SNAPSHOT.jar
```
