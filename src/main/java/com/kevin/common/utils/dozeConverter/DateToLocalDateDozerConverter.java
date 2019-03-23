package com.kevin.common.utils.dozeConverter;

import org.dozer.DozerConverter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Author 丁海峰
 * @DateTime 2018/11/11 17:47
 * @Description Date 转 LocalDatetime
 */
public class DateToLocalDateDozerConverter extends DozerConverter<Date, LocalDateTime> {
    public DateToLocalDateDozerConverter() {
        super(Date.class, LocalDateTime.class);
    }

    @Override
    public LocalDateTime convertTo(Date source, LocalDateTime target) {
        Instant instant = source.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    @Override
    public Date convertFrom(LocalDateTime source, Date target) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = source.atZone(zone).toInstant();
        return Date.from(instant);
    }
}