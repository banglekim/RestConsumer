package com.bangle.restconsumer.Service;

import com.bangle.restconsumer.Entity.Country;
import com.bangle.restconsumer.Repository.RestConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestConsumerService {

    @Autowired
    RestConsumerRepository restConsumerRepository;

    public List<Country> getCountries() {
        List<Country> countries =restConsumerRepository.getCountries();
        return countries;
    }
}
