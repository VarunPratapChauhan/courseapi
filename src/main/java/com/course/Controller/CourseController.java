package com.course.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.payload.CourseDto;
import com.course.services.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController { 

	@Autowired
	public CourseService courseService;
	
	// create
	@PostMapping("/create")
	public ResponseEntity<CourseDto> createCourse(@RequestBody CourseDto courseDto){
		CourseDto createCourse= this.courseService.createCourse(courseDto);
		return new ResponseEntity<CourseDto>(createCourse, HttpStatus.CREATED);
	}
	
	
	//update
	@PutMapping("/update/{couId}")
	public ResponseEntity<CourseDto> createCourse(@RequestBody CourseDto courseDto, @PathVariable Long couId){
		CourseDto updatedCourse= this.courseService.updateCourse(courseDto, couId);
		return new ResponseEntity<CourseDto>(updatedCourse, HttpStatus.OK);
	}
	
	
	//get
	
	@GetMapping("/get/{couId}")
	public ResponseEntity<CourseDto> getCourse(@PathVariable Long couId){
		CourseDto courseDto= this.courseService.getCourseById(couId);
		return new ResponseEntity<CourseDto>(courseDto, HttpStatus.OK);
	}
}
