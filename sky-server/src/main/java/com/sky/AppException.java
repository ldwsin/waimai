package com.sky;

import lombok.Getter;

/**
 * @author ankelen
 * @date 2022-08-04 18:28
 */
@Getter
public class AppException extends RuntimeException {
    private Object appendObj;

    public AppException(String message, Object obj) {
        super(message);
        this.appendObj = obj;
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
