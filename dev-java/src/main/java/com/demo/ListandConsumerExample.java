package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListandConsumerExample {
	public void fun(String msg) {
		System.out.println("msg from fun:>"+msg);
	}
	public static void main(String[] args) {
		List<String> pack = Arrays.asList("First", "Second");
		
		//pack.forEach(names -> System.out.println(names));
		pack.forEach(new ListandConsumerExample()::fun);
		//pack.forEach((String names) -> System.out.println(names));
		/*pack.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println(Integer.parseInt(t));
				
			}
			
		});*/
	}

}
