package com.revature.multithreading;

import java.util.Random;
import java.util.Scanner;

class Example implements Runnable {
	private enum Coin {
		HEADS, TAILS
	};

	 public void run() {
		int headCount = 0;
		int tailCount = 0;
		int probability = 0;
//		System.out.println("Enter the no of times you want to flip the coin");
//		Scanner scn = new Scanner(System.in);
		int n = 5;
		for (int i = 1; i <= n; i++) {
			Random randomNumber = new Random();
			int result = randomNumber.nextInt(2);
			System.out.println("Result=>"+result);
		
			if (result == 0) {
				System.out.println("Thread name=>"+Thread.currentThread().getName());
				System.out.println(Coin.HEADS);
				System.out.println("Heads flipped");
				headCount ++;
				
			} else {
				System.out.println("Thread name=>"+Thread.currentThread().getName());
				System.out.println(Coin.TAILS);
				System.out.println("Tails flipped");
				tailCount ++;

			}

		}
		//scn.close();
		System.out.println("tails flipped:" + tailCount);
		System.out.println("Heads flipped:" + headCount);
		probability = (headCount + tailCount) / n;
		if (probability == 1) {
			System.out.println("probability is 1");
		} else {
			System.out.println("Conditon failed");
		}
		System.out.println("----END----");
	}
}

public class Main {
	public static void main(String[] args) {
		Example example = new Example();
		System.out.println("Enter the no of coin");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int a=0;a<n;a++)
		{
		Thread tobj = new Thread(example);
		tobj.setName("Thread-a"+a);
		tobj.start();
		}
		scn.close();
//		example.setName("HEADS");
////		example.setPriority(1);
//		Example example1 = new Example();
//		Thread threadObj = new Thread(example1);
//	threadObj.setName("cycle");
//		threadObj.start();
//		example1.setName("Tails");
//		example1.setPriority(10);

	}
	
}
