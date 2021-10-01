import java.util.Scanner;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//main question
    System.out.print("Which would you like to choose.\n A) Adittion table\n B) Multiplication Table\n C) Logic table for boolean logic’s AND gate\n D) Logic table for boolean logic’s OR gate\n E) Pascal's triangle\n");

    String userChoice = input.nextLine();
    
//addition table    
    for(int i = 0; i<=10; i++) {
      if (userChoice.equalsIgnoreCase("a")) {
        System.out.print( i + " \t");
          for(int j = 1; j<10; j++){
           System.out.print( i + "\t");
          }
        System.out.print("\n");//spacing
      }
    }
   

  }
}