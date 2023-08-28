package com.dream.shoppy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ShoppySecurityConfig {


    public SecurityFilterChain securityFilterChain(HttpSecurity http ) throws Exception {



        return http.build();
    }

}
