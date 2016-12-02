package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class OptionalExample {

	public static void main(String[] args) {
		final List<String> pack = Arrays.asList("first", "second", "third", "simple");
		Optional<String> optin = pack.stream().filter(name->name.startsWith("s")).findAny();
		System.out.println(optin.get());
	}

}
