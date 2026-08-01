package p007B0;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: B0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0202p extends CancellationException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0202p(long j5) {
        super("Timed out waiting for " + j5 + " ms");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC0208v.f710c);
        return this;
    }
}
