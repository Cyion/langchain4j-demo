package de.bredex.langchain4j_demo.service;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.image.Image;
import dev.langchain4j.data.message.*;
import dev.langchain4j.model.chat.response.ChatResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class AIServiceTest {
    @Autowired
    private AIService service;
    @Disabled
    @Test
    void testChat() {
        final List<ChatMessage> messages = new ArrayList<>();
        messages.add(UserMessage.from("What is pi?"));
        messages.add(this.service.chat(messages).aiMessage());
        messages.add(UserMessage.from("Give me some applications"));
        messages.add(this.service.chat(messages).aiMessage());
        System.out.println(messages);


        final UserMessage prompt = UserMessage.from(
                TextContent.from("Describe the following image"),
                ImageContent.from("https://th.bing.com/th/id/OIP.lnWap4AJejkduTFTGatLfQHaFj?w=263&h=197&c=7&r=0&o=7&pid=1.7&rm=3")
        );
        final ChatResponse response = this.service.chat(List.of(prompt));
        System.out.println(response.aiMessage().text());
    }
    @Disabled
    @Test
    void testGenerate() {
        final Image response = this.service.generate("A cat eating ice cream");
        System.out.printf("Image url: %s", response.url());
    }
    @Disabled
    @Test
    void testEmbedding() {
        final Embedding response = this.service.embedding("Hello AI!");
        System.out.printf("Embedding dimension: %d%nEmbedding: %s%n", response.dimension(), Arrays.toString(response.vector()));
    }
}
