package Blackjack;

import java.util.ArrayList;

public class Hand {
    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand() {
    }

    protected ArrayList<Card> cards;
    public void clearCards(){
        cards.clear();

    }
    public void addCards(Card card){
        cards.add(card);
    }
    public String showHand(){
        String str = "";
        for (Card c: cards){
            str+= c.toString();
        }
        return str;
    }
    public boolean giveCard(Card card, Hand nextHand){
        if(!cards.contains(card)) {
            return false;
        }
        else {
            cards.remove(card);
            nextHand.addCards(card);
            return true;
        }
    }
    public int points(){
        int total = 0;
        boolean isAce = false;
        for (int i =0; i < cards.size(); i++){
            total+= cards.get(i).getRank();
            if (cards.get(i).printRank().equals("Ace")){
                isAce = true;
            }
            if (isAce && total <= 11){
                total+= 10;
            }
        }
        return total;
    }
}
