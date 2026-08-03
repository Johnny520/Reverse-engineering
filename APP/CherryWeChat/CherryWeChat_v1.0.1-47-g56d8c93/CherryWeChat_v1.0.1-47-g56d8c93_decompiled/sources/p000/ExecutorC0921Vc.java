package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Vc */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0921Vc extends AbstractC2760yg implements Executor {

    /* JADX INFO: renamed from: b */
    public static final ExecutorC0921Vc f2876b = new ExecutorC0921Vc();

    /* JADX INFO: renamed from: c */
    public static final AbstractC1217bc f2877c;

    static {
        C1087ZC c1087zc = C1087ZC.f3464b;
        int i = AbstractC1356eA.f4858a;
        if (64 >= i) {
            i = 64;
        }
        f2877c = c1087zc.mo2018v(AbstractC0714Qj.m1477H("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1781t(C0366If.f1247a, runnable);
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac interfaceC1137ac, Runnable runnable) {
        f2877c.mo1781t(interfaceC1137ac, runnable);
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        return "Dispatchers.IO";
    }
}
