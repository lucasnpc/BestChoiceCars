package com.example.bestChoiceCars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CarsController {
    @RequestMapping("/")
    public String landingPage() {
        return "landing-page";
    }
    
}
