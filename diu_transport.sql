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