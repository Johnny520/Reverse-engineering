package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends x1.j implements x1.z1, x1.n, x1.h, x1.m1, x1.e2 {
    public static final k.b C = null;
    public x1.i1 A;
    public final d1.b0 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n.k f6995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fg.l f6996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n.f f6997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s.h0 f6998z;

    static {
            k.b r0 = new k.b
            r0.<init>()
            k.i0.C = r0
            return
    }

    public i0(n.k r10, int r11, c0.f r12) {
            r9 = this;
            r9.<init>()
            r9.f6995w = r10
            r9.f6996x = r12
            ia.t r0 = new ia.t
            r7 = 0
            r8 = 7
            r1 = 2
            java.lang.Class<k.i0> r3 = k.i0.class
            java.lang.String r4 = "onFocusStateChange"
            java.lang.String r5 = "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            d1.b0 r10 = new d1.b0
            r12 = 10
            r10.<init>(r11, r0, r12)
            r9.k1(r10)
            r2.B = r10
            return
    }

    @Override // x1.m1
    public final void C0() {
            r3 = this;
            gg.u r0 = new gg.u
            r0.<init>()
            aa.c r1 = new aa.c
            r2 = 21
            r1.<init>(r0, r2, r3)
            x1.k.r(r3, r1)
            java.lang.Object r0 = r0.f4564g
            s.h0 r0 = (s.h0) r0
            d1.b0 r1 = r3.B
            d1.z r1 = r1.p1()
            boolean r1 = r1.a()
            if (r1 == 0) goto L2f
            s.h0 r1 = r3.f6998z
            if (r1 == 0) goto L26
            r1.b()
        L26:
            if (r0 == 0) goto L2c
            r0.a()
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r3.f6998z = r0
        L2f:
            return
    }

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            k.b r0 = k.i0.C
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r12) {
            r11 = this;
            d1.b0 r0 = r11.B
            d1.z r0 = r0.p1()
            boolean r0 = r0.a()
            mg.d[] r1 = f2.w.f3251a
            f2.x r1 = f2.u.f3234l
            mg.d[] r2 = f2.w.f3251a
            r3 = 4
            r2 = r2[r3]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.a(r1, r0)
            b0.v r2 = new b0.v
            r9 = 0
            r10 = 3
            r3 = 0
            java.lang.Class<k.i0> r5 = k.i0.class
            java.lang.String r6 = "requestFocus"
            java.lang.String r7 = "requestFocus()Z"
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            f2.x r0 = f2.l.f3200w
            f2.a r1 = new f2.a
            r3 = 0
            r1.<init>(r3, r2)
            r12.a(r0, r1)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void e1() {
            r1 = this;
            s.h0 r0 = r1.f6998z
            if (r0 == 0) goto L7
            r0.b()
        L7:
            r0 = 0
            r1.f6998z = r0
            return
    }

    public final void n1(n.k r8, n.j r9) {
            r7 = this;
            boolean r0 = r7.f21832t
            if (r0 == 0) goto L37
            qg.t r0 = r7.Y0()
            vg.c r0 = (vg.c) r0
            wf.g r0 = r0.f14326g
            qg.q r1 = qg.q.f11090h
            wf.e r0 = r0.s(r1)
            qg.r0 r0 = (qg.r0) r0
            r5 = 0
            if (r0 == 0) goto L24
            c9.i r1 = new c9.i
            r2 = 29
            r1.<init>(r8, r2, r9)
            qg.d0 r0 = r0.o(r1)
            r4 = r0
            goto L25
        L24:
            r4 = r5
        L25:
            qg.t r0 = r7.Y0()
            c0.m r1 = new c0.m
            r6 = 8
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = 3
            qg.v.q(r0, r5, r1, r8)
            return
        L37:
            r2 = r8
            r3 = r9
            r2.b(r3)
            return
    }

    public final void o1(n.k r4) {
            r3 = this;
            n.k r0 = r3.f6995w
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto L1d
            n.k r0 = r3.f6995w
            if (r0 == 0) goto L18
            n.f r1 = r3.f6997y
            if (r1 == 0) goto L18
            n.g r2 = new n.g
            r2.<init>(r1)
            r0.b(r2)
        L18:
            r0 = 0
            r3.f6997y = r0
            r3.f6995w = r4
        L1d:
            return
    }

    @Override // x1.n
    public final void w(x1.i1 r2) {
            r1 = this;
            r1.A = r2
            d1.b0 r0 = r1.B
            d1.z r0 = r0.p1()
            boolean r0 = r0.a()
            if (r0 != 0) goto Lf
            goto L34
        Lf:
            y0.n r2 = r2.r1()
            boolean r2 = r2.f21832t
            k.b r0 = k.j0.f7005u
            if (r2 == 0) goto L2d
            x1.i1 r2 = r1.A
            if (r2 == 0) goto L34
            y0.n r2 = r2.r1()
            boolean r2 = r2.f21832t
            if (r2 == 0) goto L34
            boolean r2 = r1.f21832t
            if (r2 == 0) goto L34
            x1.k.j(r1, r0)
            return
        L2d:
            boolean r2 = r1.f21832t
            if (r2 == 0) goto L34
            x1.k.j(r1, r0)
        L34:
            return
    }
}
