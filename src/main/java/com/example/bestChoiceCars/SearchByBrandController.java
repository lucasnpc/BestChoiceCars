package com.example.bestChoiceCars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bestChoiceCars.repositories.CarsRepository;

@Controller
public class SearchByBrandController {

    @Autowired
    CarsRepository carsRepository;
    
    @RequestMapping("/searchByBrand")
    public String searchByBrandScreen(Model model) {
        var brands = carsRepository.findDistinctBrands();
        model.addAttribute("brands", brands);
        
        return "search-by-brand";
    }
}
