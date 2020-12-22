package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import System.*;

public class Controller implements Initializable {
    Recipe rec = new Recipe();
    Ingredients ing = new Ingredients();


    @FXML
    TextArea ingredientsTxt = new TextArea();
    @FXML
    TextArea recipeTxt;
    @FXML
    ImageView imageView;
    @FXML
    Image start = new Image("Image/Start.png");

    @FXML
    Text prepTxt;

    @FXML
    Text cookTxt;

    @FXML
    Text servingTxt;

    @FXML
    Text menuNametxt;

    public String buttonAction;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        imageView.setImage(start);
    }

    public void handleTunaBtn() {
        menuNametxt.setText("Tuna Salad");
        ingredientsTxt.setEditable(false);
        ingredientsTxt.setText(" - 2 cans of tuna in water \n" + " - 2 spoons of creme fraiche  \n" +
                " - 1 teaspoon lemon juice \n" + " - Pepper");
        prepTxt.setText("5 mins");
        cookTxt.setText("10 mins");
        servingTxt.setText("4");
        recipeTxt.setText(" Drain the water from the tuna \n" +
                "Mix all the ingredients and cool for a few hours before serving");
        recipeTxt.setEditable(false);

        buttonAction = "Menu : Tuna Salad ";
        try {                   //Exceptions
            Data data = new Data();
            data.buttonAction = buttonAction;
            Persistance per = new Persistance();
            per.save(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public void handleSalmonBtn() {
        menuNametxt.setText("Grilled Salmon");
        ingredientsTxt.setEditable(false);
        ingredientsTxt.setText(" - 1 lemon,thinly sliced\n" + " - 2 salmon fillets, bones and skin removed\n" +
                        " - Coarse salt to taste\n" + " - Olive Oil\n" + "4 sprigs fresh rosemary(Optional)\n");
        prepTxt.setText("5 mins");
        cookTxt.setText("30 mins");
        servingTxt.setText("4");
        recipeTxt.setText( "  Preheat oven to 200 degrees C \n " +
                "  Arrange half the lemon slices in a single layer in a baking dish.\n " +
                " Layer with 2 sprigs rosemary or some hubs, and top with salmon fillets.\n" +
                "  Sprinkle salmon with salt, and top with remaining lemon slices.\n " +
                " Drizzle with olive oil.\n" +
                "  Bake 20 minutes in the preheated oven, or until fish is easily flaked with a fork.");
        recipeTxt.setEditable(false);

        buttonAction = "Menu : Grilled Salmon ";
        try {
            Data data = new Data();
            data.buttonAction = buttonAction;
            Persistance per = new Persistance();
            per.save(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public void handleIceCreamBtn() {
        menuNametxt.setText("Strawberry IceCream");
        ingredientsTxt.setEditable(false);
        ingredientsTxt.setText(" - 1 package frozen Strawberries\n" + " - 90g Sugar\n" +
                 " - 120g Heavy Cream\n");
        prepTxt.setText("5 mins");
        cookTxt.setText("5 mins");
        servingTxt.setText("4");
        recipeTxt.setText(  "Combine the frozen strawberries and sugar in a food processor or blender.\n " +
                "Process until the fruit is roughly chopped.\n " +
                "With the processor running, slowly pour in the heavy cream until fully incorporated.\n" +
                "Serve immediately, or freeze for up to one week.");
        recipeTxt.setEditable(false);

        buttonAction = "Menu : Strawberry IceCream ";
        try {
            Data data = new Data();
            data.buttonAction = buttonAction;
            Persistance per = new Persistance();
            per.save(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

}


