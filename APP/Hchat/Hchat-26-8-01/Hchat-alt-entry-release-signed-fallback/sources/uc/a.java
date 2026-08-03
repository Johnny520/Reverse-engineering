package uc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements uc.b {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // uc.b
    public final java.util.List j() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<ff.c> r1 = ff.c.class
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            ff.c r2 = (ff.c) r2
            r0.add(r2)
            goto Lf
        L1f:
            return r0
    }
}
