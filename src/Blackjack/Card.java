package Blackjack;

public class Card {

    private final Suit suit;
    private final Rank rank;
    private boolean faceUP;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        faceUP = false;
    }

    public String getSuit() {
        return suit.getSuitName();
    }

    public String printRank(){
        return rank.getRankName();
    }
    public int getRank() {
        return rank.getRankvals();
    }

    public String toString (){
        String str ="";
        if (faceUP) {
            str += rank.getRankName() + " of " + suit.getSuitName();
        }
        else {
            str= "Card is face down";
        }
        return str;
    }

    public void flip() {
        if (faceUP){
            faceUP = false;
        }else {
            faceUP = true;
        }
    }
}
