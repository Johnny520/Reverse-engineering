package p201m3;

import java.util.concurrent.Executor;
import p074O2.C1052j;
import p074O2.InterfaceC1051i;
import p160f3.AbstractC2110M;
import p160f3.AbstractC2153p;
import p190k3.AbstractC2453a;
import p190k3.AbstractC2472t;

/* JADX INFO: renamed from: m3.d */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2607d extends AbstractC2110M implements Executor {

    /* JADX INFO: renamed from: f */
    public static final ExecutorC2607d f8303f = new ExecutorC2607d();

    /* JADX INFO: renamed from: g */
    public static final AbstractC2153p f8304g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C2615l c2615l = C2615l.f8317f;
        int i5 = AbstractC2472t.f7960a;
        if (64 >= i5) {
            i5 = 64;
        }
        f8304g = c2615l.mo3976F(AbstractC2453a.m4382j(i5, 12, "kotlinx.coroutines.io.parallelism"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: D */
    public final void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        f8304g.mo1207D(interfaceC1051i, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1207D(C1052j.f3286d, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2153p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
