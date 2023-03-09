package controller;

public class ThreadVetor extends Thread {
	
	private int num;
	private int[] vetor;
	private int vetLenght;
	
	public ThreadVetor(int num, int[] vetor) {
		this.num = num;
		this.vetor = vetor;
		this.vetLenght = vetor.length;
	}
	
	@Override
	public void run() {
		if (this.num % 2 == 0) {
			long nanoInit = System.nanoTime();
			
			for (int i = 0 ; i < vetLenght; i++) {
				
			}
			
			long nanoFinish = System.nanoTime();
			
			double diff = Math.pow(nanoFinish - nanoInit, 9);
			
			System.out.println("O número é par, o tempo foi: " + diff + "s");
			
			
		} else {
			long nanoInit = System.nanoTime();
			
			for (int i : vetor) {
				
			}
			
			long nanoFinish = System.nanoTime();
			
			double diff = Math.pow(nanoFinish - nanoInit, 9);
			
			System.out.println("O número é impar, o tempo foi: " + diff + "s");
			
		}
		
	} 
}
