package kz.karpenko.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Олег on 09.02.2017.
 */
public class TextService {

    public static Matcher getByPattern(String regularExpressions, String strToMatch) {

        Pattern pattern = Pattern.compile(regularExpressions);

        return pattern.matcher(strToMatch);
    }
}
