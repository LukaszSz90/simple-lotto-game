package lotto;

import lotto.game.LottoGame;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        LottoGame lottoGame = new LottoGame();
        lottoGame.play();
    }
}
