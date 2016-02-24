package edu.dtorres.InternationalRacer.demo;

public class Racer implements Runnable {

	public static String winner;

	public void race() {
		for (int distance = 1; distance <= 100; distance++) {
			System.out.println(
					"Distance Covered by " + Thread.currentThread().getName() + " is: " + distance + " meters");

			if(distance == 3 && Thread.currentThread().getName().equals("Hare")){
				try{
					System.out.println(Thread.currentThread().getName() + " is sleeping . +++++++++++");
					Thread.sleep(1000*5);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			// Check if the race has been won
			boolean isRaceWon = this.isRaceWon(distance);
			if (isRaceWon) {
				//break;
			}
		}
	}

	private boolean isRaceWon(int distanceCovered) {
		boolean isRaceWon = false;
		if (Racer.winner == null && distanceCovered == 100) {
			String winnerName = Thread.currentThread().getName();
			Racer.winner = winnerName;
			System.out.println("The winner is: " + Racer.winner);
			isRaceWon = true;
		} else {
			isRaceWon = Racer.winner != null;
		}
		return isRaceWon;
	}

	@Override
	public void run() {
		this.race();
	}

}
