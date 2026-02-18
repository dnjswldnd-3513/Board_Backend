# 📋 Board

> 심플하고 직관적인 풀스택 게시판 웹 애플리케이션
> <br> 
> Backend는 제가 Frontend는 Ai가 개발해준걸 바탕으로 풀스택을 경험해보자 합니다.

<br/>

![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

<br/>

## ✨ 프로젝트 소개

**Board**는 Spring Boot와 React를 기반으로 한 간단한 게시판 프로젝트입니다.  
게시글 작성, 조회, 수정, 삭제 기능을 제공하며, RESTful API 구조로 설계되었습니다.

<br/>

## 🛠 기술 스택

### Backend
| 기술 | 버전    |
|------|-------|
| Java | 21    |
| Spring Boot | 4.x   |
| Spring Data JPA | -     |
| MySQL | 8.x   |
| Gradle | 9.0.0 |

### Frontend
| 기술 | 버전 |
|------|------|
| React | 18.x |
| Axios | - |

<br/>

## 📁 프로젝트 구조

```
Board/
├── 📂 backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/board/
│   │   │   │       ├── controller/
│   │   │   │       ├── service/
│   │   │   │       ├── repository/
│   │   │   │       └── entity/
│   │   │   └── resources/
│   │   │       └── application.properties
│   └── build.gradle
│
└── 📂 frontend/
    ├── src/
    │   ├── components/
    │   ├── pages/
    │   └── App.jsx
    └── package.json
```

<br/>

## ⚙️ 환경 설정

### `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/board
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

<br/>

## 🚀 실행 방법

### 1️⃣ 데이터베이스 설정

```sql
CREATE DATABASE board;
```

### 2️⃣ 백엔드 실행

```bash
cd backend
./gradlew bootRun
```

### 3️⃣ 프론트엔드 실행

```bash
cd frontend
npm install
npm start
```

### 4️⃣ 접속

```
http://localhost:3000
```

<br/>

## 📌 주요 기능

- [x] 게시글 목록 조회
- [x] 게시글 작성
- [x] 게시글 상세 조회
- [x] 게시글 수정
- [x] 게시글 삭제

<br/>

## 🔗 API 명세

| Method | Endpoint | 설명 |
|--------|----------|------|
| `GET` | `/api/posts` | 게시글 전체 조회 |
| `GET` | `/api/posts/{id}` | 게시글 단건 조회 |
| `POST` | `/api/posts` | 게시글 작성 |
| `PUT` | `/api/posts/{id}` | 게시글 수정 |
| `DELETE` | `/api/posts/{id}` | 게시글 삭제 |

<br/>

---

<p align="center">Made with ❤️ using Spring Boot & React</p>