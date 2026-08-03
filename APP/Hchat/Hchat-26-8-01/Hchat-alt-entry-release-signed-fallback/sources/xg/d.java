package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends qg.m0 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xg.d f21615i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qg.p f21616j = null;

    static {
            xg.d r0 = new xg.d
            r0.<init>()
            xg.d.f21615i = r0
            xg.k r0 = xg.k.f21629i
            int r1 = vg.s.f14359a
            r2 = 64
            if (r2 >= r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = vg.a.j(r1, r2, r3)
            qg.p r0 = r0.y(r1)
            xg.d.f21616j = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot be invoked on Dispatchers.IO"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            wf.h r0 = wf.h.f20786g
            r1.w(r0, r2)
            return
    }

    @Override // qg.p
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // qg.p
    public final void w(wf.g r2, java.lang.Runnable r3) {
            r1 = this;
            qg.p r0 = xg.d.f21616j
            r0.w(r2, r3)
            return
    }
}
