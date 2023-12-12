FROM openjdk:17
LABEL maintainer="charan"
ADD target/demo-0.0.1-SNAPSHOT.jar springboot-docker-workshop.jar
ENTRYPOINT ["java","-jar","springboot-docker-workshop.jar"]