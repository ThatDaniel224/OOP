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
public class m2ex9GameOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String ign = scanner.nextLine();

        System.out.print("Enter Character Name: ");
        String characterName = scanner.nextLine();
        
        System.out.print("Enter Level: ");
        int level = scanner.nextInt();

        System.out.print("Enter Experience Points: ");
        long xp = scanner.nextLong();
        
        scanner.nextLine();

        System.out.print("Enter Rank: ");
        String rank = scanner.nextLine();
        
        System.out.println("\n");
        System.out.println("Username:        " + ign);
        System.out.println("Character Name:  " + characterName);
        System.out.println("Level:           " + level);
        System.out.println("XP:              " + xp);
        System.out.println("Rank:            " + rank);
        
        scanner.close();
    }
    
}
