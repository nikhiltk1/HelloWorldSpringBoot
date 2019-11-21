#This is a sample image
FROM ubuntu
MAINTAINER nikhil.kailasanathan@capillarytech.com
RUN apt-get update
RUN apt-get install openjdk-8-jdk -y
RUN apt-get install maven -y
COPY src /data/SampleApplication/src
COPY pom.xml /data/SampleApplication/pom.xml
WORKDIR /data/SampleApplication
RUN mvn clean package
RUN mvn install
RUN mvn spring-boot:run
EXPOSE 3000
#WORKDIR=/Users/nikhil.tk/JAVA/SampleApplication/
#ARG JAR_FILE=target/SampleApplication-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} SampleApplication.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/SampleApplication.jar"]
CMD ["echo","Image Created"]

