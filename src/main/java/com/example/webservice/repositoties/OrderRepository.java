package com.example.webservice.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
