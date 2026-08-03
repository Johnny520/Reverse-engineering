package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4883i;

    public /* synthetic */ f(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.f4881g = r3
            r0.f4883i = r1
            r0.f4882h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ f(boolean r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f4881g = r3
            r0.f4882h = r1
            r0.f4883i = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            r7 = this;
            int r0 = r7.f4881g
            switch(r0) {
                case 0: goto L1a0;
                case 1: goto Lfd;
                case 2: goto Lbf;
                case 3: goto L81;
                case 4: goto L43;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f4883i
            i0.a1 r0 = (i0.a1) r0
            r.d r8 = (r.d) r8
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.getClass()
            r8 = r10 & 17
            r1 = 16
            r2 = 1
            if (r8 == r1) goto L1f
            r8 = r2
            goto L20
        L1f:
            r8 = 0
        L20:
            r10 = r10 & r2
            boolean r8 = r9.S(r10, r8)
            if (r8 == 0) goto L3d
            w.v r8 = new w.v
            r10 = 4
            boolean r1 = r7.f4882h
            r8.<init>(r1, r0, r10)
            r10 = 1381669988(0x525a9c64, float:2.3473167E11)
            s0.d r8 = s0.i.e(r10, r8, r9)
            r10 = 48
            r0 = 0
            wb.ho.C3(r0, r8, r9, r10, r2)
            goto L40
        L3d:
            r9.V()
        L40:
            sf.n r8 = sf.n.f12433a
            return r8
        L43:
            java.lang.Object r0 = r7.f4883i
            java.lang.String r0 = (java.lang.String) r0
            r.d r8 = (r.d) r8
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.getClass()
            r8 = r10 & 17
            r1 = 16
            r2 = 1
            if (r8 == r1) goto L5d
            r8 = r2
            goto L5e
        L5d:
            r8 = 0
        L5e:
            r10 = r10 & r2
            boolean r8 = r9.S(r10, r8)
            if (r8 == 0) goto L7b
            w.v r8 = new w.v
            r10 = 2
            boolean r1 = r7.f4882h
            r8.<init>(r1, r0, r10)
            r10 = -1469901301(0xffffffffa863160b, float:-1.2605811E-14)
            s0.d r8 = s0.i.e(r10, r8, r9)
            r10 = 48
            r0 = 0
            wb.ho.C3(r0, r8, r9, r10, r2)
            goto L7e
        L7b:
            r9.V()
        L7e:
            sf.n r8 = sf.n.f12433a
            return r8
        L81:
            java.lang.Object r0 = r7.f4883i
            e9.c r0 = (e9.c) r0
            r.d r8 = (r.d) r8
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.getClass()
            r8 = r10 & 17
            r1 = 16
            r2 = 1
            if (r8 == r1) goto L9b
            r8 = r2
            goto L9c
        L9b:
            r8 = 0
        L9c:
            r10 = r10 & r2
            boolean r8 = r9.S(r10, r8)
            if (r8 == 0) goto Lb9
            w.v r8 = new w.v
            r10 = 3
            boolean r1 = r7.f4882h
            r8.<init>(r1, r0, r10)
            r10 = -1291853221(0xffffffffb2ffe25b, float:-2.9788842E-8)
            s0.d r8 = s0.i.e(r10, r8, r9)
            r10 = 48
            r0 = 0
            wb.ho.C3(r0, r8, r9, r10, r2)
            goto Lbc
        Lb9:
            r9.V()
        Lbc:
            sf.n r8 = sf.n.f12433a
            return r8
        Lbf:
            java.lang.Object r0 = r7.f4883i
            fg.l r0 = (fg.l) r0
            r.d r8 = (r.d) r8
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.getClass()
            r8 = r10 & 17
            r1 = 16
            r2 = 1
            if (r8 == r1) goto Ld9
            r8 = r2
            goto Lda
        Ld9:
            r8 = 0
        Lda:
            r10 = r10 & r2
            boolean r8 = r9.S(r10, r8)
            if (r8 == 0) goto Lf7
            w.v r8 = new w.v
            r10 = 1
            boolean r1 = r7.f4882h
            r8.<init>(r1, r0, r10)
            r10 = 711082021(0x2a624025, float:2.0095087E-13)
            s0.d r8 = s0.i.e(r10, r8, r9)
            r10 = 48
            r0 = 0
            wb.ho.C3(r0, r8, r9, r10, r2)
            goto Lfa
        Lf7:
            r9.V()
        Lfa:
            sf.n r8 = sf.n.f12433a
            return r8
        Lfd:
            java.lang.Object r0 = r7.f4883i
            w.j1 r0 = (w.j1) r0
            i0.j1 r1 = r0.f14515f
            y0.o r8 = (y0.o) r8
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r8 = -2137546592(0xffffffff8097a0a0, float:-1.3924781E-38)
            r9.a0(r8)
            i0.m2 r8 = y1.h1.f21952n
            java.lang.Object r8 = r9.j(r8)
            u2.m r10 = u2.m.f13355h
            r2 = 1
            r3 = 0
            if (r8 != r10) goto L120
            r8 = r2
            goto L121
        L120:
            r8 = r3
        L121:
            java.lang.Object r10 = r1.getValue()
            m.p1 r10 = (m.p1) r10
            m.p1 r4 = m.p1.f8324g
            if (r10 == r4) goto L130
            if (r8 != 0) goto L12e
            goto L130
        L12e:
            r8 = r3
            goto L131
        L130:
            r8 = r2
        L131:
            boolean r10 = r9.f(r0)
            java.lang.Object r4 = r9.P()
            i0.e r5 = i0.l.f5952a
            if (r10 != 0) goto L13f
            if (r4 != r5) goto L149
        L13f:
            nb.a r4 = new nb.a
            r10 = 21
            r4.<init>(r0, r10)
            r9.k0(r4)
        L149:
            fg.l r4 = (fg.l) r4
            i0.a1 r10 = i0.r.y(r4, r9)
            java.lang.Object r4 = r9.P()
            if (r4 != r5) goto L165
            b0.l r4 = new b0.l
            r6 = 9
            r4.<init>(r10, r6)
            m.r r10 = new m.r
            r10.<init>(r4)
            r9.k0(r10)
            r4 = r10
        L165:
            m.i2 r4 = (m.i2) r4
            boolean r10 = r9.f(r4)
            boolean r6 = r9.f(r0)
            r10 = r10 | r6
            java.lang.Object r6 = r9.P()
            if (r10 != 0) goto L178
            if (r6 != r5) goto L180
        L178:
            w.i1 r6 = new w.i1
            r6.<init>(r4, r0)
            r9.k0(r6)
        L180:
            w.i1 r6 = (w.i1) r6
            java.lang.Object r10 = r1.getValue()
            m.p1 r10 = (m.p1) r10
            boolean r1 = r7.f4882h
            if (r1 == 0) goto L197
            i0.f1 r0 = r0.f14511b
            float r0 = r0.g()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L198
        L197:
            r2 = r3
        L198:
            y0.o r8 = m.a2.b(r6, r10, r2, r8)
            r9.p(r3)
            return r8
        L1a0:
            java.lang.Object r0 = r7.f4883i
            fg.a r0 = (fg.a) r0
            y0.o r8 = (y0.o) r8
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r10 = -196777734(0xfffffffff44568fa, float:-6.2561747E31)
            r9.a0(r10)
            i0.u r10 = h0.l1.f4934a
            java.lang.Object r10 = r9.j(r10)
            h0.k1 r10 = (h0.k1) r10
            long r1 = r10.f4929a
            boolean r10 = r9.e(r1)
            boolean r3 = r9.f(r0)
            r10 = r10 | r3
            boolean r3 = r7.f4882h
            boolean r4 = r9.g(r3)
            r10 = r10 | r4
            java.lang.Object r4 = r9.P()
            if (r10 != 0) goto L1d7
            i0.e r10 = i0.l.f5952a
            if (r4 != r10) goto L1df
        L1d7:
            h0.g r4 = new h0.g
            r4.<init>(r1, r0, r3)
            r9.k0(r4)
        L1df:
            fg.l r4 = (fg.l) r4
            y0.o r8 = c1.h.e(r8, r4)
            r10 = 0
            r9.p(r10)
            return r8
    }
}
