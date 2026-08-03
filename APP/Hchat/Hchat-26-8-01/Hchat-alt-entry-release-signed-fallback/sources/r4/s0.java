package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r4.y {
    @Override // r4.a0
    public final void a(r4.p r2) {
            r1 = this;
            r4.h0 r2 = r2.f11481f
            v4.d0 r0 = r1.f11515h
            v4.c0 r0 = r0.k()
            r2.r(r0)
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11359l
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // r4.a0
    public final void d(r4.p r4, z4.d r5) {
            r3 = this;
            v4.d0 r0 = r3.f11515h
            v4.c0 r0 = r0.k()
            r4.h0 r4 = r4.f11481f
            int r4 = r4.l(r0)
            boolean r1 = r5.d()
            if (r1 == 0) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r0 = r0.a()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            r5.b(r1, r0)
            java.lang.String r0 = a.a.Y0(r4)
            java.lang.String r1 = "  descriptor_idx: "
            java.lang.String r0 = r1.concat(r0)
            r1 = 4
            r5.b(r1, r0)
        L40:
            r5.k(r4)
            return
    }
}
