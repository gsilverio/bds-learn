package com.dslearn.dslearn.repositories;

import com.dslearn.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
