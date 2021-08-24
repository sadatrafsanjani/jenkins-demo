FROM openjdk:8
EXPOSE 8080
ADD target/jenkins-demo.war jenkins-demo.war
ENTRYPOINT ["java", "-war", "/jenkins-demo.war"]