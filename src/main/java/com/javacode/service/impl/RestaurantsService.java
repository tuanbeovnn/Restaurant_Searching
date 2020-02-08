package com.javacode.service.impl;

import com.javacode.builder.RestaurantsSearchBuilder;
import com.javacode.dto.RestaurantsDto;
import com.javacode.repository.IRestaurantsRepository;
import com.javacode.repository.impl.RestaurantsRepository;
import com.javacode.search.StringSearch;
import com.javacode.service.IRestaurantsService;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantsService implements IRestaurantsService {

    private IRestaurantsRepository restaurantsRepository;

    public RestaurantsService(){
        if(restaurantsRepository == null){
            restaurantsRepository = new RestaurantsRepository();
        }
    }

    @Override
    public List<RestaurantsDto> findAll(StringSearch stringSearch) {
        double lat = Double.parseDouble(stringSearch.getLat());
        double lon = Double.parseDouble(stringSearch.getLon());
        return restaurantsRepository.findAll(stringSearch.getQ() , lat , lon);
    }


}
