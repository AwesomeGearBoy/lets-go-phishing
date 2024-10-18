import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String[] passwords = new String[] { "password1", "password2", "password3" };
        Random rand = new Random();
        int randomPassword = rand.nextInt(0, 2);
        String password = passwords[randomPassword];
        String guess = "";
        String userName = "";
        char choice = 'A';
        boolean systemRunning = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to Who Wants To Be A Hacker! This is a game created to simulate how hackers use phishing to guess your password. You, or other people after you, will attempt to guess the password using clues that have been provided to you. The hacker with the fastest time wins!");
        do {
            do {
                System.out.print("Enter password: ");
                guess = input.next();
                if (guess.equals(password)) {
                    System.out.println("We have a winner! Please, tell us your name: ");
                    userName = input.next();
                    if (userName.equals("") || userName.equals("No") || userName.equals("I will not give you my name.") || userName.equals("I will not give you my name") || userName.equals("i will not give you my name") || userName.equals("no") || userName.equals("yes") || userName.equals("Yes")) {
                        System.out.println("Good! You passed that test too! Never give ANYONE you don't know personal information, and DEFINITELY not over a program like this, that can store that information.");
                        System.out.println("Congratulations for cracking the password!");
                    } else {
                        System.out.println("Never give ANYONE you don't know personal information, and DEFINITELY not over a program like this that can store that information.");
                        System.out.println("Congratulations for cracking the password, " + userName + ".");
                    }
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
            } while (!guess.equals(password));
            do {
                System.out.println("Would you like to play again (Y/N)?");
                input.nextLine();
                choice = input.nextLine().charAt(0);
                if (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
                    System.out.println("Invalid selection. Please try again.");
                }
            } while (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');
            if (choice == 'Y' || choice == 'y') {
                systemRunning = true;
            } else if (choice == 'N' || choice == 'n') {
                System.out.println("Have a nice day!");
                systemRunning = false;
            }
        } while (systemRunning);
        input.close();
        System.exit(0);
    }
}