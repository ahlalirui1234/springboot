package com.redlee.springaop.app;

import com.redlee.springaop.service.AopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.redlee.springaop")
@EnableAspectJAutoProxy
public class AopConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        System.out.println(context.getBean(AopService.class).getClass().getName());
        context.getBean(AopService.class).query();
    }

    public AopConfig(){
        System.out.println("容器启动");
    }
}
