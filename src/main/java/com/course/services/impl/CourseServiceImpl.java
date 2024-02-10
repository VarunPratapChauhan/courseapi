package com.course.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.entities.Course;
import com.course.payload.CourseDto;
import com.course.repositories.CourseRepo;
import com.course.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CourseDto createCourse(CourseDto courseDto) {
        Course cou=this.modelMapper.map(courseDto, Course.class);
        Course addedCou=this.courseRepo.save(cou);	
        
		return this.modelMapper.map(addedCou, CourseDto.class);
	}

	@Override
	public CourseDto updateCourse(CourseDto courseDto, Long courseId) {

		Course cou=this.courseRepo.findById(courseId).orElseThrow(()-> new RuntimeException("Course not found with this ID"));
		cou.setSubjectName(courseDto.getSubjectName());
		cou.setCourseName(courseDto.getCourseName());
		cou.setNoOfChapters(courseDto.getNoOfChapters());
		cou.setCourseType(courseDto.getCourseType());
		cou.setLearnMode(courseDto.getLearnMode());
		cou.setRole(courseDto.getRole());
		Course updatedCou=this.courseRepo.save(cou);
		
		return this.modelMapper.map(updatedCou, CourseDto.class);
	}

	@Override
	public CourseDto getCourseById(Long courseId) {

		Course cou=this.courseRepo.findById(courseId).orElseThrow(()-> new RuntimeException("Course not found with this ID"));
		
	    return this.modelMapper.map(cou, CourseDto.class);
	}

	

}
