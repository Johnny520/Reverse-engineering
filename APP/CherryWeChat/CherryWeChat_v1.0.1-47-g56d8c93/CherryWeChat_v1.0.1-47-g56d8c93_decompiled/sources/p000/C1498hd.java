package p000;

/* JADX INFO: renamed from: hd */
/* JADX INFO: loaded from: classes.dex */
public final class C1498hd extends AbstractC2210lx {

    /* JADX INFO: renamed from: c */
    public static final C1498hd f5281c;

    static {
        int i = AbstractC2224mA.f7738c;
        int i2 = AbstractC2224mA.f7739d;
        long j = AbstractC2224mA.f7740e;
        String str = AbstractC2224mA.f7736a;
        C1498hd c1498hd = new C1498hd();
        c1498hd.f7697b = new ExecutorC1365ec(i, i2, j, str);
        f5281c = c1498hd;
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
