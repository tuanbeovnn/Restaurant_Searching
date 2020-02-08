package com.javacode.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javacode.dto.RestaurantsDto;
import com.javacode.search.StringSearch;
import com.javacode.service.IRestaurantsService;
import com.javacode.service.impl.RestaurantsService;
import  com.javacode.utils.formUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/restaurants/search"})
public class RestaurantsAPI extends HttpServlet {

    private IRestaurantsService restaurantsService;

    public RestaurantsAPI(){
        if(restaurantsService == null){
            restaurantsService = new RestaurantsService();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        StringSearch stringSearch = formUtil.toModel(StringSearch.class , request);
        RestaurantsDto restaurantsDto = new RestaurantsDto();
        restaurantsDto.setListResult(restaurantsService.findAll(stringSearch));
        mapper.writeValue(response.getOutputStream() , restaurantsDto.getListResult());
    }

}
