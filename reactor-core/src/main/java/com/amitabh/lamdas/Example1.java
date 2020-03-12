package com.amitabh.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Example1 {

	public static void main(String[] args) {
		List<? extends Integer> list = Arrays.asList(1,2,3,4,5);
		IntStream.of(1,2,3,4,5).min().ifPresent(System.out::println);
		System.out.println("---------------------------");
		Consumer<Number> consumer = System.out::println;
		//Predicate<Number> predicate = n -> n = 3;
		list.stream().filter(n -> n < 3).map(n -> n * 5).forEach(consumer);
		System.out.println("---------------------------");
        List<String> words = Arrays.asList("My","Name","Is","Amitabh","Singh");
        words.stream().filter(word -> word.equals("Amitabh")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("---------------------------");
        int [] num = {1,23,4,5,76,4,56};
        IntStream.of(num).distinct().sorted().limit(3).forEach(System.out::println);
        System.out.println("---------------------------");
        IntStream.of(num).distinct().sorted().skip(3).forEach(System.out::println);
	}

}
