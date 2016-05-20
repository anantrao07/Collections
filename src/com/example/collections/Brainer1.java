package com.example.collections;

import java.util.ArrayList;

public class Brainer1 {
	ArrayList<Integer> common = new ArrayList<Integer>() ;
	public ArrayList<Integer> intersection(int a[] , int b[]){
		
		int count =0;
		System.out.print("intersected values { ");
		for(int i = 0 ; i<a.length ; i++){
			
			for(int j = b.length-1 ; j>=0 ; j--){
				if(a[i]==b[j]){
				
					 common.add(a[i]);
					 System.out.print(common.get(count)+", ");
					 count = count+1;
				}
			}
		}
		System.out.print(" }");
		
		
		return common;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 3, 5, 7, 2};
		int b[] = {2, 5, 10, 11, 4};
		Brainer1 b1 = new Brainer1();
		b1.intersection(a, b);
		
		
		
	}

}
