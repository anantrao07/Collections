package com.example.collections;

import java.util.*;

//lass displaying usage of Hashmap

/* A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.*/
public class Names {

	HashMap<Integer,String> names = new HashMap<Integer,String>();
	

	public HashMap<Integer,String> storeNames(){
		names.put(1, "anant");
		names.put(2, "ani");
		names.put(3, "santra");
		names.put(4, "florals");
		names.put(5, "fauna");
		return names;
	}
	
	public void displayNames(HashMap<Integer,String> m){
		
		for(Map.Entry<Integer,String> nm:m.entrySet()){
			
			System.out.println(nm.getKey() +" " + nm.getValue());
			
		}
		
	}
	
}
