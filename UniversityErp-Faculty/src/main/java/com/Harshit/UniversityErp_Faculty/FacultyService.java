package com.Harshit.UniversityErp_Faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    FacultyRepository facultyRepository;

    public List<Faculty> getFaculty(){
        return facultyRepository.findAll();
    }

    public void addFaculty(Faculty faculty){
        Faculty save = facultyRepository.save(faculty);
    }

    public Faculty getFacultyById(String FacultyId){
        return facultyRepository.findById(FacultyId).get();
    }
}
