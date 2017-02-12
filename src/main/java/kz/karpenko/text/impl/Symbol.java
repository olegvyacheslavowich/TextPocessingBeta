package kz.karpenko.text.impl;

import kz.karpenko.text.TextComponent;

/**
 * Created by Олег on 09.02.2017.
 */
public class Symbol implements TextComponent {

    private char symbol;

    public Symbol(char symbol) {

        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

    @Override
    public void addComponent(TextComponent tc) {
        throw new UnsupportedOperationException();
    }
}
