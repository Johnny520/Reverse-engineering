package org.apache.commons.lang3.concurrent;

import com.bumptech.glide.AbstractC3888;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -6582182735562919670L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentRuntimeException(String str, Throwable th) {
        super(str, th);
        AbstractC3888.m7260(th);
    }

    public ConcurrentRuntimeException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentRuntimeException(Throwable th) {
        super(th);
        AbstractC3888.m7260(th);
    }
}
