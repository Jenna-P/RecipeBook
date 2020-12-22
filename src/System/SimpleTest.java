package System;

public class SimpleTest {
    Recipe iceCream = new Recipe();
    Recipe salmon = new Recipe();
    Recipe tuna = new Recipe();

    public static void main(String[] args) {
        SimpleTest st = new SimpleTest();
        st.showIceCreamRecipe();
        st.showSalmonRecipe();
        st.showTunaSaladRecipe();


    }


    public void showIceCreamRecipe() {
        iceCream.setMenuName("Strawberry IceCream");
        iceCream.setServing(10);
        iceCream.setPrepTime(30);
        iceCream.setCookTime(30);
        iceCream.setInstructions( "Combine the frozen strawberries and sugar in a food processor or blender.\n " +
                "Process until the fruit is roughly chopped.\n " +
                "With the processor running, slowly pour in the heavy cream until fully incorporated.\n" +
                "Serve immediately, or freeze for up to one week.");

        iceCream.addIngredients("1 package Frozen Strawberries \n");
        iceCream.addIngredients("Heavy Whipping Cream \n");
        iceCream.addIngredients("90g Sugar");
        iceCream.showIngredients();
        iceCream.showMenuInfo();
        iceCream.showRecipes();
        blankLine();

    }

    public void showSalmonRecipe() {
        salmon.setMenuName("Grilled Salmon");
        salmon.setServing(4);
        salmon.setPrepTime(5);
        salmon.setCookTime(30);
        salmon.setInstructions(  "  Preheat oven to 200 degrees C \n " +
                "  Arrange half the lemon slices in a single layer in a baking dish.\n " +
                " Layer with 2 sprigs rosemary or some hubs, and top with salmon fillets.\n" +
                "  Sprinkle salmon with salt, and top with remaining lemon slices.\n " +
                " Drizzle with olive oil.\n" +
                "  Bake 20 minutes in the preheated oven, or until fish is easily flaked with a fork.");

        salmon.addIngredients("1 lemon,thinly sliced \n");
        salmon.addIngredients("2 salmon fillets, bones and skin removed \n");
        salmon.addIngredients("Coarse salt to taste \n");
        salmon.addIngredients("Olive Oil \n");
        salmon.addIngredients("4 sprigs fresh rosemary(Optional)");
        salmon.showIngredients();
        salmon.showMenuInfo();
        salmon.showRecipes();
        blankLine();

    }
    public void showTunaSaladRecipe() {
        tuna.setMenuName("Tuna Salad");
        tuna.setServing(4);
        tuna.setPrepTime(5);
        tuna.setCookTime(10);
        tuna.setInstructions(  " Drain the water from the tuna \n" +
                        "Mix all the ingredients and cool for a few hours before serving");
        tuna.addIngredients("2 cans of tuna in water \n");
        tuna.addIngredients("2 spoons of creme fraiche  \n");
        tuna.addIngredients("1 teaspoon lemon juice \n");
        tuna.addIngredients("Pepper");
        tuna.showIngredients();
        tuna.showMenuInfo();
        tuna.showRecipes();
        blankLine();

    }

    public void blankLine() {
        System.out.println(" ");

    }


}
