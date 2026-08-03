package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k7.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final okio.a f14149l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v7.g0 f14150k;

    static {
            okio.a r0 = new okio.a
            r1 = 22
            r0.<init>(r1)
            v7.d.f14149l = r0
            return
    }

    @Override // k7.a
    public final void B(q7.b r8) {
            r7 = this;
            int r0 = r8.f10666k
            r1 = 2
            r8.c(r1)
            short r2 = r8.readShort()
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L11
            r2 = r3
            goto L12
        L11:
            r2 = r4
        L12:
            r8.g(r0)
            if (r2 == 0) goto L33
            v7.c0 r0 = new v7.c0
            j7.c r2 = new j7.c
            r2.<init>()
            v7.f r4 = new v7.f
            r5 = 16
            r4.<init>(r5)
            byte[] r5 = r4.f11553k
            r6 = r5[r1]
            r6 = r6 & 254(0xfe, float:3.56E-43)
            r3 = r3 | r6
            byte r3 = (byte) r3
            r5[r1] = r3
            r0.<init>(r2, r4)
            goto L44
        L33:
            v7.b0 r0 = new v7.b0
            v7.e r1 = new v7.e
            r2 = 8
            r1.<init>(r2)
            v7.d0 r3 = new v7.d0
            r3.<init>(r2, r4)
            r0.<init>(r3, r1)
        L44:
            r7.N(r0)
            r0.G(r8)
            return
    }

    @Override // k7.a
    public final int C(java.io.ByteArrayOutputStream r2) {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            v7.g0 r0 = r1.f14150k
            int r2 = r0.K(r2)
            return r2
    }

    @Override // k7.a
    public final void I(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r1 = 0
            r0.N(r1)
        L6:
            return
    }

    public final int L() {
            r4 = this;
            int r0 = r4.f7388g
            java.lang.Class<s7.b> r1 = s7.b.class
            k7.a r1 = r4.v(r1)
            s7.b r1 = (s7.b) r1
            if (r1 == 0) goto L23
            o7.c r1 = r1.f12372n
            r2 = r1
            s7.c r2 = (s7.c) r2
            k7.f r2 = r2.f9564l
            okio.a r3 = r7.k.f11567p
            if (r2 != r3) goto L23
            s7.c r1 = (s7.c) r1
            k7.a r0 = r1.Q(r0)
            r7.k r0 = (r7.k) r0
            int r0 = r0.N()
        L23:
            return r0
    }

    public final int M() {
            r3 = this;
            java.lang.Class<l7.m> r0 = l7.m.class
            k7.a r0 = r3.u(r0)
            l7.m r0 = (l7.m) r0
            if (r0 != 0) goto Lb
            goto L21
        Lb:
            java.lang.Class<o7.j> r1 = o7.j.class
            k7.a r1 = r0.u(r1)
            o7.j r1 = (o7.j) r1
            if (r1 == 0) goto L1e
            java.lang.Class<l7.f> r2 = l7.f.class
            k7.a r1 = r1.u(r2)
            l7.f r1 = (l7.f) r1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L23
        L21:
            r0 = 0
            return r0
        L23:
            int r1 = r1.U()
            int r1 = r1 << 24
            p7.a r0 = r0.f7869m
            p7.k r0 = (p7.k) r0
            r7.c r0 = r0.f10298r
            int r0 = r0.get()
            int r0 = r0 << 16
            r0 = r0 | r1
            int r1 = r3.L()
            r0 = r0 | r1
            return r0
    }

    public final void N(v7.g0 r3) {
            r2 = this;
            v7.g0 r0 = r2.f14150k
            if (r3 != r0) goto L5
            goto L17
        L5:
            if (r0 != 0) goto L8
            goto L15
        L8:
            r0.N()
            r1 = -1
            r0.H(r1)
            r1 = 0
            r0.J(r1)
            r2.f14150k = r1
        L15:
            if (r3 != 0) goto L18
        L17:
            return
        L18:
            r0 = 0
            r3.H(r0)
            r3.J(r2)
            r2.f14150k = r3
            return
    }

    @Override // k7.a
    public final int p() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            v7.g0 r0 = r1.f14150k
            int r0 = r0.p()
            return r0
    }

    @Override // k7.a
    public final byte[] r() {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            v7.g0 r0 = r1.f14150k
            byte[] r0 = r0.r()
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.M()
            r2 = 8
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.Class<l7.m> r2 = l7.m.class
            k7.a r3 = r8.u(r2)
            l7.m r3 = (l7.m) r3
            r4 = 0
            if (r3 == 0) goto L29
            p7.a r3 = r3.f7869m
            p7.k r3 = (p7.k) r3
            v7.y r3 = r3.f10302v
            goto L2a
        L29:
            r3 = r4
        L2a:
            if (r3 == 0) goto L32
            r0.append(r3)
            r0.append(r1)
        L32:
            k7.a r3 = r8.u(r2)
            l7.m r3 = (l7.m) r3
            if (r3 == 0) goto L43
            java.lang.Class<o7.j> r5 = o7.j.class
            k7.a r3 = r3.u(r5)
            o7.j r3 = (o7.j) r3
            goto L44
        L43:
            r3 = r4
        L44:
            if (r3 == 0) goto L49
            l7.j r3 = r3.f9585l
            goto L4a
        L49:
            r3 = r4
        L4a:
            if (r3 != 0) goto L4e
        L4c:
            r6 = r4
            goto L6a
        L4e:
            int r5 = r8.L()
            r7.b r3 = r3.f7883p
            r7.p r3 = (r7.p) r3
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            byte[] r6 = r3.f11553k
            int r6 = r6.length
            int r6 = r6 / 4
            if (r5 < r6) goto L62
            goto L4c
        L62:
            int r5 = r5 * 4
            r7.e r6 = new r7.e
            r7 = 1
            r6.<init>(r3, r5, r7)
        L6a:
            if (r6 == 0) goto L72
            r0.append(r6)
            r0.append(r1)
        L72:
            boolean r1 = r8.y()
            if (r1 == 0) goto L7d
            java.lang.String r1 = "NULL "
            r0.append(r1)
        L7d:
            r1 = 64
            r0.append(r1)
            k7.a r1 = r8.u(r2)
            l7.m r1 = (l7.m) r1
            if (r1 == 0) goto L8f
            java.lang.String r1 = r1.V()
            goto L90
        L8f:
            r1 = r4
        L90:
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            v7.g0 r1 = r8.f14150k
            if (r1 == 0) goto La3
            v7.i0 r1 = r1.f14153k
            int r1 = r1.N()
            goto La4
        La3:
            r1 = -1
        La4:
            if (r1 >= 0) goto La7
            goto Lb1
        La7:
            java.lang.Class<l7.f> r2 = l7.f.class
            k7.a r2 = r8.u(r2)
            l7.f r2 = (l7.f) r2
            if (r2 != 0) goto Lb3
        Lb1:
            r1 = r4
            goto Lbb
        Lb3:
            u7.b r2 = r2.f7877p
            r7.s r1 = r2.V(r1)
            r7.q r1 = (r7.q) r1
        Lbb:
            if (r1 == 0) goto Lbf
            java.lang.String r4 = r1.f11578m
        Lbf:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // k7.a
    public final boolean y() {
            r1 = this;
            v7.g0 r0 = r1.f14150k
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // k7.a
    public final void z(f6.b r2) {
            r1 = this;
            boolean r0 = r2.f3306b
            if (r0 == 0) goto L5
            goto L15
        L5:
            java.lang.Object r0 = r2.f3308d
            k7.a r0 = (k7.a) r0
            if (r0 != r1) goto Lf
            r0 = 1
            r2.f3306b = r0
            return
        Lf:
            boolean r0 = r1.y()
            if (r0 == 0) goto L16
        L15:
            return
        L16:
            v7.g0 r0 = r1.f14150k
            r0.z(r2)
            return
    }
}
