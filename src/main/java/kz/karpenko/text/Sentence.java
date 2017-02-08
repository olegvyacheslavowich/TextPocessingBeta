package kz.karpenko.text;

import java.util.ArrayList;

/**
 * Created by Олег on 06.02.2017.
 */
public class Sentence {

    private Paragraph paragraph;
    private ArrayList<String> sentence = new ArrayList<String>();

    public Sentence(Paragraph paragraph) {
        this.paragraph = paragraph;
        sentenceFromParagraph();
    }

    private void sentenceFromParagraph() {

        int finish = 0;

        for (String str : paragraph.getParagraphs()) {

            while (finish != str.length()) {

                int start = 0;
                if (str.indexOf('.') != -1) {
                    finish = str.indexOf('.') + 1;
                } else
                    finish = str.length();



                sentence.add(str.substring(start, finish));
                if (finish != str.length()) {
                    str = str.substring(finish + 1, str.length());
                } else {
                    break;
                }

            }
        }

    }


    public ArrayList<String> getSentence() {
        return sentence;
    }

    @Override
    public String toString() {

        String out = "";

        for (String str : sentence) {
            out += str + "\n";
        }
        return out;

    }
}
