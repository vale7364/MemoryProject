package recources;

public class Card {
    private int value;
    private boolean revealed;
    private boolean matched;

    public Card(int value) {
        this.value = value;
        this.revealed = false;
        this.matched = false;
    }

    public int getValue() {
        return value;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public void reset() {
        this.revealed = false;
    }
}
