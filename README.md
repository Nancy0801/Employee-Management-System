# Employee Management System

A desktop-based application built using **Java (Swing)** and **MySQL** that allows administrators to manage employee records through a graphical user interface. The system supports full CRUD operations and enables the admin to print employee details for reporting purposes.

## 🚀 Project Objective

The goal of this project is to create a lightweight, user-friendly application that simulates a real-world employee management system. It helps administrators to:

- Add new employees to the system
- View all existing employee records
- Update existing employee details
- Delete employee records
- Print selected employee information

This project demonstrates practical implementation of **Object-Oriented Programming**, **GUI development**, and **Database integration**, following a modular and maintainable architecture.

---

## 🛠️ Tech Stack

- **Programming Language:** Java
- **GUI Framework:** Java Swing
- **Database:** MySQL
- **JDBC:** Java Database Connectivity (for DB interaction)

---

## 📂 Features

- 🔹 Add new employees with validation
- 🔹 View a list of all employees in tabular format
- 🔹 Edit and update employee information
- 🔹 Delete selected employee records
- 🔹 Print employee details using Java's print service
- 🔹 Persistent storage using MySQL database
- 🔹 Intuitive user interface designed with Swing

---

## 📌 Software Requirements

- Java JDK 8 or above
- MySQL Server
- MySQL Workbench (optional for GUI access)
- IDE (Eclipse / IntelliJ IDEA / NetBeans)
- JDBC Connector for MySQL

---

## 🔧 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/Nancy0801/Employee-Management-System
cd Employee-Management-System
```

### 2. Set Up the MySQL Database
- Open MySQL Workbench or any SQL client.
- Create a new database:
```sql
CREATE DATABASE employee_db;
USE employee_db;
```

- Create the employees table:
```sql
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    department VARCHAR(50),
    salary DECIMAL(10,2)
);
```

### 3. Configure Database Connection
Open the DBConnection.java file.
Replace the database URL, username, and password with your MySQL credentials.
```sql
String url = "jdbc:mysql://localhost:3306/employee_db";
String user = "root";
String password = "your_password";
```

### 4. Run the Application
Open the project in your preferred IDE.
Compile and run the main file (e.g., Main.java or EmployeeManagementSystem.java).

### 📈 Project Workflow
```Plaintext
Admin Login
     ↓
Dashboard with Options
     ↓
 ┌────────────┬────────────┬────────────┬─────────────┐
 │  Add       │  View      │  Update    │  Delete     │
 └────────────┴────────────┴────────────┴─────────────┘
     ↓
Print Employee Information (optional)
```

### 🧠 Concepts Implemented
Object-Oriented Programming (Encapsulation, Abstraction)
MVC-like structure for separation of concerns
GUI design using Java Swing
Exception handling and input validation

### 📬 Contact Me
**Nancy Gupta**
📧 nancyg8029@gmail.com
🌐 [LinkedIn](http://www.linkedin.com/in/nancy-gupta-784b5025a)

### 🤝 Contributing
Contributions are welcome!
To contribute:
- Fork the repository
- Create a new branch (git checkout -b feature/your-feature)
- Commit your changes (git commit -m 'Add new feature')
- Push to the branch (git push origin feature/your-feature)
- Open a pull request

### ⭐️ Show Your Support
If you found this project helpful or inspiring, feel free to give it a ⭐️ and share it!
