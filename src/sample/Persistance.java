package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Persistance {

    public void save(Data data) throws IOException {
        File file = new File("src/log.txt");
        FileWriter output = new FileWriter(file, true);

        output.append(data.date + " - " + data.buttonAction + "\n");
        System.out.println(data.date + " - " + data.buttonAction);

        output.close();
    }

    public Data load() throws FileNotFoundException {
        File file = new File("src/log.txt");
        Scanner input = new Scanner(file);
        Data data = new Data();
        data.buttonAction = input.next();

        return data;
    }
}
