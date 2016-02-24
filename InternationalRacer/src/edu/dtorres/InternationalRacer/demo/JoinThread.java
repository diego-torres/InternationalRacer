package edu.dtorres.InternationalRacer.demo;

public class JoinThread implements Runnable {

	@Override
	public void run() {
		System.out.println(System.nanoTime() + " Current Thread: " + Thread.currentThread().getName() + " START");
		
		if(Thread.currentThread().getName().equals("First Thread")){
			try{
				System.out.println(System.nanoTime() + " inside the join condition");
				JoinDemo.secondThread.start();
				JoinDemo.secondThread.join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		if(Thread.currentThread().getName().equals("Second Thread")){
			try {
				Thread.sleep(1000*1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
