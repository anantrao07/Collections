package com.example.collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Random;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,Integer> ht = new Hashtable<Integer , Integer>();
		 ArrayList<Integer> a = new ArrayList<Integer>();
		 ArrayList<Integer> b = new ArrayList<Integer>();
		 Random r = new Random();
		 //r.nextInt(13);
		for(int i = 0 ; i<11; i++){
			a.add(r.nextInt(13));

			System.out.print(a.get(i)+ " " );
		
			
		}
		System.out.println(" ");
		for(int i = 0 ; i<11; i++){
		
			b.add(r.nextInt(13));
		
		
			System.out.print(b.get(i) + " ");
			
		}
		System.out.println(" ");
		
		for(int i = 0 ; i< a.size() ; i++){
			
			//System.out.print("value of i is "+ i);
			
			//int temp = a.get(i);
			int count = 0;
			for(int j = 0 ; j< b.size() ; j++){
				
				
				//System.out.println("value in temp  is " + temp);
				if(a.get(i) == b.get(j) || a.get(i)==a.get(j)){
					//b.contains()  == true){
					//System.out.println("value in a " + temp + " value in b is "+ b.get(i));
					count = count +1;
					
					
				}
				//2 9 2 12 6 12 12 12 5 2 3  
				//4 3 2 9 3 9 2 5 5 12 8 
				//System.out.println("value of j is "+ j);
			//System.out.println("frequency  of "+temp +" is "+ count);
			}
			ht.put(a.get(i), count);
		//	System.out.println("frequency  of "+a.get(i) +" is "+ count);
	
		}
		
		//{1 ,4,3,5,4,32,54,75,1,4,3,5,5};
		//int[] b = {10,20,30,40,1,2,3,4,5,6,7,6,5};
		//int count=0;
		
		/*for(int i = 0 ;i<= a.length-1;i++){
			int count = 0;
			for(int j = -1 ; j<b.length-1;j++){
			
				if(a[i] == a[i+1] || a[i] == b[i+1]){
					count= count +1;
					ht.put(a[i], count);
				
				}
			}
			
		}
		*/
	
		for(Entry<Integer, Integer> htable:ht.entrySet())
		{
			System.out.println("value of "+htable.getKey() + " " + htable.getValue());
		}
		}
	}


