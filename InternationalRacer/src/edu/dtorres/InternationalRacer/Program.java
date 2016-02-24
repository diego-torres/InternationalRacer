package edu.dtorres.InternationalRacer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// simulates running race of 100 m
		// The number of runners should be 10 and given name to each runner thread.
		// Print the winner and all the threads should complete the race
		// Print the time taken for each runner to complete the race and highlight the winners time
		SpeedRacer racer = new SpeedRacer();
		ThreadGroup runners = new ThreadGroup("runners");
		
		Thread runner1 = new Thread(runners, racer, "Diego");
		Thread runner2 = new Thread(runners, racer, "Carlos");
		Thread runner3 = new Thread(runners, racer, "Jorge");
		Thread runner4 = new Thread(runners, racer, "Roberto");
		Thread runner5 = new Thread(runners, racer, "Esperanza");
		Thread runner6 = new Thread(runners, racer, "Mayra");
		Thread runner7 = new Thread(runners, racer, "Perla");
		Thread runner8 = new Thread(runners, racer, "Beto");
		Thread runner9 = new Thread(runners, racer, "Antonio");
		Thread runner10 = new Thread(runners, racer, "Chuy");
		
		runner1.start();
		runner2.start();
		runner3.start();
		runner4.start();
		runner5.start();
		runner6.start();
		runner7.start();
		runner8.start();
		runner9.start();
		runner10.start();
		
		while(true){
			if(runners.activeCount()==0){
				System.out.println(SpeedRacer.winnerPrint);
				break;
			}
		}
		
		
		// Create an application which simulates the running race of 400 m
		// Create 5 thread groups and give names (country)
		// 10 runners
		// Each thread should run half distance and the next thread in the same group should join the race to complete it.
		// Print the winner group name and all the threads should complete the race.
		// Print the time taken by each group to complete the race and highlight the winners time
		
		DistanceRacer dRunner = new DistanceRacer();
		ThreadGroup allDistanceRunners = new ThreadGroup("Distance Runners");
		ThreadGroup mex = new ThreadGroup(allDistanceRunners, "Mexico");
		ThreadGroup usa = new ThreadGroup(allDistanceRunners, "United States");
		ThreadGroup can = new ThreadGroup(allDistanceRunners, "Canada");
		ThreadGroup rcr = new ThreadGroup(allDistanceRunners, "Costa Rica");
		ThreadGroup ven = new ThreadGroup(allDistanceRunners, "Venezuela");
		
		DistanceRacer dRunnerMex = new DistanceRacer();
		Thread mexRunner = new Thread(mex, dRunnerMex, "Diego");
		Thread mexRunner2 = new Thread(mex, dRunner, "Carlos");
		dRunnerMex.setJoinThread(mexRunner2);
		
		DistanceRacer dRunnerUsa = new DistanceRacer();
		Thread usaRunner = new Thread(usa, dRunnerUsa, "Jeff");
		Thread usaRunner2 = new Thread(usa, dRunner, "Deb");
		dRunnerUsa.setJoinThread(usaRunner2);
		
		DistanceRacer dRunnerCan = new DistanceRacer();
		Thread canRunner = new Thread(can, dRunnerCan, "Mark");
		Thread canRunner2 = new Thread(can, dRunner, "Harry");
		dRunnerCan.setJoinThread(canRunner2);
		
		DistanceRacer dRunnerCr = new DistanceRacer();
		Thread crRunner = new Thread(rcr, dRunnerCr, "Roberto");
		Thread crRunner2 = new Thread(rcr, dRunner, "Hugo");
		dRunnerCr.setJoinThread(crRunner2);
		
		DistanceRacer dRunnerVen = new DistanceRacer();
		Thread venRunner = new Thread(ven, dRunnerVen, "Victor");
		Thread venRunner2 = new Thread(ven, dRunner, "Alfonso");
		dRunnerVen.setJoinThread(venRunner2);
		
		mexRunner.start();
		canRunner.start();
		usaRunner.start();
		crRunner.start();
		venRunner.start();
		
		while(true){
			if(allDistanceRunners.activeCount()==0){
				System.out.println(DistanceRacer.winner);
				break;
			}	
		}
		
		
	}

}
