package com.nagarro.student.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nagarro.student.entity.Student;


public interface StudentRepository extends MongoRepository<Student,Integer>{

}
