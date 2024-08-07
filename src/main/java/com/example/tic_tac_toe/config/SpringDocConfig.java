package com.example.tic_tac_toe.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

  @Bean
  public OpenAPI openApi() {
    return new OpenAPI().info(new Info().title("Tic Tac Toe API"));
  }
}
