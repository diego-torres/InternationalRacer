package edu.dtorres.InternationalRacer.demo;

import java.lang.Thread.State;

public class JoinDemo {
	public static Thread firstThread;
	public static Thread secondThread;

	public static void main(String[] args) {
		JoinThread jt = new JoinThread();
		firstThread = new Thread(jt, "First Thread");
		secondThread = new Thread(jt, "Second Thread");

		firstThread.start();

		while (true) {
			State firstThreadState = firstThread.getState();
			State secondThreadState = secondThread.getState();

			System.out.println(System.nanoTime() + " First Thread status: " + firstThreadState);
			System.out.println(System.nanoTime() + " Second Thread state: " + secondThreadState);

			if (firstThreadState.equals(State.TERMINATED) && secondThreadState.equals(State.TERMINATED))
				break;

		}
	}
}
