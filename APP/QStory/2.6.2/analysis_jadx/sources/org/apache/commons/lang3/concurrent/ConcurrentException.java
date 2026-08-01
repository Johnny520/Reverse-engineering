package org.apache.commons.lang3.concurrent;

import p000.AbstractC6087;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentException extends Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentException(String str, Throwable th) {
        super(str, th);
        AbstractC6087.m11399(th);
    }

    public ConcurrentException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentException(Throwable th) {
        super(th);
        AbstractC6087.m11399(th);
    }
}
