package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class Reduced {

	public static void main(String[] args) {
		final List<String> pack = Arrays.asList("first", "second", "third", "simple");
		System.out.println(pack.stream().mapToInt(name->name.length()).sum());
	}

}
