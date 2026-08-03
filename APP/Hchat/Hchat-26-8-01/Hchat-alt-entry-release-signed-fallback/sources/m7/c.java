package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends v7.c implements java.lang.Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r7.l f8736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r7.l f8737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r7.l f8738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r7.l f8739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m7.u f8740s;

    @Override // v7.j0, r7.b, k7.a
    public final void B(q7.b r6) {
            r5 = this;
            super.B(r6)
            v7.k0 r6 = r5.T()
            v7.k0 r0 = v7.k0.f14178u
            if (r6 != r0) goto L1a
            u7.a r6 = r5.b0()
            if (r6 == 0) goto L1d
            boolean r0 = r6.f13534s
            if (r0 == 0) goto L16
            goto L1d
        L16:
            r5.U(r6)
            goto L1d
        L1a:
            r5.W()
        L1d:
            r7.l r6 = r5.f8736o
            r5.e0(r6)
            r6 = 0
            r7.l r6 = r5.c0(r6)
            r5.f8736o = r6
            r7.l r6 = r5.f8737p
            r5.e0(r6)
            r6 = 4
            r7.l r0 = r5.c0(r6)
            r5.f8737p = r0
            r7.l r0 = r5.f8739r
            r5.e0(r0)
            r0 = 8
            r7.l r0 = r5.c0(r0)
            r5.f8739r = r0
            byte[] r0 = r5.f11553k
            int r0 = k7.a.s(r0, r6)
            r1 = 0
            if (r0 >= 0) goto L4d
        L4b:
            r0 = r1
            goto L58
        L4d:
            u7.a r2 = r5.b0()
            if (r2 != 0) goto L54
            goto L4b
        L54:
            r7.s r0 = r2.V(r0)
        L58:
            r7.o r0 = (r7.o) r0
            if (r0 == 0) goto L5f
            r7.n r0 = r0.f11574t
            goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 != 0) goto L63
            goto L94
        L63:
            r7.l r2 = r5.f8738q
            if (r2 == 0) goto L82
            java.lang.Object r2 = r0.f11572o
            java.util.Iterator r2 = y7.a.g(r2)
        L6d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r2.next()
            r7.m r3 = (r7.m) r3
            java.lang.Class<m7.c> r4 = m7.c.class
            k7.a r3 = r3.d(r4)
            if (r3 != r5) goto L6d
            goto L94
        L82:
            r5.d0(r0)
            r7.l r2 = new r7.l
            r2.<init>(r5, r6)
            java.lang.Object r6 = r0.f11572o
            java.lang.Object r6 = y7.a.a(r6, r2)
            r0.f11572o = r6
            r5.f8738q = r2
        L94:
            m7.u r6 = r5.f8740s
            if (r6 != 0) goto L99
            goto La0
        L99:
            r5.f8740s = r1
            java.util.HashSet r6 = r6.f8772q
            r6.remove(r5)
        La0:
            m7.u r6 = r5.a0()
            if (r6 != 0) goto La7
            return
        La7:
            r5.f8740s = r6
            java.util.HashSet r6 = r6.f8772q
            r6.add(r5)
            return
    }

    @Override // v7.j0
    public final l7.g P() {
            r2 = this;
            java.lang.Class<m7.j> r0 = m7.j.class
            k7.a r0 = r2.u(r0)
            m7.j r0 = (m7.j) r0
            if (r0 == 0) goto L13
            java.lang.Class<m7.f> r1 = m7.f.class
            k7.a r0 = r0.v(r1)
            m7.f r0 = (m7.f) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // v7.j0
    public final void V(v7.h0 r1) {
            r0 = this;
            r0.e0(r1)
            return
    }

    @Override // v7.c
    public final int Z() {
            r3 = this;
            byte[] r0 = r3.f11553k
            r1 = 4
            int r0 = k7.a.s(r0, r1)
            r1 = 0
            if (r0 >= 0) goto Lc
        La:
            r0 = r1
            goto L17
        Lc:
            u7.a r2 = r3.b0()
            if (r2 != 0) goto L13
            goto La
        L13:
            r7.s r0 = r2.V(r0)
        L17:
            r7.o r0 = (r7.o) r0
            if (r0 == 0) goto L1d
            r7.n r1 = r0.f11574t
        L1d:
            if (r1 == 0) goto L22
            int r0 = r1.f11560n
            return r0
        L22:
            r0 = 0
            return r0
    }

    public final m7.u a0() {
            r3 = this;
            byte[] r0 = r3.f11553k
            r1 = 0
            int r0 = k7.a.s(r0, r1)
            if (r0 >= 0) goto La
            goto L24
        La:
            m7.u r1 = r3.f8740s
            if (r1 == 0) goto L15
            r7.f r2 = r1.f8735p
            int r2 = r2.f11560n
            if (r2 != r0) goto L15
            return r1
        L15:
            java.lang.Class<m7.j> r1 = m7.j.class
            k7.a r1 = r3.u(r1)
            m7.j r1 = (m7.j) r1
            if (r1 == 0) goto L24
            m7.u r0 = r1.U(r0)
            return r0
        L24:
            r0 = 0
            return r0
    }

    public final u7.a b0() {
            r2 = this;
            u7.c r0 = super.g()
            boolean r1 = r0 instanceof u7.a
            if (r1 == 0) goto Lb
            u7.a r0 = (u7.a) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final r7.l c0(int r3) {
            r2 = this;
            if (r3 >= 0) goto L3
            goto L16
        L3:
            u7.a r0 = r2.b0()
            if (r0 != 0) goto La
            goto L16
        La:
            byte[] r1 = r2.f11553k
            int r1 = k7.a.s(r1, r3)
            r7.s r0 = r0.V(r1)
            if (r0 != 0) goto L18
        L16:
            r3 = 0
            return r3
        L18:
            r7.l r1 = new r7.l
            r1.<init>(r2, r3)
            r0.P(r1)
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r7) {
            r6 = this;
            m7.c r7 = (m7.c) r7
            int r0 = r6.Z()
            int r1 = r7.Z()
            if (r0 != 0) goto L10
            if (r1 == 0) goto L10
            r7 = 1
            return r7
        L10:
            if (r1 != 0) goto L16
            if (r0 == 0) goto L16
            r7 = -1
            return r7
        L16:
            if (r0 == 0) goto L1d
            int r7 = java.lang.Integer.compare(r0, r1)
            return r7
        L1d:
            byte[] r0 = r6.f11553k
            r1 = 4
            int r0 = k7.a.s(r0, r1)
            u7.a r2 = r6.b0()
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L2d
            goto L43
        L2d:
            if (r0 >= 0) goto L31
        L2f:
            r0 = r4
            goto L3c
        L31:
            u7.a r2 = r6.b0()
            if (r2 != 0) goto L38
            goto L2f
        L38:
            r7.s r0 = r2.V(r0)
        L3c:
            if (r0 != 0) goto L3f
            goto L43
        L3f:
            java.lang.String r2 = r0.f11578m
            if (r2 != 0) goto L45
        L43:
            r2 = r4
            goto L4e
        L45:
            r7.u r0 = r0.f11583q
            if (r0 != 0) goto L4a
            goto L4e
        L4a:
            java.lang.String r2 = r0.Q(r2, r3)
        L4e:
            java.lang.String r0 = ""
            if (r2 != 0) goto L53
            r2 = r0
        L53:
            byte[] r5 = r7.f11553k
            int r1 = k7.a.s(r5, r1)
            u7.a r5 = r7.b0()
            if (r5 != 0) goto L60
            goto L81
        L60:
            if (r1 >= 0) goto L64
        L62:
            r7 = r4
            goto L6f
        L64:
            u7.a r7 = r7.b0()
            if (r7 != 0) goto L6b
            goto L62
        L6b:
            r7.s r7 = r7.V(r1)
        L6f:
            if (r7 != 0) goto L72
            goto L81
        L72:
            java.lang.String r1 = r7.f11578m
            if (r1 != 0) goto L77
            goto L81
        L77:
            r7.u r7 = r7.f11583q
            if (r7 != 0) goto L7d
            r4 = r1
            goto L81
        L7d:
            java.lang.String r4 = r7.Q(r1, r3)
        L81:
            if (r4 != 0) goto L84
            goto L85
        L84:
            r0 = r4
        L85:
            int r7 = r2.compareTo(r0)
            return r7
    }

    public final void d0(r7.n r8) {
            r7 = this;
            r7.l r0 = r7.f8738q
            if (r0 == 0) goto La8
            if (r8 != 0) goto L8
            goto La8
        L8:
            java.lang.Object r1 = r8.f11572o
            java.lang.Object r0 = y7.a.i(r1, r0)
            r8.f11572o = r0
            r0 = 0
            r7.f8738q = r0
            boolean r1 = r8.O()
            if (r1 == 0) goto L1b
            goto La8
        L1b:
            java.lang.Class<m7.j> r1 = m7.j.class
            k7.a r1 = r7.u(r1)
            m7.j r1 = (m7.j) r1
            java.lang.Class<m7.f> r2 = m7.f.class
            if (r1 == 0) goto L36
            k7.a r1 = r1.v(r2)
            m7.f r1 = (m7.f) r1
            if (r1 == 0) goto L36
            k7.c r1 = r1.f8760k
            m7.g r1 = (m7.g) r1
            m7.n r1 = r1.f8745p
            goto L37
        L36:
            r1 = r0
        L37:
            if (r1 != 0) goto L3b
            goto La8
        L3b:
            k7.a r3 = r8.f7389h
            if (r3 == 0) goto La8
            int r3 = r8.f7388g
            if (r3 < 0) goto La8
            boolean r3 = r8.O()
            if (r3 == 0) goto L4a
            goto La8
        L4a:
            r7.o r3 = r8.N()
            if (r3 == 0) goto La8
            k7.a r4 = r3.f7389h
            if (r4 == 0) goto La8
            int r4 = r3.f7388g
            if (r4 < 0) goto La8
            java.lang.Object r4 = r3.f11582p
            ce.n r5 = new ce.n
            r6 = 25
            r5.<init>(r6)
            java.util.Iterator r4 = y7.a.g(r4)
            boolean r6 = r4.hasNext()
            if (r6 != 0) goto L6e
            z7.h r4 = z7.h.f22606g
            goto L74
        L6e:
            z7.k r6 = new z7.k
            r6.<init>(r4, r5)
            r4 = r6
        L74:
            boolean r4 = r4.hasNext()
            r5 = 0
            if (r4 == 0) goto L7d
            r4 = 1
            goto L87
        L7d:
            r7.n r4 = r3.f11574t
            if (r4 == 0) goto L86
            boolean r4 = r4.O()
            goto L87
        L86:
            r4 = r5
        L87:
            if (r4 == 0) goto L8a
            goto La8
        L8a:
            k7.a r2 = r1.v(r2)
            m7.f r2 = (m7.f) r2
            if (r2 == 0) goto L98
            k7.c r0 = r2.f8760k
            m7.g r0 = (m7.g) r0
            u7.a r0 = r0.f8744o
        L98:
            if (r0 != 0) goto L9b
            goto La8
        L9b:
            r8.k(r5)
            s7.f r1 = r1.f8757o
            r1.a0(r8)
            s7.g r8 = r0.f13531p
            r8.a0(r3)
        La8:
            return
    }

    public final void e0(r7.m r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L9
        L3:
            u7.a r0 = r1.b0()
            if (r0 != 0) goto La
        L9:
            return
        La:
            r0.b0(r2)
            return
    }

    @Override // v7.j0
    public final /* bridge */ /* synthetic */ u7.c g() {
            r1 = this;
            u7.a r0 = r1.b0()
            return r0
    }

    @Override // v7.j0
    public final java.lang.String toString() {
            r7 = this;
            byte[] r0 = r7.f11553k
            r1 = 4
            int r0 = k7.a.s(r0, r1)
            u7.a r1 = r7.b0()
            r2 = 0
            if (r1 != 0) goto Lf
            goto L25
        Lf:
            if (r0 >= 0) goto L13
        L11:
            r0 = r2
            goto L1e
        L13:
            u7.a r1 = r7.b0()
            if (r1 != 0) goto L1a
            goto L11
        L1a:
            r7.s r0 = r1.V(r0)
        L1e:
            if (r0 != 0) goto L21
            goto L25
        L21:
            java.lang.String r1 = r0.f11578m
            if (r1 != 0) goto L27
        L25:
            r1 = r2
            goto L31
        L27:
            r7.u r0 = r0.f11583q
            if (r0 != 0) goto L2c
            goto L31
        L2c:
            r3 = 0
            java.lang.String r1 = r0.Q(r1, r3)
        L31:
            r0 = 1
            if (r1 == 0) goto L4f
            m7.u r3 = r7.a0()
            if (r3 == 0) goto L46
            r7.f r4 = r3.f8734o
            int r4 = r4.f11560n
            r7.o r3 = r3.V(r4)
            if (r3 == 0) goto L46
            java.lang.String r2 = r3.f11578m
        L46:
            if (r2 != 0) goto L49
            goto L4f
        L49:
            java.lang.String r3 = ":"
            java.lang.String r1 = wb.en.h(r2, r3, r1)
        L4f:
            r2 = 0
            r3 = 8
            if (r1 == 0) goto Le6
            int r4 = r7.Z()
            if (r4 == 0) goto L70
            java.lang.String r5 = "(@"
            java.lang.StringBuilder r1 = bc.e.n(r1, r5)
            java.lang.String r4 = y7.a.k(r4, r3)
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L70:
            v7.k0 r4 = r7.T()
            v7.k0 r5 = v7.k0.f14178u
            java.lang.String r6 = "["
            if (r4 != r5) goto L7f
            java.lang.String r0 = r7.S()
            goto Lb9
        L7f:
            v7.k0 r5 = v7.k0.f14173p
            if (r4 != r5) goto L90
            int r3 = r7.O()
            if (r3 == 0) goto L8a
            goto L8b
        L8a:
            r0 = r2
        L8b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lb9
        L90:
            v7.k0 r0 = v7.k0.f14171n
            if (r4 != r0) goto L9d
            int r0 = r7.O()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lb9
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r4)
            java.lang.String r2 = "] "
            r0.append(r2)
            int r2 = r7.O()
            java.lang.String r2 = y7.a.k(r2, r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        Lb9:
            java.lang.String r2 = "\""
            if (r0 == 0) goto Lc4
            java.lang.String r3 = "=\""
            java.lang.String r0 = wb.en.i(r1, r3, r0, r2)
            return r0
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            r0.append(r4)
            java.lang.String r1 = "]=\""
            r0.append(r1)
            int r1 = r7.O()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        Le6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<m7.c> r1 = m7.c.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            int r1 = r7.f7388g
            r0.append(r1)
            java.lang.String r1 = "{NamespaceReference="
            r0.append(r1)
            byte[] r1 = r7.f11553k
            int r1 = k7.a.s(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", NameReference="
            r0.append(r1)
            byte[] r1 = r7.f11553k
            r2 = 4
            int r1 = k7.a.s(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", ValueStringReference="
            r0.append(r1)
            byte[] r1 = r7.f11553k
            int r1 = k7.a.s(r1, r3)
            r0.append(r1)
            java.lang.String r1 = ", ValueSize="
            r0.append(r1)
            int r1 = r7.Q()
            r0.append(r1)
            java.lang.String r1 = ", ValueTypeByte="
            r0.append(r1)
            byte r1 = r7.R()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            java.lang.String r1 = ", Data="
            r0.append(r1)
            int r1 = r7.O()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
