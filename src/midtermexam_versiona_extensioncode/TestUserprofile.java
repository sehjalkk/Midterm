/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author amrinder
 */
public class TestUserprofile {
    

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // User input for name
        System.out.print("Enter your name: ");
        String userName = Scanner.nextLine();

        // Displaying a list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Drama");
        System.out.println("3. Comedy");
        System.out.println("4. Sci-Fi");

        // User input for favorite genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = Scanner.nextInt();

        // Mapping the genre choice to an actual genre
        String[] genres = {"Action", "Drama", "Comedy", "Sci-Fi"};
        String favoriteGenre = genres[genreChoice - 1];

        // Displaying the message
        System.out.println("User Profile created. Share Profile: " + userName + ", Favorite Genre: " + favoriteGenre);

        // Close the scanner
        Scanner.close();
    }
}
    
    

