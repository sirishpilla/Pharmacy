FROM openjdk:8-windowsservercore
EXPOSE 8080
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY /target/Pharmacy-0.0.1-SNAPSHOT.jar /Pharmacy.jar
ENTRYPOINT ["java", "-jar", "Pharmacy.jar"]