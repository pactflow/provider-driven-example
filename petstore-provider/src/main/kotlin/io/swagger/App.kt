package io.swagger

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class App {
  @Bean
  fun customOpenAPI(@Value("\${application.version}") appVersion: String): OpenAPI {
    return OpenAPI()
      .components(Components().addSecuritySchemes("basicScheme",
        SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
      .info(Info().title("Petstore Provider API").version(appVersion)
        .license(License().name("MIT")
          .url("https://github.com/pactflow/provider-driven-example/blob/master/LICENSE")))
  }
}

fun main(args: Array<String>) {
  SpringApplication.run(App::class.java, *args)
}
