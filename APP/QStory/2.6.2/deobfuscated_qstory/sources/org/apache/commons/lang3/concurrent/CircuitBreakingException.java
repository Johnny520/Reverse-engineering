package org.apache.commons.lang3.concurrent;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CircuitBreakingException extends RuntimeException {
    private static final long serialVersionUID = 1408176654686913340L;

    public CircuitBreakingException() {
    }

    public CircuitBreakingException(String str) {
        super(str);
    }

    public CircuitBreakingException(String str, Throwable th) {
        super(str, th);
    }

    public CircuitBreakingException(Throwable th) {
        super(th);
    }
}
