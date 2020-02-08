package com.javacode.mapper.impl;

import com.javacode.dto.RestaurantsDto;
import com.javacode.mapper.RowMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class RestaurantsMapper implements RowMapper {
    @Override
    public RestaurantsDto mapRow(JSONObject ojbj) {
        RestaurantsDto restaurantsDto = new RestaurantsDto();
        restaurantsDto.setName(ojbj.get("name").toString());
        restaurantsDto.setBlurhash(ojbj.get("blurhash").toString());
        restaurantsDto.setCity(ojbj.get("city").toString());
        restaurantsDto.setCurrentcy(ojbj.get("currency").toString());
        restaurantsDto.setDelivery_price(ojbj.get("delivery_price").toString());
        restaurantsDto.setDescription(ojbj.get("description").toString());

        //mapper locations
        JSONArray arrLocation =(JSONArray) ojbj.get("location");
        double[] arrLocation1 = new double[arrLocation.size()];
        for(int i = 0 ; i <arrLocation.size();i++){
            arrLocation1[i] = Double.parseDouble(arrLocation.get(i).toString());
        }
        restaurantsDto.setLocations(arrLocation1);
        restaurantsDto.setOnline(Boolean.parseBoolean(ojbj.get("online").toString()));

        //mapper tags
        JSONArray arraytags = (JSONArray) ojbj.get("tags");
        String[] arrtags1 = new String[arraytags.size()];
        for (int i =0; i<arraytags.size();i++){
            arrtags1[i] = arraytags.get(i).toString();
        }
        restaurantsDto.setTags(arrtags1);

        return restaurantsDto;
    }
}
