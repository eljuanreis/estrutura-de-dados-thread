package controller;

public class ThreadMatriz extends Thread {

	int [][] matriz;
	int linha;
	
	public ThreadMatriz(int[][] matriz, int linha) {
		this.matriz = matriz;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += this.matriz[this.linha][i];
		}
		
		System.out.println("Linha #" + this.linha + " - Soma: " + sum);
	}

}
