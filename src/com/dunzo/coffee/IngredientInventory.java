package com.dunzo.coffee;

import java.util.HashMap;
import java.util.Map;
public class IngredientInventory {

    Map<Ingredient, Integer> ingredientInventoryMap = new HashMap<>();

    public void addIngredient(Ingredient ingredient, int volume) {
        ingredientInventoryMap.put(ingredient, volume);
    }

    public boolean getIngredient(Ingredient ingredient, int requestedVolume) {
        if (!ingredientInventoryMap.containsKey(ingredient)) {
            throw new
                    RuntimeException("Ingredient " + ingredient.name + " Not Found!!");
        }
        int curVolume = ingredientInventoryMap.getOrDefault(ingredient, 0);
        if (curVolume < requestedVolume) {
            throw new
                    RuntimeException("Insufficient amount of ingredient!! : "
                    + ingredient.name);
        }
        curVolume = (curVolume - requestedVolume);
        ingredientInventoryMap.put(ingredient, curVolume);
        if (curVolume < 10) {
            sendAlert(ingredient);
        }
        return true;
    }

    // send alert to admin
    private void sendAlert(Ingredient ingredient) {
        System.out.println("Ingredient is low");
    }
}
