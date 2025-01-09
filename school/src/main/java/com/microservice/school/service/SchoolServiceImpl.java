package com.microservice.school.service;

import com.microservice.school.client.StudentClient;
import com.microservice.school.dto.FullSchoolResponse;
import com.microservice.school.entity.School;
import com.microservice.school.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{
    private final SchoolRepository schoolRepository;
    private final StudentClient studentclient;

    public SchoolServiceImpl(SchoolRepository schoolRepository, StudentClient studentclient) {
        this.schoolRepository = schoolRepository;
        this.studentclient = studentclient;
    }

    @Override
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public FullSchoolResponse fullSchoolResponse(Integer schoolId) {
        var school= schoolRepository.findBySchoolId(schoolId);
        if (school==null) return FullSchoolResponse.builder().name("NOT FOUND").
                email("NOT FOUND").students(null).build();
        var students= studentclient.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder().name(school.getName()).
                email(school.getEmail()).students(students).build();
    }
}
