package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String idNumber;
    private String courseName;

    private List<Student> studentsTakingThisCourse = new ArrayList<>();

    private List<Teacher> teachersForThisCourse = new ArrayList<>();

    public List<Student> getStudentsTakingThisCourse() {
        return studentsTakingThisCourse;
    }

    public List<Teacher> getTeachersForThisCourse() {
        return teachersForThisCourse;
    }

    public Course() {
    }

    public Course(String idNumber, String courseName) {
        this.idNumber = idNumber;
        this.courseName = courseName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
