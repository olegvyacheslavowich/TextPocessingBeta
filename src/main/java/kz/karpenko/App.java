package kz.karpenko;

import kz.karpenko.text.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Text text = new Text("Text.txt");

        Paragraph paragraph = new Paragraph(text);
        System.out.println(paragraph.toString());

        Sentence sentence = new Sentence(paragraph);
        System.out.println(sentence.toString());

        Word word = new Word(sentence);
        System.out.println(word.toString());

        Symbol symbol = new Symbol(sentence);
        System.out.println(symbol.toString());


    }
}
