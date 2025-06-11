package com.valbtecnologia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valbtecnologia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
