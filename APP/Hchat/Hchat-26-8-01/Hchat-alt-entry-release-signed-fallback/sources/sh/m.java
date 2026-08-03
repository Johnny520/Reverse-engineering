package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12705l;

    public /* synthetic */ m(java.lang.Object r1, java.lang.Object r2, sf.b r3, java.lang.Object r4, boolean r5, int r6) {
            r0 = this;
            r0.f12700g = r6
            r0.f12702i = r1
            r0.f12703j = r2
            r0.f12704k = r3
            r0.f12705l = r4
            r0.f12701h = r5
            r0.<init>()
            return
    }

    public /* synthetic */ m(java.lang.String r2, sh.a r3, boolean r4, java.lang.String r5, sh.a r6) {
            r1 = this;
            r0 = 0
            r1.f12700g = r0
            r1.<init>()
            r1.f12702i = r2
            r1.f12704k = r3
            r1.f12701h = r4
            r1.f12703j = r5
            r1.f12705l = r6
            return
    }

    public /* synthetic */ m(wb.t4 r2, boolean r3, fg.l r4, i0.a1 r5, i0.a1 r6) {
            r1 = this;
            r0 = 3
            r1.f12700g = r0
            r1.<init>()
            r1.f12702i = r2
            r1.f12701h = r3
            r1.f12703j = r4
            r1.f12704k = r5
            r1.f12705l = r6
            return
    }

    public /* synthetic */ m(boolean r2, fg.l r3, java.lang.String r4, fg.l r5, fg.a r6) {
            r1 = this;
            r0 = 4
            r1.f12700g = r0
            r1.<init>()
            r1.f12701h = r2
            r1.f12703j = r3
            r1.f12702i = r4
            r1.f12704k = r5
            r1.f12705l = r6
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
            r31 = this;
            r0 = r31
            int r1 = r0.f12700g
            switch(r1) {
                case 0: goto L1de;
                case 1: goto L127;
                case 2: goto Ld4;
                case 3: goto L5a;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f12703j
            r4 = r1
            fg.l r4 = (fg.l) r4
            java.lang.Object r1 = r0.f12702i
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.f12704k
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r0.f12705l
            r7 = r1
            fg.a r7 = (fg.a) r7
            r1 = r32
            r.d r1 = (r.d) r1
            r8 = r33
            i0.h0 r8 = (i0.h0) r8
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r3 = 16
            r9 = 1
            if (r1 == r3) goto L37
            r1 = r9
            goto L38
        L37:
            r1 = 0
        L38:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L54
            wb.ug r2 = new wb.ug
            boolean r3 = r0.f12701h
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = 1947538524(0x7415145c, float:4.724519E31)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto L57
        L54:
            r8.V()
        L57:
            sf.n r1 = sf.n.f12433a
            return r1
        L5a:
            java.lang.Object r1 = r0.f12702i
            r2 = r1
            wb.t4 r2 = (wb.t4) r2
            java.lang.Object r1 = r0.f12703j
            r6 = r1
            fg.l r6 = (fg.l) r6
            java.lang.Object r1 = r0.f12704k
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r3 = r0.f12705l
            i0.a1 r3 = (i0.a1) r3
            r5 = r32
            th.a r5 = (th.a) r5
            r7 = r33
            i0.h0 r7 = (i0.h0) r7
            r4 = r34
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.getClass()
            r8 = r4 & 6
            if (r8 != 0) goto L96
            r8 = r4 & 8
            if (r8 != 0) goto L8c
            boolean r8 = r7.f(r5)
            goto L90
        L8c:
            boolean r8 = r7.h(r5)
        L90:
            if (r8 == 0) goto L94
            r8 = 4
            goto L95
        L94:
            r8 = 2
        L95:
            r4 = r4 | r8
        L96:
            r8 = r4 & 19
            r9 = 18
            r10 = 0
            r11 = 1
            if (r8 == r9) goto La0
            r8 = r11
            goto La1
        La0:
            r8 = r10
        La1:
            r9 = r4 & 1
            boolean r8 = r7.S(r9, r8)
            if (r8 == 0) goto Lce
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r8 = r0.f12701h
            if (r8 == 0) goto Lc4
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lc4
            r10 = r11
        Lc4:
            int r3 = r4 << 9
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r1
            r4 = r10
            wb.ho.M1(r2, r3, r4, r5, r6, r7, r8)
            goto Ld1
        Lce:
            r7.V()
        Ld1:
            sf.n r1 = sf.n.f12433a
            return r1
        Ld4:
            java.lang.Object r1 = r0.f12702i
            r3 = r1
            db.c r3 = (db.c) r3
            java.lang.Object r1 = r0.f12703j
            r4 = r1
            fg.l r4 = (fg.l) r4
            java.lang.Object r1 = r0.f12704k
            r5 = r1
            fg.p r5 = (fg.p) r5
            java.lang.Object r1 = r0.f12705l
            r6 = r1
            fg.l r6 = (fg.l) r6
            r1 = r32
            r.d r1 = (r.d) r1
            r8 = r33
            i0.h0 r8 = (i0.h0) r8
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.getClass()
            r1 = r2 & 17
            r7 = 16
            r9 = 1
            if (r1 == r7) goto L104
            r1 = r9
            goto L105
        L104:
            r1 = 0
        L105:
            r2 = r2 & r9
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L121
            wb.nf r2 = new wb.nf
            boolean r7 = r0.f12701h
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -892622266(0xffffffffcacbaa46, float:-6673699.0)
            s0.d r1 = s0.i.e(r1, r2, r8)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r1, r8, r2, r9)
            goto L124
        L121:
            r8.V()
        L124:
            sf.n r1 = sf.n.f12433a
            return r1
        L127:
            java.lang.Object r1 = r0.f12702i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r0.f12703j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r0.f12704k
            r7 = r3
            fg.a r7 = (fg.a) r7
            java.lang.Object r3 = r0.f12705l
            java.util.Set r3 = (java.util.Set) r3
            r4 = r32
            th.a r4 = (th.a) r4
            r10 = r33
            i0.h0 r10 = (i0.h0) r10
            r5 = r34
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.getClass()
            r4 = r5 & 17
            r6 = 16
            r8 = 1
            r9 = 0
            if (r4 == r6) goto L155
            r4 = r8
            goto L156
        L155:
            r4 = r9
        L156:
            r5 = r5 & r8
            boolean r4 = r10.S(r5, r4)
            if (r4 == 0) goto L1d8
            boolean r4 = r10.f(r1)
            boolean r5 = r10.f(r2)
            r4 = r4 | r5
            java.lang.Object r5 = r10.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != 0) goto L170
            if (r5 != r6) goto L179
        L170:
            wb.o1 r5 = new wb.o1
            r4 = 0
            r5.<init>(r1, r2, r4)
            r10.k0(r5)
        L179:
            fg.a r5 = (fg.a) r5
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r4 = r1.isEmpty()
            boolean r8 = r0.f12701h
            r11 = 0
            if (r4 != 0) goto L18f
            if (r8 == 0) goto L18c
            java.lang.String r4 = "取消全选"
            goto L190
        L18c:
            java.lang.String r4 = "全选"
            goto L190
        L18f:
            r4 = r11
        L190:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1c2
            r1 = -2038101988(0xffffffff8685081c, float:-5.0040955E-35)
            r10.a0(r1)
            boolean r1 = r10.f(r2)
            boolean r11 = r10.g(r8)
            r1 = r1 | r11
            boolean r11 = r10.h(r3)
            r1 = r1 | r11
            java.lang.Object r11 = r10.P()
            if (r1 != 0) goto L1b2
            if (r11 != r6) goto L1bb
        L1b2:
            wb.p1 r11 = new wb.p1
            r1 = 0
            r11.<init>(r8, r3, r2, r1)
            r10.k0(r11)
        L1bb:
            fg.a r11 = (fg.a) r11
            r10.p(r9)
        L1c0:
            r9 = r11
            goto L1cc
        L1c2:
            r1 = -2037922933(0xffffffff8687c38b, float:-5.106868E-35)
            r10.a0(r1)
            r10.p(r9)
            goto L1c0
        L1cc:
            r11 = 390(0x186, float:5.47E-43)
            r12 = 0
            r8 = r4
            java.lang.String r4 = "保存选择"
            java.lang.String r6 = "返回"
            wb.ho.M(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L1db
        L1d8:
            r10.V()
        L1db:
            sf.n r1 = sf.n.f12433a
            return r1
        L1de:
            java.lang.Object r1 = r0.f12702i
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.f12704k
            sh.a r1 = (sh.a) r1
            java.lang.Object r3 = r0.f12703j
            r25 = r3
            java.lang.String r25 = (java.lang.String) r25
            java.lang.Object r3 = r0.f12705l
            sh.a r3 = (sh.a) r3
            r4 = r32
            p.u r4 = (p.u) r4
            r5 = r33
            i0.h0 r5 = (i0.h0) r5
            r6 = r34
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.getClass()
            r4 = r6 & 17
            r7 = 16
            r8 = 1
            r9 = 0
            if (r4 == r7) goto L20e
            r4 = r8
            goto L20f
        L20e:
            r4 = r9
        L20f:
            r6 = r6 & r8
            boolean r4 = r5.S(r6, r4)
            if (r4 == 0) goto L2d5
            r4 = -1158033922(0xffffffffbaf9cdfe, float:-0.0019058583)
            r5.a0(r4)
            i0.m2 r4 = bi.m.f920a
            java.lang.Object r6 = r5.j(r4)
            bi.l r6 = (bi.l) r6
            i0.j1 r6 = r6.f913h
            java.lang.Object r6 = r6.getValue()
            i2.n0 r6 = (i2.n0) r6
            i2.f0 r6 = r6.f6365a
            long r6 = r6.f6299b
            m2.k r8 = m2.k.f8698j
            boolean r10 = r0.f12701h
            if (r10 == 0) goto L239
            long r11 = r1.f12483a
            goto L23b
        L239:
            long r11 = r1.f12484b
        L23b:
            r23 = 0
            r24 = 262058(0x3ffaa, float:3.67221E-40)
            r1 = r3
            r3 = 0
            r13 = r9
            r9 = 0
            r21 = r5
            r14 = r10
            r29 = r11
            r12 = r4
            r4 = r29
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
            r26 = r19
            r19 = 0
            r27 = r20
            r20 = 0
            r28 = r22
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r27
            r27 = r1
            r1 = r0
            r0 = r28
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r21
            r2.p(r1)
            if (r25 == 0) goto L2cb
            r3 = -1157766578(0xffffffffbafde24e, float:-0.0019369812)
            r2.a0(r3)
            java.lang.Object r0 = r2.j(r0)
            bi.l r0 = (bi.l) r0
            i0.j1 r0 = r0.f909d
            java.lang.Object r0 = r0.getValue()
            i2.n0 r0 = (i2.n0) r0
            i2.f0 r0 = r0.f6365a
            long r8 = r0.f6299b
            r3 = r27
            if (r26 == 0) goto L2a4
            long r3 = r3.f12483a
        L2a0:
            r6 = r3
            r4 = r25
            goto L2a7
        L2a4:
            long r3 = r3.f12484b
            goto L2a0
        L2a7:
            r25 = 0
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r5 = 0
            r10 = 0
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
            r24 = 0
            r23 = r2
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.p(r1)
            goto L2d9
        L2cb:
            r0 = -1157594249(0xffffffffbb008377, float:-0.001960961)
            r2.a0(r0)
            r2.p(r1)
            goto L2d9
        L2d5:
            r2 = r5
            r2.V()
        L2d9:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
