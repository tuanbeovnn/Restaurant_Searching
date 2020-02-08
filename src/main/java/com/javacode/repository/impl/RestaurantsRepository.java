package com.javacode.repository.impl;

import com.javacode.dto.RestaurantsDto;
import com.javacode.mapper.impl.RestaurantsMapper;
import com.javacode.repository.IRestaurantsRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class RestaurantsRepository implements IRestaurantsRepository {

    @Override
    public List findAll(Object... objects) {
        JSONParser jsonParser = new JSONParser();
        try{
            Reader reader = new FileReader("/Java_Project/restaurants.json");
            String results = "";
            List<RestaurantsDto> list = new ArrayList<>();
            try {
                JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
                JSONArray array = (JSONArray) jsonObject.get("restaurants");
                for (int i =0; i < array.size();i++){
                    String json = array.get(i).toString();
                    JSONObject json1 = (JSONObject) jsonParser.parse(json);
                    if (test(json1 , objects)){
                        results +=i+ ",";
                    }
                }
                RestaurantsMapper restaurantsMapper = new RestaurantsMapper();
                results = results.substring(0,results.length()-1);
                String[] result = results.split(",");
                for (int i =0; i < result.length;i++){
                    String json = array.get(Integer.parseInt(result[i])).toString();
                    JSONObject jsonObject1 = (JSONObject) jsonParser.parse(json);
                    list.add(restaurantsMapper.mapRow(jsonObject1));
                }
                return list;
            }catch (IOException e){
                System.out.println(e.getMessage());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return new ArrayList();
    }

    public boolean test(JSONObject object , Object... objects){
        double latFrom = Double.parseDouble(objects[1].toString()) - 3;
        double latTo = Double.parseDouble(objects[1].toString()) + 3;
        double lonFrom = Double.parseDouble(objects[2].toString()) - 3;
        double lonTo = Double.parseDouble(objects[2].toString()) + 3;
        JSONArray arr = (JSONArray) object.get("location");
        double lat = Double.parseDouble(arr.get(0).toString());
        double lon = Double.parseDouble(arr.get(1).toString());
        JSONArray array = (JSONArray) object.get("tags");
        String tags = "";
        for(int i = 0;i<array.size() ; i++){
            tags += array.get(i).toString() + ",";
        }
        if((object.get("name").toString().startsWith((String) objects[0]) ||
                object.get("name").toString().endsWith((String) objects[0]) ||
                object.get("name").toString().toString().matches((String) objects[0])) ||
                (object.get("description").toString().startsWith((String) objects[0]) ||
                object.get("description").toString().endsWith((String) objects[0]) ||
                object.get("description").toString().matches((String) objects[0])) ||
                (tags.startsWith((String) objects[0])||
                tags.endsWith((String) objects[0])||
                tags.matches((String) objects[0])) &&
                ((latFrom < lat && latTo > lat) && (lonFrom < lon && lonTo > lon))){
            return true;
        }else{
            return false;
        }
    }

}
