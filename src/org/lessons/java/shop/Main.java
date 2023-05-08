package org.lessons.java.shop;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Prodotto p = new Prodotto(
				rnd.nextInt(10000),
				"Ragù",
				"Ragù alla bolognese",
				20,
				20);
		
		System.out.println(p.getFullId());
	}
}
