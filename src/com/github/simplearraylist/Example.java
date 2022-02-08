package com.github.simplearraylist;

public class Example {

	public static void main(String[] args) {
		//create and fill arraylist
		SimpleArrayList i = new SimpleArrayList();
		for (int j = 0; j < i.getLength(); j++) {
			i.add(j);
		}
		
		System.out.println("Items in array: " + i.getArrayItems());
		System.out.println("Array size: " + i.getLength());
		//over-fill array and print new arraylist
		i.add("string");
		System.out.println("Items in array: " + i.getArrayItems());
		System.out.println("Array size: " + i.getLength());
		// IndexOutOfBounds exception
		i.set(i.getLength() + 1, 20);
	}

}
