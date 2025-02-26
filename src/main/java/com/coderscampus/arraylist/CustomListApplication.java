package com.coderscampus.arraylist;

public class CustomListApplication {
    public static void main(String[] args) {

        CustomList<Integer> numbers = new CustomArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);

        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
