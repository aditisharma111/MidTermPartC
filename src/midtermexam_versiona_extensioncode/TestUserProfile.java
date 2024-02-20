
package midtermexam_versiona_extensioncode;


import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  available genres
        System.out.println("select genres from here :");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Entering User Name
        System.out.print("Enter the  name: ");
        String name = scanner.nextLine();

        // choosing genres
        System.out.print("Choose your favorite genre: ");
        int choice = scanner.nextInt();

        // Validate genre choice
        if (choice < 1 || choice > genres.length) {
            System.out.println("wrong . Please choose a number from 1 to " + genres.length);
            return;
        }

        // Create user profile
        String selectedGenre = genres[choice - 1];
        UserProfile UserProfile = new UserProfile(name, selectedGenre);

        // Display confirmation message
        System.out.println("User profile has been created : " + name + " with favorite genre: " + selectedGenre);
    }
}