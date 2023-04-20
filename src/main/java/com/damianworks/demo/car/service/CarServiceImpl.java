package com.damianworks.demo.car.service;

import com.damianworks.demo.car.dao.CarRepository;
import com.damianworks.demo.car.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    CarRepository carRepository;
    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(int theId) {
        return null;
    }

    @Override
    public void save(Car theCar) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
