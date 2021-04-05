package com.example.springbootdemo;

import com.example.springbootdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//makes class a REST-ful endpoint
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(1L,"Jermy","jar@gmail.com", LocalDate.of(1995, Month.DECEMBER, 22), 25)
		);
	}

}
