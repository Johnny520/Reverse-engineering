package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends qg.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Thread f11036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qg.g0 f11037k;

    public c(wf.g r2, java.lang.Thread r3, qg.g0 r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.f11036j = r3
            r1.f11037k = r4
            return
    }

    @Override // qg.y0
    public final void r(java.lang.Object r2) {
            r1 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r1.f11036j
            boolean r2 = gg.l.a(r2, r0)
            if (r2 != 0) goto Lf
            java.util.concurrent.locks.LockSupport.unpark(r0)
        Lf:
            return
    }
}
