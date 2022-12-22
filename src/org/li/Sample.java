package org.li;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Sample {
	
	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add(10);
		li.add("Java");
		li.add(123.22);
		li.add('m');
		li.add(false);
		li.add(10);
		li.add(null);
		li.add("hhh");
		
		// to print all the values in list
		System.out.println(li);
		
		// to find the size of the list
		int size = li.size();
		System.out.println(size);
		
		//to get a value by passing the index
		Object object = li.get(5);
		System.out.println(object);
		
		//to add a value by passing the index
		li.add(2, 111);
		System.out.println(li);
		
		//to remove a value by passing the index
		li.remove(7);
		System.out.println(li);
		
		//to replace a value by passing the index
		li.set(7, "Naveen");
		System.out.println(li);
		
		//to find the index position of the given value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		//to find the last occurance of the given value
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		//to check that the given value is present or not
		boolean contains = li.contains('m');
		System.out.println(contains);
		
		List mi = new LinkedList();
		mi.add(100);
		mi.add("Sql");
		mi.add(200);
		
		
		System.out.println(mi);
		
		List vi = new Vector();
		
		vi.add("Sql");
		vi.add(300);
		vi.add(400);
		
		mi.removeAll(vi);
		System.out.println(mi);
		
		vi.retainAll(mi);
		System.out.println(vi);
		System.out.println(mi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
