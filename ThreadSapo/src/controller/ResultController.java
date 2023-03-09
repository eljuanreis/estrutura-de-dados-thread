package controller;

public class ResultController {

	int posicao = 0;

	String[] nomes = new String[5];
	double[] tempos = new double[5];

	public ResultController() {
		super();
	}

	public void getResult(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5) throws InterruptedException {
		while (t1.isAlive() == true || t2.isAlive() == true || t3.isAlive() == true || t4.isAlive() == true
				|| t5.isAlive() == true) {

		}

		System.out.println("");
		System.err.println("-> Corrida finalizada com sucesso <-");
		System.out.println("");

		this.orderResult();

		for (int i = 0; i < 5; i++) {
			String nome = this.nomes[i];
			double tempo = this.tempos[i];

			String tempoFormatado = String.format("%,.2f", tempo / 10000000);

			String textoPosicao = "[" + (i + 1) + "] " + nome + " - " + tempoFormatado + "s";

			if (i == 0) {
				textoPosicao = "\\\\\\ [VENCEDOR] " + textoPosicao + " \\\\\\";
			}

			System.out.println(textoPosicao);
		}
	}

	private void orderResult() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i - 1; j++) {
				if (this.tempos[j + 1] > this.tempos[i]) {
					double aux = this.tempos[i];

					this.tempos[i] = this.tempos[j + 1];
					this.tempos[j] = aux;

					String auxName;

					auxName = this.nomes[i];

					this.nomes[i] = this.nomes[j];
					this.nomes[j] = auxName;
				}
			}
		}
	}

	public void append(double tempo, String nome) {
		this.nomes[this.posicao] = nome;
		this.tempos[this.posicao] = tempo;
		this.posicao++;
	}

}
