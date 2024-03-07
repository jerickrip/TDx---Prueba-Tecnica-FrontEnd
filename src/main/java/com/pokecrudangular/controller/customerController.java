package com.pokecrudangular.controller;

import com.pokecrudangular.entity.customer;
import org.springframework.web.bind.annotation.*;
import com.pokecrudangular.service.customerService;

import java.util.List;
import java.util.Optional;

@RestController
//http://localhost:8080/api/customers
@RequestMapping("/api/customers")
public class customerController {
    private final customerService customerService;

    public customerController(customerService customerService) {
        this.customerService = customerService;
    }

    //http://localhost:8080/api/customers
    @PostMapping
    public customer save(@RequestBody customer customer){
        return customerService.save(customer);
    }

    //http://localhost:8080/api/customers
    @GetMapping
    public List<customer> findAll(){
        return customerService.findAll();
    }

    //http://localhost:8080/api/customers/1
    @GetMapping("/{id}")
    public customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }

    //http://localhost:8080/api/customers/1
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    //http://localhost:8080/api/customers
    @PutMapping
    public customer updateCustomer(@RequestBody customer customer){
        customer customerById = customerService.findById(customer.getId());
        customerById.setFirstname(customer.getFirstname());
        customerById.setLastname(customer.getLastname());
        customerById.setPasatiempo(customer.getPasatiempo());
        customerById.setCumple(customer.getCumple());
        customerById.setDui(customer.getDui());
        return customerService.update(customerById);
    }
}
