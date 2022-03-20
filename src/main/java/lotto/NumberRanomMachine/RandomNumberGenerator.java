package lotto.NumberRanomMachine;

import lotto.game.LottoConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {

    public static List<Integer> generateWinningNumbers() {
        List<Integer> numberListInCoupon = new ArrayList<>();
        Random random = new Random();
        int drawnNumber;
        int countDrawNumber = 0;

        while(countDrawNumber < LottoConfig.NUMBERS_IN_POOL) {
            drawnNumber = random.nextInt(LottoConfig.UPPER_RANGE - LottoConfig.LOWER_RANGE) + 1;

            if(!NumberCheckerMachine.isNumberOutOfRange(drawnNumber)) {
                if (!NumberCheckerMachine.isNumberDuplicate(drawnNumber,numberListInCoupon)){
                    numberListInCoupon.add(drawnNumber);
                    countDrawNumber++;
                }
            }
        }
        return numberListInCoupon;
    }
}
