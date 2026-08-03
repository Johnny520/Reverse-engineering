package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends qg.e1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wf.c f11128j;

    public z0(wf.g r2, fg.p r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            wf.c r2 = fb.v0.j(r3, r1, r1)
            r1.f11128j = r2
            return
    }

    @Override // qg.y0
    public final void T() {
            r2 = this;
            wf.c r0 = r2.f11128j
            wf.c r0 = fb.v0.x(r0)     // Catch: java.lang.Throwable -> Lc
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lc
            vg.a.h(r1, r0)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r2.resumeWith(r1)
            throw r0
    }
}
