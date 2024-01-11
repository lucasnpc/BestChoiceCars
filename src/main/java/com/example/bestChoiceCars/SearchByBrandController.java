package com.example.bestChoiceCars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchByBrandController {
    @RequestMapping("/searchByBrand")
    public String searchByBrandScreen() {
        return "search-by-brand";
    }
}
