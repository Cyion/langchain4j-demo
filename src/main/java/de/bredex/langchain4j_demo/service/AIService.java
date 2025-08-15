package de.bredex.langchain4j_demo.service;

import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.image.Image;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.image.ImageModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIService {
    private final ChatModel chatModel;
    private final ImageModel imageModel;
    private final EmbeddingModel embeddingModel;

    public AIService(ChatModel chatModel, ImageModel imageModel, EmbeddingModel embeddingModel) {
        this.chatModel = chatModel;
        this.imageModel = imageModel;
        this.embeddingModel = embeddingModel;
    }

    public ChatResponse chat(List<ChatMessage> messages) {
        return this.chatModel.chat(messages);
    }

    public Image generate(String prompt) {
        return this.imageModel.generate(prompt).content();
    }

    public boolean catRecognizer(Image image) {
        final ChatMessage prompt = UserMessage.from(
                TextContent.from("Decide whether or not there is a cat in the image. If there is a cat in the image return 'true', otherwise 'false'"),
                ImageContent.from(image)
        );
        final ChatResponse response = this.chatModel.chat(prompt);
        return Boolean.parseBoolean(response.aiMessage().text());
    }

    public Embedding embedding(String text) {
        return this.embeddingModel.embed(text).content();
    }
}
