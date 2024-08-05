package com.lowe.OptionalClassDemo;

import java.util.Optional;

public class mapFilterMapDemo {
    public static void main(String[] args) {
        Optional<String> container = Optional.of("Lowe Kumar");

//        use of map()
//        Optional<Integer> result = container.map(val->val.length());
//        or
        Optional<Integer> result = container.map(String::length);
        System.out.println(result.get());

        System.out.println(container.map(String::toUpperCase).get());
//        or
//        System.out.println(container.map(value->value.toUpperCase()).get());

    }

}

