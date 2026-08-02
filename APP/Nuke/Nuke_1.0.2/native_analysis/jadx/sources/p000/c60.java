package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 extends ch0 {

    /* JADX INFO: renamed from: k */
    public static final c60 f1211k;

    /* JADX INFO: renamed from: j */
    public i20 f1212j;

    static {
        int i = jy2.f5279c;
        int i2 = jy2.f5280d;
        long j = jy2.f5281e;
        String str = jy2.f5277a;
        c60 c60Var = new c60();
        c60Var.f1212j = new i20(i, i2, j, str);
        f1211k = c60Var;
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: D */
    public final void mo612D(a20 a20Var, Runnable runnable) {
        i20.m2248e(this.f1212j, runnable, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.c20
    public final String toString() {
        return "Dispatchers.Default";
    }
}
