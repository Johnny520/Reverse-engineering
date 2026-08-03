package c1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends y0.n implements x1.m, x1.m1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f1.r0 f1008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l1.d f1009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l1.b f1010w;

    @Override // x1.m
    public final void B(x1.h0 r11) {
            r10 = this;
            l1.b r0 = r10.f1010w
            if (r0 != 0) goto L1c
            f1.z r0 = x1.k.u(r10)
            b.e r0 = r0.b()
            f1.r0 r1 = r10.f1008u
            l1.d r2 = r10.f1009v
            r0.getClass()
            l1.b r3 = new l1.b
            r3.<init>(r1, r2, r0)
            r10.f1010w = r3
            r4 = r3
            goto L1d
        L1c:
            r4 = r0
        L1d:
            h1.b r0 = r11.f20932g
            long r6 = r0.a()
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r5 = r11
            r4.c(r5, r6, r8, r9)
            r5.e()
            return
    }

    @Override // x1.m1
    public final void C0() {
            r1 = this;
            r0 = 0
            r1.f1010w = r0
            x1.k.l(r1)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            boolean r2 = r5 instanceof c1.r
            if (r2 != 0) goto Lc
            goto L25
        Lc:
            f1.r0 r2 = r4.f1008u
            c1.r r5 = (c1.r) r5
            f1.r0 r3 = r5.f1008u
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L19
            return r1
        L19:
            l1.d r2 = r4.f1009v
            l1.d r5 = r5.f1009v
            boolean r5 = gg.l.a(r2, r5)
            if (r5 != 0) goto L24
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            f1.r0 r0 = r2.f1008u
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            l1.d r1 = r2.f1009v
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
