package com.example.webservice.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
