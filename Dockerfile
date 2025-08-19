FROM openjdk:21
WORKDIR /app
COPY ./target/demo-service.jar /app
EXPOSE 8080
CMD ["java","-jar","demo-service.jar"]