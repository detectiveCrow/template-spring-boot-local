## Spring Boot

### Change working directory

```
cd spring-boot
```

### Build spring-boot

```
./gradlew build
```

### Run built spring project

```
java -jar build/libs/spring-boot-0.0.1.jar
```

## Docker

### Build spring-boot

```
docker build -t spring-boot .
```

### Run built image

```
docker run -it -p 8080:8080 spring-boot
```

## Docker Compose

### Build spring-boot image

```
cd spring-boot
./gradlew build
```

### docker-compose up

```
cd ..
docker-compose up
```