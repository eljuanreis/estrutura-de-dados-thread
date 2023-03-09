package controller;

public class ThreadFive extends Thread {
	
	public ThreadFive() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("TID #" + (int) getId());
	} 
}
