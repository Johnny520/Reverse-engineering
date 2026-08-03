package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f16256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sf.b f16259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16260l;

    public /* synthetic */ fs(int r2, fg.l r3, wb.rt r4, fg.l r5, fg.l r6) {
            r1 = this;
            r0 = 0
            r1.f16255g = r0
            r1.<init>()
            r1.f16257i = r2
            r1.f16256h = r3
            r1.f16260l = r4
            r1.f16258j = r5
            r1.f16259k = r6
            return
    }

    public /* synthetic */ fs(sf.e r2, fg.a r3, android.app.Activity r4, fg.l r5, int r6) {
            r1 = this;
            r0 = 1
            r1.f16255g = r0
            r1.<init>()
            r1.f16258j = r2
            r1.f16259k = r3
            r1.f16260l = r4
            r1.f16256h = r5
            r1.f16257i = r6
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
            r29 = this;
            r0 = r29
            int r1 = r0.f16255g
            switch(r1) {
                case 0: goto L81;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f16258j
            sf.e r1 = (sf.e) r1
            sf.b r2 = r0.f16259k
            r4 = r2
            fg.a r4 = (fg.a) r4
            java.lang.Object r2 = r0.f16260l
            r5 = r2
            android.app.Activity r5 = (android.app.Activity) r5
            r2 = r30
            r.d r2 = (r.d) r2
            r10 = r31
            i0.h0 r10 = (i0.h0) r10
            r3 = r32
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.getClass()
            r2 = r3 & 17
            r6 = 16
            r7 = 1
            if (r2 == r6) goto L31
            r2 = r7
            goto L32
        L31:
            r2 = 0
        L32:
            r3 = r3 & r7
            boolean r2 = r10.S(r3, r2)
            if (r2 == 0) goto L7b
            wb.y2 r2 = wb.y2.f20291p
            java.lang.Object r3 = r1.f12418g
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r1.f12419h
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = r10.f(r4)
            boolean r6 = r10.h(r5)
            r3 = r3 | r6
            fg.l r6 = r0.f16256h
            boolean r7 = r10.f(r6)
            r3 = r3 | r7
            int r7 = r0.f16257i
            boolean r8 = r10.d(r7)
            r3 = r3 | r8
            java.lang.Object r8 = r10.P()
            if (r3 != 0) goto L65
            i0.e r3 = i0.l.f5952a
            if (r8 != r3) goto L6f
        L65:
            wb.pu r3 = new wb.pu
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            r10.k0(r3)
            r8 = r3
        L6f:
            fg.a r8 = (fg.a) r8
            r11 = 3072(0xc00, float:4.305E-42)
            r6 = r2
            r7 = r9
            r9 = r8
            r8 = r1
            r6.z(r7, r8, r9, r10, r11)
            goto L7e
        L7b:
            r10.V()
        L7e:
            sf.n r1 = sf.n.f12433a
            return r1
        L81:
            java.lang.Object r1 = r0.f16260l
            wb.rt r1 = (wb.rt) r1
            java.lang.Object r2 = r0.f16258j
            fg.l r2 = (fg.l) r2
            sf.b r3 = r0.f16259k
            fg.l r3 = (fg.l) r3
            r4 = r30
            r.d r4 = (r.d) r4
            r9 = r31
            i0.h0 r9 = (i0.h0) r9
            r5 = r32
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r4 = r5 & 17
            r6 = 16
            r7 = 0
            r8 = 1
            if (r4 == r6) goto Laa
            r4 = r8
            goto Lab
        Laa:
            r4 = r7
        Lab:
            r5 = r5 & r8
            boolean r4 = r9.S(r5, r4)
            if (r4 == 0) goto L21b
            int r4 = r0.f16257i
            if (r4 <= 0) goto Lc4
            r4 = -1433894678(0xffffffffaa8880ea, float:-2.4247905E-13)
            r9.a0(r4)
            r4 = 0
            wb.ho.D1(r4, r9, r7, r8)
        Lc0:
            r9.p(r7)
            goto Lcb
        Lc4:
            r4 = -1501048602(0xffffffffa687d0e6, float:-9.424129E-16)
            r9.a0(r4)
            goto Lc0
        Lcb:
            y0.l r4 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r4 = p.h1.d(r4, r5)
            r6 = 10
            float r6 = (float) r6
            r7 = 6
            float r7 = (float) r7
            r10 = 5
            float r10 = (float) r10
            y0.o r4 = p.d.o(r4, r6, r10, r7, r10)
            y0.f r6 = y0.b.f21802q
            p.c r7 = p.j.f9924a
            r10 = 48
            p.e1 r6 = p.d1.a(r7, r6, r9, r10)
            long r10 = r9.T
            int r7 = java.lang.Long.hashCode(r10)
            s0.h r10 = r9.l()
            y0.o r4 = y0.a.c(r9, r4)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r9.d0()
            boolean r12 = r9.S
            if (r12 == 0) goto L108
            r9.k(r11)
            goto L10b
        L108:
            r9.n0()
        L10b:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r9, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r9, r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r9, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r9)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r9, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            fb.a1 r6 = r1.f18958d
            if (r6 == 0) goto L136
            java.lang.String r6 = "引用 · "
            r4.append(r6)
        L136:
            java.lang.String r6 = r1.f18956b
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L14a
            java.util.List r6 = r1.f18957c
            int r6 = r6.size()
            java.lang.String r7 = " 个附件"
            java.lang.String r6 = p.a.i(r6, r7)
        L14a:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r9.j(r6)
            bi.b r6 = (bi.b) r6
            long r6 = r6.h()
            r10 = 12
            long r10 = x6.d.D(r10)
            double r12 = (double) r5
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L16c
        L16a:
            r12 = r6
            goto L172
        L16c:
            java.lang.String r12 = "invalid weight; must be greater than zero"
            q.a.a(r12)
            goto L16a
        L172:
            p.q0 r6 = new p.q0
            r6.<init>(r5, r8)
            r26 = 24960(0x6180, float:3.4976E-41)
            r27 = 241640(0x3afe8, float:3.3861E-40)
            r24 = r9
            r9 = r10
            r11 = 0
            r5 = r8
            r7 = r12
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
            r28 = r5
            r5 = r4
            r4 = r28
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r24
            wb.y2 r5 = wb.y2.f20289n
            m1.f r6 = wb.ap.f15077r
            fg.l r7 = r0.f16256h
            boolean r8 = r9.f(r7)
            boolean r10 = r9.h(r1)
            r8 = r8 | r10
            java.lang.Object r10 = r9.P()
            i0.e r11 = i0.l.f5952a
            if (r8 != 0) goto L1b9
            if (r10 != r11) goto L1c2
        L1b9:
            wb.is r10 = new wb.is
            r8 = 0
            r10.<init>(r7, r1, r8)
            r9.k0(r10)
        L1c2:
            r8 = r10
            fg.a r8 = (fg.a) r8
            r10 = 3126(0xc36, float:4.38E-42)
            java.lang.String r7 = "编辑待发送消息"
            r5.h0(r6, r7, r8, r9, r10)
            m1.f r6 = wb.ap.f15071l
            boolean r7 = r9.f(r2)
            boolean r8 = r9.h(r1)
            r7 = r7 | r8
            java.lang.Object r8 = r9.P()
            if (r7 != 0) goto L1df
            if (r8 != r11) goto L1e8
        L1df:
            wb.is r8 = new wb.is
            r7 = 1
            r8.<init>(r2, r1, r7)
            r9.k0(r8)
        L1e8:
            fg.a r8 = (fg.a) r8
            r10 = 3126(0xc36, float:4.38E-42)
            java.lang.String r7 = "立即发送"
            r5.h0(r6, r7, r8, r9, r10)
            m1.f r6 = wb.ap.f15078s
            boolean r2 = r9.f(r3)
            boolean r7 = r9.h(r1)
            r2 = r2 | r7
            java.lang.Object r7 = r9.P()
            if (r2 != 0) goto L204
            if (r7 != r11) goto L20d
        L204:
            wb.is r7 = new wb.is
            r2 = 2
            r7.<init>(r3, r1, r2)
            r9.k0(r7)
        L20d:
            r8 = r7
            fg.a r8 = (fg.a) r8
            r10 = 3126(0xc36, float:4.38E-42)
            java.lang.String r7 = "删除待发送消息"
            r5.h0(r6, r7, r8, r9, r10)
            r9.p(r4)
            goto L21e
        L21b:
            r9.V()
        L21e:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
