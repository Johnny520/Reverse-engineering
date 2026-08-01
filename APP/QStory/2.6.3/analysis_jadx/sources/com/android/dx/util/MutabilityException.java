package com.android.dx.util;

import com.android.dex.util.ExceptionWithContext;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
