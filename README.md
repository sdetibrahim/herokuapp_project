
# Herokuapp Test Automation

## 🚀 Tech Stack
- **Language**: Java 24
- **Test Framework**: Playwright,JUnit 5
- **Browser Automation**: Playwright
- **Reporting**: Allure 2
- **Build Tool**: Maven

## 📌 Prerequisites
- Git
- Maven 3.9+
- JDK 24
- Chrome/Firefox browser

## ⚙️ Setup

### 1. Development Environment Setup

**1.1. Install JDK 24:**
``bash
# macOS (Homebrew)
brew install openjdk@24

# Windows (Chocolatey)
choco install openjdk --version=24

# Linux (Debian/Ubuntu)
sudo apt-get install openjdk-24-jdk

**1.2. Install Maven:**

bash
# macOS (Homebrew)
brew install maven

# Windows (Chocolatey)
choco install maven

# Linux (Debian/Ubuntu)
sudo apt-get install maven


**1.3. Verify installations:**

``bash
java -version  # Should show openjdk 24.x
mvn -v         # Should show Apache Maven 3.9.x or higher

### 2. Project Setup

``bash
# Clone repository
git clone https://github.com/sdetibrahim/herokuapp_project.git
cd herokuapp_project

## ⚙️ Install dependencies:
``bash
mvn clean install

## ⚙️ ️Running Tests
``bash
mvn test  ||
mvn test -Dtest=RunTest

📊 Reporting

## ⚙️ Generate Allure report:

``bash
mvn allure:report

## ⚙️View report locally:
``bash
mvn allure:serve

## ⚙️Video Record :
https://drive.google.com/file/d/1EzP8eggmuS4PLTfbG-Ly9DanHDdqHRkW/view?usp=drive_link