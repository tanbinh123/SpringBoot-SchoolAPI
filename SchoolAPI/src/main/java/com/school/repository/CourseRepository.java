package com.school.repository;

import org.springframework.data.repository.CrudRepository;

import com.school.entity.Course;
import com.school.entity.Student;

public interface CourseRepository extends CrudRepository<Course, Integer> {
	
	
}