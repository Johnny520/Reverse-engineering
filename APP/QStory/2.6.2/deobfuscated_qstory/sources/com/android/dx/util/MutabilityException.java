package com.android.dx.util;

import com.android.dex.util.ExceptionWithContext;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MutabilityException extends ExceptionWithContext {
    public MutabilityException(String str) {
        super(str);
    }

    public MutabilityException(Throwable th) {
        super(th);
    }

    public MutabilityException(String str, Throwable th) {
        super(str, th);
    }
}
