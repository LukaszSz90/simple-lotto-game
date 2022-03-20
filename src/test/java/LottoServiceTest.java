import lotto.game.LottoConfig;
import lotto.game.LottoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LottoServiceTest {

    private LottoService lottoService = new LottoService();
    private List<Integer> userNumbers = new ArrayList<>(List.of(1,2,3,4,5,6));

    @Test
    void should_size_of_random_number_list_is_equal_number_in_pool() {
        int expected = LottoConfig.NUMBERS_IN_POOL;
        int result = userNumbers.size();

        Assertions.assertEquals(expected,result);
    }

    @Test
    void should_size_of_random_number_list_is_not_equal_number_in_pool() {
        int expected = 5;
        int result = userNumbers.size();

        Assertions.assertNotEquals(expected,result);
    }

    @Test
    void should_user_guess_six_numbers() {
        List<Integer> winningNumbers = new ArrayList<>(List.of(1,2,3,4,5,6));
        int excepted = 6;
        int result = lottoService.checkGuessedNumbers(userNumbers,winningNumbers);

        Assertions.assertEquals(excepted,result);
    }

    @Test
    void should_user_guess_three_numbers() {
        List<Integer> winningNumbers = new ArrayList<>(List.of(1,2,3,24,25,26));
        int excepted = 3;
        int result = lottoService.checkGuessedNumbers(userNumbers,winningNumbers);

        Assertions.assertEquals(excepted,result);
    }

    @Test
    void should_user_guess_any_numbers() {
        List<Integer> winningNumbers = new ArrayList<>(List.of(21,22,23,24,25,26));
        int excepted = 0;
        int result = lottoService.checkGuessedNumbers(userNumbers,winningNumbers);

        Assertions.assertEquals(excepted,result);
    }

    @Test
    void should_user_guess_numbers_any_when_array_is_empty() {
        List<Integer> emptyWinningNumbers = new ArrayList<>();
        List<Integer> emptyUserNumberList = new ArrayList<>();
        List<Integer> winningNumbers = new ArrayList<>(List.of(1,2,3,24,25,26));
        int excepted = 0;
        int resultWhenWinningArayEmpty = lottoService.checkGuessedNumbers(userNumbers,emptyWinningNumbers);
        int resultWhenUserArrayEmpty = lottoService.checkGuessedNumbers(emptyUserNumberList,winningNumbers);
        int resultWhenBothArrayEmpty = lottoService.checkGuessedNumbers(emptyUserNumberList,emptyWinningNumbers);

        Assertions.assertEquals(excepted,resultWhenWinningArayEmpty);
        Assertions.assertEquals(excepted,resultWhenUserArrayEmpty);
        Assertions.assertEquals(excepted,resultWhenBothArrayEmpty);
    }
}
