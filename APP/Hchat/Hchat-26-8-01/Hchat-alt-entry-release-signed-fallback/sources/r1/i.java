package r1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends y0.n implements x1.e2, r1.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r1.a f11327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r1.d f11328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r1.i f11329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final java.lang.String f11330x;

    public i(r1.a r1, r1.d r2) {
            r0 = this;
            r0.<init>()
            r0.f11327u = r1
            if (r2 != 0) goto Lc
            r1.d r2 = new r1.d
            r2.<init>()
        Lc:
            r0.f11328v = r2
            java.lang.String r1 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode"
            r0.f11330x = r1
            return
    }

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            java.lang.String r0 = r1.f11330x
            return r0
    }

    @Override // r1.a
    public final java.lang.Object M(long r10, wf.c r12) {
            r9 = this;
            boolean r0 = r12 instanceof r1.h
            if (r0 == 0) goto L13
            r0 = r12
            r1.h r0 = (r1.h) r0
            int r1 = r0.f11326j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11326j = r1
            goto L1a
        L13:
            r1.h r0 = new r1.h
            yf.c r12 = (yf.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f11324h
            int r1 = r0.f11326j
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            long r10 = r0.f11323g
            f8.i.I0(r12)
            goto L71
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            return r10
        L35:
            long r10 = r0.f11323g
            f8.i.I0(r12)
            goto L55
        L3b:
            f8.i.I0(r12)
            boolean r12 = r9.f21832t
            if (r12 == 0) goto L47
            r1.i r12 = r9.l1()
            goto L48
        L47:
            r12 = 0
        L48:
            if (r12 == 0) goto L5d
            r0.f11323g = r10
            r0.f11326j = r3
            java.lang.Object r12 = r12.M(r10, r0)
            if (r12 != r4) goto L55
            goto L70
        L55:
            u2.q r12 = (u2.q) r12
            long r5 = r12.f13362a
        L59:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L60
        L5d:
            r5 = 0
            goto L59
        L60:
            r1.a r12 = r9.f11327u
            long r5 = u2.q.d(r5, r10)
            r0.f11323g = r10
            r0.f11326j = r2
            java.lang.Object r12 = r12.M(r5, r0)
            if (r12 != r4) goto L71
        L70:
            return r4
        L71:
            u2.q r12 = (u2.q) r12
            long r0 = r12.f13362a
            long r10 = u2.q.e(r10, r0)
            u2.q r12 = new u2.q
            r12.<init>(r10)
            return r12
    }

    @Override // r1.a
    public final long M0(long r7, long r9, int r11) {
            r6 = this;
            r1.a r0 = r6.f11327u
            r1 = r7
            r3 = r9
            r5 = r11
            long r7 = r0.M0(r1, r3, r5)
            boolean r9 = r6.f21832t
            if (r9 == 0) goto L13
            r1.i r9 = r6.l1()
        L11:
            r0 = r9
            goto L15
        L13:
            r9 = 0
            goto L11
        L15:
            if (r0 == 0) goto L24
            long r1 = e1.b.e(r1, r7)
            long r3 = e1.b.d(r3, r7)
            long r9 = r0.M0(r1, r3, r5)
            goto L26
        L24:
            r9 = 0
        L26:
            long r7 = e1.b.e(r7, r9)
            return r7
    }

    @Override // y0.n
    public final void c1() {
            r3 = this;
            r1.d r0 = r3.f11328v
            r0.f11312a = r3
            r1 = 0
            r0.f11313b = r1
            r3.f11329w = r1
            d1.c0 r1 = new d1.c0
            r2 = 13
            r1.<init>(r3, r2)
            r0.f11314c = r1
            qg.t r1 = r3.Y0()
            r0.f11315d = r1
            return
    }

    @Override // y0.n
    public final void d1() {
            r3 = this;
            gg.u r0 = new gg.u
            r0.<init>()
            r1.j r1 = new r1.j
            r2 = 0
            r1.<init>(r0, r2)
            x1.k.A(r3, r1)
            java.lang.Object r0 = r0.f4564g
            x1.e2 r0 = (x1.e2) r0
            r1.i r0 = (r1.i) r0
            r3.f11329w = r0
            r1.d r1 = r3.f11328v
            r1.f11313b = r0
            r1.i r0 = r1.f11312a
            if (r0 != r3) goto L21
            r0 = 0
            r1.f11312a = r0
        L21:
            return
    }

    @Override // r1.a
    public final long f0(int r4, long r5) {
            r3 = this;
            boolean r0 = r3.f21832t
            if (r0 == 0) goto L9
            r1.i r0 = r3.l1()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            long r0 = r0.f0(r4, r5)
            goto L13
        L11:
            r0 = 0
        L13:
            r1.a r2 = r3.f11327u
            long r5 = e1.b.d(r5, r0)
            long r4 = r2.f0(r4, r5)
            long r4 = e1.b.e(r0, r4)
            return r4
    }

    public final qg.t k1() {
            r3 = this;
            r1.i r0 = r3.l1()
            if (r0 == 0) goto Lb
            qg.t r0 = r0.k1()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L16
            boolean r1 = qg.v.o(r0)
            r2 = 1
            if (r1 != r2) goto L16
            return r0
        L16:
            r1.d r0 = r3.f11328v
            qg.t r0 = r0.f11315d
            if (r0 == 0) goto L1d
            return r0
        L1d:
            java.lang.String r0 = "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final r1.i l1() {
            r10 = this;
            boolean r0 = r10.f21832t
            r1 = 0
            if (r0 == 0) goto L9f
            y0.n r0 = r10.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitAncestors called on an unattached node"
            u1.a.b(r0)
        L10:
            y0.n r0 = r10.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r2 = x1.k.w(r10)
        L18:
            if (r2 == 0) goto L9d
            x1.b1 r3 = r2.L
            y0.n r3 = r3.f20844f
            int r3 = r3.f21822j
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L8c
        L25:
            if (r0 == 0) goto L8c
            int r3 = r0.f21821i
            r3 = r3 & r4
            if (r3 == 0) goto L89
            r3 = r0
            r5 = r1
        L2e:
            if (r3 == 0) goto L89
            boolean r6 = r3 instanceof x1.e2
            if (r6 == 0) goto L4d
            r6 = r3
            x1.e2 r6 = (x1.e2) r6
            java.lang.String r7 = r10.f11330x
            java.lang.Object r8 = r6.F()
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L4d
            java.lang.Class<r1.i> r7 = r1.i.class
            java.lang.Class r8 = r6.getClass()
            if (r7 != r8) goto L4d
            r1 = r6
            goto L9d
        L4d:
            int r6 = r3.f21821i
            r6 = r6 & r4
            if (r6 == 0) goto L84
            boolean r6 = r3 instanceof x1.j
            if (r6 == 0) goto L84
            r6 = r3
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = 0
        L5c:
            r8 = 1
            if (r6 == 0) goto L81
            int r9 = r6.f21821i
            r9 = r9 & r4
            if (r9 == 0) goto L7e
            int r7 = r7 + 1
            if (r7 != r8) goto L6a
            r3 = r6
            goto L7e
        L6a:
            if (r5 != 0) goto L75
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L75:
            if (r3 == 0) goto L7b
            r5.b(r3)
            r3 = r1
        L7b:
            r5.b(r6)
        L7e:
            y0.n r6 = r6.f21824l
            goto L5c
        L81:
            if (r7 != r8) goto L84
            goto L2e
        L84:
            y0.n r3 = x1.k.e(r5)
            goto L2e
        L89:
            y0.n r0 = r0.f21823k
            goto L25
        L8c:
            x1.f0 r2 = r2.u()
            if (r2 == 0) goto L9a
            x1.b1 r0 = r2.L
            if (r0 == 0) goto L9a
            x1.b2 r0 = r0.f20843e
            goto L18
        L9a:
            r0 = r1
            goto L18
        L9d:
            r1.i r1 = (r1.i) r1
        L9f:
            return r1
    }

    @Override // r1.a
    public final java.lang.Object m0(long r13, long r15, yf.c r17) {
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof r1.g
            if (r1 == 0) goto L16
            r1 = r0
            r1.g r1 = (r1.g) r1
            int r2 = r1.f11322k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f11322k = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            r1.g r1 = new r1.g
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f11320i
            int r1 = r7.f11322k
            r8 = 2
            r2 = 1
            xf.a r9 = xf.a.f21579g
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r8) goto L30
            long r1 = r7.f11318g
            f8.i.I0(r0)
            goto L80
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L37:
            long r1 = r7.f11319h
            long r3 = r7.f11318g
            f8.i.I0(r0)
            goto L56
        L3f:
            f8.i.I0(r0)
            r1.a r0 = r12.f11327u
            r7.f11318g = r13
            r5 = r15
            r7.f11319h = r5
            r7.f11322k = r2
            r3 = r13
            r2 = r0
            java.lang.Object r0 = r2.m0(r3, r5, r7)
            if (r0 != r9) goto L54
            goto L7e
        L54:
            r3 = r13
            r1 = r15
        L56:
            u2.q r0 = (u2.q) r0
            long r10 = r0.f13362a
            boolean r0 = r12.f21832t
            if (r0 == 0) goto L67
            if (r0 == 0) goto L65
            r1.i r0 = r12.l1()
            goto L69
        L65:
            r0 = 0
            goto L69
        L67:
            r1.i r0 = r12.f11329w
        L69:
            if (r0 == 0) goto L86
            long r3 = u2.q.e(r3, r10)
            long r5 = u2.q.d(r1, r10)
            r7.f11318g = r10
            r7.f11322k = r8
            r2 = r0
            java.lang.Object r0 = r2.m0(r3, r5, r7)
            if (r0 != r9) goto L7f
        L7e:
            return r9
        L7f:
            r1 = r10
        L80:
            u2.q r0 = (u2.q) r0
            long r3 = r0.f13362a
            r10 = r1
            goto L88
        L86:
            r3 = 0
        L88:
            long r0 = u2.q.e(r10, r3)
            u2.q r2 = new u2.q
            r2.<init>(r0)
            return r2
    }
}
