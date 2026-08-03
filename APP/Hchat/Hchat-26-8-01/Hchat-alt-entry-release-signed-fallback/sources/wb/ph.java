package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ph implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f18460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f18461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ sf.b f18463l;

    public /* synthetic */ ph(fg.a r2, j8.i r3, fg.l r4, boolean r5, boolean r6) {
            r1 = this;
            r0 = 0
            r1.f18458g = r0
            r1.<init>()
            r1.f18461j = r2
            r1.f18462k = r3
            r1.f18463l = r4
            r1.f18459h = r5
            r1.f18460i = r6
            return
    }

    public /* synthetic */ ph(boolean r2, boolean r3, fg.a r4, fg.a r5, fg.a r6) {
            r1 = this;
            r0 = 1
            r1.f18458g = r0
            r1.<init>()
            r1.f18459h = r2
            r1.f18460i = r3
            r1.f18461j = r4
            r1.f18462k = r5
            r1.f18463l = r6
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
            r30 = this;
            r0 = r30
            int r1 = r0.f18458g
            switch(r1) {
                case 0: goto L54;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f18462k
            r6 = r1
            fg.a r6 = (fg.a) r6
            sf.b r1 = r0.f18463l
            r7 = r1
            fg.a r7 = (fg.a) r7
            r1 = r31
            r.d r1 = (r.d) r1
            r8 = r32
            i0.h0 r8 = (i0.h0) r8
            r2 = r33
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r9 = 1
            if (r1 == r3) goto L2d
            r1 = r9
            goto L2e
        L2d:
            r1 = 0
        L2e:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L4e
            wb.ej r2 = new wb.ej
            boolean r3 = r0.f18459h
            boolean r4 = r0.f18460i
            fg.a r5 = r0.f18461j
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 1331012992(0x4f55a580, float:3.5843932E9)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto L51
        L4e:
            r8.V()
        L51:
            sf.n r1 = sf.n.f12433a
            return r1
        L54:
            java.lang.Object r1 = r0.f18462k
            j8.i r1 = (j8.i) r1
            sf.b r2 = r0.f18463l
            fg.l r2 = (fg.l) r2
            r3 = r31
            p.u r3 = (p.u) r3
            r4 = r32
            i0.h0 r4 = (i0.h0) r4
            r5 = r33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 1
            r7 = 0
            r8 = 16
            if (r3 == r8) goto L79
            r3 = r6
            goto L7a
        L79:
            r3 = r7
        L7a:
            r5 = r5 & r6
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L28e
            java.lang.Object r3 = r4.P()
            i0.e r5 = i0.l.f5952a
            if (r3 != r5) goto L92
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r4.k0(r3)
        L92:
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r9 = r3.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            long r9 = wb.ho.L6(r9, r4)
            y0.l r11 = y0.l.f21818a
            r12 = 1065353216(0x3f800000, float:1.0)
            y0.o r13 = p.h1.d(r11, r12)
            r14 = 12
            float r15 = (float) r14
            v.d r14 = v.e.a(r15)
            y0.o r13 = c1.h.b(r13, r14)
            f1.m0 r14 = f1.c0.f3038b
            y0.o r9 = k.n.g(r13, r9, r14)
            java.lang.Object r10 = r4.P()
            if (r10 != r5) goto Lca
            wb.aj r10 = new wb.aj
            r5 = 6
            r10.<init>(r3, r5)
            r4.k0(r10)
        Lca:
            fg.l r10 = (fg.l) r10
            fg.a r3 = r0.f18461j
            y0.o r3 = wb.ho.N6(r9, r3, r10)
            float r5 = (float) r8
            r9 = 14
            float r9 = (float) r9
            y0.o r3 = p.d.m(r3, r5, r9)
            y0.f r5 = y0.b.f21802q
            p.c r9 = p.j.f9924a
            r10 = 48
            p.e1 r5 = p.d1.a(r9, r5, r4, r10)
            long r9 = r4.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r4.l()
            y0.o r3 = y0.a.c(r4, r3)
            x1.f r13 = x1.g.f20914f
            r13.getClass()
            x1.y r13 = x1.f.f20883b
            r4.d0()
            boolean r14 = r4.S
            if (r14 == 0) goto L104
            r4.k(r13)
            goto L107
        L104:
            r4.n0()
        L107:
            x1.e r14 = x1.f.f20886e
            i0.r.A(r14, r4, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r4, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r4, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r4)
            r32 = r8
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r4, r3)
            r3 = 8
            wb.ho.C0(r1, r2, r4, r3)
            double r2 = (double) r12
            r16 = 0
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L135
        L132:
            r16 = r15
            goto L13b
        L135:
            java.lang.String r2 = "invalid weight; must be greater than zero"
            q.a.a(r2)
            goto L132
        L13b:
            p.q0 r15 = new p.q0
            r15.<init>(r12, r6)
            r19 = 0
            r20 = 14
            r17 = 0
            r18 = 0
            y0.o r2 = p.d.p(r15, r16, r17, r18, r19, r20)
            p.e r3 = p.j.f9926c
            y0.e r12 = y0.b.f21804s
            p.t r3 = p.s.a(r3, r12, r4, r7)
            long r6 = r4.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r4.l()
            y0.o r2 = y0.a.c(r4, r2)
            r4.d0()
            boolean r15 = r4.S
            if (r15 == 0) goto L16d
            r4.k(r13)
            goto L170
        L16d:
            r4.n0()
        L170:
            i0.r.A(r14, r4, r3)
            i0.r.A(r5, r4, r7)
            j8.b.p(r6, r4, r10, r4, r9)
            i0.r.A(r8, r4, r2)
            java.lang.String r2 = r1.f6801c
            java.util.List r3 = r1.f6805g
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto L18a
            java.lang.String r2 = r1.b()
        L18a:
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r6 = r4.j(r5)
            bi.b r6 = (bi.b) r6
            long r6 = r6.g()
            m2.k r10 = m2.k.f8698j
            long r8 = x6.d.D(r32)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241578(0x3afaa, float:3.38523E-40)
            r13 = r5
            r5 = 0
            r14 = r11
            r11 = 0
            r15 = r13
            r16 = 0
            r12 = 0
            r17 = r14
            r14 = 0
            r18 = r15
            r19 = r16
            r15 = 0
            r20 = r17
            r17 = 2
            r21 = r18
            r18 = 0
            r22 = r19
            r19 = 2
            r23 = r20
            r20 = 0
            r24 = r21
            r21 = 0
            r27 = r22
            r22 = 0
            r28 = r24
            r24 = 1597440(0x186000, float:2.23849E-39)
            r29 = r23
            r23 = r4
            r4 = r2
            r2 = r28
            r28 = r1
            r1 = r27
            r27 = 12
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            java.lang.String r5 = r28.a()
            java.lang.Object r6 = r4.j(r2)
            bi.b r6 = (bi.b) r6
            long r6 = r6.h()
            long r8 = x6.d.D(r27)
            r10 = 3
            float r13 = (float) r10
            r15 = 0
            r16 = 13
            r12 = 0
            r14 = 0
            r11 = r29
            y0.o r10 = p.d.p(r11, r12, r13, r14, r15, r16)
            r28 = r13
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r4 = r5
            r5 = r10
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L276
            r5 = -461207088(0xffffffffe48289d0, float:-1.9264057E22)
            r4.a0(r5)
            r9 = 0
            r10 = 62
            java.lang.String r6 = " / "
            r7 = 0
            r8 = 0
            r5 = r3
            java.lang.String r3 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            java.lang.String r5 = "标签 · "
            java.lang.String r3 = r5.concat(r3)
            java.lang.Object r2 = r4.j(r2)
            bi.b r2 = (bi.b) r2
            long r6 = r2.j()
            long r8 = x6.d.D(r27)
            r15 = 0
            r16 = 13
            r12 = 0
            r14 = 0
            r13 = r28
            r11 = r29
            y0.o r5 = p.d.p(r11, r12, r13, r14, r15, r16)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r23 = r4
            r4 = r3
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r1)
        L274:
            r2 = 1
            goto L280
        L276:
            r2 = -460838467(0xffffffffe48829bd, float:-2.0094118E22)
            r4.a0(r2)
            r4.p(r1)
            goto L274
        L280:
            r4.p(r2)
            boolean r3 = r0.f18459h
            boolean r5 = r0.f18460i
            wb.ho.B3(r3, r5, r4, r1)
            r4.p(r2)
            goto L291
        L28e:
            r4.V()
        L291:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
