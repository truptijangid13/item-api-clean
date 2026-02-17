FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

# Give permission to mvnw
RUN chmod +x mvnw

# Build app
RUN ./mvnw clean package -DskipTests

EXPOSE 10000

CMD ["sh", "-c", "java -jar target/*.jar --server.port=$PORT"]