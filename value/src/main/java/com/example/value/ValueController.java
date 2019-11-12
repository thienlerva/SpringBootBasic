package com.example.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

    @Value("${math.num1}")
    private int num1;

    @Value("${math.num2}")
    private int num2;

    @Value("${spring.isAllowed}")
    private boolean isAllowed;

    @GetMapping("/count")
    public Integer count() {
        return isAllowed ? (num1+num2) : (num1-num2);
    }
}
