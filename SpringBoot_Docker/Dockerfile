FROM openjdk:8
RUN mkdir -p /opt
WORKDIR /opt
COPY . /opt
ADD  /opt/target/SpringBoot_Docker-0.0.1.jar SpringBoot_Docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringBoot_Docker.jar"]
