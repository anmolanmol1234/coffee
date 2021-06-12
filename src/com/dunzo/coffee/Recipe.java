package com.dunzo.coffee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class Recipe {

    private List<String> instructionList;
    // ingredient should be used in same order of insertion while
    // making the drink - thus we have used a LinkedHashMap
    Map<Ingredient, Integer> ingredientMap = new LinkedHashMap<>();

    public Map<Ingredient, Integer> getIngredientMap() {
        return this.ingredientMap;
    }

    public List<String> getInstructionList() {
        return instructionList;
    }

    public void setInstructionList(List<String> instructionList) {
        this.instructionList = instructionList;
    }

    public void addIngredient(Ingredient ingredient, int ingredientAmount) {
        this.ingredientMap.put(ingredient, ingredientAmount);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "instructionList=" + instructionList +
                ", ingredientMap=" + ingredientMap +
                '}';
    }
}
