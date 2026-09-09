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
public class m26MovieInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();

        System.out.print("Enter director: ");
        String director = scanner.nextLine();

        System.out.print("Enter release year: ");
        int year = scanner.nextInt();

        System.out.print("Enter runtime (in minutes): ");
        int runtime = scanner.nextInt();

        System.out.print("Enter rating (e.g., 8.5): ");
        double rating = scanner.nextDouble();
  
        System.out.println("Title:        " + title);
        System.out.println("Director:     " + director);
        System.out.println("Release Year: " + year);
        System.out.println("Runtime:      " + runtime + " mins");
        System.out.println("Rating:       " + rating + "/10");

        scanner.close();
    }
    
}
