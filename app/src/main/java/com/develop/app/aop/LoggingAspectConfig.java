package com.develop.app.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspectConfig {
    @Pointcut("execution(* com.develop.app.service..*(..)) || execution(* com.develop.app.controller..*(..))")
    private void serviceMethods() {}

    @After("serviceMethods()")
    public void logServiceMethodCall(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.info("Class -> { {} }, Method -> { {} }", methodName, className);
    }

}