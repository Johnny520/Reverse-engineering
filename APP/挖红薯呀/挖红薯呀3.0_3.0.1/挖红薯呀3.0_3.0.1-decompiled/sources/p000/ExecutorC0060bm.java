package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: bm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0060bm extends AbstractC0295ht implements Executor {

    /* JADX INFO: renamed from: f */
    public static final ExecutorC0060bm f545f = new ExecutorC0060bm();

    /* JADX INFO: renamed from: g */
    public static final AbstractC0692rk f546g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        oa1 oa1Var = oa1.f4499f;
        int i = a61.f60a;
        if (64 >= i) {
            i = 64;
        }
        f546g = oa1Var.mo2815i(j50.m1674x(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: e */
    public final void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        f546g.mo358e(interfaceC0618pk, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo358e(C0220fs.f1799d, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    public final String toString() {
        return "Dispatchers.IO";
    }
}
