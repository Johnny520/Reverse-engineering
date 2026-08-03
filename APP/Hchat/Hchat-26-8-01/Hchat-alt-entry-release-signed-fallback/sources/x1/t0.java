package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.f0 f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.c f21058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4.t f21061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0.b f21062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0.b f21064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u2.a f21065i;

    public t0(x1.f0 r4) {
            r3 = this;
            r3.<init>()
            r3.f21057a = r4
            b5.c r4 = new b5.c
            r0 = 29
            r4.<init>(r0)
            r3.f21058b = r4
            p4.t r4 = new p4.t
            r0 = 18
            r4.<init>(r0)
            r3.f21061e = r4
            j0.b r4 = new j0.b
            r0 = 16
            x1.f0[] r1 = new x1.f0[r0]
            r4.<init>(r1)
            r3.f21062f = r4
            r1 = 1
            r3.f21063g = r1
            j0.b r4 = new j0.b
            x1.s0[] r0 = new x1.s0[r0]
            r4.<init>(r0)
            r3.f21064h = r4
            return
    }

    public static final boolean a(x1.t0 r5, x1.f0 r6, boolean r7) {
            x1.f0 r0 = r5.f21057a
            boolean r1 = r6.W
            x1.j0 r2 = r6.M
            r3 = 0
            if (r1 == 0) goto Lb
            goto La5
        Lb:
            boolean r1 = k(r6)
            if (r1 == 0) goto La5
            if (r6 != r0) goto L19
            u2.a r1 = r5.f21065i
            r1.getClass()
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r7 == 0) goto L3a
            boolean r7 = r2.f20955e
            if (r7 == 0) goto L24
            boolean r3 = c(r6, r1)
        L24:
            if (r3 != 0) goto L2a
            boolean r7 = r2.f20956f
            if (r7 == 0) goto La2
        L2a:
            java.lang.Boolean r7 = r6.I()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto La2
            r6.J()
            goto La2
        L3a:
            boolean r7 = r6.q()
            if (r7 == 0) goto L45
            boolean r7 = d(r6, r1)
            goto L46
        L45:
            r7 = r3
        L46:
            boolean r1 = r6.p()
            if (r1 == 0) goto La1
            r1 = 1
            if (r6 == r0) goto L61
            x1.f0 r4 = r6.u()
            if (r4 == 0) goto La1
            boolean r4 = r4.H()
            if (r4 != r1) goto La1
            x1.v0 r4 = r2.f20966p
            boolean r4 = r4.f21090z
            if (r4 == 0) goto La1
        L61:
            if (r6 != r0) goto L8c
            x1.d0 r0 = r6.I
            x1.d0 r4 = x1.d0.f20870i
            if (r0 != r4) goto L6c
            r6.f()
        L6c:
            x1.f0 r0 = r6.u()
            if (r0 == 0) goto L7c
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            if (r0 == 0) goto L7c
            v1.k0 r0 = r0.f21000r
            if (r0 != 0) goto L86
        L7c:
            x1.r1 r0 = x1.i0.a(r6)
            y1.t r0 = (y1.t) r0
            v1.a1 r0 = r0.getPlacementScope()
        L86:
            x1.v0 r2 = r2.f20966p
            v1.a1.E(r0, r2, r3, r3)
            goto L8f
        L8c:
            r6.R()
        L8f:
            p4.t r0 = r5.f21061e
            r0.getClass()
            int r2 = r6.V
            if (r2 <= 0) goto La1
            java.lang.Object r0 = r0.f10224h
            j0.b r0 = (j0.b) r0
            r0.b(r6)
            r6.U = r1
        La1:
            r3 = r7
        La2:
            r5.e()
        La5:
            return r3
    }

    public static boolean c(x1.f0 r5, u2.a r6) {
            x1.f0 r0 = r5.f20896n
            x1.j0 r1 = r5.M
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            x1.r0 r0 = r1.f20967q
            r0.getClass()
            long r3 = r6.f13338a
            boolean r6 = r0.X0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            x1.r0 r6 = r1.f20967q
            if (r6 == 0) goto L21
            u2.a r1 = r6.f21032s
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.f13338a
            boolean r6 = r6.X0(r0)
        L2f:
            x1.f0 r0 = r5.u()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            x1.f0 r1 = r0.f20896n
            r3 = 3
            if (r1 != 0) goto L40
            x1.f0.V(r0, r2, r3)
            return r6
        L40:
            x1.d0 r1 = r5.s()
            x1.d0 r4 = x1.d0.f20868g
            if (r1 != r4) goto L4c
            x1.f0.T(r0, r2, r3)
            return r6
        L4c:
            x1.d0 r5 = r5.s()
            x1.d0 r1 = x1.d0.f20869h
            if (r5 != r1) goto L57
            r0.S(r2)
        L57:
            return r6
    }

    public static boolean d(x1.f0 r4, u2.a r5) {
            if (r5 == 0) goto L16
            x1.d0 r0 = r4.I
            x1.d0 r1 = x1.d0.f20870i
            if (r0 != r1) goto Lb
            r4.e()
        Lb:
            x1.j0 r0 = r4.M
            x1.v0 r0 = r0.f20966p
            long r1 = r5.f13338a
            boolean r5 = r0.X0(r1)
            goto L41
        L16:
            x1.j0 r5 = r4.M
            x1.v0 r5 = r5.f20966p
            boolean r0 = r5.f21080p
            if (r0 == 0) goto L26
            long r0 = r5.f13903j
            u2.a r5 = new u2.a
            r5.<init>(r0)
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L3d
            x1.d0 r0 = r4.I
            x1.d0 r1 = x1.d0.f20870i
            if (r0 != r1) goto L32
            r4.e()
        L32:
            x1.j0 r0 = r4.M
            x1.v0 r0 = r0.f20966p
            long r1 = r5.f13338a
            boolean r5 = r0.X0(r1)
            goto L41
        L3d:
            r4.getClass()
            r5 = 0
        L41:
            x1.f0 r0 = r4.u()
            if (r5 == 0) goto L62
            if (r0 == 0) goto L62
            x1.d0 r1 = r4.r()
            x1.d0 r2 = x1.d0.f20868g
            r3 = 0
            if (r1 != r2) goto L57
            r4 = 3
            x1.f0.V(r0, r3, r4)
            return r5
        L57:
            x1.d0 r4 = r4.r()
            x1.d0 r1 = x1.d0.f20869h
            if (r4 != r1) goto L62
            r0.U(r3)
        L62:
            return r5
    }

    public static boolean i(x1.f0 r3) {
            x1.j0 r0 = r3.M
            boolean r0 = r0.f20955e
            if (r0 == 0) goto L20
            x1.d0 r0 = r3.s()
            x1.d0 r1 = x1.d0.f20870i
            r2 = 1
            if (r0 != r1) goto L1f
            x1.j0 r3 = r3.M
            x1.r0 r3 = r3.f20967q
            if (r3 == 0) goto L20
            x1.g0 r3 = r3.f21037x
            if (r3 == 0) goto L20
            boolean r3 = r3.e()
            if (r3 != r2) goto L20
        L1f:
            return r2
        L20:
            r3 = 0
            return r3
    }

    public static boolean j(x1.f0 r2) {
            boolean r0 = r2.q()
            if (r0 == 0) goto L39
        L6:
            x1.d0 r0 = r2.r()
            x1.d0 r1 = x1.d0.f20870i
            if (r0 != r1) goto L2a
            x1.j0 r0 = r2.M
            x1.v0 r0 = r0.f20966p
            x1.g0 r0 = r0.D
            boolean r0 = r0.e()
            if (r0 != 0) goto L2a
            x1.f0 r0 = r2.u()
            if (r0 == 0) goto L25
            x1.j0 r0 = r0.M
            x1.b0 r0 = r0.f20954d
            goto L26
        L25:
            r0 = 0
        L26:
            x1.b0 r1 = x1.b0.f20833g
            if (r0 != r1) goto L39
        L2a:
            x1.f0 r2 = r2.u()
            if (r2 != 0) goto L31
            goto L39
        L31:
            boolean r0 = r2.H()
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L39:
            r2 = 0
            return r2
    }

    public static boolean k(x1.f0 r4) {
            x1.j0 r0 = r4.M
            boolean r1 = r4.H()
            r2 = 1
            if (r1 != 0) goto L42
            x1.v0 r1 = r0.f20966p
            boolean r1 = r1.f21090z
            if (r1 != 0) goto L42
            boolean r1 = j(r4)
            if (r1 != 0) goto L42
            java.lang.Boolean r1 = r4.I()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L42
            boolean r4 = i(r4)
            if (r4 != 0) goto L42
            x1.v0 r4 = r0.f20966p
            x1.g0 r4 = r4.D
            boolean r4 = r4.e()
            if (r4 != 0) goto L42
            x1.r0 r4 = r0.f20967q
            if (r4 == 0) goto L40
            x1.g0 r4 = r4.f21037x
            if (r4 == 0) goto L40
            boolean r4 = r4.e()
            if (r4 != r2) goto L40
            goto L42
        L40:
            r4 = 0
            return r4
        L42:
            return r2
    }

    public final void b(boolean r4) {
            r3 = this;
            p4.t r0 = r3.f21061e
            if (r4 == 0) goto L17
            java.lang.Object r4 = r0.f10224h
            j0.b r4 = (j0.b) r4
            x1.f0 r1 = r3.f21057a
            int r2 = r1.V
            if (r2 <= 0) goto L17
            r4.g()
            r4.b(r1)
            r4 = 1
            r1.U = r4
        L17:
            java.lang.Object r4 = r0.f10224h
            j0.b r4 = (j0.b) r4
            int r4 = r4.f6673i
            if (r4 == 0) goto L30
            java.lang.String r4 = "Compose:onPositionedCallbacks"
            android.os.Trace.beginSection(r4)
            r0.t()     // Catch: java.lang.Throwable -> L2b
            android.os.Trace.endSection()
            return
        L2b:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        L30:
            return
    }

    public final void e() {
            r8 = this;
            j0.b r0 = r8.f21064h
            int r1 = r0.f6673i
            if (r1 == 0) goto L2d
            java.lang.Object[] r2 = r0.f6671g
            r3 = 0
        L9:
            if (r3 >= r1) goto L2a
            r4 = r2[r3]
            x1.s0 r4 = (x1.s0) r4
            x1.f0 r5 = r4.f21045a
            boolean r5 = r5.G()
            if (r5 == 0) goto L27
            boolean r5 = r4.f21046b
            x1.f0 r6 = r4.f21045a
            boolean r4 = r4.f21047c
            r7 = 2
            if (r5 != 0) goto L24
            x1.f0.V(r6, r4, r7)
            goto L27
        L24:
            x1.f0.T(r6, r4, r7)
        L27:
            int r3 = r3 + 1
            goto L9
        L2a:
            r0.g()
        L2d:
            return
    }

    public final void f(x1.f0 r6) {
            r5 = this;
            j0.b r6 = r6.y()
            java.lang.Object[] r0 = r6.f6671g
            int r6 = r6.f6673i
            r1 = 0
        L9:
            if (r1 >= r6) goto L30
            r2 = r0[r1]
            x1.f0 r2 = (x1.f0) r2
            java.lang.Boolean r3 = r2.I()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L2d
            boolean r3 = r2.W
            if (r3 != 0) goto L2d
            b5.c r3 = r5.f21058b
            boolean r3 = r3.i(r2)
            if (r3 == 0) goto L2a
            r2.J()
        L2a:
            r5.f(r2)
        L2d:
            int r1 = r1 + 1
            goto L9
        L30:
            return
    }

    public final void g(x1.f0 r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.f21059c
            if (r0 != 0) goto L9
            java.lang.String r0 = "forceMeasureTheSubtree should be executed during the measureAndLayout pass"
            u1.a.b(r0)
        L9:
            if (r3 == 0) goto L10
            x1.j0 r0 = r2.M
            boolean r0 = r0.f20955e
            goto L14
        L10:
            boolean r0 = r2.q()
        L14:
            if (r0 == 0) goto L1b
            java.lang.String r0 = "node not yet measured"
            u1.a.a(r0)
        L1b:
            r1.h(r2, r3)
            return
    }

    public final void h(x1.f0 r8, boolean r9) {
            r7 = this;
            j0.b r0 = r8.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r2 = 0
        L9:
            if (r2 >= r0) goto L7b
            r3 = r1[r2]
            x1.f0 r3 = (x1.f0) r3
            x1.d0 r4 = x1.d0.f20868g
            r5 = 1
            if (r9 != 0) goto L27
            x1.d0 r6 = r3.r()
            if (r6 == r4) goto L3f
            x1.j0 r6 = r3.M
            x1.v0 r6 = r6.f20966p
            x1.g0 r6 = r6.D
            boolean r6 = r6.e()
            if (r6 == 0) goto L27
            goto L3f
        L27:
            if (r9 == 0) goto L78
            x1.d0 r6 = r3.s()
            if (r6 == r4) goto L3f
            x1.j0 r4 = r3.M
            x1.r0 r4 = r4.f20967q
            if (r4 == 0) goto L78
            x1.g0 r4 = r4.f21037x
            if (r4 == 0) goto L78
            boolean r4 = r4.e()
            if (r4 != r5) goto L78
        L3f:
            boolean r4 = x1.k.q(r3)
            x1.j0 r6 = r3.M
            if (r4 == 0) goto L5c
            if (r9 != 0) goto L5c
            boolean r4 = r6.f20955e
            if (r4 == 0) goto L59
            b5.c r4 = r7.f21058b
            boolean r4 = r4.i(r3)
            if (r4 == 0) goto L59
            r7.o(r3, r5)
            goto L5c
        L59:
            r7.g(r3, r5)
        L5c:
            if (r9 == 0) goto L61
            boolean r4 = r6.f20955e
            goto L65
        L61:
            boolean r4 = r3.q()
        L65:
            if (r4 == 0) goto L6a
            r7.o(r3, r9)
        L6a:
            if (r9 == 0) goto L6f
            boolean r4 = r6.f20955e
            goto L73
        L6f:
            boolean r4 = r3.q()
        L73:
            if (r4 != 0) goto L78
            r7.h(r3, r9)
        L78:
            int r2 = r2 + 1
            goto L9
        L7b:
            if (r9 == 0) goto L82
            x1.j0 r0 = r8.M
            boolean r0 = r0.f20955e
            goto L86
        L82:
            boolean r0 = r8.q()
        L86:
            if (r0 == 0) goto L8b
            r7.o(r8, r9)
        L8b:
            return
    }

    public final boolean l(y1.n r17) {
            r16 = this;
            r1 = r16
            b5.c r0 = r1.f21058b
            x1.f0 r2 = r1.f21057a
            boolean r3 = r2.G()
            if (r3 != 0) goto L11
            java.lang.String r3 = "performMeasureAndLayout called with unattached root"
            u1.a.a(r3)
        L11:
            boolean r3 = r2.H()
            if (r3 != 0) goto L1c
            java.lang.String r3 = "performMeasureAndLayout called with unplaced root"
            u1.a.a(r3)
        L1c:
            boolean r3 = r1.f21059c
            if (r3 == 0) goto L25
            java.lang.String r3 = "performMeasureAndLayout called during measure layout"
            u1.a.a(r3)
        L25:
            u2.a r3 = r1.f21065i
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Lda
            r1.f21059c = r5
            r1.f21060d = r5
            boolean r3 = r0.C()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r0.f469a
            m.a r6 = (m.a) r6
            if (r3 == 0) goto Lcd
            r3 = r4
        L3a:
            java.lang.Object r7 = r0.f471c     // Catch: java.lang.Throwable -> L62
            m.a r7 = (m.a) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r0.f470b     // Catch: java.lang.Throwable -> L62
            m.a r8 = (m.a) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r9 = r6.f8069h     // Catch: java.lang.Throwable -> L62
            x1.a2 r9 = (x1.a2) r9     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L65
            java.lang.Object r7 = r6.f8069h     // Catch: java.lang.Throwable -> L62
            x1.a2 r7 = (x1.a2) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.first()     // Catch: java.lang.Throwable -> L62
            x1.f0 r7 = (x1.f0) r7     // Catch: java.lang.Throwable -> L62
            r6.u(r7)     // Catch: java.lang.Throwable -> L62
            x1.f0 r8 = r7.f20896n     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L5f
            r8 = r5
            goto L60
        L5f:
            r8 = r4
        L60:
            r9 = r4
            goto L9f
        L62:
            r0 = move-exception
            goto Ld3
        L65:
            java.lang.Object r9 = r8.f8069h     // Catch: java.lang.Throwable -> L62
            x1.a2 r9 = (x1.a2) r9     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L85
            java.lang.Object r7 = r8.f8069h     // Catch: java.lang.Throwable -> L62
            x1.a2 r7 = (x1.a2) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.first()     // Catch: java.lang.Throwable -> L62
            x1.f0 r7 = (x1.f0) r7     // Catch: java.lang.Throwable -> L62
            r8.u(r7)     // Catch: java.lang.Throwable -> L62
            x1.f0 r8 = r7.f20896n     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L82
            r8 = r5
            goto L83
        L82:
            r8 = r4
        L83:
            r9 = r5
            goto L9f
        L85:
            java.lang.Object r8 = r7.f8069h     // Catch: java.lang.Throwable -> L62
            x1.a2 r8 = (x1.a2) r8     // Catch: java.lang.Throwable -> L62
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto Lc7
            java.lang.Object r8 = r7.f8069h     // Catch: java.lang.Throwable -> L62
            x1.a2 r8 = (x1.a2) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.first()     // Catch: java.lang.Throwable -> L62
            x1.f0 r8 = (x1.f0) r8     // Catch: java.lang.Throwable -> L62
            r7.u(r8)     // Catch: java.lang.Throwable -> L62
            r9 = r5
            r7 = r8
            r8 = r4
        L9f:
            if (r9 == 0) goto La6
            boolean r8 = a(r1, r7, r8)     // Catch: java.lang.Throwable -> L62
            goto Lc0
        La6:
            boolean r8 = r1.o(r7, r8)     // Catch: java.lang.Throwable -> L62
            x1.j0 r9 = r7.M     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.f20956f     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lb5
            x1.s r9 = x1.s.f21041h     // Catch: java.lang.Throwable -> L62
            r0.b(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lb5:
            boolean r9 = r7.p()     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lc0
            x1.s r9 = x1.s.f21043j     // Catch: java.lang.Throwable -> L62
            r0.b(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lc0:
            if (r7 != r2) goto L3a
            if (r8 == 0) goto L3a
            r3 = r5
            goto L3a
        Lc7:
            if (r17 == 0) goto Lce
            r17.invoke()     // Catch: java.lang.Throwable -> L62
            goto Lce
        Lcd:
            r3 = r4
        Lce:
            r1.f21059c = r4
            r1.f21060d = r4
            goto Ldb
        Ld3:
            throw r0     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r0 = move-exception
            r1.f21059c = r4
            r1.f21060d = r4
            throw r0
        Lda:
            r3 = r4
        Ldb:
            j0.b r0 = r1.f21062f
            java.lang.Object[] r2 = r0.f6671g
            int r6 = r0.f6673i
            r7 = r4
        Le2:
            if (r7 >= r6) goto L177
            r8 = r2[r7]
            x1.f0 r8 = (x1.f0) r8
            x1.b1 r8 = r8.L
            x1.r r9 = r8.f20841c
            r10 = 4194304(0x400000, float:5.877472E-39)
            boolean r11 = x1.j1.g(r10)
            if (r11 == 0) goto Lf7
            x1.b2 r12 = r9.Y
            goto Lff
        Lf7:
            x1.b2 r12 = r9.Y
            y0.n r12 = r12.f21823k
            if (r12 != 0) goto Lff
            goto L172
        Lff:
            f1.o0 r13 = x1.i1.T
            y0.n r9 = r9.t1(r11)
        L105:
            if (r9 == 0) goto L172
            int r11 = r9.f21822j
            r11 = r11 & r10
            if (r11 == 0) goto L172
            int r11 = r9.f21821i
            r11 = r11 & r10
            if (r11 == 0) goto L168
            r11 = 0
            r13 = r9
            r14 = r11
        L114:
            if (r13 == 0) goto L168
            boolean r15 = r13 instanceof x1.u
            if (r15 == 0) goto L124
            x1.u r13 = (x1.u) r13
            x1.r r15 = r8.f20841c
            r13.p0(r15)
        L121:
            r17 = r10
            goto L163
        L124:
            int r15 = r13.f21821i
            r15 = r15 & r10
            if (r15 == 0) goto L121
            boolean r15 = r13 instanceof x1.j
            if (r15 == 0) goto L121
            r15 = r13
            x1.j r15 = (x1.j) r15
            y0.n r15 = r15.f20950v
        L132:
            if (r15 == 0) goto L15b
            r17 = r10
            int r10 = r15.f21821i
            r10 = r10 & r17
            if (r10 == 0) goto L156
            int r4 = r4 + 1
            if (r4 != r5) goto L142
            r13 = r15
            goto L156
        L142:
            if (r14 != 0) goto L14d
            j0.b r14 = new j0.b
            r10 = 16
            y0.n[] r10 = new y0.n[r10]
            r14.<init>(r10)
        L14d:
            if (r13 == 0) goto L153
            r14.b(r13)
            r13 = r11
        L153:
            r14.b(r15)
        L156:
            y0.n r15 = r15.f21824l
            r10 = r17
            goto L132
        L15b:
            r17 = r10
            if (r4 != r5) goto L163
        L15f:
            r10 = r17
            r4 = 0
            goto L114
        L163:
            y0.n r13 = x1.k.e(r14)
            goto L15f
        L168:
            r17 = r10
            if (r9 == r12) goto L172
            y0.n r9 = r9.f21824l
            r10 = r17
            r4 = 0
            goto L105
        L172:
            int r7 = r7 + 1
            r4 = 0
            goto Le2
        L177:
            r0.g()
            return r3
    }

    public final void m(x1.f0 r17, long r18) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            boolean r4 = r0.W
            x1.j0 r5 = r0.M
            if (r4 == 0) goto Ld
            return
        Ld:
            x1.f0 r4 = r1.f21057a
            boolean r6 = r0.equals(r4)
            if (r6 == 0) goto L1a
            java.lang.String r6 = "measureAndLayout called on root"
            u1.a.a(r6)
        L1a:
            boolean r6 = r4.G()
            if (r6 != 0) goto L25
            java.lang.String r6 = "performMeasureAndLayout called with unattached root"
            u1.a.a(r6)
        L25:
            boolean r4 = r4.H()
            if (r4 != 0) goto L30
            java.lang.String r4 = "performMeasureAndLayout called with unplaced root"
            u1.a.a(r4)
        L30:
            boolean r4 = r1.f21059c
            if (r4 == 0) goto L39
            java.lang.String r4 = "performMeasureAndLayout called during measure layout"
            u1.a.a(r4)
        L39:
            u2.a r4 = r1.f21065i
            r6 = 1
            r7 = 0
            if (r4 == 0) goto Ldd
            r1.f21059c = r6
            r1.f21060d = r7
            b5.c r4 = r1.f21058b     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r8 = r4.f469a     // Catch: java.lang.Throwable -> L6a
            m.a r8 = (m.a) r8     // Catch: java.lang.Throwable -> L6a
            r8.u(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r8 = r4.f470b     // Catch: java.lang.Throwable -> L6a
            m.a r8 = (m.a) r8     // Catch: java.lang.Throwable -> L6a
            r8.u(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r4 = r4.f471c     // Catch: java.lang.Throwable -> L6a
            m.a r4 = (m.a) r4     // Catch: java.lang.Throwable -> L6a
            r4.u(r0)     // Catch: java.lang.Throwable -> L6a
            u2.a r4 = new u2.a     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6a
            boolean r4 = c(r0, r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L6c
            boolean r4 = r5.f20956f     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L7b
            goto L6c
        L6a:
            r0 = move-exception
            goto Ld6
        L6c:
            java.lang.Boolean r4 = r0.I()     // Catch: java.lang.Throwable -> L6a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6a
            boolean r4 = gg.l.a(r4, r8)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L7b
            r0.J()     // Catch: java.lang.Throwable -> L6a
        L7b:
            r16.f(r17)     // Catch: java.lang.Throwable -> L6a
            x1.d0 r4 = r0.I     // Catch: java.lang.Throwable -> L6a
            x1.d0 r8 = x1.d0.f20870i     // Catch: java.lang.Throwable -> L6a
            if (r4 != r8) goto L87
            r0.e()     // Catch: java.lang.Throwable -> L6a
        L87:
            x1.v0 r4 = r5.f20966p     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r4.X0(r2)     // Catch: java.lang.Throwable -> L6a
            x1.f0 r3 = r0.u()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto Lad
            if (r3 == 0) goto Lad
            x1.d0 r2 = r0.r()     // Catch: java.lang.Throwable -> L6a
            x1.d0 r4 = x1.d0.f20868g     // Catch: java.lang.Throwable -> L6a
            if (r2 != r4) goto La2
            r2 = 3
            x1.f0.V(r3, r7, r2)     // Catch: java.lang.Throwable -> L6a
            goto Lad
        La2:
            x1.d0 r2 = r0.r()     // Catch: java.lang.Throwable -> L6a
            x1.d0 r4 = x1.d0.f20869h     // Catch: java.lang.Throwable -> L6a
            if (r2 != r4) goto Lad
            r3.U(r7)     // Catch: java.lang.Throwable -> L6a
        Lad:
            boolean r2 = r0.p()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto Lce
            boolean r2 = r0.H()     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto Lce
            r0.R()     // Catch: java.lang.Throwable -> L6a
            p4.t r2 = r1.f21061e     // Catch: java.lang.Throwable -> L6a
            r2.getClass()     // Catch: java.lang.Throwable -> L6a
            int r3 = r0.V     // Catch: java.lang.Throwable -> L6a
            if (r3 <= 0) goto Lce
            java.lang.Object r2 = r2.f10224h     // Catch: java.lang.Throwable -> L6a
            j0.b r2 = (j0.b) r2     // Catch: java.lang.Throwable -> L6a
            r2.b(r0)     // Catch: java.lang.Throwable -> L6a
            r0.U = r6     // Catch: java.lang.Throwable -> L6a
        Lce:
            r1.e()     // Catch: java.lang.Throwable -> L6a
            r1.f21059c = r7
            r1.f21060d = r7
            goto Ldd
        Ld6:
            throw r0     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r0 = move-exception
            r1.f21059c = r7
            r1.f21060d = r7
            throw r0
        Ldd:
            j0.b r0 = r1.f21062f
            java.lang.Object[] r2 = r0.f6671g
            int r3 = r0.f6673i
            r4 = r7
        Le4:
            if (r4 >= r3) goto L16c
            r5 = r2[r4]
            x1.f0 r5 = (x1.f0) r5
            x1.b1 r5 = r5.L
            x1.r r8 = r5.f20841c
            r9 = 4194304(0x400000, float:5.877472E-39)
            boolean r10 = x1.j1.g(r9)
            if (r10 == 0) goto Lf9
            x1.b2 r11 = r8.Y
            goto L101
        Lf9:
            x1.b2 r11 = r8.Y
            y0.n r11 = r11.f21823k
            if (r11 != 0) goto L101
            goto L167
        L101:
            f1.o0 r12 = x1.i1.T
            y0.n r8 = r8.t1(r10)
        L107:
            if (r8 == 0) goto L167
            int r10 = r8.f21822j
            r10 = r10 & r9
            if (r10 == 0) goto L167
            int r10 = r8.f21821i
            r10 = r10 & r9
            if (r10 == 0) goto L161
            r10 = 0
            r12 = r8
            r13 = r10
        L116:
            if (r12 == 0) goto L161
            boolean r14 = r12 instanceof x1.u
            if (r14 == 0) goto L124
            x1.u r12 = (x1.u) r12
            x1.r r14 = r5.f20841c
            r12.p0(r14)
            goto L15c
        L124:
            int r14 = r12.f21821i
            r14 = r14 & r9
            if (r14 == 0) goto L15c
            boolean r14 = r12 instanceof x1.j
            if (r14 == 0) goto L15c
            r14 = r12
            x1.j r14 = (x1.j) r14
            y0.n r14 = r14.f20950v
            r15 = r7
        L133:
            if (r14 == 0) goto L158
            int r7 = r14.f21821i
            r7 = r7 & r9
            if (r7 == 0) goto L154
            int r15 = r15 + 1
            if (r15 != r6) goto L140
            r12 = r14
            goto L154
        L140:
            if (r13 != 0) goto L14b
            j0.b r13 = new j0.b
            r7 = 16
            y0.n[] r7 = new y0.n[r7]
            r13.<init>(r7)
        L14b:
            if (r12 == 0) goto L151
            r13.b(r12)
            r12 = r10
        L151:
            r13.b(r14)
        L154:
            y0.n r14 = r14.f21824l
            r7 = 0
            goto L133
        L158:
            if (r15 != r6) goto L15c
        L15a:
            r7 = 0
            goto L116
        L15c:
            y0.n r12 = x1.k.e(r13)
            goto L15a
        L161:
            if (r8 == r11) goto L167
            y0.n r8 = r8.f21824l
            r7 = 0
            goto L107
        L167:
            int r4 = r4 + 1
            r7 = 0
            goto Le4
        L16c:
            r0.g()
            return
    }

    public final void n() {
            r5 = this;
            b5.c r0 = r5.f21058b
            boolean r1 = r0.C()
            if (r1 == 0) goto L70
            x1.f0 r1 = r5.f21057a
            boolean r2 = r1.G()
            if (r2 != 0) goto L15
            java.lang.String r2 = "performMeasureAndLayout called with unattached root"
            u1.a.a(r2)
        L15:
            boolean r2 = r1.H()
            if (r2 != 0) goto L20
            java.lang.String r2 = "performMeasureAndLayout called with unplaced root"
            u1.a.a(r2)
        L20:
            boolean r2 = r5.f21059c
            if (r2 == 0) goto L29
            java.lang.String r2 = "performMeasureAndLayout called during measure layout"
            u1.a.a(r2)
        L29:
            u2.a r2 = r5.f21065i
            if (r2 == 0) goto L70
            r2 = 1
            r5.f21059c = r2
            r3 = 0
            r5.f21060d = r3
            java.lang.Object r4 = r0.f471c     // Catch: java.lang.Throwable -> L5c
            m.a r4 = (m.a) r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r4 = r4.f8069h     // Catch: java.lang.Throwable -> L5c
            x1.a2 r4 = (x1.a2) r4     // Catch: java.lang.Throwable -> L5c
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L51
            java.lang.Object r0 = r0.f469a     // Catch: java.lang.Throwable -> L5c
            m.a r0 = (m.a) r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.f8069h     // Catch: java.lang.Throwable -> L5c
            x1.a2 r0 = (x1.a2) r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 == 0) goto L61
            x1.f0 r0 = r1.f20896n     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5e
            r5.q(r1, r2)     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r0 = move-exception
            goto L69
        L5e:
            r5.p(r1)     // Catch: java.lang.Throwable -> L5c
        L61:
            r5.q(r1, r3)     // Catch: java.lang.Throwable -> L5c
            r5.f21059c = r3
            r5.f21060d = r3
            return
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r5.f21059c = r3
            r5.f21060d = r3
            throw r0
        L70:
            return
    }

    public final boolean o(x1.f0 r3, boolean r4) {
            r2 = this;
            boolean r0 = r3.W
            r1 = 0
            if (r0 == 0) goto L6
            goto L31
        L6:
            boolean r0 = k(r3)
            if (r0 == 0) goto L31
            x1.f0 r0 = r2.f21057a
            if (r3 != r0) goto L16
            u2.a r0 = r2.f21065i
            r0.getClass()
            goto L17
        L16:
            r0 = 0
        L17:
            if (r4 == 0) goto L24
            x1.j0 r4 = r3.M
            boolean r4 = r4.f20955e
            if (r4 == 0) goto L2e
            boolean r1 = c(r3, r0)
            goto L2e
        L24:
            boolean r4 = r3.q()
            if (r4 == 0) goto L2e
            boolean r1 = d(r3, r0)
        L2e:
            r2.e()
        L31:
            return r1
    }

    public final void p(x1.f0 r6) {
            r5 = this;
            j0.b r6 = r6.y()
            java.lang.Object[] r0 = r6.f6671g
            int r6 = r6.f6673i
            r1 = 0
        L9:
            if (r1 >= r6) goto L34
            r2 = r0[r1]
            x1.f0 r2 = (x1.f0) r2
            x1.d0 r3 = r2.r()
            x1.d0 r4 = x1.d0.f20868g
            if (r3 == r4) goto L23
            x1.j0 r3 = r2.M
            x1.v0 r3 = r3.f20966p
            x1.g0 r3 = r3.D
            boolean r3 = r3.e()
            if (r3 == 0) goto L31
        L23:
            boolean r3 = x1.k.q(r2)
            if (r3 == 0) goto L2e
            r3 = 1
            r5.q(r2, r3)
            goto L31
        L2e:
            r5.p(r2)
        L31:
            int r1 = r1 + 1
            goto L9
        L34:
            return
    }

    public final void q(x1.f0 r2, boolean r3) {
            r1 = this;
            boolean r0 = r2.W
            if (r0 == 0) goto L5
            return
        L5:
            x1.f0 r0 = r1.f21057a
            if (r2 != r0) goto Lf
            u2.a r0 = r1.f21065i
            r0.getClass()
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r3 == 0) goto L16
            c(r2, r0)
            return
        L16:
            d(r2, r0)
            return
    }

    public final boolean r(x1.f0 r5, boolean r6) {
            r4 = this;
            x1.j0 r0 = r5.M
            x1.b0 r0 = r0.f20954d
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L5f
            r2 = 1
            if (r0 == r2) goto L5f
            r3 = 2
            if (r0 == r3) goto L55
            r3 = 3
            if (r0 == r3) goto L55
            r3 = 4
            if (r0 != r3) goto L50
            boolean r0 = r5.q()
            if (r0 == 0) goto L20
            if (r6 != 0) goto L20
            goto L5f
        L20:
            x1.j0 r6 = r5.M
            x1.v0 r6 = r6.f20966p
            r6.A = r2
            boolean r6 = r5.W
            if (r6 == 0) goto L2b
            goto L5f
        L2b:
            boolean r6 = r5.H()
            if (r6 != 0) goto L37
            boolean r6 = j(r5)
            if (r6 == 0) goto L5f
        L37:
            x1.f0 r6 = r5.u()
            if (r6 == 0) goto L44
            boolean r6 = r6.q()
            if (r6 != r2) goto L44
            goto L4b
        L44:
            b5.c r6 = r4.f21058b
            x1.s r0 = x1.s.f21042i
            r6.b(r5, r0)
        L4b:
            boolean r5 = r4.f21060d
            if (r5 != 0) goto L5f
            return r2
        L50:
            okio.a.k()
            r5 = 0
            return r5
        L55:
            x1.s0 r0 = new x1.s0
            r0.<init>(r5, r1, r6)
            j0.b r5 = r4.f21064h
            r5.b(r0)
        L5f:
            return r1
    }

    public final void s(long r3) {
            r2 = this;
            u2.a r0 = r2.f21065i
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            long r0 = r0.f13338a
            boolean r0 = u2.a.b(r0, r3)
        Lc:
            if (r0 != 0) goto L39
            boolean r0 = r2.f21059c
            if (r0 == 0) goto L17
            java.lang.String r0 = "updateRootConstraints called while measuring"
            u1.a.a(r0)
        L17:
            u2.a r0 = new u2.a
            r0.<init>(r3)
            r2.f21065i = r0
            x1.f0 r3 = r2.f21057a
            x1.f0 r4 = r3.f20896n
            x1.j0 r0 = r3.M
            r1 = 1
            if (r4 == 0) goto L29
            r0.f20955e = r1
        L29:
            x1.v0 r0 = r0.f20966p
            r0.A = r1
            if (r4 == 0) goto L32
            x1.s r4 = x1.s.f21040g
            goto L34
        L32:
            x1.s r4 = x1.s.f21042i
        L34:
            b5.c r0 = r2.f21058b
            r0.b(r3, r4)
        L39:
            return
    }
}
