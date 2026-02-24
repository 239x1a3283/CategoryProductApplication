# CategoryProductApplication

A Spring Boot project for managing product categories and products.  
This application demonstrates full CRUD operations (Create, Read, Update, Delete) using REST APIs, service‑layer architecture, and an H2 in‑memory database.

---

## 🚀 Features
- Create, update, delete, and list categories
- REST endpoints built with Spring Boot
- Repository layer using Spring Data JPA
- Service layer for business logic
- H2 in‑memory database for quick setup and testing
- Maven build and dependency management

---

## 🛠️ Tech Stack
- **Java 17+**
- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **Maven**
- **H2 Database**
- **Visual Studio Code**

---

## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/239x1a3283/CategoryProductApplication.git


2. Navigate into the project folder:
    cd CategoryProduct

3. Run the application:
    mvn spring-boot:run

4. Access the application at:
    http://localhost:8082



5. 📌 Example Endpoints
    Get All Categories
    GET http://localhost:8082/category/all

Response:

[
  {
    "id": 1,
    "name": "Electronics",
    "description": "Devices and gadgets"
  }
]

6. Get Category by ID
    GET http://localhost:8082/category/1

7. Add Category
    POST http://localhost:8082/category/add
Body:
{
  "name": "Books",
  "description": "All kinds of books"
}

8. Update Category
    PUT http://localhost:8082/category/update/1
Body:
{
  "name": "Updated Electronics",
  "description": "Updated description"
}
9. Delete Category
    DELETE http://localhost:8082/category/delete/1
    Response: "Category deleted successfully!"
