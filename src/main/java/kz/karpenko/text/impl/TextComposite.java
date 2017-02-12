package kz.karpenko.text.impl;

import kz.karpenko.text.TextComponent;

import java.util.ArrayList;

/**
 * Created by Олег on 09.02.2017.
 */
public class TextComposite implements TextComponent {


    private ArrayList<TextComponent> textComponents = new ArrayList<>();

    public void addComponent(TextComponent tc) {
        textComponents.add(tc);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (TextComponent textComponent : textComponents) {
            sb.append(textComponent.toString());
        }

        return sb.toString();


    }
}
