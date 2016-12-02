package com.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SyncExample {
	int count = 0;
	
	  void increment() {
		  synchronized (this) {
			  count = count + 1;
		}
	    
	    //System.out.println(count);
	}
	
	void stop(ExecutorService executor) {
		executor.shutdownNow();
	}
	
	public void exec() {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		IntStream.range(0, 10000)
		    .forEach(i -> executor.submit(this::increment));

		stop(executor);

		System.out.println(count);  // 9965
		
	}
	
	public static void main(String[] args) {
		
		new SyncExample().exec();

	}

}
