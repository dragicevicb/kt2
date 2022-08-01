package com.example.kt2.controller;

import com.example.kt2.dto.DTO;
import com.example.kt2.dto.SuccessResponse;
import com.example.kt2.service.CustomService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/custom")
@Controller
@Getter
@Setter
public class CustomController {
    private CustomService customService;

    @Autowired
    public CustomController(CustomService customService) {
        this.customService = customService;
    }

    @GetMapping("/helloworld")
    public ResponseEntity<DTO> helloworld(@RequestParam("name") String name){
        DTO dto = customService.customFunction(name);

        if(dto instanceof SuccessResponse){
            return new ResponseEntity<>(dto, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        }
    }
}
