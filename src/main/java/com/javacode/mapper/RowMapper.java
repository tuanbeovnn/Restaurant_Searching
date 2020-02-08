package com.javacode.mapper;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public interface RowMapper<T> {
    T mapRow(JSONObject ojbj);
}
