package com.valbtecnologia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valbtecnologia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}