
package com.mycompany.studentlst;

import java.util.Scanner;

/**
 *
 * @author Badar
 */
public class StudentList {

       
    public static void main(String[] args) {
        Student[] students= new Student[2];
        Scanner inScanner = new Scanner(System.in);
     
        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);
            
            students[i]= student;
            
        }
        System.out.println(printOutput(students));
    }
    
   
    
    public static String printOutput(Student[] students) {
    StringBuilder str = new StringBuilder();
    
    
    for (Student student : students) {
       
        str.append("Name: ").append(student.getName()).append("\n");
       
    }
    
    return str.toString();
}
    
    
}


