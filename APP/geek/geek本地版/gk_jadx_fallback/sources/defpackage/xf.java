package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf extends defpackage.v10 {
    public static final defpackage.xf d = null;

    static {
            xf r0 = new xf
            int r2 = defpackage.x50.c
            int r3 = defpackage.x50.d
            long r4 = defpackage.x50.e
            java.lang.String r6 = defpackage.x50.a
            r0.<init>()
            ne r1 = new ne
            r1.<init>(r2, r3, r4, r6)
            r0.c = r1
            defpackage.xf.d = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dispatchers.Default cannot be closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.ke
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }
}
