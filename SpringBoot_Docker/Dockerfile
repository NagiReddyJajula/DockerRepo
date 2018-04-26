FROM openjdk:8
ADD  /var/lib/docker/tmp/docker-builder*/SpringBoot_Docker.jar SpringBoot_Docker.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","SpringBoot_Docker.jar"]
