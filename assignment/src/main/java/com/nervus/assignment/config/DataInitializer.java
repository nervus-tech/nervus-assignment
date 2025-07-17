package com.nervus.assignment.config;

import com.nervus.assignment.model.Assignment;
import com.nervus.assignment.repository.AssignmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class DataInitializer implements CommandLineRunner {
    private final AssignmentRepository assignmentRepository;

    public DataInitializer(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if data already exists to avoid duplication
        if (assignmentRepository.count() == 0) {
            // Seed sample assignments
            Assignment assignment1 = new Assignment(
                "Intro to Java",
                "Complete Chapter 1 exercises",
                LocalDateTime.now().plusDays(7)
            );
            Assignment assignment2 = new Assignment(
                "Project Proposal",
                "Submit a 500-word proposal",
                LocalDateTime.now().plusDays(14)
            );
            assignmentRepository.save(assignment1);
            assignmentRepository.save(assignment2);
            System.out.println("Seeded 2 assignments into assignments");
        } else {
            System.out.println("Assignments already seeded, skipping...");
        }
    }
}