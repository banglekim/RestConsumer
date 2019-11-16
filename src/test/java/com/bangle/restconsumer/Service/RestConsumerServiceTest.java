package com.bangle.restconsumer.Service;

import com.bangle.restconsumer.Entity.Country;
import com.bangle.restconsumer.Repository.RestConsumerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RestConsumerServiceTest {
    List<Country> countries;

    @InjectMocks
    RestConsumerService restConsumerService;

    @Mock
    RestConsumerRepository restConsumerRepository;

    @Before
    public void setUp ( ) throws Exception {
        countries = new ArrayList <>();
        Country country = new Country();
        country.setName("Vietnam");
        countries.add(country);
    }

    @Test
    public void getCountries ( ) {
        when(restConsumerRepository.getCountries()).thenReturn(countries);
        List < Country > countryList = restConsumerService.getCountries();
        assertEquals(countryList.get(0).getName(),"Vietnam");
    }
}