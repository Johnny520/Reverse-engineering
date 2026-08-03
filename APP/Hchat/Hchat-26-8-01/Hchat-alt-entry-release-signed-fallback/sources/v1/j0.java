package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements i0.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x1.f0 f13955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0.o f13956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v1.l1 f13957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.k0 f13960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.k0 f13961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v1.d0 f13962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v1.a0 f13963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f.k0 f13964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.u0 f13965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.k0 f13966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0.b f13967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13968t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13969u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.lang.String f13970v;

    public j0(x1.f0 r1, v1.l1 r2) {
            r0 = this;
            r0.<init>()
            r0.f13955g = r1
            r0.f13957i = r2
            long[] r1 = f.r0.f2895a
            f.k0 r1 = new f.k0
            r1.<init>()
            r0.f13960l = r1
            f.k0 r1 = new f.k0
            r1.<init>()
            r0.f13961m = r1
            v1.d0 r1 = new v1.d0
            r1.<init>(r0)
            r0.f13962n = r1
            v1.a0 r1 = new v1.a0
            r1.<init>(r0)
            r0.f13963o = r1
            f.k0 r1 = new f.k0
            r1.<init>()
            r0.f13964p = r1
            f.u0 r1 = new f.u0
            r1.<init>()
            r0.f13965q = r1
            f.k0 r1 = new f.k0
            r1.<init>()
            r0.f13966r = r1
            j0.b r1 = new j0.b
            r2 = 16
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.<init>(r2)
            r0.f13967s = r1
            java.lang.String r1 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."
            r0.f13970v = r1
            return
    }

    public static final void c(v1.j0 r6, java.lang.Object r7) {
            x1.f0 r0 = r6.f13955g
            r6.h()
            f.k0 r1 = r6.f13964p
            java.lang.Object r1 = r1.k(r7)
            x1.f0 r1 = (x1.f0) r1
            r2 = 1
            if (r1 == 0) goto L6f
            int r3 = r6.f13969u
            if (r3 <= 0) goto L15
            goto L1a
        L15:
            java.lang.String r3 = "No pre-composed items to dispose"
            u1.a.b(r3)
        L1a:
            java.util.List r3 = r0.o()
            f.d0 r3 = (f.d0) r3
            java.lang.Object r3 = r3.f2789h
            j0.b r3 = (j0.b) r3
            int r3 = r3.i(r1)
            java.util.List r4 = r0.o()
            f.d0 r4 = (f.d0) r4
            java.lang.Object r4 = r4.f2789h
            j0.b r4 = (j0.b) r4
            int r4 = r4.f6673i
            int r5 = r6.f13969u
            int r4 = r4 - r5
            if (r3 < r4) goto L3a
            goto L3f
        L3a:
            java.lang.String r4 = "Item is not in pre-composed item range"
            u1.a.b(r4)
        L3f:
            int r4 = r6.f13968t
            int r4 = r4 + r2
            r6.f13968t = r4
            int r4 = r6.f13969u
            int r4 = r4 + (-1)
            r6.f13969u = r4
            f.k0 r4 = r6.f13960l
            java.lang.Object r1 = r4.g(r1)
            v1.b0 r1 = (v1.b0) r1
            if (r1 == 0) goto L57
            e(r1)
        L57:
            java.util.List r1 = r0.o()
            f.d0 r1 = (f.d0) r1
            java.lang.Object r1 = r1.f2789h
            j0.b r1 = (j0.b) r1
            int r1 = r1.f6673i
            int r4 = r6.f13969u
            int r1 = r1 - r4
            int r4 = r6.f13968t
            int r1 = r1 - r4
            r6.j(r3, r1)
            r6.g(r1)
        L6f:
            j0.b r6 = r6.f13967s
            boolean r6 = r6.h(r7)
            if (r6 == 0) goto L7b
            r6 = 6
            x1.f0.V(r0, r2, r6)
        L7b:
            return
    }

    public static void e(v1.b0 r5) {
            i0.l1 r0 = r5.f13897f
            if (r0 == 0) goto L49
            java.util.concurrent.atomic.AtomicReference r1 = r0.f5961h
            i0.m1 r2 = i0.m1.f5974h
            r1.set(r2)
            b5.i r1 = r0.f5964k
            java.lang.Object r2 = r1.f479e
            f.l0 r2 = (f.l0) r2
            boolean r2 = r2.h()
            r3 = 0
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.f479e
            f.l0 r2 = (f.l0) r2
            f.l0 r4 = f.s0.f2899a
            f.l0 r4 = new f.l0
            r4.<init>()
            r1.f479e = r4
            java.lang.Object r4 = r1.f478d
            j0.b r4 = (j0.b) r4
            r4.g()
            goto L2e
        L2d:
            r2 = r3
        L2e:
            r1.b()
            i0.q r0 = r0.f5954a
            r0.f6012w = r3
            if (r2 == 0) goto L3e
            b5.i r1 = r0.A
            r1.f485k = r2
            r1 = 2
            r0.C = r1
        L3e:
            r5.f13897f = r3
            i0.q r0 = r5.f13894c
            if (r0 == 0) goto L47
            r0.m()
        L47:
            r5.f13894c = r3
        L49:
            return
    }

    @Override // i0.h
    public final void a() {
            r17 = this;
            r0 = r17
            r1 = 1
            x1.f0 r2 = r0.f13955g
            r2.f20905w = r1
            f.k0 r1 = r0.f13960l
            java.lang.Object[] r3 = r1.f2850c
            long[] r4 = r1.f2848a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            v1.b0 r13 = (v1.b0) r13
            i0.q r13 = r13.f13894c
            if (r13 == 0) goto L47
            r13.m()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.P()
            r2.f20905w = r6
            r1.a()
            f.k0 r1 = r0.f13961m
            r1.a()
            r0.f13969u = r6
            r0.f13968t = r6
            f.k0 r1 = r0.f13964p
            r1.a()
            r0.h()
            return
    }

    @Override // i0.h
    public final void b() {
            r1 = this;
            r0 = 1
            r1.i(r0)
            return
    }

    public final void d(v1.b0 r8, boolean r9) {
            r7 = this;
            i0.l1 r0 = r8.f13897f
            if (r0 == 0) goto L42
            w0.f r1 = w0.q.e()
            r2 = 0
            if (r1 == 0) goto L10
            fg.l r3 = r1.e()
            goto L11
        L10:
            r3 = r2
        L11:
            w0.f r4 = w0.q.h(r1)
            x1.f0 r5 = r7.f13955g     // Catch: java.lang.Throwable -> L3b
            r6 = 1
            r5.f20905w = r6     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L2f
        L1c:
            boolean r9 = r0.c()     // Catch: java.lang.Throwable -> L2d
            if (r9 != 0) goto L2f
            okio.a r9 = new okio.a     // Catch: java.lang.Throwable -> L2d
            r6 = 21
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            r0.e(r9)     // Catch: java.lang.Throwable -> L2d
            goto L1c
        L2d:
            r8 = move-exception
            goto L3d
        L2f:
            r0.a()     // Catch: java.lang.Throwable -> L2d
            r8.f13897f = r2     // Catch: java.lang.Throwable -> L3b
            r8 = 0
            r5.f20905w = r8     // Catch: java.lang.Throwable -> L3b
            w0.q.k(r1, r4, r3)
            return
        L3b:
            r8 = move-exception
            goto L3e
        L3d:
            throw r8     // Catch: java.lang.Throwable -> L3b
        L3e:
            w0.q.k(r1, r4, r3)
            throw r8
        L42:
            return
    }

    public final v1.h1 f(java.lang.Object r2) {
            r1 = this;
            x1.f0 r0 = r1.f13955g
            boolean r0 = r0.G()
            if (r0 != 0) goto Le
            v1.g0 r2 = new v1.g0
            r2.<init>()
            return r2
        Le:
            v1.h0 r0 = new v1.h0
            r0.<init>(r1, r2)
            return r0
    }

    public final void g(int r14) {
            r13 = this;
            r0 = 0
            r13.f13968t = r0
            x1.f0 r1 = r13.f13955g
            java.util.List r1 = r1.o()
            r2 = r1
            f.d0 r2 = (f.d0) r2
            java.lang.Object r3 = r2.f2789h
            j0.b r3 = (j0.b) r3
            int r3 = r3.f6673i
            int r4 = r13.f13969u
            int r3 = r3 - r4
            r4 = 1
            int r3 = r3 - r4
            if (r14 > r3) goto Ld1
            f.u0 r5 = r13.f13965q
            r5.clear()
            if (r14 > r3) goto L42
            r5 = r14
        L21:
            java.lang.Object r6 = r2.get(r5)
            x1.f0 r6 = (x1.f0) r6
            f.k0 r7 = r13.f13960l
            java.lang.Object r6 = r7.g(r6)
            r6.getClass()
            v1.b0 r6 = (v1.b0) r6
            java.lang.Object r6 = r6.f13892a
            f.u0 r7 = r13.f13965q
            java.lang.Object r7 = r7.f2914h
            f.g0 r7 = (f.g0) r7
            r7.a(r6)
            if (r5 == r3) goto L42
            int r5 = r5 + 1
            goto L21
        L42:
            v1.l1 r2 = r13.f13957i
            f.u0 r5 = r13.f13965q
            r2.f(r5)
            w0.f r2 = w0.q.e()
            if (r2 == 0) goto L54
            fg.l r5 = r2.e()
            goto L55
        L54:
            r5 = 0
        L55:
            w0.f r6 = w0.q.h(r2)
            r7 = r0
        L5a:
            if (r3 < r14) goto Lcd
            r8 = r1
            f.d0 r8 = (f.d0) r8     // Catch: java.lang.Throwable -> La8
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> La8
            x1.f0 r8 = (x1.f0) r8     // Catch: java.lang.Throwable -> La8
            f.k0 r9 = r13.f13960l     // Catch: java.lang.Throwable -> La8
            java.lang.Object r9 = r9.g(r8)     // Catch: java.lang.Throwable -> La8
            r9.getClass()     // Catch: java.lang.Throwable -> La8
            v1.b0 r9 = (v1.b0) r9     // Catch: java.lang.Throwable -> La8
            java.lang.Object r10 = r9.f13892a     // Catch: java.lang.Throwable -> La8
            f.u0 r11 = r13.f13965q     // Catch: java.lang.Throwable -> La8
            java.lang.Object r11 = r11.f2914h     // Catch: java.lang.Throwable -> La8
            f.g0 r11 = (f.g0) r11     // Catch: java.lang.Throwable -> La8
            boolean r11 = r11.c(r10)     // Catch: java.lang.Throwable -> La8
            if (r11 == 0) goto Laa
            int r11 = r13.f13968t     // Catch: java.lang.Throwable -> La8
            int r11 = r11 + r4
            r13.f13968t = r11     // Catch: java.lang.Throwable -> La8
            i0.j1 r11 = r9.f13898g     // Catch: java.lang.Throwable -> La8
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La8
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> La8
            if (r11 == 0) goto Lc1
            x1.j0 r8 = r8.M     // Catch: java.lang.Throwable -> La8
            x1.v0 r11 = r8.f20966p     // Catch: java.lang.Throwable -> La8
            x1.d0 r12 = x1.d0.f20870i     // Catch: java.lang.Throwable -> La8
            r11.f21082r = r12     // Catch: java.lang.Throwable -> La8
            x1.r0 r8 = r8.f20967q     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto L9f
            r8.f21029p = r12     // Catch: java.lang.Throwable -> La8
        L9f:
            r13.l(r9, r0)     // Catch: java.lang.Throwable -> La8
            boolean r8 = r9.f13899h     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto Lc1
            r7 = r4
            goto Lc1
        La8:
            r14 = move-exception
            goto Lc9
        Laa:
            x1.f0 r11 = r13.f13955g     // Catch: java.lang.Throwable -> La8
            r11.f20905w = r4     // Catch: java.lang.Throwable -> La8
            f.k0 r12 = r13.f13960l     // Catch: java.lang.Throwable -> La8
            r12.k(r8)     // Catch: java.lang.Throwable -> La8
            i0.q r8 = r9.f13894c     // Catch: java.lang.Throwable -> La8
            if (r8 == 0) goto Lba
            r8.m()     // Catch: java.lang.Throwable -> La8
        Lba:
            x1.f0 r8 = r13.f13955g     // Catch: java.lang.Throwable -> La8
            r8.Q(r3, r4)     // Catch: java.lang.Throwable -> La8
            r11.f20905w = r0     // Catch: java.lang.Throwable -> La8
        Lc1:
            f.k0 r8 = r13.f13961m     // Catch: java.lang.Throwable -> La8
            r8.k(r10)     // Catch: java.lang.Throwable -> La8
            int r3 = r3 + (-1)
            goto L5a
        Lc9:
            w0.q.k(r2, r6, r5)
            throw r14
        Lcd:
            w0.q.k(r2, r6, r5)
            goto Ld2
        Ld1:
            r7 = r0
        Ld2:
            if (r7 == 0) goto Lee
            java.lang.Object r14 = w0.m.f14786c
            monitor-enter(r14)
            w0.a r1 = w0.m.f14793j     // Catch: java.lang.Throwable -> Leb
            f.l0 r1 = r1.f14751h     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto Le4
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> Leb
            if (r1 != r4) goto Le4
            r0 = r4
        Le4:
            monitor-exit(r14)
            if (r0 == 0) goto Lee
            w0.m.a()
            goto Lee
        Leb:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        Lee:
            r13.h()
            return
    }

    public final void h() {
            r4 = this;
            x1.f0 r0 = r4.f13955g
            java.util.List r0 = r0.o()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r0 = r0.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
            f.k0 r1 = r4.f13960l
            int r2 = r1.f2852e
            if (r2 != r0) goto L15
            goto L35
        L15:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency between the count of nodes tracked by the state ("
            r2.<init>(r3)
            int r1 = r1.f2852e
            r2.append(r1)
            java.lang.String r1 = ") and the children count on the SubcomposeLayout ("
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = "). Are you trying to use the state of the disposed SubcomposeLayout?"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            u1.a.a(r1)
        L35:
            int r1 = r4.f13968t
            int r1 = r0 - r1
            int r2 = r4.f13969u
            int r1 = r1 - r2
            if (r1 < 0) goto L3f
            goto L5d
        L3f:
            java.lang.String r1 = "Incorrect state. Total children "
            java.lang.String r2 = ". Reusable children "
            java.lang.StringBuilder r0 = eh.a.t(r0, r1, r2)
            int r1 = r4.f13968t
            r0.append(r1)
            java.lang.String r1 = ". Precomposed children "
            r0.append(r1)
            int r1 = r4.f13969u
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.a(r0)
        L5d:
            f.k0 r0 = r4.f13964p
            int r1 = r0.f2852e
            int r2 = r4.f13969u
            if (r1 != r2) goto L66
            return
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Incorrect state. Precomposed children "
            r1.<init>(r2)
            int r2 = r4.f13969u
            r1.append(r2)
            java.lang.String r2 = ". Map size "
            r1.append(r2)
            int r0 = r0.f2852e
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            u1.a.a(r0)
            return
    }

    public final void i(boolean r11) {
            r10 = this;
            r0 = 0
            r10.f13969u = r0
            f.k0 r1 = r10.f13964p
            r1.a()
            x1.f0 r1 = r10.f13955g
            java.util.List r1 = r1.o()
            r2 = r1
            f.d0 r2 = (f.d0) r2
            java.lang.Object r2 = r2.f2789h
            j0.b r2 = (j0.b) r2
            int r2 = r2.f6673i
            int r3 = r10.f13968t
            if (r3 == r2) goto L77
            r10.f13968t = r2
            w0.f r3 = w0.q.e()
            if (r3 == 0) goto L28
            fg.l r4 = r3.e()
            goto L29
        L28:
            r4 = 0
        L29:
            w0.f r5 = w0.q.h(r3)
        L2d:
            if (r0 >= r2) goto L6f
            r6 = r1
            f.d0 r6 = (f.d0) r6     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Throwable -> L66
            x1.f0 r6 = (x1.f0) r6     // Catch: java.lang.Throwable -> L66
            f.k0 r7 = r10.f13960l     // Catch: java.lang.Throwable -> L66
            java.lang.Object r7 = r7.g(r6)     // Catch: java.lang.Throwable -> L66
            v1.b0 r7 = (v1.b0) r7     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L68
            i0.j1 r8 = r7.f13898g     // Catch: java.lang.Throwable -> L66
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L66
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L66
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L68
            x1.j0 r6 = r6.M     // Catch: java.lang.Throwable -> L66
            x1.v0 r8 = r6.f20966p     // Catch: java.lang.Throwable -> L66
            x1.d0 r9 = x1.d0.f20870i     // Catch: java.lang.Throwable -> L66
            r8.f21082r = r9     // Catch: java.lang.Throwable -> L66
            x1.r0 r6 = r6.f20967q     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L5e
            r6.f21029p = r9     // Catch: java.lang.Throwable -> L66
        L5e:
            r10.l(r7, r11)     // Catch: java.lang.Throwable -> L66
            v1.s0 r6 = v1.w.f14050a     // Catch: java.lang.Throwable -> L66
            r7.f13892a = r6     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r11 = move-exception
            goto L6b
        L68:
            int r0 = r0 + 1
            goto L2d
        L6b:
            w0.q.k(r3, r5, r4)
            throw r11
        L6f:
            w0.q.k(r3, r5, r4)
            f.k0 r11 = r10.f13961m
            r11.a()
        L77:
            r10.h()
            return
    }

    public final void j(int r3, int r4) {
            r2 = this;
            x1.f0 r0 = r2.f13955g
            r1 = 1
            r0.f20905w = r1
            r0.K(r3, r4, r1)
            r3 = 0
            r0.f20905w = r3
            return
    }

    public final void k(java.lang.Object r7, fg.p r8, boolean r9) {
            r6 = this;
            x1.f0 r0 = r6.f13955g
            boolean r1 = r0.G()
            if (r1 != 0) goto L9
            goto L73
        L9:
            r6.h()
            f.k0 r1 = r6.f13961m
            boolean r1 = r1.c(r7)
            if (r1 != 0) goto L73
            f.k0 r1 = r6.f13966r
            r1.k(r7)
            f.k0 r1 = r6.f13964p
            java.lang.Object r2 = r1.g(r7)
            if (r2 != 0) goto L6e
            x1.f0 r2 = r6.n(r7)
            r3 = 1
            if (r2 == 0) goto L4b
            java.util.List r4 = r0.o()
            f.d0 r4 = (f.d0) r4
            java.lang.Object r4 = r4.f2789h
            j0.b r4 = (j0.b) r4
            int r4 = r4.i(r2)
            java.util.List r0 = r0.o()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r0 = r0.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
            r6.j(r4, r0)
            int r0 = r6.f13969u
            int r0 = r0 + r3
            r6.f13969u = r0
            goto L6b
        L4b:
            java.util.List r2 = r0.o()
            f.d0 r2 = (f.d0) r2
            java.lang.Object r2 = r2.f2789h
            j0.b r2 = (j0.b) r2
            int r2 = r2.f6673i
            x1.f0 r4 = new x1.f0
            r5 = 2
            r4.<init>(r5)
            r0.f20905w = r3
            r0.A(r2, r4)
            r2 = 0
            r0.f20905w = r2
            int r0 = r6.f13969u
            int r0 = r0 + r3
            r6.f13969u = r0
            r2 = r4
        L6b:
            r1.m(r7, r2)
        L6e:
            x1.f0 r2 = (x1.f0) r2
            r6.m(r2, r7, r9, r8)
        L73:
            return
    }

    public final void l(v1.b0 r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto Le
            boolean r0 = r3.f13899h
            if (r0 == 0) goto Le
            i0.j1 r0 = r3.f13898g
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto L16
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r3.f13898g = r0
        L16:
            i0.l1 r0 = r3.f13897f
            if (r0 == 0) goto L1e
            e(r3)
            return
        L1e:
            if (r4 == 0) goto L28
            i0.q r3 = r3.f13894c
            if (r3 == 0) goto L67
            r3.l()
            return
        L28:
            x1.f0 r4 = r2.f13955g
            x1.r1 r4 = x1.i0.a(r4)
            y1.t r4 = (y1.t) r4
            x1.p1 r4 = r4.getOutOfFrameExecutor()
            if (r4 == 0) goto L5c
            d1.c0 r0 = new d1.c0
            r1 = 14
            r0.<init>(r3, r1)
            y1.t r4 = (y1.t) r4
            tf.k r3 = r4.f22097o
            boolean r1 = r3.isEmpty()
            r3.addLast(r0)
            if (r1 == 0) goto L67
            android.os.Handler r3 = r4.getHandler()
            if (r3 == 0) goto L56
            y1.j r4 = r4.f22099p
            r3.postAtFrontOfQueue(r4)
            return
        L56:
            java.lang.String r3 = "schedule is called when outOfFrameExecutor is not available (view is detached)"
            j8.o.t(r3)
            return
        L5c:
            boolean r4 = r3.f13899h
            if (r4 != 0) goto L67
            i0.q r3 = r3.f13894c
            if (r3 == 0) goto L67
            r3.l()
        L67:
            return
    }

    public final void m(x1.f0 r10, java.lang.Object r11, boolean r12, fg.p r13) {
            r9 = this;
            f.k0 r0 = r9.f13960l
            java.lang.Object r1 = r0.g(r10)
            r2 = 0
            if (r1 != 0) goto L21
            v1.b0 r1 = new v1.b0
            s0.d r3 = v1.f.f13930a
            r1.<init>()
            r1.f13892a = r11
            r1.f13893b = r3
            r1.f13894c = r2
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            i0.j1 r11 = i0.r.u(r11)
            r1.f13898g = r11
            r0.m(r10, r1)
        L21:
            v1.b0 r1 = (v1.b0) r1
            fg.p r11 = r1.f13893b
            r0 = 0
            r3 = 1
            if (r11 == r13) goto L2b
            r11 = r3
            goto L2c
        L2b:
            r11 = r0
        L2c:
            i0.l1 r4 = r1.f13897f
            if (r4 == 0) goto L3c
            if (r11 == 0) goto L36
            e(r1)
            goto L3c
        L36:
            if (r12 == 0) goto L39
            goto L5b
        L39:
            r9.d(r1, r3)
        L3c:
            i0.q r4 = r1.f13894c
            if (r4 == 0) goto L51
            java.lang.Object r5 = r4.f5999j
            monitor-enter(r5)
            f.k0 r4 = r4.f6009t     // Catch: java.lang.Throwable -> L4e
            int r4 = r4.f2852e     // Catch: java.lang.Throwable -> L4e
            if (r4 <= 0) goto L4b
            r4 = r3
            goto L4c
        L4b:
            r4 = r0
        L4c:
            monitor-exit(r5)
            goto L52
        L4e:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L51:
            r4 = r3
        L52:
            if (r11 != 0) goto L5c
            if (r4 != 0) goto L5c
            boolean r11 = r1.f13895d
            if (r11 == 0) goto L5b
            goto L5c
        L5b:
            return
        L5c:
            r1.f13893b = r13
            i0.l1 r11 = r1.f13897f
            if (r11 != 0) goto L63
            goto L68
        L63:
            java.lang.String r11 = "new subcompose call while paused composition is still active"
            u1.a.a(r11)
        L68:
            w0.f r11 = w0.q.e()
            if (r11 == 0) goto L72
            fg.l r2 = r11.e()
        L72:
            w0.f r13 = w0.q.h(r11)
            x1.f0 r4 = r9.f13955g     // Catch: java.lang.Throwable -> L8d
            r4.f20905w = r3     // Catch: java.lang.Throwable -> L8d
            i0.q r5 = r1.f13894c     // Catch: java.lang.Throwable -> L8d
            i0.o r6 = r9.f13956h     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto L115
            if (r5 == 0) goto L90
            int r7 = r5.C     // Catch: java.lang.Throwable -> L8d
            r8 = 3
            if (r7 != r8) goto L89
            r7 = r3
            goto L8a
        L89:
            r7 = r0
        L8a:
            if (r7 == 0) goto Lad
            goto L90
        L8d:
            r10 = move-exception
            goto L120
        L90:
            if (r12 == 0) goto La0
            android.view.ViewGroup$LayoutParams r5 = y1.z2.f22187a     // Catch: java.lang.Throwable -> L8d
            x1.f2 r5 = new x1.f2     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L8d
            i0.q r10 = new i0.q     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r6, r5)     // Catch: java.lang.Throwable -> L8d
        L9e:
            r5 = r10
            goto Lad
        La0:
            android.view.ViewGroup$LayoutParams r5 = y1.z2.f22187a     // Catch: java.lang.Throwable -> L8d
            x1.f2 r5 = new x1.f2     // Catch: java.lang.Throwable -> L8d
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L8d
            i0.q r10 = new i0.q     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r6, r5)     // Catch: java.lang.Throwable -> L8d
            goto L9e
        Lad:
            r1.f13894c = r5     // Catch: java.lang.Throwable -> L8d
            fg.p r10 = r1.f13893b     // Catch: java.lang.Throwable -> L8d
            x1.f0 r6 = r9.f13955g     // Catch: java.lang.Throwable -> L8d
            x1.r1 r6 = x1.i0.a(r6)     // Catch: java.lang.Throwable -> L8d
            y1.t r6 = (y1.t) r6     // Catch: java.lang.Throwable -> L8d
            x1.p1 r6 = r6.getOutOfFrameExecutor()     // Catch: java.lang.Throwable -> L8d
            if (r6 == 0) goto Lc2
            r1.f13899h = r0     // Catch: java.lang.Throwable -> L8d
            goto Ld1
        Lc2:
            r1.f13899h = r3     // Catch: java.lang.Throwable -> L8d
            a1.g r6 = new a1.g     // Catch: java.lang.Throwable -> L8d
            r6.<init>(r1, r3, r10)     // Catch: java.lang.Throwable -> L8d
            s0.d r10 = new s0.d     // Catch: java.lang.Throwable -> L8d
            r7 = 1524156494(0x5ad8c84e, float:3.0509416E16)
            r10.<init>(r7, r6, r3)     // Catch: java.lang.Throwable -> L8d
        Ld1:
            if (r12 == 0) goto Lef
            boolean r12 = r1.f13896e     // Catch: java.lang.Throwable -> L8d
            if (r12 == 0) goto Le4
            r5.i()     // Catch: java.lang.Throwable -> L8d
            r5.q()     // Catch: java.lang.Throwable -> L8d
            i0.l1 r10 = r5.k(r3, r10)     // Catch: java.lang.Throwable -> L8d
            r1.f13897f = r10     // Catch: java.lang.Throwable -> L8d
            goto L10b
        Le4:
            boolean r12 = r5.i()     // Catch: java.lang.Throwable -> L8d
            i0.l1 r10 = r5.k(r12, r10)     // Catch: java.lang.Throwable -> L8d
            r1.f13897f = r10     // Catch: java.lang.Throwable -> L8d
            goto L10b
        Lef:
            boolean r12 = r1.f13896e     // Catch: java.lang.Throwable -> L8d
            if (r12 == 0) goto L108
            r5.i()     // Catch: java.lang.Throwable -> L8d
            r5.q()     // Catch: java.lang.Throwable -> L8d
            i0.h0 r12 = r5.B     // Catch: java.lang.Throwable -> L8d
            r12.f5919z = r0     // Catch: java.lang.Throwable -> L8d
            r12.f5918y = r3     // Catch: java.lang.Throwable -> L8d
            i0.o r3 = r5.f5996g     // Catch: java.lang.Throwable -> L8d
            r3.a(r5, r10)     // Catch: java.lang.Throwable -> L8d
            r12.u()     // Catch: java.lang.Throwable -> L8d
            goto L10b
        L108:
            r5.A(r10)     // Catch: java.lang.Throwable -> L8d
        L10b:
            r1.f13896e = r0     // Catch: java.lang.Throwable -> L8d
            r4.f20905w = r0     // Catch: java.lang.Throwable -> L8d
            w0.q.k(r11, r13, r2)
            r1.f13895d = r0
            return
        L115:
            java.lang.String r10 = "parent composition reference not set"
            u1.a.c(r10)     // Catch: java.lang.Throwable -> L8d
            af.d r10 = new af.d     // Catch: java.lang.Throwable -> L8d
            r10.<init>()     // Catch: java.lang.Throwable -> L8d
            throw r10     // Catch: java.lang.Throwable -> L8d
        L120:
            w0.q.k(r11, r13, r2)
            throw r10
    }

    public final x1.f0 n(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f13968t
            if (r0 != 0) goto L6
            goto L6d
        L6:
            x1.f0 r0 = r10.f13955g
            java.util.List r0 = r0.o()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r1 = r0.f2789h
            j0.b r1 = (j0.b) r1
            int r1 = r1.f6673i
            int r2 = r10.f13969u
            int r1 = r1 - r2
            int r2 = r10.f13968t
            int r2 = r1 - r2
            r3 = 1
            int r1 = r1 - r3
            r4 = r1
        L1e:
            f.k0 r5 = r10.f13960l
            r6 = -1
            if (r4 < r2) goto L3f
            java.lang.Object r7 = r0.get(r4)
            x1.f0 r7 = (x1.f0) r7
            java.lang.Object r7 = r5.g(r7)
            r7.getClass()
            v1.b0 r7 = (v1.b0) r7
            java.lang.Object r7 = r7.f13892a
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L3c
            r7 = r4
            goto L40
        L3c:
            int r4 = r4 + (-1)
            goto L1e
        L3f:
            r7 = r6
        L40:
            if (r7 != r6) goto L6b
        L42:
            if (r1 < r2) goto L6a
            java.lang.Object r4 = r0.get(r1)
            x1.f0 r4 = (x1.f0) r4
            java.lang.Object r4 = r5.g(r4)
            r4.getClass()
            v1.b0 r4 = (v1.b0) r4
            java.lang.Object r8 = r4.f13892a
            v1.s0 r9 = v1.w.f14050a
            if (r8 == r9) goto L65
            v1.l1 r9 = r10.f13957i
            boolean r8 = r9.g(r11, r8)
            if (r8 == 0) goto L62
            goto L65
        L62:
            int r1 = r1 + (-1)
            goto L42
        L65:
            r4.f13892a = r11
            r4 = r1
            r7 = r4
            goto L6b
        L6a:
            r4 = r1
        L6b:
            if (r7 != r6) goto L6f
        L6d:
            r11 = 0
            return r11
        L6f:
            if (r4 == r2) goto L74
            r10.j(r4, r2)
        L74:
            int r11 = r10.f13968t
            int r11 = r11 + r6
            r10.f13968t = r11
            java.lang.Object r11 = r0.get(r2)
            x1.f0 r11 = (x1.f0) r11
            java.lang.Object r0 = r5.g(r11)
            r0.getClass()
            v1.b0 r0 = (v1.b0) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            i0.j1 r1 = i0.r.u(r1)
            r0.f13898g = r1
            r0.f13896e = r3
            r0.f13895d = r3
            return r11
    }
}
