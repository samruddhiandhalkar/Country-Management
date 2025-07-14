# Country-Management

The Country Management System is a Java-based console application designed to perform basic CRUD operations on countries and their capitals. It uses JPA with Hibernate for object-relational mapping and PostgreSQL as the backend database. The system allows users to add, update, delete, and view countries through a menu-driven interface. It includes core components like an entity class (CountryClass), a data access class (CountryDetails), and configuration via persistence.xml. The project is built with Maven and managed using Git and GitHub, making it a clean and modular solution for learning or extending database-driven applications.

# Features if this Project :

1 . Add new countries and their capitals
2. Update the capital of existing countries
3 .Delete countries from the system
4 .View all countries and capitals
5 .Simple menu-driven console interface
6 .PostgreSQL database integration
7 .Uses JPA with Hibernate for ORM
8 .Modular and organized Java code structure

# Technologies Used :

* Java – Core programming language
* JPA (Jakarta Persistence API) – For object-relational mapping
* Hibernate – ORM provider implementing JPA
* PostgreSQL – Relational database for data storage
* Maven – Build automation and dependency management
* Spring Tool Suite / Eclipse – IDE used for development

# Group Member : 
* Samruddhi Andhalkar
* Pooja Dolle

# Screenshot of the Output :

<img width="500" height="600" alt="image" src="https://github.com/user-attachments/assets/3e7e2ba8-3863-4bed-b191-aee0401019ec" />


# Dependencies :
<dependencyManagement>
  <dependencies>
    <dependency>
        <groupId>org.hibernate.orm</groupId>
        <artifactId>hibernate-platform</artifactId>
        <version>7.0.5.Final</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      <dependency>
        <groupId>jakarta.platform</groupId>
        <artifactId>jakarta.jakartaee-bom</artifactId>
        <version>11.0.0</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>

# created Table .....
CREATE TABLE country_class (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    capital VARCHAR(255) NOT NULL,
    population BIGINT
);

# Contact :
* Your Name = Samruddhi Andhalkar
* Your Email = samruddhiandhalkar2007@gmail.com
* Git Hub = samruddhiandhalkar

  






