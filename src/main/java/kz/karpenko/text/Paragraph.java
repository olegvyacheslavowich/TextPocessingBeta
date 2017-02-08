package kz.karpenko.text;

import java.util.ArrayList;

/**
 * Created by Олег on 06.02.2017.
 */
public class Paragraph {

    private String text;
    private ArrayList<String> paragraphs = new ArrayList<String>();

    public Paragraph(Text text) {
        this.text = text.getText();
        paragraphsFromTxt();
    }

    private void paragraphsFromTxt() {

        int finish = 0;
        while (finish != text.length()) {
            int start = 0;
            if (text.indexOf('\n') != -1) {
                finish = text.indexOf('\n');
            } else {
                finish = text.length();
            }
            paragraphs.add(text.substring(start, finish));
            if (finish != text.length()) {
                text = text.substring(finish + 1, text.length());
            } else {
                break;
            }
        }
    }

    public ArrayList<String> getParagraphs() {
        return paragraphs;
    }

    @Override
    public String toString() {

        String out = "";
        for (String str : paragraphs) {
            out += str + "\n";

        }
        return out;
    }
}
