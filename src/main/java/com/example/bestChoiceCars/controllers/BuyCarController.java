package com.example.bestChoiceCars.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bestChoiceCars.model.Car;
import com.example.bestChoiceCars.repositories.CarsRepository;

@Controller
public class BuyCarController {

    @Autowired
    CarsRepository carsRepository;

    @RequestMapping("buyCar")
    public String requestMethodName(@RequestParam("carId") UUID carId, Model model) {
        if (carId != null) {
            Car car = carsRepository.findById(carId)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid car Id:" + carId));
            model.addAttribute("car", car);
        }

        return "buy-car.html";
    }

}
