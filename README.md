# 🎫 Plateforme de Tickets de Support - Mini Helpdesk (Projet DevOps)

![GitHub Actions - Build Status](https://img.shields.io/github/actions/workflow/status/lamiaesaib/helpdesk-devops/ci.yml?branch=develop&label=CI/CD%20Build&style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.14-brightgreen?style=for-the-badge&logo=springboot)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge&logo=docker)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)

Ce projet consiste en la réalisation d'une plateforme de gestion de tickets de support (Mini Helpdesk) développée dans le cadre du module **DevOps & Intégration Continue**. Il met en œuvre une infrastructure complète de conteneurisation et d'intégration continue (CI/CD).

---

## 🛠️ Stack Technique

- **Backend :** Java 17, Spring Boot 3.5.14, Spring Data JPA
- **Base de Données :** MySQL 8.0
- **Conteneurisation :** Docker, Docker Compose
- **CI/CD :** GitHub Actions (Compilation, Tests unitaires, Build d'images)
- **Gestion des Versions :** Git & GitHub (Workflow multi-branches : `main` & `develop`)

---

## 📁 Structure du Projet

```text
helpdesk-devops/
├── .github/
│   └── workflows/
│       └── ci.yml             # Configuration du pipeline GitHub Actions
├── src/
│   ├── main/
│   │   ├── java/com/devops/helpdesk/
│   │   │   ├── controller/    # Contrôleur REST (TicketController.java)
│   │   │   ├── model/         # Entité JPA (Ticket.java)
│   │   │   ├── repository/    # JpaRepository (TicketRepository.java)
│   │   │   └── HelpdeskApplication.java
│   │   └── resources/
│   │       └── application.properties # Configuration Spring Boot
│   └── test/                  # Tests unitaires et d'intégration
├── Dockerfile                 # Build multi-stage de l'application
├── docker-compose.yml         # Orchestration API & Base de données MySQL
└── pom.xml                    # Dépendances Maven des composants