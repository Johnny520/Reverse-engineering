package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class r extends ug.b implements tg.n, tg.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.a f13239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Object[] f13240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13244r;

    public r(int r1, int r2, sg.a r3) {
            r0 = this;
            r0.<init>()
            r0.f13237k = r1
            r0.f13238l = r2
            r0.f13239m = r3
            return
    }

    public static void j(tg.r r8, tg.e r9, wf.c r10) {
            boolean r0 = r10 instanceof tg.q
            if (r0 == 0) goto L13
            r0 = r10
            tg.q r0 = (tg.q) r0
            int r1 = r0.f13236m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13236m = r1
            goto L18
        L13:
            tg.q r0 = new tg.q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f13234k
            int r1 = r0.f13236m
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            qg.r0 r8 = r0.f13233j
            tg.t r9 = r0.f13232i
            tg.e r1 = r0.f13231h
            tg.r r4 = r0.f13230g
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            return
        L3f:
            qg.r0 r8 = r0.f13233j
            tg.t r9 = r0.f13232i
            tg.e r1 = r0.f13231h
            tg.r r4 = r0.f13230g
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            tg.t r9 = r0.f13232i
            tg.e r8 = r0.f13231h
            tg.r r1 = r0.f13230g
            f8.i.I0(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            f8.i.I0(r10)
            ug.d r10 = r8.a()
            tg.t r10 = (tg.t) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            wf.g r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            qg.q r4 = qg.q.f11090h     // Catch: java.lang.Throwable -> Laf
            wf.e r1 = r1.s(r4)     // Catch: java.lang.Throwable -> Laf
            qg.r0 r1 = (qg.r0) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.s(r9)     // Catch: java.lang.Throwable -> L36
            l3.q r5 = tg.s.f13245a     // Catch: java.lang.Throwable -> L36
            xf.a r6 = xf.a.f21579g
            if (r10 != r5) goto L90
            r0.f13230g = r4     // Catch: java.lang.Throwable -> L36
            r0.f13231h = r1     // Catch: java.lang.Throwable -> L36
            r0.f13232i = r9     // Catch: java.lang.Throwable -> L36
            r0.f13233j = r8     // Catch: java.lang.Throwable -> L36
            r0.f13236m = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.h(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.h()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.f13230g = r4     // Catch: java.lang.Throwable -> L36
            r0.f13231h = r1     // Catch: java.lang.Throwable -> L36
            r0.f13232i = r9     // Catch: java.lang.Throwable -> L36
            r0.f13233j = r8     // Catch: java.lang.Throwable -> L36
            r0.f13236m = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.e(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.f(r9)
            throw r8
    }

    @Override // tg.d
    public final java.lang.Object b(tg.e r1, wf.c r2) {
            r0 = this;
            j(r0, r1, r2)
            xf.a r1 = xf.a.f21579g
            return r1
    }

    @Override // ug.b
    public final ug.d c() {
            r3 = this;
            tg.t r0 = new tg.t
            r0.<init>()
            r1 = -1
            r0.f13248a = r1
            return r0
    }

    @Override // ug.b
    public final ug.d[] d() {
            r1 = this;
            r0 = 2
            tg.t[] r0 = new tg.t[r0]
            return r0
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r8, wf.c r9) {
            r7 = this;
            boolean r0 = r7.p(r8)
            if (r0 == 0) goto L9
            sf.n r8 = sf.n.f12433a
            return r8
        L9:
            qg.g r5 = new qg.g
            wf.c r9 = fb.v0.x(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.p()
            wf.c[] r9 = ug.c.f13806a
            monitor-enter(r7)
            boolean r0 = r7.q(r8)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L2f
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L2b
            r5.resumeWith(r8)     // Catch: java.lang.Throwable -> L2b
            wf.c[] r8 = r7.m(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L58
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L88
        L2f:
            tg.p r0 = new tg.p     // Catch: java.lang.Throwable -> L85
            long r1 = r7.n()     // Catch: java.lang.Throwable -> L85
            int r3 = r7.f13243q     // Catch: java.lang.Throwable -> L85
            int r4 = r7.f13244r     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L53
            r7.l(r0)     // Catch: java.lang.Throwable -> L53
            int r8 = r1.f13244r     // Catch: java.lang.Throwable -> L53
            int r8 = r8 + r6
            r1.f13244r = r8     // Catch: java.lang.Throwable -> L53
            int r8 = r1.f13238l     // Catch: java.lang.Throwable -> L53
            if (r8 != 0) goto L56
            wf.c[] r9 = r7.m(r9)     // Catch: java.lang.Throwable -> L53
            goto L56
        L53:
            r0 = move-exception
        L54:
            r8 = r0
            goto L88
        L56:
            r8 = r9
            r9 = r0
        L58:
            monitor-exit(r7)
            if (r9 == 0) goto L64
            qg.e r0 = new qg.e
            r2 = 1
            r0.<init>(r9, r2)
            r5.s(r0)
        L64:
            int r9 = r8.length
            r0 = 0
        L66:
            if (r0 >= r9) goto L74
            r2 = r8[r0]
            if (r2 == 0) goto L71
            sf.n r3 = sf.n.f12433a
            r2.resumeWith(r3)
        L71:
            int r0 = r0 + 1
            goto L66
        L74:
            java.lang.Object r8 = r5.o()
            xf.a r9 = xf.a.f21579g
            if (r8 != r9) goto L7d
            goto L7f
        L7d:
            sf.n r8 = sf.n.f12433a
        L7f:
            if (r8 != r9) goto L82
            return r8
        L82:
            sf.n r8 = sf.n.f12433a
            return r8
        L85:
            r0 = move-exception
            r1 = r7
            goto L54
        L88:
            monitor-exit(r7)
            throw r8
    }

    public final java.lang.Object h(tg.t r6, tg.q r7) {
            r5 = this;
            qg.g r0 = new qg.g
            wf.c r7 = fb.v0.x(r7)
            r1 = 1
            r0.<init>(r1, r7)
            r0.p()
            monitor-enter(r5)
            long r1 = r5.r(r6)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1d
            r6.f13249b = r0     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r6 = move-exception
            goto L2f
        L1d:
            sf.n r6 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1b
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L1b
        L22:
            monitor-exit(r5)
            java.lang.Object r6 = r0.o()
            xf.a r7 = xf.a.f21579g
            if (r6 != r7) goto L2c
            return r6
        L2c:
            sf.n r6 = sf.n.f12433a
            return r6
        L2f:
            monitor-exit(r5)
            throw r6
    }

    public final void i() {
            r8 = this;
            int r0 = r8.f13238l
            r1 = 1
            if (r0 != 0) goto La
            int r0 = r8.f13244r
            if (r0 > r1) goto La
            goto L3f
        La:
            java.lang.Object[] r0 = r8.f13240n
            r0.getClass()
        Lf:
            int r2 = r8.f13244r
            if (r2 <= 0) goto L3f
            long r2 = r8.n()
            int r4 = r8.f13243q
            int r5 = r8.f13244r
            int r4 = r4 + r5
            long r6 = (long) r4
            long r2 = r2 + r6
            r6 = 1
            long r2 = r2 - r6
            int r2 = (int) r2
            int r3 = r0.length
            int r3 = r3 - r1
            r2 = r2 & r3
            r2 = r0[r2]
            l3.q r3 = tg.s.f13245a
            if (r2 != r3) goto L3f
            int r5 = r5 + (-1)
            r8.f13244r = r5
            long r2 = r8.n()
            int r4 = r8.f13243q
            int r5 = r8.f13244r
            int r4 = r4 + r5
            long r4 = (long) r4
            long r2 = r2 + r4
            r4 = 0
            tg.s.c(r0, r2, r4)
            goto Lf
        L3f:
            return
    }

    public final void k() {
            r10 = this;
            java.lang.Object[] r0 = r10.f13240n
            r0.getClass()
            long r1 = r10.n()
            r3 = 0
            tg.s.c(r0, r1, r3)
            int r0 = r10.f13243q
            int r0 = r0 + (-1)
            r10.f13243q = r0
            long r0 = r10.n()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r10.f13241o
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r10.f13241o = r0
        L22:
            long r2 = r10.f13242p
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4d
            int r2 = r10.f13803h
            if (r2 == 0) goto L4b
            ug.d[] r2 = r10.f13802g
            if (r2 == 0) goto L4b
            int r3 = r2.length
            r4 = 0
        L32:
            if (r4 >= r3) goto L4b
            r5 = r2[r4]
            if (r5 == 0) goto L48
            tg.t r5 = (tg.t) r5
            long r6 = r5.f13248a
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L48
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L48
            r5.f13248a = r0
        L48:
            int r4 = r4 + 1
            goto L32
        L4b:
            r10.f13242p = r0
        L4d:
            return
    }

    public final void l(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f13243q
            int r1 = r6.f13244r
            int r0 = r0 + r1
            java.lang.Object[] r1 = r6.f13240n
            r2 = 2
            if (r1 != 0) goto L11
            r1 = 0
            r3 = 0
            java.lang.Object[] r1 = r6.o(r1, r3, r2)
            goto L1a
        L11:
            int r3 = r1.length
            if (r0 < r3) goto L1a
            int r3 = r1.length
            int r3 = r3 * r2
            java.lang.Object[] r1 = r6.o(r1, r0, r3)
        L1a:
            long r2 = r6.n()
            long r4 = (long) r0
            long r2 = r2 + r4
            tg.s.c(r1, r2, r7)
            return
    }

    public final wf.c[] m(wf.c[] r11) {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f13803h
            if (r1 == 0) goto L3e
            ug.d[] r1 = r10.f13802g
            if (r1 == 0) goto L3e
            int r2 = r1.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L3e
            r4 = r1[r3]
            if (r4 == 0) goto L3b
            tg.t r4 = (tg.t) r4
            qg.g r5 = r4.f13249b
            if (r5 != 0) goto L18
            goto L3b
        L18:
            long r6 = r10.r(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L3b
            int r6 = r11.length
            if (r0 < r6) goto L30
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
        L30:
            r6 = r11
            wf.c[] r6 = (wf.c[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f13249b = r0
            r0 = r7
        L3b:
            int r3 = r3 + 1
            goto Lb
        L3e:
            wf.c[] r11 = (wf.c[]) r11
            return r11
    }

    public final long n() {
            r4 = this;
            long r0 = r4.f13242p
            long r2 = r4.f13241o
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    public final java.lang.Object[] o(java.lang.Object[] r8, int r9, int r10) {
            r7 = this;
            if (r10 <= 0) goto L20
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r7.f13240n = r10
            if (r8 != 0) goto L9
            goto L1f
        L9:
            long r0 = r7.n()
            r2 = 0
        Le:
            if (r2 >= r9) goto L1f
            long r3 = (long) r2
            long r3 = r3 + r0
            int r5 = (int) r3
            int r6 = r8.length
            int r6 = r6 + (-1)
            r5 = r5 & r6
            r5 = r8[r5]
            tg.s.c(r10, r3, r5)
            int r2 = r2 + 1
            goto Le
        L1f:
            return r10
        L20:
            java.lang.String r8 = "Buffer size overflow"
            j8.o.A(r8)
            r8 = 0
            return r8
    }

    public final boolean p(java.lang.Object r6) {
            r5 = this;
            wf.c[] r0 = ug.c.f13806a
            monitor-enter(r5)
            boolean r6 = r5.q(r6)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r6 == 0) goto L12
            wf.c[] r0 = r5.m(r0)     // Catch: java.lang.Throwable -> L10
            r6 = 1
            goto L13
        L10:
            r6 = move-exception
            goto L24
        L12:
            r6 = r1
        L13:
            monitor-exit(r5)
            int r2 = r0.length
        L15:
            if (r1 >= r2) goto L23
            r3 = r0[r1]
            if (r3 == 0) goto L20
            sf.n r4 = sf.n.f12433a
            r3.resumeWith(r4)
        L20:
            int r1 = r1 + 1
            goto L15
        L23:
            return r6
        L24:
            monitor-exit(r5)
            throw r6
    }

    public final boolean q(java.lang.Object r13) {
            r12 = this;
            int r1 = r12.f13803h
            int r2 = r12.f13237k
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.l(r13)
            int r1 = r12.f13243q
            int r1 = r1 + r9
            r12.f13243q = r1
            if (r1 <= r2) goto L18
            r12.k()
        L18:
            long r1 = r12.n()
            int r3 = r12.f13243q
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f13242p = r1
            return r9
        L23:
            int r1 = r12.f13243q
            int r3 = r12.f13238l
            if (r1 < r3) goto L46
            long r4 = r12.f13242p
            long r6 = r12.f13241o
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            sg.a r1 = r12.f13239m
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7e
        L3f:
            okio.a.k()
            r1 = 0
            return r1
        L44:
            r1 = 0
            return r1
        L46:
            r12.l(r13)
            int r1 = r12.f13243q
            int r1 = r1 + r9
            r12.f13243q = r1
            if (r1 <= r3) goto L53
            r12.k()
        L53:
            long r3 = r12.n()
            int r1 = r12.f13243q
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f13241o
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f13242p
            long r5 = r12.n()
            int r7 = r12.f13243q
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.n()
            int r10 = r12.f13243q
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f13244r
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.t(r1, r3, r5, r7)
        L7e:
            return r9
    }

    public final long r(tg.t r7) {
            r6 = this;
            long r0 = r7.f13248a
            long r2 = r6.n()
            int r7 = r6.f13243q
            long r4 = (long) r7
            long r2 = r2 + r4
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lf
            goto L23
        Lf:
            int r7 = r6.f13238l
            if (r7 <= 0) goto L14
            goto L21
        L14:
            long r2 = r6.n()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L1d
            goto L21
        L1d:
            int r7 = r6.f13244r
            if (r7 != 0) goto L23
        L21:
            r0 = -1
        L23:
            return r0
    }

    public final java.lang.Object s(tg.t r9) {
            r8 = this;
            wf.c[] r0 = ug.c.f13806a
            monitor-enter(r8)
            long r1 = r8.r(r9)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L12
            l3.q r9 = tg.s.f13245a     // Catch: java.lang.Throwable -> L10
            goto L34
        L10:
            r9 = move-exception
            goto L46
        L12:
            long r3 = r9.f13248a     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r0 = r8.f13240n     // Catch: java.lang.Throwable -> L10
            r0.getClass()     // Catch: java.lang.Throwable -> L10
            int r5 = (int) r1     // Catch: java.lang.Throwable -> L10
            int r6 = r0.length     // Catch: java.lang.Throwable -> L10
            int r6 = r6 + (-1)
            r5 = r5 & r6
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L10
            boolean r5 = r0 instanceof tg.p     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L28
            tg.p r0 = (tg.p) r0     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.f13228i     // Catch: java.lang.Throwable -> L10
        L28:
            r5 = 1
            long r1 = r1 + r5
            r9.f13248a = r1     // Catch: java.lang.Throwable -> L10
            wf.c[] r9 = r8.u(r3)     // Catch: java.lang.Throwable -> L10
            r7 = r0
            r0 = r9
            r9 = r7
        L34:
            monitor-exit(r8)
            int r1 = r0.length
            r2 = 0
        L37:
            if (r2 >= r1) goto L45
            r3 = r0[r2]
            if (r3 == 0) goto L42
            sf.n r4 = sf.n.f12433a
            r3.resumeWith(r4)
        L42:
            int r2 = r2 + 1
            goto L37
        L45:
            return r9
        L46:
            monitor-exit(r8)
            throw r9
    }

    public final void t(long r7, long r9, long r11, long r13) {
            r6 = this;
            long r0 = java.lang.Math.min(r9, r7)
            long r2 = r6.n()
        L8:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            java.lang.Object[] r4 = r6.f13240n
            r4.getClass()
            r5 = 0
            tg.s.c(r4, r2, r5)
            r4 = 1
            long r2 = r2 + r4
            goto L8
        L19:
            r6.f13241o = r7
            r6.f13242p = r9
            long r7 = r11 - r0
            int r7 = (int) r7
            r6.f13243q = r7
            long r13 = r13 - r11
            int r7 = (int) r13
            r6.f13244r = r7
            return
    }

    public final wf.c[] u(long r21) {
            r20 = this;
            r0 = r20
            l3.q r1 = tg.s.f13245a
            wf.c[] r2 = ug.c.f13806a
            long r3 = r0.f13242p
            int r3 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r3 <= 0) goto Ld
            goto L49
        Ld:
            long r3 = r0.n()
            int r5 = r0.f13243q
            long r5 = (long) r5
            long r5 = r5 + r3
            int r7 = r0.f13238l
            r8 = 1
            if (r7 != 0) goto L20
            int r10 = r0.f13244r
            if (r10 <= 0) goto L20
            long r5 = r5 + r8
        L20:
            int r10 = r0.f13803h
            r11 = 0
            if (r10 == 0) goto L43
            ug.d[] r10 = r0.f13802g
            if (r10 == 0) goto L43
            int r12 = r10.length
            r13 = r11
        L2b:
            if (r13 >= r12) goto L43
            r14 = r10[r13]
            if (r14 == 0) goto L40
            tg.t r14 = (tg.t) r14
            long r14 = r14.f13248a
            r16 = 0
            int r16 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r16 < 0) goto L40
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 >= 0) goto L40
            r5 = r14
        L40:
            int r13 = r13 + 1
            goto L2b
        L43:
            long r12 = r0.f13242p
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r10 > 0) goto L4a
        L49:
            return r2
        L4a:
            long r12 = r0.n()
            int r10 = r0.f13243q
            long r14 = (long) r10
            long r12 = r12 + r14
            int r10 = r0.f13803h
            int r14 = r0.f13244r
            if (r10 <= 0) goto L64
            r21 = r8
            long r8 = r12 - r5
            int r8 = (int) r8
            int r8 = r7 - r8
            int r14 = java.lang.Math.min(r14, r8)
            goto L66
        L64:
            r21 = r8
        L66:
            int r8 = r0.f13244r
            long r8 = (long) r8
            long r8 = r8 + r12
            if (r14 <= 0) goto Lb5
            wf.c[] r2 = new wf.c[r14]
            java.lang.Object[] r10 = r0.f13240n
            r10.getClass()
            r15 = r3
            r4 = r2
            r2 = r12
        L76:
            int r17 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r17 >= 0) goto Lb0
            r17 = r4
            int r4 = (int) r12
            r18 = r4
            int r4 = r10.length
            int r4 = r4 + (-1)
            r4 = r18 & r4
            r4 = r10[r4]
            if (r4 == r1) goto La7
            r4.getClass()
            tg.p r4 = (tg.p) r4
            r18 = r5
            int r5 = r11 + 1
            qg.g r6 = r4.f13229j
            r17[r11] = r6
            tg.s.c(r10, r12, r1)
            java.lang.Object r4 = r4.f13228i
            tg.s.c(r10, r2, r4)
            long r2 = r2 + r21
            if (r5 >= r14) goto La3
            r11 = r5
            goto La9
        La3:
            r12 = r2
            r10 = r17
            goto Lb9
        La7:
            r18 = r5
        La9:
            long r12 = r12 + r21
            r4 = r17
            r5 = r18
            goto L76
        Lb0:
            r17 = r4
            r18 = r5
            goto La3
        Lb5:
            r15 = r3
            r18 = r5
            r10 = r2
        Lb9:
            long r2 = r12 - r15
            int r2 = (int) r2
            int r3 = r0.f13803h
            if (r3 != 0) goto Lc2
            r3 = r12
            goto Lc4
        Lc2:
            r3 = r18
        Lc4:
            long r5 = r0.f13241o
            int r11 = r0.f13237k
            int r2 = java.lang.Math.min(r11, r2)
            long r14 = (long) r2
            long r14 = r12 - r14
            long r5 = java.lang.Math.max(r5, r14)
            if (r7 != 0) goto Lef
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto Lef
            java.lang.Object[] r2 = r0.f13240n
            r2.getClass()
            int r7 = (int) r5
            int r11 = r2.length
            int r11 = r11 + (-1)
            r7 = r7 & r11
            r2 = r2[r7]
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto Lef
            long r12 = r12 + r21
            long r5 = r5 + r21
        Lef:
            r1 = r5
            r7 = r8
            r5 = r12
            r0.t(r1, r3, r5, r7)
            r0.i()
            int r1 = r10.length
            if (r1 != 0) goto Lfc
            return r10
        Lfc:
            wf.c[] r1 = r0.m(r10)
            return r1
    }
}
