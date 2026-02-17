# Use Java 17
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the Spring Boot app
RUN ./mvnw clean package -DskipTests

# Expose Render dynamic port
EXPOSE 10000

# Run jar dynamically (auto detect jar name)
CMD ["sh", "-c", "java -jar target/*.jar --server.port=$PORT"]