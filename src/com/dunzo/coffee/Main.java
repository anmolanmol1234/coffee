package com.dunzo.coffee;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        IngredientInventory inventory = new IngredientInventory();

        Ingredient ingredient1 = new Ingredient("ING1");
        Ingredient ingredient2 = new Ingredient("ING2");
        Ingredient ingredient3 = new Ingredient("ING3");
        Water water = new Water("water");

        inventory.addIngredient(ingredient1, 30);
        inventory.addIngredient(ingredient2, 40);
        inventory.addIngredient(ingredient3, 30);
        inventory.addIngredient(water, 30);

        Recipe recipe = new Recipe();
        ArrayList<String> instructionList = new ArrayList<>();

        instructionList.add("ING1");
        instructionList.add("ING2");
        instructionList.add("water");

        Map<Ingredient, Integer> ingredientMap = new LinkedHashMap<>();
        ingredientMap.put(ingredient1, 1);
        ingredientMap.put(ingredient2, 1);
        ingredientMap.put(water, 3);

	    Mixer mixer = new Mixer(inventory);
	    mixer.makeDrink("CAPPUCCINO", instructionList, ingredientMap);

        Map<Ingredient, Integer> ingredientMap1 = new LinkedHashMap<>();
        ingredientMap.put(ingredient1, 20);
        ingredientMap.put(ingredient3, 20);
        ingredientMap.put(water, 10);

        Mixer mixer1 = new Mixer(inventory);
        mixer1.makeDrink("AMERICANO", instructionList, ingredientMap);

    }
}
