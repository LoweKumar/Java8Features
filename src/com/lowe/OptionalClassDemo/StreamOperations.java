package com.lowe.OptionalClassDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args){
        //1. from collection object
        List<String> values = List.of("a", "b", "c");
        Stream<String> stream1 = values.stream();
//        System.out.println(stream1);

        //2. Array of values
        String[] names = {"One", "Two", "Three", "Four", "Five"};
        Stream<String> stream2 = Arrays.stream(names);

        //3. Stream methods
        Stream<String> stream3 = Stream.of("One", "Two", "Three", "Four", "Five");
//        System.out.println(stream3);

        // generate()
        Stream<String> stream4 = Stream.generate(()->"one");
//        System.out.println(stream4);

        // builder()
        Stream.Builder<String> streamBuilder = Stream.builder();
//        Stream<String> stream5 = streamBuilder.add("one").add("two");

        //empty()
        Stream<String> stream6 = Stream.empty();


    }
}
