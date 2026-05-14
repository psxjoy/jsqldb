package com.psxjoy.sqldb.parser;

import java.util.HashMap;
import java.util.Map;

public enum Keyword {
    CREATE, TABLE, INT, INTEGER, BOOLEAN, BOOL, STRING, TEXT, VARCHAR,
    FLOAT, DOUBLE, SELECT, FROM, INSERT, INTO, VALUES,
    TRUE, FALSE, DEFAULT, NOT, NULL, PRIMARY, KEY;

    private static final Map<String, Keyword> LOOKUP = new HashMap<>();

    static {
        for (Keyword k : Keyword.values()) {
            LOOKUP.put(k.toString(), k);
        }
    }

    public static Keyword fromString(String ident) {
        return LOOKUP.get(ident.toUpperCase());
    }


}
