package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
