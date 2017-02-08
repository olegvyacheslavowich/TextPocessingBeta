package kz.karpenko.text;

import java.util.ArrayList;

/**
 * Created by Олег on 06.02.2017.
 */
public class Symbol {
    private Sentence sentence;
    private ArrayList<Character> symbols = new ArrayList<Character>();

    public Symbol(Sentence sentence) {
        this.sentence = sentence;
        symbolFromSentence();
    }

    private void symbolFromSentence() {

        char chars[] = {'.', ',', '!', '?', '-'};
        for (String str : sentence.getSentence()) {
            for (Character ch : chars)
                if (str.indexOf(ch) != -1) {
                    symbols.add(ch);
                    str = str.substring(str.indexOf(ch), str.length());
                }
        }

    }

    @Override
    public String toString() {

        String out = "";

        for (Character chars : symbols) {
            out += chars + ", ";
        }
        return out;
    }
}

