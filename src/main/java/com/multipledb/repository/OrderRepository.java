package com.multipledb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multipledb.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
