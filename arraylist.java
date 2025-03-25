
package org.tnsif.accenture.c2tc.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		
		
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("cherry");
		fruits.add("cherry");
		
	
		
		System.out.println("First fruit :"+ fruits.get(0));
		
		
		
		fruits.set(2, "Blueberry");
	
		
		fruits.remove("cherry");
		
		
		
		if(fruits.contains("Apple"))
		{
			System.out.println("apple is in the list");
		}
 
		//print all the element using for-each loop
		
		System.out.println("Fruits in the list");
		
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		
		
	
		
		System.out.println("Number of fruits "+fruits.size());
		
		
		
		fruits.clear();
		
		System.out.println("List cleared " +fruits.size());
	}

}
