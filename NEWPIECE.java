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
		    int count=0;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		     if(a==p && b==q){
		        count=0;
		    }
		    else if((a+b)%2 == (p+q)%2){
		        count=2;
		    }
		    else{
		        count=1;
		    }
		    System.out.println(count);
		}
	}
}
