package com.marry.nacos.provider.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mal
 * @date 2022-03-30 16:38
 */
@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({Exception.class})
    public String error(Exception e) {
        return e.getMessage();
    }
}
