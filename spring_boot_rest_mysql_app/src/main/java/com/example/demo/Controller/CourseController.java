package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CourseService;
import com.example.demo.binding.Course;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String> insertRecords(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED );
	}
	
	@PutMapping("/course")
	public ResponseEntity<String> updateRecords(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK );
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid)
	{
		Course byID = courseService.getByID(cid);
		return new ResponseEntity<>(byID, HttpStatus.OK);
		
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourse()
	{
		 List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> DeleteCourse(@PathVariable Integer cid)
	{
		String deleteById = courseService.deleteById(cid);
		return new ResponseEntity<>(deleteById, HttpStatus.OK);
		
	}
	

}
