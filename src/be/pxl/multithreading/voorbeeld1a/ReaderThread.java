package be.pxl.multithreading.voorbeeld1a;

import java.util.List;

public class ReaderThread extends Thread {
	private List<Integer> integers;
	
	public ReaderThread(List<Integer> integers) {
		this.integers = integers;
	}
	
	@Override
	public void run() {
		for (int i=0 ; i < 100; i++) {
			integers.remove(0);
		}
	}
}
