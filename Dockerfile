FROM openjdk:17-alpine
MAINTAINER NICO
COPY target/fabrica-aberturas-backend-0.0.1-SNAPSHOT.jar  fabrica-aberturas-backend-app.jar
ENTRYPOINT ["java","-jar","/fabrica-aberturas-backend-app.jar"]
EXPOSE 8080