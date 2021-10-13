package com.iteesoft.fileupload;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AppException extends RuntimeException {

    private String message;
    private Throwable cause;

    public AppException(String message) {
        super(message);
    }
}
