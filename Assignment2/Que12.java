/*Q12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.*/
import java.util.Scanner;

class Que12
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		double avg =(n1+n2+n3)/3;
		
		System.out.print("Average =" +avg);
	}	
}