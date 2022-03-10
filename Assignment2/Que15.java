/*15. Write a Java program to swap two variables.*/
import java.util.Scanner;
class Que15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers: ");
		System.out.print("n1: ");
		int n1 = sc.nextInt();
		
		System.out.print("n2: ");
		int n2 = sc.nextInt();
		
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping: n1=" +n1 +" & n2=" +n2);
	
		
		
		
	}
}