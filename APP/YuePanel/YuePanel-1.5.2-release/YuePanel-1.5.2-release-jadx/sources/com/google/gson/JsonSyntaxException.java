package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonSyntaxException extends JsonParseException {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JsonSyntaxException(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public JsonSyntaxException(String str, Throwable th) {
        super(str, th);
    }

    public JsonSyntaxException(Throwable th) {
        super(th);
    }
}
