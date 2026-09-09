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
public class m27BankRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Account Name: ");
        String accountName = scanner.nextLine();
        
        System.out.println("Enter Account Number: ");
        String accountNum = scanner.nextLine();
        
        System.out.println("Enter Account Type: ");
        String accountType = scanner.nextLine();
        
        System.out.println("Enter Current Balance: ");
        double balance = scanner.nextDouble();
        
        System.out.println("\n");
        System.out.println("Account Holder: " + accountName);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Type:   " + accountType);
        System.out.printf("Current Balance: P%,.2f%n", balance);
        
        scanner.close();
    }
}
