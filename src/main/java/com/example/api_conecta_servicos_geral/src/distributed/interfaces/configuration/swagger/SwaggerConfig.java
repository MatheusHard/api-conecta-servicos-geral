package com.example.api_conecta_servicos_geral.src.distributed.interfaces.configuration.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI photoServiceOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Photo Service API")
                        .description("Microsserviço responsável pelo armazenamento de imagens")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Matheus Hardman")
                                .email("[EMAIL_ADDRESS]")));
    }
}

