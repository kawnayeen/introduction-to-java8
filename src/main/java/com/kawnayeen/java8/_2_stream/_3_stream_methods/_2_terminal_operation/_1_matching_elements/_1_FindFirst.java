package com.kawnayeen.java8._2_stream._3_stream_methods._2_terminal_operation._1_matching_elements;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _1_FindFirst {
    public static void main(String[] args) {
        exampleUsingOptional();
        exampleUsingOrElse();
    }

    private static void exampleUsingOptional() {
        System.out.println("Printing first value greater than 5");
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 7, 6, 5);
        System.out.println("List : " + values);
        Predicate<Integer> greaterThan5 = value -> value > 5;
        Optional<Integer> firstValue = values.stream().filter(greaterThan5).findFirst();
        if (firstValue.isPresent()) {
            System.out.println(firstValue.get());
        }
        System.out.println();
    }

    private static void exampleUsingOrElse() {
        System.out.println("Printing first value greater than 10");
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 7, 6, 5);
        System.out.println("List : " + values);
        Predicate<Integer> greaterThan10 = value -> value > 10;
        int firstValue = values.stream().filter(greaterThan10).findFirst().orElse(-1);
        System.out.println(firstValue + "\n");
    }
}
