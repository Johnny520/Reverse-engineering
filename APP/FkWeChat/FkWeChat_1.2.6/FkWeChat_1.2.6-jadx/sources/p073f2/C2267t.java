package p073f2;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: f2.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2267t extends CancellationException {
    public C2267t(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(AbstractC2280z0.f6257a);
        return this;
    }
}
