/**
 * This object allows you to customize colors used in printing out text in the terminal by using ANSI Color Codes.
 * <p>
 * Call to the color and/or background, and all text after it will be that color/background.
 * <p>
 * After done with those colors, be sure to reset!
*/
public class AnsiColors {
    /**
     * Resets the color of the text.
    */
    public String reset() {
        private final String ANSI_RESET = "\u001B[0m";
        return ANSI_RESET;
    }

    /**
     * Changes the color of the text to black.
    */
    public String black() {
        private final String ANSI_BLACK = "\u001B[30m";
        return ANSI_BLACK;
    }
    /**
     * Changes the color of the text to red.
    */
    public String red() {
        private final String ANSI_RED = "\u001B[31m";
        return ANSI_RED;
    }
    /**
     * Changes the color of the text to green.
    */
    public String green() {
        private final String ANSI_GREEN = "\u001B[32m";
        return ANSI_GREEN;
    }
    /**
     * Changes the color of the text to yellow.
    */
    public String yellow() {
        private final String ANSI_YELLOW = "\u001B[33m";
        return ANSI_YELLOW;
    }
    /**
     * Changes the color of the text to blue.
    */
    public String blue() {
        private final String ANSI_BLUE = "\u001B[34m";
        return ANSI_BLUE;
    }
    /**
     * Changes the color of the text to purple.
    */
    public String purple() {
        private final String ANSI_PURPLE = "\u001B[35m";
        return ANSI_PURPLE;
    }
    /**
     * Changes the color of the text to cyan.
    */
    public String cyan() {
        private final String ANSI_CYAN = "\u001B[36m";
        return ANSI_CYAN;
    }
    /**
     * Changes the color of the text to white.
    */
    public String white() {
        private final String ANSI_WHITE = "\u001B[37m";
        return ANSI_WHITE;
    }

    /**
     * Changes the color of the background of the text to black.
    */
    public String blackBackground() {
        private final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        return ANSI_BLACK_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to red.
    */
    public String redBackground() {
        private final String ANSI_RED_BACKGROUND = "\u001B[41m";
        return ANSI_RED_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to green.
    */
    public String greenBackground() {
        private final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        return ANSI_GREEN_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to yellow.
    */
    public String yellowBackground() {
        private final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        return ANSI_YELLOW_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to blue.
    */
    public String blueBackground() {
        private final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        return ANSI_BLUE_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to purple.
    */
    public String purpleBackground() {
        private final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        return ANSI_PURPLE_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to cyan.
    */
    public String cyanBackground() {
        private final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        return ANSI_CYAN_BACKGROUND;
    }
    /**
     * Changes the color of the background of the text to white.
    */
    public String whiteBackground() {
        private final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        return ANSI_WHITE_BACKGROUND;
    }
}
