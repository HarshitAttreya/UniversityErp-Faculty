package com.Harshit.UniversityErp_Faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class FacultyController {

    @Autowired
    FacultyService service;

    @GetMapping("/Faculty")
    public List<Faculty> getFaculty(){
        return service.getFaculty();
    }

    @PostMapping("/Faculty")
    public void addFaculty(@RequestBody Faculty faculty){
        if(faculty != null){
            service.addFaculty(faculty);
        }
    }

    @GetMapping("{facultyId}")
    public Faculty getFacultyById(@PathVariable String FacultyId){
        Faculty faculty = service.getFacultyById(FacultyId);
        return faculty;
    }
}
