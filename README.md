# Employee Management System

A RESTful backend application built with Java, Spring Boot, Spring Data JPA, and MySQL to manage employee records.

## Technologies Used

* Java 21
* Spring Boot
* Spring Data JPA / Hibernate
* MySQL
* Maven
* Lombok
* Jakarta Bean Validation
* Postman

## Features

* Create employee records
* Retrieve all employees
* Retrieve an employee by ID
* Update employee details
* Delete employee records
* Validate employee input
* Handle exceptions with meaningful HTTP responses
* Automatically generate employee IDs

## Employee Fields

* ID
* First Name
* Last Name
* Email
* Department
* Salary

## API Endpoints

| Method | Endpoint              | Description                |
| ------ | --------------------- | -------------------------- |
| POST   | `/api/employees`      | Create an employee         |
| GET    | `/api/employees`      | Retrieve all employees     |
| GET    | `/api/employees/{id}` | Retrieve an employee by ID |
| PUT    | `/api/employees/{id}` | Update an employee         |
| DELETE | `/api/employees/{id}` | Delete an employee         |

## Setup Instructions

1. Install Java 21 and MySQL.
2. Clone this repository.
3. Create a MySQL database named `employee_db`.
4. Configure the database URL, username, and password in `application.properties`.
5. Run the application using your IDE or Maven.

## Running the Application

Using Maven:

```bash
mvn spring-boot:run
```

The application runs at:

`http://localhost:8080`

## Testing

Use Postman to test the REST API endpoints.

## Author

Mohammed Afzal
