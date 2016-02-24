package edu.dtorres.InternationalRacer.demo;

import java.lang.Thread.State;

public class RaceDemo {

	public static void main(String[] args) {
		/*Racer racer = new Racer();
		Thread tortoiseRacer = new Thread(racer, "Tortoise");
		Thread hareRacer = new Thread(racer, "Hare");
		
		tortoiseRacer.start();
		hareRacer.start();*/
		
		YieldRunnable runner = new YieldRunnable();
		ThreadGroup allThreads = new ThreadGroup("All Threads");
		
		Thread t1 = new Thread(runner);
		Thread t2 = new Thread(runner);
		Thread t3 = new Thread(runner);
		Thread t4 = new Thread(runner);
		Thread t5 = new Thread(runner);
		Thread t6 = new Thread(runner);
		Thread t7 = new Thread(runner);
		Thread t8 = new Thread(runner);
		Thread t9 = new Thread(runner);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t4.setPriority(Thread.NORM_PRIORITY);
		t5.setPriority(Thread.NORM_PRIORITY);
		t6.setPriority(Thread.NORM_PRIORITY);
		
		t7.setPriority(Thread.MIN_PRIORITY);
		t8.setPriority(Thread.MIN_PRIORITY);
		t9.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
		while(true){
			
			State t1s = t1.getState();
			State t2s = t2.getState();
			State t3s = t3.getState();
			State t4s = t4.getState();
			State t5s = t5.getState();
			State t6s = t6.getState();
			State t7s = t7.getState();
			State t8s = t8.getState();
			State t9s = t9.getState();
			
			System.out.println(System.nanoTime() + " t1 Status: " + t1s);
			System.out.println(System.nanoTime() + " t2 Status: " + t2s);
			System.out.println(System.nanoTime() + " t3 Status: " + t3s);
			System.out.println(System.nanoTime() + " t4 Status: " + t4s);
			System.out.println(System.nanoTime() + " t5 Status: " + t5s);
			System.out.println(System.nanoTime() + " t6 Status: " + t6s);
			System.out.println(System.nanoTime() + " t7 Status: " + t7s);
			System.out.println(System.nanoTime() + " t8 Status: " + t8s);
			System.out.println(System.nanoTime() + " t9 Status: " + t9s);
			
			int activeThreads = allThreads.activeCount();
			if(activeThreads == 0){
				break;
			}
		}
		
	}
}
