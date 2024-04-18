import java.util.*;
public class Pattern
{
	public static void  PrintPattern(int n)
	{	
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=n-i;j>1;j--)
			{	
				System.out.print("");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
public static void main(String args[])
{
	int n = 6;
	PrintPattern(n);
}
}