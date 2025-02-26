package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		int counter = 0;

		for (int i = 0; i < size; i++) {
			counter = counter + 1;
		}
		return counter;
	}

	@Override
	public T get(int index) {
		T target = null;

		try {
			if (index >= 0 && index < size) {
				target = (T) items[index];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds. Issue -> " + e.getMessage());
		}
		return target;
	}
}
