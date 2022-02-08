package Blackjack;

public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    Suit(String suitName) {
        this.suitName = suitName;
    }

    private final String suitName;

    public String getSuitName() {
        return suitName;
    }
}
