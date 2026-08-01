package org.apache.commons.p014io;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
