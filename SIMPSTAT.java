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
		    ArrayList<Integer> num=new ArrayList<Integer>();
		    ArrayList<Integer> res =new ArrayList<Integer>();
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    for(int i=0;i<n;i++){
		        num.add(sc.nextInt());
		    }
		    Collections.sort(num);
		    int len=num.size();
		    int range=len-k;
		    for(int j=k;j<range;j++){
		       res.add(num.get(j));
		    }
		    
		    //System.out.println(res);
		    double sum=0;
		    for(int l=0;l<res.size();l++){
		        sum+=res.get(l);
		    }
		    double avg=sum/res.size();
		    System.out.println(String.format("%.6f",avg));
		}
	}
}
