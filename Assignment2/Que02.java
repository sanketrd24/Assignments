//2.Write a Java program to print the sum of two numbers.
//Test Data: 74 + 36
import java.util.Scanner;
class Que02
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter two numbers");
   int n1 = sc.nextInt();
   int n2 = sc.nextInt();
   
   System.out.print("Sum = "+(n1+n2));
   
  }
}