# ResolveX — Employee Helpdesk & Ticket Lifecycle Management System

A **workflow-oriented** full-stack helpdesk system built with Spring Boot, enabling employees to raise support tickets, track resolutions, and manage ticket lifecycles efficiently.  
ResolveX **simulates real-world internal helpdesk operations**, streamlining issue reporting and support workflows for modern organizations.

---

## 🚀 Project Highlights

- **Structured Ticket Lifecycle Workflow Management**
- **Layered Spring Boot Architecture**
- **Employee Ticket Tracking Dashboard**
- **Spring Security Integration & BCrypt Password Encryption**
- **RESTful API Design**
- **MySQL + Hibernate ORM Integration**
- **Robust Filtering, Sorting & Search Support**
- **Dockerized Deployment Workflow & AWS EC2 Awareness**
- **JPA Relationship Mapping**
- **Unit Testing with JUnit & Mockito**
- **Clean Frontend using HTML, CSS & JavaScript**

---
https://github.com/user-attachments/assets/b83787ab-5c32-4de2-a054-42ec4c66f425

## 📌 Project Overview

ResolveX empowers employees to:
- Raise and manage support tickets.
- Track ticket progress through distinct workflow stages.
- Reopen unresolved issues and view history.

Designed to showcase:
- Workflow-driven backend design.
- Layered architecture best practices.
- Relational database mapping.
- Secure authentication and filtering operations.
- Real-world, deployment-ready engineering.

---

## 🧠 Problem Statement

Organizations often face:
- Unmanaged issue reporting.
- No centralized ticket tracking.
- Inefficient resolution workflows.

**ResolveX** solves these by providing:
- Centralized helpdesk management.
- Structured lifecycle handling.
- Searchable ticket history.
- Workflow-based ticket processing.

---

## 🔄 Ticket Lifecycle Workflow

Ticket states modeled for real-world operations:

```
OPEN → IN_PROGRESS → CLOSED → REOPENED → OPEN
```

| Status       | Description                               |
|--------------|-------------------------------------------|
| **OPEN**         | New ticket created by employee             |
| **IN_PROGRESS**  | Helpdesk team actively processing the issue|
| **CLOSED**       | Issue resolved and closed                  |
| **REOPENED**     | Employee reopens unresolved issue          |

**Automatic Workflow:**  
- Employee raises → `OPEN`  
- Helpdesk takes up → `IN_PROGRESS`  
- Issue resolved → `CLOSED`  
- Can be reopened by employee → `REOPENED` → `OPEN`

---

## 🏗️ System Architecture

**Layered Monolithic Architecture** for maintainability and modularity.
- Clean separation of concerns
- Easy scalability and testing

---

## 🧱 Architectural Layers

### 1️⃣ Frontend Layer
- User dashboard, ticket form, tracking UI
- **Tech:** HTML5, CSS3, JavaScript

### 2️⃣ Controller Layer
- HTTP request handling, API routing, ticket workflow endpoints
- **Controllers:** `AuthController`, `TicketController`

### 3️⃣ Service Layer
- Business logic, ticket lifecycle, filtering
- **Services:** `UserService`, `TicketService`

### 4️⃣ Security Layer
- Authentication, route protection, BCEypt password handling, endpoint authorization
- **Stack:** Spring Security, BCrypt encoder, filter chain

### 5️⃣ Repository Layer
- DB interactions, entity persistence
- **Repos:** `UserRepository`, `TicketRepository`

### 6️⃣ Database Layer
- Persistent storage, MySQL backend, JPA/Hibernate ORM

---

![System Architecture Diagram]
<img width="1408" height="768" alt="Gemini_Generated_Image_ql7k2jql7k2jql7k" src="https://github.com/user-attachments/assets/ff216b09-3193-4eaa-8075-61f0c94ca438" />

## 🗂️ Entity Relationship Design

**User-to-Ticket:**  
One User → Many Tickets (`@OneToMany`, `@ManyToOne`)

- **User Entity:**  
  Fields: `employeeId`, `username`, `email`, `department`, `password`
- **Ticket Entity:**  
  Fields: `ticketId`, `title`, `description`, `status`, `createdAt`, `user reference`

---

## 🔐 Authentication & Security

- **Spring Security** for authentication & endpoint protection.
- **BCrypt** for secure password storage.
- **Route-Based Authorization, Security Filter Chain**.

_Passwords are never stored in plaintext!_

**Authentication Flow:**
```
User Login
→ Security Filter Chain
→ BCrypt Validation
→ Access Granted
→ API Processing
```

---

## 📡 REST API Features

Standard RESTful endpoints for user and ticket management.

