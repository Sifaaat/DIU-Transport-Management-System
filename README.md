# 🚍 DIU Transport Management System

## 📌 Project Overview
DIU Transport Management System is a Java-based Object-Oriented Programming (OOP) project developed to manage university transport information.  
This system allows an **Admin** to manage bus data and **Students** to view transport information.

---

## 🎯 Features

### 👨‍💼 Admin Features
- Add Bus Information
- View All Bus Information
- Update Bus Information
- Delete Bus Information

### 🎓 Student Features
- View Bus Information

---

## 🧠 OOP Concepts Used
- Class & Object
- Inheritance (Admin & Student extend User)
- Encapsulation (Bus class data protection)
- Abstraction (methods hide internal logic)

---

## 🛠️ Technologies Used
- Java (OOP)
- MySQL Database
- JDBC (Java Database Connectivity)
- NetBeans IDE
- XAMPP / phpMyAdmin

---

## 🗄️ Database Information

### Database Name:
`diu_transport`

### Table Name:
`bus_info`

---

## 🧾 SQL Setup

```sql
CREATE DATABASE diu_transport;
USE diu_transport;

CREATE TABLE bus_info (
    id INT PRIMARY KEY AUTO_INCREMENT,
    bus_name VARCHAR(100),
    bus_number VARCHAR(50),
    driver_name VARCHAR(100),
    driver_contact VARCHAR(20),
    departure_time VARCHAR(50),
    route VARCHAR(100)
);
