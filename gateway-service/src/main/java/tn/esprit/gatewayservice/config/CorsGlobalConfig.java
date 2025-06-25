package tn.esprit.gatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.config.WebFluxConfigurerComposite;

@Configuration
public class CorsGlobalConfig {

    @Bean
    public WebFluxConfigurer corsConfigurer() {
        return new WebFluxConfigurerComposite() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*") // ou remplace par "http://localhost:4200" si tu veux limiter
                        .allowedMethods("*");
            }
        };
    }
}
