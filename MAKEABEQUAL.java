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
	        long sum1=0,sum2=0;
	        long a[]=new long[n];
	        long b[]=new long[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextLong();	        
	        }
	        for(int j=0;j<n;j++){
	            b[j]=sc.nextLong();
	            if(b[j]>a[j]){
	                sum1=sum1+(b[j]-a[j]);
	            }
	            else{
	                sum2=sum2+(a[j]-b[j]);
	            }
	        }
	        if(sum1==sum2){
	            System.out.println(sum1);
	        }
	        else{
	            System.out.println("-1");
	        }
	    }
	    
	}
}
