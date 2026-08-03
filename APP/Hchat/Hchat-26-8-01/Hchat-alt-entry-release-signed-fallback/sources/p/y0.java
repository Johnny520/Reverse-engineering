package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class y0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.x0 f10040a;

    public y0(p.x0 r1) {
            r0 = this;
            r0.<init>()
            r0.f10040a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p.y0
            if (r0 == 0) goto L7
            p.y0 r2 = (p.y0) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            p.x0 r0 = r1.f10040a
            p.x0 r2 = r2.f10040a
            boolean r2 = gg.l.a(r0, r2)
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.a1 r0 = new p.a1
            r0.<init>()
            p.x0 r1 = r2.f10040a
            r0.f9861u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.a1 r2 = (p.a1) r2
            p.x0 r0 = r1.f10040a
            r2.f9861u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            p.x0 r0 = r1.f10040a
            int r0 = r0.hashCode()
            return r0
    }
}
