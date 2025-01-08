package com.microservice.school.controller;

import com.microservice.school.dto.FullSchoolResponse;
import com.microservice.school.entity.School;
import com.microservice.school.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
public class SchoolController {
   private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(School school){
        schoolService.saveSchool(school);
    }
    @GetMapping
    public ResponseEntity<List<School>> getAllSchools(){
        return ResponseEntity.ok(schoolService.findAllSchools());
    }
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findStudentsBySchoolId(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(schoolService.fullSchoolResponse(schoolId));
    }
}
