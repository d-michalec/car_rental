package com.damianworks.demo.car.entity;

import jakarta.persistence.*;

@Entity
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="company")
    private String company;
    @Column(name="model")
    private String model;
    @Column(name="year")
    private Integer year;

    public Car(String company, String model, Integer year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
