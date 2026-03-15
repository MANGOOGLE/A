FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY a1.java .
RUN javac a1.java
CMD ["java" , "a1","10"]