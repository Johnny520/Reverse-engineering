package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f17268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17271k;

    public /* synthetic */ kf(long r2, fg.a r4, android.app.Activity r5, fg.l r6) {
            r1 = this;
            r0 = 1
            r1.f17267g = r0
            r1.<init>()
            r1.f17268h = r2
            r1.f17269i = r4
            r1.f17270j = r5
            r1.f17271k = r6
            return
    }

    public /* synthetic */ kf(android.content.SharedPreferences r2, java.util.List r3, long r4, java.lang.String r6) {
            r1 = this;
            r0 = 0
            r1.f17267g = r0
            r1.<init>()
            r1.f17269i = r2
            r1.f17270j = r3
            r1.f17268h = r4
            r1.f17271k = r6
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r48, java.lang.Object r49) {
            r47 = this;
            r1 = r47
            int r0 = r1.f17267g
            sf.n r2 = sf.n.f12433a
            r3 = 0
            r5 = 2
            r6 = 1
            java.lang.Object r8 = r1.f17271k
            java.lang.Object r9 = r1.f17270j
            java.lang.Object r10 = r1.f17269i
            long r11 = r1.f17268h
            switch(r0) {
                case 0: goto L60a;
                default: goto L15;
            }
        L15:
            r15 = r10
            fg.a r15 = (fg.a) r15
            android.app.Activity r9 = (android.app.Activity) r9
            fg.l r8 = (fg.l) r8
            r10 = r48
            i0.h0 r10 = (i0.h0) r10
            r0 = r49
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13 = r0 & 3
            if (r13 == r5) goto L2e
            r13 = r6
            goto L2f
        L2e:
            r13 = 0
        L2f:
            r0 = r0 & r6
            boolean r0 = r10.S(r0, r13)
            if (r0 == 0) goto L603
            boolean r0 = r10.e(r11)
            java.lang.Object r13 = r10.P()
            i0.e r14 = i0.l.f5952a
            r16 = 0
            if (r0 != 0) goto L46
            if (r13 != r14) goto L66
        L46:
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L53
            goto L55
        L53:
            r0 = r16
        L55:
            if (r0 == 0) goto L5c
            long r3 = r0.longValue()
            goto L60
        L5c:
            long r3 = java.lang.System.currentTimeMillis()
        L60:
            r13.setTimeInMillis(r3)
            r10.k0(r13)
        L66:
            java.util.Calendar r13 = (java.util.Calendar) r13
            boolean r0 = r10.f(r13)
            java.lang.Object r3 = r10.P()
            if (r0 != 0) goto L74
            if (r3 != r14) goto L83
        L74:
            int r0 = r13.get(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r3 = i0.r.u(r0)
            r10.k0(r3)
        L83:
            i0.a1 r3 = (i0.a1) r3
            boolean r0 = r10.f(r13)
            java.lang.Object r4 = r10.P()
            if (r0 != 0) goto L91
            if (r4 != r14) goto La1
        L91:
            int r0 = r13.get(r5)
            int r0 = r0 + r6
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r4 = i0.r.u(r0)
            r10.k0(r4)
        La1:
            i0.a1 r4 = (i0.a1) r4
            boolean r0 = r10.f(r13)
            java.lang.Object r5 = r10.P()
            if (r0 != 0) goto Laf
            if (r5 != r14) goto Lbf
        Laf:
            r0 = 5
            int r0 = r13.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r5 = i0.r.u(r0)
            r10.k0(r5)
        Lbf:
            i0.a1 r5 = (i0.a1) r5
            boolean r0 = r10.f(r13)
            java.lang.Object r11 = r10.P()
            if (r0 != 0) goto Lcd
            if (r11 != r14) goto Lde
        Lcd:
            r0 = 11
            int r0 = r13.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r11 = i0.r.u(r0)
            r10.k0(r11)
        Lde:
            i0.a1 r11 = (i0.a1) r11
            boolean r0 = r10.f(r13)
            java.lang.Object r12 = r10.P()
            r7 = 12
            if (r0 != 0) goto Lee
            if (r12 != r14) goto Lfd
        Lee:
            int r0 = r13.get(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r12 = i0.r.u(r0)
            r10.k0(r12)
        Lfd:
            i0.a1 r12 = (i0.a1) r12
            boolean r0 = r10.f(r13)
            java.lang.Object r7 = r10.P()
            r6 = 13
            if (r0 != 0) goto L10d
            if (r7 != r14) goto L11c
        L10d:
            int r0 = r13.get(r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r7 = i0.r.u(r0)
            r10.k0(r7)
        L11c:
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r13 = r4.getValue()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r17 = r5.getValue()
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r18 = r11.getValue()
            java.lang.String r18 = (java.lang.String) r18
            java.lang.Object r19 = r12.getValue()
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Object r20 = r7.getValue()
            java.lang.String r20 = (java.lang.String) r20
            java.lang.Integer r0 = og.t.f0(r0)
            if (r0 == 0) goto L226
            int r6 = r0.intValue()
            r21 = r0
            r0 = 1970(0x7b2, float:2.76E-42)
            if (r0 > r6) goto L159
            r0 = 2039(0x7f7, float:2.857E-42)
            if (r6 >= r0) goto L159
            r0 = r21
            goto L15b
        L159:
            r0 = r16
        L15b:
            if (r0 == 0) goto L226
            int r22 = r0.intValue()
            java.lang.Integer r0 = og.t.f0(r13)
            if (r0 == 0) goto L226
            int r6 = r0.intValue()
            r13 = 1
            if (r13 > r6) goto L173
            r13 = 13
            if (r6 >= r13) goto L173
            goto L175
        L173:
            r0 = r16
        L175:
            if (r0 == 0) goto L226
            int r0 = r0.intValue()
            java.lang.Integer r6 = og.t.f0(r17)
            if (r6 == 0) goto L226
            int r13 = r6.intValue()
            r1 = 1
            if (r1 > r13) goto L18d
            r1 = 32
            if (r13 >= r1) goto L18d
            goto L18f
        L18d:
            r6 = r16
        L18f:
            if (r6 == 0) goto L226
            int r24 = r6.intValue()
            java.lang.Integer r1 = og.t.f0(r18)
            if (r1 == 0) goto L226
            int r6 = r1.intValue()
            if (r6 < 0) goto L1a6
            r13 = 24
            if (r6 >= r13) goto L1a6
            goto L1a8
        L1a6:
            r1 = r16
        L1a8:
            if (r1 == 0) goto L226
            int r25 = r1.intValue()
            java.lang.Integer r1 = og.t.f0(r19)
            if (r1 == 0) goto L226
            int r6 = r1.intValue()
            r13 = 60
            if (r6 < 0) goto L1bf
            if (r6 >= r13) goto L1bf
            goto L1c1
        L1bf:
            r1 = r16
        L1c1:
            if (r1 == 0) goto L226
            int r26 = r1.intValue()
            java.lang.Integer r1 = og.t.f0(r20)
            if (r1 == 0) goto L226
            int r6 = r1.intValue()
            if (r6 < 0) goto L1d6
            if (r6 >= r13) goto L1d6
            goto L1d8
        L1d6:
            r1 = r16
        L1d8:
            if (r1 == 0) goto L226
            int r27 = r1.intValue()
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L1fb
            r6 = 0
            r1.setLenient(r6)     // Catch: java.lang.Throwable -> L1fb
            r1.clear()     // Catch: java.lang.Throwable -> L1fb
            r39 = 1
            int r23 = r0 + (-1)
            r21 = r1
            r21.set(r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L1fb
            long r0 = r21.getTimeInMillis()     // Catch: java.lang.Throwable -> L1fb
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L1fb
            goto L202
        L1fb:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L202:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L209
            r0 = r16
        L209:
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L226
            long r17 = r0.longValue()
            r19 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 / r19
            r19 = 1
            int r1 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r1 > 0) goto L226
            r19 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r1 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r1 >= 0) goto L226
            r16 = r0
        L226:
            r0 = r16
            y0.l r1 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r13 = p.h1.d(r1, r6)
            p.e r6 = p.j.f9926c
            r40 = r2
            y0.e r2 = y0.b.f21804s
            r41 = r15
            r15 = 0
            p.t r2 = p.s.a(r6, r2, r10, r15)
            r42 = r8
            r6 = r9
            long r8 = r10.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r10.l()
            y0.o r13 = y0.a.c(r10, r13)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r10.d0()
            r43 = r6
            boolean r6 = r10.S
            if (r6 == 0) goto L262
            r10.k(r15)
            goto L265
        L262:
            r10.n0()
        L265:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r10, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r10, r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r10, r8)
            x1.d r8 = x1.f.f20888g
            i0.r.w(r8, r10)
            r44 = r0
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r10, r13)
            r25 = r7
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r1, r13)
            r13 = 8
            float r13 = (float) r13
            r45 = r13
            p.h r13 = p.j.g(r45)
            r26 = r12
            y0.f r12 = y0.b.f21801p
            r27 = r11
            r11 = 6
            p.e1 r13 = p.d1.a(r13, r12, r10, r11)
            r46 = r12
            long r11 = r10.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r10.l()
            y0.o r7 = y0.a.c(r10, r7)
            r10.d0()
            r28 = r5
            boolean r5 = r10.S
            if (r5 == 0) goto L2bd
            r10.k(r15)
            goto L2c0
        L2bd:
            r10.n0()
        L2c0:
            i0.r.A(r6, r10, r13)
            i0.r.A(r2, r10, r12)
            j8.b.p(r11, r10, r9, r10, r8)
            i0.r.A(r0, r10, r7)
            wb.y2 r16 = wb.y2.f20291p
            java.lang.Object r5 = r3.getValue()
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            p.f1 r5 = p.f1.f9898a
            r13 = 1
            y0.o r21 = r5.a(r1, r13)
            boolean r7 = r10.f(r3)
            java.lang.Object r11 = r10.P()
            if (r7 != 0) goto L2e9
            if (r11 != r14) goto L2f3
        L2e9:
            wb.lp r11 = new wb.lp
            r7 = 18
            r11.<init>(r3, r7)
            r10.k0(r11)
        L2f3:
            r22 = r11
            fg.l r22 = (fg.l) r22
            r24 = 1576326(0x180d86, float:2.208903E-39)
            java.lang.String r17 = "年"
            r19 = 4
            r20 = 2038(0x7f6, float:2.856E-42)
            r23 = r10
            r16.j(r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r23
            java.lang.Object r10 = r4.getValue()
            r18 = r10
            java.lang.String r18 = (java.lang.String) r18
            r13 = 1
            y0.o r21 = r5.a(r1, r13)
            boolean r10 = r7.f(r4)
            java.lang.Object r11 = r7.P()
            if (r10 != 0) goto L320
            if (r11 != r14) goto L32a
        L320:
            wb.lp r11 = new wb.lp
            r10 = 19
            r11.<init>(r4, r10)
            r7.k0(r11)
        L32a:
            r22 = r11
            fg.l r22 = (fg.l) r22
            r24 = 1576326(0x180d86, float:2.208903E-39)
            java.lang.String r17 = "月"
            r19 = 2
            r20 = 12
            r23 = r7
            r16.j(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r10 = r28.getValue()
            r18 = r10
            java.lang.String r18 = (java.lang.String) r18
            r13 = 1
            y0.o r21 = r5.a(r1, r13)
            r10 = r28
            boolean r11 = r7.f(r10)
            java.lang.Object r12 = r7.P()
            if (r11 != 0) goto L357
            if (r12 != r14) goto L361
        L357:
            wb.lp r12 = new wb.lp
            r11 = 20
            r12.<init>(r10, r11)
            r7.k0(r12)
        L361:
            r22 = r12
            fg.l r22 = (fg.l) r22
            r24 = 1576326(0x180d86, float:2.208903E-39)
            java.lang.String r17 = "日"
            r19 = 2
            r20 = 31
            r23 = r7
            r16.j(r17, r18, r19, r20, r21, r22, r23, r24)
            r13 = 1
            r7.p(r13)
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r17 = p.h1.d(r1, r13)
            r11 = 10
            float r11 = (float) r11
            r21 = 0
            r22 = 13
            r18 = 0
            r20 = 0
            r19 = r11
            y0.o r11 = p.d.p(r17, r18, r19, r20, r21, r22)
            p.h r12 = p.j.g(r45)
            r28 = r3
            r13 = r46
            r3 = 6
            p.e1 r12 = p.d1.a(r12, r13, r7, r3)
            r29 = r4
            long r3 = r7.T
            int r3 = java.lang.Long.hashCode(r3)
            s0.h r4 = r7.l()
            y0.o r11 = y0.a.c(r7, r11)
            r7.d0()
            r30 = r10
            boolean r10 = r7.S
            if (r10 == 0) goto L3b8
            r7.k(r15)
            goto L3bb
        L3b8:
            r7.n0()
        L3bb:
            i0.r.A(r6, r7, r12)
            i0.r.A(r2, r7, r4)
            j8.b.p(r3, r7, r9, r7, r8)
            i0.r.A(r0, r7, r11)
            java.lang.Object r3 = r27.getValue()
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            r3 = 1
            y0.o r21 = r5.a(r1, r3)
            r11 = r27
            boolean r3 = r7.f(r11)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L3e2
            if (r4 != r14) goto L3ec
        L3e2:
            wb.lp r4 = new wb.lp
            r3 = 21
            r4.<init>(r11, r3)
            r7.k0(r4)
        L3ec:
            r22 = r4
            fg.l r22 = (fg.l) r22
            r24 = 1576326(0x180d86, float:2.208903E-39)
            java.lang.String r17 = "时"
            r19 = 2
            r20 = 23
            r23 = r7
            r16.j(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r26.getValue()
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            r3 = 1
            y0.o r21 = r5.a(r1, r3)
            r12 = r26
            boolean r3 = r7.f(r12)
            java.lang.Object r4 = r7.P()
            if (r3 != 0) goto L419
            if (r4 != r14) goto L423
        L419:
            wb.lp r4 = new wb.lp
            r3 = 22
            r4.<init>(r12, r3)
            r7.k0(r4)
        L423:
            r22 = r4
            fg.l r22 = (fg.l) r22
            r24 = 1576326(0x180d86, float:2.208903E-39)
            java.lang.String r17 = "分"
            r19 = 2
            r20 = 59
            r23 = r7
            r16.j(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r25.getValue()
            r18 = r3
            java.lang.String r18 = (java.lang.String) r18
            r3 = 1
            y0.o r21 = r5.a(r1, r3)
            r3 = r25
            boolean r4 = r7.f(r3)
            java.lang.Object r10 = r7.P()
            if (r4 != 0) goto L450
            if (r10 != r14) goto L45a
        L450:
            wb.lp r10 = new wb.lp
            r4 = 23
            r10.<init>(r3, r4)
            r7.k0(r10)
        L45a:
            r22 = r10
            fg.l r22 = (fg.l) r22
            r24 = 1576326(0x180d86, float:2.208903E-39)
            java.lang.String r17 = "秒"
            r19 = 2
            r20 = 59
            r23 = r7
            r16.j(r17, r18, r19, r20, r21, r22, r23, r24)
            r4 = r16
            r10 = 1
            r7.p(r10)
            if (r44 == 0) goto L4dc
            java.util.Locale r10 = java.util.Locale.US
            java.lang.Object r16 = r28.getValue()
            java.lang.String r16 = (java.lang.String) r16
            int r16 = java.lang.Integer.parseInt(r16)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r16)
            java.lang.Object r16 = r29.getValue()
            java.lang.String r16 = (java.lang.String) r16
            int r16 = java.lang.Integer.parseInt(r16)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r16)
            java.lang.Object r16 = r30.getValue()
            java.lang.String r16 = (java.lang.String) r16
            int r16 = java.lang.Integer.parseInt(r16)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r16)
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            int r11 = java.lang.Integer.parseInt(r11)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r12.getValue()
            java.lang.String r11 = (java.lang.String) r11
            int r11 = java.lang.Integer.parseInt(r11)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r11)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r17, r18, r19, r20, r21, r22}
            r11 = 6
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r11)
            java.lang.String r11 = "%04d-%02d-%02d %02d:%02d:%02d"
            java.lang.String r3 = java.lang.String.format(r10, r11, r3)
        L4d9:
            r16 = r3
            goto L4df
        L4dc:
            java.lang.String r3 = "请输入有效的年、月、日、时、分、秒"
            goto L4d9
        L4df:
            if (r44 == 0) goto L4fc
            r3 = -1625262846(0xffffffff9f207502, float:-3.3978104E-20)
            r7.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r7.j(r3)
            bi.b r3 = (bi.b) r3
            long r10 = r3.h()
            r3 = 0
            r7.p(r3)
        L4f7:
            r18 = r10
            r3 = 13
            goto L510
        L4fc:
            r3 = 0
            r10 = -1625148673(0xffffffff9f2232ff, float:-3.4347017E-20)
            r7.a0(r10)
            r7.p(r3)
            r10 = 4292030255(0xffd32f2f, double:2.1205447E-314)
            long r10 = f1.c0.d(r10)
            goto L4f7
        L510:
            long r20 = x6.d.D(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            y0.o r22 = p.h1.d(r1, r3)
            r3 = 12
            float r3 = (float) r3
            r26 = 0
            r27 = 13
            r23 = 0
            r25 = 0
            r24 = r3
            y0.o r17 = p.d.p(r22, r23, r24, r25, r26, r27)
            t2.k r10 = new t2.k
            r11 = 3
            r10.<init>(r11)
            r37 = 0
            r38 = 261096(0x3fbe8, float:3.65873E-40)
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r36 = 24624(0x6030, float:3.4506E-41)
            r35 = r7
            r26 = r10
            sh.s.n(r16, r17, r18, r20, r22, r23, r24, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r23 = p.h1.d(r1, r10)
            r11 = 6
            float r10 = (float) r11
            r28 = 5
            r24 = 0
            r26 = 0
            r25 = r3
            r27 = r10
            y0.o r3 = p.d.p(r23, r24, r25, r26, r27, r28)
            p.h r10 = p.j.g(r45)
            p.e1 r10 = p.d1.a(r10, r13, r7, r11)
            long r11 = r7.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r7.l()
            y0.o r3 = y0.a.c(r7, r3)
            r7.d0()
            boolean r13 = r7.S
            if (r13 == 0) goto L58a
            r7.k(r15)
            goto L58d
        L58a:
            r7.n0()
        L58d:
            i0.r.A(r6, r7, r10)
            i0.r.A(r2, r7, r12)
            j8.b.p(r11, r7, r9, r7, r8)
            i0.r.A(r0, r7, r3)
            r13 = 1
            y0.o r16 = r5.a(r1, r13)
            r19 = 24582(0x6006, float:3.4447E-41)
            r20 = 8
            r2 = r14
            java.lang.String r14 = "取消"
            r17 = 0
            r13 = r4
            r18 = r7
            r15 = r41
            r13.k(r14, r15, r16, r17, r18, r19, r20)
            r14 = r44
            boolean r0 = r7.f(r14)
            boolean r3 = r7.f(r15)
            r0 = r0 | r3
            r6 = r43
            boolean r3 = r7.h(r6)
            r0 = r0 | r3
            r8 = r42
            boolean r3 = r7.f(r8)
            r0 = r0 | r3
            java.lang.Object r3 = r7.P()
            if (r0 != 0) goto L5d0
            if (r3 != r2) goto L5df
        L5d0:
            c9.n0 r13 = new c9.n0
            r18 = 29
            r16 = r6
            r17 = r8
            r13.<init>(r14, r15, r16, r17, r18)
            r7.k0(r13)
            r3 = r13
        L5df:
            r18 = r3
            fg.a r18 = (fg.a) r18
            r13 = 1
            y0.o r19 = r5.a(r1, r13)
            if (r14 == 0) goto L5ed
            r20 = r13
            goto L5ef
        L5ed:
            r20 = 0
        L5ef:
            r22 = 24582(0x6006, float:3.4447E-41)
            r23 = 0
            java.lang.String r17 = "确定"
            r16 = r4
            r21 = r7
            r16.k(r17, r18, r19, r20, r21, r22, r23)
            r7.p(r13)
            r7.p(r13)
            goto L609
        L603:
            r40 = r2
            r7 = r10
            r7.V()
        L609:
            return r40
        L60a:
            r40 = r2
            r14 = r10
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14
            java.util.List r9 = (java.util.List) r9
            java.lang.String r8 = (java.lang.String) r8
            r0 = r48
            i0.h0 r0 = (i0.h0) r0
            r1 = r49
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            if (r2 == r5) goto L626
            r13 = 1
        L624:
            r10 = 1
            goto L628
        L626:
            r13 = 0
            goto L624
        L628:
            r1 = r1 & r10
            boolean r1 = r0.S(r1, r13)
            if (r1 == 0) goto L695
            r18 = 0
            r20 = 28080(0x6db0, float:3.9348E-41)
            java.lang.String r15 = "keyword_notify_enable"
            java.lang.String r16 = "启用关键词通知"
            java.lang.String r17 = "收到匹配消息时提醒"
            r19 = r0
            wb.ho.O3(r14, r15, r16, r17, r18, r19, r20)
            r1 = 0
            r6 = 0
            wb.ho.D1(r1, r0, r6, r10)
            int r2 = r9.size()
            java.lang.String r5 = " 个"
            java.lang.String r16 = p.a.i(r2, r5)
            r19 = 6
            r20 = 4
            java.lang.String r15 = "关键词"
            r17 = 0
            r18 = r0
            wb.ho.B1(r15, r16, r17, r18, r19, r20)
            wb.ho.D1(r1, r0, r6, r10)
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            java.lang.String r2 = "暂无匹配记录"
            if (r1 <= 0) goto L685
            java.util.concurrent.atomic.AtomicInteger r3 = x9.d.f21409a
            if (r1 > 0) goto L668
            goto L67f
        L668:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.getDefault()
            r1.<init>(r2, r3)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r11)
            java.lang.String r2 = r1.format(r2)
            r2.getClass()
        L67f:
            java.lang.String r1 = " · "
            java.lang.String r2 = wb.en.h(r2, r1, r8)
        L685:
            r16 = r2
            r19 = 6
            r20 = 4
            java.lang.String r15 = "上次匹配"
            r17 = 0
            r18 = r0
            wb.ho.B1(r15, r16, r17, r18, r19, r20)
            goto L698
        L695:
            r0.V()
        L698:
            return r40
    }
}
