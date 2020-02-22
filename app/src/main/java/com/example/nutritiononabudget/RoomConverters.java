package com.example.nutritiononabudget;

import androidx.room.TypeConverter;

import java.math.BigDecimal;

public class RoomConverters {
    @TypeConverter
    public java.math.BigDecimal fromLong(Long value) {
        return value == null ? null : new java.math.BigDecimal(value).divide(new java.math.BigDecimal(100), BigDecimal.ROUND_HALF_UP);
    }

    @TypeConverter
    public Long toLong(java.math.BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        } else {
            return bigDecimal.multiply(new java.math.BigDecimal(100)).longValue();
        }
    }
}
