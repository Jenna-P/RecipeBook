package System;

public class Ingredients extends Nutrients{  //TODO skal lave den nærings..
   private String name;


   public Ingredients() {

   }


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


    public String toString() {
        return " - " + name;
    }
}
