package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CollectionExample {
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
		//pack.forEach((String names) -> System.out.println(names));
		/*pack.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println(Integer.parseInt(t));
				
			}
			
		});*/
		//pack.stream().filter(name -> name.get)
		
		
		
	}

}
