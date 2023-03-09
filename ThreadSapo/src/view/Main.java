package view;

import controller.ResultController;
import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ResultController rCont = new ResultController();

		String[] nomeSapos = Main.definirNomeSapos();

		Thread sapo1 = new ThreadSapo(nomeSapos[0], rCont);
		Thread sapo2 = new ThreadSapo(nomeSapos[1], rCont);
		Thread sapo3 = new ThreadSapo(nomeSapos[2], rCont);
		Thread sapo4 = new ThreadSapo(nomeSapos[3], rCont);
		Thread sapo5 = new ThreadSapo(nomeSapos[4], rCont);

		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();

		rCont.getResult(sapo1, sapo2, sapo3, sapo4, sapo5);
	}

	public static String[] definirNomeSapos() {
		String[] nomeSapos = new String[5];
		nomeSapos[0] = "Sapo Alfredo";
		nomeSapos[1] = "Sapo Lucas";
		nomeSapos[2] = "Sapo William";
		nomeSapos[3] = "Sapo Marcelo";
		nomeSapos[4] = "Sapo Henrique";

		return nomeSapos;

	}

}
