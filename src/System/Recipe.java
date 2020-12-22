package System;

import java.util.ArrayList;

public class Recipe {
    private String menuName;
    private String instructions;
    private int serving;
    private int prepTime;
    private int cookTime;
    ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();


   public Recipe () {    //constructors

    }




    public void addIngredients(String name) {
        ingredients.add(new Ingredients(name));  //ArrayList added

    }
    public void showIngredients() {
        System.out.println("Ingredients for " + menuName);
        System.out.println(ingredients.toString().replace(",","").
                replace("[","").replace("]",""));
        System.out.println("=================================================");

        }

        public void showMenuInfo() {
            System.out.println("PrepTime : " + prepTime + " mins" + "\n" + "CookTime : " +  cookTime + " mins"
                    + "\n" +"Serving : " + serving);
            System.out.println("=================================================");
        }


    public void showRecipes() {
        System.out.println(" - " + "Recipe for " + menuName + " - ");
        System.out.println(instructions);
    }
   //getter and Setter
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

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }
}
