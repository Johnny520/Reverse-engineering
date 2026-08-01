package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.exception.UncheckedException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class UncheckedTimeoutException extends UncheckedException {
    private static final long serialVersionUID = 1;

    public UncheckedTimeoutException(Throwable th) {
        super(th);
    }
}
