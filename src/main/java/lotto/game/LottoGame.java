package lotto.game;
import lotto.game.LottoConfig;

import lotto.gameInterface.Game;

public class LottoGame implements Game {

    private LottoService lottoService = new LottoService();

    @Override
    public void play() {
        System.out.printf(LottoConfig.INTRODUCTION,
                LottoConfig.NUMBERS_IN_POOL,
                LottoConfig.LOWER_RANGE,
                LottoConfig.UPPER_RANGE);
        System.out.print(LottoConfig.NUMBER_INPUT);
        lottoService.fillUserNumbers();
        lottoService.fillWinningNumbers();
        lottoService.displayResult();
    }
}
