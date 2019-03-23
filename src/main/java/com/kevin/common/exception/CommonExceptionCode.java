package com.kevin.common.exception;

import com.google.common.collect.ImmutableMap;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:49
 * @Description
 */
public enum CommonExceptionCode implements BaseExceptionCode {


    OK("20000", "请求成功"),

    // 40xxx 客户端不合法的请求
    INVALID_MODEL_FIELDS("40001", "字段校验非法"),

    /**
     * 参数类型非法，常见于SpringMVC中String无法找到对应的enum而抛出的异常
     */
    INVALID_PARAMS_CONVERSION("40002", "参数类型非法"),

    // 41xxx 请求方式出错
    /**
     * http media type not supported
     */
    HTTP_MESSAGE_NOT_READABLE("41001", "HTTP消息不可读"),

    /**
     * 请求方式非法
     */
    REQUEST_METHOD_NOT_SUPPORTED("41002", "不支持的HTTP请求方法"),


    /**
     * Duplicate Key
     */
    DUPLICATE_KEY("42001", "操作过快, 请稍后再试"),

    /**
     * service is registering with eureka
     */
    SERVICE_INITIALIZING("42002", "服务注册中, 请稍后再试"),

    /**
     * reservation conflict
     */
    RESERVATION_CONFLICT("42003", "预留资源确认冲突"),

    // 50xxx 服务端异常
    /**
     * 用于处理未知的服务端错误
     */
    SERVER_UNKNOWN_ERROR("50001", "服务端异常, 请稍后再试");

    private final String errorCode;

    private final String errorMessage;

    private static final ImmutableMap<String, CommonExceptionCode> CACHE;

    static {
        final ImmutableMap.Builder<String, CommonExceptionCode> builder = ImmutableMap.builder();
        for (CommonExceptionCode statusCode : values()) {
            builder.put(statusCode.errorCode, statusCode);
        }
        CACHE = builder.build();
    }

    CommonExceptionCode(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * 获取错误标识符
     *
     * @return
     */
    @Override
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 获取错误消息
     *
     * @return 错误消息
     */
    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 获取错误提示符
     * 用于页面错误信息展示使用
     *
     * @return 错误提示符
     */
    @Override
    public String getErrorTips() {
        return null;
    }
}
