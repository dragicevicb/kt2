package com.example.kt2.service.implementation;

import com.example.kt2.dto.DTO;
import com.example.kt2.dto.ErrorResponse;
import com.example.kt2.dto.SuccessResponse;
import com.example.kt2.service.CustomService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class CustomServiceImplementation implements CustomService {
    @Override
    public DTO customFunction(String name) {
        if(name.equals("Baki")){
            return new ErrorResponse();
        }

        return new SuccessResponse("Ide gas");
    }
}
