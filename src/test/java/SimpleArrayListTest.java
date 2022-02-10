package test.java;

import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.simplearraylist.SimpleArrayList;

public class SimpleArrayListTest {

	SimpleArrayList a1;
	SimpleArrayList a2;
	SimpleArrayList a3;
	
	@Before
	public void setUp() {
		a1 = new SimpleArrayList();
		a2 = new SimpleArrayList();
		a3 = new SimpleArrayList(129);
	}
	
	@Test
	public void arrayIsFilled() {
		a1.fillArray();
		Object[] a1a = a1.getObjectArray();
		boolean isFilled = true;
		for (int i = 0; i < a1.getLength(); i++) {
			if (a1a[i] == null) {
				isFilled = false;
			}
		}
		assertTrue(isFilled);
	}
	
	@Test
	public void containsSingleItem() {
		a1.add(100);
		a1.contains(100);
	}
	
	@Test
	public void containsMultipleItems() {
		a1.add(100);
		a1.add(20);
		assertTrue(a1.contains(100) && a1.contains(20));
	}
	
	@Test
	public void setItem() {
		a1.add(10);
		a1.set(0, 200);
		a1.contains(200);
	}
	
	@Test
	public void twoArrayListsAreEqualSameSizes() {
		a1.fillArray();
		a2.fillArray();
		assertTrue(a1.equals(a2));
	}
	
	@Test
	public void twoArraysAreNotEqualDifferentSizes() {
		a1.fillArray();
		a3.fillArray();
		assertFalse(a1.equals(a2));
	}
	
	@Test
	public void twoArraysAreEqualDifferentSizes() {
		a1.fillArray();
		a3.fillArray();
		a3.set(128, null);
		assertTrue(a1.equals(a3));
	}

}
