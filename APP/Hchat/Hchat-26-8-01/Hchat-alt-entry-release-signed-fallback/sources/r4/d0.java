package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends r4.y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v4.w f11393i;

    public d0(v4.w r2) {
            r1 = this;
            v4.d0 r0 = r2.f14125g
            r1.<init>(r0)
            r1.f11393i = r2
            return
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // r4.a0
    public final void d(r4.p r6, z4.d r7) {
            r5 = this;
            r4.h0 r0 = r6.f11482g
            r4.h0 r1 = r6.f11481f
            v4.w r2 = r5.f11393i
            v4.z r3 = r2.f14126h
            v4.d0 r4 = r5.f11515h
            int r0 = r0.m(r4)
            v4.c0 r3 = r3.f14131g
            int r1 = r1.l(r3)
            int r6 = r5.i(r6)
            boolean r3 = r7.d()
            if (r3 == 0) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.f()
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            java.lang.String r2 = r2.a()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r7.b(r3, r2)
            java.lang.String r2 = a.a.X0(r0)
            java.lang.String r3 = "  class_idx: "
            java.lang.String r2 = r3.concat(r2)
            r3 = 2
            r7.b(r3, r2)
            java.lang.String r2 = r5.j()
            java.lang.String r4 = ":"
            java.lang.String r2 = r2.concat(r4)
            java.lang.String r4 = a.a.X0(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "  %-10s %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r7.b(r3, r2)
            java.lang.String r2 = a.a.Y0(r1)
            java.lang.String r3 = "  name_idx:  "
            java.lang.String r2 = r3.concat(r2)
            r3 = 4
            r7.b(r3, r2)
        L75:
            r7.l(r0)
            r7.l(r6)
            r7.k(r1)
            return
    }

    public abstract int i(r4.p r1);

    public abstract java.lang.String j();
}
