# OrangeHRM Automation Project (Cucumber + Selenium)

This project automates functional test scenarios of the OrangeHRM Demo Application using Selenium WebDriver with the BDD framework Cucumber. It validates essential HRM features like login, user management, and logout using real browser interactions and feature-driven test scripts.

---
## ✅ Test Coverage

The following functional areas are automated:

### 🧪 Admin Module:
- Admin login (valid & invalid credentials)
- Add user (valid inputs, duplicate user, blank fields)
- Search user (by username and role)
- Delete user (confirmation and cancellation)
- Logout from the application

### 🧪 Negative Scenarios:
- Blank username/password login attempts
- Invalid role/user combinations
- Form validation errors during Add User

Each scenario includes:
- Assertions for expected UI elements
- Validation of success and error messages
- Use of parameterized steps in feature files

---

## 🛠 Technologies Used
- Java
- Selenium WebDriver
- Cucumber (BDD)
- Maven
- TestNG (optional for runner)
- ExtentReports (optional)
- Git

---

## ✅ Features Automated
- Login with valid and invalid credentials
- Add user from Admin panel
- Search for existing users
- Delete users
- Logout functionality
- Negative test cases for form validation

---

## 📁 Project Structure
📦 Orange-cucumber
┣ 📂 features
┃ ┗ 📄 Login.feature
┣ 📂 stepDefinitions
┃ ┗ 📄 LoginSteps.java
┣ 📂 runner
┃ ┗ 📄 TestRunner.java
┣ 📂 pages
┃ ┗ 📄 LoginPage.java
┣ 📂 utilities (optional)
┃ ┗ 📄 Hooks.java
┣ 📄 pom.xml
┗ 📄 README.md
---
📊 Test Reports
Cucumber default HTML reports:
target/cucumber-reports/index.html

---
