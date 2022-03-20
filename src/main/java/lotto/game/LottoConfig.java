package lotto.game;

public class LottoConfig {
    public static final int LOWER_RANGE = 1;
    public static final int UPPER_RANGE = 49;
    public static final int NUMBERS_IN_POOL = 6;

    public static final String INTRODUCTION = "-----LOTTO-----\n" +
            "Pict %d numbers within range %d - %d\n";
    public static final String NUMBER_INPUT = "Please enter number: ";
    public static final String ERROR_INPUT_NUMBER = "Number is out of range, or is duplicated.\n" +
            "Please try again: ";
    public static final String DISPLAY_NUMBERS = "%s numbers: ";
    public static final String DISPLAY_RESULT = "You have guessed %d numbers.\n";
}
