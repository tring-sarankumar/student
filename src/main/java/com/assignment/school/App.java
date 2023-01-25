package com.assignment.school;
import java.util.Scanner;
public class App 
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name =sc.nextLine();

        System.out.println("Enter grade:");
        char grade=sc.next().charAt(0);

        System.out.println("Enter GPA:");
        float gpa =sc.nextFloat();


        SchoolLogic obj = new SchoolLogic(name, grade, gpa);
        System.out.println(obj.profile());

        System.out.println("Do You Want To Update GPA: yes/no");
        String updategpa= sc.next();
        if(update_gpa.equalsIgnoreCase("yes")){
            System.out.println("Enter New GPA:");
            Float newgpa =sc.nextFloat();
            obj.update(newgpa);
            System.out.println(obj.profile());
        
        }
    }
}
