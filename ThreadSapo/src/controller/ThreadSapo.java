package controller;

public class ThreadSapo extends Thread {

	static int MAX_JUMP = 10; // em metros
	// o sapo precisa pular 20 vezes para finalizar a corrida
	static int FINISH_RUN = MAX_JUMP * 20; // cerca de 2km pulados (body builder)

	ResultController resultado;
	String name;
	int distance;

	public ThreadSapo(String name, ResultController resultado) {
		this.name = name;
		this.resultado = resultado;
	}

	@Override
	public void run() {
		double tempoInicial = (double) System.nanoTime();

		while (this.distance < FINISH_RUN) {
			int randomJump = this.generateRandomJump();

			System.out.println("[" + this.name + "] pulou " + randomJump + "m");
			System.out.println("[" + this.name + "]" + " está com " + this.distance + "m no total");
			this.distance += randomJump;
		}

		if (this.distance >= FINISH_RUN) {
			double tempoFinal = (double) System.nanoTime() - tempoInicial;

			this.resultado.append(tempoFinal, this.name);
		}
	}

	private int generateRandomJump() {
		return (int) (Math.random() * (MAX_JUMP - 0) + 0);
	}

}
