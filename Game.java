import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        String password;
        boolean systemRunning = true;
        Scanner input = new Scanner(System.in);
        PasswordControl passkey = new PasswordControl();
        AnsiColors color = new AnsiColors();

        do {
            resetTerminal();
            password = passkey.randomize();
            System.out.println(intro(color));
            guessing(color, input, password);
            systemRunning = playAgain(color, input, password);
        } while (systemRunning);

        input.close();
        System.exit(0);
    }

    /**
     * Shows intro to game.
     * @param color Needed for custom colors.
    */
    public static String intro(AnsiColors color) {
        return color.cyan() + color.blackBackground() + "Hello! Welcome to Who Wants To Be A Hacker!" + "\nThis is a game created to simulate how hackers use phishing to guess your password." + "\nYou, or other people after you, will attempt to guess the password using clues that have been provided to you." + "\nThe hacker with the fastest time wins!" + color.reset();
    }

    /**
     * The main guts of the game.
     * @param color Needed for custom colors.
     * @param input Needed as a scanner.
     * @param password password for user to guess.
    */
    public static void guessing(AnsiColors color, Scanner input, String password) {
        String guess = "";
        do {
            System.out.print(color.yellow() + color.blackBackground() + "Enter password: " + color.reset());
            guess = input.next();
            if (guess.equals(password)) {
                String userName = "";
                System.out.print(color.green() + color.blackBackground() + "We have a winner! Please, tell us your name: " + color.reset());
                userName = input.next();
                if (userName.equals("") || userName.equals("No") || userName.equals("I will not give you my name.") || userName.equals("I will not give you my name") || userName.equals("i will not give you my name") || userName.equals("no") || userName.equals("yes") || userName.equals("Yes")) {
                    System.out.println(color.cyan() + color.blackBackground() + "Good! You passed that test too! Never give ANYONE you don't know personal information, and DEFINITELY not over a program like this, that can store that information." + color.reset());
                    System.out.println(color.green() + color.blackBackground() + "Congratulations for cracking the password!" + color.reset());
                } else {
                    System.out.println(color.blue() + color.blackBackground() + "Never give ANYONE you don't know personal information, and DEFINITELY not over a program like this that can store that information." + color.ANSI_RESET);
                    System.out.println(color.yellow() + color.blackBackground() + "Congratulations for cracking the password, " + color.red() + userName + color.yellow() + "." + color.reset());
                }
            } else {
                System.out.println(color.red() + color.blackBackground() + "Incorrect password. Try again." + color.reset());
            }
        } while (!guess.equals(password));
    }

    /**
     * Asks user if they want to play again.
     * @param color Needed for custom colors.
     * @param input Needed as a scanner.
     * @param password password for user to guess.
    */
    public static boolean playAgain(AnsiColors color, Scanner input, String password) {
        char choice = 'A';
        do {
            System.out.println(color.yellow() + color.blackBackground() + "Would you like to play again (Y/N)?" + color.reset());
            input.nextLine();
            choice = input.nextLine().charAt(0);
            if (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n') {
                System.out.println(color.red() + color.blackBackground() + "Invalid selection. Please try again." + color.reset());
            }
        } while (choice != 'Y' && choice != 'y' && choice != 'N' && choice != 'n');

        if (choice == 'Y' || choice == 'y') {
            return true;
        } else if (choice == 'N' || choice == 'n') {
            System.out.println(color.green() + color.blackBackground() + "Have a nice day!" + color.reset());
            return false;
        }

        return false;
    }

    /**
     * Prints in a bunch of new lines to declutter the terminal
    */
    public static void resetTerminal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}