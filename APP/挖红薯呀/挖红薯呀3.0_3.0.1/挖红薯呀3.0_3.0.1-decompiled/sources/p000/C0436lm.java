package p000;

/* JADX INFO: renamed from: lm */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436lm extends AbstractC0295ht {

    /* JADX INFO: renamed from: g */
    public static final C0436lm f3522g;

    /* JADX INFO: renamed from: f */
    public ExecutorC0929xk f3523f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = q61.f5074c;
        int i2 = q61.f5075d;
        long j = q61.f5076e;
        String str = q61.f5072a;
        C0436lm c0436lm = new C0436lm();
        c0436lm.f3523f = new ExecutorC0929xk(i, i2, j, str);
        f3522g = c0436lm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    /* JADX INFO: renamed from: e */
    public final void mo358e(InterfaceC0618pk interfaceC0618pk, Runnable runnable) {
        ExecutorC0929xk.m5137c(this.f3523f, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0692rk
    public final String toString() {
        return "Dispatchers.Default";
    }
}
