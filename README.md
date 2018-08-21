[![Build Status](https://travis-ci.org/claudioaltamura/docker-springboot-helloworld.svg?branch=master)](https://travis-ci.org/claudioaltamura/docker-springboot-helloworld)


# docker-springboot-helloworld
spring boot example with docker


## Building the example 

with tests

	./gradlew clean build

or without tests

	./gradle clean bootJar

## Running the example

Run

	java -jar build/libs/docker-springboot-helloworld-0.1.0.jar

Check

	curl http://localhost:8080/helloworld
	curl http://localhost:8080/helloworld/angelo

## Running the example in a docker container

Build

	docker image build -t docker-springboot-helloworld:latest .

Run

	docker run -d -p 8080:8080 docker-springboot-helloworld:latest

check

	curl http://localhost:8080/helloworld 


## Actuator

health check

	curl http://localhost:8080//actuator/health

info

	curl http://localhost:8080/actuator/info


metrics

	curl http://localhost:8080/actuator/metrics
