FROM java:8-jdk-alpine
MAINTAINER deepakrao666@gmail.com
COPY ./target/pro-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch pro-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","pro-0.0.1-SNAPSHOT.jar"]