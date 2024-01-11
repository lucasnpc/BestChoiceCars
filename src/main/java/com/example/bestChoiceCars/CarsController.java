package com.example.bestChoiceCars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CarsController {
    @RequestMapping("/")
    public String requestMethodName() {
        return "landing-page";
    }
    
}
