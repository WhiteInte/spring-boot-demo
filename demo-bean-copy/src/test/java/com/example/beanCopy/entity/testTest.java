package com.example.beanCopy.entity;

import com.example.beanCopy.mapper.CarMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class testTest {

    @Resource
    CarMapper carMapper;
    @Test
    public void test1(){
        Car car = Car.builder().make("kk").numberOfSeats(1).type(CarType.builder().type("hh").build()).build();
        System.out.println(carMapper.carToCarDto(car));
    }

}
