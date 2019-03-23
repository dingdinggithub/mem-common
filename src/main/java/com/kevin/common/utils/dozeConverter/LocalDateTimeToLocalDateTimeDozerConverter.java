package com.kevin.common.utils.dozeConverter;

import org.dozer.DozerConverter;

import java.time.LocalDateTime;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:48
 * @Description 加入localDateTime的转换
 */
public class LocalDateTimeToLocalDateTimeDozerConverter extends DozerConverter<LocalDateTime, LocalDateTime> {

    public LocalDateTimeToLocalDateTimeDozerConverter() {
        super(LocalDateTime.class, LocalDateTime.class);
    }

    @Override
    public LocalDateTime convertFrom(LocalDateTime source, LocalDateTime destination) {
        return source;
    }

    @Override
    public LocalDateTime convertTo(LocalDateTime source, LocalDateTime destination) {
        return source;
    }
}
