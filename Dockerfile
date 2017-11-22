FROM openjdk:8-jre-alpine
ADD build/libs/*.jar /home/
CMD ["java","-jar","home/demo.jar"]
