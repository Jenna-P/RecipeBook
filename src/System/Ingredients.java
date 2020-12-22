package System;

public class Ingredients {
   private String name;
   private int calories;


    Ingredients(String name) {
        this.name = name;
       // this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String toString() {
        return " - " + name;
    }
}
