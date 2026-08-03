package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qg.p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xg.k f21629i = null;

    static {
            xg.k r0 = new xg.k
            r0.<init>()
            xg.k.f21629i = r0
            return
    }

    @Override // qg.p
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // qg.p
    public final void w(wf.g r3, java.lang.Runnable r4) {
            r2 = this;
            xg.e r3 = xg.e.f21617j
            r0 = 1
            xg.c r3 = r3.f21618i
            r1 = 0
            r3.b(r4, r0, r1)
            return
    }

    @Override // qg.p
    public final qg.p y(int r2) {
            r1 = this;
            vg.a.a(r2)
            int r0 = xg.j.f21626d
            if (r2 < r0) goto L8
            return r1
        L8:
            qg.p r2 = super.y(r2)
            return r2
    }
}
