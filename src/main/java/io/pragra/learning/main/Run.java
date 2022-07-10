package io.pragra.learning.main;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.Collector;

public class Run {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        //List<Dish> vegUber = dishes.stream().filter(d->d.getType()== DishType.VEG)
               // .map(d->{d.setPrice(d.getPrice()+2);return d;})


    }
    public static void addDishes(List <Dish> dishes){
        dishes.add(
                Dish.builder()
                        .name("Butter chicken")
                        .cusineType(CusineType.INDIAN).
                        ingredients(Arrays.asList("Chicken","spices","onion")
                                        .type(DishType.NON_VEG)
                                        .price (18.99)
                                        .build () );
        Dish.builder()
                .name(" Veg Biriyani")
                .cusineType(CusineType.INDIAN).
                ingredients(Arrays.asList("Vegetables","spices","rice")
                        .type(DishType.VEG)
                        .price (20.99)
                        .build () );
        Dish.builder()
                .name("Dosa")
                .cusineType(CusineType.INDIAN).
                ingredients(Arrays.asList("batter","sugar")
                        .type(DishType.VEG)
                        .price (10)
                        .build () );
        



    }
}


