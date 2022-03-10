/*11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
class Que11
{
	public static void main(String args[])
	{	double r = 7.5;
		
		double p = 2*Math.PI*r;
		double a = Math.PI*r*r;
		System.out.println("Perimeter is = " +p);
		System.out.println("Area is = " +a);
	}
}