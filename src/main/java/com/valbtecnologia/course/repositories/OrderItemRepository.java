package com.valbtecnologia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valbtecnologia.course.entities.OrderItem;
import com.valbtecnologia.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
