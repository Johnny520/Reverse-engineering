package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class TextFormat$ParseException extends IOException {
    private static final long serialVersionUID = 3196188060225107702L;
    private final int column;
    private final int line;

    public TextFormat$ParseException(int i, int i2, String str) {
        super(Integer.toString(i) + ":" + i2 + ": " + str);
        this.line = i;
        this.column = i2;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public TextFormat$ParseException(String str) {
        this(-1, -1, str);
    }
}
