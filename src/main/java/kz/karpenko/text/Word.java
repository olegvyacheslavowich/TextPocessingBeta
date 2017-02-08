package kz.karpenko.text;

import java.util.ArrayList;

/**
 * Created by Олег on 06.02.2017.
 */
public class Word {

    private Sentence sentence;
    private ArrayList<String> words = new ArrayList<String>();

    public Word(Sentence sentence) {

        this.sentence = sentence;
        wordFromSentence();
    }

    private void wordFromSentence() {

        int finish = 0;
        char chars[] = {'.', ',', '!', '?', '-'};

        for (String str : sentence.getSentence()) {

            while (finish != str.length()) {

                int start = 0;
                if (str.indexOf(' ') != -1) {
                    finish = str.indexOf(' ');
                } else {
                    finish = str.length();
                }
                String word = str.substring(start, finish);
                for (Character ch : chars) {
                    if (word.indexOf(ch) != -1) {
                        word = word.substring(start, word.indexOf(ch));
                    }
                }
                words.add(word);
                if (finish != str.length()) {
                    str = str.substring(finish + 1, str.length());
                } else {
                    break;
                }

            }
        }


    }

    @Override
    public String toString() {

        String out = "";
        for (String str : words) {
            out += str + "\n";
        }
        return out;
    }
}

