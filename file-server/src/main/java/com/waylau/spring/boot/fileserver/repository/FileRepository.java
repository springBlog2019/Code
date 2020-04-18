package com.waylau.spring.boot.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.waylau.spring.boot.fileserver.domain.File;
 


public interface FileRepository extends MongoRepository<File, String> {
}
