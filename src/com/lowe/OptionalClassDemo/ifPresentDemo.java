package com.lowe.OptionalClassDemo;

import java.util.Optional;

public class ifPresentDemo {

    public static Optional<String> getName(){
        // Creating container with value
      Optional<String> container = Optional.of("Lowe Kumar");

        // Creating container with empty value
//        Optional<String> container = Optional.empty();
        return container;
    }
    public static void main(String[] args) {
        Optional<String> containerValue = getName();
//
//      ifPresentOrElse() Demo :
//      containerValue.ifPresent(value ->{
//                                    System.out.println(value.toUpperCase());
//                                    });

////      ifPresentOrElse() Demo :
//        containerValue.ifPresentOrElse((value) ->{System.out.println(value.toUpperCase());},
//                                        () ->{System.out.println("No Value present in the container");}
//                                        );
//
//        .Or() Demo :
//        String orResult = containerValue.or(
//                ()->{return Optional.of("mahendra singh dhoni".toUpperCase());}
//                                            ).get();
//
//        System.out.println(orResult);


        //.orElse() Demo :
//        String orElseResult = containerValue.orElse("mahendra singh dhoni").toUpperCase();
//        System.out.println(orElseResult);

        //.OrElseGet() Demo : uses supplier to return different values at different times
//        String orElseGetResult = containerValue.orElseGet(()->{return "mahendra singh dhoni";});
//        System.out.println(orElseGetResult);

        //.orElseThrow() Demo :
//        String orElseThrowResult = containerValue.orElseThrow();
//        System.out.println(orElseThrowResult);

        //.orElseThrow() Demo :
//        try{
//            containerValue.orElseThrow(()->{
//                return new Exception("This is an exception, no value present in the container");
//            });
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//        String orElseThrowResult = containerValue.orElseThrow();
//        System.out.println(orElseThrowResult);

        //.equals() Demo :
        Optional<String> temp = Optional.of("Lowe Kumar");
        String equalsResult = String.valueOf(containerValue.equals(temp));
        System.out.println(equalsResult);

    }


}
