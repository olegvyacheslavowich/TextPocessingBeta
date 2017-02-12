package kz.karpenko.parser;

import kz.karpenko.service.TextService;
import kz.karpenko.text.TextComponent;
import kz.karpenko.text.impl.Symbol;
import kz.karpenko.text.impl.TextComposite;

import java.util.regex.Matcher;


public class Parser {

    private static final String PARAGRAPH_REGULAR = "(\\n|^).*?(?=\\n|$)";
    private static final String SENTENCE_REGULAR = "([\\s-А-ЯA-Z](|[^?!.\\(]|\\([^\\)]*\\))*[.?!])";
    private static final String WORD_REGULAR = "([\\\\.,!\\\\?:;@]{1})|([^\\\\.,!\\\\?:;@]*)";


    public TextComponent parseText(String text) {

        TextComponent allText = new TextComposite();
        allText = parseParagraph(allText, text);

        return allText;
    }

    public TextComponent parseParagraph(TextComponent allText, String textTxt) {

        Matcher matcher = TextService.getByPattern(PARAGRAPH_REGULAR, textTxt);
        while (matcher.find()) {
            TextComponent paragraph = new TextComposite();
            paragraph = parseSentence(paragraph, textTxt);
            allText.addComponent(paragraph);
        }

        return allText;
    }

    private TextComponent parseSentence(TextComponent paragraph, String paragraphTxt) {

        Matcher matcher = TextService.getByPattern(SENTENCE_REGULAR, paragraphTxt);
        while (matcher.find()) {
            TextComponent sentence = new TextComposite();
            sentence = parseWord(sentence, matcher.group());
            paragraph.addComponent(sentence);
        }

        return paragraph;
    }


    private TextComponent parseWord(TextComponent sentence, String sentenceTxt) {

        Matcher matcher = TextService.getByPattern(WORD_REGULAR, sentenceTxt);

        while (matcher.find()) {
            TextComponent word = new TextComposite();
            word = parseSymbol(word, matcher.group());
            sentence.addComponent(word);
        }

        return sentence;
    }

    private TextComponent parseSymbol(TextComponent word, String wordTxt) {

        char[] ch = wordTxt.toCharArray();
        for (char sym : ch) {

            TextComponent symbol = new Symbol(sym);
            word.addComponent(symbol);
        }

        return word;
    }


}
