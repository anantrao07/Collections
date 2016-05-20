package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;


//This class displays the use of hashtable (stroing names of five students and their marks) and sorting the values 
//in ascending order of their marks.
public class HashTable {

	public void sort(Hashtable<Integer, String> ht){
		
		
ArrayList<Integer> marks  = Collections.list(ht.keys());
		
		Collections.sort(marks);
		
		for(int sorted : marks){
			
			
			System.out.println("marks sorted are "+(sorted)+ " "+ ht.get(sorted));// + " "+ sorted.getValue());
		}
		
	}
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		
		Hashtable<Integer, String> names = new Hashtable<Integer, String>();
		System.out.println("enter  5 names of your choice  and their names");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<5 ; i++){
			
			String name = sc.next();
			int marks = sc.nextInt();
			
			names.put(marks, name);
		
			
			//names.(i, names);
			
		}
		
		ArrayList<Integer> marks  = Collections.list(names.keys());
		
		Collections.sort(marks);
		
		ht.sort(names);
		
	}

}
