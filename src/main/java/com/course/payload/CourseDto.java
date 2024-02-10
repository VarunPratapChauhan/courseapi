package com.course.payload;

import com.course.config.CourseTypeEnum;
import com.course.config.LearnModeEnum;
import com.course.config.RoleEnum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Setter
@Getter
public class CourseDto {
	
	private Long id;
	private RoleEnum role; // COURSE_CREATOR , TEACHER , STUDENT;
    
	private String subjectName;
    private String courseName;
    private int noOfChapters;
    private CourseTypeEnum courseType; // Can be PERSONALIZED , GROUP;    
    private LearnModeEnum learnMode; // Can be ASSISTED , SELF_LEARNING;
   

}
