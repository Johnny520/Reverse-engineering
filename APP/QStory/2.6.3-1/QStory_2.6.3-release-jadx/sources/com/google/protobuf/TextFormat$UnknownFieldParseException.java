package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class TextFormat$UnknownFieldParseException extends TextFormat$ParseException {
    private final String unknownField;

    public TextFormat$UnknownFieldParseException(String str) {
        this(-1, -1, "", str);
    }

    public String getUnknownField() {
        return this.unknownField;
    }

    public TextFormat$UnknownFieldParseException(int i, int i2, String str, String str2) {
        super(i, i2, str2);
        this.unknownField = str;
    }
}
