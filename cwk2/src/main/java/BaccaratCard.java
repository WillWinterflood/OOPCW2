// TODO: Implement the BaccaratCard class in this file

public class BaccaratCard extends Card {
    public BaccaratCard (Rank rank, Suit suit) {
        super(rank, suit);
    }
    
    public int Value() {
        int number;

        switch (getRank()) {
            case ACE:
                number = 1;
                break;
            case TWO:
                number = 2;
                break;
            case THREE:
                number = 3;
                break;
            case FOUR:
                number = 4;
                break;
            case FIVE:
                number = 5;
                break;
            case SIX:
                number = 6;
                break;
            case SEVEN:
                number = 7;
                break;
            case EIGHT:
                number = 8;
                break;
            case NINE:
                number = 9;
                break;
            default:
                number = 0;
                break;
        }
        return number;
    }

}
