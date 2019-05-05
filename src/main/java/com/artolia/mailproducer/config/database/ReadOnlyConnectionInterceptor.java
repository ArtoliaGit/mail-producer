package com.artolia.mailproducer.config.database;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author Artolia Pendragon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年05月02日 21:21:00
 */
@Component
@Aspect
@Slf4j
public class ReadOnlyConnectionInterceptor implements Ordered {

    @Around("@annotation(readOnlyConnection)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint,
                          ReadOnlyConnection readOnlyConnection) {

        Object result = null;
        try {
            log.info("=========set database connection 2 read only==========");
            DataBaseContextHolder.setDataBaseType(DataBaseContextHolder.DataBaseType.SLAVE);
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            DataBaseContextHolder.clearDataBaseType();
            log.info("===============clear database connection==============");
        }
        return result;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
