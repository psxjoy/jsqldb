package com.psxjoy.sqldb.parser;

public class Lexer {
    private final String input;
    private int pos;

    public Lexer(String sql) {
        this.input = sql;
        this.pos = 0;
    }

    private void eraseWhitespace() {
        while (pos < input.length() && Character.isWhitespace(input.charAt(pos))) {
            pos++;
        }
    }

    public Token scan(){
        eraseWhitespace();
        if (pos >= input.length()) {
            return null;
        }
        return null;
    }

}
