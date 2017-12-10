package be.pxl.multithreading.voorbeeld1;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {
	public static void main(String[] args) {
		List<String> buffer = new ArrayList<>();
		MyProducer producer = new MyProducer(buffer, OutputColor.GREEN);
		MyConsumer consumer1 = new MyConsumer(buffer, OutputColor.CYAN);
		MyConsumer consumer2 = new MyConsumer(buffer, OutputColor.RED);
		
		producer.start();
		consumer1.start();
		consumer2.start();
	}
}	
