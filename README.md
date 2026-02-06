)

📦 Tile Warehouse – Spring Boot Backend

This is the Spring Boot backend for the Tile Warehouse Management System.
It provides REST APIs for tile management and connects with the React frontend.

🚀 Backend (Docker – Local)

This backend is Dockerized and currently running locally using Docker.

▶️ Build Docker Image
docker build -t tilewarehouse .

▶️ Run Docker Container
docker run -p 8080:8080 tilewarehouse

🌐 Backend URL (Local)
http://localhost:8080


Example API:

http://localhost:8080/api/tiles

🌐 Frontend (Live)

Frontend is built using React and deployed on Vercel.

👉 Live Frontend URL:
https://tiles-warehouse-frontend.vercel.app/

⚠️ Note:

Backend must be running locally using Docker

Frontend will call the backend at http://localhost:8080

Make sure Docker container is running before opening the frontend

🛠️ Tech Stack
Backend

Java 17

Spring Boot

Spring Data JPA

H2 Database

Maven

Docker

Frontend

React

Vercel (Deployment)

▶️ Run Backend Locally (Without Docker)
git clone https://github.com/Thangam1110/tiles-warehouse-backend.git
cd tilewarehouse
mvn spring-boot:run


Backend runs at:

http://localhost:8080

🐳 Run Backend Using Docker (Recommended)
docker build -t tilewarehouse .
docker run -p 8080:8080 tilewarehouse
