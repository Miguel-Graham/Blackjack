package Blackjack;

import java.util.Random;

public class Deck extends Hand{
    Random random = new Random();

    public void populate(){
        for (Suit suit: Suit.values()){
            for(Rank rank:Rank.values()){
                Card card = new Card(suit, rank);
                card.flip();
                this.addCards(card);

            }
        }

    }
    public void shuffle(){
        for (int i = cards.size(); i>0; i--){
             int pick = random.nextInt(i);
             Card randomCard = cards.get(pick);
             Card last = cards.get(i);
             cards.set(pick, last);
        }
    }
}
