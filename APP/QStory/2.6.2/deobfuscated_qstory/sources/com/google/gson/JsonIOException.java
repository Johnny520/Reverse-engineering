package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class JsonIOException extends JsonParseException {
    private static final long serialVersionUID = 1;

    public JsonIOException(String str) {
        super(str);
    }

    public JsonIOException(String str, Throwable th) {
        super(str, th);
    }

    public JsonIOException(Throwable th) {
        super(th);
    }
}
