package com.example.bestChoiceCars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/chooseCarToBuy")
    public String chooseCarToBuyScreen(@RequestParam("brand") String brand, Model model) {
        var cars = carsRepository.findByBrand(brand);
        model.addAttribute("cars", cars);

        return "choose-car-to-buy";
    }
}
