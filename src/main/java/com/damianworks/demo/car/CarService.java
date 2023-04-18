package com.damianworks.demo.car;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
@RestController
public class CarService {
    CarRepository carRepository;
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAll(){
        return new ResponseEntity<>(carRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("cars/{id}")
    public ResponseEntity<Car> getById(@PathVariable Long id){
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()){
            return new ResponseEntity<>(car.get(), HttpStatus.OK);
        }else{
            throw new IllegalStateException();
        }
    }
}
