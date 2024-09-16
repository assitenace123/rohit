package com.raushan.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeCon {
	
	@Bean
	public Student getStudent() {
		return new Student();
	}
	
	@Bean
	public Faculty getFaculty() {
		return new Faculty();
	}

}