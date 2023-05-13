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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
            float hack_votes=(p+q+r)/2;
            if(p+c+b>hack_votes || q+a+c>hack_votes || r+a+b>hack_votes || a+b+c>hack_votes)
            System.out.println("YES");
            else 
            System.out.println("NO");
		}
		
	}
}
