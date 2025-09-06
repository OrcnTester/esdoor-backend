# Esdoor – Kapı Süreç Dijitalleşme (M0)

Teklif → Sözleşme → Ölçü → İş Emri → PDF üretimi zincirini uçtan uca dijitalleştirmeyi hedefleyen backend.

## Teknolojiler
- Java 17, Spring Boot 3.3
- Spring Web, Data JPA, Validation, Security
- PostgreSQL + Flyway (default), H2 (profil), Swagger UI
- Dockerfile + docker-compose (dev orkestrasyonu)

## Hızlı Başlangıç

### Seçenek A — Maven (local)
```bash
mvn clean package -DskipTests
java -jar target/esdoor-0.0.1-SNAPSHOT.jar
# Swagger: http://localhost:8080/swagger-ui/index.html

### Seçenek B — H2 profili (DBsız hızlı deneme)
```bash
mvn clean package -DskipTests
java -jar target/esdoor-0.0.1-SNAPSHOT.jar --spring.profiles.active=h2
# H2 Console: http://localhost:8080/h2-console
# JDBC URL: jdbc:h2:mem:esdoordb  | user: sa  | pass: (boş)

### Seçenek C — Docker Compose (PostgreSQL + App)
Donanım sanallaştırma gerekir. (WSL2/VT-x yoksa bu adımı atla.)
```bash
docker compose up -d --build
# Uygulama: http://localhost:8080
# Swagger:  http://localhost:8080/swagger-ui/index.html

### Profiller

default : Local PostgreSQL (application.properties)

docker : Docker Compose PostgreSQL (application-docker.properties)

h2 : In-memory H2 (application-h2.properties)

### REST Örnekleri
# Listele
curl http://localhost:8080/api/customers

# Ekle
curl -X POST http://localhost:8080/api/customers \
  -H "Content-Type: application/json" \
  -d '{"code":"C-0001","name":"Doğanlar Kereste","taxNumber":"1234567890","phone":"0500 000 00 00","email":"info@esdoor.com"}'

### Yol Haritası

# M0 – Temel Altyapı

# M1 – Teklif Modülü (şablon, PDF)

# M2 – Sözleşme

# M3 – Ölçü

# M4 – İş Emri & Üretim

