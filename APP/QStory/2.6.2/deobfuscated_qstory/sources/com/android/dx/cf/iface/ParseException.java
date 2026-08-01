package com.android.dx.cf.iface;

import com.android.dex.util.ExceptionWithContext;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ParseException extends ExceptionWithContext {
    public ParseException(String str) {
        super(str);
    }

    public ParseException(Throwable th) {
        super(th);
    }

    public ParseException(String str, Throwable th) {
        super(str, th);
    }
}
