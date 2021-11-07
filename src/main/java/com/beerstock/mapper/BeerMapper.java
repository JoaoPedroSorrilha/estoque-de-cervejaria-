package com.beerstock.mapper;

import com.beerstock.dto.BeerDTO;
import com.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    BeerDTO toDTO(Beer beer);

    Beer toModel(BeerDTO beerDTO);
}
