package com.example.courseRegistrationPlatform.repository;

import com.example.courseRegistrationPlatform.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {
}
