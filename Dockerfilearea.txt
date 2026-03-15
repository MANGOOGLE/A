FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY AreaOfCircle.java .
RUN javac AreaOfCircle.java
CMD ["java", "AreaOfCircle", "10"]