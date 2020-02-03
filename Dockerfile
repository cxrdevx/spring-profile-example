FROM openjdk:8-jdk-alpine
MAINTAINER Carlos Tapia<carlos.tapia@sistemasa.cl>
RUN adduser -D springboot
USER springboot
# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD ./target/lib           /usr/share/lib
# Add the service itself
#ARG JAR_FILE
COPY ./target/*.jar /usr/share/app.jar
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java", "-Djava.security.egd=file:/dev/./urandom","-jar", "/usr/share/app.jar"]
