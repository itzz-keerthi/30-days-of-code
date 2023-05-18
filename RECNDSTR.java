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
		    String s=sc.next();
		    int n=s.length();
		    if(n<=2){
		        System.out.println("YES");
		    }
		    else{
		        String RS= s.charAt(n-1)+s.substring(0,n-1);
		        String LS= s.substring(1)+s.charAt(0);
		        if(RS.equals(LS)){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		}
	}
}
