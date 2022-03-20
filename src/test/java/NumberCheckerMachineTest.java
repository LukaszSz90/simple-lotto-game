import lotto.NumberRanomMachine.NumberCheckerMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberCheckerMachineTest {

    private List<Integer> numberList = new ArrayList<Integer>(
            List.of(2,19,25,33,39,47)
    );


    @Test
    void should_number_is_duplicated() {
        int numberToCheck = 19;
        boolean result = NumberCheckerMachine
                .isNumberDuplicate(numberToCheck,numberList);
        Assertions.assertTrue(result);
    }

    @Test
    void should_number_is_not_duplicate() {
        int numberToCheck = 1;
        boolean result = NumberCheckerMachine
                .isNumberDuplicate(numberToCheck,numberList);
        Assertions.assertFalse(result);
    }

    @Test
    void should_number_is_duplicated_when_list_is_empty() {
        int numberToCheck = 2;
        List<Integer> nullList = new ArrayList<>();

        boolean result = NumberCheckerMachine
                .isNumberDuplicate(numberToCheck,nullList);
        Assertions.assertFalse(result);
    }

    @Test
    void should_number_in_range() {
        int numberToCheck = 30;
        boolean result = NumberCheckerMachine
                .isNumberOutOfRange(numberToCheck);
        Assertions.assertFalse(result);
    }

    @Test
    void should_number_out_of_range() {
        int numberToCheck = 100;
        boolean result = NumberCheckerMachine
                .isNumberOutOfRange(numberToCheck);
        Assertions.assertTrue(result);
    }



}
