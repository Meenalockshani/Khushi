import java.util.Scanner;

  public class PosNeg {

   public static void main(String[] args) { 

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = input.nextInt();

    if( n == 0)
    { System.out.println("IT is  zero"); }
    else if (n > 0)
    { System.out.println("IT is positive"); }
    else 
    { System.out.println("IT is negative"); }


  }
 }
