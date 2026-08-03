package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5488l;

    public /* synthetic */ w(int r2, android.app.Activity r3, b.e r4, hb.i0 r5, java.util.List r6) {
            r1 = this;
            r0 = 0
            r1.f5483g = r0
            r1.<init>()
            r1.f5485i = r5
            r1.f5486j = r3
            r1.f5487k = r6
            r1.f5484h = r2
            r1.f5488l = r4
            return
    }

    public /* synthetic */ w(int r2, fg.l r3, qg.t r4, i0.g1 r5, i.c r6) {
            r1 = this;
            r0 = 2
            r1.f5483g = r0
            r1.<init>()
            r1.f5484h = r2
            r1.f5485i = r3
            r1.f5486j = r4
            r1.f5487k = r5
            r1.f5488l = r6
            return
    }

    public /* synthetic */ w(v1.b1[] r2, p.t r3, int r4, v1.p0 r5, int[] r6) {
            r1 = this;
            r0 = 1
            r1.f5483g = r0
            r1.<init>()
            r1.f5485i = r2
            r1.f5486j = r3
            r1.f5484h = r4
            r1.f5487k = r5
            r1.f5488l = r6
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f5483g
            switch(r0) {
                case 0: goto La4;
                case 1: goto L50;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f5485i
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r13.f5486j
            qg.t r1 = (qg.t) r1
            java.lang.Object r2 = r13.f5487k
            i0.g1 r2 = (i0.g1) r2
            java.lang.Object r3 = r13.f5488l
            i.c r3 = (i.c) r3
            xb.i r14 = (xb.i) r14
            r14.getClass()
            float r4 = r14.b()
            int r4 = java.lang.Math.round(r4)
            int r5 = r13.f5484h
            int r5 = r5 + (-1)
            if (r4 >= 0) goto L29
            r4 = 0
        L29:
            if (r4 <= r5) goto L2c
            goto L2d
        L2c:
            r5 = r4
        L2d:
            r2.h(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0.invoke(r2)
            float r0 = (float) r5
            qg.t r2 = r14.f21482a
            i.i1 r4 = new i.i1
            r5 = 0
            r4.<init>(r14, r0, r5)
            r14 = 3
            qg.v.q(r2, r5, r4, r14)
            wb.n3 r0 = new wb.n3
            r2 = 0
            r0.<init>(r3, r5, r2)
            qg.v.q(r1, r5, r0, r14)
        L4d:
            sf.n r14 = sf.n.f12433a
            return r14
        L50:
            java.lang.Object r0 = r13.f5485i
            v1.b1[] r0 = (v1.b1[]) r0
            java.lang.Object r1 = r13.f5486j
            p.t r1 = (p.t) r1
            java.lang.Object r2 = r13.f5487k
            v1.p0 r2 = (v1.p0) r2
            java.lang.Object r3 = r13.f5488l
            int[] r3 = (int[]) r3
            v1.a1 r14 = (v1.a1) r14
            int r4 = r0.length
            r5 = 0
            r6 = r5
        L65:
            if (r5 >= r4) goto La1
            r7 = r0[r5]
            int r8 = r6 + 1
            r7.getClass()
            java.lang.Object r9 = r7.X()
            boolean r10 = r9 instanceof p.c1
            r11 = 0
            if (r10 == 0) goto L7a
            p.c1 r9 = (p.c1) r9
            goto L7b
        L7a:
            r9 = r11
        L7b:
            u2.m r10 = r2.getLayoutDirection()
            if (r9 == 0) goto L83
            p.x r11 = r9.f9871c
        L83:
            int r9 = r13.f5484h
            if (r11 == 0) goto L90
            int r10 = r7.f13900g
            y0.f r11 = r11.f10035a
            int r9 = r11.a(r10, r9)
            goto L98
        L90:
            y0.e r11 = r1.f10009b
            int r12 = r7.f13900g
            int r9 = r11.a(r12, r9, r10)
        L98:
            r6 = r3[r6]
            v1.a1.B(r14, r7, r9, r6)
            int r5 = r5 + 1
            r6 = r8
            goto L65
        La1:
            sf.n r14 = sf.n.f12433a
            return r14
        La4:
            java.lang.Object r0 = r13.f5485i
            r2 = r0
            hb.i0 r2 = (hb.i0) r2
            java.lang.Object r0 = r13.f5486j
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r0 = r13.f5487k
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r13.f5488l
            r7 = r0
            b.e r7 = (b.e) r7
            r5 = r14
            java.util.List r5 = (java.util.List) r5
            r5.getClass()
            java.util.Calendar r14 = java.util.Calendar.getInstance()
            r0 = 12
            r1 = 5
            r14.add(r0, r1)
            long r9 = r14.getTimeInMillis()
            c9.c0 r1 = new c9.c0
            r8 = 1
            int r6 = r13.f5484h
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2.getClass()
            sf.e r14 = new sf.e
            java.lang.String r0 = "单次"
            java.lang.String r4 = ""
            r14.<init>(r0, r4)
            sf.e r0 = new sf.e
            java.lang.String r5 = "每天"
            r0.<init>(r5, r4)
            sf.e r5 = new sf.e
            java.lang.String r6 = "每周"
            r5.<init>(r6, r4)
            sf.e[] r14 = new sf.e[]{r14, r0, r5}
            java.util.List r14 = a.a.y0(r14)
            hb.c0 r7 = new hb.c0
            r4 = r3
            r5 = r9
            r3 = r2
            r2 = r1
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            r3 = r4
            k.s1 r8 = new k.s1
            r0 = 7
            r8.<init>(r0)
            wb.lv r9 = wb.lv.f17583j
            java.lang.String r4 = "选择重复方式"
            java.lang.String r5 = ""
            r6 = r14
            wb.y2.Q1(r3, r4, r5, r6, r7, r8, r9)
            goto L4d
    }
}
