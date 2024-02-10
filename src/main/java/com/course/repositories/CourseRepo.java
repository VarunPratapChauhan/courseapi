package com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
