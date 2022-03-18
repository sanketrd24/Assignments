class P12
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}	
	}
}   
/*

    1
   222
  33333
 4444444
555555555

*/