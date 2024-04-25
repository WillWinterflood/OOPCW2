// TODO: Implement the Shoe class in this file

import java.util.Collections;

public class Shoe extends CardCollection {

    public Shoe(int NoOfDecks) throws CardException {

        if (NoOfDecks != 6 && NoOfDecks != 8) {
            throw new CardException("Number of decks must be either 6 or 8");

        }
        else {
            for (int i = 0; i < BaccaratCard.Suit.values().length; i++) {

                BaccaratCard.Suit suit =BaccaratCard.Suit.values() [i];

                for (int x = 0; x < BaccaratCard.Suit.values().length; x++) {

                    BaccaratCard.Rank rank = BaccaratCard.Rank.values() [x];
                    cards.add(new BaccaratCard(rank,suit));
                }
            }
        }
    }
    public void shuffle() {
        Collections.shuffle(cards);
    }

    public BaccaratCard deal() throws CardException {
        if (cards.isEmpty()) {
            throw new CardException ("Shoe is empty");
        }
        return (BaccaratCard) cards.remove(0);
        
    }
}