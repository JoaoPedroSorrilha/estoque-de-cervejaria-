package com.beerstock.mapper;

import com.beerstock.dto.BeerDTO;
import com.beerstock.entity.Beer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-10-27T20:08:53-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDTO toDTO(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDTO beerDTO = new BeerDTO();

        beerDTO.setId( beer.getId() );
        beerDTO.setName( beer.getName() );
        beerDTO.setBrand( beer.getBrand() );
        beerDTO.setMax( beer.getMax() );
        beerDTO.setQuantity( beer.getQuantity() );
        beerDTO.setType( beer.getType() );

        return beerDTO;
    }

    @Override
    public Beer toModel(BeerDTO beerDTO) {
        if ( beerDTO == null ) {
            return null;
        }

        Beer beer = new Beer();

        beer.setId( beerDTO.getId() );
        beer.setName( beerDTO.getName() );
        beer.setBrand( beerDTO.getBrand() );
        beer.setMax( beerDTO.getMax() );
        beer.setQuantity( beerDTO.getQuantity() );
        beer.setType( beerDTO.getType() );

        return beer;
    }
}
