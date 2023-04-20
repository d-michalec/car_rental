package com.damianworks.demo.car.service;

import com.damianworks.demo.car.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> findAll();

    Car findById(int theId);

    void save(Car theCar);

    void deleteById(int theId);
}