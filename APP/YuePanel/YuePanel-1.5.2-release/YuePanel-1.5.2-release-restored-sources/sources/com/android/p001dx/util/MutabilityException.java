package com.android.p001dx.util;

import com.android.dex.util.ExceptionWithContext;

/* JADX INFO: loaded from: classes.dex */
public class MutabilityException extends ExceptionWithContext {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MutabilityException(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MutabilityException(Throwable th) {
        super(th);
    }

    public MutabilityException(String str, Throwable th) {
        super(str, th);
    }
}
