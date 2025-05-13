# Java Maven Simple App

This is a basic Java application that demonstrates a simple user login functionality using Maven for build automation and TestNG for testing. The app reads credentials from a `.properties` file and verifies them.

---

## - What is Maven?

Apache Maven is a **build automation and dependency management** tool for Java projects. It uses a central configuration file called `pom.xml` (Project Object Model) to manage:

- Project structure and metadata
- Dependencies
- Plugins
- Build lifecycle

### - Common Maven Goals (Phases)

| Phase     | Description                                |
|-----------|--------------------------------------------|
| `mvn clean` | Clean previous Builds |
| `mvn validate` | Check the project structure and configs    |
| `mvn compile`  | Compile the Java source code               |
| `mvn test`     | Run the tests using a framework (like TestNG) |
| `mvn package`  | Package the compiled code into a JAR/WAR   |
| `mvn install`  | Install the package to the local repository |
| `mvn deploy`   | Deploy the artifact to a remote repository |

---

## - Project Structure

```
project/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/com/project/
│   │   │   └── App.java
│   │   └── resources/
│   │       └── config.properties
│   └── test/java/com/project/
│       └── AppTest.java
```

---

## ⚙️ Key Files

- **`pom.xml`**: Defines the project details, dependencies (`testng`, `mysql-connector-j`), and plugins like `maven-compiler-plugin` and `maven-jar-plugin`.
- **`App.java`**: Contains the `userLogin` method that validates credentials from `config.properties`.
- **`config.properties`**: Holds `username` and `password` used by the application.
- **`AppTest.java`**: Contains three unit tests using TestNG.

---

## - Running the App on EC2 (Amazon Linux)

1. **Launch an EC2 Instance (t2.micro)**
   - Use Amazon Linux 2 AMI.
   - Open ports for SSH (22) and any other required service.

2. **Install Prerequisites**

```bash
sudo yum update -y
sudo yum install -y git 
sudo yum install -y tree
```

3. **Clone the Project**

```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo
```

4. **View Project Structure**

```bash
tree
```

5. **Build and Test**

```bash
mvn clean install
```

6. **Run the Application (if main class is set in `pom.xml`)**

```bash
java -cp target/project-0.0.1-SNAPSHOT.jar com.project.App
```

---

## - Notes

- Ensure `config.properties` is available in `resources/` and bundled in your JAR.
- You can modify test data or logic based on new requirements.
- This app demonstrates basics — ideal for bootstrapping Maven-based projects.

---
