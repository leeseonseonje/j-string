package com.weather.exception;

import java.lang.reflect.Field;

public class NotSupportedFieldException extends RuntimeException{


    public NotSupportedFieldException(String message){
        super(message);
    }
}
