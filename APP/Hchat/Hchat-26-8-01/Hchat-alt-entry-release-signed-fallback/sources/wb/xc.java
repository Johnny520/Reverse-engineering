package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20136l;

    public /* synthetic */ xc(android.content.SharedPreferences r2, java.util.Set r3, fg.l r4, fg.l r5, i0.a1 r6) {
            r1 = this;
            r0 = 1
            r1.f20131g = r0
            r1.<init>()
            r1.f20134j = r2
            r1.f20135k = r3
            r1.f20132h = r4
            r1.f20133i = r5
            r1.f20136l = r6
            return
    }

    public /* synthetic */ xc(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, fg.p r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f20131g = r6
            r0.f20134j = r1
            r0.f20132h = r2
            r0.f20133i = r3
            r0.f20136l = r4
            r0.f20135k = r5
            r0.<init>()
            return
    }

    public /* synthetic */ xc(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f20131g = r6
            r0.f20134j = r1
            r0.f20132h = r2
            r0.f20133i = r3
            r0.f20135k = r4
            r0.f20136l = r5
            r0.<init>()
            return
    }

    public /* synthetic */ xc(java.util.List r2, android.content.SharedPreferences r3, i0.a1 r4, fg.l r5, i0.a1 r6) {
            r1 = this;
            r0 = 11
            r1.f20131g = r0
            r1.<init>()
            r1.f20134j = r2
            r1.f20133i = r3
            r1.f20135k = r4
            r1.f20132h = r5
            r1.f20136l = r6
            return
    }

    public /* synthetic */ xc(na.h r2, fg.l r3, android.content.Context r4, fg.l r5, java.util.List r6) {
            r1 = this;
            r0 = 4
            r1.f20131g = r0
            r1.<init>()
            r1.f20134j = r2
            r1.f20132h = r3
            r1.f20135k = r4
            r1.f20133i = r5
            r1.f20136l = r6
            return
    }

    public /* synthetic */ xc(sh.x r2, r.z r3, wb.cp r4, i0.a1 r5, fg.l r6) {
            r1 = this;
            r0 = 7
            r1.f20131g = r0
            r1.<init>()
            r1.f20134j = r2
            r1.f20133i = r3
            r1.f20135k = r4
            r1.f20136l = r5
            r1.f20132h = r6
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
            r24 = this;
            r0 = r24
            int r1 = r0.f20131g
            switch(r1) {
                case 0: goto L718;
                case 1: goto L6c2;
                case 2: goto L4ba;
                case 3: goto L416;
                case 4: goto L3bf;
                case 5: goto L32d;
                case 6: goto L294;
                case 7: goto L1f6;
                case 8: goto L159;
                case 9: goto Ldd;
                case 10: goto L72;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f20134j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f20133i
            r5 = r2
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.Object r2 = r0.f20135k
            r6 = r2
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r2 = r0.f20132h
            r4 = r2
            fg.l r4 = (fg.l) r4
            java.lang.Object r2 = r0.f20136l
            r7 = r2
            i0.a1 r7 = (i0.a1) r7
            r2 = r25
            r.d r2 = (r.d) r2
            r9 = r26
            i0.h0 r9 = (i0.h0) r9
            r3 = r27
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r2 = r3 & 17
            r8 = 16
            r10 = 0
            r11 = 1
            if (r2 == r8) goto L3c
            r2 = r11
            goto L3d
        L3c:
            r2 = r10
        L3d:
            r3 = r3 & r11
            boolean r2 = r9.S(r3, r2)
            if (r2 == 0) goto L6c
            boolean r2 = r9.h(r5)
            boolean r3 = r9.f(r6)
            r2 = r2 | r3
            boolean r3 = r9.f(r4)
            r2 = r2 | r3
            java.lang.Object r3 = r9.P()
            if (r2 != 0) goto L5c
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L66
        L5c:
            c9.k r3 = new c9.k
            r8 = 22
            r3.<init>(r4, r5, r6, r7, r8)
            r9.k0(r3)
        L66:
            fg.l r3 = (fg.l) r3
            wb.ho.G2(r1, r3, r9, r10)
            goto L6f
        L6c:
            r9.V()
        L6f:
            sf.n r1 = sf.n.f12433a
            return r1
        L72:
            java.lang.Object r1 = r0.f20134j
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f20132h
            r5 = r2
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.Object r2 = r0.f20133i
            r6 = r2
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r2 = r0.f20136l
            r4 = r2
            fg.p r4 = (fg.p) r4
            java.lang.Object r2 = r0.f20135k
            r7 = r2
            i0.a1 r7 = (i0.a1) r7
            r2 = r25
            r.d r2 = (r.d) r2
            r9 = r26
            i0.h0 r9 = (i0.h0) r9
            r3 = r27
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r2 = r3 & 17
            r8 = 16
            r10 = 0
            r11 = 1
            if (r2 == r8) goto La7
            r2 = r11
            goto La8
        La7:
            r2 = r10
        La8:
            r3 = r3 & r11
            boolean r2 = r9.S(r3, r2)
            if (r2 == 0) goto Ld7
            boolean r2 = r9.h(r5)
            boolean r3 = r9.f(r6)
            r2 = r2 | r3
            boolean r3 = r9.f(r4)
            r2 = r2 | r3
            java.lang.Object r3 = r9.P()
            if (r2 != 0) goto Lc7
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto Ld1
        Lc7:
            c9.q0 r3 = new c9.q0
            r8 = 19
            r3.<init>(r4, r5, r6, r7, r8)
            r9.k0(r3)
        Ld1:
            fg.p r3 = (fg.p) r3
            wb.ho.J0(r1, r3, r9, r10)
            goto Lda
        Ld7:
            r9.V()
        Lda:
            sf.n r1 = sf.n.f12433a
            return r1
        Ldd:
            java.lang.Object r1 = r0.f20134j
            r3 = r1
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r1 = r0.f20132h
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r0.f20133i
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r0.f20135k
            r6 = r1
            fg.a r6 = (fg.a) r6
            java.lang.Object r1 = r0.f20136l
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            r1 = r25
            th.a r1 = (th.a) r1
            r12 = r26
            i0.h0 r12 = (i0.h0) r12
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r8 = 16
            r9 = 1
            if (r1 == r8) goto L112
            r1 = r9
            goto L113
        L112:
            r1 = 0
        L113:
            r2 = r2 & r9
            boolean r1 = r12.S(r2, r1)
            if (r1 == 0) goto L153
            boolean r1 = r12.h(r3)
            boolean r2 = r12.f(r4)
            r1 = r1 | r2
            boolean r2 = r12.h(r5)
            r1 = r1 | r2
            boolean r2 = r12.f(r6)
            r1 = r1 | r2
            java.lang.Object r2 = r12.P()
            if (r1 != 0) goto L137
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L141
        L137:
            c9.r0 r2 = new c9.r0
            r8 = 13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r12.k0(r2)
        L141:
            r7 = r2
            fg.a r7 = (fg.a) r7
            r13 = 390(0x186, float:5.47E-43)
            r14 = 48
            r9 = r6
            java.lang.String r6 = "保存"
            java.lang.String r8 = "返回"
            r10 = 0
            r11 = 0
            wb.ho.M(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L156
        L153:
            r12.V()
        L156:
            sf.n r1 = sf.n.f12433a
            return r1
        L159:
            java.lang.Object r1 = r0.f20134j
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f20132h
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f20133i
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f20135k
            fg.a r3 = (fg.a) r3
            java.lang.Object r5 = r0.f20136l
            fg.a r5 = (fg.a) r5
            r6 = r25
            p.x0 r6 = (p.x0) r6
            r12 = r26
            i0.h0 r12 = (i0.h0) r12
            r7 = r27
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.getClass()
            r8 = r7 & 6
            if (r8 != 0) goto L18f
            boolean r8 = r12.f(r6)
            if (r8 == 0) goto L18d
            r8 = 4
            goto L18e
        L18d:
            r8 = 2
        L18e:
            r7 = r7 | r8
        L18f:
            r8 = r7 & 19
            r9 = 18
            r10 = 1
            if (r8 == r9) goto L198
            r8 = r10
            goto L199
        L198:
            r8 = 0
        L199:
            r7 = r7 & r10
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L1f0
            p.a0 r7 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r8 = 0
            y0.o r1 = r1.f.a(r7, r1, r8)
            float r7 = r6.c()
            r8 = 8
            float r8 = (float) r8
            float r7 = r7 + r8
            float r6 = r6.a()
            r8 = 84
            float r8 = (float) r8
            float r6 = r6 + r8
            r8 = 5
            p.z0 r6 = p.d.b(r7, r6, r8)
            boolean r7 = r12.h(r2)
            boolean r8 = r12.f(r3)
            r7 = r7 | r8
            boolean r8 = r12.f(r5)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L1d6
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L1df
        L1d6:
            wb.dj r8 = new wb.dj
            r7 = 4
            r8.<init>(r2, r3, r5, r7)
            r12.k0(r8)
        L1df:
            r11 = r8
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r5 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1f3
        L1f0:
            r12.V()
        L1f3:
            sf.n r1 = sf.n.f12433a
            return r1
        L1f6:
            java.lang.Object r1 = r0.f20134j
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f20133i
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f20135k
            wb.cp r2 = (wb.cp) r2
            java.lang.Object r3 = r0.f20136l
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r0.f20132h
            fg.l r5 = (fg.l) r5
            r6 = r25
            p.x0 r6 = (p.x0) r6
            r12 = r26
            i0.h0 r12 = (i0.h0) r12
            r7 = r27
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.getClass()
            r8 = r7 & 6
            if (r8 != 0) goto L22c
            boolean r8 = r12.f(r6)
            if (r8 == 0) goto L22a
            r8 = 4
            goto L22b
        L22a:
            r8 = 2
        L22b:
            r7 = r7 | r8
        L22c:
            r8 = r7 & 19
            r9 = 18
            r10 = 1
            if (r8 == r9) goto L235
            r8 = r10
            goto L236
        L235:
            r8 = 0
        L236:
            r7 = r7 & r10
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L28e
            p.a0 r7 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r8 = 0
            y0.o r1 = r1.f.a(r7, r1, r8)
            float r7 = r6.c()
            r8 = 8
            float r8 = (float) r8
            float r7 = r7 + r8
            float r6 = r6.a()
            r8 = 84
            float r8 = (float) r8
            float r6 = r6 + r8
            r8 = 5
            p.z0 r6 = p.d.b(r7, r6, r8)
            boolean r7 = r12.h(r2)
            boolean r8 = r12.f(r3)
            r7 = r7 | r8
            boolean r8 = r12.f(r5)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L273
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L27d
        L273:
            b0.s r8 = new b0.s
            r7 = 28
            r8.<init>(r2, r3, r5, r7)
            r12.k0(r8)
        L27d:
            r11 = r8
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r5 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L291
        L28e:
            r12.V()
        L291:
            sf.n r1 = sf.n.f12433a
            return r1
        L294:
            java.lang.Object r1 = r0.f20134j
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f20132h
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f20133i
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r0.f20135k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r0.f20136l
            i0.a1 r5 = (i0.a1) r5
            r6 = r25
            p.x0 r6 = (p.x0) r6
            r12 = r26
            i0.h0 r12 = (i0.h0) r12
            r7 = r27
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.getClass()
            r8 = r7 & 6
            if (r8 != 0) goto L2ca
            boolean r8 = r12.f(r6)
            if (r8 == 0) goto L2c8
            r8 = 4
            goto L2c9
        L2c8:
            r8 = 2
        L2c9:
            r7 = r7 | r8
        L2ca:
            r8 = r7 & 19
            r9 = 18
            r10 = 1
            if (r8 == r9) goto L2d3
            r8 = r10
            goto L2d4
        L2d3:
            r8 = 0
        L2d4:
            r7 = r7 & r10
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L327
            p.a0 r7 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r8 = 0
            y0.o r1 = r1.f.a(r7, r1, r8)
            float r7 = r6.c()
            r8 = 8
            float r8 = (float) r8
            float r7 = r7 + r8
            float r6 = r6.a()
            r8 = 84
            float r8 = (float) r8
            float r6 = r6 + r8
            r8 = 5
            p.z0 r6 = p.d.b(r7, r6, r8)
            boolean r7 = r12.h(r2)
            boolean r8 = r12.h(r3)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L30c
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L316
        L30c:
            wb.tc r8 = new wb.tc
            r7 = 11
            r8.<init>(r2, r3, r5, r7)
            r12.k0(r8)
        L316:
            r11 = r8
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r5 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L32a
        L327:
            r12.V()
        L32a:
            sf.n r1 = sf.n.f12433a
            return r1
        L32d:
            java.lang.Object r1 = r0.f20134j
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f20132h
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f20133i
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r0.f20135k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r0.f20136l
            i0.a1 r5 = (i0.a1) r5
            r6 = r25
            p.x0 r6 = (p.x0) r6
            r12 = r26
            i0.h0 r12 = (i0.h0) r12
            r7 = r27
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.getClass()
            r8 = r7 & 6
            if (r8 != 0) goto L363
            boolean r8 = r12.f(r6)
            if (r8 == 0) goto L361
            r8 = 4
            goto L362
        L361:
            r8 = 2
        L362:
            r7 = r7 | r8
        L363:
            r8 = r7 & 19
            r9 = 18
            r10 = 1
            if (r8 == r9) goto L36c
            r8 = r10
            goto L36d
        L36c:
            r8 = 0
        L36d:
            r7 = r7 & r10
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L3b9
            p.a0 r7 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r8 = 0
            y0.o r1 = r1.f.a(r7, r1, r8)
            float r7 = r6.c()
            r8 = 8
            float r8 = (float) r8
            float r7 = r7 + r8
            float r6 = r6.a()
            r8 = 84
            float r8 = (float) r8
            float r6 = r6 + r8
            r8 = 5
            p.z0 r6 = p.d.b(r7, r6, r8)
            boolean r7 = r12.h(r2)
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L3a0
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L3a8
        L3a0:
            wb.oc r8 = new wb.oc
            r8.<init>(r3, r5, r2)
            r12.k0(r8)
        L3a8:
            r11 = r8
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r5 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L3bc
        L3b9:
            r12.V()
        L3bc:
            sf.n r1 = sf.n.f12433a
            return r1
        L3bf:
            java.lang.Object r1 = r0.f20134j
            r3 = r1
            na.h r3 = (na.h) r3
            java.lang.Object r1 = r0.f20132h
            r4 = r1
            fg.l r4 = (fg.l) r4
            java.lang.Object r1 = r0.f20135k
            r5 = r1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r0.f20133i
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r0.f20136l
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            r1 = r25
            r.d r1 = (r.d) r1
            r9 = r26
            i0.h0 r9 = (i0.h0) r9
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r8 = 16
            r10 = 1
            if (r1 == r8) goto L3f4
            r1 = r10
            goto L3f5
        L3f4:
            r1 = 0
        L3f5:
            r2 = r2 & r10
            boolean r1 = r9.S(r2, r1)
            if (r1 == 0) goto L410
            b0.z r2 = new b0.z
            r8 = 7
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1304656318(0xffffffffb23c8642, float:-1.0973567E-8)
            s0.d r1 = s0.i.e(r1, r2, r9)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r9, r2, r10)
            goto L413
        L410:
            r9.V()
        L413:
            sf.n r1 = sf.n.f12433a
            return r1
        L416:
            java.lang.Object r1 = r0.f20134j
            r3 = r1
            wb.s0 r3 = (wb.s0) r3
            java.lang.Object r1 = r0.f20132h
            r4 = r1
            wb.s0 r4 = (wb.s0) r4
            java.lang.Object r1 = r0.f20133i
            r6 = r1
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r1 = r0.f20135k
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r1 = r0.f20136l
            r8 = r1
            i0.a1 r8 = (i0.a1) r8
            r1 = r25
            r.d r1 = (r.d) r1
            r10 = r26
            i0.h0 r10 = (i0.h0) r10
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r5 = 16
            r9 = 0
            r11 = 1
            if (r1 == r5) goto L44c
            r1 = r11
            goto L44d
        L44c:
            r1 = r9
        L44d:
            r2 = r2 & r11
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto L4b3
            if (r3 == 0) goto L45f
            java.lang.String r1 = r3.f18970a
            java.lang.String r2 = r4.f18970a
            java.lang.String r1 = wb.ho.M5(r1, r2)
            goto L460
        L45f:
            r1 = 0
        L460:
            if (r1 != 0) goto L464
            java.lang.String r1 = ""
        L464:
            r5 = r1
            if (r3 != 0) goto L469
            r1 = r9
            goto L473
        L469:
            java.lang.Object r1 = r7.getValue()
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r5)
        L473:
            if (r3 == 0) goto L476
            goto L477
        L476:
            r11 = r9
        L477:
            boolean r2 = r10.h(r3)
            boolean r9 = r10.f(r6)
            r2 = r2 | r9
            boolean r9 = r10.h(r4)
            r2 = r2 | r9
            boolean r9 = r10.f(r7)
            r2 = r2 | r9
            boolean r9 = r10.f(r5)
            r2 = r2 | r9
            boolean r9 = r10.f(r8)
            r2 = r2 | r9
            java.lang.Object r9 = r10.P()
            if (r2 != 0) goto L49e
            i0.e r2 = i0.l.f5952a
            if (r9 != r2) goto L4a8
        L49e:
            c9.p0 r2 = new c9.p0
            r9 = 6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.k0(r2)
            r9 = r2
        L4a8:
            r7 = r9
            fg.a r7 = (fg.a) r7
            r9 = 0
            r5 = r1
            r8 = r10
            r6 = r11
            wb.ho.a0(r4, r5, r6, r7, r8, r9)
            goto L4b7
        L4b3:
            r8 = r10
            r8.V()
        L4b7:
            sf.n r1 = sf.n.f12433a
            return r1
        L4ba:
            java.lang.Object r1 = r0.f20134j
            vb.a r1 = (vb.a) r1
            java.lang.Object r2 = r0.f20132h
            r5 = r2
            fg.a r5 = (fg.a) r5
            java.lang.Object r2 = r0.f20133i
            r6 = r2
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r2 = r0.f20135k
            r8 = r2
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r2 = r0.f20136l
            r10 = r2
            i0.a1 r10 = (i0.a1) r10
            r9 = r25
            wb.v3 r9 = (wb.v3) r9
            r13 = r26
            i0.h0 r13 = (i0.h0) r13
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r9.getClass()
            r3 = r2 & 6
            r4 = 4
            if (r3 != 0) goto L4fd
            r3 = r2 & 8
            if (r3 != 0) goto L4f3
            boolean r3 = r13.f(r9)
            goto L4f7
        L4f3:
            boolean r3 = r13.h(r9)
        L4f7:
            if (r3 == 0) goto L4fb
            r3 = r4
            goto L4fc
        L4fb:
            r3 = 2
        L4fc:
            r2 = r2 | r3
        L4fd:
            r3 = r2 & 19
            r7 = 18
            r15 = 0
            if (r3 == r7) goto L506
            r3 = 1
            goto L507
        L506:
            r3 = r15
        L507:
            r7 = r2 & 1
            boolean r3 = r13.S(r7, r3)
            if (r3 == 0) goto L6bc
            wb.u3 r3 = wb.u3.f19354a
            boolean r3 = r9.equals(r3)
            i0.e r14 = i0.l.f5952a
            if (r3 == 0) goto L55b
            r2 = 802817188(0x2fda04a4, float:3.9657266E-10)
            r13.a0(r2)
            java.lang.String r3 = r1.b()
            java.lang.Object r1 = r8.getValue()
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r13.P()
            if (r1 != r14) goto L53a
            wb.yk r1 = new wb.yk
            r2 = 26
            r1.<init>(r10, r2)
            r13.k0(r1)
        L53a:
            r6 = r1
            fg.a r6 = (fg.a) r6
            java.lang.Object r1 = r13.P()
            if (r1 != r14) goto L54d
            wb.gj r1 = new wb.gj
            r2 = 24
            r1.<init>(r10, r2)
            r13.k0(r1)
        L54d:
            r7 = r1
            fg.l r7 = (fg.l) r7
            r9 = 27648(0x6c00, float:3.8743E-41)
            r8 = r13
            wb.ho.c1(r3, r4, r5, r6, r7, r8, r9)
            r13.p(r15)
            goto L6bf
        L55b:
            boolean r1 = r9 instanceof wb.s3
            if (r1 == 0) goto L623
            r1 = 802830021(0x2fda36c5, float:3.9692885E-10)
            r13.a0(r1)
            r1 = r9
            wb.s3 r1 = (wb.s3) r1
            n9.a r3 = r1.f18984a
            boolean r1 = r1.f18985b
            java.lang.Object r5 = r13.P()
            if (r5 != r14) goto L57c
            wb.yk r5 = new wb.yk
            r7 = 27
            r5.<init>(r10, r7)
            r13.k0(r5)
        L57c:
            fg.a r5 = (fg.a) r5
            r7 = r2 & 14
            if (r7 == r4) goto L58f
            r11 = r2 & 8
            if (r11 == 0) goto L58d
            boolean r11 = r13.h(r9)
            if (r11 == 0) goto L58d
            goto L58f
        L58d:
            r11 = r15
            goto L590
        L58f:
            r11 = 1
        L590:
            java.lang.Object r12 = r13.P()
            if (r11 != 0) goto L598
            if (r12 != r14) goto L5a1
        L598:
            wb.fl r12 = new wb.fl
            r11 = 0
            r12.<init>(r9, r10, r11)
            r13.k0(r12)
        L5a1:
            fg.l r12 = (fg.l) r12
            boolean r11 = r13.h(r6)
            if (r7 == r4) goto L5b7
            r16 = r2 & 8
            if (r16 == 0) goto L5b4
            boolean r16 = r13.h(r9)
            if (r16 == 0) goto L5b4
            goto L5b7
        L5b4:
            r16 = r15
            goto L5b9
        L5b7:
            r16 = 1
        L5b9:
            r11 = r11 | r16
            java.lang.Object r15 = r13.P()
            if (r11 != 0) goto L5c3
            if (r15 != r14) goto L5c6
        L5c3:
            r11 = r7
            r7 = r6
            goto L5cd
        L5c6:
            r23 = r7
            r7 = r6
            r6 = r15
            r15 = r23
            goto L5e2
        L5cd:
            c9.k r6 = new c9.k
            r15 = r11
            r11 = 26
            r23 = r9
            r9 = r8
            r8 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r23 = r9
            r9 = r8
            r8 = r23
            r13.k0(r6)
        L5e2:
            r16 = r6
            fg.l r16 = (fg.l) r16
            boolean r6 = r13.h(r7)
            if (r15 == r4) goto L5f9
            r2 = r2 & 8
            if (r2 == 0) goto L5f7
            boolean r2 = r13.h(r9)
            if (r2 == 0) goto L5f7
            goto L5f9
        L5f7:
            r2 = 0
            goto L5fa
        L5f9:
            r2 = 1
        L5fa:
            r2 = r2 | r6
            java.lang.Object r4 = r13.P()
            if (r2 != 0) goto L603
            if (r4 != r14) goto L60e
        L603:
            c9.n0 r6 = new c9.n0
            r11 = 22
            r6.<init>(r7, r8, r9, r10, r11)
            r13.k0(r6)
            r4 = r6
        L60e:
            fg.a r4 = (fg.a) r4
            r14 = 3136(0xc40, float:4.394E-42)
            r8 = r1
            r9 = r5
            r6 = r7
            r10 = r12
            r11 = r16
            r7 = r3
            r12 = r4
            wb.ho.b1(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 0
            r13.p(r1)
            goto L6bf
        L623:
            r7 = r6
            boolean r1 = r9 instanceof wb.t3
            if (r1 == 0) goto L6b3
            r1 = 802875243(0x2fdae76b, float:3.98184E-10)
            r13.a0(r1)
            r1 = r9
            wb.t3 r1 = (wb.t3) r1
            n9.a r1 = r1.f19162a
            java.util.Set r1 = r1.f9071c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r19 = wb.ho.D5(r1)
            java.lang.Object r1 = r13.P()
            if (r1 != r14) goto L64a
            wb.jk r1 = new wb.jk
            r3 = 4
            r1.<init>(r3)
            r13.k0(r1)
        L64a:
            r20 = r1
            fg.l r20 = (fg.l) r20
            wb.v0 r15 = new wb.v0
            java.lang.String r16 = "选择标签群聊"
            wb.u0 r17 = wb.u0.f19345h
            r18 = 1
            r21 = 0
            r22 = 160(0xa0, float:2.24E-43)
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r1 = r2 & 14
            if (r1 == r4) goto L66e
            r3 = r2 & 8
            if (r3 == 0) goto L66c
            boolean r3 = r13.h(r9)
            if (r3 == 0) goto L66c
            goto L66e
        L66c:
            r3 = 0
            goto L66f
        L66e:
            r3 = 1
        L66f:
            java.lang.Object r5 = r13.P()
            if (r3 != 0) goto L677
            if (r5 != r14) goto L680
        L677:
            wb.xi r5 = new wb.xi
            r3 = 5
            r5.<init>(r9, r3, r10)
            r13.k0(r5)
        L680:
            r8 = r5
            fg.a r8 = (fg.a) r8
            if (r1 == r4) goto L692
            r1 = r2 & 8
            if (r1 == 0) goto L690
            boolean r1 = r13.h(r9)
            if (r1 == 0) goto L690
            goto L692
        L690:
            r12 = 0
            goto L693
        L692:
            r12 = 1
        L693:
            java.lang.Object r1 = r13.P()
            if (r12 != 0) goto L69b
            if (r1 != r14) goto L6a4
        L69b:
            wb.fl r1 = new wb.fl
            r2 = 1
            r1.<init>(r9, r10, r2)
            r13.k0(r1)
        L6a4:
            r9 = r1
            fg.l r9 = (fg.l) r9
            r11 = 0
            r6 = r7
            r10 = r13
            r7 = r15
            wb.ho.b0(r6, r7, r8, r9, r10, r11)
            r1 = 0
            r13.p(r1)
            goto L6bf
        L6b3:
            r1 = 0
            r2 = 802817593(0x2fda0639, float:3.965839E-10)
            af.d r1 = bc.e.d(r13, r2, r1)
            throw r1
        L6bc:
            r13.V()
        L6bf:
            sf.n r1 = sf.n.f12433a
            return r1
        L6c2:
            java.lang.Object r1 = r0.f20134j
            r3 = r1
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r1 = r0.f20135k
            r4 = r1
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r1 = r0.f20132h
            r5 = r1
            fg.l r5 = (fg.l) r5
            java.lang.Object r1 = r0.f20133i
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r0.f20136l
            r7 = r1
            i0.a1 r7 = (i0.a1) r7
            r1 = r25
            r.d r1 = (r.d) r1
            r8 = r26
            i0.h0 r8 = (i0.h0) r8
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r9 = 16
            r10 = 1
            if (r1 == r9) goto L6f7
            r1 = r10
            goto L6f8
        L6f7:
            r1 = 0
        L6f8:
            r2 = r2 & r10
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L712
            b0.z r2 = new b0.z
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -435502074(0xffffffffe60ac406, float:-1.6382564E23)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r10)
            goto L715
        L712:
            r8.V()
        L715:
            sf.n r1 = sf.n.f12433a
            return r1
        L718:
            java.lang.Object r1 = r0.f20134j
            r3 = r1
            db.c r3 = (db.c) r3
            java.lang.Object r1 = r0.f20132h
            r4 = r1
            fg.l r4 = (fg.l) r4
            java.lang.Object r1 = r0.f20133i
            r5 = r1
            fg.l r5 = (fg.l) r5
            java.lang.Object r1 = r0.f20136l
            r6 = r1
            fg.p r6 = (fg.p) r6
            java.lang.Object r1 = r0.f20135k
            r7 = r1
            fg.l r7 = (fg.l) r7
            r1 = r25
            r.d r1 = (r.d) r1
            r9 = r26
            i0.h0 r9 = (i0.h0) r9
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r8 = 16
            r10 = 1
            if (r1 == r8) goto L74d
            r1 = r10
            goto L74e
        L74d:
            r1 = 0
        L74e:
            r2 = r2 & r10
            boolean r1 = r9.S(r2, r1)
            if (r1 == 0) goto L769
            b0.z r2 = new b0.z
            r8 = 6
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = 1042987054(0x3e2ab82e, float:0.16671821)
            s0.d r1 = s0.i.e(r1, r2, r9)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r9, r2, r10)
            goto L76c
        L769:
            r9.V()
        L76c:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
