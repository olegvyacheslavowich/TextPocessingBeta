package kz.karpenko.io;

import java.io.*;

/**
 * Created by Олег on 11.02.2017.
 */
public class IO {

    public static String getFile(String path) {

        StringBuilder text = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            int i;
            while ((i = fileReader.read()) != -1) {
                text.append((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Read error");
        }

        return text.toString();
    }

    public static void writeFile(String str, String path) {

        try (FileWriter fileWriter = new FileWriter(path)) {
            for (int i = 0; i < str.length(); i++) {
                fileWriter.append(str.charAt(i));
            }
        } catch (IOException e) {
            System.out.println("Read error");
        }
    }
}
