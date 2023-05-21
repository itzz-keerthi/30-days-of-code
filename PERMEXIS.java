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
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int no=0;
		    for(int j=1;j<n;j++){
		        int diff= arr[j-1]-arr[j];
		        if(diff<0){
		            diff= diff*(-1);
		        }
		        if(diff>1) no++;
		    }
		    if(no==0) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
