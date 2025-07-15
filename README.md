# Country-Management
The Country Management System is a Java-based console application designed to perform basic CRUD operations on countries and their capitals. It uses JPA with Hibernate for object-relational mapping and PostgreSQL as the backend database. The system allows users to add, update, delete, and view countries through a menu-driven interface. It includes core components like an entity class (CountryClass), a data access class (CountryDetails), and configuration via persistence.xml. The project is built with Maven and managed using Git and GitHub, making it a clean and modular solution for learning or extending database-driven applications.

# Features if this Project :
* Add new countries and their capitals
* Update the capital of existing countries
* Delete countries from the system
* View all countries and capitals
* Simple menu-driven console interface
* PostgreSQL database integration
* Uses JPA with Hibernate for ORM
* Modular and organized Java code structure

# Technologies Used :
* Java – Core programming language
* JPA (Jakarta Persistence API) – For object-relational mapping
* Hibernate – ORM provider implementing JPA
* PostgreSQL – Relational database for data storage
* Maven – Build automation and dependency management
* Spring Tool Suite / Eclipse – IDE used for development

# Maven Dependencies :
Add the following to your po.xml:
<dependencies>
    <dependency>
        <groupId>org.hibernate.orm</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>7.0.1.Final</version>
    </dependency>

    <dependency>
        <groupId>jakarta.persistence</groupId>
        <artifactId>jakarta.persistence-api</artifactId>
        <version>3.2.0</version>
    </dependency>

# Prerequisites
• JDK 17 or above – Required to run the Java application.
• PostgreSQL 15 or higher – For storing student, course, and admission data.
• pgAdmin – GUI tool to interact with your PostgreSQL database.
• IDE – Use Eclipse, IntelliJ, or VS Code to write and run the project

# Group Member : 
* Samruddhi Andhalkar
* Pooja Dolle

# Project Screenshot :

<img width="286" height="227" alt="image" src="https://github.com/user-attachments/assets/b9a8444d-cde7-4185-8475-e0537fb62ec7" />

# Database set Up .....
 * CREATE TABLE country_class (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    capital VARCHAR(255) NOT NULL,
    population BIGINT
);

# Table Structure : 
| Col          | Type         | Constraint   |
| ------------ | ------------ | ------------ |
| `id`         | INT          | PRIMARY KEY  |
| `name`       | VARCHAR(255) | NOT NULL     |
| `capital`    | VARCHAR(255) | NOT NULL     |
| `population` | BIGINT       | *(nullable)* |

# Contact :
* Your Name = Samruddhi Andhalkar , Pooja Dolle
* Your Email = samruddhiandhalkar2007@gmail.com , dollepooja4@gmail.com
* Git Hub = samruddhiandhalkar

  






