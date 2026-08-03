package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.f f9974a;

    public p1(y0.f r1) {
            r0 = this;
            r0.<init>()
            r0.f9974a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p.p1
            if (r0 == 0) goto Lb
            p.p1 r2 = (p.p1) r2
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            y0.f r0 = r1.f9974a
            y0.f r2 = r2.f9974a
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.q1 r0 = new p.q1
            r0.<init>()
            y0.f r1 = r2.f9974a
            r0.f9979u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.q1 r2 = (p.q1) r2
            y0.f r0 = r1.f9974a
            r2.f9979u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            y0.f r0 = r1.f9974a
            float r0 = r0.f21810a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }
}
