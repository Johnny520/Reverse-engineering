package ec;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ec.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2162n1 {
    /* JADX INFO: renamed from: a */
    public static final CancellationException m7845a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
