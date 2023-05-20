/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int msg=arr[0];
		    int count=0;
		    for(int j=1;j<n-1;j++){
		        if(arr[j]!=arr[j-1] || arr[j]!=arr[j+1])
		            count++;
		    }
            if(arr[0]!=arr[1]) 
                count++;
            if(arr[n-1]!=arr[n-2]) 
                count++;
		    System.out.println(count);
		}
	}
}
