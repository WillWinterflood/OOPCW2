public class Baccarat {
  // TODO: Implement your Baccarat simulation program here
  public static void main (String args[]) {
    Shoe shoe = new Shoe (6);
    shoe.shuffle();

    BaccaratHand banker = new BaccaratHand();
    BaccaratHand player = new BaccaratHand();

    for (int i = 0; i < 2; i++) {
      player.add(shoe.deal());
      banker.add(shoe.deal());

    }

    System.out.println("Player: " + player + " = " + player.value());
    System.out.println("Banker: " + banker + " = " + banker.value());

    if (player.isNatural() == true) {
      System.out.println("Player has a Natural");
    }
    else if (banker.isNatural() == true) {
      System.out.println("Banker has a Natural");
    }
    else if (banker.isNatural() == true && player.isNatural() == true && banker.value() > player.value()) {
      System.out.println("Both have a Natural. Banker wins");
    }

    if (banker.value() > player.value()) {
      System.out.println("Banker Wins!");
    }
    else if (player.value() > banker.value()) {
      System.out.println("Player Wins!");
    }

    

    System.out.println("Another round? (y/n): ");

    Scanner scanner = new Scanner(System.in);
    

    

  

  }
}
