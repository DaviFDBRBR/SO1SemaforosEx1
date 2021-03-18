package view;

import java.util.concurrent.Semaphore;

import controller.ThreadOpe;

public class Main {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int id = 1; id < 22; id++) {
			ThreadOpe to = new ThreadOpe(id, semaforo);
			to.start();
		}
		
	}
}
