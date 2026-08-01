package org.apache.commons.io;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class IOExceptionWithCause extends IOException {
    private static final long serialVersionUID = 1;

    public IOExceptionWithCause(String str, Throwable th) {
        super(str, th);
    }

    public IOExceptionWithCause(Throwable th) {
        super(th);
    }
}
