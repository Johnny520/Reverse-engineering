package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f12508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f12509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0.d f12510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12515o;

    public /* synthetic */ b0(long r1, fg.l r3, fg.a r4, fg.a r5, sh.f0 r6, long r7, y0.o r9, s0.d r10, int r11) {
            r0 = this;
            r11 = 0
            r0.f12507g = r11
            r0.<init>()
            r0.f12508h = r1
            r0.f12511k = r3
            r0.f12512l = r4
            r0.f12513m = r5
            r0.f12514n = r6
            r0.f12509i = r7
            r0.f12515o = r9
            r0.f12510j = r10
            return
    }

    public /* synthetic */ b0(th.j r2, i0.l2 r3, th.a r4, long r5, xb.o r7, long r8, s0.d r10, v.d r11) {
            r1 = this;
            r0 = 1
            r1.f12507g = r0
            r1.<init>()
            r1.f12511k = r2
            r1.f12512l = r3
            r1.f12513m = r4
            r1.f12508h = r5
            r1.f12514n = r7
            r1.f12509i = r8
            r1.f12510j = r10
            r1.f12515o = r11
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
            r19 = this;
            r0 = r19
            int r1 = r0.f12507g
            sf.n r2 = sf.n.f12433a
            java.lang.Object r3 = r0.f12515o
            java.lang.Object r4 = r0.f12514n
            java.lang.Object r5 = r0.f12513m
            java.lang.Object r6 = r0.f12512l
            java.lang.Object r7 = r0.f12511k
            switch(r1) {
                case 0: goto L14e;
                default: goto L13;
            }
        L13:
            th.j r7 = (th.j) r7
            i0.l2 r6 = (i0.l2) r6
            r9 = r5
            th.a r9 = (th.a) r9
            xb.o r4 = (xb.o) r4
            v.d r3 = (v.d) r3
            r1 = r20
            i0.h0 r1 = (i0.h0) r1
            r5 = r21
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r8 = r5 & 3
            r10 = 1
            r11 = 2
            if (r8 == r11) goto L32
            r8 = r10
            goto L33
        L32:
            r8 = 0
        L33:
            r5 = r5 & r10
            boolean r5 = r1.S(r5, r8)
            if (r5 == 0) goto L14a
            java.lang.Object r5 = r1.P()
            i0.e r8 = i0.l.f5952a
            if (r5 != r8) goto L4b
            w0.l r5 = new w0.l
            r12 = 3
            r5.<init>(r12)
            r1.k0(r5)
        L4b:
            fg.l r5 = (fg.l) r5
            java.util.concurrent.atomic.AtomicInteger r12 = f2.o.f3208a
            f2.c r12 = new f2.c
            r12.<init>(r5)
            r5 = 0
            y0.o r12 = c1.h.a(r12, r5)
            y0.o r7 = th.c.d(r12, r7)
            boolean r12 = r1.f(r6)
            java.lang.Object r13 = r1.P()
            r14 = 8
            if (r12 != 0) goto L6b
            if (r13 != r8) goto L73
        L6b:
            sh.y0 r13 = new sh.y0
            r13.<init>(r6, r14)
            r1.k0(r13)
        L73:
            fg.l r13 = (fg.l) r13
            y0.o r6 = f1.c0.m(r7, r13)
            java.lang.Object r7 = r1.P()
            if (r7 != r8) goto L87
            v0.a r7 = new v0.a
            r7.<init>(r3, r14)
            r1.k0(r7)
        L87:
            fg.a r7 = (fg.a) r7
            java.lang.Object r3 = r1.P()
            r12 = 4
            if (r3 != r8) goto L98
            w0.l r3 = new w0.l
            r3.<init>(r12)
            r1.k0(r3)
        L98:
            fg.l r3 = (fg.l) r3
            long r13 = r0.f12508h
            boolean r15 = r1.e(r13)
            java.lang.Object r10 = r1.P()
            if (r15 != 0) goto La8
            if (r10 != r8) goto Lb2
        La8:
            ca.c r10 = new ca.c
            r8 = 17
            r10.<init>(r13, r8)
            r1.k0(r10)
        Lb2:
            r14 = r10
            fg.l r14 = (fg.l) r14
            r15 = 1912(0x778, float:2.679E-42)
            r8 = r12
            r12 = 0
            r13 = 0
            r10 = r7
            r7 = r11
            r11 = r3
            r3 = r8
            r8 = r6
            r6 = 1
            y0.o r8 = th.c.b(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r4 == 0) goto Lcb
            y0.o r4 = r4.f21531i
            if (r4 == 0) goto Lcb
            goto Lcd
        Lcb:
            y0.l r4 = y0.l.f21818a
        Lcd:
            y0.o r4 = r8.d(r4)
            r8 = 56
            float r8 = (float) r8
            y0.o r4 = p.h1.e(r4, r8)
            float r3 = (float) r3
            y0.o r8 = p.d.n(r4, r3, r5, r7)
            f1.n r13 = new f1.n
            long r3 = r0.f12509i
            r5 = 5
            r13.<init>(r3, r5)
            r14 = 262143(0x3ffff, float:3.6734E-40)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            y0.o r3 = f1.c0.n(r8, r9, r10, r11, r12, r13, r14)
            y0.f r4 = y0.b.f21802q
            p.c r5 = p.j.f9924a
            r7 = 48
            p.e1 r4 = p.d1.a(r5, r4, r1, r7)
            long r7 = r1.T
            int r5 = java.lang.Long.hashCode(r7)
            s0.h r7 = r1.l()
            y0.o r3 = y0.a.c(r1, r3)
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r1.d0()
            boolean r9 = r1.S
            if (r9 == 0) goto L11a
            r1.k(r8)
            goto L11d
        L11a:
            r1.n0()
        L11d:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r1, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r1, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r1, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r1)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r1, r3)
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            s0.d r4 = r0.f12510j
            p.f1 r5 = p.f1.f9898a
            r4.b(r5, r1, r3)
            r1.p(r6)
            goto L14d
        L14a:
            r1.V()
        L14d:
            return r2
        L14e:
            r9 = r7
            fg.l r9 = (fg.l) r9
            r10 = r6
            fg.a r10 = (fg.a) r10
            r11 = r5
            fg.a r11 = (fg.a) r11
            r12 = r4
            sh.f0 r12 = (sh.f0) r12
            r15 = r3
            y0.o r15 = (y0.o) r15
            r17 = r20
            i0.h0 r17 = (i0.h0) r17
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 12582961(0xc00031, float:1.7632484E-38)
            int r18 = i0.r.C(r1)
            long r7 = r0.f12508h
            long r13 = r0.f12509i
            s0.d r1 = r0.f12510j
            r16 = r1
            sh.s.h(r7, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            return r2
    }
}
