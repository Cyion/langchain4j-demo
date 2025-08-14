package de.bredex.langchain4j_demo.assistant;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface Assistant {

    @SystemMessage("You are a helpful and polite assistant")
    String chat(String userMessage);
}
