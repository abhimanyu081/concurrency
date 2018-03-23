package com.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		
		Semaphore sem = new Semaphore(1);
		
		IncrementorThread inc = new IncrementorThread(sem, "incrementor");
		DecrementThread dec = new DecrementThread(sem, "Dec");
		
		new Thread(inc).start();
		new Thread(dec).start();
	}
}
