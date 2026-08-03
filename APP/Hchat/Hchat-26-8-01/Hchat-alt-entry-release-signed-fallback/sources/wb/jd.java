package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f17018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f17020j;

    public /* synthetic */ jd(android.content.Context r1, java.lang.String r2, fg.a r3, int r4) {
            r0 = this;
            r4 = 1
            r0.f17017g = r4
            r0.<init>()
            r0.f17018h = r1
            r0.f17019i = r2
            r0.f17020j = r3
            return
    }

    public /* synthetic */ jd(java.lang.String r2, android.content.Context r3, fg.a r4) {
            r1 = this;
            r0 = 0
            r1.f17017g = r0
            r1.<init>()
            r1.f17019i = r2
            r1.f17018h = r3
            r1.f17020j = r4
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34) {
            r32 = this;
            r0 = r32
            int r1 = r0.f17017g
            switch(r1) {
                case 0: goto L24;
                default: goto L7;
            }
        L7:
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            r2 = 3121(0xc31, float:4.373E-42)
            int r2 = i0.r.C(r2)
            android.content.Context r3 = r0.f17018h
            java.lang.String r4 = r0.f17019i
            fg.a r5 = r0.f17020j
            wb.ho.q3(r3, r4, r5, r1, r2)
            sf.n r1 = sf.n.f12433a
            return r1
        L24:
            r11 = r33
            i0.h0 r11 = (i0.h0) r11
            r1 = r34
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L39
            r2 = r5
            goto L3a
        L39:
            r2 = r4
        L3a:
            r1 = r1 & r5
            boolean r1 = r11.S(r1, r2)
            if (r1 == 0) goto L186
            p.e r1 = p.j.f9926c
            y0.e r2 = y0.b.f21804s
            p.t r1 = p.s.a(r1, r2, r11, r4)
            long r2 = r11.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r11.l()
            y0.l r4 = y0.l.f21818a
            y0.o r6 = y0.a.c(r11, r4)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r11.d0()
            boolean r8 = r11.S
            if (r8 == 0) goto L6b
            r11.k(r7)
            goto L6e
        L6b:
            r11.n0()
        L6e:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r11, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r11, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r11, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r11)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r11, r6)
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r2 = r11.j(r1)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r6 = 13
            long r6 = x6.d.D(r6)
            r8 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r4, r8)
            r10 = 8
            float r10 = (float) r10
            r12 = 0
            y0.o r9 = p.d.n(r9, r12, r10, r5)
            v.d r12 = v.e.a(r10)
            y0.o r9 = c1.h.b(r9, r12)
            java.lang.Object r1 = r11.j(r1)
            bi.b r1 = (bi.b) r1
            long r12 = r1.n()
            f1.m0 r1 = f1.c0.f3038b
            y0.o r1 = k.n.g(r9, r12, r1)
            r9 = 12
            float r9 = (float) r9
            r12 = 10
            float r12 = (float) r12
            y0.o r1 = p.d.m(r1, r9, r12)
            r23 = 0
            r24 = 262120(0x3ffe8, float:3.67308E-40)
            r12 = r4
            r30 = r2
            r3 = r5
            r4 = r30
            java.lang.String r2 = r0.f17019i
            r13 = r8
            r8 = 0
            r14 = r9
            r9 = 0
            r15 = r10
            r21 = r11
            r10 = 0
            r16 = r12
            r12 = 0
            r18 = r13
            r17 = r14
            r13 = 0
            r19 = r15
            r15 = 0
            r20 = r16
            r16 = 0
            r22 = r17
            r17 = 0
            r25 = r18
            r18 = 0
            r26 = r19
            r19 = 0
            r27 = r20
            r20 = 0
            r28 = r22
            r22 = 24576(0x6000, float:3.4438E-41)
            r3 = r1
            r1 = r25
            r29 = r27
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11 = r21
            android.content.Context r3 = r0.f17018h
            boolean r4 = r11.h(r3)
            boolean r5 = r11.f(r2)
            r4 = r4 | r5
            fg.a r5 = r0.f17020j
            boolean r6 = r11.f(r5)
            r4 = r4 | r6
            java.lang.Object r6 = r11.P()
            if (r4 != 0) goto L12d
            i0.e r4 = i0.l.f5952a
            if (r6 != r4) goto L137
        L12d:
            ab.e r6 = new ab.e
            r4 = 23
            r6.<init>(r3, r2, r5, r4)
            r11.k0(r6)
        L137:
            r3 = r6
            fg.a r3 = (fg.a) r3
            r2 = r29
            y0.o r12 = p.h1.d(r2, r1)
            r16 = 0
            r17 = 13
            r13 = 0
            r15 = 0
            r14 = r28
            y0.o r4 = p.d.p(r12, r13, r14, r15, r16, r17)
            sh.q1 r9 = sh.c.a(r11)
            r12 = 390(0x186, float:5.47E-43)
            r13 = 1912(0x778, float:2.679E-42)
            java.lang.String r2 = "复制路径"
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r14 = r10
            r10 = 0
            r18 = r14
            r14 = r29
            sh.s.o(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            y0.o r12 = p.h1.d(r14, r1)
            r13 = 0
            r14 = r26
            y0.o r4 = p.d.p(r12, r13, r14, r15, r16, r17)
            sh.q1 r9 = sh.c.a(r11)
            r12 = 390(0x186, float:5.47E-43)
            r13 = 1912(0x778, float:2.679E-42)
            java.lang.String r2 = "关闭"
            r3 = r18
            sh.s.o(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 1
            r11.p(r3)
            goto L189
        L186:
            r11.V()
        L189:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
