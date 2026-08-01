package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.exception.UncheckedException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class UncheckedExecutionException extends UncheckedException {
    private static final long serialVersionUID = 1;

    public UncheckedExecutionException(Throwable th) {
        super(th);
    }
}
