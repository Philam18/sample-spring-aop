package com.example.demo2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// @Aspect
public class LoggingAspect {


    // @Around("allCircle() && allInput(input)")
    public Object myAdvice(ProceedingJoinPoint proceedingJoinPoint, Object input) throws Throwable {
        Object output = null;

        System.out.println("Input is: " + input.toString());
        output = proceedingJoinPoint.proceed();
        System.out.println("Output is: " + output.toString());

        return output;
    }
}