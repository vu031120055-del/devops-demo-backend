🚀 DevOps Demo Backend
📌 Giới thiệu

Backend service cho hệ thống Web dự báo điện năng của team.

Project dùng để:

Test CI/CD pipeline

Test deploy server

Training DevOps workflow cho team

Kết nối Frontend – AI Engine – Database

🛠 Tech Stack

Java / Spring Boot

Maven

MySQL (tuỳ config môi trường)

GitHub Actions (CI/CD)

Project Structure
devops-demo-backend/
│
├── src/
│   ├── main/
│   │   ├── java/              # Source code backend (Controller, Service, Repository)
│   │   ├── resources/         # File config (application.properties, yaml,...)
│   │
│   ├── test/                  # Unit test
│
├── target/                    # File build (.jar) sau khi build Maven
│
├── .github/workflows/         # CI/CD pipeline GitHub Actions
│
├── run.bat                    # Script chạy nhanh backend
│
├── pom.xml                    # Maven dependencies + build config
│
└── README.md                  # Tài liệu project
Yêu cầu môi trường

Trước khi chạy project, cần cài:

JDK 17+

Maven 3.8+

MySQL (optional nếu dùng DB local)

Git