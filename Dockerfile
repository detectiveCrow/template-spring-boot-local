FROM openjdk:17-jdk-alpine3.14
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=spring-boot/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
