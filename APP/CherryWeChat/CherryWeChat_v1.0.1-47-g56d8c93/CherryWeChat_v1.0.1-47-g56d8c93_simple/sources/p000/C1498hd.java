package p000;

/* JADX INFO: renamed from: hd */
/* JADX INFO: loaded from: classes.dex */
public final class C1498hd extends AbstractC2210lx {

    /* JADX INFO: renamed from: c */
    public static final C1498hd f5281c = null;

    static {
        int r2 = AbstractC2224mA.f7738c;
        int r3 = AbstractC2224mA.f7739d;
        long r4 = AbstractC2224mA.f7740e;
        String r6 = AbstractC2224mA.f7736a;
        C1498hd r0 = new C1498hd();
        r0.f7697b = new ExecutorC1365ec(r2, r3, r4, r6);
        f5281c = r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC1217bc
    public final String toString() {
        return "Dispatchers.Default";
    }
}
