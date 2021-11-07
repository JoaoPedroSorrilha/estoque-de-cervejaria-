package com.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BeerNotFoundException extends Exception {

    public BeerNotFoundException(String bierName) {
        super(String.format("Bier with name %s not found in the system.", bierName));
    }

    public BeerNotFoundException(Long id) {
        super(String.format("Bier with id %s not found in the system.", id));
    }
}
