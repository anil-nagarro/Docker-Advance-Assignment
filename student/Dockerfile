
# Stage 1: Build the application using Maven
FROM maven:3.8.8-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jre-alpine

# Create a non-root user 'appuser' with a home directory and set up the application directory
RUN useradd -u 1001 -m -d /home/appuser -s /bin/bash appuser && mkdir /app && chown -R appuser:appuser /app

WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/student-management-0.0.1-SNAPSHOT.jar app.jar

# Switch to the non-root user
USER appuser

# Set entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
