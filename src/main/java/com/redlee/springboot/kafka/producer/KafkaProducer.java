package com.redlee.springboot.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    KafkaTemplate kafkaTemplate;

    public void send(){
        kafkaTemplate.send("test","key", "World");
    }
}
