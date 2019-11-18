package com.revature.multithreading;

import java.util.Random;

class Example extends Thread {
	private enum Coin {
		Heads, Tails
	};

	public void run() {
		int headCount = 0;
		int tailCount = 0;
		int probability = 0;
		for (int i = 1; i <= 5; i++) {
			Random randomNumber = new Random();
			int result = randomNumber.nextInt(2);

			if (result == 0) {
				System.out.println(Coin.Heads);
				System.out.println("Heads flipped");
				headCount = headCount + 1;

			} else {
				System.out.println(Coin.Tails);
				System.out.println("Tails flipped");
				tailCount = tailCount + 1;

			}

		}
		System.out.println("tails flipped:" + tailCount);
		System.out.println("Heads flipped:" + headCount);
		probability = (headCount + tailCount) / 5;
		if (probability == 1) {
			System.out.println("probability is 1");
		} else {
			System.out.println("Conditon failed");
		}

	}
}

public class Main {
	public static void main(String[] args) {
		Example example = new Example();
		example.start();
//		example.setName("HEADS");
//		example.setPriority(1);
//		Example example1 = new Example();
//		example1.start();
//		example1.setName("Tails");
//		example1.setPriority(10);

	}
}
