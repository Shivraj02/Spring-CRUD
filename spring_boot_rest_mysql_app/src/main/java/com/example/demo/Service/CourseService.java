package com.example.demo.Service;

import java.util.List;

import com.example.demo.binding.Course;

public interface CourseService {
	public String upsert(Course course);
	public Course getByID(Integer cid);
	public List<Course> getAllCourses();
	public String deleteById(Integer cid);

}
