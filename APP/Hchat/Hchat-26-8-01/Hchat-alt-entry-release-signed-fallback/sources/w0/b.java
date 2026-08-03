package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b extends w0.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f14747n = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.l f14748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fg.l f14749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.l0 f14751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f14752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w0.j f14753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f14754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14756m;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            w0.b.f14747n = r0
            return
    }

    public b(long r1, w0.j r3, fg.l r4, fg.l r5) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f14748e = r4
            r0.f14749f = r5
            w0.j r1 = w0.j.f14775k
            r0.f14753j = r1
            int[] r1 = w0.b.f14747n
            r0.f14754k = r1
            r1 = 1
            r0.f14755l = r1
            return
    }

    public final void A(long r3) {
            r2 = this;
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            w0.j r1 = r2.f14753j     // Catch: java.lang.Throwable -> Ld
            w0.j r3 = r1.f(r3)     // Catch: java.lang.Throwable -> Ld
            r2.f14753j = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public void B(f.l0 r1) {
            r0 = this;
            r0.f14751h = r1
            return
    }

    public w0.b C(fg.l r12, fg.l r13) {
            r11 = this;
            boolean r0 = r11.f14765c
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot use a disposed snapshot"
            i0.n1.a(r0)
        L9:
            boolean r0 = r11.f14756m
            if (r0 == 0) goto L17
            int r0 = r11.f14766d
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            i0.n1.b(r0)
        L17:
            long r0 = r11.g()
            r11.A(r0)
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            long r3 = w0.m.f14788e     // Catch: java.lang.Throwable -> L99
            r0 = 1
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L99
            long r5 = r3 + r9
            w0.m.f14788e = r5     // Catch: java.lang.Throwable -> L99
            w0.j r2 = w0.m.f14787d     // Catch: java.lang.Throwable -> L99
            w0.j r2 = r2.f(r3)     // Catch: java.lang.Throwable -> L99
            w0.m.f14787d = r2     // Catch: java.lang.Throwable -> L99
            w0.j r2 = r11.d()     // Catch: java.lang.Throwable -> L99
            w0.j r5 = r2.f(r3)     // Catch: java.lang.Throwable -> L99
            r11.r(r5)     // Catch: java.lang.Throwable -> L99
            r5 = r2
            w0.c r2 = new w0.c     // Catch: java.lang.Throwable -> L99
            long r6 = r11.g()     // Catch: java.lang.Throwable -> L99
            long r6 = r6 + r9
            w0.j r5 = w0.m.d(r5, r6, r3)     // Catch: java.lang.Throwable -> L99
            fg.l r6 = r11.y()     // Catch: java.lang.Throwable -> L99
            fg.l r6 = w0.m.k(r12, r6, r0)     // Catch: java.lang.Throwable -> L99
            fg.l r12 = r11.i()     // Catch: java.lang.Throwable -> L99
            fg.l r7 = w0.m.l(r13, r12)     // Catch: java.lang.Throwable -> L99
            r8 = r11
            r2.<init>(r3, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r1)
            boolean r12 = r8.f14756m
            if (r12 != 0) goto L95
            boolean r12 = r8.f14765c
            if (r12 != 0) goto L95
            long r12 = r11.g()
            monitor-enter(r1)
            long r3 = w0.m.f14788e     // Catch: java.lang.Throwable -> L91
            long r5 = r3 + r9
            w0.m.f14788e = r5     // Catch: java.lang.Throwable -> L91
            r11.s(r3)     // Catch: java.lang.Throwable -> L91
            w0.j r0 = w0.m.f14787d     // Catch: java.lang.Throwable -> L91
            long r3 = r11.g()     // Catch: java.lang.Throwable -> L91
            w0.j r0 = r0.f(r3)     // Catch: java.lang.Throwable -> L91
            w0.m.f14787d = r0     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)
            w0.j r0 = r11.d()
            long r12 = r12 + r9
            long r3 = r11.g()
            w0.j r12 = w0.m.d(r0, r12, r3)
            r11.r(r12)
            return r2
        L91:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)
            throw r12
        L95:
            return r2
        L96:
            r0 = move-exception
        L97:
            r12 = r0
            goto L9c
        L99:
            r0 = move-exception
            r8 = r11
            goto L97
        L9c:
            monitor-exit(r1)
            throw r12
    }

    @Override // w0.f
    public final void b() {
            r3 = this;
            w0.j r0 = w0.m.f14787d
            long r1 = r3.g()
            w0.j r0 = r0.c(r1)
            w0.j r1 = r3.f14753j
            w0.j r0 = r0.a(r1)
            w0.m.f14787d = r0
            return
    }

    @Override // w0.f
    public void c() {
            r2 = this;
            boolean r0 = r2.f14765c
            if (r0 != 0) goto L15
            r0 = 1
            r2.f14765c = r0
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            r2.o()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            r2.l()
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L15:
            return
    }

    @Override // w0.f
    public /* bridge */ /* synthetic */ fg.l e() {
            r1 = this;
            fg.l r0 = r1.y()
            return r0
    }

    @Override // w0.f
    public boolean f() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // w0.f
    public int h() {
            r1 = this;
            int r0 = r1.f14750g
            return r0
    }

    @Override // w0.f
    public fg.l i() {
            r1 = this;
            fg.l r0 = r1.f14749f
            return r0
    }

    @Override // w0.f
    public void k() {
            r1 = this;
            int r0 = r1.f14755l
            int r0 = r0 + 1
            r1.f14755l = r0
            return
    }

    @Override // w0.f
    public void l() {
            r17 = this;
            r0 = r17
            int r1 = r0.f14755l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            i0.n1.a(r1)
        Lc:
            int r1 = r0.f14755l
            int r1 = r1 + (-1)
            r0.f14755l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f14756m
            if (r1 != 0) goto L94
            f.l0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f14756m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            i0.n1.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f2856b
            long[] r1 = r1.f2855a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            w0.u r13 = (w0.u) r13
            w0.w r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f14824a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            w0.j r6 = r0.f14753j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = tf.m.o1(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            w0.l r6 = w0.m.f14784a
            r14 = 0
            r13.f14824a = r14
        L83:
            w0.w r13 = r13.f14825b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
    }

    @Override // w0.f
    public void m() {
            r1 = this;
            boolean r0 = r1.f14756m
            if (r0 != 0) goto Lc
            boolean r0 = r1.f14765c
            if (r0 == 0) goto L9
            goto Lc
        L9:
            r1.v()
        Lc:
            return
    }

    @Override // w0.f
    public void n(w0.u r2) {
            r1 = this;
            f.l0 r0 = r1.x()
            if (r0 != 0) goto L10
            f.l0 r0 = f.s0.f2899a
            f.l0 r0 = new f.l0
            r0.<init>()
            r1.B(r0)
        L10:
            r0.a(r2)
            return
    }

    @Override // w0.f
    public final void p() {
            r3 = this;
            int[] r0 = r3.f14754k
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L10
            int[] r2 = r3.f14754k
            r2 = r2[r1]
            w0.m.u(r2)
            int r1 = r1 + 1
            goto L4
        L10:
            r3.o()
            return
    }

    @Override // w0.f
    public void t(int r1) {
            r0 = this;
            r0.f14750g = r1
            return
    }

    @Override // w0.f
    public w0.f u(fg.l r12) {
            r11 = this;
            boolean r0 = r11.f14765c
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot use a disposed snapshot"
            i0.n1.a(r0)
        L9:
            boolean r0 = r11.f14756m
            if (r0 == 0) goto L17
            int r0 = r11.f14766d
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            i0.n1.b(r0)
        L17:
            long r0 = r11.g()
            long r2 = r11.g()
            r11.A(r2)
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            long r4 = w0.m.f14788e     // Catch: java.lang.Throwable -> L8b
            r3 = 1
            long r9 = (long) r3     // Catch: java.lang.Throwable -> L8b
            long r6 = r4 + r9
            w0.m.f14788e = r6     // Catch: java.lang.Throwable -> L8b
            w0.j r6 = w0.m.f14787d     // Catch: java.lang.Throwable -> L8b
            w0.j r6 = r6.f(r4)     // Catch: java.lang.Throwable -> L8b
            w0.m.f14787d = r6     // Catch: java.lang.Throwable -> L8b
            r6 = r3
            w0.d r3 = new w0.d     // Catch: java.lang.Throwable -> L8b
            w0.j r7 = r11.d()     // Catch: java.lang.Throwable -> L8b
            long r0 = r0 + r9
            w0.j r0 = w0.m.d(r7, r0, r4)     // Catch: java.lang.Throwable -> L8b
            fg.l r1 = r11.y()     // Catch: java.lang.Throwable -> L8b
            fg.l r7 = w0.m.k(r12, r1, r6)     // Catch: java.lang.Throwable -> L8b
            r8 = r11
            r6 = r0
            r3.<init>(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r2)
            boolean r12 = r8.f14756m
            if (r12 != 0) goto L87
            boolean r12 = r8.f14765c
            if (r12 != 0) goto L87
            long r0 = r11.g()
            monitor-enter(r2)
            long r4 = w0.m.f14788e     // Catch: java.lang.Throwable -> L83
            long r6 = r4 + r9
            w0.m.f14788e = r6     // Catch: java.lang.Throwable -> L83
            r11.s(r4)     // Catch: java.lang.Throwable -> L83
            w0.j r12 = w0.m.f14787d     // Catch: java.lang.Throwable -> L83
            long r4 = r11.g()     // Catch: java.lang.Throwable -> L83
            w0.j r12 = r12.f(r4)     // Catch: java.lang.Throwable -> L83
            w0.m.f14787d = r12     // Catch: java.lang.Throwable -> L83
            monitor-exit(r2)
            w0.j r12 = r11.d()
            long r0 = r0 + r9
            long r4 = r11.g()
            w0.j r12 = w0.m.d(r12, r0, r4)
            r11.r(r12)
            return r3
        L83:
            r0 = move-exception
            r12 = r0
            monitor-exit(r2)
            throw r12
        L87:
            return r3
        L88:
            r0 = move-exception
        L89:
            r12 = r0
            goto L8e
        L8b:
            r0 = move-exception
            r8 = r11
            goto L89
        L8e:
            monitor-exit(r2)
            throw r12
    }

    public final void v() {
            r9 = this;
            long r0 = r9.g()
            r9.A(r0)
            boolean r0 = r9.f14756m
            if (r0 != 0) goto L42
            boolean r0 = r9.f14765c
            if (r0 != 0) goto L42
            long r0 = r9.g()
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            long r3 = w0.m.f14788e     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L3f
            long r7 = r3 + r5
            w0.m.f14788e = r7     // Catch: java.lang.Throwable -> L3f
            r9.s(r3)     // Catch: java.lang.Throwable -> L3f
            w0.j r3 = w0.m.f14787d     // Catch: java.lang.Throwable -> L3f
            long r7 = r9.g()     // Catch: java.lang.Throwable -> L3f
            w0.j r3 = r3.f(r7)     // Catch: java.lang.Throwable -> L3f
            w0.m.f14787d = r3     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            w0.j r2 = r9.d()
            long r0 = r0 + r5
            long r3 = r9.g()
            w0.j r0 = w0.m.d(r2, r0, r3)
            r9.r(r0)
            return
        L3f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L42:
            return
    }

    public w0.q w() {
            r22 = this;
            r1 = r22
            f.l0 r4 = r1.x()
            r0 = 0
            if (r4 == 0) goto L19
            w0.a r2 = w0.m.f14793j
            long r2 = r2.f14764b
            w0.j r5 = w0.m.f14787d
            w0.j r5 = r5.c(r2)
            java.util.HashMap r2 = w0.m.b(r2, r1, r5)
            r5 = r2
            goto L1a
        L19:
            r5 = r0
        L1a:
            tf.t r2 = tf.t.f13167g
            java.lang.Object r7 = w0.m.f14786c
            monitor-enter(r7)
            w0.m.c(r1)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L58
            int r3 = r4.f2858d     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L29
            goto L58
        L29:
            w0.a r8 = w0.m.f14793j     // Catch: java.lang.Throwable -> L55
            long r2 = w0.m.f14788e     // Catch: java.lang.Throwable -> L55
            w0.j r6 = w0.m.f14787d     // Catch: java.lang.Throwable -> L55
            long r9 = r8.f14764b     // Catch: java.lang.Throwable -> L55
            w0.j r6 = r6.c(r9)     // Catch: java.lang.Throwable -> L55
            w0.q r2 = r1.z(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L55
            w0.h r3 = w0.h.f14768b     // Catch: java.lang.Throwable -> L55
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L43
            monitor-exit(r7)
            return r2
        L43:
            r1.b()     // Catch: java.lang.Throwable -> L55
            f.l0 r2 = r8.f14751h     // Catch: java.lang.Throwable -> L55
            w0.l r3 = w0.m.f14784a     // Catch: java.lang.Throwable -> L55
            w0.m.v(r8, r3)     // Catch: java.lang.Throwable -> L55
            r1.B(r0)     // Catch: java.lang.Throwable -> L55
            r8.f14751h = r0     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = w0.m.f14791h     // Catch: java.lang.Throwable -> L55
            goto L73
        L55:
            r0 = move-exception
            goto L169
        L58:
            r1.b()     // Catch: java.lang.Throwable -> L55
            w0.a r3 = w0.m.f14793j     // Catch: java.lang.Throwable -> L55
            f.l0 r5 = r3.f14751h     // Catch: java.lang.Throwable -> L55
            w0.l r6 = w0.m.f14784a     // Catch: java.lang.Throwable -> L55
            w0.m.v(r3, r6)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L71
            boolean r3 = r5.h()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L71
            java.lang.Object r2 = w0.m.f14791h     // Catch: java.lang.Throwable -> L55
            r3 = r2
            r2 = r5
            goto L73
        L71:
            r3 = r2
            r2 = r0
        L73:
            monitor-exit(r7)
            r5 = 1
            r1.f14756m = r5
            if (r2 == 0) goto L97
            j0.d r6 = new j0.d
            r6.<init>(r2)
            boolean r7 = r2.g()
            if (r7 != 0) goto L97
            int r7 = r3.size()
            r8 = 0
        L89:
            if (r8 >= r7) goto L97
            java.lang.Object r9 = r3.get(r8)
            fg.p r9 = (fg.p) r9
            r9.invoke(r6, r1)
            int r8 = r8 + 1
            goto L89
        L97:
            if (r4 == 0) goto Lb7
            boolean r6 = r4.h()
            if (r6 == 0) goto Lb7
            j0.d r6 = new j0.d
            r6.<init>(r4)
            int r7 = r3.size()
            r8 = 0
        La9:
            if (r8 >= r7) goto Lb7
            java.lang.Object r9 = r3.get(r8)
            fg.p r9 = (fg.p) r9
            r9.invoke(r6, r1)
            int r8 = r8 + 1
            goto La9
        Lb7:
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            r1.p()     // Catch: java.lang.Throwable -> Lfe
            w0.m.f()     // Catch: java.lang.Throwable -> Lfe
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            if (r2 == 0) goto L10b
            java.lang.Object[] r14 = r2.f2856b     // Catch: java.lang.Throwable -> Lfe
            long[] r2 = r2.f2855a     // Catch: java.lang.Throwable -> Lfe
            int r15 = r2.length     // Catch: java.lang.Throwable -> Lfe
            int r15 = r15 + (-2)
            if (r15 < 0) goto L10b
            r5 = 0
            r16 = 128(0x80, double:6.3E-322)
        Ld6:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> Lfe
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6     // Catch: java.lang.Throwable -> Lfe
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L106
            int r8 = r5 - r15
            int r8 = ~r8     // Catch: java.lang.Throwable -> Lfe
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = 0
        Lea:
            if (r9 >= r8) goto L104
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L100
            int r20 = r5 << 3
            int r20 = r20 + r9
            r20 = r14[r20]     // Catch: java.lang.Throwable -> Lfe
            w0.u r20 = (w0.u) r20     // Catch: java.lang.Throwable -> Lfe
            w0.m.q(r20)     // Catch: java.lang.Throwable -> Lfe
            goto L100
        Lfe:
            r0 = move-exception
            goto L167
        L100:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto Lea
        L104:
            if (r8 != r13) goto L10f
        L106:
            if (r5 == r15) goto L10f
            int r5 = r5 + 1
            goto Ld6
        L10b:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L10f:
            if (r4 == 0) goto L14a
            java.lang.Object[] r2 = r4.f2856b     // Catch: java.lang.Throwable -> Lfe
            long[] r4 = r4.f2855a     // Catch: java.lang.Throwable -> Lfe
            int r5 = r4.length     // Catch: java.lang.Throwable -> Lfe
            int r5 = r5 + (-2)
            if (r5 < 0) goto L14a
            r6 = 0
        L11b:
            r7 = r4[r6]     // Catch: java.lang.Throwable -> Lfe
            long r14 = ~r7     // Catch: java.lang.Throwable -> Lfe
            long r14 = r14 << r10
            long r14 = r14 & r7
            long r14 = r14 & r11
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 == 0) goto L145
            int r9 = r6 - r5
            int r9 = ~r9     // Catch: java.lang.Throwable -> Lfe
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r14 = 0
        L12d:
            if (r14 >= r9) goto L143
            long r20 = r7 & r18
            int r15 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r15 >= 0) goto L13f
            int r15 = r6 << 3
            int r15 = r15 + r14
            r15 = r2[r15]     // Catch: java.lang.Throwable -> Lfe
            w0.u r15 = (w0.u) r15     // Catch: java.lang.Throwable -> Lfe
            w0.m.q(r15)     // Catch: java.lang.Throwable -> Lfe
        L13f:
            long r7 = r7 >> r13
            int r14 = r14 + 1
            goto L12d
        L143:
            if (r9 != r13) goto L14a
        L145:
            if (r6 == r5) goto L14a
            int r6 = r6 + 1
            goto L11b
        L14a:
            java.util.ArrayList r2 = r1.f14752i     // Catch: java.lang.Throwable -> Lfe
            if (r2 == 0) goto L161
            int r4 = r2.size()     // Catch: java.lang.Throwable -> Lfe
            r5 = 0
        L153:
            if (r5 >= r4) goto L161
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> Lfe
            w0.u r6 = (w0.u) r6     // Catch: java.lang.Throwable -> Lfe
            w0.m.q(r6)     // Catch: java.lang.Throwable -> Lfe
            int r5 = r5 + 1
            goto L153
        L161:
            r1.f14752i = r0     // Catch: java.lang.Throwable -> Lfe
            monitor-exit(r3)
            w0.h r0 = w0.h.f14768b
            return r0
        L167:
            monitor-exit(r3)
            throw r0
        L169:
            monitor-exit(r7)
            throw r0
    }

    public f.l0 x() {
            r1 = this;
            f.l0 r0 = r1.f14751h
            return r0
    }

    public fg.l y() {
            r1 = this;
            fg.l r0 = r1.f14748e
            return r0
    }

    public final w0.q z(long r29, f.l0 r31, java.util.HashMap r32, w0.j r33) {
            r28 = this;
            r1 = r28
            r2 = r29
            r0 = r31
            r4 = r32
            w0.j r5 = r1.d()
            long r6 = r1.g()
            w0.j r5 = r5.f(r6)
            w0.j r6 = r1.f14753j
            w0.j r5 = r5.e(r6)
            java.lang.Object[] r6 = r0.f2856b
            long[] r7 = r0.f2855a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L16b
            r11 = 0
            r12 = 0
            r13 = 0
        L26:
            r14 = r7[r11]
            r16 = 0
            long r9 = ~r14
            r17 = 7
            long r9 = r9 << r17
            long r9 = r9 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r17
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L155
            int r9 = r11 - r8
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r17 = r10
            r10 = 0
        L47:
            if (r10 >= r9) goto L144
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L127
            int r18 = r11 << 3
            int r18 = r18 + r10
            r18 = r6[r18]
            r19 = r6
            r6 = r18
            w0.u r6 = (w0.u) r6
            r18 = r7
            w0.w r7 = r6.a()
            r20 = r10
            r21 = r12
            r10 = r33
            w0.w r12 = w0.m.s(r7, r2, r10)
            if (r12 != 0) goto L78
            r25 = r5
            r22 = r13
            r23 = r14
            goto L95
        L78:
            r22 = r13
            r23 = r14
            long r13 = r1.g()
            w0.w r13 = w0.m.s(r7, r13, r5)
            if (r13 != 0) goto L89
            r25 = r5
            goto L95
        L89:
            long r14 = r13.f14824a
            r25 = r5
            r5 = 1
            r26 = r14
            long r14 = (long) r5
            int r5 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r5 != 0) goto L97
        L95:
            goto L124
        L97:
            boolean r5 = r12.equals(r13)
            if (r5 != 0) goto L124
            long r14 = r1.g()
            w0.j r5 = r1.d()
            w0.w r5 = w0.m.s(r7, r14, r5)
            if (r5 == 0) goto L120
            if (r4 == 0) goto Lb5
            java.lang.Object r7 = r4.get(r12)
            w0.w r7 = (w0.w) r7
            if (r7 != 0) goto Lb9
        Lb5:
            w0.w r7 = r6.d(r13, r12, r5)
        Lb9:
            if (r7 != 0) goto Lc1
            w0.g r0 = new w0.g
            r0.<init>(r1)
            return r0
        Lc1:
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L124
            boolean r5 = r7.equals(r12)
            if (r5 == 0) goto Lf6
            if (r21 != 0) goto Ld5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto Ld7
        Ld5:
            r5 = r21
        Ld7:
            long r13 = r1.g()
            w0.w r7 = r12.b(r13)
            sf.e r12 = new sf.e
            r12.<init>(r6, r7)
            r5.add(r12)
            if (r22 != 0) goto Lef
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto Lf1
        Lef:
            r13 = r22
        Lf1:
            r13.add(r6)
            r12 = r5
            goto L137
        Lf6:
            if (r21 != 0) goto Lfe
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            goto L100
        Lfe:
            r12 = r21
        L100:
            boolean r5 = r7.equals(r13)
            if (r5 != 0) goto L10c
            sf.e r5 = new sf.e
            r5.<init>(r6, r7)
            goto L11a
        L10c:
            long r14 = r1.g()
            w0.w r5 = r13.b(r14)
            sf.e r7 = new sf.e
            r7.<init>(r6, r5)
            r5 = r7
        L11a:
            r12.add(r5)
        L11d:
            r13 = r22
            goto L137
        L120:
            w0.m.r()
            throw r16
        L124:
            r12 = r21
            goto L11d
        L127:
            r25 = r5
            r19 = r6
            r18 = r7
            r20 = r10
            r21 = r12
            r22 = r13
            r23 = r14
            r10 = r33
        L137:
            long r14 = r23 >> r17
            int r5 = r20 + 1
            r10 = r5
            r7 = r18
            r6 = r19
            r5 = r25
            goto L47
        L144:
            r10 = r33
            r25 = r5
            r19 = r6
            r18 = r7
            r21 = r12
            r22 = r13
            r5 = r17
            if (r9 != r5) goto L171
            goto L15d
        L155:
            r10 = r33
            r25 = r5
            r19 = r6
            r18 = r7
        L15d:
            if (r11 == r8) goto L169
            int r11 = r11 + 1
            r7 = r18
            r6 = r19
            r5 = r25
            goto L26
        L169:
            r9 = r12
            goto L170
        L16b:
            r16 = 0
            r9 = r16
            r13 = r9
        L170:
            r12 = r9
        L171:
            if (r12 == 0) goto L1a0
            r1.v()
            int r4 = r12.size()
            r5 = 0
        L17b:
            if (r5 >= r4) goto L1a0
            java.lang.Object r6 = r12.get(r5)
            sf.e r6 = (sf.e) r6
            java.lang.Object r7 = r6.f12418g
            w0.u r7 = (w0.u) r7
            java.lang.Object r6 = r6.f12419h
            w0.w r6 = (w0.w) r6
            r6.f14824a = r2
            java.lang.Object r8 = w0.m.f14786c
            monitor-enter(r8)
            w0.w r9 = r7.a()     // Catch: java.lang.Throwable -> L19d
            r6.f14825b = r9     // Catch: java.lang.Throwable -> L19d
            r7.c(r6)     // Catch: java.lang.Throwable -> L19d
            monitor-exit(r8)
            int r5 = r5 + 1
            goto L17b
        L19d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L1a0:
            if (r13 == 0) goto L1c0
            int r2 = r13.size()
            r10 = 0
        L1a7:
            if (r10 >= r2) goto L1b5
            java.lang.Object r3 = r13.get(r10)
            w0.u r3 = (w0.u) r3
            r0.l(r3)
            int r10 = r10 + 1
            goto L1a7
        L1b5:
            java.util.ArrayList r0 = r1.f14752i
            if (r0 != 0) goto L1ba
            goto L1be
        L1ba:
            java.util.ArrayList r13 = tf.m.F1(r0, r13)
        L1be:
            r1.f14752i = r13
        L1c0:
            w0.h r0 = w0.h.f14768b
            return r0
    }
}
