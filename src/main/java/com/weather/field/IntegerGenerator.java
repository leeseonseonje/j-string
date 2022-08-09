package com.weather.field;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class IntegerGenerator implements FieldGenerator{

    @Override
    public String generateField(Field field) {
        return "1";
    }

    @Override
    public boolean isSupported(Class<?> fieldType) {
        return byte.class.equals(fieldType) ||
                short.class.equals(fieldType) ||
                int.class.equals(fieldType) ||
                long.class.equals(fieldType) ||
                Byte.class.equals(fieldType) ||
                Short.class.equals(fieldType) ||
                Integer.class.equals(fieldType) ||
                Long.class.equals(fieldType) ||
                AtomicInteger.class.equals(fieldType) ||
                AtomicLong.class.equals(fieldType);
    }
}
