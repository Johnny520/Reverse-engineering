package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0.l f14784a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b5.c f14785b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f14786c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w0.j f14787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f14788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f5.g f14789f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ac.k f14790g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static java.lang.Object f14791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static java.lang.Object f14792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w0.a f14793j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s0.a f14794k = null;

    static {
            w0.l r0 = new w0.l
            r1 = 0
            r0.<init>(r1)
            w0.m.f14784a = r0
            b5.c r0 = new b5.c
            r1 = 22
            r0.<init>(r1)
            w0.m.f14785b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            w0.m.f14786c = r0
            w0.j r4 = w0.j.f14775k
            w0.m.f14787d = r4
            r0 = 1
            long r0 = (long) r0
            long r2 = r0 + r0
            w0.m.f14788e = r2
            f5.g r2 = new f5.g
            r2.<init>()
            r3 = 16
            long[] r5 = new long[r3]
            r2.f3299d = r5
            int[] r5 = new int[r3]
            r2.f3300e = r5
            int[] r5 = new int[r3]
            r7 = 0
            r6 = r7
        L35:
            if (r6 >= r3) goto L3d
            int r8 = r6 + 1
            r5[r6] = r8
            r6 = r8
            goto L35
        L3d:
            r2.f3301f = r5
            w0.m.f14789f = r2
            ac.k r2 = new ac.k
            r5 = 11
            r6 = 0
            r2.<init>(r5, r6)
            int[] r5 = new int[r3]
            r2.f178i = r5
            s0.l[] r3 = new s0.l[r3]
            r2.f179j = r3
            w0.m.f14790g = r2
            tf.t r2 = tf.t.f13167g
            w0.m.f14791h = r2
            w0.m.f14792i = r2
            long r2 = w0.m.f14788e
            long r0 = r0 + r2
            w0.m.f14788e = r0
            w0.a r1 = new w0.a
            r9.p r6 = new r9.p
            r0 = 29
            r6.<init>(r0)
            r5 = 0
            r1.<init>(r2, r4, r5, r6)
            w0.j r0 = w0.m.f14787d
            long r2 = r1.f14764b
            w0.j r0 = r0.f(r2)
            w0.m.f14787d = r0
            w0.m.f14793j = r1
            s0.a r0 = new s0.a
            r0.<init>(r7)
            w0.m.f14794k = r0
            return
    }

    public static final void a() {
            w0.l r0 = w0.m.f14784a
            e(r0)
            return
    }

    public static final java.util.HashMap b(long r22, w0.b r24, w0.j r25) {
            f.l0 r0 = r24.x()
            if (r0 != 0) goto La
        L6:
            r17 = 0
            goto Ldf
        La:
            long r2 = r24.g()
            w0.j r4 = r24.d()
            w0.j r4 = r4.f(r2)
            r5 = r24
            w0.j r6 = r5.f14753j
            w0.j r4 = r4.e(r6)
            java.lang.Object[] r6 = r0.f2856b
            long[] r0 = r0.f2855a
            int r7 = r0.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6
            r9 = 0
            r10 = 0
        L29:
            r11 = r0[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lca
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L43:
            if (r15 >= r13) goto Lbd
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto La3
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r6[r16]
            r17 = 0
            r1 = r16
            w0.u r1 = (w0.u) r1
            w0.w r8 = r1.a()
            r20 = r0
            r18 = r14
            r19 = r15
            r14 = r22
            r0 = r25
            w0.w r5 = s(r8, r14, r0)
            if (r5 != 0) goto L70
            goto L76
        L70:
            w0.w r0 = s(r8, r2, r4)
            if (r0 != 0) goto L77
        L76:
            goto La0
        L77:
            boolean r21 = r5.equals(r0)
            if (r21 != 0) goto La0
            r21 = r4
            w0.j r4 = r24.d()
            w0.w r4 = s(r8, r2, r4)
            if (r4 == 0) goto L9c
            w0.w r0 = r1.d(r0, r5, r4)
            if (r0 == 0) goto Ldf
            if (r10 != 0) goto L96
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L96:
            r1 = r10
            r10.put(r5, r0)
            r10 = r1
            goto Laf
        L9c:
            r()
            throw r17
        La0:
            r21 = r4
            goto Laf
        La3:
            r20 = r0
            r21 = r4
            r18 = r14
            r19 = r15
            r17 = 0
            r14 = r22
        Laf:
            long r11 = r11 >> r18
            int r0 = r19 + 1
            r5 = r24
            r15 = r0
            r14 = r18
            r0 = r20
            r4 = r21
            goto L43
        Lbd:
            r20 = r0
            r21 = r4
            r0 = r14
            r17 = 0
            r14 = r22
            if (r13 != r0) goto Lc9
            goto Ld2
        Lc9:
            return r10
        Lca:
            r14 = r22
            r20 = r0
            r21 = r4
            r17 = 0
        Ld2:
            if (r9 == r7) goto Lde
            int r9 = r9 + 1
            r5 = r24
            r0 = r20
            r4 = r21
            goto L29
        Lde:
            return r10
        Ldf:
            return r17
    }

    public static final void c(w0.f r4) {
            w0.j r0 = w0.m.f14787d
            long r1 = r4.g()
            boolean r0 = r0.d(r1)
            if (r0 != 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Snapshot is not open: snapshotId="
            r0.<init>(r1)
            long r1 = r4.g()
            r0.append(r1)
            java.lang.String r1 = ", disposed="
            r0.append(r1)
            boolean r1 = r4.f14765c
            r0.append(r1)
            java.lang.String r1 = ", applied="
            r0.append(r1)
            boolean r1 = r4 instanceof w0.b
            if (r1 == 0) goto L30
            w0.b r4 = (w0.b) r4
            goto L31
        L30:
            r4 = 0
        L31:
            if (r4 == 0) goto L3a
            boolean r4 = r4.f14756m
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L3c
        L3a:
            java.lang.String r4 = "read-only"
        L3c:
            r0.append(r4)
            java.lang.String r4 = ", lowestPin="
            r0.append(r4)
            java.lang.Object r4 = w0.m.f14786c
            monitor-enter(r4)
            f5.g r1 = w0.m.f14789f     // Catch: java.lang.Throwable -> L69
            int r2 = r1.f3297b     // Catch: java.lang.Throwable -> L69
            if (r2 <= 0) goto L55
            java.lang.Object r1 = r1.f3299d     // Catch: java.lang.Throwable -> L69
            long[] r1 = (long[]) r1     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L69
            goto L57
        L55:
            r2 = -1
        L57:
            monitor-exit(r4)
            r0.append(r2)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L6c:
            return
    }

    public static final w0.j d(w0.j r2, long r3, long r5) {
        L0:
            int r0 = gg.l.d(r3, r5)
            if (r0 >= 0) goto Le
            w0.j r2 = r2.f(r3)
            r0 = 1
            long r0 = (long) r0
            long r3 = r3 + r0
            goto L0
        Le:
            return r2
    }

    public static final java.lang.Object e(fg.l r15) {
            w0.a r0 = w0.m.f14793j
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            f.l0 r2 = r0.f14751h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            s0.a r3 = w0.m.f14794k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.lang.Object r4 = w0.m.f14791h     // Catch: java.lang.Throwable -> L36
            j0.d r5 = new j0.d     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            fg.p r8 = (fg.p) r8     // Catch: java.lang.Throwable -> L36
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            s0.a r0 = w0.m.f14794k
            r0.addAndGet(r3)
            goto L44
        L3e:
            s0.a r0 = w0.m.f14794k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.f2856b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.f2855a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            w0.u r11 = (w0.u) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
    }

    public static final void f() {
            ac.k r0 = w0.m.f14790g
            int r1 = r0.f177h
            r2 = 0
            r3 = r2
            r4 = r3
        L7:
            r5 = 0
            if (r3 >= r1) goto L35
            java.lang.Object r6 = r0.f179j
            s0.l[] r6 = (s0.l[]) r6
            r6 = r6[r3]
            if (r6 == 0) goto L16
            java.lang.Object r5 = r6.get()
        L16:
            if (r5 == 0) goto L32
            w0.u r5 = (w0.u) r5
            boolean r5 = p(r5)
            if (r5 == 0) goto L32
            if (r4 == r3) goto L30
            java.lang.Object r5 = r0.f179j
            s0.l[] r5 = (s0.l[]) r5
            r5[r4] = r6
            java.lang.Object r5 = r0.f178i
            int[] r5 = (int[]) r5
            r6 = r5[r3]
            r5[r4] = r6
        L30:
            int r4 = r4 + 1
        L32:
            int r3 = r3 + 1
            goto L7
        L35:
            r3 = r4
        L36:
            if (r3 >= r1) goto L47
            java.lang.Object r6 = r0.f179j
            s0.l[] r6 = (s0.l[]) r6
            r6[r3] = r5
            java.lang.Object r6 = r0.f178i
            int[] r6 = (int[]) r6
            r6[r3] = r2
            int r3 = r3 + 1
            goto L36
        L47:
            if (r4 == r1) goto L4b
            r0.f177h = r4
        L4b:
            return
    }

    public static final w0.f g(w0.f r8, fg.l r9, boolean r10) {
            boolean r0 = r8 instanceof w0.b
            if (r0 != 0) goto Le
            if (r8 != 0) goto L7
            goto Le
        L7:
            w0.z r0 = new w0.z
            r1 = 0
            r0.<init>(r8, r9, r1, r10)
            return r0
        Le:
            w0.y r2 = new w0.y
            if (r0 == 0) goto L16
            w0.b r8 = (w0.b) r8
        L14:
            r3 = r8
            goto L18
        L16:
            r8 = 0
            goto L14
        L18:
            r5 = 0
            r6 = 0
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public static final w0.w h(w0.w r4) {
            w0.f r0 = j()
            long r1 = r0.g()
            w0.j r0 = r0.d()
            w0.w r0 = s(r4, r1, r0)
            if (r0 != 0) goto L31
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            w0.f r1 = j()     // Catch: java.lang.Throwable -> L2e
            long r2 = r1.g()     // Catch: java.lang.Throwable -> L2e
            w0.j r1 = r1.d()     // Catch: java.lang.Throwable -> L2e
            w0.w r4 = s(r4, r2, r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            if (r4 == 0) goto L29
            return r4
        L29:
            r()
            r4 = 0
            throw r4
        L2e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L31:
            return r0
    }

    public static final w0.w i(w0.w r3, w0.f r4) {
            long r0 = r4.g()
            w0.j r2 = r4.d()
            w0.w r0 = s(r3, r0, r2)
            if (r0 != 0) goto L29
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            long r1 = r4.g()     // Catch: java.lang.Throwable -> L26
            w0.j r4 = r4.d()     // Catch: java.lang.Throwable -> L26
            w0.w r3 = s(r3, r1, r4)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            if (r3 == 0) goto L21
            return r3
        L21:
            r()
            r3 = 0
            throw r3
        L26:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L29:
            return r0
    }

    public static final w0.f j() {
            b5.c r0 = w0.m.f14785b
            java.lang.Object r0 = r0.o()
            w0.f r0 = (w0.f) r0
            if (r0 != 0) goto Lc
            w0.a r0 = w0.m.f14793j
        Lc:
            return r0
    }

    public static final fg.l k(fg.l r1, fg.l r2, boolean r3) {
            if (r3 == 0) goto L3
            goto L4
        L3:
            r2 = 0
        L4:
            if (r1 == 0) goto L11
            if (r2 == 0) goto L11
            if (r1 == r2) goto L11
            w0.k r3 = new w0.k
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
        L11:
            if (r1 != 0) goto L14
            return r2
        L14:
            return r1
    }

    public static final fg.l l(fg.l r2, fg.l r3) {
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            if (r2 == r3) goto Ld
            w0.k r0 = new w0.k
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        Ld:
            if (r2 != 0) goto L10
            return r3
        L10:
            return r2
    }

    public static final w0.w m(w0.w r10, w0.u r11) {
            w0.w r0 = r11.a()
            long r1 = w0.m.f14788e
            f5.g r3 = w0.m.f14789f
            int r4 = r3.f3297b
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f3299d
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.f14824a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = gg.l.d(r5, r1)
            if (r7 > 0) goto L48
            w0.j r7 = w0.j.f14775k
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.f14824a
            long r5 = r4.f14824a
            int r1 = gg.l.d(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            w0.w r0 = r0.f14825b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.f14824a = r0
            return r3
        L55:
            w0.w r10 = r10.b(r0)
            w0.w r0 = r11.a()
            r10.f14825b = r0
            r11.c(r10)
            return r10
    }

    public static final void n(w0.f r1, w0.u r2) {
            int r0 = r1.h()
            int r0 = r0 + 1
            r1.t(r0)
            fg.l r1 = r1.i()
            if (r1 == 0) goto L12
            r1.invoke(r2)
        L12:
            return
    }

    public static final w0.w o(w0.w r4, w0.v r5, w0.f r6, w0.w r7) {
            boolean r0 = r6.f()
            if (r0 == 0) goto L9
            r6.n(r5)
        L9:
            long r0 = r6.g()
            long r2 = r7.f14824a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L14
            return r7
        L14:
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            w0.w r4 = m(r4, r5)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r2)
            r4.f14824a = r0
            long r0 = r7.f14824a
            r7 = 1
            long r2 = (long) r7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L29
            r6.n(r5)
        L29:
            return r4
        L2a:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public static final boolean p(w0.u r15) {
            w0.w r0 = r15.a()
            long r1 = w0.m.f14788e
            f5.g r3 = w0.m.f14789f
            int r4 = r3.f3297b
            r5 = 0
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f3299d
            long[] r1 = (long[]) r1
            r2 = r1[r5]
            r1 = r2
        L14:
            r3 = 0
            r4 = r3
            r6 = r5
        L17:
            if (r0 == 0) goto L68
            long r7 = r0.f14824a
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L65
            int r7 = gg.l.d(r7, r1)
            if (r7 >= 0) goto L63
            if (r3 != 0) goto L2d
            int r6 = r6 + 1
            r3 = r0
            goto L65
        L2d:
            long r7 = r0.f14824a
            long r11 = r3.f14824a
            int r7 = gg.l.d(r7, r11)
            if (r7 >= 0) goto L3a
            r7 = r3
            r3 = r0
            goto L3b
        L3a:
            r7 = r0
        L3b:
            if (r4 != 0) goto L5c
            w0.w r4 = r15.a()
            r8 = r4
        L42:
            if (r4 == 0) goto L5b
            long r11 = r4.f14824a
            int r11 = gg.l.d(r11, r1)
            if (r11 < 0) goto L4d
            goto L5c
        L4d:
            long r11 = r8.f14824a
            long r13 = r4.f14824a
            int r11 = gg.l.d(r11, r13)
            if (r11 >= 0) goto L58
            r8 = r4
        L58:
            w0.w r4 = r4.f14825b
            goto L42
        L5b:
            r4 = r8
        L5c:
            r3.f14824a = r9
            r3.a(r4)
            r3 = r7
            goto L65
        L63:
            int r6 = r6 + 1
        L65:
            w0.w r0 = r0.f14825b
            goto L17
        L68:
            r15 = 1
            if (r6 <= r15) goto L6c
            return r15
        L6c:
            return r5
    }

    public static final void q(w0.u r10) {
            boolean r0 = p(r10)
            if (r0 == 0) goto Leb
            ac.k r0 = w0.m.f14790g
            int r1 = r0.f177h
            int r2 = java.lang.System.identityHashCode(r10)
            r3 = 0
            r4 = -1
            if (r1 <= 0) goto L94
            int r5 = r0.f177h
            int r5 = r5 + (-1)
            r6 = r3
        L17:
            if (r6 > r5) goto L8e
            int r7 = r6 + r5
            int r7 = r7 >>> 1
            java.lang.Object r8 = r0.f178i
            int[] r8 = (int[]) r8
            r8 = r8[r7]
            if (r8 >= r2) goto L28
            int r6 = r7 + 1
            goto L17
        L28:
            if (r8 <= r2) goto L2d
            int r5 = r7 + (-1)
            goto L17
        L2d:
            java.lang.Object r5 = r0.f179j
            s0.l[] r5 = (s0.l[]) r5
            r5 = r5[r7]
            r6 = 0
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r5.get()
            goto L3c
        L3b:
            r5 = r6
        L3c:
            if (r10 != r5) goto L40
        L3e:
            r4 = r7
            goto L91
        L40:
            int r5 = r7 + (-1)
        L42:
            if (r4 >= r5) goto L62
            java.lang.Object r8 = r0.f178i
            int[] r8 = (int[]) r8
            r8 = r8[r5]
            if (r8 == r2) goto L4d
            goto L62
        L4d:
            java.lang.Object r8 = r0.f179j
            s0.l[] r8 = (s0.l[]) r8
            r8 = r8[r5]
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r8.get()
            goto L5b
        L5a:
            r8 = r6
        L5b:
            if (r8 != r10) goto L5f
            r4 = r5
            goto L91
        L5f:
            int r5 = r5 + (-1)
            goto L42
        L62:
            int r7 = r7 + 1
            int r4 = r0.f177h
        L66:
            if (r7 >= r4) goto L88
            java.lang.Object r5 = r0.f178i
            int[] r5 = (int[]) r5
            r5 = r5[r7]
            if (r5 == r2) goto L74
            int r7 = r7 + 1
            int r4 = -r7
            goto L91
        L74:
            java.lang.Object r5 = r0.f179j
            s0.l[] r5 = (s0.l[]) r5
            r5 = r5[r7]
            if (r5 == 0) goto L81
            java.lang.Object r5 = r5.get()
            goto L82
        L81:
            r5 = r6
        L82:
            if (r5 != r10) goto L85
            goto L3e
        L85:
            int r7 = r7 + 1
            goto L66
        L88:
            int r4 = r0.f177h
            int r4 = r4 + 1
            int r4 = -r4
            goto L91
        L8e:
            int r6 = r6 + 1
            int r4 = -r6
        L91:
            if (r4 < 0) goto L94
            goto Leb
        L94:
            int r4 = r4 + 1
            int r4 = -r4
            java.lang.Object r5 = r0.f179j
            s0.l[] r5 = (s0.l[]) r5
            int r6 = r5.length
            if (r1 != r6) goto Lc6
            int r6 = r6 * 2
            s0.l[] r7 = new s0.l[r6]
            int[] r6 = new int[r6]
            int r8 = r4 + 1
            int r9 = r1 - r4
            java.lang.System.arraycopy(r5, r4, r7, r8, r9)
            java.lang.Object r5 = r0.f179j
            s0.l[] r5 = (s0.l[]) r5
            java.lang.System.arraycopy(r5, r3, r7, r3, r4)
            java.lang.Object r5 = r0.f178i
            int[] r5 = (int[]) r5
            tf.l.p0(r5, r6, r8, r4, r1)
            java.lang.Object r1 = r0.f178i
            int[] r1 = (int[]) r1
            r5 = 6
            tf.l.s0(r1, r6, r3, r4, r5)
            r0.f179j = r7
            r0.f178i = r6
            goto Ld4
        Lc6:
            int r3 = r4 + 1
            int r6 = r1 - r4
            java.lang.System.arraycopy(r5, r4, r5, r3, r6)
            java.lang.Object r5 = r0.f178i
            int[] r5 = (int[]) r5
            tf.l.p0(r5, r5, r3, r4, r1)
        Ld4:
            java.lang.Object r1 = r0.f179j
            s0.l[] r1 = (s0.l[]) r1
            s0.l r3 = new s0.l
            r3.<init>(r10)
            r1[r4] = r3
            java.lang.Object r10 = r0.f178i
            int[] r10 = (int[]) r10
            r10[r4] = r2
            int r10 = r0.f177h
            int r10 = r10 + 1
            r0.f177h = r10
        Leb:
            return
    }

    public static final void r() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"
            r0.<init>(r1)
            throw r0
    }

    public static final w0.w s(w0.w r6, long r7, w0.j r9) {
            r0 = 0
            r1 = r0
        L2:
            if (r6 == 0) goto L29
            long r2 = r6.f14824a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L26
            int r4 = gg.l.d(r2, r7)
            if (r4 > 0) goto L26
            boolean r2 = r9.d(r2)
            if (r2 != 0) goto L26
            if (r1 != 0) goto L1b
            goto L25
        L1b:
            long r2 = r1.f14824a
            long r4 = r6.f14824a
            int r2 = gg.l.d(r2, r4)
            if (r2 >= 0) goto L26
        L25:
            r1 = r6
        L26:
            w0.w r6 = r6.f14825b
            goto L2
        L29:
            if (r1 == 0) goto L2c
            return r1
        L2c:
            return r0
    }

    public static final w0.w t(w0.w r3, w0.u r4) {
            w0.f r0 = j()
            fg.l r1 = r0.e()
            if (r1 == 0) goto Ld
            r1.invoke(r4)
        Ld:
            long r1 = r0.g()
            w0.j r0 = r0.d()
            w0.w r3 = s(r3, r1, r0)
            if (r3 != 0) goto L41
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.f r0 = j()     // Catch: java.lang.Throwable -> L3e
            w0.w r4 = r4.a()     // Catch: java.lang.Throwable -> L3e
            r4.getClass()     // Catch: java.lang.Throwable -> L3e
            long r1 = r0.g()     // Catch: java.lang.Throwable -> L3e
            w0.j r0 = r0.d()     // Catch: java.lang.Throwable -> L3e
            w0.w r4 = s(r4, r1, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L39
            monitor-exit(r3)
            return r4
        L39:
            r()     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L3e
        L3e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L41:
            return r3
    }

    public static final void u(int r10) {
            f5.g r0 = w0.m.f14789f
            java.lang.Object r1 = r0.f3301f
            int[] r1 = (int[]) r1
            r1 = r1[r10]
            int r2 = r0.f3297b
            int r2 = r2 + (-1)
            r0.d(r1, r2)
            int r2 = r0.f3297b
            int r2 = r2 + (-1)
            r0.f3297b = r2
            java.lang.Object r2 = r0.f3299d
            long[] r2 = (long[]) r2
            r3 = r2[r1]
            r5 = r1
        L1c:
            if (r5 <= 0) goto L31
            int r6 = r5 + 1
            int r6 = r6 >> 1
            int r6 = r6 + (-1)
            r7 = r2[r6]
            int r7 = gg.l.d(r7, r3)
            if (r7 <= 0) goto L31
            r0.d(r6, r5)
            r5 = r6
            goto L1c
        L31:
            java.lang.Object r2 = r0.f3299d
            long[] r2 = (long[]) r2
            int r3 = r0.f3297b
            int r3 = r3 >> 1
        L39:
            if (r1 >= r3) goto L6d
            int r4 = r1 + 1
            int r4 = r4 << 1
            int r5 = r4 + (-1)
            int r6 = r0.f3297b
            if (r4 >= r6) goto L5e
            r6 = r2[r4]
            r8 = r2[r5]
            int r6 = gg.l.d(r6, r8)
            if (r6 >= 0) goto L5e
            r5 = r2[r4]
            r7 = r2[r1]
            int r5 = gg.l.d(r5, r7)
            if (r5 >= 0) goto L6d
            r0.d(r4, r1)
            r1 = r4
            goto L39
        L5e:
            r6 = r2[r5]
            r8 = r2[r1]
            int r4 = gg.l.d(r6, r8)
            if (r4 >= 0) goto L6d
            r0.d(r5, r1)
            r1 = r5
            goto L39
        L6d:
            java.lang.Object r1 = r0.f3301f
            int[] r1 = (int[]) r1
            int r2 = r0.f3298c
            r1[r10] = r2
            r0.f3298c = r10
            return
    }

    public static final java.lang.Object v(w0.a r6, fg.l r7) {
            long r0 = r6.f14764b
            w0.j r2 = w0.m.f14787d
            w0.j r2 = r2.c(r0)
            java.lang.Object r7 = r7.invoke(r2)
            long r2 = w0.m.f14788e
            r4 = 1
            long r4 = (long) r4
            long r4 = r4 + r2
            w0.m.f14788e = r4
            w0.j r4 = w0.m.f14787d
            w0.j r0 = r4.c(r0)
            w0.m.f14787d = r0
            r6.f14764b = r2
            r6.f14763a = r0
            r0 = 0
            r6.f14750g = r0
            r0 = 0
            r6.f14751h = r0
            r6.o()
            w0.j r6 = w0.m.f14787d
            w0.j r6 = r6.f(r2)
            w0.m.f14787d = r6
            return r7
    }

    public static final w0.w w(w0.w r7, w0.u r8, w0.f r9) {
            boolean r0 = r9.f()
            if (r0 == 0) goto L9
            r9.n(r8)
        L9:
            long r0 = r9.g()
            w0.j r2 = r9.d()
            w0.w r7 = s(r7, r0, r2)
            r2 = 0
            if (r7 == 0) goto L5e
            long r3 = r7.f14824a
            long r5 = r9.g()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L23
            return r7
        L23:
            java.lang.Object r3 = w0.m.f14786c
            monitor-enter(r3)
            w0.w r4 = r8.a()     // Catch: java.lang.Throwable -> L56
            w0.j r5 = r9.d()     // Catch: java.lang.Throwable -> L56
            w0.w r4 = s(r4, r0, r5)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L58
            long r5 = r4.f14824a     // Catch: java.lang.Throwable -> L56
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L49
        L3b:
            w0.w r0 = m(r4, r8)     // Catch: java.lang.Throwable -> L56
            r0.a(r4)     // Catch: java.lang.Throwable -> L56
            long r1 = r9.g()     // Catch: java.lang.Throwable -> L56
            r0.f14824a = r1     // Catch: java.lang.Throwable -> L56
            r4 = r0
        L49:
            monitor-exit(r3)
            long r0 = r7.f14824a
            r7 = 1
            long r2 = (long) r7
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L55
            r9.n(r8)
        L55:
            return r4
        L56:
            r7 = move-exception
            goto L5c
        L58:
            r()     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L5c:
            monitor-exit(r3)
            throw r7
        L5e:
            r()
            throw r2
    }
}
