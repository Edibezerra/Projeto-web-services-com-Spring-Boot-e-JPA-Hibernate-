package com.example.webservice.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
