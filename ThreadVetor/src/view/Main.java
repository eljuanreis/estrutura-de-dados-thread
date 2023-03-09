package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		int tamanho = vetor.length;
		
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = (int) ((Math.random()) * (100 - 1) + 1);
		}
		
		Thread t1 = new ThreadVetor(1, vetor);
		Thread t2 = new ThreadVetor(2, vetor);
		
		t1.start();
		t2.start();
	}

}
