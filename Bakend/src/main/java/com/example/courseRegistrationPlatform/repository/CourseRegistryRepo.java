package com.example.courseRegistrationPlatform.repository;

import com.example.courseRegistrationPlatform.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
