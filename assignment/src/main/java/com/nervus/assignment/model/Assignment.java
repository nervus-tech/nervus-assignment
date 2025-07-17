package com.nervus.assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Table(name = "assignments",schema = "assignment") // Explicitly name the table to avoid reserved keyword conflict
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime due_date;

    // Getters, setters, constructors
    public Assignment() {}
    public Assignment(String title, String description, LocalDateTime due_date) {
        this.title = title;
        this.description = description;
        this.due_date = due_date;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getDue_date() { return due_date; }
    public void setDue_date(LocalDateTime due_date) { this.due_date = due_date; }
}
