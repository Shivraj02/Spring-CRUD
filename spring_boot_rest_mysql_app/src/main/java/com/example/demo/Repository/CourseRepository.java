package com.example.demo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
	
	

}
