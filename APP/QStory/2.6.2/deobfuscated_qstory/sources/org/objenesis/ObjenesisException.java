package org.objenesis;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ObjenesisException extends RuntimeException {
    private static final long serialVersionUID = -2677230016262426968L;

    public ObjenesisException(String str) {
        super(str);
    }

    public ObjenesisException(Throwable th) {
        super(th);
    }

    public ObjenesisException(String str, Throwable th) {
        super(str, th);
    }
}
