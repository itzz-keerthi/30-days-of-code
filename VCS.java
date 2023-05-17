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
	        ArrayList<Integer> a=new ArrayList<Integer>();
	        ArrayList<Integer> b=new ArrayList<Integer>();
	        ArrayList<Integer> ign_tracked=new ArrayList<Integer>();
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int k=sc.nextInt();
	        for(int i=0;i<m;i++){
	            a.add(sc.nextInt());
	        }
	        for(int j=0;j<k;j++){
	            b.add(sc.nextInt());
	        }
	        int max;
	        int l;
	        int msize=a.size();
	        int ksize=b.size();
	        if(msize>ksize){
	            max=msize;
	            for(l=0;l<max;l++){
	            if(b.contains(a.get(l))){
	                ign_tracked.add(a.get(l));
	            }
	        }
	        }
	        else{
	            max=ksize;
	            for(l=0;l<max;l++){
	            if(a.contains(b.get(l))){
	                ign_tracked.add(b.get(l));
	            }
	        }
	        }
	        ArrayList<Integer> total = new ArrayList<Integer>();
	        for(int d=0;d<a.size();d++){
	            total.add(a.get(d));
	        }
	        for(int d=0;d<b.size();d++){
	            total.add(b.get(d));
	        }
	        HashSet<Integer> totalset = new HashSet<>(total);
	        int untrack_unignored=0;
	        for(int s=1;s<=n;s++){
	            if(totalset.contains(s)){
	                continue;
	            }
	            else{
	                //System.out.println(s);
	                untrack_unignored+=1;
	            }
	        }
	        //System.out.println(totalset);
	       
	        //System.out.println(ign_tracked);
	        System.out.println(ign_tracked.size()+" "+untrack_unignored);
	        //System.out.println(ign_tracked.size());
	        //System.out.println(b);
	    }
	}
}
