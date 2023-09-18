package com.dslearn.dslearn.repositories;

import com.dslearn.dslearn.entities.Course;
import com.dslearn.dslearn.entities.Enrollment;
import com.dslearn.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
