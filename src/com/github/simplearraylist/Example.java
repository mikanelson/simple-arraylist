package com.github.simplearraylist;

public class Example {

	public static void main(String[] args) {
		SimpleArrayList i = new SimpleArrayList();
		i.fillArray();
		SimpleArrayList i2 = new SimpleArrayList();
		i2.fillArray();
		SimpleArrayList i3 = new SimpleArrayList(129);
		i3.fillArray();
		
		

		System.out.println(i.toString());
		System.out.println(i2.toString());
		System.out.println(i3.toString());
		
		System.out.println("Contains: ");
		System.out.println("test: " + i.contains("test"));
		System.out.println("string" + i.contains("string"));
		System.out.println("1000: " + i.contains(1000));
		System.out.println("100: " + i.contains(100));
		
		System.out.println("Equals:");
		System.out.println("i.equals(i2): " + i.equals(i2));
		System.out.println("i.equals(i3): " + i.equals(i3));
		
		i.add("string");
		System.out.println(i.toString());
		System.out.println("i.equals(i2): " + i.equals(i2));
		
		System.out.println(i.toString());
		System.out.println(i3.toString());
		System.out.println(i3.getArrayItems());
		
		System.out.println("Set:");
		i.set(130, 130);
		System.out.println(i.toString());
		
		i.set(i.getLength(), 20);
	}

}
