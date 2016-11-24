package com.demo;

import java.util.Arrays;
import java.util.List;

public class CollectionStream {
	public static void main(String ar[]) {
		final List<String> lister = Arrays.asList("first", "second");
		
		lister.stream().map(names -> names.toUpperCase()).forEach(names -> System.out.println(names));
		lister.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
