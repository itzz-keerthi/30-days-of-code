/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int sum=0;
		    for(int i=1;i<=n;i++)
		         sum+=i;
		    if(sum%2==0)
		        System.out.println(n);
		    else 
		        System.out.println(n-1);
		}
	}
}
