package com.demo;

import java.util.Arrays;
import java.util.List;
//import java.util.Observable;

public class Stringjoin {

	public static void main(String[] args) {
		final List<String> pack = Arrays.asList("first", "second", "third", "simple");
		System.out.println(String.join(",", pack)); 
	}
}
