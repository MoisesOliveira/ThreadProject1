package controller;

public class ThreadController extends Thread {

	public ThreadController() {
		
	}

	@Override
	public void run() {
		printID();
	}
	
	public void printID() {
		long id = getId();
		System.out.println("Nº: " + id);
	}
}
