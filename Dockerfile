FROM openjdk:latest

COPY build/libs/docker-springboot-helloworld-0.1.0.jar /usr/src/docker-springboot-helloworld-0.1.0.jar

EXPOSE 8080

CMD java -jar /usr/src/docker-springboot-helloworld-0.1.0.jar
