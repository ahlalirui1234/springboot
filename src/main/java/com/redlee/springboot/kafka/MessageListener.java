package com.redlee.springboot.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {

    @KafkaListener(topics = {"test"}, groupId = "group1")
    public void listen(ConsumerRecord<String, ?> record){
        System.out.print("receive message:"+record.value().toString());
    }
}
