package com.assignment.school;

public class SchoolLogic {
    String name;
    char grade;
    float gpa;

    SchoolLogic(String name,char grade,float gpa){
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }

    void update(float new_gpa){
        gpa=new_gpa;
    }

    String profile(){
        String name_gpa= name +" has a "+gpa +" GPA";
        return name_gpa;
    }
}
