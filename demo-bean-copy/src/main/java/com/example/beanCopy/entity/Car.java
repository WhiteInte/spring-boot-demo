package com.example.beanCopy.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author by itw_yangning01
 * @Classname Car
 * @Description TODO
 * @Date 2022/9/12 17:20:00
 */
@Data
@Builder
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;

    //constructor, getters, setters etc.
}
