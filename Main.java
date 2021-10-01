import java.util.Scanner;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Which would you like to choose.\n A) Adittion table\n B) Multiplication Table\n C) Logic table for boolean logic’s AND gate\n D) Logic table for boolean logic’s OR gate\n E) Pascal's triangle\n");

    String userChoice = input.nextLine();

    for(int i = 1; i<=10; i++) {
      if (userChoice.equalsIgnoreCase("a")) {
        System.out.print(i);
      }
    }


  }
}