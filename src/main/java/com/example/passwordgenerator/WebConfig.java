package com.example.passwordgenerator;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/password/generate")
                .allowedOrigins("http://localhost:8080") // Permite qualquer origem
                .allowedMethods("POST");
    }
}