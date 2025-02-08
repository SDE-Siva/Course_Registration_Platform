package com.example.courseRegistrationPlatform.controller;

import com.example.courseRegistrationPlatform.model.Course;
import com.example.courseRegistrationPlatform.model.CourseRegistry;
import com.example.courseRegistrationPlatform.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"})
@RestController
//@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,email,courseName);
        return "Congratulations! " +name + " You successfully enrolled for "+courseName;
    }

}
