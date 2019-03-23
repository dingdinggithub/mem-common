package com.kevin.common.domain.request;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:25
 * @Description BaseRequest
 */
public class BaseRequest<T> implements Serializable {

    /**
     * 业务参数
     */
    @Valid
    protected T model;


    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
