/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentexample;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class StudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      Student[] students = new Student[5];

      for(int i = 0; i < students.length; ++i) {
         System.out.println("Enter a name");
         String name = input.nextLine();
         students[i] = new Student(name);
      }

      students[2].setAge(18);
      Student[] var7 = students;
      int var8 = students.length;

      for(int var5 = 0; var5 < var8; ++var5) {
         Student student = var7[var5];
         System.out.printf("Student %s is %d years old\n", student.getName(), student.getAge());
      }
    }
    
}
