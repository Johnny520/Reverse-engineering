package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.n f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1.f0 f3212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2.m f3213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f2.q f3214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3215f;

    public q(y0.n r1, boolean r2, x1.f0 r3, f2.m r4) {
            r0 = this;
            r0.<init>()
            r0.f3210a = r1
            r0.f3211b = r2
            r0.f3212c = r3
            r0.f3213d = r4
            int r1 = r3.f20890h
            r0.f3215f = r1
            return
    }

    public static /* synthetic */ java.util.List j(int r3, f2.q r4) {
            r0 = r3 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            boolean r0 = r4.f3211b
            r0 = r0 ^ r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            java.util.List r3 = r4.i(r0, r1)
            return r3
    }

    public final e1.c a(x1.i1 r11) {
            r10 = this;
            f2.q r0 = r10.l()
            if (r0 != 0) goto L9
            e1.c r11 = e1.c.f2295e
            return r11
        L9:
            x1.f0 r1 = r0.f3212c
            x1.b1 r1 = r1.L
            y0.n r1 = r1.f20844f
            int r2 = r1.f21822j
            r3 = 8
            r2 = r2 & r3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L74
        L18:
            if (r1 == 0) goto L74
            int r2 = r1.f21821i
            r2 = r2 & r3
            if (r2 == 0) goto L6c
            r2 = r1
            r6 = r5
        L21:
            if (r2 == 0) goto L6c
            boolean r7 = r2 instanceof x1.z1
            if (r7 == 0) goto L31
            r7 = r2
            x1.z1 r7 = (x1.z1) r7
            boolean r7 = r7.A()
            if (r7 == 0) goto L67
            goto L75
        L31:
            int r7 = r2.f21821i
            r7 = r7 & r3
            if (r7 == 0) goto L67
            boolean r7 = r2 instanceof x1.j
            if (r7 == 0) goto L67
            r7 = r2
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = 0
        L40:
            if (r7 == 0) goto L64
            int r9 = r7.f21821i
            r9 = r9 & r3
            if (r9 == 0) goto L61
            int r8 = r8 + 1
            if (r8 != r4) goto L4d
            r2 = r7
            goto L61
        L4d:
            if (r6 != 0) goto L58
            j0.b r6 = new j0.b
            r9 = 16
            y0.n[] r9 = new y0.n[r9]
            r6.<init>(r9)
        L58:
            if (r2 == 0) goto L5e
            r6.b(r2)
            r2 = r5
        L5e:
            r6.b(r7)
        L61:
            y0.n r7 = r7.f21824l
            goto L40
        L64:
            if (r8 != r4) goto L67
            goto L21
        L67:
            y0.n r2 = x1.k.e(r6)
            goto L21
        L6c:
            int r2 = r1.f21822j
            r2 = r2 & r3
            if (r2 == 0) goto L74
            y0.n r1 = r1.f21824l
            goto L18
        L74:
            r2 = r5
        L75:
            x1.z1 r2 = (x1.z1) r2
            if (r2 == 0) goto L7d
            x1.i1 r5 = x1.k.t(r2, r3)
        L7d:
            if (r5 != 0) goto L84
            e1.c r11 = r0.a(r11)
            return r11
        L84:
            e1.c r11 = r5.k0(r11, r4)
            return r11
    }

    public final f2.q b(f2.i r6, fg.l r7) {
            r5 = this;
            f2.m r0 = new f2.m
            r0.<init>()
            r1 = 0
            r0.f3206i = r1
            r0.f3207j = r1
            r7.invoke(r0)
            f2.q r2 = new f2.q
            f2.p r3 = new f2.p
            r3.<init>(r7)
            x1.f0 r7 = new x1.f0
            int r4 = r5.f3215f
            if (r6 == 0) goto L1f
            r6 = 1000000000(0x3b9aca00, float:0.0047237873)
        L1d:
            int r4 = r4 + r6
            goto L23
        L1f:
            r6 = 2000000000(0x77359400, float:3.682842E33)
            goto L1d
        L23:
            r6 = 1
            r7.<init>(r4, r6)
            r2.<init>(r3, r1, r7, r0)
            r2.f3214e = r5
            return r2
    }

    public final void c(x1.f0 r6, java.util.ArrayList r7) {
            r5 = this;
            j0.b r6 = r6.x()
            java.lang.Object[] r0 = r6.f6671g
            int r6 = r6.f6673i
            r1 = 0
        L9:
            if (r1 >= r6) goto L33
            r2 = r0[r1]
            x1.f0 r2 = (x1.f0) r2
            boolean r3 = r2.G()
            if (r3 == 0) goto L30
            boolean r3 = r2.W
            if (r3 != 0) goto L30
            x1.b1 r3 = r2.L
            r4 = 8
            boolean r3 = r3.d(r4)
            if (r3 == 0) goto L2d
            boolean r3 = r5.f3211b
            f2.q r2 = f2.t.a(r2, r3)
            r7.add(r2)
            goto L30
        L2d:
            r5.c(r2, r7)
        L30:
            int r1 = r1 + 1
            goto L9
        L33:
            return
    }

    public final x1.i1 d() {
            r2 = this;
            boolean r0 = r2.o()
            if (r0 == 0) goto L13
            f2.q r0 = r2.l()
            if (r0 == 0) goto L11
            x1.i1 r0 = r0.d()
            return r0
        L11:
            r0 = 0
            return r0
        L13:
            x1.z1 r0 = r2.f()
            if (r0 == 0) goto L20
            r1 = 8
            x1.i1 r0 = x1.k.t(r0, r1)
            return r0
        L20:
            x1.f0 r0 = r2.f3212c
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            return r0
    }

    public final void e(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
            r4.s(r5, r1)
            int r1 = r5.size()
        Lc:
            if (r0 >= r1) goto L2a
            java.lang.Object r2 = r5.get(r0)
            f2.q r2 = (f2.q) r2
            boolean r3 = r2.p()
            if (r3 == 0) goto L1e
            r6.add(r2)
            goto L27
        L1e:
            f2.m r3 = r2.f3213d
            boolean r3 = r3.f3207j
            if (r3 != 0) goto L27
            r2.e(r5, r6)
        L27:
            int r0 = r0 + 1
            goto Lc
        L2a:
            return
    }

    public final x1.z1 f() {
            r11 = this;
            f2.m r0 = r11.f3213d
            boolean r0 = r0.f3206i
            r1 = 16
            r2 = 0
            r3 = 1
            r4 = 0
            x1.f0 r5 = r11.f3212c
            if (r0 == 0) goto L87
            x1.b1 r0 = r5.L
            y0.n r0 = r0.f20844f
            int r5 = r0.f21822j
            r5 = r5 & 8
            if (r5 == 0) goto Lef
            r5 = r4
        L18:
            if (r0 == 0) goto L84
            int r6 = r0.f21821i
            r6 = r6 & 8
            if (r6 == 0) goto L7b
            r6 = r0
            r7 = r4
        L22:
            if (r6 == 0) goto L7b
            boolean r8 = r6 instanceof x1.z1
            if (r8 == 0) goto L3d
            r8 = r6
            x1.z1 r8 = (x1.z1) r8
            boolean r9 = r8.A()
            if (r9 == 0) goto L3b
            boolean r9 = r8.S0()
            if (r9 == 0) goto L38
            return r8
        L38:
            if (r5 != 0) goto L3b
            r5 = r8
        L3b:
            r8 = r2
            goto L3e
        L3d:
            r8 = r3
        L3e:
            if (r8 == 0) goto L76
            int r8 = r6.f21821i
            r8 = r8 & 8
            if (r8 == 0) goto L76
            boolean r8 = r6 instanceof x1.j
            if (r8 == 0) goto L76
            r8 = r6
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = r2
        L50:
            if (r8 == 0) goto L73
            int r10 = r8.f21821i
            r10 = r10 & 8
            if (r10 == 0) goto L70
            int r9 = r9 + 1
            if (r9 != r3) goto L5e
            r6 = r8
            goto L70
        L5e:
            if (r7 != 0) goto L67
            j0.b r7 = new j0.b
            y0.n[] r10 = new y0.n[r1]
            r7.<init>(r10)
        L67:
            if (r6 == 0) goto L6d
            r7.b(r6)
            r6 = r4
        L6d:
            r7.b(r8)
        L70:
            y0.n r8 = r8.f21824l
            goto L50
        L73:
            if (r9 != r3) goto L76
            goto L22
        L76:
            y0.n r6 = x1.k.e(r7)
            goto L22
        L7b:
            int r6 = r0.f21822j
            r6 = r6 & 8
            if (r6 == 0) goto L84
            y0.n r0 = r0.f21824l
            goto L18
        L84:
            r4 = r5
            goto Lef
        L87:
            x1.b1 r0 = r5.L
            y0.n r0 = r0.f20844f
            int r5 = r0.f21822j
            r5 = r5 & 8
            if (r5 == 0) goto Lef
        L91:
            if (r0 == 0) goto Lef
            int r5 = r0.f21821i
            r5 = r5 & 8
            if (r5 == 0) goto Le6
            r5 = r0
            r6 = r4
        L9b:
            if (r5 == 0) goto Le6
            boolean r7 = r5 instanceof x1.z1
            if (r7 == 0) goto Lab
            r7 = r5
            x1.z1 r7 = (x1.z1) r7
            boolean r7 = r7.A()
            if (r7 == 0) goto Le1
            goto L84
        Lab:
            int r7 = r5.f21821i
            r7 = r7 & 8
            if (r7 == 0) goto Le1
            boolean r7 = r5 instanceof x1.j
            if (r7 == 0) goto Le1
            r7 = r5
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = r2
        Lbb:
            if (r7 == 0) goto Lde
            int r9 = r7.f21821i
            r9 = r9 & 8
            if (r9 == 0) goto Ldb
            int r8 = r8 + 1
            if (r8 != r3) goto Lc9
            r5 = r7
            goto Ldb
        Lc9:
            if (r6 != 0) goto Ld2
            j0.b r6 = new j0.b
            y0.n[] r9 = new y0.n[r1]
            r6.<init>(r9)
        Ld2:
            if (r5 == 0) goto Ld8
            r6.b(r5)
            r5 = r4
        Ld8:
            r6.b(r7)
        Ldb:
            y0.n r7 = r7.f21824l
            goto Lbb
        Lde:
            if (r8 != r3) goto Le1
            goto L9b
        Le1:
            y0.n r5 = x1.k.e(r6)
            goto L9b
        Le6:
            int r5 = r0.f21822j
            r5 = r5 & 8
            if (r5 == 0) goto Lef
            y0.n r0 = r0.f21824l
            goto L91
        Lef:
            x1.z1 r4 = (x1.z1) r4
            return r4
    }

    public final e1.c g() {
            r3 = this;
            x1.i1 r0 = r3.d()
            if (r0 == 0) goto L1c
            y0.n r1 = r0.r1()
            boolean r1 = r1.f21832t
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1c
            v1.t r1 = v1.w.h(r0)
            r2 = 1
            e1.c r0 = r1.k0(r0, r2)
            return r0
        L1c:
            e1.c r0 = e1.c.f2295e
            return r0
    }

    public final e1.c h() {
            r2 = this;
            x1.i1 r0 = r2.d()
            if (r0 == 0) goto L18
            y0.n r1 = r0.r1()
            boolean r1 = r1.f21832t
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L18
            r1 = 1
            e1.c r0 = v1.w.f(r0, r1)
            return r0
        L18:
            e1.c r0 = e1.c.f2295e
            return r0
    }

    public final java.util.List i(boolean r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto Lb
            f2.m r2 = r1.f3213d
            boolean r2 = r2.f3207j
            if (r2 == 0) goto Lb
            tf.t r2 = tf.t.f13167g
            return r2
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r1.p()
            if (r0 == 0) goto L1f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.e(r2, r3)
            return r3
        L1f:
            java.util.List r2 = r1.s(r2, r3)
            return r2
    }

    public final f2.m k() {
            r2 = this;
            boolean r0 = r2.p()
            f2.m r1 = r2.f3213d
            if (r0 == 0) goto L15
            f2.m r0 = r1.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.r(r1, r0)
            return r0
        L15:
            return r1
    }

    public final f2.q l() {
            r6 = this;
            f2.q r0 = r6.f3214e
            if (r0 == 0) goto L5
            return r0
        L5:
            x1.f0 r0 = r6.f3212c
            boolean r1 = r6.f3211b
            r2 = 0
            if (r1 == 0) goto L23
            x1.f0 r3 = r0.u()
        L10:
            if (r3 == 0) goto L23
            f2.m r4 = r3.w()
            if (r4 == 0) goto L1e
            boolean r4 = r4.f3206i
            r5 = 1
            if (r4 != r5) goto L1e
            goto L24
        L1e:
            x1.f0 r3 = r3.u()
            goto L10
        L23:
            r3 = r2
        L24:
            if (r3 != 0) goto L3e
            x1.f0 r0 = r0.u()
        L2a:
            if (r0 == 0) goto L3d
            x1.b1 r3 = r0.L
            r4 = 8
            boolean r3 = r3.d(r4)
            if (r3 == 0) goto L38
            r3 = r0
            goto L3e
        L38:
            x1.f0 r0 = r0.u()
            goto L2a
        L3d:
            r3 = r2
        L3e:
            if (r3 != 0) goto L41
            return r2
        L41:
            f2.q r0 = f2.t.a(r3, r1)
            return r0
    }

    public final e1.c m() {
            r3 = this;
            x1.z1 r0 = r3.f()
            if (r0 != 0) goto L11
            x1.f0 r0 = r3.f3212c
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            e1.c r0 = r0.N1()
            return r0
        L11:
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            f2.x r1 = f2.l.f3179b
            f2.m r2 = r3.f3213d
            f.k0 r2 = r2.f3204g
            java.lang.Object r1 = r2.g(r1)
            if (r1 != 0) goto L22
            r1 = 0
        L22:
            r2 = 1
            if (r1 == 0) goto L27
            r1 = r2
            goto L28
        L27:
            r1 = 0
        L28:
            e1.c r0 = x1.k.i(r0, r1, r2)
            return r0
    }

    public final f2.m n() {
            r1 = this;
            f2.m r0 = r1.f3213d
            return r0
    }

    public final boolean o() {
            r1 = this;
            f2.q r0 = r1.f3214e
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean p() {
            r1 = this;
            boolean r0 = r1.f3211b
            if (r0 == 0) goto Lc
            f2.m r0 = r1.f3213d
            boolean r0 = r0.f3206i
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean q() {
            r3 = this;
            boolean r0 = r3.o()
            if (r0 != 0) goto L2e
            r0 = 4
            java.util.List r0 = j(r0, r3)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            x1.f0 r0 = r3.f3212c
            x1.f0 r0 = r0.u()
        L17:
            r1 = 1
            if (r0 == 0) goto L2a
            f2.m r2 = r0.w()
            if (r2 == 0) goto L25
            boolean r2 = r2.f3206i
            if (r2 != r1) goto L25
            goto L2b
        L25:
            x1.f0 r0 = r0.u()
            goto L17
        L2a:
            r0 = 0
        L2b:
            if (r0 != 0) goto L2e
            return r1
        L2e:
            r0 = 0
            return r0
    }

    public final void r(java.util.ArrayList r5, f2.m r6) {
            r4 = this;
            f2.m r0 = r4.f3213d
            boolean r0 = r0.f3207j
            if (r0 != 0) goto L2b
            int r0 = r5.size()
            r1 = 0
            r4.s(r5, r1)
            int r1 = r5.size()
        L12:
            if (r0 >= r1) goto L2b
            java.lang.Object r2 = r5.get(r0)
            f2.q r2 = (f2.q) r2
            boolean r3 = r2.p()
            if (r3 != 0) goto L28
            f2.m r3 = r2.f3213d
            r6.e(r3)
            r2.r(r5, r6)
        L28:
            int r0 = r0 + 1
            goto L12
        L2b:
            return
    }

    public final java.util.List s(java.util.ArrayList r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.o()
            if (r0 == 0) goto L9
            tf.t r6 = tf.t.f13167g
            return r6
        L9:
            x1.f0 r0 = r5.f3212c
            r5.c(r0, r6)
            if (r7 == 0) goto L70
            f2.m r7 = r5.f3213d
            f.k0 r0 = r7.f3204g
            f2.x r1 = f2.u.f3247y
            java.lang.Object r1 = r0.g(r1)
            r2 = 0
            if (r1 != 0) goto L1e
            r1 = r2
        L1e:
            f2.i r1 = (f2.i) r1
            if (r1 == 0) goto L3a
            boolean r3 = r7.f3206i
            if (r3 == 0) goto L3a
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L3a
            b1.f r3 = new b1.f
            r4 = 8
            r3.<init>(r1, r4)
            f2.q r1 = r5.b(r1, r3)
            r6.add(r1)
        L3a:
            f2.x r1 = f2.u.f3223a
            boolean r3 = r0.c(r1)
            if (r3 == 0) goto L70
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L70
            boolean r7 = r7.f3206i
            if (r7 == 0) goto L70
            java.lang.Object r7 = r0.g(r1)
            if (r7 != 0) goto L53
            r7 = r2
        L53:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5e
            java.lang.Object r7 = tf.m.v1(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L5f
        L5e:
            r7 = r2
        L5f:
            if (r7 == 0) goto L70
            b1.f r0 = new b1.f
            r1 = 9
            r0.<init>(r7, r1)
            f2.q r7 = r5.b(r2, r0)
            r0 = 0
            r6.add(r0, r7)
        L70:
            return r6
    }
}
