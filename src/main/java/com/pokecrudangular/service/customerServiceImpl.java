package com.pokecrudangular.service;

import com.pokecrudangular.entity.customer;
import com.pokecrudangular.exception.ResourceNotFoundException;
import com.pokecrudangular.repository.customerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customerServiceImpl implements customerService{
    private final customerRepository customerRepository;

    public customerServiceImpl(com.pokecrudangular.repository.customerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public customer save(customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public customer findById(Integer id) {
        customer customer = customerRepository.findById(id).orElseThrow(
                () -> {throw new ResourceNotFoundException("Usuario con Id "+id+" no se encuentra");
                }
        );
        //customer customer1 = customerRepository.findById(id).get();
        return customer;
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public customer update(customer customer) {
        return customerRepository.save(customer);
    }
}
