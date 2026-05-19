package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;

public class StudentErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    public StudentErrorResponse() {}

    public StudentErrorResponse(long timestamp, int status, String message) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
