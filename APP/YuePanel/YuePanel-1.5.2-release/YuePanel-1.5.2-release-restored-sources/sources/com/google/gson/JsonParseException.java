package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public class JsonParseException extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JsonParseException(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public JsonParseException(String str, Throwable th) {
        super(str, th);
    }

    public JsonParseException(Throwable th) {
        super(th);
    }
}
