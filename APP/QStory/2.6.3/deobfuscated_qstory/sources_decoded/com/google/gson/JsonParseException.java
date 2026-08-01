package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JsonParseException extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Throwable th) {
        super(str, th);
    }

    public JsonParseException(Throwable th) {
        super(th);
    }
}
