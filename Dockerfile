FROM amazoncorretto:17
MAINTAINER ESME
COPY target/Render-0.0.1-SNAPSHOT.jar d.jar
ENTRYPOINT ["java","-jar","d.jar"]