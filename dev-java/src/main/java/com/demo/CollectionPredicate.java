package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.function.*;

public class CollectionPredicate {
	public static void main(String ar[]) {
		final List<String> lister = Arrays.asList("first", "second");
		
		//lister.stream().map(names -> names.toUpperCase()).forEach(names -> System.out.println(names));
		List<String> convert = lister.stream().filter(name -> name.startsWith("f")).collect(Collectors.toList());
		System.out.println(convert);
		Long cnt = lister.stream().filter(name -> name.startsWith("l")).collect(Collectors.counting());
		System.out.println(cnt);
		
		final Predicate<String> pred = name -> name.startsWith("a");
		Long cnt1 = lister.stream().filter(pred).collect(Collectors.counting());
		System.out.println(cnt1);
		
		final Predicate<String> pred2 = name -> (name.startsWith("f") || name.startsWith("s"));
		Long cnt2 = lister.stream().filter(pred2).collect(Collectors.counting());
		System.out.println(cnt2);
		
		//Predicate<String> st = name->name.startsWith("f");
		//Function<String, Predicate<String>> st = (String letter) -> (String name) -> name.startsWith(letter);
		Function<String, Predicate<String>> st = (String letter)-> {
			Predicate<String> criteria = name -> name.startsWith(letter);
			return criteria;
		};
		List<String> lt = lister.stream().filter(st.apply("f")).collect(Collectors.toList());
		System.out.println(lt);
	}
}
