package com.example.bestChoiceCars.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bestChoiceCars.model.Car;
import com.example.bestChoiceCars.repositories.CarsRepository;

@Controller
public class ChooseCarToBuyController {

    @Autowired
    CarsRepository carsRepository;

    @RequestMapping("/chooseCarToBuy")
    public String chooseCarToBuyScreen(@RequestParam("brand") Optional<String> brand,
            @RequestParam("priceRange") Optional<String> priceRange, Model model) {
        List<Car> cars = null;
        if (brand.isPresent()) {
            cars = carsRepository.findByBrand(brand.get());
        } else if (priceRange.isPresent()) {
            if ("lessThan20000".equals(priceRange.get())) {
                cars = carsRepository.findByPriceLessThan(20000.0);
            } else {
                cars = carsRepository.findByPriceGreaterThan(20000.0);
            }
        }
        if (cars != null) {
            model.addAttribute("cars", cars);
        }

        return "choose-car-to-buy";
    }
}
