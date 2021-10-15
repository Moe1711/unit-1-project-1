import java.util.Scanner;
import java.util.*;
import java.io.*;


class Main {
  public static final String TEXT_RESET = "\u001B[0m";
  public static final String RED = "\u001B[31m";
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//main question
    System.out.print("Which would you like to choose.\n A) Addition Table\n B) Multiplication Table\n C) Logic table for boolean logic’s AND gate\n D) Logic table for boolean logic’s OR gate\n E) Pascal's triangle\n F) Remainder Table\n");

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
    double square;
    if (userChoice.equalsIgnoreCase("b")) {
      int [][] twoArray = new int [11][11]; 
      for(int i = 1; i<11; i++){
        for(int o = 1; o<11; o++)
        {
          twoArray[i][o] = i * o;// math part
          square = Math.sqrt(twoArray[i][o]);
          square = (Math.floor(square)*Math.floor(square));
          if (square == twoArray[i][o]){
            System.out.print(RED);
          }
          
          System.out.print(twoArray[i][o] + "\t" +TEXT_RESET);
          
        }
        System.out.println();// so it's a table not a long line
      }
    }

// logic or gate
    int n;//declaring stuff
    boolean [] rowA = new boolean [4];
    boolean [] rowB = new boolean [4];
    boolean ans;
    if (userChoice.equalsIgnoreCase("d")){
      n = 0;
      System.out.println("Condition 1\tCondition2\tOR");
      for(int i =0; i<=1; i++){
        for(int o=0; o<=1; o++){
          rowA [n] = (i== 1);
          rowB [n] = (o== 1);
          ans = (rowA[n] == true || rowB[n] == true);//or gate
          System.out.println(rowA [n]+ "\t\t" + rowB[n]+ "\t\t" + ans);
        }
      }
    }   

    //AND gate 
    boolean answer;
    if (userChoice.equalsIgnoreCase("c")){
      n =0;
      System.out.println("Condition 1\tCondition2\tAND");
      for(int i =0; i<=1; i++){
        for(int o=0; o<=1; o++){
          rowA[n] = (i== 1);
          rowB[n] = (o== 1);
          answer = (rowA[n] == true && rowB[n] == true);//and gate
          System.out.println(rowA[n]+ "\t\t" + rowB[n]+ "\t\t" + answer);
        }
      }
    }  

    //remainder table
    
    if (userChoice.equalsIgnoreCase("f")) {
      int [][] twoArray = new int [11][11]; 
      for(int m =0; m<11; m++){
        for(int i = 0; i<11; i++){
          if(m==0){
            twoArray [0][i] = i;
          }
          else if (i==0){
            twoArray[m][0] = m; 
          }
          else {
            twoArray [m][i] = twoArray[0][i]%twoArray[m][0];
          }
          System.out.print(twoArray[m][i] + "\t");
        

         }
        System.out.println();// so it's a table not a long line
      }
    }  

  }
}