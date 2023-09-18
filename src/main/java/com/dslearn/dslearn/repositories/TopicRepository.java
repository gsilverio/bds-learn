package com.dslearn.dslearn.repositories;

import com.dslearn.dslearn.entities.Course;
import com.dslearn.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
