package com.example.teecheer_api_session.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Techeer Partners API")
                        .version("1.0.0")
                        .description("API documentation for Techeer Partners Application"))
                .addServersItem(new Server().url("http://localhost:8080").description("Local server"));
    }
}