package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 extends ch0 {
    public static final c60 k;
    public i20 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = jy2.c;
        int i2 = jy2.d;
        long j = jy2.e;
        String str = jy2.a;
        c60 c60Var = new c60();
        c60Var.j = new i20(i, i2, j, str);
        k = c60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final void D(a20 a20Var, Runnable runnable) {
        i20.e(this.j, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final String toString() {
        return "Dispatchers.Default";
    }
}
