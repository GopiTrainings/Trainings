FROM openjdk:8-jre-alpine
ADD build/libs/*.jar /home/
CMD ["java","-jar","home/Trainings-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080