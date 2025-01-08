package com.microservice.student.service;

import com.microservice.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> findAllStudents();
    public List<Student> findAllStudentsBySchool(Integer schoolId);
}
