package kz.karpenko.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Олег on 06.02.2017.
 */
public class Text {
    private String text = "";
    //private Scanner scanner;
    private FileReader fileReader;

    public Text(String path) {
        try {
            fileReader = new FileReader("src/main/resources/Text.txt");
            int c;
            while ((c = fileReader.read()) != -1) {
                text += (char) c;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла !");
        }
    }

    public String getText() {
        return text;
    }
}
