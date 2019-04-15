package com.redlee.springaop.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AspectJTest {

    @Pointcut("execution(* com.redlee.springaop.service.*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }
}
