package io.pragra.learning.main;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Dish {
    private String name;
    private DishType type;
    private CusineType cusineType;
    private List <String>ingredients;
    private double price;

}
