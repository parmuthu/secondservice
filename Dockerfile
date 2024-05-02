#FROM openjdk:17-oracle
FROM openjdk:17-jdk-alpine
LABEL maintainer="parvathymv26@gmail.com"
WORKDIR /app
COPY target/secondservice-0.0.1-SNAPSHOT.jar /app/secondservice.jar
ENTRYPOINT ["java", "-jar", "secondservice.jar"]


