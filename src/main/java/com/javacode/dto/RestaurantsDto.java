package com.javacode.dto;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsDto {
    private String blurhash;
    private String city;
    private String currentcy;
    private String delivery_price;
    private String description;
    private double[] locations;
    private String name;
    private boolean online;
    private String[] tags;
    private List<RestaurantsDto> listResult;

    public List<RestaurantsDto> getListResult() {
        return listResult;
    }

    public void setListResult(List<RestaurantsDto> listResult) {
        this.listResult = listResult;
    }

    public String getBlurhash() {
        return blurhash;
    }

    public void setBlurhash(String blurhash) {
        this.blurhash = blurhash;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrentcy() {
        return currentcy;
    }

    public void setCurrentcy(String currentcy) {
        this.currentcy = currentcy;
    }

    public String getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(String delivery_price) {
        this.delivery_price = delivery_price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double[] getLocations() {
        return locations;
    }

    public void setLocations(double[] locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
