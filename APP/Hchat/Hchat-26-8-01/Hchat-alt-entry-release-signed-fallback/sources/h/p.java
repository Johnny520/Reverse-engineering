package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class p<S> extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.d1 f4729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.a1 f4730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.t f4731c;

    public p(i.d1 r1, i0.a1 r2, h.t r3) {
            r0 = this;
            r0.<init>()
            r0.f4729a = r1
            r0.f4730b = r2
            r0.f4731c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof h.p
            if (r0 == 0) goto L1c
            h.p r3 = (h.p) r3
            i.d1 r0 = r3.f4729a
            i.d1 r1 = r2.f4729a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1c
            i0.a1 r3 = r3.f4730b
            i0.a1 r0 = r2.f4730b
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            h.s r0 = new h.s
            r1 = 0
            r0.<init>(r1)
            i.d1 r1 = r3.f4729a
            r0.f4747v = r1
            i0.a1 r1 = r3.f4730b
            r0.f4748w = r1
            h.t r1 = r3.f4731c
            r0.f4749x = r1
            long r1 = h.k.f4707a
            r0.f4750y = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            h.s r2 = (h.s) r2
            i.d1 r0 = r1.f4729a
            r2.f4747v = r0
            i0.a1 r0 = r1.f4730b
            r2.f4748w = r0
            h.t r0 = r1.f4731c
            r2.f4749x = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            h.t r0 = r2.f4731c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            i.d1 r1 = r2.f4729a
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            i0.a1 r1 = r2.f4730b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
