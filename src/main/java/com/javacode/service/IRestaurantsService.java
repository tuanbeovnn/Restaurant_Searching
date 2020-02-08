package com.javacode.service;

import com.javacode.builder.RestaurantsSearchBuilder;
import com.javacode.dto.RestaurantsDto;
import com.javacode.search.StringSearch;

import java.util.List;

public interface IRestaurantsService {
    List<RestaurantsDto> findAll(StringSearch stringSearch);
}
