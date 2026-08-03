package r1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class e extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.a f11316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1.d f11317b;

    public e(r1.a r1, r1.d r2) {
            r0 = this;
            r0.<init>()
            r0.f11316a = r1
            r0.f11317b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof r1.e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r1.e r4 = (r1.e) r4
            r1.a r0 = r4.f11316a
            r1.a r2 = r3.f11316a
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L13
            return r1
        L13:
            r1.d r4 = r4.f11317b
            r1.d r0 = r3.f11317b
            boolean r4 = gg.l.a(r4, r0)
            if (r4 != 0) goto L1e
            return r1
        L1e:
            r4 = 1
            return r4
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            r1.i r0 = new r1.i
            r1.a r1 = r3.f11316a
            r1.d r2 = r3.f11317b
            r0.<init>(r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r4) {
            r3 = this;
            r1.i r4 = (r1.i) r4
            r1.a r0 = r3.f11316a
            r4.f11327u = r0
            r1.d r0 = r4.f11328v
            r1.i r1 = r0.f11312a
            r2 = 0
            if (r1 != r4) goto Lf
            r0.f11312a = r2
        Lf:
            r1.d r1 = r3.f11317b
            if (r1 != 0) goto L1b
            r1.d r0 = new r1.d
            r0.<init>()
            r4.f11328v = r0
            goto L23
        L1b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            r4.f11328v = r1
        L23:
            boolean r0 = r4.f21832t
            if (r0 == 0) goto L3e
            r1.d r0 = r4.f11328v
            r0.f11312a = r4
            r0.f11313b = r2
            r4.f11329w = r2
            d1.c0 r1 = new d1.c0
            r2 = 13
            r1.<init>(r4, r2)
            r0.f11314c = r1
            qg.t r4 = r4.Y0()
            r0.f11315d = r4
        L3e:
            return
    }

    public final int hashCode() {
            r2 = this;
            r1.a r0 = r2.f11316a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1.d r1 = r2.f11317b
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }
}
