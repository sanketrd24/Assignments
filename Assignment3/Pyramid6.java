class Pyramid6
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			for(int j=i;j<=8;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}   
/*
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
*/
