package com.github.simplearraylist;

public class SimpleArrayList {
	private static final int INITIAL_ARRAY_SIZE = 128;
	private Object[] objectArray;
	private int arrayItems = 0;
	
	public SimpleArrayList() {
		objectArray = new Object[INITIAL_ARRAY_SIZE];
	}
	
	public SimpleArrayList(int size) {
		objectArray = new Object[size];
	}
	
	public void add(Object o) {
		if (arrayItems == objectArray.length) {
			Object[] t = new Object[objectArray.length * 2];
			for (int i = 0; i < objectArray.length; i++) {
				t[i] = objectArray[i];
			}
			objectArray = t;
		}
		objectArray[arrayItems] = o;
		arrayItems++;
	}
	
	public Object get(int index) {
		return objectArray[index];
	}
	
	public int getLength() {
		return objectArray.length;
	}
	
	public int getArrayItems() {
		return arrayItems;
	}
	
	// will throw IndexOutOfBoundsException, desired
	public void set(int index, Object o) {
		objectArray[index] = o;
	}
}
