package de.bredex.langchain4j_demo.assistant;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssistantTest {
    @Autowired
    private Assistant assistant;
    @Disabled
    @Test
    void testChat() {
        final String prompt = "Hello AI";
        final String response = this.assistant.chat(prompt);
        System.out.printf("User: %s%nAI: %s%n", prompt, response);
    }
    @Disabled
    @Test
    void testToolCalling() {
        final String prompt = "What time we have?";
        final String response = this.assistant.chat(prompt);
        System.out.printf("User: %s%nAI: %s%n", prompt, response);
    }
}
