# Use an official OpenJDK base image with a specific version
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file of your Java application to the container
COPY target/sendNotificatioToSNS-0.0.1-SNAPSHOT.jar .

# Expose the port on which your application listens (if applicable)
EXPOSE 8080

# Define the command to run your Java application
CMD ["java", "-jar", "sendNotificatioToSNS-0.0.1-SNAPSHOT.jar"]
