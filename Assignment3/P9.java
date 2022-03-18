class P9
{
	public static void main(String args[])
	{
		char ch ='A';
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(" "+ch);
				ch++;
			}ch='A';
			System.out.println();
		}	
	}
}   

/*

     A
    A B
   A B C
  A B C D
 A B C D E
 
 */