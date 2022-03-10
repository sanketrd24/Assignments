/*Q13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

class Que13
{
	public static void main(String args[])
	{
		float w=5.6f;
		float h=8.5f;
		
		float a= w*h;
		float p= 2*(w+h);
		
		System.out.println("Area is " +w +"*" +h +" = " +a);
		System.out.println("Perimeter is 2*" +w +"*" +h +" = " +p);
	}
}