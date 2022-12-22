package org.li;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
	
	public static void main(String[] args) {
	
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		
		System.out.println("First five values");
		
		for (int i = 0; i < 5; i++) {
			Object object = li.get(i);
			System.out.println(object);
			
		}
		System.out.println("Last five values");
		for (int i = 5; i < li.size(); i++) {
			Object object = li.get(i);
			System.out.println(object);
			
		}
		System.out.println("Middle value");
		for (int i = 4; i < 6; i++) {
			Object object = li.get(i);
			System.out.println(object);
			
		}
		System.out.println("First value only");
		for (int i = 0; i < 1; i++) {
			Integer integer = li.get(i);
			System.out.println(integer);
			}
		
	}

}
