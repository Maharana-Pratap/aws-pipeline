FROM openjdk:17
WORKDIR /app
COPY ./target/demo-service.jar /app
EXPOSE 8080
CMD ["java","-jar","demo-service.jar"]