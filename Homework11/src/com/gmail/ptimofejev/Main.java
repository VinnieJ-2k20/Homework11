package com.gmail.ptimofejev;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Max", 5, "male", "black", 8.2, true, new int[] { 0, 0, 0 });
		Cat cat2 = new Cat("Muffin", 3, "male", "white", 12.7, false, new int[] { 2, -4, 0 });
		Cat cat3 = new Cat("Simba", 4, "female", "light brown", 7.1, false, new int[] { -3, 1, 0 });

		cat1.pullTail();
		cat3.pullTail();
		
		cat2.feed(0.2);
		cat2.goDoBusiness(0.4);
		
		cat1.jumpScare();
		
		cat3.move("forward", 3);
		
		cat2.caress();
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
	}

}
