FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY a2.java .
RUN javac a2.java
CMD ["java" , "a2"]