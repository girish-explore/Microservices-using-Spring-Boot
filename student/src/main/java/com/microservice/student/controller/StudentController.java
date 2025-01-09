package com.microservice.student.controller;

import com.microservice.student.entity.Student;
import com.microservice.student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }
    @GetMapping
    public ResponseEntity<List<Student>> allStudents(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }
    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }

}
