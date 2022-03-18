class P13
{
	public static void main(String args[])
	{
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(ch);
				
			}ch++;
			System.out.println();
		}	
	}
}   
/*

    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE

*/