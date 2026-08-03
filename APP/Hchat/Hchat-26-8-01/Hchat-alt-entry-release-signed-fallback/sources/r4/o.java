package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i4.a f11467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f11468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v4.y f11470n;

    public o(i4.a r3, boolean r4, v4.y r5) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto Le
            r2.f11467k = r3
            r2.f11469m = r4
            r2.f11470n = r5
            return
        Le:
            java.lang.String r3 = "code == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    @Override // r4.a0
    public final void a(r4.p r1) {
            r0 = this;
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11373z
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r2, int r3) {
            r1 = this;
            r4.p r2 = r2.f11472b     // Catch: java.lang.RuntimeException -> Lf
            r3 = 0
            r0 = 0
            byte[] r2 = r1.n(r2, r0, r0, r3)     // Catch: java.lang.RuntimeException -> Lf
            r1.f11468l = r2     // Catch: java.lang.RuntimeException -> Lf
            int r2 = r2.length     // Catch: java.lang.RuntimeException -> Lf
            r1.k(r2)     // Catch: java.lang.RuntimeException -> Lf
            return
        Lf:
            r2 = move-exception
            v4.y r3 = r1.f11470n
            java.lang.String r3 = r3.a()
            java.lang.String r0 = "...while placing debug info for "
            java.lang.String r3 = r0.concat(r3)
            f4.a r2 = f4.a.b(r3, r2)
            throw r2
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // r4.l0
    public final void m(r4.p r3, z4.d r4) {
            r2 = this;
            boolean r0 = r4.d()
            if (r0 == 0) goto L18
            java.lang.String r0 = r2.g()
            java.lang.String r1 = " debug info"
            java.lang.String r0 = r0.concat(r1)
            r4.c(r0)
            r0 = 0
            r1 = 1
            r2.n(r3, r0, r4, r1)
        L18:
            byte[] r3 = r2.f11468l
            r4.i(r3)
            return
    }

    public final byte[] n(r4.p r11, java.lang.String r12, z4.d r13, boolean r14) {
            r10 = this;
            i4.a r0 = r10.f11467k
            r0.j()
            java.lang.Object r1 = r0.f6411k
            r3 = r1
            p4.w r3 = (p4.w) r3
            r0.j()
            java.lang.Object r1 = r0.f6412l
            r4 = r1
            p4.o r4 = (p4.o) r4
            r0.j()
            java.lang.Object r0 = r0.f6413m
            p4.i r0 = (p4.i) r0
            int r6 = r0.o()
            int r7 = r0.f10117i
            r4.n r2 = new r4.n
            boolean r8 = r10.f11469m
            v4.y r9 = r10.f11470n
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = "...while encoding debug info"
            if (r13 != 0) goto L39
            byte[] r11 = r2.c()     // Catch: java.io.IOException -> L32
            return r11
        L32:
            r0 = move-exception
            r12 = r0
            f4.a r11 = f4.a.b(r11, r12)
            throw r11
        L39:
            r2.f11461l = r12
            r2.f11460k = r13
            r2.f11462m = r14
            byte[] r11 = r2.c()     // Catch: java.io.IOException -> L44
            return r11
        L44:
            r0 = move-exception
            r12 = r0
            f4.a r11 = f4.a.b(r11, r12)
            throw r11
    }
}
