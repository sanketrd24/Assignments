/*Q5. Write a Java program that takes two numbers 
as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.util.Scanner;

class Que05
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Input first number: ");
  int n1 = sc.nextInt();
  
  System.out.print("Input second number: ");
  int n2 = sc.nextInt();
  
  System.out.print(n1 +"*" +n2 +"=" +(n1*n2));
  
 }
}