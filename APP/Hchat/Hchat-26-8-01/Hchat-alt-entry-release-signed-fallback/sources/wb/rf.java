package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rf implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.a f18875i;

    public /* synthetic */ rf(java.lang.String r1, fg.a r2, int r3) {
            r0 = this;
            r0.f18873g = r3
            r0.f18874h = r1
            r0.f18875i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r31, java.lang.Object r32) {
            r30 = this;
            r0 = r30
            int r1 = r0.f18873g
            switch(r1) {
                case 0: goto L210;
                case 1: goto Lfc;
                default: goto L7;
            }
        L7:
            r11 = r31
            i0.h0 r11 = (i0.h0) r11
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L1c
            r2 = r5
            goto L1d
        L1c:
            r2 = r4
        L1d:
            r1 = r1 & r5
            boolean r1 = r11.S(r1, r2)
            if (r1 == 0) goto Lf6
            y0.l r1 = y0.l.f21818a
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r1, r2)
            p.e r6 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            p.t r4 = p.s.a(r6, r7, r11, r4)
            long r6 = r11.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r11.l()
            y0.o r3 = y0.a.c(r11, r3)
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r11.d0()
            boolean r9 = r11.S
            if (r9 == 0) goto L54
            r11.k(r8)
            goto L57
        L54:
            r11.n0()
        L57:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r11, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r11, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r11, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r11)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r11, r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r11.j(r3)
            bi.b r3 = (bi.b) r3
            long r3 = r3.h()
            y0.o r6 = p.h1.d(r1, r2)
            r7 = 10
            float r7 = (float) r7
            r8 = 0
            y0.o r6 = p.d.n(r6, r8, r7, r5)
            t2.k r12 = new t2.k
            r7 = 3
            r12.<init>(r7)
            r23 = 0
            r24 = 261112(0x3fbf8, float:3.65896E-40)
            r7 = r2
            java.lang.String r2 = r0.f18874h
            r9 = r5
            r8 = r7
            r4 = r3
            r3 = r6
            r6 = 0
            r10 = r8
            r8 = 0
            r13 = r9
            r9 = 0
            r14 = r10
            r21 = r11
            r10 = 0
            r16 = r13
            r15 = r14
            r13 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r22 = r19
            r19 = 0
            r25 = r20
            r20 = 0
            r26 = r22
            r22 = 48
            r0 = r26
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            y0.o r2 = p.h1.d(r1, r0)
            r0 = 8
            float r4 = (float) r0
            r6 = 0
            r7 = 13
            r3 = 0
            r5 = 0
            y0.o r4 = p.d.p(r2, r3, r4, r5, r6, r7)
            r12 = 390(0x186, float:5.47E-43)
            r13 = 2040(0x7f8, float:2.859E-42)
            java.lang.String r2 = "取消"
            r0 = r30
            fg.a r3 = r0.f18875i
            r5 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = r21
            sh.s.o(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r13 = 1
            r11.p(r13)
            goto Lf9
        Lf6:
            r11.V()
        Lf9:
            sf.n r1 = sf.n.f12433a
            return r1
        Lfc:
            r7 = r31
            i0.h0 r7 = (i0.h0) r7
            r1 = r32
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L111
            r2 = r5
            goto L112
        L111:
            r2 = r4
        L112:
            r1 = r1 & r5
            boolean r1 = r7.S(r1, r2)
            if (r1 == 0) goto L20a
            y0.l r1 = y0.l.f21818a
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r1, r2)
            p.e r6 = p.j.f9926c
            y0.e r8 = y0.b.f21804s
            p.t r6 = p.s.a(r6, r8, r7, r4)
            long r8 = r7.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r7.l()
            y0.o r3 = y0.a.c(r7, r3)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r7.d0()
            boolean r11 = r7.S
            if (r11 == 0) goto L149
            r7.k(r10)
            goto L14c
        L149:
            r7.n0()
        L14c:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r7, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r7, r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r7, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r7)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r7, r3)
            java.lang.String r3 = r0.f18874h
            boolean r6 = og.m.t0(r3)
            if (r6 != 0) goto L1da
            r6 = -978218367(0xffffffffc5b19281, float:-5682.313)
            r7.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r7.j(r6)
            bi.b r6 = (bi.b) r6
            long r8 = r6.h()
            r6 = 14
            long r10 = x6.d.D(r6)
            y0.o r6 = p.h1.d(r1, r2)
            r12 = 4
            float r12 = (float) r12
            r13 = 8
            float r13 = (float) r13
            y0.o r6 = p.d.m(r6, r12, r13)
            r23 = 0
            r24 = 262120(0x3ffe8, float:3.67308E-40)
            r12 = r5
            r28 = r8
            r9 = r4
            r4 = r28
            r8 = 0
            r13 = r9
            r9 = 0
            r14 = r2
            r2 = r3
            r3 = r6
            r21 = r7
            r6 = r10
            r10 = 0
            r15 = r12
            r12 = 0
            r17 = r13
            r16 = r14
            r13 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = r17
            r17 = 0
            r22 = r18
            r18 = 0
            r25 = r19
            r19 = 0
            r26 = r20
            r20 = 0
            r27 = r22
            r22 = 24624(0x6030, float:3.4506E-41)
            r0 = r26
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r21
            r7.p(r0)
            goto L1e4
        L1da:
            r0 = r4
            r2 = -977873523(0xffffffffc5b6d58d, float:-5850.694)
            r7.a0(r2)
            r7.p(r0)
        L1e4:
            wb.y2 r2 = wb.y2.f20291p
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r8 = p.h1.d(r1, r14)
            r0 = 10
            float r10 = (float) r0
            r0 = 6
            float r12 = (float) r0
            r13 = 5
            r9 = 0
            r11 = 0
            y0.o r5 = p.d.p(r8, r9, r10, r11, r12, r13)
            r8 = 28038(0x6d86, float:3.929E-41)
            r9 = 0
            java.lang.String r3 = "确定"
            r0 = r30
            fg.a r4 = r0.f18875i
            r6 = 1
            r2.k(r3, r4, r5, r6, r7, r8, r9)
            r15 = 1
            r7.p(r15)
            goto L20d
        L20a:
            r7.V()
        L20d:
            sf.n r1 = sf.n.f12433a
            return r1
        L210:
            r1 = r31
            i0.h0 r1 = (i0.h0) r1
            r2 = r32
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L224
            r3 = r5
            goto L225
        L224:
            r3 = 0
        L225:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L237
            java.lang.String r2 = "转发好友"
            r3 = 6
            java.lang.String r4 = r0.f18874h
            fg.a r5 = r0.f18875i
            wb.ho.b(r2, r4, r5, r1, r3)
            goto L23a
        L237:
            r1.V()
        L23a:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
