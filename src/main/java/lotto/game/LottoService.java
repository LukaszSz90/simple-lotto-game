package lotto.game;

import lotto.NumberRanomMachine.NumberCheckerMachine;
import lotto.NumberRanomMachine.RandomNumberGenerator;

import java.util.*;

public class LottoService {
    private List<Integer> userNumbersList;
    private List<Integer> winningNumbersList;

    public LottoService() {
        this.userNumbersList = new ArrayList<>();;
    }

    //to test
    public LottoService(List<Integer> userNumbersList) {
        this.userNumbersList = userNumbersList;
    }

    public void fillUserNumbers() {
        Scanner input = new Scanner(System.in);
        int userNumber;
        int countUserInput = 0;

        while (countUserInput < LottoConfig.NUMBERS_IN_POOL) {
            userNumber = input.nextInt();
            if(!NumberCheckerMachine.isNumberOutOfRange(userNumber)) {
                if (!NumberCheckerMachine.isNumberDuplicate(userNumber,userNumbersList)){
                    userNumbersList.add(userNumber);
                    countUserInput++;
                }
            }
        }
    }

    public int checkGuessedNumbers(List<Integer> userNumbers, List<Integer> winningNumbers) {
        int countGuessedNumbers = 0;
        try {
            for (int i = 0; i < LottoConfig.NUMBERS_IN_POOL; i++) {
                for (int j = 0; j < LottoConfig.NUMBERS_IN_POOL; j++) {
                    if(userNumbers.get(i).equals(winningNumbers.get(j))) {
                        countGuessedNumbers++;
                    }
                }
            }
        }
        catch (IndexOutOfBoundsException ex) {
            return 0;
        }
        return countGuessedNumbers;
    }

    public void fillWinningNumbers() {
        winningNumbersList = RandomNumberGenerator.generateWinningNumbers();
    }


    private void displayNumbers(List<Integer> numbersToDisplay, String player) {
        System.out.printf(LottoConfig.DISPLAY_NUMBERS,player);
        for (Integer number : numbersToDisplay) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void displayResult() {
        Collections.sort(userNumbersList);
        Collections.sort(winningNumbersList);
        displayNumbers(userNumbersList,"Player");
        displayNumbers(winningNumbersList,"Winning");
        int guessNumbers = checkGuessedNumbers(userNumbersList,winningNumbersList);
        System.out.printf(LottoConfig.DISPLAY_RESULT, guessNumbers);
    }

    public List<Integer> getUserNumbersList() {
        return userNumbersList;
    }
}
