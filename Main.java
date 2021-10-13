import java.util.Scanner;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//main question
    System.out.print("Which would you like to choose.\n A) Addition table\n B) Multiplication Table\n C) Logic table for boolean logic’s AND gate\n D) Logic table for boolean logic’s OR gate\n E) Pascal's triangle\n");

    String userChoice = input.nextLine();
   
//addition table  
    if (userChoice.equalsIgnoreCase("a")) { 
      for(int i = 0; i<=10; i++) {
        for(int j = 0; j<11; j++){
          System.out.print(i*10 + j + "\t");
        }
        System.out.print("\n");//spacing
      }
    }
//Multiplication table
    else if (userChoice.equalsIgnoreCase("b")) {
      int [][] twoArray = new int [11][11]; 
      for(int i = 1; i<11; i++){
        for(int o = 1; o<11; o++)
        {
          twoArray[i][o] = i * o;// math part
          System.out.print(twoArray[i][o] + "\t");
        }
        System.out.println();// so it's a table not a long line
      }
    }
// logic or gate
    boolean question1, question2, ans;
    if (userChoice.equalsIgnoreCase("d")){
      System.out.println("Condition 1\tCondition2\tAND");
      for(int i =0; i<=1; i++){
        for(int o=0; o<=1; o++){
          question1 = (i== 1);
          question2 = (o== 1);
          ans = (question1 == true || question2 == true);
          System.out.println(question1+ "\t\t" + question2+ "\t\t" + ans);
        }
      }
    }    
   

  }
}