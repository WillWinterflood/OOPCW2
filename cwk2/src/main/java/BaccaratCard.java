// TODO: Implement the BaccaratCard class in this file

public class BaccaratCard {

    private Card.Rank rank;
    private Card.Suit suit;

    public BaccaratCard (Card.Rank rank, Card.Suit suit) {
        this.rank = rank;
        this.suit = suit;

    }

    public Card.Rank getRank() {
        return rank;
    }

    public Card.Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;

    }

    public int value() {
        if (rank == Card.Rank.ACE) {
            return 1;
        }
        else if (rank == Card.Rank.TWO) {
            return 2;
        }
        else if (rank == Card.Rank.THREE) {
            return 3;
        }
        else if (rank == Card.Rank.FOUR) {
            return 4;
        }
        else if (rank == Card.Rank.FIVE) {
            return 5;
        }
        else if (rank == Card.Rank.SIX) {
            return 6;
        }
        else if (rank == Card.Rank.SEVEN) {
            return 7;
        }
        else if (rank == Card.Rank.EIGHT) {
            return 8;
        }
        else if (rank == Card.Rank.NINE) {
            return 9;
        }
        else {
            return 0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
    }

}
