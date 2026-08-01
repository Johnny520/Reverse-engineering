package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf extends v10 {
    public static final xf d = null;

    static {
        int r2 = x50.c;
        int r3 = x50.d;
        long r4 = x50.e;
        String r6 = x50.a;
        xf r0 = new xf();
        r0.c = new ne(r2, r3, r4, r6);
        d = r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ke
    public final String toString() {
        return "Dispatchers.Default";
    }
}
