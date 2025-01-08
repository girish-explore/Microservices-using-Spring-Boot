package com.microservice.student.service;

import com.microservice.student.entity.Student;
import com.microservice.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
