/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package std.exercise1;

import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class m28CourseEnroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Subject Code: ");
        String subjectCode = scanner.nextLine();

        System.out.print("Enter Subject Title: ");
        String subjectTitle = scanner.nextLine();

        System.out.print("Enter Units: ");
        int units = scanner.nextInt();

        System.out.print("Enter Section Letter: ");
        char sectionLetter = scanner.next().charAt(0);
        
        System.out.println("\n");
        System.out.println("Student Name:  " + studentName);
        System.out.println("Subject Code:  " + subjectCode);
        System.out.println("Subject Title: " + subjectTitle);
        System.out.println("Units:         " + units);
        System.out.println("Section:       " + sectionLetter);
        
        scanner.close();
    }
    
}
