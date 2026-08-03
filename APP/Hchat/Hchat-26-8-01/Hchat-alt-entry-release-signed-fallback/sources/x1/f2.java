package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements i0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f20911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f20912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f20913i;

    public f2(x1.f0 r2) {
            r1 = this;
            r1.<init>()
            r1.f20911g = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f20912h = r0
            r1.f20913i = r2
            return
    }

    public final void a() {
            r1 = this;
            java.util.ArrayList r0 = r1.f20912h
            r0.clear()
            java.lang.Object r0 = r1.f20911g
            r1.f20913i = r0
            java.lang.Object r0 = r1.f20911g
            x1.f0 r0 = (x1.f0) r0
            r0.P()
            return
    }

    @Override // i0.a
    public final void c(int r2, java.lang.Object r3) {
            r1 = this;
            x1.f0 r3 = (x1.f0) r3
            java.lang.Object r0 = r1.f20913i
            x1.f0 r0 = (x1.f0) r0
            r0.A(r2, r3)
            return
    }

    @Override // i0.a
    public final void d(java.lang.Object r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.f20912h
            java.lang.Object r1 = r2.f20913i
            r0.add(r1)
            r2.f20913i = r3
            return
    }

    @Override // i0.a
    public final void f() {
            r8 = this;
            java.lang.Object r0 = r8.f20913i
            x1.f0 r0 = (x1.f0) r0
            x1.b1 r1 = r0.L
            boolean r2 = r0.G()
            if (r2 != 0) goto L11
            java.lang.String r2 = "onReuse is only expected on attached node"
            u1.a.a(r2)
        L11:
            x2.v r2 = r0.f20903u
            if (r2 == 0) goto L26
            android.view.View r3 = r2.f21124h
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == r2) goto L21
            r2.addView(r3)
            goto L26
        L21:
            fg.a r2 = r2.f21128l
            r2.invoke()
        L26:
            v1.j0 r2 = r0.N
            r3 = 0
            if (r2 == 0) goto L2e
            r2.i(r3)
        L2e:
            r0.f20908z = r3
            boolean r2 = r0.W
            if (r2 == 0) goto L37
            r0.W = r3
            goto L61
        L37:
            x1.b1 r2 = r0.L
            x1.b2 r2 = r2.f20843e
            r4 = r2
        L3c:
            if (r4 == 0) goto L48
            boolean r5 = r4.f21832t
            if (r5 == 0) goto L45
            r4.f1()
        L45:
            y0.n r4 = r4.f21823k
            goto L3c
        L48:
            r4 = r2
        L49:
            if (r4 == 0) goto L55
            boolean r5 = r4.f21832t
            if (r5 == 0) goto L52
            r4.h1()
        L52:
            y0.n r4 = r4.f21823k
            goto L49
        L55:
            if (r2 == 0) goto L61
            boolean r4 = r2.f21832t
            if (r4 == 0) goto L5e
            r2.b1()
        L5e:
            y0.n r2 = r2.f21823k
            goto L55
        L61:
            int r2 = r0.f20890h
            x1.r1 r4 = r0.f20902t
            if (r4 == 0) goto L72
            y1.t r4 = (y1.t) r4
            g2.b r4 = r4.getRectManager()
            if (r4 == 0) goto L72
            r4.g(r0)
        L72:
            java.util.concurrent.atomic.AtomicInteger r4 = f2.o.f3208a
            r5 = 1
            int r4 = r4.addAndGet(r5)
            r0.f20890h = r4
            x1.r1 r4 = r0.f20902t
            if (r4 == 0) goto L91
            y1.t r4 = (y1.t) r4
            f.w r6 = r4.m184getLayoutNodes()
            r6.g(r2)
            f.w r4 = r4.m184getLayoutNodes()
            int r6 = r0.f20890h
            r4.h(r6, r0)
        L91:
            y0.n r4 = r1.f20844f
        L93:
            if (r4 == 0) goto L9b
            r4.a1()
            y0.n r4 = r4.f21824l
            goto L93
        L9b:
            r1.e()
            r4 = 8
            boolean r1 = r1.d(r4)
            if (r1 == 0) goto La9
            r0.E()
        La9:
            x1.f0.W(r0)
            x1.r1 r1 = r0.f20902t
            if (r1 == 0) goto Ldf
            y1.t r1 = (y1.t) r1
            z0.c r1 = r1.T
            if (r1 == 0) goto Ldf
            y1.t r4 = r1.f22480i
            xe.e r6 = r1.f22478g
            f.x r1 = r1.f22485n
            boolean r7 = r1.e(r2)
            if (r7 == 0) goto Lc5
            r6.b(r4, r2, r3)
        Lc5:
            f2.m r2 = r0.w()
            if (r2 == 0) goto Ldf
            f.k0 r2 = r2.f3204g
            f2.x r3 = f2.u.f3239q
            boolean r2 = r2.b(r3)
            if (r2 != r5) goto Ldf
            int r2 = r0.f20890h
            r1.a(r2)
            int r1 = r0.f20890h
            r6.b(r4, r1, r5)
        Ldf:
            x1.r1 r1 = r0.f20902t
            if (r1 == 0) goto Lee
            y1.t r1 = (y1.t) r1
            g2.b r1 = r1.getRectManager()
            if (r1 == 0) goto Lee
            r1.f(r0)
        Lee:
            return
    }

    @Override // i0.a
    public final void h(int r2, int r3, int r4) {
            r1 = this;
            java.lang.Object r0 = r1.f20913i
            x1.f0 r0 = (x1.f0) r0
            r0.K(r2, r3, r4)
            return
    }

    @Override // i0.a
    public final void i(int r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.f20913i
            x1.f0 r0 = (x1.f0) r0
            r0.Q(r2, r3)
            return
    }

    @Override // i0.a
    public final void k() {
            r2 = this;
            java.util.ArrayList r0 = r2.f20912h
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            r2.f20913i = r0
            return
    }

    @Override // i0.a
    public final /* bridge */ /* synthetic */ void p(int r1, java.lang.Object r2) {
            r0 = this;
            x1.f0 r2 = (x1.f0) r2
            return
    }

    @Override // i0.a
    public final void q() {
            r1 = this;
            java.lang.Object r0 = r1.f20911g
            x1.f0 r0 = (x1.f0) r0
            x1.r1 r0 = r0.f20902t
            if (r0 == 0) goto Ld
            y1.t r0 = (y1.t) r0
            r0.A()
        Ld:
            return
    }

    @Override // i0.a
    public final java.lang.Object r() {
            r1 = this;
            java.lang.Object r0 = r1.f20913i
            return r0
    }
}
