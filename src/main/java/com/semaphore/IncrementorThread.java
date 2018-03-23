package com.semaphore;

import java.util.concurrent.Semaphore;

public class IncrementorThread implements Runnable{
	
	Semaphore semInc;
	String name;

	
	
	public IncrementorThread(Semaphore semInc, String name) {
		super();
		this.semInc = semInc;
		this.name = name;
	}



	public void run() {
		
		System.out.println("Starting "+name);
		
		try {
			System.out.println(name+" Waiting for a permit");
			semInc.acquire();
			System.out.println(name+" gets a permit");
			
			for(int i=0;i<5;i++) {
				Shared.count++;
				System.out.println(Shared.count);
				
				Thread.sleep(10);
			}
			
			System.out.println(name+" releases the permit");
			semInc.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
