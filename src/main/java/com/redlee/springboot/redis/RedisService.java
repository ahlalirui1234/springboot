package com.redlee.springboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    @Qualifier("userRedisTemplate")
    RedisTemplate userRedisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public void addName(String key, String value){
        stringRedisTemplate.opsForValue().set(key, value);
    }
}
