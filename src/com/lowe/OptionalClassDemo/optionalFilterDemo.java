package com.lowe.OptionalClassDemo;

import java.util.Optional;

public class optionalFilterDemo {
    private static Optional<String> getName(){
        Optional<String> container = Optional.of("Lowe Kumar");
        return container;
    }

    public static void main(String[] args) {
        Optional<String> ContainerValue = getName();
//        System.out.println(ContainerValue.get());
        Optional<String> result = ContainerValue.filter(value -> value.equalsIgnoreCase("MSD")).or(()->Optional.of("not MSD in the Original Container"));
        System.out.println(result.get());

    }

}
