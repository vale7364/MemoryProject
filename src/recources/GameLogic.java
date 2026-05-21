package recources;

import java.util.*;

public class GameLogic {
    private Card[] cards;
    private int firstCardIndex = -1;
    private int secondCardIndex = -1;
    private boolean isChecking = false;
    private int matchedPairs = 0;
    private Random random;

    public GameLogic() {
        this.random = new Random();
        initializeGame();
    }

    private void initializeGame() {
        cards = new Card[12];
        
        // Create 6 pairs (values 1-6, each appearing twice)
        int[] values = new int[12];
        int index = 0;
        for (int i = 1; i <= 6; i++) {
            values[index++] = i;
            values[index++] = i;
        }
        
        // Shuffle the values
        shuffle(values);
        
        // Create cards with shuffled values
        for (int i = 0; i < 12; i++) {
            cards[i] = new Card(values[i]);
        }
        
        matchedPairs = 0;
    }

    private void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public Card getCard(int index) {
        if (index >= 0 && index < cards.length) {
            return cards[index];
        }
        return null;
    }

    public boolean handleCardClick(int index) {
        if (isChecking || index < 0 || index >= cards.length) {
            return false;
        }

        Card card = cards[index];
        
        // Can't click on already matched or revealed cards
        if (card.isMatched() || card.isRevealed()) {
            return false;
        }

        card.setRevealed(true);

        if (firstCardIndex == -1) {
            // First card clicked
            firstCardIndex = index;
            return true;
        } else if (secondCardIndex == -1) {
            // Second card clicked
            secondCardIndex = index;
            isChecking = true;
            return true;
        }

        return false;
    }

    public int checkMatch() {
        if (firstCardIndex == -1 || secondCardIndex == -1 || !isChecking) {
            return 0; // No check needed
        }

        Card card1 = cards[firstCardIndex];
        Card card2 = cards[secondCardIndex];

        int result;
        if (card1.getValue() == card2.getValue()) {
            // Match found
            card1.setMatched(true);
            card2.setMatched(true);
            matchedPairs++;
            result = 1; // Match
        } else {
            // No match - hide cards
            card1.setRevealed(false);
            card2.setRevealed(false);
            result = -1; // No match
        }

        // Reset for next turn
        firstCardIndex = -1;
        secondCardIndex = -1;
        isChecking = false;

        return result;
    }

    public boolean isGameWon() {
        return matchedPairs == 6; // 6 pairs
    }

    public boolean isChecking() {
        return isChecking;
    }

    public void resetGame() {
        initializeGame();
        firstCardIndex = -1;
        secondCardIndex = -1;
        isChecking = false;
    }

    public int getMatchedPairs() {
        return matchedPairs;
    }
}
