// TODO: Implement the BaccaratCard class in this file

public class BaccaratCard {

    public enum Rank {
        ACE('A'), TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'),
        EIGHT('8'), NINE('9'), TEN('T'), JACK('J'), QUEEN('Q'), KING('K');
    }
    
    private char symbol;

    privat Rank(char symbol) {
        this.symbol = symbol;

    }

    public char getSymbol() {
        return symbol;
    }



    public enum Suit {
        HEARTS('\u2665'), CLUBS('\u2663'), DIAMONDS('\u2666'), SPADES('\u2660');
    }

    private Rank rank;
    private Suit suit;

    public BaccaratCard (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

    }

    public Rank getRank() {
        return rank;
    }
    
    public Suit getSuit() {
        return suit;
    }

    public String toString() {

        return rank.getSymbol() + suit.getSymbol();
    }

    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }
        if (!(object instanceof BaccaratCard)) {
            return false;
        }

        BaccaratCard secondCard = (BaccaratCard) object;
        
        return this.rank == secondCard.rank;
        return this.suit == secondCard.suit; 
        
    }

    public int compareTo(BaccaratCard card) {

        int differentRank = this.rank.compareTo(card.rank);
        //Defining diffferentRank as an integer and defining it
        // as comparing the two cards 
        int differentSuit =this.suit.compareTo(card.suit);
        //Doing the same for the suit

        if (differentRank != 0) {
            return differentRank;
            //if differentRank is equal to 0 then the two ranks are equal. 
        }

        if (differentSuit != 0) {

            return this.suit.compareTo(card.suit);

        }


    } 
    public int Value() {
        int number;
        if (BaccaratCard == ACE) {
            number = 1;
        }
        else if (BaccaratCard == TWO) {
            number = 2;
        }
        else if (BaccaratCard == THREE) {
            number = 3;
        }
        else if (BaccaratCard == FOUR) {
            number = 4;
        }
         else if (BaccaratCard == FIVE) {
            number = 5;
        }
        else if (BaccaratCard == SIX) {
            number = 6;
        }
        else if (BaccaratCard == SEVEN) {
            number = 7;
        }
        else if (BaccaratCard == EIGHT) {
            number = 8;
        }
        else if (BaccaratCard == NINE) {
            number = 9;
        }
        else {
            number = 0;
        }

        return number;
    }

}
