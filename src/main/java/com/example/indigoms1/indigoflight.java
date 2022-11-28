package com.example.indigoms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indigoflight {
    @GetMapping("/indigo")
    public String getData(){
        return "thank you for choosing indigo";
    }
}
