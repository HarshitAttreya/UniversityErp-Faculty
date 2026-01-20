package com.Harshit.UniversityErp_Faculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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
    public ResponseEntity<Faculty> addFaculty(@RequestBody Faculty faculty){
        service.addFaculty(faculty);
        return ResponseEntity.ok().body(faculty);
    }

    @GetMapping("{facultyId}")
    public ResponseEntity<Faculty> getFacultyById(@PathVariable String FacultyId){
        Optional<Faculty> faculty = service.getFacultyById(FacultyId);
        return faculty.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
