package com.github.simplearraylist;

public class Example {

	public static void main(String[] args) {
		//create and fill arraylist
		SimpleArrayList i = new SimpleArrayList();
		for (int j = 0; j < i.getLength(); j++) {
			i.add(j);
		}
		
		SimpleArrayList i2 = new SimpleArrayList();
		for (int j = 0; j < i2.getLength(); j++) {
			i2.add(i2.getLength() - (j + 1));
		}
		
		SimpleArrayList i3 = new SimpleArrayList(129);
		for (int j = 0; j < i3.getLength(); j++) {
			i3.add(j);
		}
		
		System.out.println("Items in array: " + i.getArrayItems());
		System.out.println("Array size: " + i.getLength());
		
		System.out.println("Contains: ");
		System.out.println(i.contains("test"));
		System.out.println(i.contains("string"));
		System.out.println(i.contains("test"));
		System.out.println(i.contains(1000));
		System.out.println(i.contains(100));
		
		System.out.println("Equals:");
		System.out.println(i.equals(i2));
		System.out.println(i.equals(i3));
		
		//over-fill array and print new arraylist
		i.add("string");
		System.out.println("Items in array: " + i.getArrayItems());
		System.out.println("Array size: " + i.getLength());
		
		//Compare Again
		System.out.println(i.equals(i2));
		
		// IndexOutOfBounds exception
		i.set(i.getLength(), 20);
	}

}
