package com.bangle.restconsumer.Controller;

import com.bangle.restconsumer.Entity.Country;
import com.bangle.restconsumer.Response.CountryResponse;
import com.bangle.restconsumer.Service.RestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestConsumerController {

    @Autowired
    RestConsumerService restConsumerService;

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
        public CountryResponse getCountries () {
        List<Country> countries=restConsumerService.getCountries();
        return new CountryResponse<>(true,countries);
    }
}
