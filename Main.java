import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int myNumber = (int)(Math.random()*100);
    int userNumber = 0;
    while(myNumber > 0){
      System.out.println("Guess my number");
      userNumber = sc.nextInt();
      if(userNumber == myNumber){
        System.out.println("YAHOO.. CORRECT NUMBER..!!");
        break;
      }
      else if(userNumber > myNumber){
        System.out.println("your number is too big..");
      }
      else if(userNumber < myNumber){
        System.out.println("your number is too low..");
      }
    }
    System.out.println("My number was " + myNumber);
  }
}
