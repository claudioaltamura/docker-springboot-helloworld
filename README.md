# docker-springboot-helloworld
spring boot example with docker


## Building the example 

with tests
./gradlew clean build

or without tests

./gradle clean bootJar

## Running the example 

java -jar build/libs/docker-springboot-helloworld-0.1.0.jar


curl http://localhost:8080/helloworld


curl http://localhost:8080/helloworld/angelo
