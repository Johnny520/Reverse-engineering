package p000;

/* JADX INFO: renamed from: yf */
/* JADX INFO: loaded from: classes.dex */
public final class C0928yf extends c20 {

    /* JADX INFO: renamed from: d */
    public static final C0928yf f5429d;

    static {
        int i = d60.f1320c;
        int i2 = d60.f1321d;
        long j = d60.f1322e;
        String str = d60.f1318a;
        C0928yf c0928yf = new C0928yf();
        c0928yf.f811c = new ExecutorC0556oe(i, i2, j, str);
        f5429d = c0928yf;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC0445le
    public final String toString() {
        return "Dispatchers.Default";
    }
}
