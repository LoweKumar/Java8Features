package com.lowe.OptionalClassDemo;

import java.util.Optional;

public class UpperCaseValues {

    public static Optional<String> getName(){

//        //Making Optional Class container with value
        Optional<String> Containervalue = Optional.of("Lowe Kumar");
        return Containervalue;

//        //Making Optional Class container with no value
//        Optional<String> EmptyContainer= Optional.empty();
//        return EmptyContainer;̄̄

     }
    public static void main(String[] args)
    {
            Optional<String> ContainerValuename = getName();

            if (ContainerValuename.isPresent()) {
                System.out.println(ContainerValuename.get().toUpperCase());
            }
            if (ContainerValuename.isEmpty()) {
                System.out.println("No Value in Optional Container");
            }
    }

}
