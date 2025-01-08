package com.microservice.school.service;

import com.microservice.school.dto.FullSchoolResponse;
import com.microservice.school.entity.School;

import java.util.List;

public interface SchoolService {
    public void saveSchool(School school);
    public List<School> findAllSchools();
    public FullSchoolResponse fullSchoolResponse(Integer schoolId);
}
