import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		  int R1=sc.nextInt();
		  int R2=sc.nextInt();
		  int R3=sc.nextInt();
		  int R4=sc.nextInt();
		  int R5=sc.nextInt();
		  int z=R1+R2+R3+R4+R5;
		  if(z>=4)
		  System.out.println("yes");
		  else
		  System.out.println("no");
		    
		}

	}
}
