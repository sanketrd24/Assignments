/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/
import java.util.Scanner;
class Que7
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter number to print its table : ");
	int n1 = sc.nextInt();
	int i=1;
	do
	{
	 System.out.println(n1+"*" +i +" = " +(n1*i));
	 i++;
	}while(i<=10);
   
  }
}