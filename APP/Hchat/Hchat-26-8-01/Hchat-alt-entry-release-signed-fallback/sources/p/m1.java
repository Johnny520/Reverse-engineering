package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class m1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9951b;

    public m1(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f9950a = r1
            r0.f9951b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p.m1
            if (r0 != 0) goto L5
            goto L1d
        L5:
            p.m1 r3 = (p.m1) r3
            float r0 = r3.f9950a
            float r1 = r2.f9950a
            boolean r0 = u2.f.b(r1, r0)
            if (r0 == 0) goto L1d
            float r0 = r2.f9951b
            float r3 = r3.f9951b
            boolean r3 = u2.f.b(r0, r3)
            if (r3 == 0) goto L1d
            r3 = 1
            return r3
        L1d:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.n1 r0 = new p.n1
            r0.<init>()
            float r1 = r2.f9950a
            r0.f9958u = r1
            float r1 = r2.f9951b
            r0.f9959v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.n1 r2 = (p.n1) r2
            float r0 = r1.f9950a
            r2.f9958u = r0
            float r0 = r1.f9951b
            r2.f9959v = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f9950a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f9951b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
