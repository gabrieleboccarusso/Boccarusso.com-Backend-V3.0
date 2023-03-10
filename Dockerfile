FROM openjdk:17-jdk-slim

WORKDIR /app
COPY ./boccarusso-3.0.0.jar /app

EXPOSE 8080

CMD ["java", "-jar", "boccarusso-3.0.0.jar"]