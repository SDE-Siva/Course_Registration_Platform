package com.example.courseRegistrationPlatform.service;

import com.example.courseRegistrationPlatform.model.Course;
import com.example.courseRegistrationPlatform.model.CourseRegistry;
import com.example.courseRegistrationPlatform.repository.CourseRegistryRepo;
import com.example.courseRegistrationPlatform.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {

        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String email, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,email,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
