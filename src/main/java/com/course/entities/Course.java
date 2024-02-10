package com.course.entities;

import com.course.config.CourseTypeEnum;
import com.course.config.LearnModeEnum;
import com.course.config.RoleEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Course {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String subjectName;
    private String courseName;
    private int noOfChapters;
	
    @Enumerated(EnumType.STRING)
	private RoleEnum role;      // // COURSE_CREATOR , TEACHER , STUDENT;
	
    @Enumerated(EnumType.STRING)
    private CourseTypeEnum courseType; // Can be PERSONALIZED , GROUP;
    
    @Enumerated(EnumType.STRING)
    private LearnModeEnum learnMode; // Can be ASSISTED , SELF_LEARNING;

}
