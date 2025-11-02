# helpdesk-support-system
# 💬 Customer Support Ticket System

A **full-stack Spring Boot web application** that enables efficient management of customer queries and support tickets.  
It allows users to **register, log in, create tickets, and view their issue history**, making the customer service process smooth and transparent.

---

https://github.com/user-attachments/assets/b83787ab-5c32-4de2-a054-42ec4c66f425

## 🚀 Features

✅ **User Registration & Login** — Secure registration with department and email authentication.  
✅ **Password Encryption** — Uses BCrypt for safe password storage.  
✅ **Ticket Management** — Create, view, and track the status of support tickets.  
✅ **Role-based Access (Future Enhancement)** — Enables admin and support staff to manage tickets.  
✅ **Database Integration** — Stores users and tickets using MySQL and JPA/Hibernate ORM.  
✅ **Clean Frontend UI** — Simple and responsive design with HTML, CSS, and JS.  
✅ **RESTful APIs** — Clean API structure following Spring Boot best practices.  

---

## 🧠 Tech Stack

| Layer | Technologies Used |
|-------|--------------------|
| **Frontend** | HTML5, CSS3, JavaScript |
| **Backend** | Spring Boot 3, Spring Web, Spring Security, JPA/Hibernate |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Version Control** | Git & GitHub |
| **Testing** | Postman, JUnit (optional) |

---

## 🧩 System Architecture

[ User Interface (HTML, CSS, JS) ]
↓
[ REST API (Spring Boot Controllers) ]
↓
[ Service Layer (Business Logic) ]
↓
[ JPA Repository (Data Access) ]
↓
[ MySQL Database ]


## ⚙️ How to Run Locally

1️⃣ **Clone the repository**
```bash
git clone https://github.com/Kirti-Namdeo-pawar/helpdesk-support-system.git
cd helpdesk-support-system

2️⃣ Configure the database

Open src/main/resources/application.properties

Update your MySQL username and password






code:
spring.datasource.url=jdbc:mysql://localhost:3306/support_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


3️⃣ Run the application
4️⃣ Open your browser and navigate to
👉 http://localhost:8080

🧑‍💼 Project Purpose

This project was built to demonstrate real-world problem-solving using Spring Boot and RESTful APIs.
It showcases authentication, database integration, and clean backend architecture, making it an ideal example of enterprise-grade application design.
