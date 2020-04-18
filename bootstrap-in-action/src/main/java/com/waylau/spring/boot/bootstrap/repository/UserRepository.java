package com.waylau.spring.boot.bootstrap.repository;

import org.springframework.data.repository.CrudRepository;

import com.waylau.spring.boot.bootstrap.domain.User;


public interface UserRepository extends CrudRepository<User, Long>{
}
