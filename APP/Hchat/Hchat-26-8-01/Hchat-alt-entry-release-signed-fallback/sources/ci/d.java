package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f1680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1684n;

    public d(k.s1 r2, f0.h r3, b0.t r4, w.t0 r5, b0.d0 r6, wf.c r7) {
            r1 = this;
            r0 = 1
            r1.f1677g = r0
            r1.f1680j = r2
            r1.f1681k = r3
            r1.f1682l = r4
            r1.f1683m = r5
            r1.f1684n = r6
            r1.<init>(r7)
            return
    }

    public /* synthetic */ d(qg.t r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, wf.c r5, int r6) {
            r0 = this;
            r0.f1677g = r6
            r0.f1681k = r1
            r0.f1682l = r2
            r0.f1683m = r3
            r0.f1684n = r4
            r0.<init>(r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r10, wf.c r11) {
            r9 = this;
            int r0 = r9.f1677g
            switch(r0) {
                case 0: goto L46;
                case 1: goto L23;
                default: goto L5;
            }
        L5:
            ci.d r1 = new ci.d
            java.lang.Object r0 = r9.f1681k
            r2 = r0
            qg.t r2 = (qg.t) r2
            java.lang.Object r0 = r9.f1682l
            r3 = r0
            w.e1 r3 = (w.e1) r3
            java.lang.Object r0 = r9.f1683m
            r4 = r0
            b0.l r4 = (b0.l) r4
            java.lang.Object r0 = r9.f1684n
            r5 = r0
            m.t1 r5 = (m.t1) r5
            r7 = 2
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.f1679i = r10
            return r1
        L23:
            r6 = r11
            ci.d r2 = new ci.d
            java.lang.Object r11 = r9.f1680j
            r3 = r11
            k.s1 r3 = (k.s1) r3
            java.lang.Object r11 = r9.f1681k
            r4 = r11
            f0.h r4 = (f0.h) r4
            java.lang.Object r11 = r9.f1682l
            r5 = r11
            b0.t r5 = (b0.t) r5
            java.lang.Object r11 = r9.f1683m
            w.t0 r11 = (w.t0) r11
            java.lang.Object r0 = r9.f1684n
            r7 = r0
            b0.d0 r7 = (b0.d0) r7
            r8 = r6
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.f1679i = r10
            return r2
        L46:
            r6 = r11
            ci.d r2 = new ci.d
            java.lang.Object r11 = r9.f1681k
            r3 = r11
            qg.t r3 = (qg.t) r3
            java.lang.Object r11 = r9.f1682l
            r4 = r11
            ci.l0 r4 = (ci.l0) r4
            java.lang.Object r11 = r9.f1683m
            r5 = r11
            ci.h0 r5 = (ci.h0) r5
            java.lang.Object r11 = r9.f1684n
            ci.f r11 = (ci.f) r11
            r8 = 0
            r7 = r6
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.f1679i = r10
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1677g
            s1.k0 r2 = (s1.k0) r2
            wf.c r3 = (wf.c) r3
            switch(r0) {
                case 0: goto L23;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            wf.c r2 = r1.create(r2, r3)
            ci.d r2 = (ci.d) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L16:
            wf.c r2 = r1.create(r2, r3)
            ci.d r2 = (ci.d) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L23:
            wf.c r2 = r1.create(r2, r3)
            ci.d r2 = (ci.d) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f1677g
            switch(r0) {
                case 0: goto L110;
                case 1: goto Lac;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f1681k
            qg.t r0 = (qg.t) r0
            java.lang.Object r1 = r13.f1684n
            r4 = r1
            m.t1 r4 = (m.t1) r4
            int r1 = r13.f1678h
            r8 = 2
            r2 = 1
            r6 = 0
            xf.a r9 = xf.a.f21579g
            if (r1 == 0) goto L38
            if (r1 == r2) goto L2b
            if (r1 != r8) goto L23
            java.lang.Object r1 = r13.f1679i
            qg.r0 r1 = (qg.r0) r1
            f8.i.I0(r14)
            goto L81
        L23:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r14)
            r9 = 0
            goto Lab
        L2b:
            java.lang.Object r1 = r13.f1680j
            qg.e1 r1 = (qg.e1) r1
            java.lang.Object r2 = r13.f1679i
            s1.k0 r2 = (s1.k0) r2
            f8.i.I0(r14)
            r10 = r2
            goto L59
        L38:
            f8.i.I0(r14)
            java.lang.Object r14 = r13.f1679i
            s1.k0 r14 = (s1.k0) r14
            m.s2 r1 = new m.s2
            r3 = 0
            r1.<init>(r4, r6, r3)
            qg.e1 r1 = qg.v.q(r0, r6, r1, r2)
            r13.f1679i = r14
            r13.f1680j = r1
            r13.f1678h = r2
            r2 = 3
            java.lang.Object r2 = m.y2.b(r14, r13, r2)
            if (r2 != r9) goto L57
            goto Lab
        L57:
            r10 = r14
            r14 = r2
        L59:
            r5 = r14
            s1.t r5 = (s1.t) r5
            r5.a()
            java.lang.Object r14 = r13.f1682l
            r3 = r14
            w.e1 r3 = (w.e1) r3
            m.r0 r14 = m.y2.f8429a
            if (r3 == r14) goto L72
            c0.m r2 = new c0.m
            r7 = 15
            r2.<init>(r3, r4, r5, r6, r7)
            m.y2.f(r0, r1, r2)
        L72:
            r13.f1679i = r1
            r13.f1680j = r6
            r13.f1678h = r8
            s1.l r14 = s1.l.f12275h
            java.lang.Object r14 = m.y2.i(r10, r14, r13)
            if (r14 != r9) goto L81
            goto Lab
        L81:
            s1.t r14 = (s1.t) r14
            if (r14 != 0) goto L8f
            m.r2 r14 = new m.r2
            r2 = 0
            r14.<init>(r4, r6, r2)
            m.y2.f(r0, r1, r14)
            goto La9
        L8f:
            r14.a()
            m.r2 r2 = new m.r2
            r3 = 1
            r2.<init>(r4, r6, r3)
            m.y2.f(r0, r1, r2)
            java.lang.Object r0 = r13.f1683m
            b0.l r0 = (b0.l) r0
            long r1 = r14.f12293c
            e1.b r14 = new e1.b
            r14.<init>(r1)
            r0.invoke(r14)
        La9:
            sf.n r9 = sf.n.f12433a
        Lab:
            return r9
        Lac:
            int r0 = r13.f1678h
            r1 = 2
            r2 = 1
            xf.a r3 = xf.a.f21579g
            if (r0 == 0) goto Lce
            if (r0 == r2) goto Lc5
            if (r0 != r1) goto Lbd
            f8.i.I0(r14)
            r11 = r13
            goto L10d
        Lbd:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r14)
            r3 = 0
        Lc3:
            r11 = r13
            goto L10f
        Lc5:
            java.lang.Object r0 = r13.f1679i
            s1.k0 r0 = (s1.k0) r0
            f8.i.I0(r14)
        Lcc:
            r4 = r0
            goto Le4
        Lce:
            f8.i.I0(r14)
            java.lang.Object r14 = r13.f1679i
            r0 = r14
            s1.k0 r0 = (s1.k0) r0
            r13.f1679i = r0
            r13.f1678h = r2
            r14 = 0
            s1.l r2 = s1.l.f12274g
            java.lang.Object r14 = m.y2.a(r0, r14, r2, r13)
            if (r14 != r3) goto Lcc
            goto Lc3
        Le4:
            r5 = r14
            s1.t r5 = (s1.t) r5
            java.lang.Object r14 = r13.f1680j
            r6 = r14
            k.s1 r6 = (k.s1) r6
            java.lang.Object r14 = r13.f1681k
            r7 = r14
            f0.h r7 = (f0.h) r7
            java.lang.Object r14 = r13.f1682l
            r8 = r14
            b0.t r8 = (b0.t) r8
            java.lang.Object r14 = r13.f1683m
            r9 = r14
            w.t0 r9 = (w.t0) r9
            java.lang.Object r14 = r13.f1684n
            r10 = r14
            b0.d0 r10 = (b0.d0) r10
            r14 = 0
            r13.f1679i = r14
            r13.f1678h = r1
            r11 = r13
            java.lang.Object r14 = m.j0.g(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r14 != r3) goto L10d
            goto L10f
        L10d:
            sf.n r3 = sf.n.f12433a
        L10f:
            return r3
        L110:
            r11 = r13
            java.lang.Object r0 = r11.f1682l
            ci.l0 r0 = (ci.l0) r0
            java.lang.Object r1 = r11.f1681k
            qg.t r1 = (qg.t) r1
            java.lang.Object r2 = r11.f1683m
            r5 = r2
            ci.h0 r5 = (ci.h0) r5
            java.lang.Object r2 = r11.f1679i
            s1.k0 r2 = (s1.k0) r2
            int r3 = r11.f1678h
            r9 = 2
            r4 = 1
            r7 = 0
            xf.a r10 = xf.a.f21579g
            if (r3 == 0) goto L142
            if (r3 == r4) goto L13e
            if (r3 != r9) goto L137
            java.lang.Object r2 = r11.f1680j
            qg.e1 r2 = (qg.e1) r2
            f8.i.I0(r14)
            goto L17d
        L137:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r14)
            r10 = 0
            goto L196
        L13e:
            f8.i.I0(r14)
            goto L150
        L142:
            f8.i.I0(r14)
            r11.f1679i = r2
            r11.f1678h = r4
            java.lang.Object r14 = m.y2.b(r2, r13, r9)
            if (r14 != r10) goto L150
            goto L196
        L150:
            r6 = r14
            s1.t r6 = (s1.t) r6
            ci.c r14 = new ci.c
            r3 = 0
            r14.<init>(r5, r7, r3)
            r3 = 3
            qg.e1 r14 = qg.v.q(r1, r7, r14, r3)
            c0.m r3 = new c0.m
            java.lang.Object r4 = r11.f1684n
            ci.f r4 = (ci.f) r4
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            ci.l0.n1(r0, r1, r14, r3)
            r11.f1679i = r7
            r11.f1680j = r14
            r11.f1678h = r9
            s1.l r3 = s1.l.f12275h
            java.lang.Object r2 = m.y2.i(r2, r3, r13)
            if (r2 != r10) goto L17a
            goto L196
        L17a:
            r12 = r2
            r2 = r14
            r14 = r12
        L17d:
            s1.t r14 = (s1.t) r14
            if (r14 != 0) goto L18b
            ci.b r14 = new ci.b
            r3 = 0
            r14.<init>(r5, r7, r3)
            ci.l0.n1(r0, r1, r2, r14)
            goto L194
        L18b:
            ci.b r14 = new ci.b
            r3 = 1
            r14.<init>(r5, r7, r3)
            ci.l0.n1(r0, r1, r2, r14)
        L194:
            sf.n r10 = sf.n.f12433a
        L196:
            return r10
    }
}
