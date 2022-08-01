package com.example.kt2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse extends DTO{
    private String error;

    public ErrorResponse() {
        this.error = "Baki smrad";
    }
}
