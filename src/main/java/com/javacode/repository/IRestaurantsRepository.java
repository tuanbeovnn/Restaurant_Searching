package com.javacode.repository;

import java.util.List;

public interface IRestaurantsRepository<T> {
    List<T> findAll(Object... objects);
}
