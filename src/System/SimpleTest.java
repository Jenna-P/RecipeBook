package System;

public class SimpleTest {
    Recipe iceCream = new Recipe();

    public static void main(String[] args) {
       new SimpleTest().showIceCreamRecipe();

    }

    public void blankLine() {
        System.out.println("===========================================");

    }

    public void showIceCreamRecipe() {
        iceCream.setMenuName("Strawberry IceCream");
        iceCream.setServing(10);
        iceCream.setPrepTime(30);
        iceCream.setInstructions( "Combine the frozen strawberries and sugar in a food processor or blender.\n " +
                "Process until the fruit is roughly chopped.\n " +
                "With the processor running, slowly pour in the heavy cream until fully incorporated.\n" +
                "Serve immediately, or freeze for up to one week.");

        iceCream.addIngredients("1 package Frozen Strawberries \n");
        iceCream.addIngredients("Heavy Whipping Cream \n");
        iceCream.addIngredients("90g Sugar \n");
        iceCream.showIngredients();
        blankLine();
        iceCream.showRecipes();

       // System.out.println("Recipe is uploaded : " + iceCream.getName() + "\n");
      //  System.out.println("Ingredients : ");
      //  System.out.println(iceCream.getPrepTime() + "\n");

    }


}
