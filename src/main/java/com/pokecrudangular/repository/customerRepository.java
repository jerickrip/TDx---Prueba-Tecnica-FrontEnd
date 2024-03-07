package com.pokecrudangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pokecrudangular.entity.customer;

public interface customerRepository extends JpaRepository<customer,Integer>{

}
