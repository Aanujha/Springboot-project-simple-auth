package com.auth.app.confg;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configration {

    @Bean
    public ModelMapper getmodelmapper(){
        return new ModelMapper();
    }
}
