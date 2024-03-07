package com.pokecrudangular.service;

import com.pokecrudangular.entity.customer;

import java.util.List;

public interface customerService {
    customer save(customer customer);
    List<customer> findAll();
    customer findById(Integer id);
    void deleteById(Integer id);
    customer update(customer customer);
}
