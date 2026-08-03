package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9978b;

    public q0(float r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f9977a = r1
            r0.f9978b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p.q0
            if (r1 == 0) goto Lb
            p.q0 r5 = (p.q0) r5
            goto Lc
        Lb:
            r5 = 0
        Lc:
            r1 = 0
            if (r5 != 0) goto L10
            return r1
        L10:
            float r2 = r4.f9977a
            float r3 = r5.f9977a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            boolean r2 = r4.f9978b
            boolean r5 = r5.f9978b
            if (r2 != r5) goto L1f
            return r0
        L1f:
            return r1
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.r0 r0 = new p.r0
            r0.<init>()
            float r1 = r2.f9977a
            r0.f9981u = r1
            boolean r1 = r2.f9978b
            r0.f9982v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.r0 r2 = (p.r0) r2
            float r0 = r1.f9977a
            r2.f9981u = r0
            boolean r0 = r1.f9978b
            r2.f9982v = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f9977a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r2.f9978b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
