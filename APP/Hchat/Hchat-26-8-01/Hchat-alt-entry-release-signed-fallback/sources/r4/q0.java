package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v4.c0 f11502k;

    public q0(v4.c0 r3) {
            r2 = this;
            java.lang.String r0 = r3.f14067g
            int r0 = r0.length()
            int r0 = ig.a.c0(r0)
            g8.b r1 = r3.f14068h
            int r1 = r1.f4344c
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            r2.<init>(r1, r0)
            r2.f11502k = r3
            return
    }

    @Override // r4.a0
    public final void a(r4.p r1) {
            r0 = this;
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11372y
            return r0
    }

    @Override // r4.l0
    public final int e(r4.l0 r2) {
            r1 = this;
            r4.q0 r2 = (r4.q0) r2
            v4.c0 r0 = r1.f11502k
            v4.c0 r2 = r2.f11502k
            int r2 = r0.d(r2)
            return r2
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            v4.c0 r0 = r1.f11502k
            java.lang.String r0 = r0.l()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r6, z4.d r7) {
            r5 = this;
            v4.c0 r6 = r5.f11502k
            g8.b r0 = r6.f14068h
            java.lang.String r1 = r6.f14067g
            int r1 = r1.length()
            boolean r2 = r7.d()
            if (r2 == 0) goto L2c
            int r2 = ig.a.c0(r1)
            java.lang.String r3 = a.a.Y0(r1)
            java.lang.String r4 = "utf16_size: "
            java.lang.String r3 = r4.concat(r3)
            r7.b(r2, r3)
            int r2 = r0.f4344c
            int r2 = r2 + 1
            java.lang.String r6 = r6.l()
            r7.b(r2, r6)
        L2c:
            r7.n(r1)
            int r6 = r0.f4344c
            int r1 = r7.f22538c
            int r6 = r6 + r1
            boolean r2 = r7.f22536a
            if (r2 == 0) goto L3c
            r7.f(r6)
            goto L41
        L3c:
            byte[] r2 = r7.f22537b
            int r2 = r2.length
            if (r6 > r2) goto L5b
        L41:
            byte[] r2 = r7.f22537b
            int r3 = r2.length
            int r3 = r3 - r1
            int r4 = r0.f4344c
            if (r3 < r4) goto L55
            byte[] r0 = r0.f4343b
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r1, r4)
            r7.f22538c = r6
            r7.j(r3)
            return
        L55:
            java.lang.String r6 = "(out.length - offset) < size()"
            okio.a.i(r6)
            return
        L5b:
            z4.d.g()
            r6 = 0
            throw r6
    }
}
