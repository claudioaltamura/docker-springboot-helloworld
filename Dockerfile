FROM openjdk:8-jdk-alpine

COPY build/libs/docker-springboot-helloworld-0.1.0.jar /usr/src/docker-springboot-helloworld-0.1.0.jar

EXPOSE 5005
EXPOSE 8080
ENV JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /usr/src/docker-springboot-helloworld-0.1.0.jar"]