package com.greatlearning.GroupAssignment_2.main;
import com.greatlearning.GroupAssignment_2.model.*;

import java.util.*;

public class Skyscraper 
{

	public static void main(String[] args)  
	 
    {
 
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the total no of floors in the building:");
 
     int n=sc.nextInt();
 
     int max=n;
 
     Queue<Integer> queue=new PriorityQueue<Integer>(new ValueComparator());
 
     int disks[]=new int[n];
 
     for(int i=0;i<n;i++)
     {
    	
     
      System.out.println("Enter the floor size given on day : "+(i+1));
      disks[i]=sc.nextInt();
      
     }
     
     System.out.println("\n\n*************      OUTPUT    ************5\n\n");
     
     for(int i=0;i<n;i++) {
      queue.add(disks[i]);
      System.out.println("Day "+(i+1)+":");
      while(!queue.isEmpty() && queue.peek()==max)
 
        {
   

          System.out.print(queue.poll() + " ");
 
          max--;
    

        }
 

    	  System.out.println();
 
      }
 
   }
 
	
	
}
