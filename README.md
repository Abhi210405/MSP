# MSP: Blockchain Rental Property System with Smart Contracts

## Overview

MSP is a comprehensive platform for managing rental properties, leveraging blockchain technology and smart contracts to ensure transparency, security, and automation in property management. The project consists of a Spring Boot backend and a React frontend, providing a seamless experience for property owners, tenants, and administrators.

---

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Backend Setup](#backend-setup)
  - [Frontend Setup](#frontend-setup)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- User authentication and registration
- Contact form for inquiries
- Property listing and management
- Blockchain-based rental agreements (planned)
- Responsive UI with chatbot assistance
- Email notifications (backend)
- Modular and scalable codebase

---

## Project Structure

```
MSP/
├── .gitattributes
├── .gitignore
├── README.md
├── MSP.HTML
├── frontend-project/
│   ├── package.json
│   ├── README.md
│   ├── public/
│   │   └── index.html
│   └── src/
│       ├── App.js
│       ├── assets/
│       ├── components/
│       ├── index.js
├── msp-construction-backend/
│   ├── pom.xml
│   ├── README.md
│   └── src/
│       ├── main/
│       │   ├── java/com/msp/construction/
│       │   │   ├── MspConstructionApplication.java
│       │   │   ├── controller/
│       │   │   ├── model/
│       │   │   └── service/
│       │   └── resources/
│       │       ├── application.properties
│       │       └── static/MSP.HTML
│       └── test/
```

---

## Getting Started

### Prerequisites

- [Node.js](https://nodejs.org/) (v14+)
- [npm](https://www.npmjs.com/)
- [Java 11+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/) (or H2 for testing)

---

### Backend Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Abhi210405/MSP.git
   cd MSP/msp-construction-backend
   ```

2. **Configure the database:**
   - Edit `src/main/resources/application.properties` with your MySQL credentials.

3. **Build and run the backend:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```
   The backend will be available at [http://localhost:8080](http://localhost:8080).

---

### Frontend Setup

1. **Navigate to the frontend directory:**
   ```sh
   cd ../frontend-project
   ```

2. **Install dependencies:**
   ```sh
   npm install
   ```

3. **Start the frontend:**
   ```sh
   npm start
   ```
   The frontend will be available at [http://localhost:3000](http://localhost:3000).

---

## API Endpoints

### Authentication

- `POST /api/auth/register` — Register a new user
- `POST /api/auth/login` — Login with username and password

### Contact

- `POST /api/contact/send` — Send a contact message

> For more endpoints, see the backend code in [`msp-construction-backend`](msp-construction-backend/README.md).

---

## Usage

- Access the frontend at [http://localhost:3000](http://localhost:3000).
- Use the navigation bar to explore services, projects, about, and contact sections.
- Use the chatbot for quick assistance.
- Use the login modal to register or log in as a user.
- Contact messages are handled via the backend and stored in the database.

---

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [React](https://react.dev/)
- [MySQL](https://www.mysql.com/)
- [Open Source Community](https://github.com/Abhi210405/MSP)
