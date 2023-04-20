package com.damianworks.demo.car.dao;

import com.damianworks.demo.car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository
extends JpaRepository<Car, Long> {

}
