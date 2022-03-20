package lotto.NumberRanomMachine;
import lotto.game.LottoConfig;
import java.util.List;

public class NumberCheckerMachine {

    public static boolean isNumberOutOfRange(int numberToCheck) {
        if (numberToCheck < LottoConfig.LOWER_RANGE || numberToCheck > LottoConfig.UPPER_RANGE) {
            System.out.println(LottoConfig.ERROR_INPUT_NUMBER);
        }
        return false;
    }

    public static boolean isNumberDuplicate(int numberToCheck, List<Integer> numberListInCoupon) {
        for (Integer numberFromList : numberListInCoupon) {
            if(numberToCheck == numberFromList) {
                System.out.println(LottoConfig.ERROR_INPUT_NUMBER);
                return true;
            }
        }
        return false;
    }


}
