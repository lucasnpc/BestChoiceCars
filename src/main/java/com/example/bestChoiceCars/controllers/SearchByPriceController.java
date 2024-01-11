package com.example.bestChoiceCars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchByPriceController {

    @RequestMapping("/searchByPrice")
    public String searchByPriceScreen() {
        return "search-by-price";
    }

}