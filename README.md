# Item API Project

This is a simple Java Spring Boot REST API for managing items.

## How to Run
1. Install Java 17 and Maven
2. Run:
   mvn spring-boot:run
3. Server runs on http://localhost:8080

## API Endpoints

### Add Item
POST /items
Body:
{
"id":1,
"name":"Laptop",
"description":"Gaming Laptop",
"price":50000
}

### Get Item by ID
GET /items/{id}

### Get All Items
GET /items

## Data Storage
Items are stored in-memory using ArrayList.
