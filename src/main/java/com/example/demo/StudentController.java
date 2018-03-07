package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

// This is just show to start page.
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "This is home page";
	}
	
//	Return map of all students. 
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public Map allStudent() {
		return students;
	}
	
//	call addStudent method for adding student object and return message.
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addStudent(@RequestBody Student student) {
		addStudentToMap(student);
		return "Student added succesfully";
	}
	
//	Map of student.
    Map<Integer, Student> students = new HashMap<>();
    int count =0;
    
//  method to add student with count.
    public void addStudentToMap(Student student) {
    		count++;
            students.put(count, student);
    }
}
