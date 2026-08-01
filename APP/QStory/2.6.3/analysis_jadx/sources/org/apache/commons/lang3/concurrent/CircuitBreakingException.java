package org.apache.commons.lang3.concurrent;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
