package com.develop.app.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
    @EnableWebSecurity
    public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http
                .authorizeHttpRequests(authorizeRequests ->
                    authorizeRequests
                        .anyRequest() // 모든 요청
                        .permitAll()
                )
                .csrf(csrf -> csrf.disable()); // CSRF 비활성화

            return http.build();
        }
}
