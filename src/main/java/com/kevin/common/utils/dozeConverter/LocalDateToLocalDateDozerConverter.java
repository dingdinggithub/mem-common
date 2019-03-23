package com.kevin.common.utils.dozeConverter;

import org.dozer.DozerConverter;

import java.time.LocalDate;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:48
 * @Description LocalDate的转换
 */
public class LocalDateToLocalDateDozerConverter extends DozerConverter<LocalDate, LocalDate> {

    public LocalDateToLocalDateDozerConverter() {
        super(LocalDate.class, LocalDate.class);
    }

    @Override
    public LocalDate convertFrom(LocalDate source, LocalDate destination) {
        return source;
    }

    @Override
    public LocalDate convertTo(LocalDate source, LocalDate destination) {
        return source;
    }
}
