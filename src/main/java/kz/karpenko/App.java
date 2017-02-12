package kz.karpenko;

import kz.karpenko.io.IO;
import kz.karpenko.parser.Parser;
import kz.karpenko.service.TextService;
import kz.karpenko.text.TextComponent;

import java.util.regex.Matcher;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Parser parser = new Parser();
        TextComponent parsed = parser.parseText(IO.getFile("src/main/resources/Text.txt"));
        IO.writeFile(parsed.toString(), "ParsedText.txt");
    }
}
