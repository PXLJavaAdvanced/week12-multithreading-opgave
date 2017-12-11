package be.pxl.multithreading.voorbeeld1b;

import java.util.List;
import java.util.Random;

import be.pxl.multithreading.voorbeeld1b.OutputColor;

public class MyProducer extends Thread {

	private List<String> buffer;
	private OutputColor color;

	public MyProducer(List<String> buffer, OutputColor color) {
		this.buffer = buffer;
		this.color = color;
	}

	@Override
	public void run() {
		Random rand = new Random();
		String[] nums = { "1", "2", "3", "4", "5" };
		for (String num : nums) {
			try {
				System.out.println(color.getColorCode() + "Adding...  " + num + OutputColor.BLACK.getColorCode());
				buffer.add(num);
				Thread.sleep(rand.nextInt(1000));
			} catch (InterruptedException e) {
				System.out.println("Producer interrupted");
			}
		}
		System.out.println(color.getColorCode() + "Adding EOF and exiting." + OutputColor.BLACK.getColorCode());
		buffer.add("EOF");

	}
}
