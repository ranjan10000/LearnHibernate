package com.web.application.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@OpenAPIDefinition
@Configuration
public class Swagger implements WebMvcConfigurer
{

@Bean
public OpenAPI baseOpenAPI()
{
return new OpenAPI().info(new Info().title("Web Application").version("").description(""));  
}

@Override
public void addViewControllers(ViewControllerRegistry registry) {
registry.addRedirectViewController("/", "/swagger-ui/index.html");
 
 
}


}
