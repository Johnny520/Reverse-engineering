package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t50 extends ch0 implements Executor {

    /* JADX INFO: renamed from: j */
    public static final t50 f10560j = new t50();

    /* JADX INFO: renamed from: k */
    public static final c20 f10561k;

    static {
        f83 f83Var = f83.f2861j;
        int i = nx2.f7364a;
        if (64 >= i) {
            i = 64;
        }
        f10561k = f83Var.mo614F(AbstractC0738tl.m5296Y("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: D */
    public final void mo612D(a20 a20Var, Runnable runnable) {
        f10561k.mo612D(a20Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo612D(zd0.f13837h, runnable);
    }

    @Override // p000.c20
    public final String toString() {
        return "Dispatchers.IO";
    }
}
