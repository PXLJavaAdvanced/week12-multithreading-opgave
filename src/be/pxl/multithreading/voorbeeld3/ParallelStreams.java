package be.pxl.multithreading.voorbeeld3;

import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class ParallelStreams {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		OptionalDouble result = LongStream.rangeClosed(1, 1_000_000_000L).parallel().mapToDouble(Math::sqrt)
				.map(Math::log).average();
		System.out.println("Parallel: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		OptionalDouble result2 = LongStream.rangeClosed(1, 1_000_000_000L).mapToDouble(Math::sqrt)
				.map(Math::log).average();
		System.out.println("Non parallel: " + (System.currentTimeMillis() - start));
	}
}
