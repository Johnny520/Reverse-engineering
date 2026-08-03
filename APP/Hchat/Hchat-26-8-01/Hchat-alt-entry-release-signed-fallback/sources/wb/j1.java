package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f16944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16951q;

    public /* synthetic */ j1(java.util.List r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, fg.l r7, java.util.List r8, fg.a r9, java.util.Set r10, boolean r11) {
            r1 = this;
            r0 = 1
            r1.f16941g = r0
            r1.<init>()
            r1.f16946l = r2
            r1.f16947m = r3
            r1.f16942h = r4
            r1.f16943i = r5
            r1.f16948n = r6
            r1.f16944j = r7
            r1.f16949o = r8
            r1.f16950p = r9
            r1.f16951q = r10
            r1.f16945k = r11
            return
    }

    public /* synthetic */ j1(sh.x r2, r.z r3, i0.a1 r4, java.lang.String r5, fg.l r6, c9.a r7, c9.a r8, fg.l r9, boolean r10, i0.a1 r11) {
            r1 = this;
            r0 = 0
            r1.f16941g = r0
            r1.<init>()
            r1.f16946l = r2
            r1.f16947m = r3
            r1.f16942h = r4
            r1.f16948n = r5
            r1.f16944j = r6
            r1.f16950p = r7
            r1.f16951q = r8
            r1.f16949o = r9
            r1.f16945k = r10
            r1.f16943i = r11
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r19 = this;
            r0 = r19
            int r1 = r0.f16941g
            switch(r1) {
                case 0: goto Lef;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f16946l
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r0.f16947m
            r4 = r1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r1 = r0.f16948n
            r8 = r1
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r1 = r0.f16949o
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r1 = r0.f16950p
            r13 = r1
            fg.a r13 = (fg.a) r13
            java.lang.Object r1 = r0.f16951q
            java.util.Set r1 = (java.util.Set) r1
            r2 = r20
            th.a r2 = (th.a) r2
            r10 = r21
            i0.h0 r10 = (i0.h0) r10
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.getClass()
            r2 = r5 & 17
            r6 = 16
            r7 = 1
            r11 = 0
            if (r2 == r6) goto L41
            r2 = r7
            goto L42
        L41:
            r2 = r11
        L42:
            r5 = r5 & r7
            boolean r2 = r10.S(r5, r2)
            if (r2 == 0) goto Le7
            boolean r2 = r10.h(r3)
            boolean r5 = r10.h(r4)
            r2 = r2 | r5
            i0.a1 r6 = r0.f16942h
            boolean r5 = r10.f(r6)
            r2 = r2 | r5
            i0.a1 r7 = r0.f16943i
            boolean r5 = r10.f(r7)
            r2 = r2 | r5
            boolean r5 = r10.f(r8)
            r2 = r2 | r5
            fg.l r5 = r0.f16944j
            boolean r12 = r10.f(r5)
            r2 = r2 | r12
            boolean r12 = r10.h(r9)
            r2 = r2 | r12
            java.lang.Object r12 = r10.P()
            i0.e r14 = i0.l.f5952a
            if (r2 != 0) goto L7b
            if (r12 != r14) goto L84
        L7b:
            wb.n7 r2 = new wb.n7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.k0(r2)
            r12 = r2
        L84:
            fg.a r12 = (fg.a) r12
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r3 = r2.isEmpty()
            boolean r4 = r0.f16945k
            r5 = 0
            if (r3 != 0) goto L9a
            if (r4 == 0) goto L97
            java.lang.String r3 = "取消全选"
            goto L9b
        L97:
            java.lang.String r3 = "全选"
            goto L9b
        L9a:
            r3 = r5
        L9b:
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lcd
            r2 = 1287576103(0x4cbeda27, float:1.00061496E8)
            r10.a0(r2)
            boolean r2 = r10.f(r7)
            boolean r5 = r10.g(r4)
            r2 = r2 | r5
            boolean r5 = r10.h(r1)
            r2 = r2 | r5
            java.lang.Object r5 = r10.P()
            if (r2 != 0) goto Lbd
            if (r5 != r14) goto Lc6
        Lbd:
            wb.p1 r5 = new wb.p1
            r2 = 5
            r5.<init>(r4, r1, r7, r2)
            r10.k0(r5)
        Lc6:
            fg.a r5 = (fg.a) r5
            r10.p(r11)
        Lcb:
            r15 = r5
            goto Ld7
        Lcd:
            r1 = 1287872680(0x4cc360a8, float:1.0243411E8)
            r10.a0(r1)
            r10.p(r11)
            goto Lcb
        Ld7:
            r17 = 390(0x186, float:5.47E-43)
            r18 = 0
            r16 = r10
            java.lang.String r10 = "套用模板"
            r11 = r12
            java.lang.String r12 = "返回"
            r14 = r3
            wb.ho.M(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto Lec
        Le7:
            r16 = r10
            r16.V()
        Lec:
            sf.n r1 = sf.n.f12433a
            return r1
        Lef:
            java.lang.Object r1 = r0.f16946l
            sh.x r1 = (sh.x) r1
            java.lang.Object r2 = r0.f16947m
            r4 = r2
            r.z r4 = (r.z) r4
            java.lang.Object r2 = r0.f16948n
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.f16950p
            r10 = r2
            c9.a r10 = (c9.a) r10
            java.lang.Object r2 = r0.f16951q
            r11 = r2
            c9.a r11 = (c9.a) r11
            java.lang.Object r2 = r0.f16949o
            r12 = r2
            fg.l r12 = (fg.l) r12
            r2 = r20
            p.x0 r2 = (p.x0) r2
            r3 = r21
            i0.h0 r3 = (i0.h0) r3
            r5 = r22
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.getClass()
            r6 = r5 & 6
            if (r6 != 0) goto L12d
            boolean r6 = r3.f(r2)
            if (r6 == 0) goto L12b
            r6 = 4
            goto L12c
        L12b:
            r6 = 2
        L12c:
            r5 = r5 | r6
        L12d:
            r6 = r5 & 19
            r7 = 18
            r9 = 1
            if (r6 == r7) goto L136
            r6 = r9
            goto L137
        L136:
            r6 = 0
        L137:
            r5 = r5 & r9
            boolean r5 = r3.S(r5, r6)
            if (r5 == 0) goto L1b0
            p.a0 r5 = p.h1.f9915c
            m.a r1 = r1.f12897e
            r6 = 0
            y0.o r1 = r1.f.a(r5, r1, r6)
            float r5 = r2.c()
            r6 = 8
            float r6 = (float) r6
            float r5 = r5 + r6
            float r2 = r2.a()
            r6 = 84
            float r6 = (float) r6
            float r2 = r2 + r6
            r6 = 5
            p.z0 r2 = p.d.b(r5, r2, r6)
            i0.a1 r7 = r0.f16942h
            boolean r5 = r3.f(r7)
            boolean r6 = r3.f(r8)
            r5 = r5 | r6
            fg.l r9 = r0.f16944j
            boolean r6 = r3.f(r9)
            r5 = r5 | r6
            boolean r6 = r3.h(r10)
            r5 = r5 | r6
            boolean r6 = r3.h(r11)
            r5 = r5 | r6
            boolean r6 = r3.f(r12)
            r5 = r5 | r6
            boolean r6 = r0.f16945k
            boolean r13 = r3.g(r6)
            r5 = r5 | r13
            i0.a1 r13 = r0.f16943i
            boolean r14 = r3.f(r13)
            r5 = r5 | r14
            java.lang.Object r14 = r3.P()
            if (r5 != 0) goto L195
            i0.e r5 = i0.l.f5952a
            if (r14 != r5) goto L19e
        L195:
            ia.n r5 = new ia.n
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r3.k0(r5)
            r14 = r5
        L19e:
            r11 = r14
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r2
            r12 = r3
            r3 = r1
            a.a.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L1b4
        L1b0:
            r12 = r3
            r12.V()
        L1b4:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
