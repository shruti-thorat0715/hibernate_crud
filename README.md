# Hibernate_CRUD with PostgreSQL

This is a simple Java-based CRUD (Create, Read, Update, Delete) application using **Hibernate_CRUD ORM** and **PostgreSQL** as the database. The project manages `Country` and `Region` entities and demonstrates Hibernate Native API usage.

---

## 1] Technologies Used:

- Java 1.8
- Hibernate 5.4.33.Final
- PostgreSQL
- Maven
- Eclipse (or any IDE)



##  📂 Project Directory Structure

hibernate_crud/

├── pom.xml 

├── src/

│   └── main/

│       ├── java/

│       │   ├── main/

│       │   │   └── MainApp.java  

│       │   ├── model/

│       │   │   ├── Country.java  

│       │   │   └── Region.java   

│       │   └── util/

│       │       └── HibernateUtil.java 

│       └── resources/

│           └── hibernate.cfg.xml 

├── target/    

└── README.md     

## 2] Create Postgres Database:
```
CREATE DATABASE hibernate_crud;

```

## 3] Update Database Credentials:

````
          <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
          <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/hibernate_crud</property>
          <property name="hibernate.connection.username">postgres</property>  
          <property name="hibernate.connection.password">shrutu</property>
````

## 🧩 Features:

-  Setup and configuration using Hibernate Native API
-  PostgreSQL database integration
-  Auto table creation using `hbm2ddl.auto=update`
-  One-to-Many relationship mapping (Region to Countries)
-  Basic CRUD operations (Create, Read)
-  Clean architecture (separated packages: model, main, util)
-  Fully Maven-driven build and dependency management

## 📖 Project Overview :

This is a Java-based CRUD (Create, Read, Update, Delete) application built using **Hibernate ORM** and connected to a **PostgreSQL** database. It demonstrates how to configure Hibernate with Maven, map Java classes to database tables using annotations, and perform simple CRUD operations using Hibernate’s Native API (i.e., not JPA Criteria or JPQL).

The application models two main entities:

- **Region**: A geographical region (e.g., Asia, Europe)

- **Country**: A country belonging to a specific region (e.g., India → Asia)

This project is ideal for beginners learning Hibernate and how ORM maps Java classes to relational database tables.


##  📞Contact:

For any questions or feedback, feel free to reach out:

Your Name : shruti thorat

Email: shrutithorat767@gmail.com

GitHub: shruti-thorat0715

## ScreenShots Of Outputs:


                     








                     




