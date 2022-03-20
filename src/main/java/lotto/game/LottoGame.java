package lotto.game;
import lotto.game.LottoConfig;

import lotto.gameInterface.Game;

public class LottoGame implements Game {

    private LottoService lottoService = new LottoService();

    @Override
    public void play() {
        System.out.println(LottoConfig.INTRODUCTION);


    }
}
