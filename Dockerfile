FROM amazoncorretto:17

WORKDIR /app

COPY build/libs/*-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-Dspring.profiles.active=prod", "-jar", "app.jar" ]