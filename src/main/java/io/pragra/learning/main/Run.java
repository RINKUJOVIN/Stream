package io.pragra.learning.main;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Collector;

public class Run {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        addDishes(dishes);
        //System.out.println(dishes);

       /* List<Dish> vegUber = dishes.stream().filter(d -> d.getType() == DishType.VEG)
                .map(d -> {d.setPrice(d.getPrice() + 2);return d;})
                .collect(Collectors.toList());
        System.out.println(vegUber);*/

       /* List<String> list = dishes.stream().filter(d->(d.getType()==DishType.VEG) &&
                (d.getCusineType()== CusineType.INDIAN)).distinct().map(d->d.getName())
                .collect(Collectors.toList());
        System.out.println(list);*/

        //distinct-> avoid duplicate values

       /* Optional<Dish> first = dishes.stream().filter(d -> (d.getType() == DishType.VEG) &&
                (d.getCusineType() == CusineType.INDIAN)).distinct().findFirst();
        if (first.isPresent()){

        System.out.println(first.get());
        }*/
        List<List<String>> collect = dishes.stream().map(Dish::getIngredients).collect(Collectors.toList());
        List<String> shoppingList = dishes.stream().flatMap(d -> d.getIngredients().stream()).distinct().collect(Collectors.toList());
        //System.out.println(collect);
        //System.out.println(shoppingList);

        //dishes.stream().dropWhile(d -> d.getType() == DishType.NON_VEG).collect(Collectors.toList());;

        // dishes.stream().flatMap(d -> d.getIngredients().stream()).distinct().collect(Collectors.toCollection(LinkedList::new));

       // String collect1 = dishes.stream().flatMap(d -> d.getIngredients().stream()).distinct().collect(Collectors.joining("|"));


        DoubleSummaryStatistics collect2 = dishes.stream().collect(Collectors.summarizingDouble(d -> d.getPrice()));
        //System.out.println(collect2);

        Map<DishType, List<Dish>> map = dishes.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.toList()));
       // System.out.println(map);

        Integer reduce = Stream.of(1, 2, 3, 4, 5, 6).reduce(1, (a, b) -> a * b);
        System.out.println(reduce);


    }
    private static void addDishes(List <Dish> dishes){
        dishes.add(
                Dish.builder()
                        .name("Butter chicken")
                        .cusineType(CusineType.INDIAN).
                        ingredients(Arrays.asList("Chicken","spices","onion","butter","salt"))
                                        .type(DishType.NON_VEG)
                                        .price (18.99)
                                        .build ());
        dishes.add(
        Dish.builder()
                .name(" Veg Biriyani")
                .cusineType(CusineType.INDIAN).
                ingredients(Arrays.asList("Vegetables","spices","rice","salt","onion"))
                        .type(DishType.VEG)
                        .price (14.99)
                        .build ());
        dishes.add(
        Dish.builder()
                .name("Hakka Noodles")
                .cusineType(CusineType.CHINESE).
                ingredients(Arrays.asList("Noodles","spices","salt","onion"))
                        .type(DishType.VEG)
                        .price (10)
                        .build () );
        dishes.add(
                Dish.builder()
                        .name("Chilli chicken")
                        .cusineType(CusineType.CHINESE).
                        ingredients(Arrays.asList("Chicken","Soya souce","salt","onion"))
                        .type(DishType.NON_VEG)
                        .price (18.99)
                        .build () );




    }
}


