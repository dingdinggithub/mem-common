package com.kevin.common.domain.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * UserDTO
 *
 * @Author Chase Lv(蛰龙)
 * @Date 2017/7/15
 * @Time 上午9:19
 * @Description
 */
@Data
public class UserDTO extends BaseDTO implements Serializable {
    private String username;
    private String password;
    private String phone;

}
