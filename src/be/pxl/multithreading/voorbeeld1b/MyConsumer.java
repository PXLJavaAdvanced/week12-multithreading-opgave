package be.pxl.multithreading.voorbeeld1b;

import java.util.List;

import be.pxl.multithreading.voorbeeld1b.OutputColor;

public class MyConsumer extends Thread {
	private List<String> buffer;
	private OutputColor color;

	public MyConsumer(List<String> buffer, OutputColor color) {
		this.buffer = buffer;
		this.color = color;
	}

	@Override
	public void run() {
		boolean reading = true;
		while (reading) {
			if (!buffer.isEmpty()) {
				if (buffer.get(0).equals("EOF")) {
					reading = false;
					System.out.println(color.getColorCode() + " Exiting" + OutputColor.BLACK.getColorCode());
				} else {
					System.out.println(
							color.getColorCode() + "Removed " + buffer.remove(0) + OutputColor.BLACK.getColorCode());
				}
			} else {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}

	}

}
