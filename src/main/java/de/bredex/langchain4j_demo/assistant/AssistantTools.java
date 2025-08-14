package de.bredex.langchain4j_demo.assistant;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class AssistantTools {

    @Tool("Get the current time in the user's timezone")
    public String currentTime() {
        return LocalTime.now().toString();
    }

    @Tool("Get the current date in the user's timezone")
    public String currentDate() {
        return LocalDate.now().toString();
    }
}
