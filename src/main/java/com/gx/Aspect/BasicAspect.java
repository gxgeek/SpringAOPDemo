package com.gx.Aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by gx on 2016/12/13.
 */

@Component
@Aspect
public class BasicAspect {
    Logger logger = Logger.getLogger(BasicAspect.class);
    @Pointcut("execution(* com.gx.Service.*.*(..))")
    private  void arithmetic(){}


    @Around("arithmetic()")
    public Object aroundDeleteArticle(ProceedingJoinPoint proceedingJoinPoint){
        logger.info("--------方法执行之前---------");
        //打印方法所有的参数列表
        logger.info("--------方法名："+proceedingJoinPoint.getSignature().getName());
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args){
            logger.info("方法参数");
            logger.info(arg + " , ");
        }
        Object retValue = null;
        try {
            retValue = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            logger.info(throwable.getMessage());
        }finally {
            logger.info("------方法执行之后------");
        }
        return retValue;
    }
}
