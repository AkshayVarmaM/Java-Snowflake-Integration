# Java-Snowflake-Integration
Developed a dedicated playground for testing and optimizing Snowflake-Java integrations, ensuring seamless connectivity and performance.

This guide will walk you through the steps to set up and run a Java application that connects to Snowflake using the Snowflake JDBC driver.

## Prerequisites

Before you begin, ensure that you have the following installed on your system:

1. **Java Development Kit (JDK):** Install Java (JDK 8 or later) from the official [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [OpenJDK](https://openjdk.org/).

2. **Required JAR Files: Download and install the following dependencies: Check Maven Central for them
   - Snowflake JDBC Driver
   - SLF4J API
   - SLF4J JDK14

## Setting Up the Project

### 1. Add JAR Files to the Project

After downloading the required JAR files:

- Create a **`lib`** folder in your repository (if it doesn't already exist).
- Move the downloaded JAR files into the `lib` folder.
- Ensure these JAR files are included in your classpath. If your IDE (such as VS Code) does not add them automatically, you may need to manually configure the classpath.

### 2. Configure `launch.json` in VS Code

To enable debugging and running your Java application in VS Code, you need to create a `launch.json` file:

- Open **Run & Debug** in VS Code.
- Click on **Create a launch.json file**.
- Select **Java** as the environment.
- Ensure the `launch.json` file is properly configured.

### 3. Verify `launch.json` Configuration

Before running the program, double-check that `launch.json` is correctly set up and pointing to the correct main class and dependencies.

## Running the Program

Once everything is set up, execute the following commands to compile and run the Java application:

### Compile and run the Java File

javac -cp "lib/snowflake-jdbc-3.19.0.jar;lib/slf4j-api-2.0.17.jar;lib/slf4j-jdk14-2.0.17.jar" SnowflakeConnection.java


java --add-opens=java.base/java.nio=org.apache.arrow.memory.core,ALL-UNNAMED -cp ".;lib/snowflake-jdbc-3.19.0.jar;lib/slf4j-api-2.0.17.jar;lib/slf4j-jdk14-2.0.17.jar" SnowflakeConnection

