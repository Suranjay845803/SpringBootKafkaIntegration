package com.spring.kafka.response;

public class Response {
    private boolean isSuccess;
    private String message;

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

