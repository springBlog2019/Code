package com.waylau.spring.boot.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.waylau.spring.boot.jpa.domain.User;


public interface UserRepository extends CrudRepository<User, Long>{
}
