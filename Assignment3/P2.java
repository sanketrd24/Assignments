class P2
{
	public static void main(String args[])
	{
		char ch = 'A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch +" ");
				ch++;
			}System.out.println();
			
			ch ='A';
		}
	}
}
/*A
  A B
  A B C
  A B C D
  A B C D E*/