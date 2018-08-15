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

## Running the example in a docker container

docker image build -t docker-springboot-helloworld:latest .

docker run -d -p 8080:8080 docker-springboot-helloworld:latest

curl http://localhost:8080/helloworld 

