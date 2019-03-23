package com.kevin.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 20:17
 * @Description
 */
public final class LogUtil {

    private LogUtil() {

    }

    public static Logger getLogInstance() {
        return LoggerFactory.getLogger(getLoggerClass());
    }

    private static String getLoggerClass() {

        //获取getLogInstance的调用者
        StackTraceElement traceElement = Thread.currentThread().getStackTrace()[3];

        //返回调用getLogInstance方法的类的class名称
        return traceElement.getClassName();
    }
}
