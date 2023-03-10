package com.alexotoodev.springbootecomm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexotoodev.springbootecomm.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
