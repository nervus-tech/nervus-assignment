package com.nervus.assignment.repository;

import com.nervus.assignment.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    // Additional query methods can be defined here if needed
}
