package com.example.spingmvctest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanAppConfig {

    @Bean(name = "message")
    public Message getMessage(){
        Message message = new Message();
        message.setMessage("This is message from simple bean");
        return message;
    }
}
