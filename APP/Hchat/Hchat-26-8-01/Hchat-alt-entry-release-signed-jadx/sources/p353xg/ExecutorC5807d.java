package p353xg;

import java.util.concurrent.Executor;
import p249qg.AbstractC3583m0;
import p249qg.AbstractC3591p;
import vg.AbstractC4552a;
import vg.AbstractC4570s;
import wf.C5562h;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: xg.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5807d extends AbstractC3583m0 implements Executor {

    /* JADX INFO: renamed from: i */
    public static final ExecutorC5807d f23583i = new ExecutorC5807d();

    /* JADX INFO: renamed from: j */
    public static final AbstractC3591p f23584j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C5814k c5814k = C5814k.f23597i;
        int i9 = AbstractC4570s.f15055a;
        if (64 >= i9) {
            i9 = 64;
        }
        f23584j = c5814k.mo7543y(AbstractC4552a.m8991j(i9, 12, "kotlinx.coroutines.io.parallelism"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo7538w(C5562h.f22661g, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    public final String toString() {
        return "Dispatchers.IO";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: w */
    public final void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        f23584j.mo7538w(interfaceC5561g, runnable);
    }
}
