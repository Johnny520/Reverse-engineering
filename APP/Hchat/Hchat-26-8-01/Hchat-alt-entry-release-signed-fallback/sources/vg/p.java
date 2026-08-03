package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class p extends qg.a implements yf.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wf.c f14355j;

    public p(wf.c r2, wf.g r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r3, r0)
            r1.f14355j = r2
            return
    }

    @Override // qg.y0
    public final boolean N() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // yf.d
    public final yf.d getCallerFrame() {
            r2 = this;
            wf.c r0 = r2.f14355j
            boolean r1 = r0 instanceof yf.d
            if (r1 == 0) goto L9
            yf.d r0 = (yf.d) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // qg.y0
    public void r(java.lang.Object r2) {
            r1 = this;
            wf.c r0 = r1.f14355j
            wf.c r0 = fb.v0.x(r0)
            java.lang.Object r2 = qg.v.r(r2)
            vg.a.h(r2, r0)
            return
    }

    @Override // qg.y0
    public void u(java.lang.Object r2) {
            r1 = this;
            wf.c r0 = r1.f14355j
            java.lang.Object r2 = qg.v.r(r2)
            r0.resumeWith(r2)
            return
    }
}
