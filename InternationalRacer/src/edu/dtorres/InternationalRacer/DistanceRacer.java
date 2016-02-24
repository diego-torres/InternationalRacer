package edu.dtorres.InternationalRacer;

public class DistanceRacer implements Runnable {
	public static String winner;
	private Thread joinThread;
	
	@Override
	public void run() {
		long startNano = System.nanoTime();
		double elapsed = 0;
		for(int distance = 1; distance <= 200; distance++){
			System.out.println(Thread.currentThread().getName() + " from " + Thread.currentThread().getThreadGroup().getName() + " run for " + distance);
		}
		
		try {
			if(joinThread != null){
				System.out.println(Thread.currentThread().getName() + " from " + Thread.currentThread().getThreadGroup().getName() + " BAR DELIVERY TO JOIN: " + getJoinThread().getName());
				getJoinThread().start();
				getJoinThread().join();
				if(winner==null){
					elapsed = (System.nanoTime() - startNano)/1e6;
					winner = Thread.currentThread().getThreadGroup().getName() + " WON!!! with a time of " + elapsed;
				}
				if(elapsed == 0){
					elapsed = (System.nanoTime() - startNano)/1e6;
				}
				
				System.out.println(" ***************** " + Thread.currentThread().getThreadGroup().getName() + " completed the track with a time of " + elapsed + " ************************");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Thread getJoinThread() {
		return joinThread;
	}

	public void setJoinThread(Thread joinThread) {
		this.joinThread = joinThread;
	}

}
