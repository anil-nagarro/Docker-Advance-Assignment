package com.nagarro.student.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Document("student")
@Data
public class Student {

	@Id
	@JsonIgnore
	private String id;
	
	private String rollNo;
	
	private String name;
	
	private String age;
	
}
