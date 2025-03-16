package com.multipledb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multipledb.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
