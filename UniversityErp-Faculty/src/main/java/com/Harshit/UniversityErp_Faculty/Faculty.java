package com.Harshit.UniversityErp_Faculty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name = "Faculty")
public class Faculty {

    @Id
    private String FacultyID;

    private String FacultyName;

    private String FacultyAddress;

    private String email;
    private String DepartmentName;

    private String DepartmentId;

    private String CourseName;
}
