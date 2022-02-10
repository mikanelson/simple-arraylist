package com.github.simplearraylist;

import java.util.Arrays;

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
	
	public boolean contains(Object o) {
		for (int i = 0; i < objectArray.length; i++) {
			if (objectArray[i] != null && objectArray[i].equals(o)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(SimpleArrayList a) {
		if (a.getArrayItems() != arrayItems) {
			return false;
		} else {
			Object[] aObjects = a.getObjectArray();
			for (int i = 0; i < arrayItems; i++) {
				boolean contains = false;
				for (int j = 0; j < arrayItems; j++) {
					if (aObjects[i].equals(objectArray[j])) {
						contains = true;
						break;
					}
				}
				if (!contains) {
					return false;
				}
			}
		}
		return true;
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
	
	public void fillArray() {
		for (int i = 0; i < objectArray.length; i++) {
			add(i);
		}
	}
	
	public String toString() {
		return Arrays.toString(objectArray);
		
	}
	
	public Object get(int index) {
		return objectArray[index];
	}
	
	public Object[] getObjectArray() {
		return objectArray;
	}
	
	public int getLength() {
		return objectArray.length;
	}
	
	public int getArrayItems() {
		return arrayItems;
	}
	
	// will throw IndexOutOfBoundsException, desired
	public void set(int index, Object o) {
		if (objectArray[index] == null) {
			arrayItems++;
		}
		objectArray[index] = o;
	}
}
