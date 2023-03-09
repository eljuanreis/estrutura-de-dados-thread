package view;

import controller.ThreadFive;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Thread t = new ThreadFive();
			
			t.start();
		}
		
	}

}
