package com.kevin.common.utils.dozeConverter;

import org.dozer.DozerConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:48
 * @Description String 转 LocalDatetime
 */
public class StringToLocalDateDozerConverter extends DozerConverter<String, LocalDateTime> {
    public StringToLocalDateDozerConverter() {
        super(String.class, LocalDateTime.class);
    }

    @Override
    public LocalDateTime convertTo(String source, LocalDateTime target) {
        return LocalDateTime.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String convertFrom(LocalDateTime source, String target) {
        return source.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}