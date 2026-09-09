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
public class m2ex10Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Position: ");
        String pos = scanner.nextLine();

        System.out.print("Enter Hours Worked: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter Hourly Rate: ");
        String rate = scanner.nextLine();
        
        System.out.println("\n");
        System.out.println("Employee Name:      " + name);
        System.out.println("Enter Employee ID:  " + id);
        System.out.println("Position:           " + pos);
        System.out.println("Hours Worked:       " + hours);
        System.out.println("Hourly Rate:        " + rate);
        
        scanner.close();
    }
    
}
