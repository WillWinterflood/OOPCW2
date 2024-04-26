// TODO: Implement the BaccaratHand class in the file

public class BaccaratHand extends CardCollection {
    
    public int size() {
      return cards.size();
    }
  
    public String toString() {
        String cardRep = "";
        for (int i = 0; i < cards.size(); i++) {
            cardRep += cards.get(i).toString();
            if (i < cards.size()) {
                cardRep += " ";
            }
        }
        return cardRep.trim();
    }

    public int value() {
        int total = 0;
        for (int i = 0; i < cards.size(); i++) {

            BaccaratCard card = (BaccaratCard) cards.get(i);
            total += card.value();
        }
        return total % 10;
    }

    public boolean isNatural() {
        int total = value();
        if (cards.size() == 2) {
            if (total == 8 || total == 9) {
                return true;
            }
            else {
                return false;
            }
        }

        else {
            return false;
        }

    }
}

