package com.kevin.common.domain.dto;

import java.io.Serializable;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:13
 * @Description
 */
public class CodeValueDTO implements DTO, Serializable {

    private Object code;

    private Object value;

    public CodeValueDTO(){
    }

    public CodeValueDTO(Object code,Object value){
        this.code = code;
        this.value = value;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
