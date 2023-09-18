package com.dslearn.dslearn.repositories;

import com.dslearn.dslearn.entities.Course;
import com.dslearn.dslearn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