#### Ticket Operations
- Create, update, retrieve, filter, and reopen tickets

#### Filtering/Search
- Status-based, user-based, pagination, sorting, search

---

## ⚙️ Notable Backend Logic

- Workflow-driven ticket lifecycle/state transitions
- Service-layer ticket handling
- Secure user ownership and mapping
- Status toggle and reopen logic
- Filter, sort, paginate for tickets

---

## 📊 Backend Workflow (at a glance)

```
Employee Raises Ticket
↓
Ticket Stored in DB
↓
Helpdesk Processes (IN_PROGRESS)
↓
Ticket Closed
↓
Employee May Reopen
```

---

## 🧪 Testing & Quality

- **Unit Testing:** JUnit
- **Mock Dependencies:** Mockito
- **Covered Areas:** Service layer, repository interaction, workflow, filtering, user logic

| Service      | Test Coverage           |
|--------------|------------------------|
| UserService  | ~5 core test cases      |

---

## ⚙️ Tech Stack

| Layer       | Technologies                |
|-------------|----------------------------|
| Frontend    | HTML5, CSS3, JavaScript    |
| Backend     | Spring Boot 3, Spring Web  |
| Security    | Spring Security, BCrypt    |
| ORM         | Hibernate / JPA            |
| Database    | MySQL                      |
| Build Tool  | Maven                      |
| Deployment  | Docker                     |
| Cloud       | AWS EC2 Awareness          |
| VCS         | Git & GitHub               |

---

## 🐳 Docker & Deployment Workflow

- **Dockerfile** for easy image build
- Ready for **AWS EC2** and local deployment

```text
Developer → GitHub → Dockerfile → Docker Image → AWS EC2 → Container → Running App
```

---

## ☁️ Deployment Awareness

- Dockerized application
- Image-based CI/CD friendly workflow
- AWS EC2 guidance for production

---

## 📂 Project Structure

```text
src
├── main
│   ├── java/com/resolvex
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── entity
│   │   ├── security
│   │   ├── config
│   │   └── exception
│   └── resources/application.properties
├── test/java/com/resolvex/UserServiceTest
```

---

## ⚡ Performance Characteristics

| Parameter             | Expected Behavior |
|-----------------------|------------------|
| Login Latency         | Low              |
| Ticket Creation Speed | Fast             |
| Ticket Retrieval      | Optimized        |
| Filtering Performance | Moderate         |
| Workflow Processing   | Efficient        |

---

## 📈 Scalability

- Layered design for maintainability and modular upgrades
- Suitable for small and mid-sized organizations, moderate ticket volumes

---

## 🧠 Key Engineering Decisions

- Layered architecture for clarity
- MySQL for structured data
- Spring Security for auth
- JPA/Hibernate for ORM
- Docker for portability

---

## ⚠️ Challenges Faced

- Handling workflow transitions & bidirectional mapping
- Secure password/auth setup
- Workflow-driven and not just CRUD
- Deployment dockerization

---

## 📈 Future Enhancements

- JWT Authentication
- Role-Based Access Control (RBAC)
- SLA, Escalation & Ticket Prioritization
- Email Notifications & Analytics Dashboard
- OpenAPI Documentation (Swagger)
- Microservices Migration
- Enhanced Monitoring & Logging

---

## ▶️ How To Run Locally

1. **Clone Repository:**
    ```bash
    git clone https://github.com/your-username/helpdesk-support-system.git
    cd helpdesk-support-system
    ```

2. **Configure Database:**
    Edit `src/main/resources/application.properties` with your MySQL details:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/support_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build Project:**
    ```bash
    mvn clean install
    ```

4. **Run Application:**
    ```bash
    mvn spring-boot:run
    ```

5. **Open in Browser:**  
    [http://localhost:8080](http://localhost:8080)

---

## 💡 Key Engineering Concepts Demonstrated

- Layered Architecture & Service-Based Design
- Workflow-Based Ticket Lifecycle Management
- Secure Authentication
- JPA/Hibernate ORM
- Filtering & Pagination Support
- Docker & Cloud Deployment Awareness
- Unit Testing for Service Layer

---

## 🏁 Conclusion

**ResolveX** showcases workflow management for helpdesk operations, underpinned by clean Spring Boot architecture, strong security, and real-world backend engineering.  
Ideal for organizations seeking maintainable, secure, and extensible support ticketing solutions.

---

## 👨‍💻 Author

Built as a backend engineering portfolio project focused on:
- Workflow-driven logic
- Spring Boot development
- Secure REST APIs
- Robust relational modeling
- Production-ready deployments

---
