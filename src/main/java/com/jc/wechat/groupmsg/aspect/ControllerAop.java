package com.jc.wechat.groupmsg.aspect;

import com.jc.wechat.groupmsg.enums.ReturnEnum;
import com.jc.wechat.groupmsg.respdomain.BaseResp;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ControllerAop {

    @Pointcut("execution(* com.jc.wechat.groupmsg.controller..*.*(..))")
    public void controllerAspect(){}

    @Around("controllerAspect()")
    public Object catchControllerException(ProceedingJoinPoint proceedingJoinPoint){
        try {
            return proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        } catch (Throwable throwable) {
            BaseResp baseResp = new BaseResp();
            baseResp.setReturnCode(ReturnEnum.EXCEPTION.getCode());
            baseResp.setReturnMsg(ReturnEnum.EXCEPTION.getCodeName());
            return baseResp;
        }
    }
}
