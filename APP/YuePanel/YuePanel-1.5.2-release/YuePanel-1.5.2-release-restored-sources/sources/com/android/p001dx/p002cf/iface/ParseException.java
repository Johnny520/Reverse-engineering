package com.android.p001dx.p002cf.iface;

import com.android.dex.util.ExceptionWithContext;

/* JADX INFO: loaded from: classes.dex */
public class ParseException extends ExceptionWithContext {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParseException(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ParseException(Throwable th) {
        super(th);
    }

    public ParseException(String str, Throwable th) {
        super(str, th);
    }
}
