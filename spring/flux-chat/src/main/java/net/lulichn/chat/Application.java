package net.lulichn.chat;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.stream.StreamReceiver;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .components(new Components())
        .info(new Info().title("Contact Application API").description(
            "This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3."));
  }

  @Bean
  public StreamReceiver streamReceiver(ReactiveRedisConnectionFactory factory) {
    return StreamReceiver.create(factory);
  }
}
