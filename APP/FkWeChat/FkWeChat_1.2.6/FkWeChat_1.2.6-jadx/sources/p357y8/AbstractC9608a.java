package p357y8;

import p153k4.AbstractC3955e;
import p172l8.AbstractC4693f;

/* JADX INFO: renamed from: y8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9608a {
    /* JADX INFO: renamed from: a */
    public static final void m37577a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                AbstractC3955e.m15664a(autoCloseable);
                return;
            }
            try {
                AbstractC3955e.m15664a(autoCloseable);
            } catch (Throwable th2) {
                AbstractC4693f.m18753a(th, th2);
            }
        }
    }
}
