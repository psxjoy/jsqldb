package com.psxjoy.sqldb.parser;

public class Token {



    public enum Kind {
        KEYWORD,  // SQL keyword
        INDENT,  // identifier(table name, column name, etc.)
        STRING,  // String literal (single-quoted)
        NUMBER,  // Numeric literal ( integer or float)
        OPEN_PAREN,  // (
        CLOSE_PAREN,  // )
        COMMA,  // ,
        SEMICOLON,  //;
        ASTERISK,  // *
        PLUS,  // +
        MINUS,  // -
        SLASH,  // /
    }

    private final Kind kind;
    private final String value;
    private final Keyword keyword;

    public Token(Kind kind, String value, Keyword keyword) {
        this.kind = kind;
        this.value = value;
        this.keyword = keyword;
    }
}
