package System;

import java.util.ArrayList;

public class Recipe {
    private String menuName;
    private String instructions;
    private int serving;
    private int prepTime;
    ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();


    Recipe () {

    }

    Recipe(String menuName, int prepTime, int serving, String instructions) {
        this.menuName = menuName;
        this.prepTime = prepTime;
        this.serving = serving;
        this.instructions = instructions;
    }


    public void addIngredients(String name) {
        ingredients.add(new Ingredients(name));
       // for(Ingredients ingredient : ingredients)
       // System.out.println(ingredient);

    }
    public void showIngredients() {
        System.out.println("Ingredients for " + menuName);
        System.out.println(ingredients.toString().replace(",","").
                replace("[","").replace("]",""));

        }

    public void showRecipes() {
        System.out.println(" - " + "Recipe for " + menuName + " - ");
        System.out.println(instructions);
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String name) {
        this.menuName = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }



}
