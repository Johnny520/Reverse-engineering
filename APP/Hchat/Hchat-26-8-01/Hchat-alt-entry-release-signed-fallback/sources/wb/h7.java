package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16507u;

    public /* synthetic */ h7(android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r1 = this;
            r0 = 0
            r1.f16493g = r0
            r1.<init>()
            r1.f16497k = r15
            r1.f16502p = r2
            r1.f16503q = r3
            r1.f16504r = r12
            r1.f16505s = r13
            r1.f16494h = r4
            r1.f16495i = r5
            r1.f16496j = r6
            r1.f16506t = r14
            r1.f16498l = r7
            r1.f16499m = r8
            r1.f16500n = r9
            r1.f16501o = r10
            r1.f16507u = r11
            return
    }

    public /* synthetic */ h7(java.util.Set r2, sh.x r3, r.z r4, wb.v0 r5, i0.a1 r6, i0.a1 r7, java.util.List r8, i0.a1 r9, boolean r10, java.util.List r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15) {
            r1 = this;
            r0 = 1
            r1.f16493g = r0
            r1.<init>()
            r1.f16502p = r2
            r1.f16503q = r3
            r1.f16504r = r4
            r1.f16505s = r5
            r1.f16494h = r6
            r1.f16495i = r7
            r1.f16506t = r8
            r1.f16496j = r9
            r1.f16497k = r10
            r1.f16507u = r11
            r1.f16498l = r12
            r1.f16499m = r13
            r1.f16500n = r14
            r1.f16501o = r15
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
            r20 = this;
            r0 = r20
            int r1 = r0.f16493g
            switch(r1) {
                case 0: goto L200;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f16502p
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r2 = r0.f16503q
            sh.x r2 = (sh.x) r2
            java.lang.Object r3 = r0.f16504r
            r5 = r3
            r.z r5 = (r.z) r5
            java.lang.Object r3 = r0.f16505s
            r7 = r3
            wb.v0 r7 = (wb.v0) r7
            java.lang.Object r3 = r0.f16506t
            r13 = r3
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r3 = r0.f16507u
            r9 = r3
            java.util.List r9 = (java.util.List) r9
            r3 = r21
            p.x0 r3 = (p.x0) r3
            r4 = r22
            i0.h0 r4 = (i0.h0) r4
            r6 = r23
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.getClass()
            r8 = r6 & 6
            if (r8 != 0) goto L44
            boolean r8 = r4.f(r3)
            if (r8 == 0) goto L42
            r8 = 4
            goto L43
        L42:
            r8 = 2
        L43:
            r6 = r6 | r8
        L44:
            r8 = r6 & 19
            r12 = 18
            r15 = 1
            if (r8 == r12) goto L4d
            r8 = r15
            goto L4e
        L4d:
            r8 = 0
        L4e:
            r6 = r6 & r15
            boolean r6 = r4.S(r6, r8)
            if (r6 == 0) goto L1f9
            i0.a1 r12 = r0.f16495i
            java.lang.Object r6 = r12.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r6 = j8.b.l(r8, r6, r8)
            i0.a1 r8 = r0.f16501o
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r8 = r8.iterator()
        L7c:
            boolean r16 = r8.hasNext()
            i0.a1 r10 = r0.f16494h
            i0.a1 r11 = r0.f16496j
            if (r16 == 0) goto Lfa
            java.lang.Object r15 = r8.next()
            r17 = r3
            r3 = r15
            wb.s0 r3 = (wb.s0) r3
            java.lang.Object r10 = r10.getValue()
            wb.t0 r10 = (wb.t0) r10
            int r10 = r10.ordinal()
            if (r10 == 0) goto Le3
            r19 = r5
            r5 = 1
            if (r10 == r5) goto Ldf
            r5 = 2
            if (r10 == r5) goto Ldb
            r5 = 3
            if (r10 == r5) goto Lb1
            r5 = 4
            if (r10 != r5) goto Lab
        La9:
            r3 = 1
            goto Lef
        Lab:
            okio.a.k()
            r1 = 0
            goto L1ff
        Lb1:
            r5 = 4
            boolean r10 = r7.f19588f
            if (r10 == 0) goto Ld9
            java.lang.Object r10 = r11.getValue()
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = og.m.t0(r10)
            if (r10 != 0) goto Ld9
            boolean r10 = r3.f18972c
            if (r10 != 0) goto Ld9
            boolean r10 = r3.f18976g
            if (r10 != 0) goto Ld9
            java.util.List r3 = r3.f18975f
            java.lang.Object r10 = r11.getValue()
            java.lang.String r10 = (java.lang.String) r10
            boolean r3 = r3.contains(r10)
            if (r3 == 0) goto Ld9
            goto La9
        Ld9:
            r3 = 0
            goto Lef
        Ldb:
            r5 = 4
            boolean r3 = r3.f18976g
            goto Lef
        Ldf:
            r5 = 4
            boolean r3 = r3.f18972c
            goto Lef
        Le3:
            r19 = r5
            r5 = 4
            boolean r10 = r3.f18972c
            if (r10 != 0) goto Ld9
            boolean r3 = r3.f18976g
            if (r3 != 0) goto Ld9
            goto La9
        Lef:
            if (r3 == 0) goto Lf4
            r14.add(r15)
        Lf4:
            r3 = r17
            r5 = r19
            r15 = 1
            goto L7c
        Lfa:
            r17 = r3
            r19 = r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r14.iterator()
        L107:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L11e
            java.lang.Object r8 = r5.next()
            r14 = r8
            wb.s0 r14 = (wb.s0) r14
            boolean r14 = wb.ho.i6(r14, r6)
            if (r14 == 0) goto L107
            r3.add(r8)
            goto L107
        L11e:
            boolean r5 = r4.h(r1)
            java.lang.Object r6 = r4.P()
            i0.e r8 = i0.l.f5952a
            if (r5 != 0) goto L12c
            if (r6 != r8) goto L135
        L12c:
            ia.p r6 = new ia.p
            r5 = 3
            r6.<init>(r1, r5)
            r4.k0(r6)
        L135:
            fg.l r6 = (fg.l) r6
            java.util.ArrayList r1 = wb.ho.f7(r6, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r1)
            r3.<init>(r5)
            java.util.Iterator r5 = r1.iterator()
        L148:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L15a
            java.lang.Object r6 = r5.next()
            wb.s0 r6 = (wb.s0) r6
            java.lang.String r6 = r6.f18970a
            r3.add(r6)
            goto L148
        L15a:
            java.util.Set r3 = tf.m.U1(r3)
            p.a0 r5 = p.h1.f9915c
            m.a r2 = r2.f12897e
            r6 = 0
            y0.o r2 = r1.f.a(r5, r2, r6)
            float r5 = r17.c()
            r6 = 8
            float r6 = (float) r6
            float r5 = r5 + r6
            float r6 = r17.a()
            r14 = 84
            float r14 = (float) r14
            float r6 = r6 + r14
            r14 = 5
            p.z0 r5 = p.d.b(r5, r6, r14)
            boolean r6 = r4.f(r7)
            boolean r14 = r4.f(r10)
            r6 = r6 | r14
            boolean r14 = r4.f(r12)
            r6 = r6 | r14
            boolean r14 = r4.h(r13)
            r6 = r6 | r14
            boolean r14 = r4.f(r11)
            r6 = r6 | r14
            boolean r14 = r0.f16497k
            boolean r15 = r4.g(r14)
            r6 = r6 | r15
            boolean r15 = r4.h(r9)
            r6 = r6 | r15
            i0.a1 r15 = r0.f16498l
            boolean r16 = r4.f(r15)
            r6 = r6 | r16
            boolean r16 = r4.h(r3)
            r6 = r6 | r16
            r21 = r2
            i0.a1 r2 = r0.f16499m
            boolean r16 = r4.f(r2)
            r6 = r6 | r16
            r17 = r2
            i0.a1 r2 = r0.f16500n
            boolean r16 = r4.f(r2)
            r6 = r6 | r16
            boolean r16 = r4.h(r1)
            r6 = r6 | r16
            r22 = r1
            java.lang.Object r1 = r4.P()
            if (r6 != 0) goto L1d2
            if (r1 != r8) goto L1e4
        L1d2:
            sh.w0 r6 = new sh.w0
            r18 = r2
            r16 = r3
            r8 = r14
            r14 = r11
            r11 = r10
            r10 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.k0(r6)
            r1 = r6
        L1e4:
            r12 = r1
            fg.l r12 = (fg.l) r12
            r14 = 0
            r15 = 504(0x1f8, float:7.06E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = r4
            r6 = r5
            r5 = r19
            r4 = r21
            a.a.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L1fd
        L1f9:
            r13 = r4
            r13.V()
        L1fd:
            sf.n r1 = sf.n.f12433a
        L1ff:
            return r1
        L200:
            java.lang.Object r1 = r0.f16502p
            r3 = r1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r0.f16503q
            r4 = r1
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.Object r1 = r0.f16504r
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r0.f16505s
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = r0.f16506t
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r1 = r0.f16507u
            r12 = r1
            i0.a1 r12 = (i0.a1) r12
            r1 = r21
            r.d r1 = (r.d) r1
            r2 = r22
            i0.h0 r2 = (i0.h0) r2
            r5 = r23
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.getClass()
            r1 = r5 & 17
            r6 = 16
            r7 = 1
            if (r1 == r6) goto L23a
            r1 = r7
            goto L23b
        L23a:
            r1 = 0
        L23b:
            r5 = r5 & r7
            boolean r1 = r2.S(r5, r1)
            if (r1 == 0) goto L274
            r1 = r2
            wb.l6 r2 = new wb.l6
            i0.a1 r5 = r0.f16494h
            i0.a1 r6 = r0.f16495i
            r8 = r7
            i0.a1 r7 = r0.f16496j
            r9 = r8
            i0.a1 r8 = r0.f16498l
            r10 = r9
            i0.a1 r9 = r0.f16499m
            r11 = r10
            i0.a1 r10 = r0.f16500n
            r16 = r11
            i0.a1 r11 = r0.f16501o
            r21 = r1
            boolean r1 = r0.f16497k
            r0 = r16
            r16 = r1
            r1 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = -219632320(0xfffffffff2e8ad40, float:-9.217276E30)
            s0.d r2 = s0.i.e(r3, r2, r1)
            r3 = 48
            r4 = 0
            wb.ho.C3(r4, r2, r1, r3, r0)
            goto L278
        L274:
            r1 = r2
            r1.V()
        L278:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
