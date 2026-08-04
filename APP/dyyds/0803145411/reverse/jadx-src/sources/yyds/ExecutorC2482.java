package yyds;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᲇᛷᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2482 extends AbstractC0428 implements Executor {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final AbstractC0974 f12271;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final ExecutorC2482 f12272 = new ExecutorC2482();

    static {
        C2119 c2119 = C2119.f10465;
        int i = AbstractC1445.f6859;
        if (64 >= i) {
            i = 64;
        }
        f12271 = c2119.mo2116(AbstractC1544.m3183("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1251(C2586.f12764, runnable);
    }

    @Override // yyds.AbstractC0974
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public final void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable) {
        f12271.mo1251(interfaceC2213, runnable);
    }
}
