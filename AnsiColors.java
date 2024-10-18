/**
 * This object allows you to customize colors used in printing out text in the terminal.
 * Call to the color and/or background, and all text after it will be that color/background
 * After done with those colors, be sure to reset!
*/
public class AnsiColors {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_WHITE = "\u001B[37m";
    final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    final String ANSI_RED_BACKGROUND = "\u001B[41m";
    final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    /**
     * Resets the color of the text.
    */
    public String reset() {
        return ANSI_RESET;
    }

    /**
     * Changes the color of the text to black.
    */
    public String black() {
        return ANSI_BLACK;
    }
    /**
     * Changes the color of the text to red.
    */
    public String red() {
        return ANSI_RED;
    }
    /**
     * Changes the color of the text to green.
    */
    public String green() {
        return ANSI_GREEN;
    }
    /**
     * Changes the color of the text to yellow.
    */
    public String yellow() {
        return ANSI_YELLOW;
    }
    /**
     * Changes the color of the text to blue.
    */
    public String blue() {
        return ANSI_BLUE;
    }
    /**
     * Changes the color of the text to purple.
    */
    public String purple() {
        return ANSI_PURPLE;
    }
    /**
     * Changes the color of the text to cyan.
    */
    public String cyan() {
        return ANSI_CYAN;
    }
    /**
     * Changes the color of the text to white.
    */
    public String white() {
        return ANSI_WHITE;
    }

    /**
     * Changes the color of the background of the text to black.
    */
    public String blackBackground() {
        return ANSI_BLACK_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to red.
    */
    public String redBackground() {
        return ANSI_RED_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to green.
    */
    public String greenBackground() {
        return ANSI_GREEN_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to yellow.
    */
    public String yellowBackground() {
        return ANSI_YELLOW_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to blue.
    */
    public String blueBackground() {
        return ANSI_BLUE_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to purple.
    */
    public String purpleBackground() {
        return ANSI_PURPLE_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to cyan.
    */
    public String cyanBackground() {
        return ANSI_CYAN_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to white.
    */
    public String whiteBackground() {
        return ANSI_WHITE_BACKGROUND;
    }
}
