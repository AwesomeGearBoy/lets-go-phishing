import java.util.Random;

public class PasswordControl {
    public String randomize() {
        Random rand = new Random();
        String[] passwords = new String[] { "password1", "password2", "password3" }; // Enter passwords like shown, making sure not to mess with code.
        int randomPassword = rand.nextInt(0, 2); // Make sure second number here is one less than the number of passwords you have available.
        return passwords[randomPassword];
    }
}
