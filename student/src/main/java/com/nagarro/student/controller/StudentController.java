package com.nagarro.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.student.entity.Student;
import com.nagarro.student.repo.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {

		return studentRepo.save(student);
	}

	@GetMapping("/findAll")
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

//	@GetMapping("/findById/{rollNo}")
//	public Optional<Student> getFindByRoolNo(@PathVariable String rollNo) {
//		return studentRepo.findByRollNo(rollNo);
//	}

}
