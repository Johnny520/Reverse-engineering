package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
