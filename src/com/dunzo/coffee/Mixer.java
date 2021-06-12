package com.dunzo.coffee;

import java.util.List;
import java.util.Map;
public class Mixer {

    private IngredientInventory ingredientInventory;

    public Mixer(IngredientInventory ingredientInventory) {
        this.ingredientInventory = ingredientInventory;
    }

    public Drink makeDrink(String drinkName, List<String> instructionList,
                           Map<Ingredient, Integer> ingredientMap) {
        for (Ingredient ingredient : ingredientMap.keySet()) {
            if (ingredientInventory.getIngredient(ingredient, ingredientMap.get(ingredient))) {
                continue;
            }
        }
        if (drinkName.equals(Constant.DRINKS.CAPPUCCINO)) {
            return new Cappuccino(drinkName);
        } else if (drinkName.equals(Constant.DRINKS.AMERICANO)) {
            return new Americano(drinkName);
        } else if (drinkName.equals(Constant.DRINKS.ESPRESSO)) {
            return new Espresso(drinkName);
        }
        return null;
    }
}
