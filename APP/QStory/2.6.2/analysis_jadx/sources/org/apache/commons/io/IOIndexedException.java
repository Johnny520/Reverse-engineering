package org.apache.commons.io;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class IOIndexedException extends IOException {
    private static final long serialVersionUID = 1;
    private final int index;

    public IOIndexedException(int i, Throwable th) {
        super(toMessage(i, th), th);
        this.index = i;
    }

    public static String toMessage(int i, Throwable th) {
        return String.format("%s #%,d: %s", th == null ? "Null" : th.getClass().getSimpleName(), Integer.valueOf(i), th != null ? th.getMessage() : "Null");
    }

    public int getIndex() {
        return this.index;
    }
}
