package com.dev.arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumberOccurrenceOddTimes {
	public static void main(String[] args) {
		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 30, 40, 20 };
		System.out.println("Number which occurs odd number of times is : " + getOddTimesElementHashing(array));
	}

	static int getOddTimesElementHashing(int ar[]) {
		int i;

		HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
		for (i = 0; i < ar.length; i++) {
			int element = ar[i];
			if (elements.get(element) == null) {
				elements.put(element, 1);
			} else
				elements.put(element, elements.get(element) + 1);
		}
		for (Entry<Integer, Integer> entry : elements.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
}