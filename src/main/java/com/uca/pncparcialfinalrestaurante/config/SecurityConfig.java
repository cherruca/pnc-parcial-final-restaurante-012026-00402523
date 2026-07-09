package com.uca.pncparcialfinalrestaurante.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain security(HttpSecurity http) throws Exception {

        http
                .csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth->auth

                        .requestMatchers("/auth/**").permitAll()

                        .requestMatchers("/admin/**")
                        .hasRole("ADMINISTRADOR")

                        .requestMatchers("/encargado/**")
                        .hasRole("ENCARGADO")

                        .requestMatchers("/cliente/**")
                        .hasRole("CLIENTE")

                        .anyRequest().authenticated()

                );

        return http.build();
    }

}
