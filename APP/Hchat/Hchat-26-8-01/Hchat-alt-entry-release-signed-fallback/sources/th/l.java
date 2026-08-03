package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends y0.n implements x1.m, x1.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public th.j f13325u;

    @Override // x1.m
    public final void B(x1.h0 r7) {
            r6 = this;
            r7.e()
            th.j r0 = r6.f13325u
            i1.b r0 = r0.f13318a
            h1.b r1 = r7.f20932g
            long r1 = r1.a()
            long r1 = r9.e0.p0(r1)
            x1.f0 r3 = x1.k.w(r6)
            u2.c r3 = r3.E
            th.h r4 = new th.h
            r5 = 3
            r4.<init>(r3, r6, r7, r5)
            r7.y(r1, r4, r0)
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            th.j r0 = r2.f13325u
            r1 = 0
            i0.j1 r0 = r0.f13320c
            r0.setValue(r1)
            return
    }

    @Override // x1.n
    public final void w(x1.i1 r2) {
            r1 = this;
            y0.n r0 = r2.r1()
            boolean r0 = r0.f21832t
            if (r0 == 0) goto Lf
            th.j r0 = r1.f13325u
            i0.j1 r0 = r0.f13320c
            r0.setValue(r2)
        Lf:
            return
    }
}
