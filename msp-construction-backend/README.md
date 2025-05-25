# MSP Construction Backend

## Overview
This project is a backend application for MSP Construction & Property, built using Spring Boot. It provides RESTful APIs for handling contact messages and user authentication.

## Project Structure
```
msp-construction-backend
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── msp
│   │   │           └── construction
│   │   │               ├── MspConstructionApplication.java
│   │   │               ├── controller
│   │   │               │   ├── ContactController.java
│   │   │               │   └── AuthController.java
│   │   │               ├── model
│   │   │               │   ├── ContactMessage.java
│   │   │               │   └── User.java
│   │   │               └── service
│   │   │                   ├── ContactService.java
│   │   │                   └── AuthService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           └── MSP.HTML
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd msp-construction-backend
   ```

2. **Build the project:**
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application:**
   You can run the application using:
   ```
   mvn spring-boot:run
   ```

4. **Access the API:**
   The application will be available at `http://localhost:8080`. You can access the following endpoints:
   - **Contact Messages:**
     - POST `/api/contact` to send a contact message.
   - **User Authentication:**
     - POST `/api/auth/login` for user login.
     - POST `/api/auth/register` for user registration.

## Usage Guidelines
- Ensure that your database is configured correctly in `src/main/resources/application.properties`.
- Use Postman or any API client to test the endpoints.
- For frontend integration, the static HTML file is located in `src/main/resources/static/MSP.HTML`.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the MIT License.