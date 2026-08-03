package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class w0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.k f7090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.y0 f7091b;

    public w0(n.k r1, k.y0 r2) {
            r0 = this;
            r0.<init>()
            r0.f7090a = r1
            r0.f7091b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof k.w0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k.w0 r5 = (k.w0) r5
            n.k r1 = r5.f7090a
            n.k r3 = r4.f7090a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            k.y0 r1 = r4.f7091b
            k.y0 r5 = r5.f7091b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            k.x0 r0 = new k.x0
            k.y0 r1 = r3.f7091b
            n.k r2 = r3.f7090a
            x1.i r1 = r1.a(r2)
            r0.<init>()
            r0.f7103w = r1
            r0.k1(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            k.x0 r3 = (k.x0) r3
            k.y0 r0 = r2.f7091b
            n.k r1 = r2.f7090a
            x1.i r0 = r0.a(r1)
            x1.i r1 = r3.f7103w
            r3.l1(r1)
            r3.f7103w = r0
            r3.k1(r0)
            return
    }

    public final int hashCode() {
            r2 = this;
            n.k r0 = r2.f7090a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            k.y0 r1 = r2.f7091b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
