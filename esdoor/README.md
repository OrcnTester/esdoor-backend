## 🎉 M0.0 – Core Infrastructure Ready

This release represents the **first milestone (M0)** of the Esdoor digital transformation project.  
Goal: Establish the backend foundation for the workflow chain: Quote → Contract → Measurement → Work Order → PDF.

---

### ✨ Features
- Project scaffold with **Spring Boot 3.3 & Java 17**  
- **Maven** build + Spring Boot Maven Plugin (executable JAR)  
- Database profiles: **PostgreSQL (default)** & **H2 (test/dev profile)**  
- **Flyway migration** with initial schema (customers, users, roles, user_roles)  
- **Customer entity, repository, and REST controller**  
- **Swagger UI** integration → `http://localhost:8080/swagger-ui/index.html`  
- **Dockerfile + docker-compose** for PostgreSQL + App orchestration  
- Clean repository setup: `.gitignore`, `.gitattributes`, `README.md`  

---

### 🛠️ How to Run

#### Option A – Local Maven
```bash
mvn clean package -DskipTests
java -jar target/esdoor-0.0.1-SNAPSHOT.jar
```

#### Option B – H2 (Quick test without Docker)
```bash
java -jar target/esdoor-0.0.1-SNAPSHOT.jar --spring.profiles.active=h2
```

#### Option C – Docker Compose
```bash
docker compose up -d --build
```

---

### 📌 Roadmap
- **M1** – Quote Module (templates, PDF generation)  
- **M2** – Contract Module  
- **M3** – Measurement Module  
- **M4** – Work Order & Production Module  

---

👉 This milestone lays the **foundation for all upcoming phases**.  
Profiles, migrations, API documentation, and packaging are ready to scale.
