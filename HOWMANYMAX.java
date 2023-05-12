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
		    /*ArrayList<Integer> zero=new ArrayList<Integer>();
		    ArrayList<Integer> one=new ArrayList<Integer>();*/
		    int n=sc.nextInt();
		    char[] arr = sc.next().toCharArray();
		    
		    /*for(int i=0;i<n;i++){
		        arr[i]=sc.next().toCharArray();
		    }*/
		    int c=0;
		    for(int j=0;j<n-2;j++){
		        if(arr[j]=='0' && arr[j+1]=='1'){
		            c++;
		        }
		    }
		    
		    if(arr[0]=='1')c++;
		    if(arr[n-2]=='0')c++;
		    System.out.println(c);
		    
		}
		
	}
}
