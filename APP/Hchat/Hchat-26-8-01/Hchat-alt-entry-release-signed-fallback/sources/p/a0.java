package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class a0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.y f9859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9860b;

    public a0(p.y r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f9859a = r1
            r0.f9860b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof p.a0
            if (r0 != 0) goto L8
            goto L1b
        L8:
            p.a0 r3 = (p.a0) r3
            p.y r0 = r3.f9859a
            p.y r1 = r2.f9859a
            if (r1 == r0) goto L11
            goto L1b
        L11:
            float r0 = r2.f9860b
            float r3 = r3.f9860b
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L1b
        L19:
            r3 = 1
            return r3
        L1b:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.b0 r0 = new p.b0
            r0.<init>()
            p.y r1 = r2.f9859a
            r0.f9866u = r1
            float r1 = r2.f9860b
            r0.f9867v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.b0 r2 = (p.b0) r2
            p.y r0 = r1.f9859a
            r2.f9866u = r0
            float r0 = r1.f9860b
            r2.f9867v = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            p.y r0 = r2.f9859a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r2.f9860b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
