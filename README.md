# 🌟 Spring Boot REST API

This is a simple REST API built with Spring Boot that provides basic user management functionality. The API allows you to retrieve user information by user ID.

## ✨ Features

- 🧑‍💻 Retrieve User Information: Get user details by user ID.

## 🛠️ Technologies Used

- **Java**: Programming language.
- **Spring Boot**: Framework for building RESTful web services.
- **Maven**: Dependency management.

## 🚀 Getting Started

Prerequisites:
- Java 17 or later
- Maven 3.8.x or later

## Installation
Clone the repository:

```bash
git clone https://github.com/your-username/spring-boot-rest-api.git
cd spring-boot-rest-api
```

Build the project with Maven:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

The application will start and run on http://localhost:8080.

## 📚 API Endpoints

Retrieve User Information

`GET /user`

Retrieves user details by ID.

Example Request

```bash
curl -X GET "http://localhost:8080/user?id=1"
```

Example Response
```json
{
  "id": 1,
  "name": "Joe",
  "age": 32,
  "email": "joedoe@email.com"
}
```

🤝 Contributing
Contributions are welcome! Feel free to fork the repository and open a pull request.
