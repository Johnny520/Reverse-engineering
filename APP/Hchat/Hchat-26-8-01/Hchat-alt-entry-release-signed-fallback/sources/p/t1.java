package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class t1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.y f10011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.p f10012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f10013c;

    public t1(p.y r1, fg.p r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f10011a = r1
            r0.f10012b = r2
            r0.f10013c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            if (r3 != 0) goto L6
            goto L22
        L6:
            java.lang.Class<p.t1> r0 = p.t1.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L22
        Lf:
            p.t1 r3 = (p.t1) r3
            p.y r0 = r2.f10011a
            p.y r1 = r3.f10011a
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.Object r0 = r2.f10013c
            java.lang.Object r3 = r3.f10013c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.v1 r0 = new p.v1
            r0.<init>()
            p.y r1 = r2.f10011a
            r0.f10027u = r1
            fg.p r1 = r2.f10012b
            r0.f10028v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.v1 r2 = (p.v1) r2
            p.y r0 = r1.f10011a
            r2.f10027u = r0
            fg.p r0 = r1.f10012b
            r2.f10028v = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            p.y r0 = r3.f10011a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.Object r1 = r3.f10013c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
