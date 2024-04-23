// TODO: Implement the BaccaratHand class in the file

public class BaccaratHand extends CardCollection {
    
    public int size() {
      return cards.size();
    }

    public int value() {
        int total = 0;
        for (int i = 0; i < cards.size(); i++) {

            BaccaratCard card = (BaccaratCard) cards.get(i);
            total += card.getValue();
        }
        return total % 10;
    }
}

