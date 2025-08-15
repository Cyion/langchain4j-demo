# LangChain4j Demo with OpenAI and Spring Boot

This project demonstrates how to use LangChain4j with OpenAI's API in a Spring Boot application. It provides a hands-on example of how to leverage OpenAI's powerful language models to build intelligent applications.

## Features

- chat model
- tool calling
- ai assistants
- image generation
- image analysis
- image classification
- embeddings

---

## Prerequisites

To run this project, you will need:

1. **Java 24**:Ensure you have Java Development Kit (JDK) 24 installed on your system.
2. **OpenAI API Key**: You must have an API key to access OpenAI's services.

---

## Project Setup

Follow the steps below to get started with the LangChain4j Demo Project:

### 1. Clone the Repository

```bash
git clone https://github.com/Cyion/langchain4j-demo.git
cd langchain4j-demo
```

### 2. Add Your OpenAI API Key

In the `application.properties` file (located at `src/main/resources/application.properties`), add your OpenAI API key.

```properties
# OpenAI API Key
langchain4j.open-ai.chat-model.api-key=YOUR_API_KEY_HERE
langchain4j.open-ai.image-model.api-key=YOUR_API_KEY_HERE
langchain4j.open-ai.embedding-model.api-key=YOUR_API_KEY_HERE
```

### 3. Build and Run the Project

Use the following command to run the tests:

```bash
./mvnw test
```
