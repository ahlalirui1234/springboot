package com.redlee.springboot.controller;

import com.redlee.springboot.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    RedisService redisService;

    @GetMapping
    public String setKey(){
        redisService.addName("name", "world");
        return "success";
    }
}
