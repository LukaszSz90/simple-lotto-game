import lotto.NumberRanomMachine.RandomNumberGenerator;
import lotto.game.LottoConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGeneratorTest {

    @Test
    void should_size_of_random_number_list_is_equal_number_in_pool() {
       int expected = LottoConfig.NUMBERS_IN_POOL;
       int result = RandomNumberGenerator.generateWinningNumbers().size();

        Assertions.assertEquals(expected,result);
    }

    @Test
    void should_size_of_random_number_list_is_not_equal_number_in_pool() {
        int expected = 5;
        int result = RandomNumberGenerator.generateWinningNumbers().size();

        Assertions.assertNotEquals(expected,result);
    }

    @Test
    void should_generated_the_same_numbers_in_two_arrays() {
        List<Integer> testList1 = new ArrayList<>();
        testList1 = RandomNumberGenerator.generateWinningNumbers();

        List<Integer> testList2 = new ArrayList<>();
        testList2 = RandomNumberGenerator.generateWinningNumbers();

        Assertions.assertNotEquals(testList1.get(0), testList2.get(0));

    }

    @Test
    void should_two_array_have_same_size() {
        List<Integer> testList1 = new ArrayList<>();
        testList1 = RandomNumberGenerator.generateWinningNumbers();

        List<Integer> testList2 = new ArrayList<>();
        testList2 = RandomNumberGenerator.generateWinningNumbers();

        int sizeFirstArray = testList1.size();
        int sizeSecondArray = testList2.size();

        Assertions.assertEquals(sizeFirstArray,sizeSecondArray);
    }

}
