import java.util.Random;
import java.util.Scanner;

public class PasswordControl {
    String[] passwords = new String[] { "password1", "password2", "password3", "password4", "password5" }; // Enter passwords like shown, making sure not to mess with code.
    int bound = 5; // Make sure number here is the number of passwords you have available, otherwise some may not show up.

    public String randomize() {
        Random rand = new Random();
        int randomPassword = rand.nextInt(0, bound);
        return passwords[randomPassword];
    }

    public void listPasswords() {
        AnsiColors color = new AnsiColors();
        System.out.println(color.white() + color.blackBackground() + "PASSWORD LIST:" + color.reset());
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(color.white() + color.blackBackground() + (i + 1) + ". " + passwords[i] + color.reset());
        }
    }

    public String setPassword(Scanner input) {
        int choice;
        AnsiColors color = new AnsiColors();
        System.out.println(color.yellow() + color.blackBackground() + "Alright! Please choose the password to set:" + color.reset());
        listPasswords();
        
        while (true) {
            System.out.print(color.yellow() + color.blackBackground() + "Enter your choice:" + color.reset() + " ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice > 0 && choice <= passwords.length && passwords[choice - 1] != null) {
                    return passwords[choice - 1];
                } else {
                    System.out.println(color.red() + color.blackBackground() + "Invalid choice. Please try again." + color.reset());
                }
            } else {
                System.out.println(color.red() + color.blackBackground() + "Please enter a valid number." + color.reset());
                input.next();
            }
        }
    }
}
