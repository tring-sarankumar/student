package com.assignment.school;

public class StudentLogic {
    String name;
    char grade;
    float gpa;

    StudentLogic(String name,char grade,float gpa){
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }

    void update(float newgpa){
        gpa=newgpa;
    }

    String profile(){
        return name +" has a "+gpa +" GPA";
    }
}
