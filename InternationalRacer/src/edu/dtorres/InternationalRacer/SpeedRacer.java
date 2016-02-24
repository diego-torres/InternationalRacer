package edu.dtorres.InternationalRacer;

public class SpeedRacer implements Runnable {
	public static String winnerPrint;
	
	@Override
	public void run() {
		long nanos = System.nanoTime();
		double elapsed = 0;
		for (int distance = 1; distance <= 100; distance++) {
			System.out.println(Thread.currentThread().getName() + " run " + distance);
			if(distance == 100 && winnerPrint == null){
				elapsed = (System.nanoTime() - nanos)/1E6;
				winnerPrint = "THE WINNER IS " + Thread.currentThread().getName() + " in " + elapsed + " milliseconds";
			}
		}
		if(elapsed == 0)
			elapsed = (System.nanoTime() - nanos)/1E6;
		
		System.out.println(Thread.currentThread().getName() + " has completed the race in " + elapsed + " milliseconds");
	}
}
