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
		    ArrayList<Integer> res=new ArrayList<Integer>();
		    int count=0;
		    int n= sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        if(res.size()==7){
		            break;
		        }
		        else {
		        if(arr[j]>=1 && arr[j]<=7)
		        res.add(arr[j]);
		        }
		        count++;
		    }
		    //System.out.print(res);
		    System.out.println(count);
		}
	}
}
