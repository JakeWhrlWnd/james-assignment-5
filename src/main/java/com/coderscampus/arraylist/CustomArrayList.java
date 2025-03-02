package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			Object[] newItems = new Object[items.length * 2];
			System.arraycopy(items, 0, newItems, 0, items.length);
			items = newItems;
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Oops, looks like the index: " + index + " is out of bounds for the " +
					"array of size: " + size);		}
		return (T) items[index];
	}
}
