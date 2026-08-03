package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1206j;

    public /* synthetic */ h0(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.f1203g = r1
            r0.f1204h = r2
            r0.f1205i = r3
            r0.f1206j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ h0(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.String r4) {
            r0 = this;
            r0.f1203g = r1
            r0.f1206j = r4
            r0.f1204h = r2
            r0.f1205i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ h0(fg.l r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f1203g = r4
            r0.f1205i = r1
            r0.f1204h = r2
            r0.f1206j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ h0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f1203g = r4
            r0.f1204h = r1
            r0.f1206j = r2
            r0.f1205i = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
            r30 = this;
            r0 = r30
            int r1 = r0.f1203g
            switch(r1) {
                case 0: goto Lbbc;
                case 1: goto Lb51;
                case 2: goto Lb07;
                case 3: goto La85;
                case 4: goto La40;
                case 5: goto L9f5;
                case 6: goto L991;
                case 7: goto L93d;
                case 8: goto L8d9;
                case 9: goto L88e;
                case 10: goto L843;
                case 11: goto L7d2;
                case 12: goto L787;
                case 13: goto L73c;
                case 14: goto L6f1;
                case 15: goto L6a6;
                case 16: goto L657;
                case 17: goto L60c;
                case 18: goto L5c1;
                case 19: goto L576;
                case 20: goto L52b;
                case 21: goto L4e0;
                case 22: goto L491;
                case 23: goto L432;
                case 24: goto L3e7;
                case 25: goto L398;
                case 26: goto L30a;
                case 27: goto L10c;
                case 28: goto Lb4;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f1204h
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r0.f1206j
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r0.f1205i
            fg.a r3 = (fg.a) r3
            r4 = r31
            p.f1 r4 = (p.f1) r4
            r9 = r32
            i0.h0 r9 = (i0.h0) r9
            r5 = r33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r4 = r5 & 17
            r6 = 16
            r7 = 1
            if (r4 == r6) goto L2f
            r4 = r7
            goto L30
        L2f:
            r4 = 0
        L30:
            r5 = r5 & r7
            boolean r4 = r9.S(r5, r4)
            if (r4 == 0) goto Lae
            m1.f r5 = wb.ap.f15063d
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r6 = r9.j(r4)
            bi.b r6 = (bi.b) r6
            long r6 = r6.g()
            f1.n r8 = new f1.n
            r11 = 5
            r8.<init>(r6, r11)
            r6 = 24
            float r12 = (float) r6
            y0.l r13 = y0.l.f21818a
            y0.o r6 = p.h1.j(r13, r12)
            y0.o r7 = wb.ho.O6(r6, r1)
            java.lang.String r6 = "压缩上下文"
            r10 = 54
            k.n.c(r5, r6, r7, r8, r9, r10)
            m1.f r5 = wb.ap.f15065f
            java.lang.Object r1 = r9.j(r4)
            bi.b r1 = (bi.b) r1
            long r6 = r1.g()
            f1.n r8 = new f1.n
            r8.<init>(r6, r11)
            r1 = 14
            float r14 = (float) r1
            r17 = 0
            r18 = 14
            r15 = 0
            r16 = 0
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            y0.o r1 = p.h1.j(r1, r12)
            y0.o r7 = wb.ho.O6(r1, r2)
            java.lang.String r6 = "会话历史"
            k.n.c(r5, r6, r7, r8, r9, r10)
            m1.f r5 = wb.ap.f15067h
            java.lang.Object r1 = r9.j(r4)
            bi.b r1 = (bi.b) r1
            long r1 = r1.g()
            f1.n r8 = new f1.n
            r8.<init>(r1, r11)
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            y0.o r1 = p.h1.j(r1, r12)
            y0.o r7 = wb.ho.O6(r1, r3)
            java.lang.String r6 = "Agent 配置"
            k.n.c(r5, r6, r7, r8, r9, r10)
            goto Lb1
        Lae:
            r9.V()
        Lb1:
            sf.n r1 = sf.n.f12433a
            return r1
        Lb4:
            java.lang.Object r1 = r0.f1206j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f1204h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f1205i
            i0.a1 r3 = (i0.a1) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 0
            r9 = 1
            if (r4 == r7) goto Ldd
            r4 = r9
            goto Lde
        Ldd:
            r4 = r8
        Lde:
            r6 = r6 & r9
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L106
            r4 = 6
            float r11 = (float) r4
            r13 = 0
            r14 = 13
            y0.l r9 = y0.l.f21818a
            r10 = 0
            r12 = 0
            y0.o r4 = p.d.p(r9, r10, r11, r12, r13, r14)
            wb.rj r6 = new wb.rj
            r7 = 16
            r6.<init>(r1, r2, r3, r7)
            r1 = -1189526962(0xffffffffb919424e, float:-1.4615917E-4)
            s0.d r1 = s0.i.e(r1, r6, r5)
            r2 = 54
            wb.ho.C3(r4, r1, r5, r2, r8)
            goto L109
        L106:
            r5.V()
        L109:
            sf.n r1 = sf.n.f12433a
            return r1
        L10c:
            java.lang.Object r1 = r0.f1205i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f1204h
            fb.t0 r2 = (fb.t0) r2
            java.lang.Object r3 = r0.f1206j
            java.lang.String r3 = (java.lang.String) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r9 = 1
            if (r4 == r7) goto L134
            r4 = r9
            goto L135
        L134:
            r4 = 0
        L135:
            r6 = r6 & r9
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L304
            y0.l r4 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r4, r6)
            r10 = 6
            float r10 = (float) r10
            v.d r10 = v.e.a(r10)
            y0.o r11 = c1.h.b(r7, r10)
            boolean r7 = r5.f(r1)
            boolean r10 = r5.h(r2)
            r7 = r7 | r10
            java.lang.Object r10 = r5.P()
            if (r7 != 0) goto L161
            i0.e r7 = i0.l.f5952a
            if (r10 != r7) goto L16b
        L161:
            wb.xi r10 = new wb.xi
            r7 = 15
            r10.<init>(r1, r7, r2)
            r5.k0(r10)
        L16b:
            r15 = r10
            fg.a r15 = (fg.a) r15
            r16 = 15
            r12 = 0
            r13 = 0
            r14 = 0
            y0.o r1 = k.n.j(r11, r12, r13, r14, r15, r16)
            r7 = 12
            float r10 = (float) r7
            r11 = 10
            float r11 = (float) r11
            y0.o r1 = p.d.m(r1, r10, r11)
            y0.f r11 = y0.b.f21802q
            p.c r12 = p.j.f9924a
            r13 = 48
            p.e1 r11 = p.d1.a(r12, r11, r5, r13)
            long r12 = r5.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r5.l()
            y0.o r1 = y0.a.c(r5, r1)
            x1.f r14 = x1.g.f20914f
            r14.getClass()
            x1.y r14 = x1.f.f20883b
            r5.d0()
            boolean r15 = r5.S
            if (r15 == 0) goto L1ab
            r5.k(r14)
            goto L1ae
        L1ab:
            r5.n0()
        L1ae:
            x1.e r15 = x1.f.f20886e
            i0.r.A(r15, r5, r11)
            x1.e r11 = x1.f.f20885d
            i0.r.A(r11, r5, r13)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            x1.e r13 = x1.f.f20887f
            i0.r.A(r13, r5, r12)
            x1.d r12 = x1.f.f20888g
            i0.r.w(r12, r5)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r5, r1)
            double r8 = (double) r6
            r16 = 0
            int r1 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r1 <= 0) goto L1d3
            goto L1d8
        L1d3:
            java.lang.String r1 = "invalid weight; must be greater than zero"
            q.a.a(r1)
        L1d8:
            p.q0 r1 = new p.q0
            r8 = 1
            r1.<init>(r6, r8)
            p.e r6 = p.j.f9926c
            y0.e r9 = y0.b.f21804s
            r8 = 0
            p.t r6 = p.s.a(r6, r9, r5, r8)
            long r8 = r5.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r5.l()
            y0.o r1 = y0.a.c(r5, r1)
            r5.d0()
            r28 = r4
            boolean r4 = r5.S
            if (r4 == 0) goto L202
            r5.k(r14)
            goto L205
        L202:
            r5.n0()
        L205:
            i0.r.A(r15, r5, r6)
            i0.r.A(r11, r5, r9)
            j8.b.p(r8, r5, r13, r5, r12)
            i0.r.A(r7, r5, r1)
            java.lang.String r1 = r2.f3784b
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r6 = r5.j(r4)
            bi.b r6 = (bi.b) r6
            long r7 = r6.g()
            r6 = 14
            long r11 = x6.d.D(r6)
            r6 = r10
            r9 = r11
            m2.k r11 = m2.k.f8698j
            r26 = 24960(0x6180, float:3.4976E-41)
            r27 = 241578(0x3afaa, float:3.38523E-40)
            r12 = r6
            r6 = 0
            r13 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r16 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 2
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 1
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r24 = r23
            r23 = 0
            r25 = 1597440(0x186000, float:2.23849E-39)
            r31 = r24
            r29 = 12
            r24 = r5
            r5 = r1
            r1 = 1
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            fb.v r6 = r2.f3785c
            java.lang.String r6 = r6.f3826d
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L270
            java.lang.String r6 = "未设置模型"
        L270:
            java.lang.Object r7 = r5.j(r4)
            bi.b r7 = (bi.b) r7
            long r7 = r7.h()
            long r9 = x6.d.D(r29)
            r26 = 24960(0x6180, float:3.4976E-41)
            r27 = 241642(0x3afea, float:3.38613E-40)
            r24 = r5
            r5 = r6
            r6 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 2
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 24576(0x6000, float:3.4438E-41)
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            r5.p(r1)
            java.lang.String r2 = r2.f3783a
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L2f6
            r2 = -649531600(0xffffffffd948ef30, float:-3.534874E15)
            r5.a0(r2)
            java.lang.Object r2 = r5.j(r4)
            bi.b r2 = (bi.b) r2
            long r7 = r2.j()
            long r2 = x6.d.D(r29)
            r14 = 0
            r15 = 14
            r12 = 0
            r13 = 0
            r11 = r31
            r10 = r28
            y0.o r6 = p.d.p(r10, r11, r12, r13, r14, r15)
            r26 = 0
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r24 = r5
            java.lang.String r5 = "当前"
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 24630(0x6036, float:3.4514E-41)
            r9 = r2
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            r8 = 0
            r5.p(r8)
            goto L300
        L2f6:
            r8 = 0
            r2 = -649216423(0xffffffffd94dbe59, float:-3.6194787E15)
            r5.a0(r2)
            r5.p(r8)
        L300:
            r5.p(r1)
            goto L307
        L304:
            r5.V()
        L307:
            sf.n r1 = sf.n.f12433a
            return r1
        L30a:
            java.lang.Object r1 = r0.f1204h
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f1206j
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.f1205i
            fg.p r3 = (fg.p) r3
            r4 = r31
            p.x0 r4 = (p.x0) r4
            r14 = r32
            i0.h0 r14 = (i0.h0) r14
            r5 = r33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r6 = r5 & 6
            if (r6 != 0) goto L337
            boolean r6 = r14.f(r4)
            if (r6 == 0) goto L335
            r6 = 4
            goto L336
        L335:
            r6 = 2
        L336:
            r5 = r5 | r6
        L337:
            r6 = r5 & 19
            r7 = 18
            r8 = 1
            if (r6 == r7) goto L340
            r6 = r8
            goto L341
        L340:
            r6 = 0
        L341:
            r5 = r5 & r8
            boolean r5 = r14.S(r5, r6)
            if (r5 == 0) goto L392
            p.a0 r5 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r6 = 0
            y0.o r5 = r1.f.a(r5, r1, r6)
            float r1 = r4.c()
            r6 = 8
            float r6 = (float) r6
            float r1 = r1 + r6
            float r4 = r4.a()
            r6 = 84
            float r6 = (float) r6
            float r4 = r4 + r6
            r6 = 5
            p.z0 r7 = p.d.b(r1, r4, r6)
            boolean r1 = r14.h(r2)
            boolean r4 = r14.f(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r14.P()
            if (r1 != 0) goto L379
            i0.e r1 = i0.l.f5952a
            if (r4 != r1) goto L382
        L379:
            wb.o8 r4 = new wb.o8
            r1 = 0
            r4.<init>(r2, r3, r1)
            r14.k0(r4)
        L382:
            r13 = r4
            fg.l r13 = (fg.l) r13
            r15 = 0
            r16 = 506(0x1fa, float:7.09E-43)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            a.a.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L395
        L392:
            r14.V()
        L395:
            sf.n r1 = sf.n.f12433a
            return r1
        L398:
            java.lang.Object r1 = r0.f1204h
            r4 = r1
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.Object r1 = r0.f1206j
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r0.f1205i
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
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
            if (r1 == r3) goto L3c3
            r1 = r9
            goto L3c4
        L3c3:
            r1 = 0
        L3c4:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L3e1
            b0.k r2 = new b0.k
            r3 = 12
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1135360719(0xffffffffbc53c531, float:-0.012925432)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto L3e4
        L3e1:
            r8.V()
        L3e4:
            sf.n r1 = sf.n.f12433a
            return r1
        L3e7:
            java.lang.Object r1 = r0.f1204h
            x8.b r1 = (x8.b) r1
            java.lang.Object r2 = r0.f1205i
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f1206j
            fg.a r3 = (fg.a) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L40f
            r4 = r8
            goto L410
        L40f:
            r4 = 0
        L410:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L42c
            b0.k r4 = new b0.k
            r6 = 29
            r4.<init>(r1, r2, r3, r6)
            r1 = 2138812569(0x7f7bb099, float:3.3455317E38)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L42f
        L42c:
            r5.V()
        L42f:
            sf.n r1 = sf.n.f12433a
            return r1
        L432:
            java.lang.Object r1 = r0.f1204h
            wb.t5 r1 = (wb.t5) r1
            java.lang.Object r2 = r0.f1206j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f1205i
            i0.a1 r3 = (i0.a1) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 0
            r9 = 1
            if (r4 == r7) goto L45b
            r4 = r9
            goto L45c
        L45b:
            r4 = r8
        L45c:
            r6 = r6 & r9
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L48b
            boolean r4 = r5.f(r2)
            boolean r6 = r5.h(r1)
            r4 = r4 | r6
            boolean r6 = r5.f(r3)
            r4 = r4 | r6
            java.lang.Object r6 = r5.P()
            if (r4 != 0) goto L47b
            i0.e r4 = i0.l.f5952a
            if (r6 != r4) goto L485
        L47b:
            ab.e r6 = new ab.e
            r4 = 26
            r6.<init>(r1, r2, r3, r4)
            r5.k0(r6)
        L485:
            fg.a r6 = (fg.a) r6
            wb.ho.Z1(r1, r6, r5, r8)
            goto L48e
        L48b:
            r5.V()
        L48e:
            sf.n r1 = sf.n.f12433a
            return r1
        L491:
            java.lang.Object r1 = r0.f1206j
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r0.f1204h
            r5 = r1
            wb.hq r5 = (wb.hq) r5
            java.lang.Object r1 = r0.f1205i
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
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
            if (r1 == r3) goto L4bc
            r1 = r9
            goto L4bd
        L4bc:
            r1 = 0
        L4bd:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L4da
            b0.k r2 = new b0.k
            r3 = 19
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 1218541127(0x48a17647, float:330674.22)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto L4dd
        L4da:
            r8.V()
        L4dd:
            sf.n r1 = sf.n.f12433a
            return r1
        L4e0:
            java.lang.Object r1 = r0.f1204h
            db.c r1 = (db.c) r1
            java.lang.Object r2 = r0.f1205i
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f1206j
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L508
            r4 = r8
            goto L509
        L508:
            r4 = 0
        L509:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L525
            b0.k r4 = new b0.k
            r6 = 24
            r4.<init>(r1, r2, r3, r6)
            r1 = -1296477537(0xffffffffb2b9529f, float:-2.1574406E-8)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L528
        L525:
            r5.V()
        L528:
            sf.n r1 = sf.n.f12433a
            return r1
        L52b:
            java.lang.Object r1 = r0.f1204h
            v8.a r1 = (v8.a) r1
            java.lang.Object r2 = r0.f1205i
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f1206j
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L553
            r4 = r8
            goto L554
        L553:
            r4 = 0
        L554:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L570
            b0.k r4 = new b0.k
            r6 = 16
            r4.<init>(r1, r2, r3, r6)
            r1 = -1342732179(0xffffffffaff7886d, float:-4.5025975E-10)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L573
        L570:
            r5.V()
        L573:
            sf.n r1 = sf.n.f12433a
            return r1
        L576:
            java.lang.Object r1 = r0.f1204h
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.Object r2 = r0.f1206j
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r3 = r0.f1205i
            fg.a r3 = (fg.a) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L59e
            r4 = r8
            goto L59f
        L59e:
            r4 = 0
        L59f:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L5bb
            b0.k r4 = new b0.k
            r6 = 15
            r4.<init>(r1, r2, r3, r6)
            r1 = -1797786420(0xffffffff94d7f4cc, float:-2.1806007E-26)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L5be
        L5bb:
            r5.V()
        L5be:
            sf.n r1 = sf.n.f12433a
            return r1
        L5c1:
            java.lang.Object r1 = r0.f1204h
            wb.h5 r1 = (wb.h5) r1
            java.lang.Object r2 = r0.f1206j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f1205i
            i0.a1 r3 = (i0.a1) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L5e9
            r4 = r8
            goto L5ea
        L5e9:
            r4 = 0
        L5ea:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L606
            b0.k r4 = new b0.k
            r6 = 27
            r4.<init>(r1, r2, r3, r6)
            r1 = 1743049115(0x67e4d19b, float:2.1611322E24)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L609
        L606:
            r5.V()
        L609:
            sf.n r1 = sf.n.f12433a
            return r1
        L60c:
            java.lang.Object r1 = r0.f1204h
            wb.cp r1 = (wb.cp) r1
            java.lang.Object r2 = r0.f1206j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f1205i
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L634
            r4 = r8
            goto L635
        L634:
            r4 = 0
        L635:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L651
            b0.k r4 = new b0.k
            r6 = 26
            r4.<init>(r1, r2, r3, r6)
            r1 = -678180461(0xffffffffd793c993, float:-3.2498793E14)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L654
        L651:
            r5.V()
        L654:
            sf.n r1 = sf.n.f12433a
            return r1
        L657:
            java.lang.Object r1 = r0.f1204h
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r0.f1206j
            r5 = r1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r1 = r0.f1205i
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
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
            if (r1 == r3) goto L682
            r1 = r9
            goto L683
        L682:
            r1 = 0
        L683:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L6a0
            b0.k r2 = new b0.k
            r3 = 18
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 660279963(0x275b129b, float:3.0402441E-15)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto L6a3
        L6a0:
            r8.V()
        L6a3:
            sf.n r1 = sf.n.f12433a
            return r1
        L6a6:
            java.lang.Object r1 = r0.f1204h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f1206j
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r0.f1205i
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L6ce
            r4 = r8
            goto L6cf
        L6ce:
            r4 = 0
        L6cf:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L6eb
            b0.k r4 = new b0.k
            r6 = 21
            r4.<init>(r1, r2, r3, r6)
            r1 = 302657455(0x120a2faf, float:4.3603897E-28)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L6ee
        L6eb:
            r5.V()
        L6ee:
            sf.n r1 = sf.n.f12433a
            return r1
        L6f1:
            java.lang.Object r1 = r0.f1204h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f1206j
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r0.f1205i
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L719
            r4 = r8
            goto L71a
        L719:
            r4 = 0
        L71a:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L736
            b0.k r4 = new b0.k
            r6 = 22
            r4.<init>(r1, r2, r3, r6)
            r1 = -2114701211(0xffffffff81f43865, float:-8.9712366E-38)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L739
        L736:
            r5.V()
        L739:
            sf.n r1 = sf.n.f12433a
            return r1
        L73c:
            java.lang.Object r1 = r0.f1204h
            db.c r1 = (db.c) r1
            java.lang.Object r2 = r0.f1206j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f1205i
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L764
            r4 = r8
            goto L765
        L764:
            r4 = 0
        L765:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L781
            b0.k r4 = new b0.k
            r6 = 23
            r4.<init>(r1, r2, r3, r6)
            r1 = -1742879764(0xffffffff981dc3ec, float:-2.039069E-24)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L784
        L781:
            r5.V()
        L784:
            sf.n r1 = sf.n.f12433a
            return r1
        L787:
            java.lang.Object r1 = r0.f1204h
            db.c r1 = (db.c) r1
            java.lang.Object r2 = r0.f1205i
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f1206j
            fg.a r3 = (fg.a) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L7af
            r4 = r8
            goto L7b0
        L7af:
            r4 = 0
        L7b0:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L7cc
            b0.k r4 = new b0.k
            r6 = 17
            r4.<init>(r1, r2, r3, r6)
            r1 = -466113424(0xffffffffe437ac70, float:-1.3552718E22)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L7cf
        L7cc:
            r5.V()
        L7cf:
            sf.n r1 = sf.n.f12433a
            return r1
        L7d2:
            java.lang.Object r1 = r0.f1204h
            r2 = r1
            wb.s0 r2 = (wb.s0) r2
            java.lang.Object r1 = r0.f1206j
            wb.v0 r1 = (wb.v0) r1
            java.lang.Object r3 = r0.f1205i
            i0.a1 r3 = (i0.a1) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r6 = r32
            i0.h0 r6 = (i0.h0) r6
            r5 = r33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r4 = r5 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L7fb
            r4 = r8
            goto L7fc
        L7fb:
            r4 = 0
        L7fc:
            r5 = r5 & r8
            boolean r4 = r6.S(r5, r4)
            if (r4 == 0) goto L83d
            java.lang.Object r4 = r3.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.String r5 = r2.f18970a
            boolean r4 = r4.contains(r5)
            r5 = r4
            boolean r4 = r1.f19585c
            boolean r7 = r6.f(r3)
            boolean r8 = r6.f(r1)
            r7 = r7 | r8
            boolean r8 = r6.h(r2)
            r7 = r7 | r8
            java.lang.Object r8 = r6.P()
            if (r7 != 0) goto L82a
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L834
        L82a:
            ab.e r8 = new ab.e
            r7 = 21
            r8.<init>(r1, r2, r3, r7)
            r6.k0(r8)
        L834:
            fg.a r8 = (fg.a) r8
            r7 = 0
            r3 = r5
            r5 = r8
            wb.ho.a0(r2, r3, r4, r5, r6, r7)
            goto L840
        L83d:
            r6.V()
        L840:
            sf.n r1 = sf.n.f12433a
            return r1
        L843:
            java.lang.Object r1 = r0.f1204h
            wb.v0 r1 = (wb.v0) r1
            java.lang.Object r2 = r0.f1206j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f1205i
            i0.a1 r3 = (i0.a1) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L86b
            r4 = r8
            goto L86c
        L86b:
            r4 = 0
        L86c:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L888
            b0.k r4 = new b0.k
            r6 = 20
            r4.<init>(r1, r2, r3, r6)
            r1 = 958776819(0x3925c5f3, float:1.5809368E-4)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L88b
        L888:
            r5.V()
        L88b:
            sf.n r1 = sf.n.f12433a
            return r1
        L88e:
            java.lang.Object r1 = r0.f1204h
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r0.f1206j
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f1205i
            i0.a1 r3 = (i0.a1) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto L8b6
            r4 = r8
            goto L8b7
        L8b6:
            r4 = 0
        L8b7:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L8d3
            b0.k r4 = new b0.k
            r6 = 14
            r4.<init>(r1, r2, r3, r6)
            r1 = 1015004459(0x3c7fbd2b, float:0.015609066)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto L8d6
        L8d3:
            r5.V()
        L8d6:
            sf.n r1 = sf.n.f12433a
            return r1
        L8d9:
            java.lang.Object r1 = r0.f1205i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f1204h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f1206j
            r7 = r3
            fg.a r7 = (fg.a) r7
            r3 = r31
            th.a r3 = (th.a) r3
            r10 = r32
            i0.h0 r10 = (i0.h0) r10
            r4 = r33
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.getClass()
            r3 = r4 & 17
            r5 = 16
            r6 = 1
            if (r3 == r5) goto L902
            r3 = r6
            goto L903
        L902:
            r3 = 0
        L903:
            r4 = r4 & r6
            boolean r3 = r10.S(r4, r3)
            if (r3 == 0) goto L937
            boolean r3 = r10.f(r1)
            boolean r4 = r10.f(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r10.P()
            if (r3 != 0) goto L91d
            i0.e r3 = i0.l.f5952a
            if (r4 != r3) goto L926
        L91d:
            wb.o1 r4 = new wb.o1
            r3 = 5
            r4.<init>(r1, r2, r3)
            r10.k0(r4)
        L926:
            r5 = r4
            fg.a r5 = (fg.a) r5
            r11 = 390(0x186, float:5.47E-43)
            r12 = 48
            java.lang.String r4 = "保存回复"
            java.lang.String r6 = "返回"
            r8 = 0
            r9 = 0
            wb.ho.M(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L93a
        L937:
            r10.V()
        L93a:
            sf.n r1 = sf.n.f12433a
            return r1
        L93d:
            java.lang.Object r1 = r0.f1204h
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.f1206j
            r4 = r1
            fg.a r4 = (fg.a) r4
            java.lang.Object r1 = r0.f1205i
            r5 = r1
            fg.a r5 = (fg.a) r5
            r1 = r31
            r.d r1 = (r.d) r1
            r6 = r32
            i0.h0 r6 = (i0.h0) r6
            r3 = r33
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r7 = 16
            r8 = 1
            if (r1 == r7) goto L968
            r1 = r8
            goto L969
        L968:
            r1 = 0
        L969:
            r3 = r3 & r8
            boolean r1 = r6.S(r3, r1)
            if (r1 == 0) goto L98b
            java.lang.Object r1 = r6.P()
            i0.e r3 = i0.l.f5952a
            if (r1 != r3) goto L982
            w0.l r1 = new w0.l
            r3 = 28
            r1.<init>(r3)
            r6.k0(r1)
        L982:
            r3 = r1
            fg.l r3 = (fg.l) r3
            r7 = 48
            wb.ho.t3(r2, r3, r4, r5, r6, r7)
            goto L98e
        L98b:
            r6.V()
        L98e:
            sf.n r1 = sf.n.f12433a
            return r1
        L991:
            java.lang.Object r1 = r0.f1205i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f1204h
            v8.a r2 = (v8.a) r2
            java.lang.Object r3 = r0.f1206j
            r7 = r3
            fg.a r7 = (fg.a) r7
            r3 = r31
            th.a r3 = (th.a) r3
            r10 = r32
            i0.h0 r10 = (i0.h0) r10
            r4 = r33
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.getClass()
            r3 = r4 & 17
            r5 = 16
            r6 = 1
            if (r3 == r5) goto L9ba
            r3 = r6
            goto L9bb
        L9ba:
            r3 = 0
        L9bb:
            r4 = r4 & r6
            boolean r3 = r10.S(r4, r3)
            if (r3 == 0) goto L9ef
            boolean r3 = r10.f(r1)
            boolean r4 = r10.h(r2)
            r3 = r3 | r4
            java.lang.Object r4 = r10.P()
            if (r3 != 0) goto L9d5
            i0.e r3 = i0.l.f5952a
            if (r4 != r3) goto L9de
        L9d5:
            wb.ea r4 = new wb.ea
            r3 = 0
            r4.<init>(r1, r2, r3)
            r10.k0(r4)
        L9de:
            r5 = r4
            fg.a r5 = (fg.a) r5
            r11 = 390(0x186, float:5.47E-43)
            r12 = 48
            java.lang.String r4 = "保存"
            java.lang.String r6 = "返回"
            r8 = 0
            r9 = 0
            wb.ho.M(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L9f2
        L9ef:
            r10.V()
        L9f2:
            sf.n r1 = sf.n.f12433a
            return r1
        L9f5:
            java.lang.Object r1 = r0.f1204h
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r0.f1205i
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r0.f1206j
            java.lang.String r3 = (java.lang.String) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto La1d
            r4 = r8
            goto La1e
        La1d:
            r4 = 0
        La1e:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto La3a
            b0.k r4 = new b0.k
            r6 = 11
            r4.<init>(r1, r2, r3, r6)
            r1 = -877424272(0xffffffffcbb39170, float:-2.3536352E7)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto La3d
        La3a:
            r5.V()
        La3d:
            sf.n r1 = sf.n.f12433a
            return r1
        La40:
            java.lang.Object r1 = r0.f1206j
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.f1204h
            r3 = r1
            fg.a r3 = (fg.a) r3
            java.lang.Object r1 = r0.f1205i
            r5 = r1
            fg.a r5 = (fg.a) r5
            r1 = r31
            th.a r1 = (th.a) r1
            r8 = r32
            i0.h0 r8 = (i0.h0) r8
            r4 = r33
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.getClass()
            r1 = r4 & 17
            r6 = 16
            r7 = 1
            if (r1 == r6) goto La6b
            r1 = r7
            goto La6c
        La6b:
            r1 = 0
        La6c:
            r4 = r4 & r7
            boolean r1 = r8.S(r4, r1)
            if (r1 == 0) goto La7f
            r9 = 384(0x180, float:5.38E-43)
            r10 = 48
            java.lang.String r4 = "返回"
            r6 = 0
            r7 = 0
            wb.ho.M(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto La82
        La7f:
            r8.V()
        La82:
            sf.n r1 = sf.n.f12433a
            return r1
        La85:
            java.lang.Object r1 = r0.f1204h
            r3 = r1
            f9.h r3 = (f9.h) r3
            java.lang.Object r1 = r0.f1206j
            r4 = r1
            c9.q0 r4 = (c9.q0) r4
            java.lang.Object r1 = r0.f1205i
            r6 = r1
            c9.n0 r6 = (c9.n0) r6
            r5 = r31
            fg.a r5 = (fg.a) r5
            r1 = r32
            i0.h0 r1 = (i0.h0) r1
            r2 = r33
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.getClass()
            r7 = r2 & 6
            if (r7 != 0) goto Lab5
            boolean r7 = r1.h(r5)
            if (r7 == 0) goto Lab3
            r7 = 4
            goto Lab4
        Lab3:
            r7 = 2
        Lab4:
            r2 = r2 | r7
        Lab5:
            r8 = r2
            r2 = r8 & 19
            r7 = 18
            if (r2 == r7) goto Labe
            r2 = 1
            goto Labf
        Labe:
            r2 = 0
        Labf:
            r7 = r8 & 1
            boolean r2 = r1.S(r7, r2)
            if (r2 == 0) goto Laff
            boolean r2 = r3.f3379d
            if (r2 == 0) goto Lacf
            java.lang.String r2 = "修改转账金额"
        Lacd:
            r9 = r2
            goto Lad2
        Lacf:
            java.lang.String r2 = "修改聊天记录"
            goto Lacd
        Lad2:
            c9.q0 r2 = new c9.q0
            r7 = 5
            r2.<init>(r3, r4, r5, r6, r7)
            r16 = r5
            r3 = 1759226525(0x68dbaa9d, float:8.298764E24)
            s0.d r22 = s0.i.e(r3, r2, r1)
            int r2 = r8 << 24
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r24 = r2 | 6
            r25 = 3072(0xc00, float:4.305E-42)
            r7 = 0
            r8 = r9
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = r1
            oh.h.d(r7, r8, r9, r11, r13, r15, r16, r17, r19, r21, r22, r23, r24, r25)
            goto Lb04
        Laff:
            r23 = r1
            r23.V()
        Lb04:
            sf.n r1 = sf.n.f12433a
            return r1
        Lb07:
            java.lang.Object r1 = r0.f1204h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f1206j
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.f1205i
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r5 = r32
            i0.h0 r5 = (i0.h0) r5
            r6 = r33
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            if (r4 == r7) goto Lb2f
            r4 = r8
            goto Lb30
        Lb2f:
            r4 = 0
        Lb30:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto Lb4b
            b0.k r4 = new b0.k
            r6 = 6
            r4.<init>(r1, r2, r3, r6)
            r1 = -563841534(0xffffffffde647602, float:-4.115587E18)
            s0.d r1 = s0.i.e(r1, r4, r5)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r5, r2, r8)
            goto Lb4e
        Lb4b:
            r5.V()
        Lb4e:
            sf.n r1 = sf.n.f12433a
            return r1
        Lb51:
            java.lang.Object r1 = r0.f1204h
            c9.c1 r1 = (c9.c1) r1
            java.lang.Object r2 = r0.f1206j
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r3 = r0.f1205i
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r9 = r32
            i0.h0 r9 = (i0.h0) r9
            r5 = r33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r4 = r5 & 17
            r6 = 16
            r7 = 1
            if (r4 == r6) goto Lb79
            r4 = r7
            goto Lb7a
        Lb79:
            r4 = 0
        Lb7a:
            r5 = r5 & r7
            boolean r4 = r9.S(r5, r4)
            if (r4 == 0) goto Lbb6
            c9.j1 r5 = c9.j1.f1228a
            java.lang.String r10 = r1.f1119b
            java.lang.String r11 = r1.f1120c
            int r6 = r1.f1121d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r4 = r1.f1118a
            boolean r12 = tf.m.o1(r2, r4)
            boolean r2 = r9.f(r3)
            boolean r4 = r9.f(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r9.P()
            if (r2 != 0) goto Lba4
            i0.e r2 = i0.l.f5952a
            if (r4 != r2) goto Lbad
        Lba4:
            c9.m0 r4 = new c9.m0
            r2 = 1
            r4.<init>(r3, r1, r2)
            r9.k0(r4)
        Lbad:
            r8 = r4
            fg.a r8 = (fg.a) r8
            r7 = 196608(0x30000, float:2.75506E-40)
            r5.i(r6, r7, r8, r9, r10, r11, r12)
            goto Lbb9
        Lbb6:
            r9.V()
        Lbb9:
            sf.n r1 = sf.n.f12433a
            return r1
        Lbbc:
            java.lang.Object r1 = r0.f1204h
            c9.c1 r1 = (c9.c1) r1
            java.lang.Object r2 = r0.f1206j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.f1205i
            fg.l r3 = (fg.l) r3
            r4 = r31
            r.d r4 = (r.d) r4
            r9 = r32
            i0.h0 r9 = (i0.h0) r9
            r5 = r33
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r4 = r5 & 17
            r6 = 16
            r7 = 1
            if (r4 == r6) goto Lbe4
            r4 = r7
            goto Lbe5
        Lbe4:
            r4 = 0
        Lbe5:
            r5 = r5 & r7
            boolean r4 = r9.S(r5, r4)
            if (r4 == 0) goto Lc1f
            c9.j1 r5 = c9.j1.f1228a
            java.lang.String r10 = r1.f1119b
            java.lang.String r11 = r1.f1120c
            int r6 = r1.f1121d
            java.lang.String r4 = r1.f1118a
            boolean r12 = gg.l.a(r2, r4)
            boolean r2 = r9.f(r3)
            boolean r4 = r9.f(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r9.P()
            if (r2 != 0) goto Lc0d
            i0.e r2 = i0.l.f5952a
            if (r4 != r2) goto Lc16
        Lc0d:
            c9.m0 r4 = new c9.m0
            r2 = 0
            r4.<init>(r3, r1, r2)
            r9.k0(r4)
        Lc16:
            r8 = r4
            fg.a r8 = (fg.a) r8
            r7 = 196608(0x30000, float:2.75506E-40)
            r5.i(r6, r7, r8, r9, r10, r11, r12)
            goto Lc22
        Lc1f:
            r9.V()
        Lc22:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
