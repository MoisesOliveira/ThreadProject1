package view;

import controller.ThreadController;

public class Main {

	public static void main(String[] args) {

		ThreadController[] threads = new ThreadController[5];
		
		for(int i = 0; i < 5; i++) {
			threads[i] = new ThreadController();
			threads[i].start();
		}
		
		
	}
	
}
