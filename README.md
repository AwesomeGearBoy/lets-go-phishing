### Welcome to *Let's Go Phishing*
*Let's Go Phishing* is a game created in Java made to teach about how hackers can use phishing to guess a password of a user. Hackers can use personal information found in emails, social media, and other sources to guess at a password for a user. You, as someone who works in cybersecurity, will teach this by sending emails out to people in your workplace with either real or fake personal information. When the time comes, run this program on a computer and have people guess at what the password is. This game allows multiple passwords to be entered and randomly picked each time the game runs, or chosen within the program.

The command `/new password` will restart the game and allow you to choose a new password at any time during actual gameplay.

### Setting custom passwords
By default, the three passwords are `password1`, `password2`, and `password3`. To change this, go to the file called `PasswordControl.java`. It will look like below:

____________________________________________________________________________________________________________________________________________________________________
import java.util.Random;
import java.util.Scanner;

public class PasswordControl {
    String[] passwords = new String[] { "password1", "password2", "password3", "password4", "password5" }; // Enter passwords like shown, making sure not to mess with code.
    int bound = 5; // Make sure number here is the number of passwords you have available, otherwise some may not show up.
}
____________________________________________________________________________________________________________________________________________________________________

You can mess with some of this code without damaging the program (DO NOT RENAME THE FILE). Change your passwords, or add more by adding a comma, space, then your extra password. Change the number in `int bound = 5` to match with how many passwords you have, and boom. They will have a chance to show up in the program (if and when it is chosen that it is random which password is chosen).

### In order to play the game, you need to compile the java file manually
- **Step 1:** Right click on your wallpaper and click `Open in Terminal`

- **Step 2:** Use the console commands `ls`, `cd`, and/or `cd..` to check what directory you are in, changing directory, and/or going back a directory respectively. You need to be in the `who-wants-to-be-a-hacker` folder located somewhere on your computer. Once you are in that directory, move on to **Step 3**.

- **Step 3:** Now that you are in the correct directory, you need to compile the Java files. do this by running the following in the console: `javac *.java`

- **Step 4:** Use `ls` to make sure that there are now `.class` files in your directory. If there are, this process worked and you are now ready to play. Unless you delete the `.class` files, you shouldn't ever need to do this process completely over again.

- **Step 5:** In order to run the file, use the console command `java Game`

These steps will allow for the program to run successfully.

### Brief list of all commands you will need and what they do

`li` - Lists what is inside of the directory you are in (files, other directories, etc.). Used to tell where you are.

`cd directory-name` - Stands for "Change Directory." This allows you to proceed forward to whatever directory. *Hint: Press `TAB` to automatically finish the directory's name while typing. Makes it a lot easier.*

`cd..` - Takes you back a directory.

`javac FileName.java` - Stands for "Java Compile." Use to compile the java files so that te computor can read them. *Hint: The fastest way to compile all files at once is like this: `javac *.java`. That will compile all java files in a directory.*

`java FileName` - Runs a **compiled** java file.