package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements v1.l1, tg.d, v0.j, j8.l, wb.kv, y1.v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f10224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f10225i;

    public t(int r2) {
            r1 = this;
            r1.f10223g = r2
            switch(r2) {
                case 6: goto L39;
                case 18: goto L2a;
                case 20: goto L14;
                default: goto L5;
            }
        L5:
            r1.<init>()
            qd.h r2 = qd.j.f10887u
            r1.f10224h = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.f10225i = r2
            return
        L14:
            r1.<init>()
            j0.b r2 = new j0.b
            r0 = 16
            java.lang.ref.Reference[] r0 = new java.lang.ref.Reference[r0]
            r2.<init>(r0)
            r1.f10224h = r2
            java.lang.ref.ReferenceQueue r2 = new java.lang.ref.ReferenceQueue
            r2.<init>()
            r1.f10225i = r2
            return
        L2a:
            r1.<init>()
            j0.b r2 = new j0.b
            r0 = 16
            x1.f0[] r0 = new x1.f0[r0]
            r2.<init>(r0)
            r1.f10224h = r2
            return
        L39:
            r1.<init>()
            return
    }

    public t(android.content.Context r2) {
            r1 = this;
            r0 = 11
            r1.f10223g = r0
            r1.<init>()
            r1.f10224h = r2
            java.lang.String r0 = "Hchat_transfer_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            r1.f10225i = r2
            return
    }

    public /* synthetic */ t(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f10223g = r2
            r0.f10224h = r1
            r0.f10225i = r3
            r0.<init>()
            return
    }

    public t(n4.a r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 0
            r1.f10223g = r0
            r1.<init>()
            p4.u r0 = new p4.u
            r0.<init>(r2, r3, r5, r6)
            r1.f10224h = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r1.f10225i = r2
            return
    }

    public t(pa.c r3) {
            r2 = this;
            r0 = 10
            r2.f10223g = r0
            r2.<init>()
            r2.f10224h = r3
            m.a r0 = new m.a
            r1 = 20
            r0.<init>(r3, r1)
            r2.f10225i = r0
            return
    }

    public t(r4.p r2, z4.d r3) {
            r1 = this;
            r0 = 4
            r1.f10223g = r0
            r1.<init>()
            if (r2 == 0) goto Ld
            r1.f10224h = r2
            r1.f10225i = r3
            return
        Ld:
            java.lang.String r2 = "file == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public t(s.b0 r2) {
            r1 = this;
            r0 = 5
            r1.f10223g = r0
            r1.<init>()
            r1.f10224h = r2
            f.b0 r2 = f.o0.f2877a
            f.b0 r2 = new f.b0
            r2.<init>()
            r1.f10225i = r2
            return
    }

    public t(ud.r r2) {
            r1 = this;
            r0 = 1
            r1.f10223g = r0
            r1.<init>()
            r1.f10224h = r2
            ud.e r2 = r2.f13718l
            ud.u r2 = r2.f13688k
            r1.f10225i = r2
            return
    }

    public t(x1.f0 r2, v1.n0 r3) {
            r1 = this;
            r0 = 16
            r1.f10223g = r0
            r1.<init>()
            r1.f10224h = r2
            i0.j1 r2 = i0.r.u(r3)
            r1.f10225i = r2
            return
    }

    public t(float[] r2) {
            r1 = this;
            r0 = 19
            r1.f10223g = r0
            r1.<init>()
            r1.f10224h = r2
            r2 = 2
            int[] r2 = new int[r2]
            r1.f10225i = r2
            return
    }

    public static ud.p E(gf.a r3, qd.j r4) {
            ud.p r0 = new ud.p
            pd.k r1 = pd.k.f10502k
            r2 = 1
            r0.<init>(r1, r2)
            r1 = 0
            qd.r r1 = qd.l.U(r3, r1, r4)
            r0.d0(r1)
            int[] r3 = r3.f4499i
            r3 = r3[r2]
            qd.r r1 = new qd.r
            r1.<init>(r3, r4)
            r0.I(r1)
            return r0
    }

    public static void i(r4.p r3, t4.a r4) {
            r4.h0 r0 = r3.f11482g
            r4.h0 r1 = r3.f11481f
            v4.d0 r2 = r4.f13070h
            r0.p(r2)
            java.util.TreeMap r4 = r4.f13072j
            java.util.Collection r4 = r4.values()
            java.util.Collection r4 = java.util.Collections.unmodifiableCollection(r4)
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            t4.d r0 = (t4.d) r0
            v4.c0 r2 = r0.f13076g
            r1.r(r2)
            v4.a r0 = r0.f13077h
            j(r3, r0)
            goto L17
        L2e:
            return
    }

    public static void j(r4.p r3, v4.a r4) {
            boolean r0 = r4 instanceof v4.b
            if (r0 == 0) goto Lc
            v4.b r4 = (v4.b) r4
            t4.a r4 = r4.f14065g
            i(r3, r4)
            return
        Lc:
            boolean r0 = r4 instanceof v4.d
            if (r0 == 0) goto L27
            v4.d r4 = (v4.d) r4
            v4.c r4 = r4.f14069g
            java.lang.Object[] r0 = r4.f22543h
            int r0 = r0.length
            r1 = 0
        L18:
            if (r1 >= r0) goto L26
            java.lang.Object r2 = r4.l(r1)
            v4.a r2 = (v4.a) r2
            j(r3, r2)
            int r1 = r1 + 1
            goto L18
        L26:
            return
        L27:
            r3.b(r4)
            return
    }

    public static pd.a k(gf.a r5, int r6, qd.j r7) {
            int r0 = pd.a.f10474p
            qd.g r0 = qd.j.f10868b
            if (r7 != r0) goto Lf
            boolean r1 = p.a.b(r6)
            if (r1 == 0) goto Lf
            qd.h r1 = qd.j.G
            goto L10
        Lf:
            r1 = r7
        L10:
            r2 = 0
            qd.r r1 = qd.l.U(r5, r2, r1)
            if (r7 != r0) goto L1f
            boolean r0 = p.a.b(r6)
            if (r0 == 0) goto L1f
            qd.h r7 = qd.j.D
        L1f:
            int r0 = r5.f4500j
            r3 = 1
            r4 = 2
            if (r0 == r4) goto L4f
            r2 = 3
            if (r0 != r2) goto L40
            pd.a r0 = new pd.a
            int[] r2 = r5.f4499i
            r2 = r2[r3]
            qd.r r3 = new qd.r
            r3.<init>(r2, r7)
            int[] r5 = r5.f4499i
            r5 = r5[r4]
            qd.r r2 = new qd.r
            r2.<init>(r5, r7)
            r0.<init>(r6, r1, r3, r2)
            return r0
        L40:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Unexpected registers count in "
            java.lang.String r5 = r6.concat(r5)
            ah.a.k(r5)
            r5 = 0
            return r5
        L4f:
            pd.a r0 = new pd.a
            int[] r4 = r5.f4499i
            r2 = r4[r2]
            qd.r r4 = new qd.r
            r4.<init>(r2, r7)
            int[] r5 = r5.f4499i
            r5 = r5[r3]
            qd.r r2 = new qd.r
            r2.<init>(r5, r7)
            r0.<init>(r6, r1, r4, r2)
            return r0
    }

    public static pd.a l(gf.a r5, int r6, qd.j r7) {
            int r0 = pd.a.f10474p
            qd.g r0 = qd.j.f10868b
            if (r7 != r0) goto Lf
            boolean r1 = p.a.b(r6)
            if (r1 == 0) goto Lf
            qd.h r1 = qd.j.G
            goto L10
        Lf:
            r1 = r7
        L10:
            r2 = 0
            qd.r r1 = qd.l.U(r5, r2, r1)
            if (r7 != r0) goto L1f
            boolean r0 = p.a.b(r6)
            if (r0 == 0) goto L1f
            qd.h r7 = qd.j.D
        L1f:
            long r3 = r5.f4501k
            qd.n r0 = qd.l.S(r3, r7)
            int r3 = r5.f4500j
            r4 = 1
            if (r3 == r4) goto L4b
            r2 = 2
            if (r3 != r2) goto L3c
            pd.a r2 = new pd.a
            int[] r5 = r5.f4499i
            r5 = r5[r4]
            qd.r r3 = new qd.r
            r3.<init>(r5, r7)
            r2.<init>(r6, r1, r3, r0)
            return r2
        L3c:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Unexpected registers count in "
            java.lang.String r5 = r6.concat(r5)
            ah.a.k(r5)
            r5 = 0
            return r5
        L4b:
            pd.a r3 = new pd.a
            int[] r5 = r5.f4499i
            r5 = r5[r2]
            qd.r r2 = new qd.r
            r2.<init>(r5, r7)
            r3.<init>(r6, r1, r2, r0)
            return r3
    }

    public static ud.p m(gf.a r3, qd.j r4, qd.j r5) {
            ud.p r0 = new ud.p
            pd.k r1 = pd.k.G
            r2 = 2
            r0.<init>(r1, r2)
            r1 = 0
            qd.r r5 = qd.l.Y(r3, r1, r5)
            r0.d0(r5)
            qd.a r5 = new qd.a
            r5.<init>(r4)
            r4 = 1
            qd.r r4 = qd.l.Y(r3, r4, r5)
            r0.I(r4)
            qd.h r4 = qd.j.A
            int[] r3 = r3.f4499i
            r3 = r3[r2]
            qd.r r5 = new qd.r
            r5.<init>(r3, r4)
            r0.I(r5)
            return r0
    }

    public static ud.p n(gf.a r3, qd.j r4, qd.j r5) {
            ud.p r0 = new ud.p
            pd.k r1 = pd.k.H
            r2 = 3
            r0.<init>(r1, r2)
            qd.g r1 = qd.j.f10868b
            qd.a r1 = new qd.a
            r1.<init>(r4)
            r4 = 1
            qd.r r4 = qd.l.Y(r3, r4, r1)
            r0.I(r4)
            qd.h r4 = qd.j.A
            int[] r1 = r3.f4499i
            r2 = 2
            r1 = r1[r2]
            qd.r r2 = new qd.r
            r2.<init>(r1, r4)
            r0.I(r2)
            r4 = 0
            qd.r r3 = qd.l.Y(r3, r4, r5)
            r0.I(r3)
            return r0
    }

    public static pd.j o(gf.a r3, qd.j r4, qd.j r5) {
            pd.j r0 = new pd.j
            pd.k r1 = pd.k.f10506o
            r2 = 1
            r0.<init>(r1, r5, r2)
            r1 = 0
            qd.r r5 = qd.l.U(r3, r1, r5)
            r0.d0(r5)
            int[] r3 = r3.f4499i
            r3 = r3[r2]
            qd.r r5 = new qd.r
            r5.<init>(r3, r4)
            r0.I(r5)
            return r0
    }

    public static ud.p p(gf.a r3, pd.k r4, qd.j r5) {
            ud.p r0 = new ud.p
            r1 = 2
            r0.<init>(r4, r1)
            r4 = 0
            qd.g r2 = qd.j.f10868b
            qd.r r4 = qd.l.U(r3, r4, r2)
            r0.d0(r4)
            r4 = 1
            int[] r2 = r3.f4499i
            r4 = r2[r4]
            qd.r r2 = new qd.r
            r2.<init>(r4, r5)
            r0.I(r2)
            int[] r3 = r3.f4499i
            r3 = r3[r1]
            qd.r r4 = new qd.r
            r4.<init>(r3, r5)
            r0.I(r4)
            return r0
    }

    public static java.lang.String q(v4.a r2) {
            int r0 = r(r2)
            r1 = 30
            if (r0 != r1) goto Lb
            java.lang.String r2 = "null"
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.j()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r2 = r2.a()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static int r(v4.a r1) {
            boolean r0 = r1 instanceof v4.g
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r0 = r1 instanceof v4.b0
            if (r0 == 0) goto Lc
            r1 = 2
            return r1
        Lc:
            boolean r0 = r1 instanceof v4.j
            if (r0 == 0) goto L12
            r1 = 3
            return r1
        L12:
            boolean r0 = r1 instanceof v4.o
            if (r0 == 0) goto L18
            r1 = 4
            return r1
        L18:
            boolean r0 = r1 instanceof v4.v
            if (r0 == 0) goto L1e
            r1 = 6
            return r1
        L1e:
            boolean r0 = r1 instanceof v4.n
            if (r0 == 0) goto L25
            r1 = 16
            return r1
        L25:
            boolean r0 = r1 instanceof v4.k
            if (r0 == 0) goto L2c
            r1 = 17
            return r1
        L2c:
            boolean r0 = r1 instanceof v4.a0
            if (r0 == 0) goto L33
            r1 = 21
            return r1
        L33:
            boolean r0 = r1 instanceof v4.x
            if (r0 == 0) goto L3a
            r1 = 22
            return r1
        L3a:
            boolean r0 = r1 instanceof v4.c0
            if (r0 == 0) goto L41
            r1 = 23
            return r1
        L41:
            boolean r0 = r1 instanceof v4.d0
            if (r0 == 0) goto L48
            r1 = 24
            return r1
        L48:
            boolean r0 = r1 instanceof v4.m
            if (r0 == 0) goto L4f
            r1 = 25
            return r1
        L4f:
            boolean r0 = r1 instanceof v4.y
            if (r0 == 0) goto L56
            r1 = 26
            return r1
        L56:
            boolean r0 = r1 instanceof v4.l
            if (r0 == 0) goto L5d
            r1 = 27
            return r1
        L5d:
            boolean r0 = r1 instanceof v4.d
            if (r0 == 0) goto L64
            r1 = 28
            return r1
        L64:
            boolean r0 = r1 instanceof v4.b
            if (r0 == 0) goto L6b
            r1 = 29
            return r1
        L6b:
            boolean r0 = r1 instanceof v4.r
            if (r0 == 0) goto L72
            r1 = 30
            return r1
        L72:
            boolean r1 = r1 instanceof v4.f
            if (r1 == 0) goto L79
            r1 = 31
            return r1
        L79:
            java.lang.String r1 = "Shouldn't happen"
            bsh.j.g(r1)
            r1 = 0
            return r1
    }

    public static void u(x1.f0 r10) {
            int r0 = r10.V
            if (r0 <= 0) goto La6
            x1.j0 r0 = r10.M
            x1.b0 r0 = r0.f20954d
            x1.b0 r1 = x1.b0.f20837k
            r2 = 0
            if (r0 != r1) goto L90
            boolean r0 = r10.p()
            if (r0 != 0) goto L90
            boolean r0 = r10.q()
            if (r0 != 0) goto L90
            boolean r0 = r10.W
            if (r0 == 0) goto L1f
            goto L90
        L1f:
            boolean r0 = r10.H()
            if (r0 != 0) goto L27
            goto L90
        L27:
            x1.b1 r0 = r10.L
            y0.n r0 = r0.f20844f
            int r1 = r0.f21822j
            r3 = 256(0x100, float:3.59E-43)
            r1 = r1 & r3
            if (r1 == 0) goto L90
        L32:
            if (r0 == 0) goto L90
            int r1 = r0.f21821i
            r1 = r1 & r3
            if (r1 == 0) goto L88
            r1 = 0
            r4 = r0
            r5 = r1
        L3c:
            if (r4 == 0) goto L88
            boolean r6 = r4 instanceof x1.n
            if (r6 == 0) goto L4c
            x1.n r4 = (x1.n) r4
            x1.i1 r6 = x1.k.t(r4, r3)
            r4.w(r6)
            goto L83
        L4c:
            int r6 = r4.f21821i
            r6 = r6 & r3
            if (r6 == 0) goto L83
            boolean r6 = r4 instanceof x1.j
            if (r6 == 0) goto L83
            r6 = r4
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = r2
        L5b:
            r8 = 1
            if (r6 == 0) goto L80
            int r9 = r6.f21821i
            r9 = r9 & r3
            if (r9 == 0) goto L7d
            int r7 = r7 + 1
            if (r7 != r8) goto L69
            r4 = r6
            goto L7d
        L69:
            if (r5 != 0) goto L74
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L74:
            if (r4 == 0) goto L7a
            r5.b(r4)
            r4 = r1
        L7a:
            r5.b(r6)
        L7d:
            y0.n r6 = r6.f21824l
            goto L5b
        L80:
            if (r7 != r8) goto L83
            goto L3c
        L83:
            y0.n r4 = x1.k.e(r5)
            goto L3c
        L88:
            int r1 = r0.f21822j
            r1 = r1 & r3
            if (r1 == 0) goto L90
            y0.n r0 = r0.f21824l
            goto L32
        L90:
            r10.U = r2
            j0.b r10 = r10.y()
            java.lang.Object[] r0 = r10.f6671g
            int r10 = r10.f6673i
        L9a:
            if (r2 >= r10) goto La6
            r1 = r0[r2]
            x1.f0 r1 = (x1.f0) r1
            u(r1)
            int r2 = r2 + 1
            goto L9a
        La6:
            return
    }

    public static pd.g v(gf.a r6, boolean r7) {
            java.lang.String r0 = r6.b()
            qd.j r0 = qd.j.z(r0)
            qd.j r0 = r0.g()
            r0.getClass()
            boolean r1 = r0 instanceof qd.g
            int r2 = r6.f4500j
            qd.l[] r3 = new qd.l[r2]
            r4 = 0
            if (r7 == 0) goto L2a
            int[] r6 = r6.f4499i
            r6 = r6[r4]
            r7 = r4
        L1d:
            if (r7 >= r2) goto L3a
            qd.r r5 = qd.l.T(r6, r0, r1)
            r3[r7] = r5
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L1d
        L2a:
            r7 = r4
        L2b:
            if (r7 >= r2) goto L3a
            int[] r5 = r6.f4499i
            r5 = r5[r7]
            qd.r r5 = qd.l.T(r5, r0, r1)
            r3[r7] = r5
            int r7 = r7 + 1
            goto L2b
        L3a:
            pd.g r6 = new pd.g
            r6.<init>(r2, r0)
        L3f:
            if (r4 >= r2) goto L49
            r7 = r3[r4]
            r6.I(r7)
            int r4 = r4 + 1
            goto L3f
        L49:
            return r6
    }

    public static ud.p z(pd.k r2, qd.r r3, qd.l r4) {
            ud.p r0 = new ud.p
            r1 = 1
            r0.<init>(r2, r1)
            r0.d0(r3)
            r0.I(r4)
            return r0
    }

    public pd.n A(gf.a r3, int r4, boolean r5) {
            r2 = this;
            jf.h r0 = ig.a.x(r3)
            if (r0 == 0) goto L14
            java.lang.Object r1 = r2.f10225i
            ud.u r1 = (ud.u) r1
            od.d r0 = od.d.d(r1, r0)
            pd.n r1 = new pd.n
            r1.<init>(r0, r3, r4, r5)
            return r1
        L14:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed to load method reference for insn: "
            java.lang.String r3 = r4.concat(r3)
            ah.a.k(r3)
            r3 = 0
            return r3
    }

    public ud.p B(gf.a r7, boolean r8) {
            r6 = this;
            java.lang.Object r0 = r6.f10224h
            ud.r r0 = (ud.r) r0
            java.lang.String r1 = "Failed to get call site for insn: "
            qc.a r2 = ig.a.v(r7)     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto Lb5
            java.util.ArrayList r1 = r2.f10855a     // Catch: java.lang.Exception -> L4f
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L4f
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L4f
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L4f
            nc.a r3 = (nc.a) r3     // Catch: java.lang.Exception -> L4f
            int r4 = r3.f9341g     // Catch: java.lang.Exception -> L4f
            java.lang.Object r3 = r3.f9342h     // Catch: java.lang.Exception -> L4f
            int r4 = t3.c.b(r4)     // Catch: java.lang.Exception -> L4f
            r5 = 13
            if (r4 == r5) goto L3e
            r5 = 15
            if (r4 == r5) goto L2f
            goto L12
        L2f:
            qc.d r3 = (qc.d) r3     // Catch: java.lang.Exception -> L4f
            int r4 = r3.f10860a     // Catch: java.lang.Exception -> L4f
            switch(r4) {
                case 0: goto L12;
                default: goto L36;
            }     // Catch: java.lang.Exception -> L4f
        L36:
            java.lang.Object r3 = r3.f10862c     // Catch: java.lang.Exception -> L4f
            jf.h r3 = (jf.h) r3     // Catch: java.lang.Exception -> L4f
            r3.a()     // Catch: java.lang.Exception -> L4f
            goto L12
        L3e:
            jf.h r3 = (jf.h) r3     // Catch: java.lang.Exception -> L4f
            r3.a()     // Catch: java.lang.Exception -> L4f
            goto L12
        L44:
            boolean r2 = g4.a.A(r1)     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L51
            pd.l r7 = g4.a.g(r0, r7, r8, r1)     // Catch: java.lang.Exception -> L4f
            return r7
        L4f:
            r7 = move-exception
            goto Lc3
        L51:
            boolean r2 = oh.h.I(r1)     // Catch: java.lang.Exception -> L4f
            if (r2 == 0) goto L5c
            ud.p r7 = oh.h.l(r7, r1)     // Catch: java.lang.Exception -> L4f
            return r7
        L5c:
            pd.m r7 = ig.a.f(r0, r7, r8, r1)     // Catch: java.lang.Exception -> L61
            return r7
        L61:
            r7 = move-exception
            java.lang.String r8 = "\n"
            java.lang.String r8 = xe.s.j(r1, r8)     // Catch: java.lang.Exception -> L4f
            java.lang.String r2 = xe.s.g(r7)     // Catch: java.lang.Exception -> L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r3.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = "Failed to decode invoke-custom: \n"
            r3.append(r4)     // Catch: java.lang.Exception -> L4f
            r3.append(r8)     // Catch: java.lang.Exception -> L4f
            java.lang.String r8 = ",\n exception: "
            r3.append(r8)     // Catch: java.lang.Exception -> L4f
            r3.append(r2)     // Catch: java.lang.Exception -> L4f
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Exception -> L4f
            r0.K(r8)     // Catch: java.lang.Exception -> L4f
            ud.p r8 = new ud.p     // Catch: java.lang.Exception -> L4f
            pd.k r0 = pd.k.Q     // Catch: java.lang.Exception -> L4f
            r2 = 0
            r8.<init>(r0, r2)     // Catch: java.lang.Exception -> L4f
            md.a r0 = md.a.f8831m     // Catch: java.lang.Exception -> L4f
            r8.w(r0)     // Catch: java.lang.Exception -> L4f
            md.b r0 = md.b.f8848c     // Catch: java.lang.Exception -> L4f
            nd.p r2 = new nd.p     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
            r3.<init>()     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = "Failed to decode invoke-custom: "
            r3.append(r4)     // Catch: java.lang.Exception -> L4f
            r3.append(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L4f
            r2.<init>(r1, r7)     // Catch: java.lang.Exception -> L4f
            r8.x(r0, r2)     // Catch: java.lang.Exception -> L4f
            return r8
        Lb5:
            af.g r8 = new af.g     // Catch: java.lang.Exception -> L4f
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L4f
            java.lang.String r7 = r1.concat(r7)     // Catch: java.lang.Exception -> L4f
            r8.<init>(r7)     // Catch: java.lang.Exception -> L4f
            throw r8     // Catch: java.lang.Exception -> L4f
        Lc3:
            af.g r8 = new af.g
            java.lang.String r0 = r7.getMessage()
            java.lang.String r1 = "'invoke-custom' instruction processing error: "
            java.lang.String r0 = wb.en.g(r1, r0)
            r8.<init>(r0, r7)
            throw r8
    }

    public pd.o C(gf.a r9, boolean r10) {
            r8 = this;
            java.lang.Object r0 = r8.f10225i
            ud.u r0 = (ud.u) r0
            jf.h r1 = ig.a.x(r9)
            if (r1 == 0) goto L38
            od.d r6 = od.d.d(r0, r1)
            int r1 = r9.f4502l
            ac.k r2 = r9.f4492b
            jf.g r5 = r2.s(r1)
            java.util.List r1 = r5.f6892a
            me.a r2 = new me.a
            r3 = 6
            r2.<init>(r3)
            java.util.List r1 = xe.s.c(r1, r2)
            java.lang.String r2 = r5.f6893b
            qd.j r2 = qd.j.z(r2)
            od.a r3 = r6.f9780j
            java.lang.String r4 = r6.f9777g
            od.d r3 = od.d.b(r0, r3, r4, r1, r2)
            pd.o r2 = new pd.o
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L38:
            r4 = r9
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = "Failed to load method reference for insn: "
            java.lang.String r9 = r10.concat(r9)
            ah.a.k(r9)
            r9 = 0
            return r9
    }

    public pd.s D(gf.a r5, boolean r6) {
            r4 = this;
            java.lang.Object r0 = r4.f10224h
            ud.r r0 = (ud.r) r0
            pd.s r1 = new pd.s
            r2 = 0
            qd.h r3 = qd.j.A
            qd.r r2 = qd.l.U(r5, r2, r3)
            int r3 = r5.f4502l
            r1.<init>(r2, r3, r6)
            sc.a r6 = r5.f4504n
            if (r6 == 0) goto L23
            pd.r r2 = new pd.r
            tc.a r6 = (tc.a) r6
            r2.<init>(r6)
            int r5 = r5.f4502l
            r1.f10536q = r2
            r1.f10537r = r5
        L23:
            md.a r5 = md.a.f8830l0
            r0.w(r5)
            md.b r5 = md.b.f8866u
            md.f r6 = r0.f8877g
            oc.b r5 = r6.c(r5)
            nd.d r5 = (nd.d) r5
            if (r5 != 0) goto L3c
            nd.d r5 = new nd.d
            r5.<init>()
            r0.y(r5)
        L3c:
            java.util.EnumSet r5 = r5.f9357g
            nd.c r6 = nd.c.f9353g
            r5.add(r6)
            return r1
    }

    public void F(android.os.Bundle r6) {
            r5 = this;
            java.lang.Object r0 = r5.f10224h
            pa.c r0 = (pa.c) r0
            java.lang.Object r1 = r0.f10454c
            u3.c r1 = (u3.c) r1
            boolean r2 = r0.f10452a
            r3 = 1
            if (r2 != 0) goto L3d
            androidx.lifecycle.s r2 = r1.f()
            androidx.lifecycle.l r2 = r2.f300c
            androidx.lifecycle.l r4 = androidx.lifecycle.l.f290h
            if (r2 != r4) goto L37
            boolean r2 = r0.f10452a
            if (r2 != 0) goto L31
            java.lang.Object r2 = r0.f10455d
            i.e0 r2 = (i.e0) r2
            r2.invoke()
            androidx.lifecycle.s r2 = r1.f()
            w3.a r4 = new w3.a
            r4.<init>()
            r2.a(r4)
            r0.f10452a = r3
            goto L3d
        L31:
            java.lang.String r6 = "SavedStateRegistry was already attached."
            j8.o.A(r6)
            return
        L37:
            java.lang.String r6 = "Restarter must be created only during owner's initialization stage"
            j8.o.A(r6)
            return
        L3d:
            androidx.lifecycle.s r2 = r1.f()
            androidx.lifecycle.l r2 = r2.f300c
            androidx.lifecycle.l r4 = androidx.lifecycle.l.f292j
            int r2 = r2.compareTo(r4)
            if (r2 >= 0) goto L69
            boolean r1 = r0.f10453b
            if (r1 != 0) goto L63
            r1 = 0
            if (r6 == 0) goto L5e
            java.lang.String r2 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            boolean r4 = r6.containsKey(r2)
            if (r4 == 0) goto L5e
            android.os.Bundle r1 = a7.a.x(r2, r6)
        L5e:
            r0.f10458g = r1
            r0.f10453b = r3
            return
        L63:
            java.lang.String r6 = "SavedStateRegistry was already restored."
            j8.o.A(r6)
            return
        L69:
            androidx.lifecycle.s r6 = r1.f()
            androidx.lifecycle.l r6 = r6.f300c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "performRestore cannot be called when owner is "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    public void G(android.os.Bundle r6) {
            r5 = this;
            java.lang.Object r0 = r5.f10224h
            pa.c r0 = (pa.c) r0
            r1 = 0
            sf.e[] r2 = new sf.e[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            sf.e[] r1 = (sf.e[]) r1
            android.os.Bundle r1 = x6.d.n(r1)
            java.lang.Object r2 = r0.f10458g
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r2 == 0) goto L1a
            r1.putAll(r2)
        L1a:
            java.lang.Object r2 = r0.f10456e
            uf.d r2 = (uf.d) r2
            monitor-enter(r2)
            java.lang.Object r0 = r0.f10457f     // Catch: java.lang.Throwable -> L4e
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L4e
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L2b:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L50
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L4e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L4e
            y1.l1 r3 = (y1.l1) r3     // Catch: java.lang.Throwable -> L4e
            android.os.Bundle r3 = r3.a()     // Catch: java.lang.Throwable -> L4e
            r4.getClass()     // Catch: java.lang.Throwable -> L4e
            r1.putBundle(r4, r3)     // Catch: java.lang.Throwable -> L4e
            goto L2b
        L4e:
            r6 = move-exception
            goto L5d
        L50:
            monitor-exit(r2)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L5c
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r6.putBundle(r0, r1)
        L5c:
            return
        L5d:
            monitor-exit(r2)
            throw r6
    }

    public void H(android.view.View r5, float[] r6) {
            r4 = this;
            java.lang.Object r0 = r4.f10224h
            float[] r0 = (float[]) r0
            android.view.ViewParent r1 = r5.getParent()
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L3a
            android.view.View r1 = (android.view.View) r1
            r4.H(r1, r6)
            int r1 = r5.getScrollX()
            float r1 = (float) r1
            float r1 = -r1
            int r2 = r5.getScrollY()
            float r2 = (float) r2
            float r2 = -r2
            f1.i0.d(r0)
            f1.i0.f(r0, r1, r2)
            y1.g0.s(r6, r0)
            int r1 = r5.getLeft()
            float r1 = (float) r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            f1.i0.d(r0)
            f1.i0.f(r0, r1, r2)
            y1.g0.s(r6, r0)
            goto L67
        L3a:
            java.lang.Object r1 = r4.f10225i
            int[] r1 = (int[]) r1
            r5.getLocationInWindow(r1)
            int r2 = r5.getScrollX()
            float r2 = (float) r2
            float r2 = -r2
            int r3 = r5.getScrollY()
            float r3 = (float) r3
            float r3 = -r3
            f1.i0.d(r0)
            f1.i0.f(r0, r2, r3)
            y1.g0.s(r6, r0)
            r2 = 0
            r2 = r1[r2]
            float r2 = (float) r2
            r3 = 1
            r1 = r1[r3]
            float r1 = (float) r1
            f1.i0.d(r0)
            f1.i0.f(r0, r2, r1)
            y1.g0.s(r6, r0)
        L67:
            android.graphics.Matrix r5 = r5.getMatrix()
            boolean r1 = r5.isIdentity()
            if (r1 != 0) goto L77
            f1.c0.q(r5, r0)
            y1.g0.s(r6, r0)
        L77:
            return
    }

    public void I(t4.a r11, boolean r12) {
            r10 = this;
            java.lang.Object r0 = r10.f10225i
            z4.d r0 = (z4.d) r0
            r1 = 0
            if (r12 == 0) goto Lf
            boolean r12 = r0.d()
            if (r12 == 0) goto Lf
            r12 = 1
            goto L10
        Lf:
            r12 = r1
        L10:
            java.lang.Object r2 = r10.f10224h
            r4.p r2 = (r4.p) r2
            r4.h0 r3 = r2.f11481f
            r4.h0 r2 = r2.f11482g
            v4.d0 r4 = r11.f13070h
            int r5 = r2.m(r4)
            java.lang.String r6 = " // "
            if (r12 == 0) goto L43
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "  type_idx: "
            r7.<init>(r8)
            java.lang.String r5 = a.a.Y0(r5)
            r7.append(r5)
            r7.append(r6)
            w4.c r4 = r4.f14088g
            java.lang.String r4 = r4.a()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r0.c(r4)
        L43:
            v4.d0 r4 = r11.f13070h
            int r2 = r2.m(r4)
            r0.n(r2)
            java.util.TreeMap r11 = r11.f13072j
            java.util.Collection r11 = r11.values()
            java.util.Collection r11 = java.util.Collections.unmodifiableCollection(r11)
            int r2 = r11.size()
            if (r12 == 0) goto L69
            java.lang.String r4 = a.a.Y0(r2)
            java.lang.String r5 = "  size: "
            java.lang.String r4 = r5.concat(r4)
            r0.c(r4)
        L69:
            r0.n(r2)
            java.util.Iterator r11 = r11.iterator()
            r2 = r1
        L71:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Ld4
            java.lang.Object r4 = r11.next()
            t4.d r4 = (t4.d) r4
            v4.c0 r5 = r4.f13076g
            int r7 = r3.l(r5)
            v4.a r4 = r4.f13077h
            if (r12 == 0) goto Lbe
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "  elements["
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = "]:"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.b(r1, r8)
            int r2 = r2 + 1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "    name_idx: "
            r8.<init>(r9)
            java.lang.String r9 = a.a.Y0(r7)
            r8.append(r9)
            r8.append(r6)
            java.lang.String r5 = r5.a()
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r0.c(r5)
        Lbe:
            r0.n(r7)
            if (r12 == 0) goto Ld0
            java.lang.String r5 = q(r4)
            java.lang.String r7 = "    value: "
            java.lang.String r5 = r7.concat(r5)
            r0.c(r5)
        Ld0:
            r10.K(r4)
            goto L71
        Ld4:
            if (r12 == 0) goto Ld9
            r0.e()
        Ld9:
            return
    }

    public void J(v4.d r7, boolean r8) {
            r6 = this;
            java.lang.Object r0 = r6.f10225i
            z4.d r0 = (z4.d) r0
            r1 = 0
            if (r8 == 0) goto Lf
            boolean r8 = r0.d()
            if (r8 == 0) goto Lf
            r8 = 1
            goto L10
        Lf:
            r8 = r1
        L10:
            v4.c r7 = r7.f14069g
            java.lang.Object[] r2 = r7.f22543h
            int r2 = r2.length
            if (r8 == 0) goto L24
            java.lang.String r3 = a.a.Y0(r2)
            java.lang.String r4 = "  size: "
            java.lang.String r3 = r4.concat(r3)
            r0.c(r3)
        L24:
            r0.n(r2)
        L27:
            if (r1 >= r2) goto L58
            java.lang.Object r3 = r7.l(r1)
            v4.a r3 = (v4.a) r3
            if (r8 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "  ["
            r4.<init>(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r1)
            r4.append(r5)
            java.lang.String r5 = "] "
            r4.append(r5)
            java.lang.String r5 = q(r3)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.c(r4)
        L52:
            r6.K(r3)
            int r1 = r1 + 1
            goto L27
        L58:
            if (r8 == 0) goto L5d
            r0.e()
        L5d:
            return
    }

    public void K(v4.a r9) {
            r8 = this;
            java.lang.Object r0 = r8.f10224h
            r4.p r0 = (r4.p) r0
            java.lang.Object r1 = r8.f10225i
            z4.d r1 = (z4.d) r1
            int r2 = r(r9)
            r3 = 3
            if (r2 == 0) goto Ld8
            r4 = 6
            if (r2 == r4) goto Ld8
            r4 = 2
            if (r2 == r4) goto Ld8
            if (r2 == r3) goto Lce
            r4 = 4
            if (r2 == r4) goto Ld8
            r3 = 16
            if (r2 == r3) goto Lc2
            r3 = 17
            if (r2 == r3) goto Lba
            r3 = 0
            switch(r2) {
                case 21: goto Lab;
                case 22: goto L94;
                case 23: goto L87;
                case 24: goto L7a;
                case 25: goto L6d;
                case 26: goto L60;
                case 27: goto L4f;
                case 28: goto L46;
                case 29: goto L3b;
                case 30: goto L37;
                case 31: goto L2c;
                default: goto L26;
            }
        L26:
            java.lang.String r9 = "Shouldn't happen"
            bsh.j.g(r9)
            return
        L2c:
            v4.f r9 = (v4.f) r9
            int r9 = r9.f14121g
            int r9 = r9 << 5
            r9 = r9 | r2
            r1.j(r9)
            return
        L37:
            r1.j(r2)
            return
        L3b:
            r1.j(r2)
            v4.b r9 = (v4.b) r9
            t4.a r9 = r9.f14065g
            r8.I(r9, r3)
            return
        L46:
            r1.j(r2)
            v4.d r9 = (v4.d) r9
            r8.J(r9, r3)
            return
        L4f:
            v4.l r9 = (v4.l) r9
            v4.m r9 = r9.k()
            r4.w r0 = r0.f11484i
            int r9 = r0.l(r9)
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        L60:
            r4.j0 r0 = r0.f11485j
            v4.y r9 = (v4.y) r9
            int r9 = r0.l(r9)
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        L6d:
            r4.w r0 = r0.f11484i
            v4.m r9 = (v4.m) r9
            int r9 = r0.l(r9)
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        L7a:
            r4.h0 r0 = r0.f11482g
            v4.d0 r9 = (v4.d0) r9
            int r9 = r0.m(r9)
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        L87:
            r4.h0 r0 = r0.f11481f
            v4.c0 r9 = (v4.c0) r9
            int r9 = r0.l(r9)
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        L94:
            r4.h0 r0 = r0.f11489n
            v4.x r9 = (v4.x) r9
            java.lang.Object r0 = r0.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.lang.Object r9 = r0.get(r9)
            r4.g0 r9 = (r4.g0) r9
            int r9 = r9.e()
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        Lab:
            r4.h0 r0 = r0.f11483h
            v4.a0 r9 = (v4.a0) r9
            w4.a r9 = r9.f14064g
            int r9 = r0.n(r9)
            long r3 = (long) r9
            g4.a.O(r1, r2, r3)
            return
        Lba:
            v4.k r9 = (v4.k) r9
            long r3 = r9.f14122g
            g4.a.N(r1, r2, r3)
            return
        Lc2:
            v4.n r9 = (v4.n) r9
            int r9 = r9.f14121g
            long r3 = (long) r9
            r9 = 32
            long r3 = r3 << r9
            g4.a.N(r1, r2, r3)
            return
        Lce:
            v4.u r9 = (v4.u) r9
            long r3 = r9.m()
            g4.a.O(r1, r2, r3)
            return
        Ld8:
            v4.u r9 = (v4.u) r9
            long r4 = r9.m()
            r9 = 63
            long r6 = r4 >> r9
            long r6 = r6 ^ r4
            int r9 = java.lang.Long.numberOfLeadingZeros(r6)
            int r9 = 72 - r9
            int r9 = r9 >> r3
            int r0 = r9 + (-1)
            int r0 = r0 << 5
            r0 = r0 | r2
            r1.j(r0)
        Lf2:
            if (r9 <= 0) goto Lff
            int r0 = (int) r4
            byte r0 = (byte) r0
            r1.j(r0)
            r0 = 8
            long r4 = r4 >> r0
            int r9 = r9 + (-1)
            goto Lf2
        Lff:
            return
    }

    @Override // wb.kv
    public boolean a() {
            r1 = this;
            java.lang.Object r0 = r1.f10225i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            return r0
    }

    @Override // tg.d
    public java.lang.Object b(tg.e r6, wf.c r7) {
            r5 = this;
            gg.q r0 = new gg.q
            r0.<init>()
            java.lang.Object r1 = r5.f10224h
            ug.g r1 = (ug.g) r1
            h.w r2 = new h.w
            java.lang.Object r3 = r5.f10225i
            i0.v1 r3 = (i0.v1) r3
            r4 = 1
            r2.<init>(r0, r6, r3, r4)
            java.lang.Object r6 = r1.b(r2, r7)
            xf.a r7 = xf.a.f21579g
            if (r6 != r7) goto L1c
            return r6
        L1c:
            sf.n r6 = sf.n.f12433a
            return r6
    }

    @Override // j8.l
    public void c(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f10224h
            v8.q r0 = (v8.q) r0
            java.lang.Object r1 = r4.f10225i
            v8.h r1 = (v8.h) r1
            ab.e r2 = new ab.e
            r3 = 14
            r2.<init>(r1, r5, r0, r3)
            r5 = 0
            r0.b(r1, r5, r2)
            return
    }

    @Override // wb.kv
    public void close() {
            r1 = this;
            java.lang.Object r0 = r1.f10224h
            wb.n7 r0 = (wb.n7) r0
            r0.invoke()
            return
    }

    @Override // v0.j
    public java.lang.Object d(v0.b r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.f10224h
            fg.p r0 = (fg.p) r0
            java.lang.Object r2 = r0.invoke(r2, r3)
            return r2
    }

    @Override // v0.j
    public java.lang.Object e(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10225i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r0.invoke(r2)
            return r2
    }

    @Override // v1.l1
    public void f(f.u0 r9) {
            r8 = this;
            java.lang.Object r0 = r8.f10225i
            f.b0 r0 = (f.b0) r0
            r0.a()
            java.lang.Object r1 = r9.f2914h
            f.g0 r1 = (f.g0) r1
            java.lang.Object[] r2 = r1.f2818b
            long[] r3 = r1.f2819c
            int r1 = r1.f2821e
        L11:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L44
            r4 = r3[r1]
            r6 = 31
            long r4 = r4 >> r6
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            r1 = r2[r1]
            java.lang.Object r5 = r8.f10224h
            s.b0 r5 = (s.b0) r5
            java.lang.Object r5 = r5.b(r1)
            int r6 = r0.d(r5)
            if (r6 < 0) goto L35
            int[] r7 = r0.f2776c
            r6 = r7[r6]
            goto L36
        L35:
            r6 = 0
        L36:
            r7 = 7
            if (r6 != r7) goto L3d
            r9.remove(r1)
            goto L42
        L3d:
            int r6 = r6 + 1
            r0.g(r6, r5)
        L42:
            r1 = r4
            goto L11
        L44:
            return
    }

    @Override // v1.l1
    public boolean g(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.f10224h
            s.b0 r0 = (s.b0) r0
            java.lang.Object r2 = r0.b(r2)
            java.lang.Object r3 = r0.b(r3)
            boolean r2 = gg.l.a(r2, r3)
            return r2
    }

    @Override // y1.v0
    public void h(android.view.View r1, float[] r2) {
            r0 = this;
            f1.i0.d(r2)
            r0.H(r1, r2)
            return
    }

    @Override // j8.l
    public void onSuccess(java.io.File r5) {
            r4 = this;
            java.lang.Object r0 = r4.f10224h
            v8.q r0 = (v8.q) r0
            java.lang.Object r1 = r4.f10225i
            v8.h r1 = (v8.h) r1
            v8.c r2 = new v8.c
            r2.<init>(r0, r1, r5)
            v8.c r3 = new v8.c
            r3.<init>(r1, r5, r0)
            r0.b(r1, r2, r3)
            return
    }

    public ud.p s(gf.a r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r0.f10225i
            ud.u r2 = (ud.u) r2
            java.lang.Object r3 = r0.f10224h
            ud.r r3 = (ud.r) r3
            gf.c r4 = r1.f4494d
            ac.k r5 = r1.f4492b
            r6 = 1
            if (r4 != 0) goto L15
            r4 = r6
            goto L17
        L15:
            int r4 = r4.f4534b
        L17:
            int r4 = t3.c.b(r4)
            pd.k r7 = pd.k.f10498g
            pd.k r8 = pd.k.f10503l
            pd.k r9 = pd.k.f10512u
            md.a r10 = md.a.f8828k0
            pd.k r11 = pd.k.f10507p
            pd.k r14 = pd.k.f10504m
            pd.k r15 = pd.k.f10511t
            r13 = 0
            r12 = 0
            switch(r4) {
                case 1: goto L88a;
                case 2: goto L883;
                case 3: goto L87c;
                case 4: goto L875;
                case 5: goto L86e;
                case 6: goto L867;
                case 7: goto L85f;
                case 8: goto L857;
                case 9: goto L84f;
                case 10: goto L846;
                case 11: goto L83f;
                case 12: goto L836;
                case 13: goto L82f;
                case 14: goto L828;
                case 15: goto L821;
                case 16: goto L81a;
                case 17: goto L813;
                case 18: goto L80a;
                case 19: goto L803;
                case 20: goto L7fc;
                case 21: goto L7f5;
                case 22: goto L7ee;
                case 23: goto L7e7;
                case 24: goto L7e0;
                case 25: goto L7d9;
                case 26: goto L2e;
                case 27: goto L7ae;
                case 28: goto L2e;
                case 29: goto L77b;
                case 30: goto L774;
                case 31: goto L76d;
                case 32: goto L766;
                case 33: goto L75f;
                case 34: goto L758;
                case 35: goto L73e;
                case 36: goto L713;
                case 37: goto L6f7;
                case 38: goto L6dd;
                case 39: goto L6d5;
                case 40: goto L6cd;
                case 41: goto L6c5;
                case 42: goto L6bd;
                case 43: goto L6b5;
                case 44: goto L6ac;
                case 45: goto L6a3;
                case 46: goto L69a;
                case 47: goto L691;
                case 48: goto L688;
                case 49: goto L67f;
                case 50: goto L677;
                case 51: goto L2e;
                case 52: goto L671;
                case 53: goto L671;
                case 54: goto L66a;
                case 55: goto L66a;
                case 56: goto L663;
                case 57: goto L663;
                case 58: goto L65c;
                case 59: goto L65c;
                case 60: goto L655;
                case 61: goto L655;
                case 62: goto L64e;
                case 63: goto L64e;
                case 64: goto L620;
                case 65: goto L617;
                case 66: goto L60e;
                case 67: goto L605;
                case 68: goto L5fc;
                case 69: goto L5f3;
                case 70: goto L5ea;
                case 71: goto L5e4;
                case 72: goto L5de;
                case 73: goto L5d8;
                case 74: goto L5d2;
                case 75: goto L5cd;
                case 76: goto L5c8;
                case 77: goto L5c2;
                case 78: goto L5bc;
                case 79: goto L5b6;
                case 80: goto L5b0;
                case 81: goto L57c;
                case 82: goto L50a;
                case 83: goto L497;
                case 84: goto L435;
                case 85: goto L3d3;
                case 86: goto L3ca;
                case 87: goto L3c1;
                case 88: goto L3b8;
                case 89: goto L3a4;
                case 90: goto L390;
                case 91: goto L375;
                case 92: goto L356;
                case 93: goto L33e;
                case 94: goto L323;
                case 95: goto L30b;
                case 96: goto L2f0;
                case 97: goto L2e8;
                case 98: goto L2e0;
                case 99: goto L2d8;
                case 100: goto L2d0;
                case 101: goto L2c8;
                case 102: goto L2e;
                case 103: goto L2c1;
                case 104: goto L2ba;
                case 105: goto L2b3;
                case 106: goto L2ac;
                case 107: goto L28e;
                case 108: goto L273;
                case 109: goto L258;
                case 110: goto L250;
                case 111: goto L248;
                case 112: goto L240;
                case 113: goto L238;
                case 114: goto L230;
                case 115: goto L228;
                case 116: goto L220;
                case 117: goto L218;
                case 118: goto L206;
                case 119: goto L200;
                case 120: goto L1dd;
                case 121: goto L1d4;
                case 122: goto L1cb;
                case 123: goto L1c2;
                case 124: goto L1b9;
                case 125: goto L1b0;
                case 126: goto L1a7;
                case 127: goto L19f;
                case 128: goto L197;
                case 129: goto L18f;
                case 130: goto L187;
                case 131: goto L173;
                case 132: goto L16a;
                case 133: goto L161;
                case 134: goto L158;
                case 135: goto L14f;
                case 136: goto L146;
                case 137: goto L13d;
                case 138: goto Lcc;
                case 139: goto Lc7;
                case 140: goto Lc2;
                case 141: goto Lad;
                case 142: goto L9a;
                case 143: goto L95;
                case 144: goto L8b;
                case 145: goto L86;
                case 146: goto L8b;
                case 147: goto L81;
                case 148: goto L7c;
                case 149: goto L77;
                case 150: goto L72;
                case 151: goto L2e;
                case 152: goto L2e;
                case 153: goto L57;
                case 154: goto L40;
                default: goto L2e;
            }
        L2e:
            af.b r2 = new af.b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Unknown instruction: '"
            java.lang.String r4 = "'"
            java.lang.String r1 = eh.a.n(r3, r1, r4)
            r2.<init>(r1)
            throw r2
        L40:
            r3.w(r10)
            qd.h r2 = qd.j.I
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            pd.k r1 = pd.k.f10496a0
            ud.p r1 = z(r1, r13, r3)
            return r1
        L57:
            r3.w(r10)
            sd.a r2 = new sd.a
            int r3 = r1.f4502l
            r2.<init>(r3)
            qd.h r3 = qd.j.I
            mh.b r4 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r4 = new qd.r
            r4.<init>(r1, r3)
            r2.d0(r4)
            return r2
        L72:
            ud.p r1 = r0.B(r1, r6)
            return r1
        L77:
            ud.p r1 = r0.B(r1, r12)
            return r1
        L7c:
            pd.o r1 = r0.C(r1, r6)
            return r1
        L81:
            pd.o r1 = r0.C(r1, r12)
            return r1
        L86:
            pd.s r1 = r0.D(r1, r12)
            return r1
        L8b:
            pd.r r2 = new pd.r
            sc.a r1 = r1.f4504n
            tc.a r1 = (tc.a) r1
            r2.<init>(r1)
            return r2
        L95:
            pd.s r1 = r0.D(r1, r6)
            return r1
        L9a:
            pd.e r2 = new pd.e
            sc.a r1 = r1.f4504n
            java.util.Objects.requireNonNull(r1)
            hf.a r1 = (hf.a) r1
            java.lang.Object r3 = r1.f5521c
            int r4 = r1.f5519a
            int r1 = r1.f5520b
            r2.<init>(r4, r1, r3)
            return r2
        Lad:
            pd.f r2 = new pd.f
            qd.a r3 = qd.j.f10890x
            mh.b r4 = qd.l.f10901k
            int[] r4 = r1.f4499i
            r4 = r4[r12]
            qd.r r5 = new qd.r
            r5.<init>(r4, r3)
            int r1 = r1.f4502l
            r2.<init>(r1, r5)
            return r2
        Lc2:
            pd.g r1 = v(r1, r6)
            return r1
        Lc7:
            pd.g r1 = v(r1, r12)
            return r1
        Lcc:
            java.lang.String r2 = r1.b()
            qd.j r2 = qd.j.z(r2)
            long r4 = r1.f4501k
            int r4 = (int) r4
            if (r4 != 0) goto Lda
            goto Lf7
        Lda:
            r2.getClass()
            boolean r5 = r2 instanceof qd.a
            if (r5 == 0) goto Le2
            goto Lf7
        Le2:
            if (r4 != r6) goto Leb
            qd.a r4 = new qd.a
            r4.<init>(r2)
            r2 = r4
            goto Lf7
        Leb:
            r5 = r12
        Lec:
            if (r5 >= r4) goto Lf7
            qd.a r7 = new qd.a
            r7.<init>(r2)
            int r5 = r5 + 1
            r2 = r7
            goto Lec
        Lf7:
            int r4 = r1.f4500j
            pd.p r5 = new pd.p
            int r7 = r4 + (-1)
            r5.<init>(r7, r2)
            mh.b r7 = qd.l.f10901k
            int[] r7 = r1.f4499i
            r7 = r7[r12]
            qd.r r8 = new qd.r
            r8.<init>(r7, r2)
            r5.d0(r8)
            r2 = r6
        L10f:
            if (r2 >= r4) goto L121
            qd.g r7 = qd.j.f10868b
            int[] r8 = r1.f4499i
            r8 = r8[r2]
            qd.r r7 = qd.l.T(r8, r7, r6)
            r5.I(r7)
            int r2 = r2 + 1
            goto L10f
        L121:
            md.b r1 = md.b.f8866u
            md.f r2 = r3.f8877g
            oc.b r1 = r2.c(r1)
            nd.d r1 = (nd.d) r1
            if (r1 != 0) goto L135
            nd.d r1 = new nd.d
            r1.<init>()
            r3.y(r1)
        L135:
            java.util.EnumSet r1 = r1.f9357g
            nd.c r2 = nd.c.f9354h
            r1.add(r2)
            return r5
        L13d:
            qd.g r2 = qd.j.f10875i
            r3 = 8
            pd.a r1 = k(r1, r3, r2)
            return r1
        L146:
            r3 = 8
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L14f:
            r3 = 8
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L158:
            qd.g r2 = qd.j.f10875i
            r3 = 11
            pd.a r1 = k(r1, r3, r2)
            return r1
        L161:
            r3 = 11
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L16a:
            r3 = 11
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L173:
            qd.e r2 = qd.j.f10881o
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            pd.k r1 = pd.k.f10509r
            ud.p r1 = z(r1, r13, r3)
            return r1
        L187:
            qd.g r2 = qd.j.f10875i
            r3 = 2
            pd.a r1 = k(r1, r3, r2)
            return r1
        L18f:
            r3 = 2
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L197:
            r3 = 2
            qd.g r2 = qd.j.f10873g
            pd.a r1 = k(r1, r3, r2)
            return r1
        L19f:
            r3 = 2
            qd.g r2 = qd.j.f10874h
            pd.a r1 = k(r1, r3, r2)
            return r1
        L1a7:
            qd.g r2 = qd.j.f10875i
            r3 = 10
            pd.a r1 = k(r1, r3, r2)
            return r1
        L1b0:
            r3 = 10
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L1b9:
            r3 = 10
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L1c2:
            qd.g r2 = qd.j.f10875i
            r3 = 9
            pd.a r1 = k(r1, r3, r2)
            return r1
        L1cb:
            r3 = 9
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L1d4:
            r3 = 9
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L1dd:
            pd.a r2 = new pd.a
            qd.g r3 = qd.j.f10868b
            mh.b r4 = qd.l.f10901k
            int[] r4 = r1.f4499i
            r4 = r4[r12]
            qd.r r5 = new qd.r
            r5.<init>(r4, r3)
            long r7 = r1.f4501k
            qd.n r4 = qd.l.S(r7, r3)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r6 = new qd.r
            r6.<init>(r1, r3)
            r3 = 2
            r2.<init>(r3, r5, r4, r6)
            return r2
        L200:
            ud.p r1 = new ud.p
            r1.<init>(r11, r12)
            return r1
        L206:
            qd.j r2 = r3.f13726t
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            ud.p r1 = z(r11, r13, r3)
            return r1
        L218:
            qd.g r2 = qd.j.f10875i
            r3 = 5
            pd.a r1 = k(r1, r3, r2)
            return r1
        L220:
            r3 = 5
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L228:
            r3 = 5
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L230:
            r3 = 5
            qd.g r2 = qd.j.f10873g
            pd.a r1 = k(r1, r3, r2)
            return r1
        L238:
            r3 = 5
            qd.g r2 = qd.j.f10874h
            pd.a r1 = k(r1, r3, r2)
            return r1
        L240:
            qd.g r2 = qd.j.f10875i
            r3 = 7
            pd.a r1 = k(r1, r3, r2)
            return r1
        L248:
            r3 = 7
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L250:
            r3 = 7
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L258:
            qd.g r2 = qd.j.f10875i
            ud.p r3 = new ud.p
            r3.<init>(r8, r6)
            qd.r r4 = qd.l.U(r1, r12, r2)
            r3.d0(r4)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r4 = new qd.r
            r4.<init>(r1, r2)
            r3.I(r4)
            return r3
        L273:
            qd.g r2 = qd.j.f10868b
            ud.p r3 = new ud.p
            r3.<init>(r8, r6)
            qd.r r4 = qd.l.U(r1, r12, r2)
            r3.d0(r4)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r4 = new qd.r
            r4.<init>(r1, r2)
            r3.I(r4)
            return r3
        L28e:
            java.lang.String r2 = r1.b()
            qd.j r2 = qd.j.z(r2)
            pd.j r3 = new pd.j
            pd.k r4 = pd.k.J
            r3.<init>(r4, r2, r12)
            mh.b r4 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r4 = new qd.r
            r4.<init>(r1, r2)
            r3.d0(r4)
            return r3
        L2ac:
            qd.g r2 = qd.j.f10875i
            ud.p r1 = E(r1, r2)
            return r1
        L2b3:
            qd.g r2 = qd.j.f10868b
            ud.p r1 = E(r1, r2)
            return r1
        L2ba:
            qd.g r2 = qd.j.f10873g
            ud.p r1 = E(r1, r2)
            return r1
        L2c1:
            qd.g r2 = qd.j.f10874h
            ud.p r1 = E(r1, r2)
            return r1
        L2c8:
            qd.g r2 = qd.j.f10875i
            r3 = 3
            pd.a r1 = k(r1, r3, r2)
            return r1
        L2d0:
            r3 = 3
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L2d8:
            r3 = 3
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L2e0:
            r3 = 3
            qd.g r2 = qd.j.f10873g
            pd.a r1 = k(r1, r3, r2)
            return r1
        L2e8:
            r3 = 3
            qd.g r2 = qd.j.f10874h
            pd.a r1 = k(r1, r3, r2)
            return r1
        L2f0:
            qd.h r2 = qd.j.E
            mh.b r3 = qd.l.f10901k
            int[] r3 = r1.f4499i
            r3 = r3[r12]
            qd.r r4 = new qd.r
            r4.<init>(r3, r2)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            ud.p r1 = z(r14, r4, r3)
            return r1
        L30b:
            qd.h r2 = qd.j.f10887u
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            ud.p r1 = new ud.p
            pd.k r2 = pd.k.P
            r1.<init>(r2, r12)
            r1.d0(r3)
            return r1
        L323:
            qd.h r2 = qd.j.f10888v
            mh.b r3 = qd.l.f10901k
            int[] r3 = r1.f4499i
            r3 = r3[r12]
            qd.r r4 = new qd.r
            r4.<init>(r3, r2)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            ud.p r1 = z(r14, r4, r3)
            return r1
        L33e:
            qd.h r2 = qd.j.f10889w
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            ud.p r1 = new ud.p
            pd.k r2 = pd.k.f10510s
            r1.<init>(r2, r12)
            r1.d0(r3)
            return r1
        L356:
            int r2 = r1.f4500j
            ud.p r3 = new ud.p
            pd.k r4 = pd.k.f10505n
            r3.<init>(r4, r2)
        L35f:
            if (r12 >= r2) goto L374
            qd.h r4 = qd.j.f10887u
            mh.b r5 = qd.l.f10901k
            int[] r5 = r1.f4499i
            r5 = r5[r12]
            qd.r r6 = new qd.r
            r6.<init>(r5, r4)
            r3.I(r6)
            int r12 = r12 + 1
            goto L35f
        L374:
            return r3
        L375:
            qd.h r2 = qd.j.f10891y
            mh.b r3 = qd.l.f10901k
            int[] r3 = r1.f4499i
            r3 = r3[r12]
            qd.r r4 = new qd.r
            r4.<init>(r3, r2)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            ud.p r1 = z(r14, r4, r3)
            return r1
        L390:
            qd.h r2 = qd.j.f10888v
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            pd.k r1 = pd.k.f10517z
            ud.p r1 = z(r1, r13, r3)
            return r1
        L3a4:
            qd.h r2 = qd.j.f10888v
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            pd.k r1 = pd.k.f10516y
            ud.p r1 = z(r1, r13, r3)
            return r1
        L3b8:
            qd.g r2 = qd.j.f10875i
            qd.g r3 = qd.j.f10868b
            pd.j r1 = o(r1, r2, r3)
            return r1
        L3c1:
            qd.g r2 = qd.j.f10875i
            qd.g r3 = qd.j.f10873g
            pd.j r1 = o(r1, r2, r3)
            return r1
        L3ca:
            qd.g r2 = qd.j.f10875i
            qd.g r3 = qd.j.f10874h
            pd.j r1 = o(r1, r2, r3)
            return r1
        L3d3:
            int r3 = r1.f4503m
            java.lang.Object r4 = r5.f179j
            ff.e r4 = (ff.e) r4
            jf.e r4 = r4.f3934d
            int r4 = r4.f6881e
            r16 = 8
            int r3 = r3 * 8
            int r3 = r3 + r4
            r5.a(r3)
            int r3 = r5.L()
            int r4 = r5.L()
            java.lang.Object r7 = r5.f178i
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.getInt()
            java.lang.String r4 = r5.y(r4)
            java.lang.String r7 = r5.v(r7)
            java.lang.String r3 = r5.y(r3)
            od.a r3 = od.a.d(r2, r3)
            od.c r5 = new od.c
            qd.j r4 = qd.j.z(r4)
            r5.<init>(r3, r7, r4)
            be.k r3 = r2.f13746e
            od.c r3 = r3.h(r5)
            pd.j r4 = new pd.j
            pd.k r5 = pd.k.N
            r4.<init>(r5, r3, r6)
            ud.g r2 = r2.h(r3)
            if (r2 == 0) goto L424
            qd.j r2 = r2.f13709n
            goto L426
        L424:
            qd.j r2 = r3.f9775i
        L426:
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            r4.I(r3)
            return r4
        L435:
            int r3 = r1.f4503m
            java.lang.Object r4 = r5.f179j
            ff.e r4 = (ff.e) r4
            jf.e r4 = r4.f3934d
            int r4 = r4.f6881e
            r16 = 8
            int r3 = r3 * 8
            int r3 = r3 + r4
            r5.a(r3)
            int r3 = r5.L()
            int r4 = r5.L()
            java.lang.Object r6 = r5.f178i
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt()
            java.lang.String r4 = r5.y(r4)
            java.lang.String r6 = r5.v(r6)
            java.lang.String r3 = r5.y(r3)
            od.a r3 = od.a.d(r2, r3)
            od.c r5 = new od.c
            qd.j r4 = qd.j.z(r4)
            r5.<init>(r3, r6, r4)
            be.k r3 = r2.f13746e
            od.c r3 = r3.h(r5)
            pd.j r4 = new pd.j
            pd.k r5 = pd.k.M
            r4.<init>(r5, r3, r12)
            ud.g r2 = r2.h(r3)
            if (r2 == 0) goto L486
            qd.j r2 = r2.f13709n
            goto L488
        L486:
            qd.j r2 = r3.f9775i
        L488:
            mh.b r3 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            r4.d0(r3)
            return r4
        L497:
            int r3 = r1.f4503m
            java.lang.Object r4 = r5.f179j
            ff.e r4 = (ff.e) r4
            jf.e r4 = r4.f3934d
            int r4 = r4.f6881e
            r16 = 8
            int r3 = r3 * 8
            int r3 = r3 + r4
            r5.a(r3)
            int r3 = r5.L()
            int r4 = r5.L()
            java.lang.Object r7 = r5.f178i
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.getInt()
            java.lang.String r4 = r5.y(r4)
            java.lang.String r7 = r5.v(r7)
            java.lang.String r3 = r5.y(r3)
            od.a r3 = od.a.d(r2, r3)
            od.c r5 = new od.c
            qd.j r4 = qd.j.z(r4)
            r5.<init>(r3, r7, r4)
            be.k r3 = r2.f13746e
            od.c r3 = r3.h(r5)
            pd.j r4 = new pd.j
            pd.k r5 = pd.k.L
            r7 = 2
            r4.<init>(r5, r3, r7)
            ud.g r2 = r2.h(r3)
            if (r2 == 0) goto L4e9
            qd.j r2 = r2.f13709n
            goto L4eb
        L4e9:
            qd.j r2 = r3.f9775i
        L4eb:
            mh.b r5 = qd.l.f10901k
            int[] r5 = r1.f4499i
            r5 = r5[r12]
            qd.r r7 = new qd.r
            r7.<init>(r5, r2)
            r4.I(r7)
            od.a r2 = r3.f9773g
            qd.j r2 = r2.f9765g
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            r4.I(r3)
            return r4
        L50a:
            int r3 = r1.f4503m
            java.lang.Object r4 = r5.f179j
            ff.e r4 = (ff.e) r4
            jf.e r4 = r4.f3934d
            int r4 = r4.f6881e
            r16 = 8
            int r3 = r3 * 8
            int r3 = r3 + r4
            r5.a(r3)
            int r3 = r5.L()
            int r4 = r5.L()
            java.lang.Object r7 = r5.f178i
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.getInt()
            java.lang.String r4 = r5.y(r4)
            java.lang.String r7 = r5.v(r7)
            java.lang.String r3 = r5.y(r3)
            od.a r3 = od.a.d(r2, r3)
            od.c r5 = new od.c
            qd.j r4 = qd.j.z(r4)
            r5.<init>(r3, r7, r4)
            be.k r3 = r2.f13746e
            od.c r3 = r3.h(r5)
            pd.j r4 = new pd.j
            pd.k r5 = pd.k.K
            r4.<init>(r5, r3, r6)
            ud.g r2 = r2.h(r3)
            if (r2 == 0) goto L55b
            qd.j r2 = r2.f13709n
            goto L55d
        L55b:
            qd.j r2 = r3.f9775i
        L55d:
            mh.b r5 = qd.l.f10901k
            int[] r5 = r1.f4499i
            r5 = r5[r12]
            qd.r r7 = new qd.r
            r7.<init>(r5, r2)
            r4.d0(r7)
            od.a r2 = r3.f9773g
            qd.j r2 = r2.f9765g
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r3 = new qd.r
            r3.<init>(r1, r2)
            r4.I(r3)
            return r4
        L57c:
            jf.h r4 = ig.a.x(r1)
            if (r4 == 0) goto L5a2
            od.d r2 = od.d.d(r2, r4)
            boolean r4 = r2.f()
            if (r4 != 0) goto L59b
            od.a r4 = r2.f9780j
            ud.e r3 = r3.f13718l
            od.a r3 = r3.f13690m
            boolean r3 = java.util.Objects.equals(r4, r3)
            if (r3 == 0) goto L599
            goto L59b
        L599:
            r13 = 5
            goto L59c
        L59b:
            r13 = 2
        L59c:
            pd.n r3 = new pd.n
            r3.<init>(r2, r1, r13, r12)
            return r3
        L5a2:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed to load method reference for insn: "
            java.lang.String r1 = r2.concat(r1)
            ah.a.k(r1)
            return r13
        L5b0:
            r3 = 3
            pd.n r1 = r0.A(r1, r3, r6)
            return r1
        L5b6:
            r3 = 3
            pd.n r1 = r0.A(r1, r3, r12)
            return r1
        L5bc:
            r3 = 5
            pd.n r1 = r0.A(r1, r3, r6)
            return r1
        L5c2:
            r3 = 5
            pd.n r1 = r0.A(r1, r3, r12)
            return r1
        L5c8:
            pd.n r1 = r0.A(r1, r6, r6)
            return r1
        L5cd:
            pd.n r1 = r0.A(r1, r6, r12)
            return r1
        L5d2:
            r2 = 4
            pd.n r1 = r0.A(r1, r2, r6)
            return r1
        L5d8:
            r2 = 4
            pd.n r1 = r0.A(r1, r2, r12)
            return r1
        L5de:
            r3 = 2
            pd.n r1 = r0.A(r1, r3, r6)
            return r1
        L5e4:
            r3 = 2
            pd.n r1 = r0.A(r1, r3, r12)
            return r1
        L5ea:
            qd.g r2 = qd.j.f10868b
            qd.g r3 = qd.j.f10871e
            pd.j r1 = o(r1, r2, r3)
            return r1
        L5f3:
            qd.g r2 = qd.j.f10868b
            qd.g r3 = qd.j.f10875i
            pd.j r1 = o(r1, r2, r3)
            return r1
        L5fc:
            qd.g r2 = qd.j.f10868b
            qd.g r3 = qd.j.f10873g
            pd.j r1 = o(r1, r2, r3)
            return r1
        L605:
            qd.g r2 = qd.j.f10868b
            qd.g r3 = qd.j.f10874h
            pd.j r1 = o(r1, r2, r3)
            return r1
        L60e:
            qd.g r2 = qd.j.f10868b
            qd.g r3 = qd.j.f10872f
            pd.j r1 = o(r1, r2, r3)
            return r1
        L617:
            qd.g r2 = qd.j.f10868b
            qd.g r3 = qd.j.f10870d
            pd.j r1 = o(r1, r2, r3)
            return r1
        L620:
            pd.j r2 = new pd.j
            java.lang.String r3 = r1.b()
            qd.j r3 = qd.j.z(r3)
            pd.k r4 = pd.k.B
            r2.<init>(r4, r3, r6)
            qd.g r3 = qd.j.f10869c
            mh.b r4 = qd.l.f10901k
            int[] r4 = r1.f4499i
            r4 = r4[r12]
            qd.r r5 = new qd.r
            r5.<init>(r4, r3)
            r2.d0(r5)
            qd.h r3 = qd.j.f10888v
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r4 = new qd.r
            r4.<init>(r1, r3)
            r2.I(r4)
            return r2
        L64e:
            pd.i r2 = new pd.i
            r3 = 2
            r2.<init>(r1, r3)
            return r2
        L655:
            pd.i r2 = new pd.i
            r3 = 3
            r2.<init>(r1, r3)
            return r2
        L65c:
            pd.i r2 = new pd.i
            r3 = 4
            r2.<init>(r1, r3)
            return r2
        L663:
            pd.i r2 = new pd.i
            r3 = 5
            r2.<init>(r1, r3)
            return r2
        L66a:
            pd.i r2 = new pd.i
            r3 = 6
            r2.<init>(r1, r3)
            return r2
        L671:
            pd.i r2 = new pd.i
            r2.<init>(r1, r6)
            return r2
        L677:
            pd.h r2 = new pd.h
            int r1 = r1.f4502l
            r2.<init>(r1)
            return r2
        L67f:
            qd.g r2 = qd.j.f10873g
            qd.g r3 = qd.j.f10875i
            pd.j r1 = o(r1, r2, r3)
            return r1
        L688:
            qd.g r2 = qd.j.f10873g
            qd.g r3 = qd.j.f10868b
            pd.j r1 = o(r1, r2, r3)
            return r1
        L691:
            qd.g r2 = qd.j.f10873g
            qd.g r3 = qd.j.f10874h
            pd.j r1 = o(r1, r2, r3)
            return r1
        L69a:
            qd.g r2 = qd.j.f10874h
            qd.g r3 = qd.j.f10875i
            pd.j r1 = o(r1, r2, r3)
            return r1
        L6a3:
            qd.g r2 = qd.j.f10874h
            qd.g r3 = qd.j.f10868b
            pd.j r1 = o(r1, r2, r3)
            return r1
        L6ac:
            qd.g r2 = qd.j.f10874h
            qd.g r3 = qd.j.f10873g
            pd.j r1 = o(r1, r2, r3)
            return r1
        L6b5:
            qd.g r2 = qd.j.f10875i
            r3 = 4
            pd.a r1 = k(r1, r3, r2)
            return r1
        L6bd:
            r3 = 4
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L6c5:
            r3 = 4
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L6cd:
            r3 = 4
            qd.g r2 = qd.j.f10873g
            pd.a r1 = k(r1, r3, r2)
            return r1
        L6d5:
            r3 = 4
            qd.g r2 = qd.j.f10874h
            pd.a r1 = k(r1, r3, r2)
            return r1
        L6dd:
            qd.h r2 = qd.j.E
            mh.b r3 = qd.l.f10901k
            long r3 = r1.f4501k
            qd.n r2 = qd.l.S(r3, r2)
            qd.j r3 = r2.f10902i
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r4 = new qd.r
            r4.<init>(r1, r3)
            ud.p r1 = z(r7, r4, r2)
            return r1
        L6f7:
            pd.d r2 = new pd.d
            int r3 = r1.f4503m
            java.lang.String r3 = r5.v(r3)
            r2.<init>(r3)
            qd.e r3 = qd.j.f10879m
            mh.b r4 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r4 = new qd.r
            r4.<init>(r1, r3)
            r2.d0(r4)
            return r2
        L713:
            java.lang.String r2 = r1.b()
            qd.j r2 = qd.j.z(r2)
            pd.c r3 = new pd.c
            r3.<init>(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            qd.b r4 = new qd.b
            java.lang.String r5 = "java.lang.Class"
            java.lang.String r5 = xe.s.b(r5)
            r4.<init>(r5, r2)
            mh.b r2 = qd.l.f10901k
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r2 = new qd.r
            r2.<init>(r1, r4)
            r3.d0(r2)
            return r3
        L73e:
            qd.h r2 = qd.j.f10891y
            mh.b r3 = qd.l.f10901k
            long r3 = r1.f4501k
            qd.n r2 = qd.l.S(r3, r2)
            qd.j r3 = r2.f10902i
            int[] r1 = r1.f4499i
            r1 = r1[r12]
            qd.r r4 = new qd.r
            r4.<init>(r1, r3)
            ud.p r1 = z(r7, r4, r2)
            return r1
        L758:
            qd.g r2 = qd.j.f10875i
            ud.p r1 = p(r1, r15, r2)
            return r1
        L75f:
            qd.g r2 = qd.j.f10873g
            ud.p r1 = p(r1, r15, r2)
            return r1
        L766:
            qd.g r2 = qd.j.f10874h
            ud.p r1 = p(r1, r15, r2)
            return r1
        L76d:
            qd.g r2 = qd.j.f10873g
            ud.p r1 = p(r1, r9, r2)
            return r1
        L774:
            qd.g r2 = qd.j.f10874h
            ud.p r1 = p(r1, r9, r2)
            return r1
        L77b:
            java.lang.String r2 = r1.b()
            qd.j r2 = qd.j.z(r2)
            pd.j r3 = new pd.j
            pd.k r4 = pd.k.A
            r3.<init>(r4, r2, r6)
            mh.b r4 = qd.l.f10901k
            int[] r4 = r1.f4499i
            r4 = r4[r12]
            qd.r r5 = new qd.r
            r5.<init>(r4, r2)
            r3.d0(r5)
            int r2 = r1.f4500j
            r7 = 2
            if (r2 != r7) goto L79e
            goto L79f
        L79e:
            r6 = r12
        L79f:
            qd.h r2 = qd.j.f10888v
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r4 = new qd.r
            r4.<init>(r1, r2)
            r3.I(r4)
            return r3
        L7ae:
            ud.p r2 = new ud.p
            pd.k r3 = pd.k.C
            r2.<init>(r3, r6)
            qd.g r3 = qd.j.f10868b
            mh.b r4 = qd.l.f10901k
            int[] r4 = r1.f4499i
            r4 = r4[r12]
            qd.r r5 = new qd.r
            r5.<init>(r4, r3)
            r2.d0(r5)
            qd.h r3 = qd.j.f10887u
            qd.a r4 = new qd.a
            r4.<init>(r3)
            int[] r1 = r1.f4499i
            r1 = r1[r6]
            qd.r r3 = new qd.r
            r3.<init>(r1, r4)
            r2.I(r3)
            return r2
        L7d9:
            qd.h r2 = qd.j.E
            ud.p r1 = n(r1, r2, r2)
            return r1
        L7e0:
            qd.g r2 = qd.j.f10871e
            ud.p r1 = n(r1, r2, r2)
            return r1
        L7e7:
            qd.h r2 = qd.j.f10888v
            ud.p r1 = n(r1, r2, r2)
            return r1
        L7ee:
            qd.g r2 = qd.j.f10872f
            ud.p r1 = n(r1, r2, r2)
            return r1
        L7f5:
            qd.h r2 = qd.j.H
            ud.p r1 = n(r1, r2, r2)
            return r1
        L7fc:
            qd.g r2 = qd.j.f10870d
            ud.p r1 = n(r1, r2, r2)
            return r1
        L803:
            qd.g r2 = qd.j.f10869c
            ud.p r1 = n(r1, r2, r2)
            return r1
        L80a:
            qd.h r2 = qd.j.F
            qd.h r3 = qd.j.B
            ud.p r1 = n(r1, r2, r3)
            return r1
        L813:
            qd.h r2 = qd.j.E
            ud.p r1 = m(r1, r2, r2)
            return r1
        L81a:
            qd.g r2 = qd.j.f10871e
            ud.p r1 = m(r1, r2, r2)
            return r1
        L821:
            qd.h r2 = qd.j.f10888v
            ud.p r1 = m(r1, r2, r2)
            return r1
        L828:
            qd.g r2 = qd.j.f10872f
            ud.p r1 = m(r1, r2, r2)
            return r1
        L82f:
            qd.h r2 = qd.j.H
            ud.p r1 = m(r1, r2, r2)
            return r1
        L836:
            qd.g r2 = qd.j.f10870d
            qd.h r3 = qd.j.A
            ud.p r1 = m(r1, r2, r3)
            return r1
        L83f:
            qd.g r2 = qd.j.f10869c
            ud.p r1 = m(r1, r2, r2)
            return r1
        L846:
            qd.h r2 = qd.j.F
            qd.h r3 = qd.j.B
            ud.p r1 = m(r1, r2, r3)
            return r1
        L84f:
            qd.g r2 = qd.j.f10875i
            r3 = 6
            pd.a r1 = k(r1, r3, r2)
            return r1
        L857:
            r3 = 6
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r3, r2)
            return r1
        L85f:
            r3 = 6
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r3, r2)
            return r1
        L867:
            qd.g r2 = qd.j.f10875i
            pd.a r1 = k(r1, r6, r2)
            return r1
        L86e:
            qd.g r2 = qd.j.f10868b
            pd.a r1 = l(r1, r6, r2)
            return r1
        L875:
            qd.g r2 = qd.j.f10868b
            pd.a r1 = k(r1, r6, r2)
            return r1
        L87c:
            qd.g r2 = qd.j.f10873g
            pd.a r1 = k(r1, r6, r2)
            return r1
        L883:
            qd.g r2 = qd.j.f10874h
            pd.a r1 = k(r1, r6, r2)
            return r1
        L88a:
            ud.p r1 = new ud.p
            pd.k r2 = pd.k.Q
            r1.<init>(r2, r12)
            return r1
    }

    public void t() {
            r6 = this;
            java.lang.Object r0 = r6.f10224h
            j0.b r0 = (j0.b) r0
            java.lang.Object[] r1 = r0.f6671g
            int r2 = r0.f6673i
            r3 = 0
            x1.o1 r4 = x1.o1.f21013h
            java.util.Arrays.sort(r1, r3, r2, r4)
            int r1 = r0.f6673i
            java.lang.Object r2 = r6.f10225i
            x1.f0[] r2 = (x1.f0[]) r2
            if (r2 == 0) goto L19
            int r4 = r2.length
            if (r4 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            x1.f0[] r2 = new x1.f0[r2]
        L21:
            r4 = 0
            r6.f10225i = r4
        L24:
            if (r3 >= r1) goto L2f
            java.lang.Object[] r5 = r0.f6671g
            r5 = r5[r3]
            r2[r3] = r5
            int r3 = r3 + 1
            goto L24
        L2f:
            r0.g()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L48
            r0 = r2[r1]
            r0.getClass()
            boolean r3 = r0.U
            if (r3 == 0) goto L43
            u(r0)
        L43:
            r2[r1] = r4
            int r1 = r1 + (-1)
            goto L34
        L48:
            r6.f10225i = r2
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f10223g
            switch(r0) {
                case 2: goto L25;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r5.f10224h
            qd.j r0 = (qd.j) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r5.f10225i
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", bounds="
            java.lang.String r3 = "}"
            java.lang.String r4 = "TypeInfo{type="
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
        L25:
            java.lang.Object r0 = r5.f10224h
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r5.f10225i
            java.util.List r1 = (java.util.List) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", localVars="
            java.lang.String r3 = "}"
            java.lang.String r4 = "DebugInfo{lines="
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }

    public boolean w(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.f10225i     // Catch: java.lang.Throwable -> Lc
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lc
            boolean r3 = r1.getBoolean(r3, r0)     // Catch: java.lang.Throwable -> Lc
            return r3
        Lc:
            return r0
    }

    public v1.n0 x() {
            r1 = this;
            java.lang.Object r0 = r1.f10225i
            i0.j1 r0 = (i0.j1) r0
            java.lang.Object r0 = r0.getValue()
            v1.n0 r0 = (v1.n0) r0
            return r0
    }

    public java.lang.String y(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r0 = r1.f10225i     // Catch: java.lang.Throwable -> Ld
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Ld
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto Ld
            return r2
        Ld:
            return r3
    }
}
