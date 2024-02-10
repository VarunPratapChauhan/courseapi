package com.course.services;

import com.course.payload.CourseDto;

public interface CourseService {

	CourseDto createCourse(CourseDto courseDto);
	
	CourseDto updateCourse(CourseDto courseDto, Long courseId);
	
	CourseDto getCourseById(Long courseId);
	
}
