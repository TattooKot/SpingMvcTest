package com.example.spingmvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessageRunner {
    static Message message;

    @Autowired
    public MessageRunner(Message message){
        MessageRunner.message = message;
    }

    public static void print(){
        System.out.println(message.getMessage());
    }
}
