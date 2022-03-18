class P18
{
	public static void main(String args[])
	{	
		
		for(int i=1;i<=5;i++)
		{  
			char ch='A';
			for(int j=5;j>=i;j--)
			{
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
		}
	}
}
/*	A B C D E
	A B C D
	A B C
	A B
	A*/