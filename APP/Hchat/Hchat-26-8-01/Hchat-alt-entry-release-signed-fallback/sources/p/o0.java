package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class o0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.n0 f9963a;

    public o0(p.n0 r1) {
            r0 = this;
            r0.<init>()
            r0.f9963a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p.o0
            if (r1 == 0) goto Lb
            p.o0 r3 = (p.o0) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto Lf
            goto L16
        Lf:
            p.n0 r1 = r2.f9963a
            p.n0 r3 = r3.f9963a
            if (r1 != r3) goto L16
            return r0
        L16:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.p0 r0 = new p.p0
            r1 = 1
            r0.<init>(r1)
            p.n0 r1 = r2.f9963a
            r0.f9972v = r1
            r1 = 1
            r0.f9973w = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.p0 r2 = (p.p0) r2
            p.n0 r0 = r1.f9963a
            r2.f9972v = r0
            r0 = 1
            r2.f9973w = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            p.n0 r0 = r2.f9963a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 1
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
