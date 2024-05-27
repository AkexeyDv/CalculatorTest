package com.pro.sky.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDivideError extends IllegalArgumentException {
    public ZeroDivideError(String s) {
        super(s);
    }
}
//\ No newline at end of file
