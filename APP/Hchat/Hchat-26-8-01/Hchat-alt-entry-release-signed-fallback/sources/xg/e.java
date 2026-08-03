package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qg.m0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final xg.e f21617j = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xg.c f21618i;

    static {
            xg.e r0 = new xg.e
            int r2 = xg.j.f21625c
            int r3 = xg.j.f21626d
            long r4 = xg.j.f21627e
            java.lang.String r6 = xg.j.f21623a
            r0.<init>()
            xg.c r1 = new xg.c
            r1.<init>(r2, r3, r4, r6)
            r0.f21618i = r1
            xg.e.f21617j = r0
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

    @Override // qg.p
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }

    @Override // qg.p
    public final void w(wf.g r2, java.lang.Runnable r3) {
            r1 = this;
            xg.c r2 = r1.f21618i
            r0 = 6
            xg.c.c(r2, r3, r0)
            return
    }
}
