package edu.dtorres.InternationalRacer.demo;

public class YieldRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Current Thread: " + Thread.currentThread().getName() + " Priority" + Thread.currentThread().getPriority());
		
		// allow another thread in the same priority to execute
		Thread.yield();
		System.out.println("Current Thread: " + Thread.currentThread().getName() + " Priority" + Thread.currentThread().getPriority() + " END.");
		
	}

}
