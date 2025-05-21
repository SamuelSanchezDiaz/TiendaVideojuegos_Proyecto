# Proyecto de Gestión de Tienda de Videojuegos

Este proyecto ha sido desarrollado como parte del módulo de **Entornos de Desarrollo** del ciclo de **Desarrollo de Aplicaciones Multiplataforma (1º DAM)**, en modalidad a distancia.

Se trata de una solución simple, organizada y funcional para gestionar una tienda especializada en videojuegos, permitiendo gestionar stock, atender clientes mediante tickets y controlar accesos mediante login.

---

##  Estructura del proyecto

- **desktop_app/**  
  Aplicación de escritorio desarrollada en Java (sencillo). Incluye un ejemplo funcional de login y estructura básica de gestión.

- **web_app/**  
  Página web con HTML y PHP para simular el acceso del cliente y el sistema de tickets.

- **database/**  
  Script SQL con la estructura de la base de datos utilizada por ambas aplicaciones.

- **diagrams/**  
  Diagramas UML del sistema: login, tickets, estocaje y esquema general.

---

##  Funcionalidades implementadas

- [x] Sistema de login para empleados y clientes (escritorio/web)
- [x] Creación de tickets desde la web
- [x] Visualización y cambio de estado de tickets desde la aplicación
- [x] Gestión de stock básica: entrada, salida y marcado de agotado
- [x] Base de datos relacional conectada a ambas interfaces
- [x] Diagramas de estados detallados y explicados

---

##  Pruebas realizadas

Se han incluido pruebas de caja negra en el documento del proyecto, verificando los siguientes casos:

- Validación de credenciales válidas y erróneas
- Creación de tickets con campos vacíos
- Comprobación de stock suficiente o agotado
- Respuesta y cierre correcto de tickets

---

##  Autor

**Samuel Sánchez Díaz**  
Alumno de 1º de DAM – Modalidad a distancia  
Curso 2024/2025

---

##  Requisitos mínimos para ejecutar

- Java 17 o superior (para la app de escritorio)
- Navegador + servidor local (XAMPP o similar para la web)
- MySQL 5.7 o superior

---

##  Notas

Este proyecto se ha realizado de forma individual. Se han priorizado la estructura, la comprensión del flujo de funcionamiento y la aplicación práctica de los conceptos vistos en clase, cumpliendo los criterios del módulo.

