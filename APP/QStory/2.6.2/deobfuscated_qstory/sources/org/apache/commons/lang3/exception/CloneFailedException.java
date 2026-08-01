package org.apache.commons.lang3.exception;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CloneFailedException extends RuntimeException {
    private static final long serialVersionUID = 20091223;

    public CloneFailedException(String str) {
        super(str);
    }

    public CloneFailedException(String str, Throwable th) {
        super(str, th);
    }

    public CloneFailedException(Throwable th) {
        super(th);
    }
}
