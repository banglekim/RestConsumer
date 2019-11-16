package com.bangle.restconsumer.Repository;

import com.bangle.restconsumer.Entity.Country;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Repository
public class RestConsumerRepository {

    private List<Country> getCountriesFromPage (String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Object>> restResponse = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference < List < Object > >(){});
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        List<Country> countries = (List<Country>) restResponse.getBody().get(1);
        List<Country> countryList = mapper.convertValue(countries,new TypeReference< Object>(){});
        return countryList;
    }

    public List<Country> getCountries () {
        final String url = "http://api.worldbank.org/v2/country?format=json&page=";

        List<Country> countries = new ArrayList <>();
        for (int i=1; i<=7; i++) {
            String newURL = url +i;
            countries.addAll(getCountriesFromPage(newURL));
        }

        return countries;
    }
}
