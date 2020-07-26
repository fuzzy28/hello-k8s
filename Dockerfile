FROM openjdk:8-jdk-alpine

COPY target/hello-k8s-0.0.1-SNAPSHOT.jar hello-k8s.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","-Dlog.file.root=${LOG_LOCATION}","/hello-k8s.jar"]