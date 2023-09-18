package com.dslearn.dslearn.repositories;

import com.dslearn.dslearn.entities.Course;
import com.dslearn.dslearn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
