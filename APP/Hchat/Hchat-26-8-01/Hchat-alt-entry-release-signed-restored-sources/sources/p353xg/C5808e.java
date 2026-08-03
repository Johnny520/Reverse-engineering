package p353xg;

import p249qg.AbstractC3583m0;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: xg.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5808e extends AbstractC3583m0 {

    /* JADX INFO: renamed from: j */
    public static final C5808e f23585j;

    /* JADX INFO: renamed from: i */
    public ExecutorC5806c f23586i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = AbstractC5813j.f23593c;
        int i10 = AbstractC5813j.f23594d;
        long j3 = AbstractC5813j.f23595e;
        String str = AbstractC5813j.f23591a;
        C5808e c5808e = new C5808e();
        c5808e.f23586i = new ExecutorC5806c(i9, i10, j3, str);
        f23585j = c5808e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    public final String toString() {
        return "Dispatchers.Default";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: w */
    public final void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        ExecutorC5806c.m10530c(this.f23586i, runnable, 6);
    }
}
