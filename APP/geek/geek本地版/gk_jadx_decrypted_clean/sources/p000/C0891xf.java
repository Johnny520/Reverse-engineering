package p000;

/* JADX INFO: renamed from: xf */
/* JADX INFO: loaded from: classes.dex */
public final class C0891xf extends v10 {

    /* JADX INFO: renamed from: d */
    public static final C0891xf f5159d;

    static {
        int i = x50.f5098c;
        int i2 = x50.f5099d;
        long j = x50.f5100e;
        String str = x50.f5096a;
        C0891xf c0891xf = new C0891xf();
        c0891xf.f4786c = new ExecutorC0519ne(i, i2, j, str);
        f5159d = c0891xf;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.AbstractC0408ke
    public final String toString() {
        return "Dispatchers.Default";
    }
}
