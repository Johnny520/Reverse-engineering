package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class z0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.r0 f4790a;

    public z0(i.r0 r1) {
            r0 = this;
            r0.<init>()
            r0.f4790a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof h.z0
            if (r0 == 0) goto L1a
            h.z0 r2 = (h.z0) r2
            i.r0 r2 = r2.f4790a
            i.r0 r0 = r1.f4790a
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1a
            y0.g r2 = y0.b.f21792g
            boolean r2 = r2.equals(r2)
            if (r2 == 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            h.d1 r0 = new h.d1
            i.r0 r1 = r2.f4790a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            h.d1 r2 = (h.d1) r2
            i.r0 r0 = r1.f4790a
            r2.f4644v = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            i.r0 r0 = r3.f4790a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = java.lang.Float.hashCode(r1)
            int r2 = r2 * 31
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
    }
}
