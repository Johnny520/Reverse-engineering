package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Vc */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0921Vc extends AbstractC2760yg implements Executor {

    /* JADX INFO: renamed from: b */
    public static final ExecutorC0921Vc f2876b = null;

    /* JADX INFO: renamed from: c */
    public static final AbstractC1217bc f2877c = null;

    static {
        f2876b = new ExecutorC0921Vc();
        C1087ZC r0 = C1087ZC.f3464b;
        int r1 = AbstractC1356eA.f4858a;
        if (64 < r1) goto L6;
        r1 = 64;
    L6:
        f2877c = r0.mo2018v(AbstractC0714Qj.m1477H("kotlinx.coroutines.io.parallelism", r1, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        mo1781t(C0366If.f1247a, r2);
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac r2, Runnable r3) {
        f2877c.mo1781t(r2, r3);
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        return "Dispatchers.IO";
    }
}
