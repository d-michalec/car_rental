package com.damianworks.demo.car.controller;

import com.damianworks.demo.car.entity.Car;
import com.damianworks.demo.car.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

   @GetMapping("/all")
    public String listAll(Model model){
        List<Car> carList = carService.findAll();
        model.addAttribute("carList", carList);
        return "list-cars";
   }
}

