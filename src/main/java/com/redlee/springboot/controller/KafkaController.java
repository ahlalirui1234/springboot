package com.redlee.springboot.controller;

import com.redlee.springboot.kafka.producer.KafkaProducer;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaProducer producer;

    @GetMapping
    public String sendKafka(){
        System.out.print("producer is null?" + (null == producer));
        try {
            producer.send();
        } catch (Exception e) {
            System.out.print("===="+e.toString());
        }
        return "Hello, World!";
    }

}
