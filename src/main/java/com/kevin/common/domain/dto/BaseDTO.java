package com.kevin.common.domain.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:18
 * @Description
 */
public class BaseDTO implements DTO,Serializable {
    /**
     * 修改时间（包含时区gmt）
     */
    private LocalDateTime gmtModify;


    /**
     * 最后修改的人
     */
    private Long lastModifyUser;


    /**
     * 版本控制（乐观锁）
     */
    private Long version;


    /**
     * 创建人
     */
    private Long createUser;
}
