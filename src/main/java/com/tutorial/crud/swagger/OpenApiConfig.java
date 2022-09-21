package com.tutorial.crud.swagger;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.*;

@Configuration
public class OpenApiConfig {

    // https://github.com/swagger-api/swagger-ui#localization-and-translation
    // i10n (translations) is not implemented.

    @Value("${urlMain}")
    private String urlMain;

    //@Value("${urlSwagger}")
    private String urlSwagger;

    @Bean
    public OpenAPI customOpenAPI() {

        Server serverLocal = new Server();
        serverLocal.setUrl(urlMain);
        serverLocal.setDescription("Default");

        final String securitySchemeName = "bearer-auth";

        return new OpenAPI()
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName,
                                new SecurityScheme()
                                        .name(securitySchemeName)
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                        .info(new Info().title("Bifrost SERVICE")
                        .description("Documentation and Controllers"))
                .addServersItem(serverLocal);
    }

}