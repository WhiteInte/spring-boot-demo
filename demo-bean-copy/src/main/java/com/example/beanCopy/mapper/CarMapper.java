package com.example.beanCopy.mapper;

import com.example.beanCopy.entity.Car;
import com.example.beanCopy.entity.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author by itw_yangning01
 * @Classname CarMapper
 * @Description TODO
 * @Date 2022/9/12 17:48:00
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}
