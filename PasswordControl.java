import java.util.Random;

public class PasswordControl {
    public String randomize() {
        Random rand = new Random();
        String[] passwords = new String[] { "Hocu$Pocu$10", "password2", "password3", "password4", "password5" }; // Enter passwords like shown, making sure not to mess with code.
        int randomPassword = rand.nextInt(0, 5); // Make sure second number here is the number of passwords you have available, otherwise some may not show up.
        return passwords[randomPassword];
    }
}
