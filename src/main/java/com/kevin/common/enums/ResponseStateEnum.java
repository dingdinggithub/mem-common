package com.kevin.common.enums;

import com.kevin.common.domain.dto.CodeValueDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:27
 * @Description
 */
public enum ResponseStateEnum implements DictEnum {


    FAIL(0,"失败"),
    SUCCESS(1, "成功"),
    ;

    /**
     * 获取值
     */
    private Integer value;


    /**
     * 获取Text
     */
    private String text;


    ResponseStateEnum(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getText() {
        return text;
    }


    public static String getText(Integer value) {
        for (ResponseStateEnum type : ResponseStateEnum.values()) {
            if (value == type.getValue()) {
                return type.getText();
            }
        }
        return null;
    }

    public static List<CodeValueDTO> getList() {

        List<CodeValueDTO> list = new ArrayList<>();

        for (ResponseStateEnum type : ResponseStateEnum.values()) {
            CodeValueDTO valueTextVO = new CodeValueDTO();
            valueTextVO.setCode(type.getValue());
            valueTextVO.setValue(type.getText());
            list.add(valueTextVO);
        }

        return list;

    }


    public static ResponseStateEnum of(Integer value) {

        for (ResponseStateEnum type : ResponseStateEnum.values()) {
            if (value == type.getValue()) {
                return type;
            }
        }
        throw new IllegalArgumentException("invalid access control type value :" + value);

    }


}
