package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gg.q f8217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gg.q f8218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gg.r f8222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg.u f8223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gg.u f8224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f8225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m.l1 f8226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f8227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m.o2 f8228s;

    public j1(gg.r r1, gg.u r2, gg.u r3, float r4, m.l1 r5, float r6, m.o2 r7, wf.c r8) {
            r0 = this;
            r0.f8222m = r1
            r0.f8223n = r2
            r0.f8224o = r3
            r0.f8225p = r4
            r0.f8226q = r5
            r0.f8227r = r6
            r0.f8228s = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r10, wf.c r11) {
            r9 = this;
            m.j1 r0 = new m.j1
            float r6 = r9.f8227r
            m.o2 r7 = r9.f8228s
            gg.r r1 = r9.f8222m
            gg.u r2 = r9.f8223n
            gg.u r3 = r9.f8224o
            float r4 = r9.f8225p
            m.l1 r5 = r9.f8226q
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f8221l = r10
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            m.m2 r1 = (m.m2) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.j1 r1 = (m.j1) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            r21 = this;
            r7 = r21
            int r0 = r7.f8220k
            gg.u r1 = r7.f8224o
            gg.r r2 = r7.f8222m
            r15 = 3
            r6 = 2
            r3 = 1
            gg.u r4 = r7.f8223n
            xf.a r5 = xf.a.f21579g
            if (r0 == 0) goto L5d
            if (r0 == r3) goto L49
            if (r0 == r6) goto L33
            if (r0 != r15) goto L2c
            gg.q r0 = r7.f8218i
            gg.q r8 = r7.f8217h
            java.lang.Object r9 = r7.f8221l
            m.m2 r9 = (m.m2) r9
            f8.i.I0(r22)
            r13 = r5
            r11 = r6
            r12 = r9
            r9 = r3
            r3 = r8
            r8 = r0
            r0 = r22
            goto L17a
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L33:
            int r0 = r7.f8219j
            gg.q r8 = r7.f8217h
            java.lang.Object r9 = r7.f8221l
            m.m2 r9 = (m.m2) r9
            f8.i.I0(r22)
            r18 = r1
            r19 = r2
            r13 = r5
            r5 = r7
            r12 = r9
            r9 = r3
            r7 = r4
            goto L156
        L49:
            gg.q r0 = r7.f8218i
            gg.q r8 = r7.f8217h
            java.lang.Object r9 = r7.f8221l
            m.m2 r9 = (m.m2) r9
            f8.i.I0(r22)
            r14 = r0
            r13 = r5
            r11 = r6
            r12 = r9
            r0 = r22
            r9 = r3
            goto L1ad
        L5d:
            f8.i.I0(r22)
            java.lang.Object r0 = r7.f8221l
            m.m2 r0 = (m.m2) r0
            gg.q r8 = new gg.q
            r8.<init>()
            r8.f4560g = r3
        L6b:
            r13 = r8
        L6c:
            boolean r8 = r13.f4560g
            sf.n r16 = sf.n.f12433a
            if (r8 == 0) goto L1bd
            r8 = 0
            r13.f4560g = r8
            float r8 = r2.f4561g
            java.lang.Object r9 = r4.f4564g
            i.l r9 = (i.l) r9
            i0.j1 r9 = r9.f5719h
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r8 = r8 - r9
            java.lang.Object r9 = r1.f4564g
            m.h1 r9 = (m.h1) r9
            boolean r9 = r9.f8184c
            m.l1 r10 = r7.f8226q
            if (r9 != 0) goto L9c
            float r9 = java.lang.Math.abs(r8)
            float r11 = r7.f8225p
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto La3
        L9c:
            r12 = r0
            r9 = r3
            r11 = r6
            r14 = r13
            r13 = r5
            goto L194
        La3:
            float r8 = java.lang.Math.signum(r8)
            float r8 = r8 * r11
            r10.e(r0, r8)
            java.lang.Object r9 = r4.f4564g
            i.l r9 = (i.l) r9
            i0.j1 r10 = r9.f5719h
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r10 = r10 + r8
            i.l r8 = i.d.j(r9, r10)
            r4.f4564g = r8
            float r9 = r2.f4561g
            i0.j1 r8 = r8.f5719h
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r9 = r9 - r8
            float r8 = java.lang.Math.abs(r9)
            float r9 = r7.f8227r
            float r8 = r8 / r9
            int r8 = ig.a.X(r8)
            r9 = 100
            if (r8 <= r9) goto Le1
            r8 = r9
        Le1:
            java.lang.Object r9 = r4.f4564g
            i.l r9 = (i.l) r9
            float r10 = r2.f4561g
            r11 = r8
            eb.o r8 = new eb.o
            r14 = 3
            r12 = r9
            m.l1 r9 = r7.f8226q
            r17 = r12
            m.o2 r12 = r7.f8228s
            r3 = r10
            r10 = r1
            r1 = r11
            r11 = r2
            r2 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r18 = r13
            r13 = r8
            r8 = r18
            r18 = r10
            r19 = r11
            r7.f8221l = r0
            r7.f8217h = r8
            r10 = 0
            r7.f8218i = r10
            r7.f8219j = r1
            r7.f8220k = r6
            r9.getClass()
            gg.r r10 = new gg.r
            r10.<init>()
            i0.j1 r11 = r2.f5719h
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            r10.f4561g = r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r3)
            g1.d r3 = i.x.f5829b
            i.l1 r3 = i.d.p(r1, r6, r3)
            r12 = r11
            r11 = r9
            c9.k r9 = new c9.k
            r14 = 9
            r20 = r12
            r12 = r0
            r0 = r20
            r9.<init>(r10, r11, r12, r13, r14)
            r11 = r1
            r1 = r0
            r0 = r2
            r2 = r3
            r3 = 1
            r13 = r5
            r5 = r7
            r7 = r4
            r4 = r9
            r9 = 1
            java.lang.Object r0 = i.d.g(r0, r1, r2, r3, r4, r5)
            if (r0 != r13) goto L14f
            goto L151
        L14f:
            r0 = r16
        L151:
            if (r0 != r13) goto L155
            goto L1ab
        L155:
            r0 = r11
        L156:
            boolean r1 = r8.f4560g
            if (r1 != 0) goto L189
            r1 = 50
            long r3 = (long) r0
            long r1 = r1 - r3
            r5.f8221l = r12
            r5.f8217h = r8
            r5.f8218i = r8
            r5.f8220k = r15
            m.l1 r0 = r5.f8226q
            m.o2 r3 = r5.f8228s
            r11 = r6
            r4 = r7
            r7 = r5
            r5 = r1
            r1 = r18
            r2 = r19
            java.lang.Object r0 = m.l1.d(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r13) goto L179
            goto L1ab
        L179:
            r3 = r8
        L17a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.f4560g = r0
            r6 = r11
            r0 = r12
            r5 = r13
            r13 = r3
            r3 = r9
            goto L6c
        L189:
            r4 = r7
            r7 = r5
            r3 = r9
            r0 = r12
            r5 = r13
            r1 = r18
            r2 = r19
            goto L6b
        L194:
            r10.e(r12, r8)
            r7.f8221l = r12
            r7.f8217h = r14
            r7.f8218i = r14
            r7.f8220k = r9
            m.l1 r0 = r7.f8226q
            m.o2 r3 = r7.f8228s
            r5 = 50
            java.lang.Object r0 = m.l1.d(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r13) goto L1ac
        L1ab:
            return r13
        L1ac:
            r8 = r14
        L1ad:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14.f4560g = r0
            r7 = r21
            r3 = r9
            r6 = r11
            r0 = r12
            r5 = r13
            goto L6b
        L1bd:
            return r16
    }
}
