package com.example.kt2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponse extends DTO{
    private String message;

    public SuccessResponse(String message) {
        this.message = message;
    }
}
