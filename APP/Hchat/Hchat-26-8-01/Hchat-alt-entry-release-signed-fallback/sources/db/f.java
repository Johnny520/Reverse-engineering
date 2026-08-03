package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2198i;

    public /* synthetic */ f(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2196g = r2
            r0.f2197h = r1
            r0.f2198i = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r38, java.lang.Object r39, java.lang.Object r40) {
            r37 = this;
            r0 = r37
            int r1 = r0.f2196g
            switch(r1) {
                case 0: goto La0b;
                case 1: goto L9bd;
                case 2: goto L952;
                case 3: goto L8e7;
                case 4: goto L8c1;
                case 5: goto L87a;
                case 6: goto L80c;
                case 7: goto L7c5;
                case 8: goto L77f;
                case 9: goto L738;
                case 10: goto L6f1;
                case 11: goto L6aa;
                case 12: goto L650;
                case 13: goto L609;
                case 14: goto L5a6;
                case 15: goto L526;
                case 16: goto L2b7;
                case 17: goto L27b;
                case 18: goto L225;
                case 19: goto L1c1;
                case 20: goto Lec;
                case 21: goto L7b;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f2197h
            y9.e r1 = (y9.e) r1
            java.lang.Object r2 = r0.f2198i
            y9.d r2 = (y9.d) r2
            r3 = r38
            java.lang.String r3 = (java.lang.String) r3
            r4 = r39
            java.lang.String r4 = (java.lang.String) r4
            r5 = r40
            java.lang.String r5 = (java.lang.String) r5
            r3.getClass()
            r4.getClass()
            r5.getClass()
            ib.b r6 = r1.f22333b
            java.lang.String r7 = r2.f22330a
            java.lang.String r8 = r2.f22331b
            java.lang.String r7 = ib.b.a(r7, r8)
            int r8 = r7.length()
            if (r8 != 0) goto L35
            goto L68
        L35:
            android.content.SharedPreferences r6 = r6.f6650a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r8 = "custom_title_"
            java.lang.String r8 = r8.concat(r7)
            java.lang.String r3 = a7.a.k(r3)
            android.content.SharedPreferences$Editor r3 = r6.putString(r8, r3)
            java.lang.String r6 = "custom_color_"
            java.lang.String r6 = r6.concat(r7)
            java.lang.String r4 = a7.a.j(r4)
            android.content.SharedPreferences$Editor r3 = r3.putString(r6, r4)
            java.lang.String r4 = "custom_text_color_"
            java.lang.String r4 = r4.concat(r7)
            java.lang.String r5 = a7.a.j(r5)
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r5)
            r3.apply()
        L68:
            o8.j r3 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r3 == 0) goto L78
            rb.g r4 = new rb.g
            r5 = 22
            r4.<init>(r1, r5, r2)
            r3.e(r4)
        L78:
            sf.n r1 = sf.n.f12433a
            return r1
        L7b:
            java.lang.Object r1 = r0.f2197h
            aa.c r1 = (aa.c) r1
            java.lang.Object r2 = r0.f2198i
            c9.n0 r2 = (c9.n0) r2
            r12 = r38
            fg.a r12 = (fg.a) r12
            r3 = r39
            i0.h0 r3 = (i0.h0) r3
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r12.getClass()
            r5 = r4 & 6
            if (r5 != 0) goto La4
            boolean r5 = r3.h(r12)
            if (r5 == 0) goto La2
            r5 = 4
            goto La3
        La2:
            r5 = 2
        La3:
            r4 = r4 | r5
        La4:
            r5 = r4 & 19
            r6 = 18
            if (r5 == r6) goto Lac
            r5 = 1
            goto Lad
        Lac:
            r5 = 0
        Lad:
            r6 = r4 & 1
            boolean r5 = r3.S(r6, r5)
            if (r5 == 0) goto Le4
            wb.rj r5 = new wb.rj
            r6 = 24
            r5.<init>(r12, r1, r2, r6)
            r1 = 402342677(0x17fb4315, float:1.6237429E-24)
            s0.d r18 = s0.i.e(r1, r5, r3)
            int r1 = r4 << 24
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r1 = r1 | 390(0x186, float:5.47E-43)
            r21 = 3072(0xc00, float:4.305E-42)
            r19 = r3
            r3 = 0
            java.lang.String r4 = "发送收藏语音"
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r20 = r1
            oh.h.d(r3, r4, r5, r7, r9, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            goto Le9
        Le4:
            r19 = r3
            r19.V()
        Le9:
            sf.n r1 = sf.n.f12433a
            return r1
        Lec:
            java.lang.Object r1 = r0.f2197h
            fb.c r1 = (fb.c) r1
            java.lang.Object r2 = r0.f2198i
            i0.a1 r2 = (i0.a1) r2
            r3 = r38
            h.b0 r3 = (h.b0) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 0
            r8 = 1
            if (r3 == r6) goto L111
            r3 = r8
            goto L112
        L111:
            r3 = r7
        L112:
            r5 = r5 & r8
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L1bb
            y0.l r3 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r3, r5)
            r3 = 24
            float r10 = (float) r3
            r3 = 6
            float r13 = (float) r3
            r14 = 6
            r11 = 0
            r12 = 0
            y0.o r3 = p.d.p(r9, r10, r11, r12, r13, r14)
            p.e r5 = p.j.f9926c
            y0.e r6 = y0.b.f21804s
            p.t r5 = p.s.a(r5, r6, r4, r7)
            long r9 = r4.T
            int r6 = java.lang.Long.hashCode(r9)
            s0.h r9 = r4.l()
            y0.o r3 = y0.a.c(r4, r3)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r4.d0()
            boolean r11 = r4.S
            if (r11 == 0) goto L155
            r4.k(r10)
            goto L158
        L155:
            r4.n0()
        L158:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r4, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r4, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r4, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r4)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r4, r3)
            r3 = -1200520984(0xffffffffb87180e8, float:-5.757893E-5)
            r4.a0(r3)
            java.util.List r1 = r1.f3440j
            java.util.Iterator r1 = r1.iterator()
        L181:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1b4
            java.lang.Object r3 = r1.next()
            fb.q1 r3 = (fb.q1) r3
            wb.y2 r5 = wb.y2.f20289n
            boolean r6 = r4.f(r2)
            boolean r9 = r4.h(r3)
            r6 = r6 | r9
            java.lang.Object r9 = r4.P()
            if (r6 != 0) goto L1a2
            i0.e r6 = i0.l.f5952a
            if (r9 != r6) goto L1ac
        L1a2:
            wb.xi r9 = new wb.xi
            r6 = 18
            r9.<init>(r3, r6, r2)
            r4.k0(r9)
        L1ac:
            fg.a r9 = (fg.a) r9
            r6 = 384(0x180, float:5.38E-43)
            r5.p0(r3, r9, r4, r6)
            goto L181
        L1b4:
            r4.p(r7)
            r4.p(r8)
            goto L1be
        L1bb:
            r4.V()
        L1be:
            sf.n r1 = sf.n.f12433a
            return r1
        L1c1:
            java.lang.Object r1 = r0.f2197h
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r0.f2198i
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r1 = r38
            h.b0 r1 = (h.b0) r1
            r10 = r39
            i0.h0 r10 = (i0.h0) r10
            r2 = r40
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r5 = 16
            r6 = 1
            if (r1 == r5) goto L1e7
            r1 = r6
            goto L1e8
        L1e7:
            r1 = 0
        L1e8:
            r2 = r2 & r6
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto L21f
            wb.y2 r2 = wb.y2.f20284i
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r1 = r10.j(r1)
            bi.b r1 = (bi.b) r1
            long r6 = r1.h()
            r1 = 12
            long r8 = x6.d.D(r1)
            y0.l r1 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r1, r5)
            r1 = 25
            float r12 = (float) r1
            r1 = 6
            float r15 = (float) r1
            r16 = 6
            r13 = 0
            r14 = 0
            y0.o r5 = p.d.p(r11, r12, r13, r14, r15, r16)
            r11 = 1597824(0x186180, float:2.239028E-39)
            r2.D1(r3, r4, r5, r6, r8, r10, r11)
            goto L222
        L21f:
            r10.V()
        L222:
            sf.n r1 = sf.n.f12433a
            return r1
        L225:
            java.lang.Object r1 = r0.f2197h
            r5 = r1
            fg.a r5 = (fg.a) r5
            java.lang.Object r1 = r0.f2198i
            i0.a1 r1 = (i0.a1) r1
            r2 = r38
            th.a r2 = (th.a) r2
            r8 = r39
            i0.h0 r8 = (i0.h0) r8
            r3 = r40
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r2 = r3 & 17
            r4 = 16
            r6 = 1
            if (r2 == r4) goto L24a
            r2 = r6
            goto L24b
        L24a:
            r2 = 0
        L24b:
            r3 = r3 & r6
            boolean r2 = r8.S(r3, r2)
            if (r2 == 0) goto L275
            java.lang.Object r2 = r8.P()
            i0.e r3 = i0.l.f5952a
            if (r2 != r3) goto L264
            wb.gl r2 = new wb.gl
            r3 = 22
            r2.<init>(r1, r3)
            r8.k0(r2)
        L264:
            r3 = r2
            fg.a r3 = (fg.a) r3
            r9 = 438(0x1b6, float:6.14E-43)
            r10 = 48
            java.lang.String r2 = "上传本地插件"
            java.lang.String r4 = "返回"
            r6 = 0
            r7 = 0
            wb.ho.M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L278
        L275:
            r8.V()
        L278:
            sf.n r1 = sf.n.f12433a
            return r1
        L27b:
            java.lang.Object r1 = r0.f2197h
            wb.c3 r1 = (wb.c3) r1
            java.lang.Object r2 = r0.f2198i
            fg.l r2 = (fg.l) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L29f
            r3 = r7
            goto L2a0
        L29f:
            r3 = 0
        L2a0:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L2b1
            java.util.List r1 = r1.f15338b
            java.lang.String r3 = "暂无功能"
            r5 = 48
            wb.ho.H0(r1, r3, r2, r4, r5)
            goto L2b4
        L2b1:
            r4.V()
        L2b4:
            sf.n r1 = sf.n.f12433a
            return r1
        L2b7:
            java.lang.Object r1 = r0.f2197h
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r0.f2198i
            wb.t5 r2 = (wb.t5) r2
            r3 = r38
            p.u r3 = (p.u) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 0
            r7 = 1
            r8 = 16
            if (r3 == r8) goto L2dc
            r3 = r7
            goto L2dd
        L2dc:
            r3 = r6
        L2dd:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L520
            java.lang.Object r3 = r4.P()
            i0.e r5 = i0.l.f5952a
            if (r3 != r5) goto L2f5
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r4.k0(r3)
        L2f5:
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
            v.d r12 = v.e.a(r15)
            y0.o r12 = c1.h.b(r13, r12)
            f1.m0 r13 = f1.c0.f3038b
            y0.o r9 = k.n.g(r12, r9, r13)
            java.lang.Object r10 = r4.P()
            if (r10 != r5) goto L32e
            wb.gj r10 = new wb.gj
            r5 = 9
            r10.<init>(r3, r5)
            r4.k0(r10)
        L32e:
            fg.l r10 = (fg.l) r10
            y0.o r1 = wb.ho.N6(r9, r1, r10)
            float r3 = (float) r8
            r5 = 14
            float r5 = (float) r5
            y0.o r1 = p.d.m(r1, r3, r5)
            y0.f r3 = y0.b.f21802q
            p.c r5 = p.j.f9924a
            r8 = 48
            p.e1 r3 = p.d1.a(r5, r3, r4, r8)
            long r8 = r4.T
            int r5 = java.lang.Long.hashCode(r8)
            s0.h r8 = r4.l()
            y0.o r1 = y0.a.c(r4, r1)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r4.d0()
            boolean r10 = r4.S
            if (r10 == 0) goto L366
            r4.k(r9)
            goto L369
        L366:
            r4.n0()
        L369:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r4, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r4, r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r4, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r4)
            x1.e r12 = x1.f.f20884c
            i0.r.A(r12, r4, r1)
            r1 = 42
            float r1 = (float) r1
            y0.o r1 = p.h1.j(r11, r1)
            v.d r11 = v.e.a(r15)
            y0.o r1 = c1.h.b(r1, r11)
            i0.m2 r11 = bi.d.f892a
            java.lang.Object r16 = r4.j(r11)
            bi.b r16 = (bi.b) r16
            r17 = r15
            long r14 = r16.k()
            y0.o r1 = k.n.g(r1, r14, r13)
            y0.g r13 = y0.b.f21796k
            v1.n0 r13 = p.o.d(r13, r6)
            long r14 = r4.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r4.l()
            y0.o r1 = y0.a.c(r4, r1)
            r4.d0()
            boolean r6 = r4.S
            if (r6 == 0) goto L3c6
            r4.k(r9)
            goto L3c9
        L3c6:
            r4.n0()
        L3c9:
            i0.r.A(r10, r4, r13)
            i0.r.A(r3, r4, r15)
            j8.b.p(r14, r4, r8, r4, r5)
            i0.r.A(r12, r4, r1)
            java.lang.String r1 = r2.f19171b
            java.lang.String r1 = og.m.P0(r7, r1)
            int r6 = r1.length()
            if (r6 != 0) goto L3e3
            java.lang.String r1 = "签"
        L3e3:
            java.lang.Object r6 = r4.j(r11)
            bi.b r6 = (bi.b) r6
            long r13 = r6.f()
            r6 = r10
            m2.k r10 = m2.k.f8700l
            r25 = 0
            r26 = 262074(0x3ffba, float:3.67244E-40)
            r15 = r5
            r5 = 0
            r18 = r8
            r16 = r9
            r8 = 0
            r19 = r11
            r11 = 0
            r20 = r6
            r21 = r7
            r6 = r13
            r14 = r12
            r12 = 0
            r22 = r14
            r14 = 0
            r24 = r15
            r23 = r16
            r15 = 0
            r27 = r17
            r17 = 0
            r28 = r18
            r18 = 0
            r29 = r19
            r19 = 0
            r30 = r20
            r20 = 0
            r31 = r21
            r21 = 0
            r32 = r22
            r22 = 0
            r33 = r24
            r24 = 1572864(0x180000, float:2.204052E-39)
            r0 = r4
            r4 = r1
            r1 = r23
            r23 = r0
            r36 = r29
            r0 = r30
            r35 = r32
            r34 = r33
            r30 = 12
            r29 = r28
            r28 = r2
            r2 = r31
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r2)
            r5 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r5
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L455
            goto L45a
        L455:
            java.lang.String r6 = "invalid weight; must be greater than zero"
            q.a.a(r6)
        L45a:
            p.q0 r15 = new p.q0
            r15.<init>(r5, r2)
            r19 = 0
            r20 = 14
            r17 = 0
            r18 = 0
            r16 = r27
            y0.o r5 = p.d.p(r15, r16, r17, r18, r19, r20)
            p.e r6 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            r8 = 0
            p.t r6 = p.s.a(r6, r7, r4, r8)
            long r7 = r4.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r4.l()
            y0.o r5 = y0.a.c(r4, r5)
            r4.d0()
            boolean r9 = r4.S
            if (r9 == 0) goto L48f
            r4.k(r1)
            goto L492
        L48f:
            r4.n0()
        L492:
            i0.r.A(r0, r4, r6)
            i0.r.A(r3, r4, r8)
            r0 = r29
            r15 = r34
            j8.b.p(r7, r4, r0, r4, r15)
            r14 = r35
            i0.r.A(r14, r4, r5)
            r0 = r28
            java.lang.String r1 = r0.f19171b
            r3 = r36
            java.lang.Object r5 = r4.j(r3)
            bi.b r5 = (bi.b) r5
            long r6 = r5.g()
            m2.k r10 = m2.k.f8698j
            r25 = 0
            r26 = 262074(0x3ffba, float:3.67244E-40)
            r5 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 1572864(0x180000, float:2.204052E-39)
            r23 = r4
            r4 = r1
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            java.util.List r0 = r0.f19172c
            int r0 = r0.size()
            java.lang.String r1 = " 人"
            java.lang.String r0 = p.a.i(r0, r1)
            java.lang.Object r1 = r4.j(r3)
            bi.b r1 = (bi.b) r1
            long r6 = r1.h()
            long r8 = x6.d.D(r30)
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r10 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r4 = r0
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r2)
            java.lang.Object r0 = r4.j(r3)
            bi.b r0 = (bi.b) r0
            long r6 = r0.h()
            r0 = 22
            long r8 = x6.d.D(r0)
            java.lang.String r4 = "›"
            r24 = 24582(0x6006, float:3.4447E-41)
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r2)
            goto L523
        L520:
            r4.V()
        L523:
            sf.n r0 = sf.n.f12433a
            return r0
        L526:
            java.lang.Object r1 = r0.f2197h
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f2198i
            r4 = r2
            r.z r4 = (r.z) r4
            r2 = r38
            p.x0 r2 = (p.x0) r2
            r12 = r39
            i0.h0 r12 = (i0.h0) r12
            r3 = r40
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r5 = r3 & 6
            if (r5 != 0) goto L550
            boolean r5 = r12.f(r2)
            if (r5 == 0) goto L54e
            r5 = 4
            goto L54f
        L54e:
            r5 = 2
        L54f:
            r3 = r3 | r5
        L550:
            r5 = r3 & 19
            r6 = 18
            r7 = 1
            if (r5 == r6) goto L559
            r5 = r7
            goto L55a
        L559:
            r5 = 0
        L55a:
            r3 = r3 & r7
            boolean r3 = r12.S(r3, r5)
            if (r3 == 0) goto L5a0
            p.a0 r3 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r5 = 0
            y0.o r3 = r1.f.a(r3, r1, r5)
            float r1 = r2.c()
            r5 = 8
            float r5 = (float) r5
            float r1 = r1 + r5
            float r2 = r2.a()
            r5 = 84
            float r5 = (float) r5
            float r2 = r2 + r5
            r5 = 5
            p.z0 r5 = p.d.b(r1, r2, r5)
            java.lang.Object r1 = r12.P()
            i0.e r2 = i0.l.f5952a
            if (r1 != r2) goto L590
            wb.jk r1 = new wb.jk
            r2 = 3
            r1.<init>(r2)
            r12.k0(r1)
        L590:
            r11 = r1
            fg.l r11 = (fg.l) r11
            r13 = 805306368(0x30000000, float:4.656613E-10)
            r14 = 504(0x1f8, float:7.06E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L5a3
        L5a0:
            r12.V()
        L5a3:
            sf.n r1 = sf.n.f12433a
            return r1
        L5a6:
            java.lang.Object r1 = r0.f2197h
            wb.m5 r1 = (wb.m5) r1
            java.lang.Object r2 = r0.f2198i
            i0.a1 r2 = (i0.a1) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 0
            r8 = 1
            if (r3 == r6) goto L5cb
            r3 = r8
            goto L5cc
        L5cb:
            r3 = r7
        L5cc:
            r5 = r5 & r8
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L603
            wb.s0 r3 = r1.f17595a
            java.lang.Object r5 = r2.getValue()
            java.util.Set r5 = (java.util.Set) r5
            java.lang.String r6 = r3.f18970a
            boolean r5 = r5.contains(r6)
            boolean r6 = r4.f(r2)
            boolean r8 = r4.h(r3)
            r6 = r6 | r8
            java.lang.Object r8 = r4.P()
            if (r6 != 0) goto L5f4
            i0.e r6 = i0.l.f5952a
            if (r8 != r6) goto L5fd
        L5f4:
            wb.x1 r8 = new wb.x1
            r6 = 4
            r8.<init>(r3, r2, r6)
            r4.k0(r8)
        L5fd:
            fg.a r8 = (fg.a) r8
            wb.ho.U1(r1, r5, r8, r4, r7)
            goto L606
        L603:
            r4.V()
        L606:
            sf.n r1 = sf.n.f12433a
            return r1
        L609:
            java.lang.Object r1 = r0.f2197h
            x9.f r1 = (x9.f) r1
            java.lang.Object r2 = r0.f2198i
            fg.l r2 = (fg.l) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L62d
            r3 = r7
            goto L62e
        L62d:
            r3 = 0
        L62e:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L64a
            b0.q r3 = new b0.q
            r5 = 23
            r3.<init>(r1, r5, r2)
            r1 = 1568466278(0x5d7ce566, float:1.1389427E18)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L64d
        L64a:
            r4.V()
        L64d:
            sf.n r1 = sf.n.f12433a
            return r1
        L650:
            java.lang.Object r1 = r0.f2197h
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.f2198i
            java.util.List r2 = (java.util.List) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L674
            r3 = r7
            goto L675
        L674:
            r3 = 0
        L675:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L6a4
            r3 = 10
            float r7 = (float) r3
            r9 = 0
            r10 = 13
            y0.l r5 = y0.l.f21818a
            r6 = 0
            r8 = 0
            y0.o r3 = p.d.p(r5, r6, r7, r8, r9, r10)
            int r1 = r1.size()
            int r2 = r2.size()
            java.lang.String r5 = "/"
            java.lang.String r6 = " 项"
            java.lang.String r7 = "聊天 · "
            java.lang.String r1 = eh.a.k(r1, r2, r7, r5, r6)
            r2 = 48
            r5 = 12
            sh.s.j(r1, r3, r4, r2, r5)
            goto L6a7
        L6a4:
            r4.V()
        L6a7:
            sf.n r1 = sf.n.f12433a
            return r1
        L6aa:
            java.lang.Object r1 = r0.f2197h
            v8.a r1 = (v8.a) r1
            java.lang.Object r2 = r0.f2198i
            fg.l r2 = (fg.l) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L6ce
            r3 = r7
            goto L6cf
        L6ce:
            r3 = 0
        L6cf:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L6eb
            b0.q r3 = new b0.q
            r5 = 22
            r3.<init>(r1, r5, r2)
            r1 = 179601649(0xab480f1, float:1.7381872E-32)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L6ee
        L6eb:
            r4.V()
        L6ee:
            sf.n r1 = sf.n.f12433a
            return r1
        L6f1:
            java.lang.Object r1 = r0.f2197h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f2198i
            fg.a r2 = (fg.a) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L715
            r3 = r7
            goto L716
        L715:
            r3 = 0
        L716:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L732
            b0.q r3 = new b0.q
            r5 = 24
            r3.<init>(r1, r5, r2)
            r1 = 1384324179(0x52831c53, float:2.8155796E11)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L735
        L732:
            r4.V()
        L735:
            sf.n r1 = sf.n.f12433a
            return r1
        L738:
            java.lang.Object r1 = r0.f2197h
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r0.f2198i
            fg.a r2 = (fg.a) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L75c
            r3 = r7
            goto L75d
        L75c:
            r3 = 0
        L75d:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L779
            b0.q r3 = new b0.q
            r5 = 25
            r3.<init>(r1, r5, r2)
            r1 = 1262995047(0x4b47c667, float:1.3092455E7)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L77c
        L779:
            r4.V()
        L77c:
            sf.n r1 = sf.n.f12433a
            return r1
        L77f:
            java.lang.Object r1 = r0.f2197h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f2198i
            fg.a r2 = (fg.a) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L7a3
            r3 = r7
            goto L7a4
        L7a3:
            r3 = 0
        L7a4:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L7bf
            wb.rf r3 = new wb.rf
            r5 = 0
            r3.<init>(r1, r2, r5)
            r1 = 412186318(0x189176ce, float:3.7601584E-24)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L7c2
        L7bf:
            r4.V()
        L7c2:
            sf.n r1 = sf.n.f12433a
            return r1
        L7c5:
            java.lang.Object r1 = r0.f2197h
            wb.mu r1 = (wb.mu) r1
            java.lang.Object r2 = r0.f2198i
            i0.a1 r2 = (i0.a1) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L7e9
            r3 = r7
            goto L7ea
        L7e9:
            r3 = 0
        L7ea:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L806
            b0.q r3 = new b0.q
            r5 = 21
            r3.<init>(r1, r5, r2)
            r1 = -842561188(0xffffffffcdc7895c, float:-4.184585E8)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L809
        L806:
            r4.V()
        L809:
            sf.n r1 = sf.n.f12433a
            return r1
        L80c:
            java.lang.Object r1 = r0.f2197h
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r0.f2198i
            i0.a1 r2 = (i0.a1) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 0
            r8 = 1
            if (r3 == r6) goto L831
            r3 = r8
            goto L832
        L831:
            r3 = r7
        L832:
            r5 = r5 & r8
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L874
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L868
            java.lang.Object r2 = r2.getValue()
            wb.t0 r2 = (wb.t0) r2
            java.lang.String r2 = r2.f19157h
            int r1 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " · "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " 项"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L870
        L868:
            java.lang.Object r1 = r2.getValue()
            wb.t0 r1 = (wb.t0) r1
            java.lang.String r1 = r1.f19157h
        L870:
            wb.ho.E2(r1, r4, r7)
            goto L877
        L874:
            r4.V()
        L877:
            sf.n r1 = sf.n.f12433a
            return r1
        L87a:
            java.lang.Object r1 = r0.f2197h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f2198i
            i0.a1 r2 = (i0.a1) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 1
            if (r3 == r6) goto L89e
            r3 = r7
            goto L89f
        L89e:
            r3 = 0
        L89f:
            r5 = r5 & r7
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L8bb
            b0.q r3 = new b0.q
            r5 = 26
            r3.<init>(r1, r5, r2)
            r1 = 1679414863(0x6419d64f, float:1.1351178E22)
            s0.d r1 = s0.i.e(r1, r3, r4)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r4, r2, r7)
            goto L8be
        L8bb:
            r4.V()
        L8be:
            sf.n r1 = sf.n.f12433a
            return r1
        L8c1:
            java.lang.Object r1 = r0.f2197h
            db.f r1 = (db.f) r1
            java.lang.Object r2 = r0.f2198i
            c9.r0 r2 = (c9.r0) r2
            r3 = r38
            java.lang.String r3 = (java.lang.String) r3
            r4 = r39
            java.lang.String r4 = (java.lang.String) r4
            r5 = r40
            java.lang.String r5 = (java.lang.String) r5
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r1.b(r3, r4, r5)
            r2.invoke()
        L8e4:
            sf.n r1 = sf.n.f12433a
            return r1
        L8e7:
            java.lang.Object r1 = r0.f2197h
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.f2198i
            i0.a1 r2 = (i0.a1) r2
            r3 = r38
            r.d r3 = (r.d) r3
            r4 = r39
            i0.h0 r4 = (i0.h0) r4
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.getClass()
            r3 = r5 & 17
            r6 = 16
            r7 = 0
            r8 = 1
            if (r3 == r6) goto L90c
            r3 = r8
            goto L90d
        L90c:
            r3 = r7
        L90d:
            r5 = r5 & r8
            boolean r3 = r4.S(r5, r3)
            if (r3 == 0) goto L94c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L940
            java.lang.Object r2 = r2.getValue()
            wb.t0 r2 = (wb.t0) r2
            java.lang.String r2 = r2.f19157h
            int r1 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " · "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " 项"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L948
        L940:
            java.lang.Object r1 = r2.getValue()
            wb.t0 r1 = (wb.t0) r1
            java.lang.String r1 = r1.f19157h
        L948:
            wb.ho.E2(r1, r4, r7)
            goto L94f
        L94c:
            r4.V()
        L94f:
            sf.n r1 = sf.n.f12433a
            return r1
        L952:
            java.lang.Object r1 = r0.f2197h
            android.text.Spannable r1 = (android.text.Spannable) r1
            java.lang.Object r2 = r0.f2198i
            q2.c r2 = (q2.c) r2
            r3 = r38
            i2.f0 r3 = (i2.f0) r3
            r4 = r39
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r40
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            l2.b r6 = new l2.b
            m2.p r7 = r3.f6303f
            m2.k r8 = r3.f6300c
            if (r8 != 0) goto L978
            m2.k r8 = m2.k.f8697i
        L978:
            m2.i r9 = r3.f6301d
            if (r9 == 0) goto L97f
            int r9 = r9.f8694a
            goto L980
        L97f:
            r9 = 0
        L980:
            m2.j r3 = r3.f6302e
            if (r3 == 0) goto L987
            int r3 = r3.f8695a
            goto L98a
        L987:
            r3 = 65535(0xffff, float:9.1834E-41)
        L98a:
            java.lang.Object r2 = r2.f10604h
            q2.d r2 = (q2.d) r2
            m2.d r10 = r2.f10609e
            m2.e r10 = (m2.e) r10
            m2.r r3 = r10.b(r7, r8, r9, r3)
            boolean r7 = r3 instanceof m2.r
            if (r7 != 0) goto L9ab
            b5.c r7 = new b5.c
            b5.c r8 = r2.f10614j
            r7.<init>(r3, r8)
            r2.f10614j = r7
            java.lang.Object r2 = r7.f471c
            r2.getClass()
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            goto L9b2
        L9ab:
            java.lang.Object r2 = r3.f8711g
            r2.getClass()
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
        L9b2:
            r3 = 1
            r6.<init>(r2, r3)
            r2 = 33
            r1.setSpan(r6, r4, r5, r2)
            goto L8e4
        L9bd:
            java.lang.Object r1 = r0.f2197h
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f2198i
            l.d r2 = (l.d) r2
            r3 = r38
            p.u r3 = (p.u) r3
            r3 = r39
            i0.h0 r3 = (i0.h0) r3
            r4 = r40
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r4 & 17
            r6 = 16
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L9df
            r5 = r8
            goto L9e0
        L9df:
            r5 = r7
        L9e0:
            r4 = r4 & r8
            boolean r4 = r3.S(r4, r5)
            if (r4 == 0) goto La05
            java.lang.Object r4 = r3.P()
            i0.e r5 = i0.l.f5952a
            if (r4 != r5) goto L9f7
            l.e r4 = new l.e
            r4.<init>()
            r3.k0(r4)
        L9f7:
            l.e r4 = (l.e) r4
            w0.p r5 = r4.f7624a
            r5.clear()
            r1.invoke(r4)
            r4.a(r2, r3, r7)
            goto La08
        La05:
            r3.V()
        La08:
            sf.n r1 = sf.n.f12433a
            return r1
        La0b:
            java.lang.Object r1 = r0.f2197h
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            java.lang.Object r2 = r0.f2198i
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            r3 = r38
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r39
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            r4 = r40
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            if (r3 >= 0) goto La2c
            r3 = 0
        La2c:
            r1.set(r3)
            r2.countDown()
            goto L8e4
    }
}
