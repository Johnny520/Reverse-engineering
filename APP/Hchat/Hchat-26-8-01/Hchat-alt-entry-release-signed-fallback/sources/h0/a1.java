package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f4803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4808o;

    public a1(h0.p r2, java.lang.String r3, long r4, i2.m0 r6, h0.d1 r7, b5.k r8, wf.c r9) {
            r1 = this;
            r0 = 0
            r1.f4801h = r0
            r1.f4804k = r2
            r1.f4805l = r3
            r1.f4803j = r4
            r1.f4806m = r6
            r1.f4807n = r7
            r1.f4808o = r8
            r2 = 2
            r1.<init>(r2, r9)
            return
    }

    public a1(m.g3 r2, m.k r3, m.f r4, long r5, qg.r0 r7, wf.c r8) {
            r1 = this;
            r0 = 1
            r1.f4801h = r0
            r1.f4805l = r2
            r1.f4806m = r3
            r1.f4807n = r4
            r1.f4803j = r5
            r1.f4808o = r7
            r2 = 2
            r1.<init>(r2, r8)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r12, wf.c r13) {
            r11 = this;
            int r0 = r11.f4801h
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            h0.a1 r1 = new h0.a1
            java.lang.Object r0 = r11.f4805l
            r2 = r0
            m.g3 r2 = (m.g3) r2
            java.lang.Object r0 = r11.f4806m
            r3 = r0
            m.k r3 = (m.k) r3
            java.lang.Object r0 = r11.f4807n
            r4 = r0
            m.f r4 = (m.f) r4
            java.lang.Object r0 = r11.f4808o
            r7 = r0
            qg.r0 r7 = (qg.r0) r7
            long r5 = r11.f4803j
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8)
            r1.f4804k = r12
            return r1
        L24:
            r8 = r13
            h0.a1 r2 = new h0.a1
            java.lang.Object r12 = r11.f4804k
            r3 = r12
            h0.p r3 = (h0.p) r3
            java.lang.Object r12 = r11.f4805l
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r12 = r11.f4806m
            r7 = r12
            i2.m0 r7 = (i2.m0) r7
            java.lang.Object r12 = r11.f4807n
            h0.d1 r12 = (h0.d1) r12
            java.lang.Object r13 = r11.f4808o
            r9 = r13
            b5.k r9 = (b5.k) r9
            long r5 = r11.f4803j
            r10 = r8
            r8 = r12
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4801h
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            m.m2 r2 = (m.m2) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            h0.a1 r2 = (h0.a1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            h0.a1 r2 = (h0.a1) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f4801h
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f4807n
            m.f r0 = (m.f) r0
            java.lang.Object r1 = r9.f4806m
            m.k r1 = (m.k) r1
            java.lang.Object r2 = r9.f4805l
            m.g3 r2 = (m.g3) r2
            int r3 = r9.f4802i
            r4 = 1
            if (r3 == 0) goto L23
            if (r3 != r4) goto L1c
            f8.i.I0(r10)
            goto L4e
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto L50
        L23:
            f8.i.I0(r10)
            java.lang.Object r10 = r9.f4804k
            m.m2 r10 = (m.m2) r10
            long r5 = r9.f4803j
            float r3 = m.k.k1(r1, r0, r5)
            r2.f8175e = r3
            java.lang.Object r3 = r9.f4808o
            qg.r0 r3 = (qg.r0) r3
            b0.s r5 = new b0.s
            r5.<init>(r1, r2, r3, r10)
            ab.e r10 = new ab.e
            r3 = 9
            r10.<init>(r1, r2, r0, r3)
            r9.f4802i = r4
            java.lang.Object r10 = r2.a(r5, r10, r9)
            xf.a r0 = xf.a.f21579g
            if (r10 != r0) goto L4e
            r10 = r0
            goto L50
        L4e:
            sf.n r10 = sf.n.f12433a
        L50:
            return r10
        L51:
            java.lang.Object r0 = r9.f4808o
            b5.k r0 = (b5.k) r0
            java.lang.Object r1 = r9.f4805l
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r9.f4807n
            h0.d1 r1 = (h0.d1) r1
            int r2 = r9.f4802i
            r4 = 1
            if (r2 == 0) goto L71
            if (r2 != r4) goto L69
            f8.i.I0(r10)
            goto La7
        L69:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto Lf8
        L71:
            f8.i.I0(r10)
            java.lang.Object r10 = r9.f4804k
            r6 = r10
            h0.p r6 = (h0.p) r6
            r9.f4802i = r4
            r6.getClass()
            int r10 = r3.length()
            r8 = 0
            if (r10 != 0) goto L86
            goto L8e
        L86:
            long r4 = r9.f4803j
            boolean r10 = i2.m0.c(r4)
            if (r10 == 0) goto L90
        L8e:
            r10 = r8
            goto La1
        L90:
            h0.o r2 = new h0.o
            r7 = 0
            r2.<init>(r3, r4, r6, r7)
            wf.g r10 = r6.f4960a
            ci.e r4 = new ci.e
            r4.<init>(r6, r2, r8)
            java.lang.Object r10 = qg.v.x(r10, r4, r9)
        La1:
            xf.a r2 = xf.a.f21579g
            if (r10 != r2) goto La7
        La5:
            r10 = r2
            goto Lf8
        La7:
            i2.m0 r10 = (i2.m0) r10
            sf.n r2 = sf.n.f12433a
            if (r10 == 0) goto La5
            long r4 = r10.f6360a
            r10 = 32
            long r6 = r4 >> r10
            int r10 = (int) r6
            r0.n(r10)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            r0.n(r4)
            long r4 = i2.e0.b(r10, r4)
            java.lang.Object r10 = r9.f4806m
            i2.m0 r10 = (i2.m0) r10
            boolean r10 = i2.m0.a(r10, r4)
            if (r10 != 0) goto La5
            n2.s r10 = r1.n()
            i2.g r10 = r10.f8976a
            java.lang.String r10 = r10.f6314h
            boolean r10 = gg.l.a(r10, r3)
            if (r10 == 0) goto La5
            b5.k r10 = r1.f4848b
            if (r0 != r10) goto La5
            fg.l r10 = r1.f4849c
            n2.s r0 = r1.n()
            i2.g r0 = r0.f8976a
            n2.s r0 = h0.d1.e(r0, r4)
            r10.invoke(r0)
            i2.m0 r10 = new i2.m0
            r10.<init>(r4)
            r1.f4868v = r10
            goto La5
        Lf8:
            return r10
    }
}
