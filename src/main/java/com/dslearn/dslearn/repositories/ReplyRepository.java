package com.dslearn.dslearn.repositories;

import com.dslearn.dslearn.entities.Course;
import com.dslearn.dslearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
