package com.nervus.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {
    @GetMapping("/test")
    public String test() {
        return "Assignment Service is running";
    }
}