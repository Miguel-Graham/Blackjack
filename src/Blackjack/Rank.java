package Blackjack;

public enum Rank {
    ACE(1, "Ace"), DEUCE(2, "Deuce"), THREE(3, "3"),
    FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"),
    SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"),
    TEN(10, "10"), JACK(10, "Jack"), QUEEN(10, "Queen"),
    KING(10, "King");

    Rank(int rankvals, String rankName) {
        this.rankvals = rankvals;
        this.rankName = rankName;
    }

    private final int rankvals;
    private final String rankName;

    public int getRankvals() {
        return rankvals;
    }
    public String getRankName(){
        return rankName;
    }
}
