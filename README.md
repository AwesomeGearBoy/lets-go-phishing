### Welcome to *Who Wants To Be a Hacker*
*Who Wants to be a Hacker* is a game created in Java made to teach about how hackers can use phishing to guess a password of a user. Hackers can use personal information found in emails, social media, and other sources to guess at a password for a user. You, as someone who works in cybersecurity, will teach this by sending emails out to people in your workplace with either real or fake personal information. When the time comes, run this program on a computer and have people guess at what the password is. This game allows multiple passwords to be entered and randomly picked each time the game runs.

### Setting custom passwords
By default, the three passwords are `password1`, `password2`, and `password3`. To change this, go to the file called `PasswordControl.java`. It will look like below:

`import java.util.Random;                                                                                                                                       `
`                                                                                                                                                               `
`public class PasswordControl {                                                                                                                                 `
`    public String randomize() {                                                                                                                                `
`        Random rand = new Random();                                                                                                                            `
`        String[] passwords = new String[] { "password1", "password2", "password3" }; // Enter passwords like shown, making sure not to mess with code.         `
`        int randomPassword = rand.nextInt(0, 3); // Make sure second number here is the number of passwords you have available, otherwise some may not show up.`
`        return passwords[randomPassword];                                                                                                                      `
`    }                                                                                                                                                          `
`}                                                                                                                                                              `

You can mess with some of this code without daamaging the program (DO NOT RENAME THE FILE). Change your passwords, or add more by adding a comma, space, then your ext password. Change the second number in the `rand.nextInt()` to match with how many passwords you have, and boom. They will have a chance to show up in the program.

### In order to play the game, you need to compile the java file manually
- **Step 1:** Right click on your wallpaper and click `Open in Terminal`

- **Step 2:** Use the console commands `ls`, `cd`, and/or `cd..` to check what directory you are in, changing directory, and/or going back a directory respectively. You need to be in the `who-wants-to-be-a-hacker` folder located somewhere on your computer. Once you are in that directory, move on to **Step 3**.

- **Step 3:** Now that you are in the correct directory, you need to compile the Java files. do this by running the following in the console: `javac *.java`

- **Step 4:** Use `ls` to make sure that there are now `.class` files in your directory. If there are, this process worked and you are now ready to play. Unless you delete the `.class` files, you shouldn't ever need to do this process completely over again.

- **Step 5:** In order to run the file, use the console command `java Game`

These steps will allow for the program to run successfully.