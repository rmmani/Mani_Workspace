package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class CollectionAsStreamExample {
	public void fun(String msg) {
		System.out.println("msg from fun:>"+msg);
	}
	
	public static void main(String[] args) {
		List<String> pack = Arrays.asList("First", "Second");
		
		//pack.forEach(names -> System.out.println(names));
		final List<String> pack1 = new ArrayList<>();
		
		//pack.forEach(names -> System.out.println(names.toUpperCase()));
		pack.forEach(pack1::add);
		pack1.add("third");
		pack1.forEach(names -> System.out.println(names.toUpperCase()));
		
		//pack1.stream().map(String::toUpperCase).forEach(System.out::println);;
		//pack1.forEach((String names) -> System.out.println(names));
		
		//pack.forEach((String names) -> System.out.println(names));
		/*pack.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println(Integer.parseInt(t));
				
			}
			
		});*/
		
		IntStream in = Arrays.stream(new int[] {1, 2, 3})
			    .map(n -> 2 * n + 1);
		
		System.out.println(Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average());
		Arrays.stream(new int[] {1, 2, 3})
	    .map(n -> 2 * n + 1)
	    .average()
	    .ifPresent(System.out::println);  // 5.0
	}

}
