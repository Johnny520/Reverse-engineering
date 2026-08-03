package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements i0.n {
    public final b5.i A;
    public final i0.h0 B;
    public int C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.o f5996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x1.f2 f5997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f5998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Object f5999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.n0 f6000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0.h f6001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.k0 f6002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.l0 f6003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.l0 f6004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f.k0 f6005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0.a f6006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0.a f6007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f.k0 f6008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f.k0 f6009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i0.e2 f6011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i0.l1 f6012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i0.q f6013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6014y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final androidx.lifecycle.x f6015z;

    public q(i0.o r11, x1.f2 r12) {
            r10 = this;
            r10.<init>()
            r10.f5996g = r11
            r10.f5997h = r12
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r10.f5998i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r10.f5999j = r0
            f.l0 r0 = new f.l0
            r0.<init>()
            f.n0 r5 = new f.n0
            r5.<init>(r0)
            r10.f6000k = r5
            l0.h r0 = new l0.h
            r0.<init>()
            boolean r1 = r11.d()
            if (r1 == 0) goto L34
            f.w r1 = new f.w
            r1.<init>()
            r0.f7690q = r1
        L34:
            boolean r1 = r11.f()
            if (r1 == 0) goto L3d
            r0.c()
        L3d:
            r10.f6001l = r0
            f.k0 r1 = f8.i.o()
            r10.f6002m = r1
            f.l0 r1 = new f.l0
            r1.<init>()
            r10.f6003n = r1
            f.l0 r1 = new f.l0
            r1.<init>()
            r10.f6004o = r1
            f.k0 r1 = f8.i.o()
            r10.f6005p = r1
            m0.a r6 = new m0.a
            r6.<init>()
            r10.f6006q = r6
            m0.a r7 = new m0.a
            r7.<init>()
            r10.f6007r = r7
            f.k0 r1 = f8.i.o()
            r10.f6008s = r1
            f.k0 r1 = f8.i.o()
            r10.f6009t = r1
            androidx.lifecycle.x r8 = new androidx.lifecycle.x
            r1 = 23
            r8.<init>(r11, r1)
            r10.f6015z = r8
            b5.i r1 = new b5.i
            r1.<init>()
            r10.A = r1
            l0.h r4 = l0.j.d(r0)
            i0.h0 r1 = new i0.h0
            r9 = r10
            r3 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r3.p(r1)
            r9.B = r1
            return
    }

    public final void A(fg.p r4) {
            r3 = this;
            boolean r0 = r3.i()
            r3.q()
            i0.o r1 = r3.f5996g
            if (r0 == 0) goto L1a
            r0 = 0
            i0.h0 r2 = r3.B
            r2.f5919z = r0
            r0 = 1
            r2.f5918y = r0
            r1.a(r3, r4)
            r2.u()
            return
        L1a:
            r1.a(r3, r4)
            return
    }

    public final void a() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.f5998i
            r1 = 0
            r0.set(r1)
            m0.a r0 = r3.f6006q
            m0.l0 r0 = r0.f8437j
            r0.R()
            m0.a r0 = r3.f6007r
            m0.l0 r0 = r0.f8437j
            r0.R()
            f.n0 r0 = r3.f6000k
            f.l0 r1 = r0.f2874g
            boolean r1 = r1.g()
            if (r1 != 0) goto L35
            b5.i r1 = r3.A
            i0.h0 r2 = r3.B
            x0.d r2 = r2.C()
            r1.i(r0, r2)     // Catch: java.lang.Throwable -> L30
            r1.b()     // Catch: java.lang.Throwable -> L30
            r1.a()
            return
        L30:
            r0 = move-exception
            r1.a()
            throw r0
        L35:
            return
    }

    public final void b(java.lang.Object r21, boolean r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            f.k0 r2 = r0.f6002m
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9c
            boolean r3 = r2 instanceof f.l0
            i0.o0 r4 = i0.o0.f5985g
            f.l0 r5 = r0.f6003n
            f.l0 r6 = r0.f6004o
            f.k0 r7 = r0.f6008s
            if (r3 == 0) goto L81
            f.l0 r2 = (f.l0) r2
            java.lang.Object[] r3 = r2.f2856b
            long[] r2 = r2.f2855a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9c
            r10 = 0
        L24:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            i0.r1 r9 = (i0.r1) r9
            boolean r16 = f8.i.w0(r7, r1, r9)
            if (r16 != 0) goto L70
            r16 = r14
            i0.o0 r14 = r9.b(r1)
            if (r14 == r4) goto L72
            f.k0 r14 = r9.f6038g
            if (r14 == 0) goto L6c
            if (r22 != 0) goto L6c
            r6.a(r9)
            goto L72
        L6c:
            r5.a(r9)
            goto L72
        L70:
            r16 = r14
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L3e
        L79:
            r9 = r14
            if (r13 != r9) goto L9c
        L7c:
            if (r10 == r8) goto L9c
            int r10 = r10 + 1
            goto L24
        L81:
            i0.r1 r2 = (i0.r1) r2
            boolean r3 = f8.i.w0(r7, r1, r2)
            if (r3 != 0) goto L9c
            i0.o0 r1 = r2.b(r1)
            if (r1 == r4) goto L9c
            f.k0 r1 = r2.f6038g
            if (r1 == 0) goto L99
            if (r22 != 0) goto L99
            r6.a(r2)
            return
        L99:
            r5.a(r2)
        L9c:
            return
    }

    public final void c(java.util.Set r33, boolean r34) {
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            boolean r3 = r1 instanceof j0.d
            f.k0 r4 = r0.f6005p
            r5 = 0
            r14 = 8
            if (r3 == 0) goto L111
            j0.d r1 = (j0.d) r1
            f.l0 r1 = r1.f6674g
            java.lang.Object[] r3 = r1.f2856b
            long[] r1 = r1.f2855a
            int r15 = r1.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto L104
            r6 = 0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L21:
            r8 = r1[r6]
            r7 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = ~r8
            long r10 = r10 << r7
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto Lf5
            int r10 = r6 - r15
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L3a:
            if (r11 >= r10) goto Le9
            long r22 = r8 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto Ld2
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            r22 = r7
            boolean r7 = r12 instanceof i0.r1
            if (r7 == 0) goto L5a
            i0.r1 r12 = (i0.r1) r12
            r12.b(r5)
        L52:
            r29 = r1
            r26 = r8
            r33 = r15
            goto Lcf
        L5a:
            r0.b(r12, r2)
            java.lang.Object r7 = r4.g(r12)
            if (r7 == 0) goto L52
            boolean r12 = r7 instanceof f.l0
            if (r12 == 0) goto Lc4
            f.l0 r7 = (f.l0) r7
            java.lang.Object[] r12 = r7.f2856b
            long[] r7 = r7.f2855a
            int r13 = r7.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L52
            r25 = r14
            r33 = r15
            r5 = 0
        L77:
            r14 = r7[r5]
            r26 = r8
            r9 = r7
            long r7 = ~r14
            long r7 = r7 << r22
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto Lb6
            int r7 = r5 - r13
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L8e:
            if (r8 >= r7) goto Laf
            long r28 = r14 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto La6
            int r28 = r5 << 3
            int r28 = r28 + r8
            r28 = r12[r28]
            r29 = r1
            r1 = r28
            i0.x r1 = (i0.x) r1
            r0.b(r1, r2)
            goto La8
        La6:
            r29 = r1
        La8:
            long r14 = r14 >> r25
            int r8 = r8 + 1
            r1 = r29
            goto L8e
        Laf:
            r29 = r1
            r1 = r25
            if (r7 != r1) goto Lcf
            goto Lb8
        Lb6:
            r29 = r1
        Lb8:
            if (r5 == r13) goto Lcf
            int r5 = r5 + 1
            r7 = r9
            r8 = r26
            r1 = r29
            r25 = 8
            goto L77
        Lc4:
            r29 = r1
            r26 = r8
            r33 = r15
            i0.x r7 = (i0.x) r7
            r0.b(r7, r2)
        Lcf:
            r1 = 8
            goto Ldb
        Ld2:
            r29 = r1
            r22 = r7
            r26 = r8
            r33 = r15
            r1 = r14
        Ldb:
            long r8 = r26 >> r1
            int r11 = r11 + 1
            r15 = r33
            r14 = r1
            r7 = r22
            r1 = r29
            r5 = 0
            goto L3a
        Le9:
            r29 = r1
            r22 = r7
            r1 = r14
            r33 = r15
            if (r10 != r1) goto L18e
            r15 = r33
            goto Lf9
        Lf5:
            r29 = r1
            r22 = r7
        Lf9:
            if (r6 == r15) goto L18e
            int r6 = r6 + 1
            r1 = r29
            r5 = 0
            r14 = 8
            goto L21
        L104:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            goto L18e
        L111:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L122:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L18e
            java.lang.Object r3 = r1.next()
            boolean r5 = r3 instanceof i0.r1
            if (r5 == 0) goto L137
            i0.r1 r3 = (i0.r1) r3
            r5 = 0
            r3.b(r5)
            goto L122
        L137:
            r5 = 0
            r0.b(r3, r2)
            java.lang.Object r3 = r4.g(r3)
            if (r3 == 0) goto L122
            boolean r6 = r3 instanceof f.l0
            if (r6 == 0) goto L188
            f.l0 r3 = (f.l0) r3
            java.lang.Object[] r6 = r3.f2856b
            long[] r3 = r3.f2855a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L122
            r8 = 0
        L151:
            r9 = r3[r8]
            long r11 = ~r9
            long r11 = r11 << r22
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L183
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r25 = 8
            int r14 = 8 - r11
            r11 = 0
        L167:
            if (r11 >= r14) goto L17f
            long r12 = r9 & r18
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 >= 0) goto L179
            int r12 = r8 << 3
            int r12 = r12 + r11
            r12 = r6[r12]
            i0.x r12 = (i0.x) r12
            r0.b(r12, r2)
        L179:
            r12 = 8
            long r9 = r9 >> r12
            int r11 = r11 + 1
            goto L167
        L17f:
            r12 = 8
            if (r14 != r12) goto L122
        L183:
            if (r8 == r7) goto L122
            int r8 = r8 + 1
            goto L151
        L188:
            i0.x r3 = (i0.x) r3
            r0.b(r3, r2)
            goto L122
        L18e:
            f.k0 r1 = r0.f6002m
            f.l0 r4 = r0.f6003n
            if (r2 == 0) goto L299
            f.l0 r2 = r0.f6004o
            boolean r5 = r2.h()
            if (r5 == 0) goto L299
            long[] r5 = r1.f2848a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L292
            r7 = 0
        L1a4:
            r8 = r5[r7]
            long r10 = ~r8
            long r10 = r10 << r22
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L286
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r25 = 8
            int r14 = 8 - r10
            r10 = 0
        L1ba:
            if (r10 >= r14) goto L27b
            long r11 = r8 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L268
            int r11 = r7 << 3
            int r11 = r11 + r10
            java.lang.Object[] r12 = r1.f2849b
            r12 = r12[r11]
            java.lang.Object[] r12 = r1.f2850c
            r12 = r12[r11]
            boolean r13 = r12 instanceof f.l0
            if (r13 == 0) goto L245
            f.l0 r12 = (f.l0) r12
            java.lang.Object[] r13 = r12.f2856b
            long[] r15 = r12.f2855a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L23a
            r26 = r8
            r0 = 0
        L1df:
            r8 = r15[r0]
            r24 = r5
            r34 = r6
            long r5 = ~r8
            long r5 = r5 << r22
            long r5 = r5 & r8
            long r5 = r5 & r20
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 == 0) goto L231
            int r5 = r0 - r3
            int r5 = ~r5
            int r5 = r5 >>> 31
            r25 = 8
            int r5 = 8 - r5
            r6 = 0
        L1f9:
            if (r6 >= r5) goto L22d
            long r28 = r8 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L221
            int r28 = r0 << 3
            r29 = r6
            int r6 = r28 + r29
            r28 = r13[r6]
            r30 = r8
            r8 = r28
            i0.r1 r8 = (i0.r1) r8
            boolean r9 = r2.c(r8)
            if (r9 != 0) goto L21b
            boolean r8 = r4.c(r8)
            if (r8 == 0) goto L21e
        L21b:
            r12.m(r6)
        L21e:
            r6 = 8
            goto L226
        L221:
            r29 = r6
            r30 = r8
            goto L21e
        L226:
            long r8 = r30 >> r6
            int r25 = r29 + 1
            r6 = r25
            goto L1f9
        L22d:
            r6 = 8
            if (r5 != r6) goto L240
        L231:
            if (r0 == r3) goto L240
            int r0 = r0 + 1
            r6 = r34
            r5 = r24
            goto L1df
        L23a:
            r24 = r5
            r34 = r6
            r26 = r8
        L240:
            boolean r0 = r12.g()
            goto L260
        L245:
            r24 = r5
            r34 = r6
            r26 = r8
            r12.getClass()
            i0.r1 r12 = (i0.r1) r12
            boolean r0 = r2.c(r12)
            if (r0 != 0) goto L25f
            boolean r0 = r4.c(r12)
            if (r0 == 0) goto L25d
            goto L25f
        L25d:
            r0 = 0
            goto L260
        L25f:
            r0 = 1
        L260:
            if (r0 == 0) goto L265
            r1.l(r11)
        L265:
            r6 = 8
            goto L26f
        L268:
            r24 = r5
            r34 = r6
            r26 = r8
            goto L265
        L26f:
            long r8 = r26 >> r6
            int r10 = r10 + 1
            r0 = r32
            r6 = r34
            r5 = r24
            goto L1ba
        L27b:
            r24 = r5
            r34 = r6
            r6 = 8
            if (r14 != r6) goto L292
            r6 = r34
            goto L288
        L286:
            r24 = r5
        L288:
            if (r7 == r6) goto L292
            int r7 = r7 + 1
            r0 = r32
            r5 = r24
            goto L1a4
        L292:
            r2.b()
            r32.h()
            return
        L299:
            boolean r0 = r4.h()
            if (r0 == 0) goto L38f
            long[] r0 = r1.f2848a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L389
            r3 = 0
        L2a7:
            r5 = r0[r3]
            long r7 = ~r5
            long r7 = r7 << r22
            long r7 = r7 & r5
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L37d
            int r7 = r3 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r25 = 8
            int r14 = 8 - r7
            r7 = 0
        L2bd:
            if (r7 >= r14) goto L376
            long r8 = r5 & r18
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L2c7
            r8 = 1
            goto L2c8
        L2c7:
            r8 = 0
        L2c8:
            if (r8 == 0) goto L368
            int r8 = r3 << 3
            int r8 = r8 + r7
            java.lang.Object[] r9 = r1.f2849b
            r9 = r9[r8]
            java.lang.Object[] r9 = r1.f2850c
            r9 = r9[r8]
            boolean r10 = r9 instanceof f.l0
            if (r10 == 0) goto L353
            f.l0 r9 = (f.l0) r9
            java.lang.Object[] r10 = r9.f2856b
            long[] r11 = r9.f2855a
            int r12 = r11.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto L34a
            r26 = r5
            r13 = 0
        L2e7:
            r5 = r11[r13]
            r15 = r10
            r24 = r11
            long r10 = ~r5
            long r10 = r10 << r22
            long r10 = r10 & r5
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L33e
            int r10 = r13 - r12
            int r10 = ~r10
            int r10 = r10 >>> 31
            r25 = 8
            int r10 = 8 - r10
            r11 = 0
        L300:
            if (r11 >= r10) goto L337
            long r28 = r5 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L30b
            r28 = 1
            goto L30d
        L30b:
            r28 = 0
        L30d:
            if (r28 == 0) goto L329
            int r28 = r13 << 3
            r29 = r0
            int r0 = r28 + r11
            r28 = r15[r0]
            r30 = r5
            r5 = r28
            i0.r1 r5 = (i0.r1) r5
            boolean r5 = r4.c(r5)
            if (r5 == 0) goto L326
            r9.m(r0)
        L326:
            r6 = 8
            goto L32e
        L329:
            r29 = r0
            r30 = r5
            goto L326
        L32e:
            long r30 = r30 >> r6
            int r11 = r11 + 1
            r0 = r29
            r5 = r30
            goto L300
        L337:
            r29 = r0
            r6 = 8
            if (r10 != r6) goto L34e
            goto L340
        L33e:
            r29 = r0
        L340:
            if (r13 == r12) goto L34e
            int r13 = r13 + 1
            r10 = r15
            r11 = r24
            r0 = r29
            goto L2e7
        L34a:
            r29 = r0
            r26 = r5
        L34e:
            boolean r0 = r9.g()
            goto L360
        L353:
            r29 = r0
            r26 = r5
            r9.getClass()
            i0.r1 r9 = (i0.r1) r9
            boolean r0 = r4.c(r9)
        L360:
            if (r0 == 0) goto L365
            r1.l(r8)
        L365:
            r6 = 8
            goto L36d
        L368:
            r29 = r0
            r26 = r5
            goto L365
        L36d:
            long r8 = r26 >> r6
            int r7 = r7 + 1
            r5 = r8
            r0 = r29
            goto L2bd
        L376:
            r29 = r0
            r6 = 8
            if (r14 != r6) goto L389
            goto L381
        L37d:
            r29 = r0
            r6 = 8
        L381:
            if (r3 == r2) goto L389
            int r3 = r3 + 1
            r0 = r29
            goto L2a7
        L389:
            r32.h()
            r4.b()
        L38f:
            return
    }

    public final void d() {
            r5 = this;
            java.lang.Object r0 = r5.f5999j
            monitor-enter(r0)
            m0.a r1 = r5.f6006q     // Catch: java.lang.Throwable -> Ld
            r5.e(r1)     // Catch: java.lang.Throwable -> Ld
            r5.o()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r1 = move-exception
            f.n0 r2 = r5.f6000k     // Catch: java.lang.Throwable -> L2c
            f.l0 r2 = r2.f2874g     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L33
            b5.i r2 = r5.A     // Catch: java.lang.Throwable -> L2c
            f.n0 r3 = r5.f6000k     // Catch: java.lang.Throwable -> L2c
            i0.h0 r4 = r5.B     // Catch: java.lang.Throwable -> L2c
            x0.d r4 = r4.C()     // Catch: java.lang.Throwable -> L2c
            r2.i(r3, r4)     // Catch: java.lang.Throwable -> L2e
            r2.b()     // Catch: java.lang.Throwable -> L2e
            r2.a()     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r1 = move-exception
            goto L34
        L2e:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L33:
            throw r1     // Catch: java.lang.Throwable -> L2c
        L34:
            r5.a()     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void e(m0.a r34) {
            r33 = this;
            r1 = r33
            r0 = r34
            m0.a r2 = r1.f6007r
            i0.h0 r3 = r1.B
            x0.d r4 = r3.C()
            b5.i r5 = r1.A
            f.n0 r6 = r1.f6000k
            r5.i(r6, r4)
            m0.l0 r4 = r0.f8437j     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r4.T()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L35
            m0.l0 r0 = r2.f8437j     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.T()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            i0.l1 r0 = r1.f6012w     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2d
            r5.b()     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r5.a()
            return
        L31:
            r5.a()
            throw r0
        L35:
            i0.l1 r4 = r1.f6012w     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L43
            i0.z1 r6 = r4.f5965l     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L43
            goto L45
        L3e:
            r0 = move-exception
            r26 = r5
            goto L1cf
        L43:
            x1.f2 r6 = r1.f5997h     // Catch: java.lang.Throwable -> L3e
        L45:
            if (r4 == 0) goto L4a
            i0.z1 r4 = r4.f5965l     // Catch: java.lang.Throwable -> L3e
            goto L4b
        L4a:
            r4 = 0
        L4b:
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L54
            java.lang.String r4 = "Compose:recordChanges"
            goto L56
        L54:
            java.lang.String r4 = "Compose:applyChanges"
        L56:
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L3e
            i0.l1 r4 = r1.f6012w     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L67
            b5.i r4 = r4.f5964k     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L68
            goto L67
        L62:
            r0 = move-exception
            r26 = r5
            goto L1cb
        L67:
            r4 = r5
        L68:
            l0.h r7 = r1.f6001l     // Catch: java.lang.Throwable -> L62
            x0.d r3 = r3.C()     // Catch: java.lang.Throwable -> L62
            l0.h r7 = l0.j.d(r7)     // Catch: java.lang.Throwable -> L62
            l0.k r7 = r7.e()     // Catch: java.lang.Throwable -> L62
            r8 = 0
            r0.t0(r6, r7, r4, r3)     // Catch: java.lang.Throwable -> L1c2
            r0 = 1
            r7.e(r0)     // Catch: java.lang.Throwable -> L62
            r6.q()     // Catch: java.lang.Throwable -> L62
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3e
            r5.c()     // Catch: java.lang.Throwable -> L3e
            r5.d()     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r1.f6010u     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L1a6
            java.lang.String r3 = "Compose:unobserve"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L3e
            r1.f6010u = r8     // Catch: java.lang.Throwable -> L13f
            f.k0 r3 = r1.f6002m     // Catch: java.lang.Throwable -> L13f
            long[] r4 = r3.f2848a     // Catch: java.lang.Throwable -> L13f
            int r6 = r4.length     // Catch: java.lang.Throwable -> L13f
            int r6 = r6 + (-2)
            if (r6 < 0) goto L197
            r7 = r8
        L9f:
            r9 = r4[r7]     // Catch: java.lang.Throwable -> L13f
            long r11 = ~r9     // Catch: java.lang.Throwable -> L13f
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L187
            int r11 = r7 - r6
            int r11 = ~r11     // Catch: java.lang.Throwable -> L13f
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r0 = r8
        Lb9:
            if (r0 >= r11) goto L17f
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r9 & r16
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L162
            int r18 = r7 << 3
            r19 = r13
            int r13 = r18 + r0
            r22 = r14
            java.lang.Object[] r14 = r3.f2849b     // Catch: java.lang.Throwable -> L13f
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L13f
            java.lang.Object[] r14 = r3.f2850c     // Catch: java.lang.Throwable -> L13f
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L13f
            boolean r15 = r14 instanceof f.l0     // Catch: java.lang.Throwable -> L13f
            if (r15 == 0) goto L144
            f.l0 r14 = (f.l0) r14     // Catch: java.lang.Throwable -> L13f
            java.lang.Object[] r15 = r14.f2856b     // Catch: java.lang.Throwable -> L13f
            long[] r8 = r14.f2855a     // Catch: java.lang.Throwable -> L13f
            r24 = r12
            int r12 = r8.length     // Catch: java.lang.Throwable -> L13f
            int r12 = r12 + (-2)
            r25 = r0
            r27 = r4
            r26 = r5
            if (r12 < 0) goto L138
            r0 = 0
        Led:
            r4 = r8[r0]     // Catch: java.lang.Throwable -> L120
            r28 = r9
            r10 = r8
            long r8 = ~r4     // Catch: java.lang.Throwable -> L120
            long r8 = r8 << r19
            long r8 = r8 & r4
            long r8 = r8 & r22
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r8 == 0) goto L12e
            int r8 = r0 - r12
            int r8 = ~r8     // Catch: java.lang.Throwable -> L120
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = 0
        L104:
            if (r9 >= r8) goto L12a
            long r30 = r4 & r16
            int r30 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r30 >= 0) goto L123
            int r30 = r0 << 3
            r31 = r4
            int r4 = r30 + r9
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L120
            i0.r1 r5 = (i0.r1) r5     // Catch: java.lang.Throwable -> L120
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> L120
            if (r5 != 0) goto L125
            r14.m(r4)     // Catch: java.lang.Throwable -> L120
            goto L125
        L120:
            r0 = move-exception
            goto L1a2
        L123:
            r31 = r4
        L125:
            long r4 = r31 >> r24
            int r9 = r9 + 1
            goto L104
        L12a:
            r4 = r24
            if (r8 != r4) goto L13a
        L12e:
            if (r0 == r12) goto L13a
            int r0 = r0 + 1
            r8 = r10
            r9 = r28
            r24 = 8
            goto Led
        L138:
            r28 = r9
        L13a:
            boolean r0 = r14.g()     // Catch: java.lang.Throwable -> L120
            goto L15a
        L13f:
            r0 = move-exception
            r26 = r5
            goto L1a2
        L144:
            r25 = r0
            r27 = r4
            r26 = r5
            r28 = r9
            r14.getClass()     // Catch: java.lang.Throwable -> L120
            i0.r1 r14 = (i0.r1) r14     // Catch: java.lang.Throwable -> L120
            boolean r0 = r14.a()     // Catch: java.lang.Throwable -> L120
            if (r0 != 0) goto L159
            r0 = 1
            goto L15a
        L159:
            r0 = 0
        L15a:
            if (r0 == 0) goto L15f
            r3.l(r13)     // Catch: java.lang.Throwable -> L120
        L15f:
            r4 = 8
            goto L16f
        L162:
            r25 = r0
            r27 = r4
            r26 = r5
            r28 = r9
            r19 = r13
            r22 = r14
            r4 = r12
        L16f:
            long r9 = r28 >> r4
            int r0 = r25 + 1
            r12 = r4
            r13 = r19
            r14 = r22
            r5 = r26
            r4 = r27
            r8 = 0
            goto Lb9
        L17f:
            r27 = r4
            r26 = r5
            r4 = r12
            if (r11 != r4) goto L199
            goto L18b
        L187:
            r27 = r4
            r26 = r5
        L18b:
            if (r7 == r6) goto L199
            int r7 = r7 + 1
            r5 = r26
            r4 = r27
            r0 = 1
            r8 = 0
            goto L9f
        L197:
            r26 = r5
        L199:
            r1.h()     // Catch: java.lang.Throwable -> L120
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1a0
            goto L1a8
        L1a0:
            r0 = move-exception
            goto L1cf
        L1a2:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1a0
            throw r0     // Catch: java.lang.Throwable -> L1a0
        L1a6:
            r26 = r5
        L1a8:
            m0.l0 r0 = r2.f8437j     // Catch: java.lang.Throwable -> L1b8
            boolean r0 = r0.T()     // Catch: java.lang.Throwable -> L1b8
            if (r0 == 0) goto L1ba
            i0.l1 r0 = r1.f6012w     // Catch: java.lang.Throwable -> L1b8
            if (r0 != 0) goto L1ba
            r26.b()     // Catch: java.lang.Throwable -> L1b8
            goto L1ba
        L1b8:
            r0 = move-exception
            goto L1be
        L1ba:
            r26.a()
            return
        L1be:
            r26.a()
            throw r0
        L1c2:
            r0 = move-exception
            r26 = r5
            r3 = 0
            r7.e(r3)     // Catch: java.lang.Throwable -> L1ca
            throw r0     // Catch: java.lang.Throwable -> L1ca
        L1ca:
            r0 = move-exception
        L1cb:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1a0
            throw r0     // Catch: java.lang.Throwable -> L1a0
        L1cf:
            m0.l0 r2 = r2.f8437j     // Catch: java.lang.Throwable -> L1df
            boolean r2 = r2.T()     // Catch: java.lang.Throwable -> L1df
            if (r2 == 0) goto L1e1
            i0.l1 r2 = r1.f6012w     // Catch: java.lang.Throwable -> L1df
            if (r2 != 0) goto L1e1
            r26.b()     // Catch: java.lang.Throwable -> L1df
            goto L1e1
        L1df:
            r0 = move-exception
            goto L1e5
        L1e1:
            r26.a()
            throw r0
        L1e5:
            r26.a()
            throw r0
    }

    public final void f() {
            r5 = this;
            java.lang.Object r0 = r5.f5999j
            monitor-enter(r0)
            m0.a r1 = r5.f6007r     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            m0.l0 r1 = r1.f8437j     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.T()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            m0.a r1 = r5.f6007r     // Catch: java.lang.Throwable -> L16
            r5.e(r1)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)
            return
        L1a:
            f.n0 r2 = r5.f6000k     // Catch: java.lang.Throwable -> L38
            f.l0 r2 = r2.f2874g     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L3f
            b5.i r2 = r5.A     // Catch: java.lang.Throwable -> L38
            f.n0 r3 = r5.f6000k     // Catch: java.lang.Throwable -> L38
            i0.h0 r4 = r5.B     // Catch: java.lang.Throwable -> L38
            x0.d r4 = r4.C()     // Catch: java.lang.Throwable -> L38
            r2.i(r3, r4)     // Catch: java.lang.Throwable -> L3a
            r2.b()     // Catch: java.lang.Throwable -> L3a
            r2.a()     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r1 = move-exception
            goto L40
        L3a:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L3f:
            throw r1     // Catch: java.lang.Throwable -> L38
        L40:
            r5.a()     // Catch: java.lang.Throwable -> L44
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void g() {
            r5 = this;
            java.lang.Object r0 = r5.f5999j
            monitor-enter(r0)
            i0.h0 r1 = r5.B     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r1.f5915v = r2     // Catch: java.lang.Throwable -> L26
            f.n0 r1 = r5.f6000k     // Catch: java.lang.Throwable -> L26
            f.l0 r1 = r1.f2874g     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2d
            b5.i r1 = r5.A     // Catch: java.lang.Throwable -> L26
            f.n0 r2 = r5.f6000k     // Catch: java.lang.Throwable -> L26
            i0.h0 r3 = r5.B     // Catch: java.lang.Throwable -> L26
            x0.d r3 = r3.C()     // Catch: java.lang.Throwable -> L26
            r1.i(r2, r3)     // Catch: java.lang.Throwable -> L28
            r1.b()     // Catch: java.lang.Throwable -> L28
            r1.a()     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            goto L2f
        L28:
            r2 = move-exception
            r1.a()     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L2d:
            monitor-exit(r0)
            return
        L2f:
            f.n0 r2 = r5.f6000k     // Catch: java.lang.Throwable -> L4d
            f.l0 r2 = r2.f2874g     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L54
            b5.i r2 = r5.A     // Catch: java.lang.Throwable -> L4d
            f.n0 r3 = r5.f6000k     // Catch: java.lang.Throwable -> L4d
            i0.h0 r4 = r5.B     // Catch: java.lang.Throwable -> L4d
            x0.d r4 = r4.C()     // Catch: java.lang.Throwable -> L4d
            r2.i(r3, r4)     // Catch: java.lang.Throwable -> L4f
            r2.b()     // Catch: java.lang.Throwable -> L4f
            r2.a()     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r1 = move-exception
            goto L55
        L4f:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L54:
            throw r1     // Catch: java.lang.Throwable -> L4d
        L55:
            r5.a()     // Catch: java.lang.Throwable -> L59
            throw r1     // Catch: java.lang.Throwable -> L59
        L59:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void h() {
            r33 = this;
            r0 = r33
            f.k0 r1 = r0.f6005p
            long[] r2 = r1.f2848a
            int r3 = r2.length
            int r3 = r3 + (-2)
            r8 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            if (r3 < 0) goto L119
            r14 = 0
            r15 = 128(0x80, double:6.3E-322)
        L16:
            r4 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r6 = ~r4
            long r6 = r6 << r8
            long r6 = r6 & r4
            long r6 = r6 & r9
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L101
            int r6 = r14 - r3
            int r6 = ~r6
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r7 = 0
        L2a:
            if (r7 >= r6) goto Lf1
            long r19 = r4 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto Ld3
            int r19 = r14 << 3
            r20 = r8
            int r8 = r19 + r7
            r21 = r9
            java.lang.Object[] r9 = r1.f2849b
            r9 = r9[r8]
            java.lang.Object[] r9 = r1.f2850c
            r9 = r9[r8]
            boolean r10 = r9 instanceof f.l0
            f.k0 r11 = r0.f6002m
            if (r10 == 0) goto Lb5
            f.l0 r9 = (f.l0) r9
            java.lang.Object[] r10 = r9.f2856b
            long[] r13 = r9.f2855a
            r23 = r15
            int r15 = r13.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto Laa
            r25 = r4
            r16 = r12
            r12 = 0
        L5a:
            r4 = r13[r12]
            r27 = r2
            r28 = r3
            long r2 = ~r4
            long r2 = r2 << r20
            long r2 = r2 & r4
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r2 = r12 - r15
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L72:
            if (r3 >= r2) goto L9b
            long r29 = r4 & r17
            int r29 = (r29 > r23 ? 1 : (r29 == r23 ? 0 : -1))
            if (r29 >= 0) goto L92
            int r29 = r12 << 3
            r30 = r3
            int r3 = r29 + r30
            r29 = r10[r3]
            r31 = r4
            r4 = r29
            i0.x r4 = (i0.x) r4
            boolean r4 = r11.c(r4)
            if (r4 != 0) goto L96
            r9.m(r3)
            goto L96
        L92:
            r30 = r3
            r31 = r4
        L96:
            long r4 = r31 >> r16
            int r3 = r30 + 1
            goto L72
        L9b:
            r3 = r16
            if (r2 != r3) goto Lb0
        L9f:
            if (r12 == r15) goto Lb0
            int r12 = r12 + 1
            r2 = r27
            r3 = r28
            r16 = 8
            goto L5a
        Laa:
            r27 = r2
            r28 = r3
            r25 = r4
        Lb0:
            boolean r2 = r9.g()
            goto Lcb
        Lb5:
            r27 = r2
            r28 = r3
            r25 = r4
            r23 = r15
            r9.getClass()
            i0.x r9 = (i0.x) r9
            boolean r2 = r11.c(r9)
            if (r2 != 0) goto Lca
            r2 = 1
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            if (r2 == 0) goto Ld0
            r1.l(r8)
        Ld0:
            r3 = 8
            goto Le0
        Ld3:
            r27 = r2
            r28 = r3
            r25 = r4
            r20 = r8
            r21 = r9
            r23 = r15
            r3 = r12
        Le0:
            long r4 = r25 >> r3
            int r7 = r7 + 1
            r12 = r3
            r8 = r20
            r9 = r21
            r15 = r23
            r2 = r27
            r3 = r28
            goto L2a
        Lf1:
            r27 = r2
            r28 = r3
            r20 = r8
            r21 = r9
            r3 = r12
            r23 = r15
            if (r6 != r3) goto L121
            r3 = r28
            goto L109
        L101:
            r27 = r2
            r20 = r8
            r21 = r9
            r23 = r15
        L109:
            if (r14 == r3) goto L121
            int r14 = r14 + 1
            r8 = r20
            r9 = r21
            r15 = r23
            r2 = r27
            r12 = 8
            goto L16
        L119:
            r20 = r8
            r21 = r9
            r17 = 255(0xff, double:1.26E-321)
            r23 = 128(0x80, double:6.3E-322)
        L121:
            f.l0 r1 = r0.f6004o
            boolean r2 = r1.h()
            if (r2 == 0) goto L17b
            java.lang.Object[] r2 = r1.f2856b
            long[] r3 = r1.f2855a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L17b
            r5 = 0
        L133:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L174
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r16 = 8
            int r12 = 8 - r8
            r8 = 0
        L149:
            if (r8 >= r12) goto L16f
            long r9 = r6 & r17
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 >= 0) goto L153
            r9 = 1
            goto L154
        L153:
            r9 = 0
        L154:
            if (r9 == 0) goto L169
            int r9 = r5 << 3
            int r9 = r9 + r8
            r10 = r2[r9]
            i0.r1 r10 = (i0.r1) r10
            f.k0 r10 = r10.f6038g
            if (r10 == 0) goto L163
            r10 = 1
            goto L164
        L163:
            r10 = 0
        L164:
            if (r10 != 0) goto L169
            r1.m(r9)
        L169:
            r9 = 8
            long r6 = r6 >> r9
            int r8 = r8 + 1
            goto L149
        L16f:
            r9 = 8
            if (r12 != r9) goto L17b
            goto L176
        L174:
            r9 = 8
        L176:
            if (r5 == r4) goto L17b
            int r5 = r5 + 1
            goto L133
        L17b:
            return
    }

    public final boolean i() {
            r4 = this;
            java.lang.Object r0 = r4.f5999j
            monitor-enter(r0)
            int r1 = r4.C     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r3 = 1
            if (r1 != r3) goto La
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L12
            r4.C = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r1 = move-exception
            goto L14
        L12:
            monitor-exit(r0)
            return r3
        L14:
            monitor-exit(r0)
            throw r1
    }

    public final void j(fg.p r6) {
            r5 = this;
            java.lang.Object r0 = r5.f5999j     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2b
            r5.n()     // Catch: java.lang.Throwable -> L35
            f.k0 r1 = r5.f6009t     // Catch: java.lang.Throwable -> L35
            f.k0 r2 = f8.i.o()     // Catch: java.lang.Throwable -> L35
            r5.f6009t = r2     // Catch: java.lang.Throwable -> L35
            i0.h0 r2 = r5.B     // Catch: java.lang.Throwable -> L31
            i0.e2 r3 = r5.f6011v     // Catch: java.lang.Throwable -> L31
            m0.a r4 = r2.f5898e     // Catch: java.lang.Throwable -> L31
            m0.l0 r4 = r4.f8437j     // Catch: java.lang.Throwable -> L31
            boolean r4 = r4.T()     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L21
            java.lang.String r4 = "Expected applyChanges() to have been called"
            i0.m.a(r4)     // Catch: java.lang.Throwable -> L31
        L21:
            r2.P = r3     // Catch: java.lang.Throwable -> L31
            r3 = 0
            r2.n(r1, r6)     // Catch: java.lang.Throwable -> L2d
            r2.P = r3     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r6 = move-exception
            goto L38
        L2d:
            r6 = move-exception
            r2.P = r3     // Catch: java.lang.Throwable -> L31
            throw r6     // Catch: java.lang.Throwable -> L31
        L31:
            r6 = move-exception
            r5.f6009t = r1     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L35:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6     // Catch: java.lang.Throwable -> L2b
        L38:
            f.n0 r0 = r5.f6000k     // Catch: java.lang.Throwable -> L56
            f.l0 r0 = r0.f2874g     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L5d
            b5.i r0 = r5.A     // Catch: java.lang.Throwable -> L56
            f.n0 r1 = r5.f6000k     // Catch: java.lang.Throwable -> L56
            i0.h0 r2 = r5.B     // Catch: java.lang.Throwable -> L56
            x0.d r2 = r2.C()     // Catch: java.lang.Throwable -> L56
            r0.i(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0.b()     // Catch: java.lang.Throwable -> L58
            r0.a()     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r6 = move-exception
            goto L5e
        L58:
            r6 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> L56
            throw r6     // Catch: java.lang.Throwable -> L56
        L5d:
            throw r6     // Catch: java.lang.Throwable -> L56
        L5e:
            r5.a()
            throw r6
    }

    public final i0.l1 k(boolean r11, fg.p r12) {
            r10 = this;
            i0.l1 r0 = r10.f6012w
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "A pausable composition is in progress"
            i0.n1.b(r0)
        La:
            i0.l1 r1 = new i0.l1
            i0.o r3 = r10.f5996g
            i0.h0 r4 = r10.B
            f.n0 r5 = r10.f6000k
            x1.f2 r8 = r10.f5997h
            java.lang.Object r9 = r10.f5999j
            r2 = r10
            r7 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2.f6012w = r1
            return r1
    }

    public final void l() {
            r9 = this;
            java.lang.Object r0 = r9.f5999j
            monitor-enter(r0)
            i0.l1 r1 = r9.f6012w     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L8
            goto Ld
        L8:
            java.lang.String r1 = "Deactivate is not supported while pausable composition is in progress"
            i0.n1.b(r1)     // Catch: java.lang.Throwable -> L25
        Ld:
            l0.h r1 = r9.f6001l     // Catch: java.lang.Throwable -> L25
            int r1 = r1.f7681h     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 == 0) goto L28
            f.n0 r4 = r9.f6000k     // Catch: java.lang.Throwable -> L25
            f.l0 r4 = r4.f2874g     // Catch: java.lang.Throwable -> L25
            boolean r4 = r4.g()     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L6b
            goto L28
        L25:
            r1 = move-exception
            goto Lac
        L28:
            java.lang.String r4 = "Compose:deactivate"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L25
            b5.i r4 = r9.A     // Catch: java.lang.Throwable -> La2
            f.n0 r5 = r9.f6000k     // Catch: java.lang.Throwable -> La2
            i0.h0 r6 = r9.B     // Catch: java.lang.Throwable -> La2
            x0.d r6 = r6.C()     // Catch: java.lang.Throwable -> La2
            r4.i(r5, r6)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L62
            l0.h r1 = r9.f6001l     // Catch: java.lang.Throwable -> L5b
            b5.i r5 = r9.A     // Catch: java.lang.Throwable -> L5b
            l0.k r1 = r1.e()     // Catch: java.lang.Throwable -> L5b
            int r6 = r1.f7713t     // Catch: java.lang.Throwable -> L5d
            b0.q r7 = new b0.q     // Catch: java.lang.Throwable -> L5d
            r8 = 7
            r7.<init>(r5, r8, r1)     // Catch: java.lang.Throwable -> L5d
            r1.n(r6, r7)     // Catch: java.lang.Throwable -> L5d
            r1.e(r3)     // Catch: java.lang.Throwable -> L5b
            x1.f2 r1 = r9.f5997h     // Catch: java.lang.Throwable -> L5b
            r1.q()     // Catch: java.lang.Throwable -> L5b
            r4.c()     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r1 = move-exception
            goto La4
        L5d:
            r3 = move-exception
            r1.e(r2)     // Catch: java.lang.Throwable -> L5b
            throw r3     // Catch: java.lang.Throwable -> L5b
        L62:
            r4.b()     // Catch: java.lang.Throwable -> L5b
            r4.a()     // Catch: java.lang.Throwable -> La2
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L25
        L6b:
            f.k0 r1 = r9.f6002m     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            f.k0 r1 = r9.f6005p     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            f.k0 r1 = r9.f6009t     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            m0.a r1 = r9.f6006q     // Catch: java.lang.Throwable -> L25
            m0.l0 r1 = r1.f8437j     // Catch: java.lang.Throwable -> L25
            r1.R()     // Catch: java.lang.Throwable -> L25
            m0.a r1 = r9.f6007r     // Catch: java.lang.Throwable -> L25
            m0.l0 r1 = r1.f8437j     // Catch: java.lang.Throwable -> L25
            r1.R()     // Catch: java.lang.Throwable -> L25
            i0.h0 r1 = r9.B     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r2 = r1.E     // Catch: java.lang.Throwable -> L25
            r2.clear()     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r2 = r1.f5912s     // Catch: java.lang.Throwable -> L25
            r2.clear()     // Catch: java.lang.Throwable -> L25
            m0.a r2 = r1.f5898e     // Catch: java.lang.Throwable -> L25
            m0.l0 r2 = r2.f8437j     // Catch: java.lang.Throwable -> L25
            r2.R()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r1.f5915v = r2     // Catch: java.lang.Throwable -> L25
            r9.C = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        La2:
            r1 = move-exception
            goto La8
        La4:
            r4.a()     // Catch: java.lang.Throwable -> La2
            throw r1     // Catch: java.lang.Throwable -> La2
        La8:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        Lac:
            monitor-exit(r0)
            throw r1
    }

    public final void m() {
            r9 = this;
            java.lang.Object r0 = r9.f5999j
            monitor-enter(r0)
            i0.h0 r1 = r9.B     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.F     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L12
            java.lang.String r1 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."
            i0.n1.b(r1)     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r1 = move-exception
            goto Lb9
        L12:
            int r1 = r9.C     // Catch: java.lang.Throwable -> Lf
            r2 = 3
            if (r1 == r2) goto Lb2
            r9.C = r2     // Catch: java.lang.Throwable -> Lf
            i0.h0 r1 = r9.B     // Catch: java.lang.Throwable -> Lf
            m0.a r1 = r1.L     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L22
            r9.e(r1)     // Catch: java.lang.Throwable -> Lf
        L22:
            l0.h r1 = r9.f6001l     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.f7681h     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 == 0) goto L39
            f.n0 r4 = r9.f6000k     // Catch: java.lang.Throwable -> Lf
            f.l0 r4 = r4.f2874g     // Catch: java.lang.Throwable -> Lf
            boolean r4 = r4.g()     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L7d
        L39:
            b5.i r4 = r9.A     // Catch: java.lang.Throwable -> Lf
            f.n0 r5 = r9.f6000k     // Catch: java.lang.Throwable -> Lf
            i0.h0 r6 = r9.B     // Catch: java.lang.Throwable -> Lf
            x0.d r6 = r6.C()     // Catch: java.lang.Throwable -> Lf
            r4.i(r5, r6)     // Catch: java.lang.Throwable -> L70
            if (r1 != 0) goto L77
            l0.h r1 = r9.f6001l     // Catch: java.lang.Throwable -> L70
            b5.i r5 = r9.A     // Catch: java.lang.Throwable -> L70
            l0.k r1 = r1.e()     // Catch: java.lang.Throwable -> L70
            int r6 = r1.f7713t     // Catch: java.lang.Throwable -> L72
            b0.t r7 = new b0.t     // Catch: java.lang.Throwable -> L72
            r8 = 8
            r7.<init>(r5, r8)     // Catch: java.lang.Throwable -> L72
            r1.n(r6, r7)     // Catch: java.lang.Throwable -> L72
            r1.H()     // Catch: java.lang.Throwable -> L72
            r1.e(r3)     // Catch: java.lang.Throwable -> L70
            x1.f2 r1 = r9.f5997h     // Catch: java.lang.Throwable -> L70
            r1.a()     // Catch: java.lang.Throwable -> L70
            x1.f2 r1 = r9.f5997h     // Catch: java.lang.Throwable -> L70
            r1.q()     // Catch: java.lang.Throwable -> L70
            r4.c()     // Catch: java.lang.Throwable -> L70
            goto L77
        L70:
            r1 = move-exception
            goto Lae
        L72:
            r3 = move-exception
            r1.e(r2)     // Catch: java.lang.Throwable -> L70
            throw r3     // Catch: java.lang.Throwable -> L70
        L77:
            r4.b()     // Catch: java.lang.Throwable -> L70
            r4.a()     // Catch: java.lang.Throwable -> Lf
        L7d:
            i0.h0 r1 = r9.B     // Catch: java.lang.Throwable -> Lf
            r1.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "Compose:Composer.dispose"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> Lf
            i0.o r2 = r1.f5895b     // Catch: java.lang.Throwable -> La9
            r2.u(r1)     // Catch: java.lang.Throwable -> La9
            java.util.ArrayList r2 = r1.E     // Catch: java.lang.Throwable -> La9
            r2.clear()     // Catch: java.lang.Throwable -> La9
            java.util.ArrayList r2 = r1.f5912s     // Catch: java.lang.Throwable -> La9
            r2.clear()     // Catch: java.lang.Throwable -> La9
            m0.a r2 = r1.f5898e     // Catch: java.lang.Throwable -> La9
            m0.l0 r2 = r2.f8437j     // Catch: java.lang.Throwable -> La9
            r2.R()     // Catch: java.lang.Throwable -> La9
            r2 = 0
            r1.f5915v = r2     // Catch: java.lang.Throwable -> La9
            x1.f2 r1 = r1.f5894a     // Catch: java.lang.Throwable -> La9
            r1.a()     // Catch: java.lang.Throwable -> La9
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lf
            goto Lb2
        La9:
            r1 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lae:
            r4.a()     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lb2:
            monitor-exit(r0)
            i0.o r0 = r9.f5996g
            r0.v(r9)
            return
        Lb9:
            monitor-exit(r0)
            throw r1
    }

    public final void n() {
            r5 = this;
            java.lang.Object r0 = i0.r.f6025a
            java.util.concurrent.atomic.AtomicReference r1 = r5.f5998i
            java.lang.Object r2 = r1.getAndSet(r0)
            if (r2 == 0) goto L4a
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42
            boolean r0 = r2 instanceof java.util.Set
            r3 = 1
            if (r0 == 0) goto L1b
            java.util.Set r2 = (java.util.Set) r2
            r5.c(r2, r3)
            return
        L1b:
            boolean r0 = r2 instanceof java.lang.Object[]
            if (r0 == 0) goto L2d
            java.util.Set[] r2 = (java.util.Set[]) r2
            int r0 = r2.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L4a
            r4 = r2[r1]
            r5.c(r4, r3)
            int r1 = r1 + 1
            goto L23
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "corrupt pendingModifications drain: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            i0.m.b(r0)
            okio.a.c()
            return
        L42:
            java.lang.String r0 = "pending composition has not been applied"
            i0.m.b(r0)
            okio.a.c()
        L4a:
            return
    }

    public final void o() {
            r5 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r1 = r5.f5998i
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Object r2 = i0.r.f6025a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L4c
            boolean r2 = r0 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L1a
            java.util.Set r0 = (java.util.Set) r0
            r5.c(r0, r3)
            return
        L1a:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L2c
            java.util.Set[] r0 = (java.util.Set[]) r0
            int r1 = r0.length
            r2 = r3
        L22:
            if (r2 >= r1) goto L4c
            r4 = r0[r2]
            r5.c(r4, r3)
            int r2 = r2 + 1
            goto L22
        L2c:
            if (r0 != 0) goto L38
            i0.l1 r0 = r5.f6012w
            if (r0 != 0) goto L4c
            java.lang.String r0 = "calling recordModificationsOf and applyChanges concurrently is not supported"
            i0.m.a(r0)
            return
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "corrupt pendingModifications drain: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            i0.m.b(r0)
            okio.a.c()
        L4c:
            return
    }

    public final void p() {
            r5 = this;
            tf.v r0 = tf.v.f13169g
            java.util.concurrent.atomic.AtomicReference r1 = r5.f5998i
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Object r2 = i0.r.f6025a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L44
            if (r0 != 0) goto L13
            goto L44
        L13:
            boolean r2 = r0 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L1e
            java.util.Set r0 = (java.util.Set) r0
            r5.c(r0, r3)
            return
        L1e:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L30
            java.util.Set[] r0 = (java.util.Set[]) r0
            int r1 = r0.length
            r2 = r3
        L26:
            if (r2 >= r1) goto L44
            r4 = r0[r2]
            r5.c(r4, r3)
            int r2 = r2 + 1
            goto L26
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "corrupt pendingModifications drain: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            i0.m.b(r0)
            okio.a.c()
        L44:
            return
    }

    public final void q() {
            r2 = this;
            int r0 = r2.C
            if (r0 != 0) goto L5
            goto L1c
        L5:
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L11
            java.lang.String r0 = ""
            goto L19
        L11:
            java.lang.String r0 = "The composition is disposed"
            goto L19
        L14:
            java.lang.String r0 = "A previous pausable composition for this composition was cancelled. This composition must be disposed."
            goto L19
        L17:
            java.lang.String r0 = "The composition should be activated before setting content."
        L19:
            i0.n1.b(r0)
        L1c:
            i0.l1 r0 = r2.f6012w
            if (r0 != 0) goto L21
            return
        L21:
            java.lang.String r0 = "A pausable composition is in progress"
            i0.n1.b(r0)
            return
    }

    public final void r(java.util.ArrayList r4) {
            r3 = this;
            f.n0 r0 = r3.f6000k
            i0.h0 r1 = r3.B
            int r2 = r4.size()
            if (r2 > 0) goto L4c
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "Compose:insertMovableContent"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L27
            r1.F(r4)     // Catch: java.lang.Throwable -> L1e
            r1.i()     // Catch: java.lang.Throwable -> L1c
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L27
            return
        L1c:
            r4 = move-exception
            goto L23
        L1e:
            r4 = move-exception
            r1.a()     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L23:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L27
            throw r4     // Catch: java.lang.Throwable -> L27
        L27:
            r4 = move-exception
            f.l0 r2 = r0.f2874g     // Catch: java.lang.Throwable -> L40
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L47
            b5.i r2 = r3.A     // Catch: java.lang.Throwable -> L40
            x0.d r1 = r1.C()     // Catch: java.lang.Throwable -> L40
            r2.i(r0, r1)     // Catch: java.lang.Throwable -> L42
            r2.b()     // Catch: java.lang.Throwable -> L42
            r2.a()     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r4 = move-exception
            goto L48
        L42:
            r4 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L40
            throw r4     // Catch: java.lang.Throwable -> L40
        L47:
            throw r4     // Catch: java.lang.Throwable -> L40
        L48:
            r3.a()
            throw r4
        L4c:
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            sf.e r4 = (sf.e) r4
            java.lang.Object r4 = r4.f12418g
            i0.v0 r4 = (i0.v0) r4
            r4.getClass()
            r4 = 0
            throw r4
    }

    public final i0.o0 s(i0.r1 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r4.f6033b
            r1 = r0 & 2
            if (r1 == 0) goto La
            r0 = r0 | 4
            r4.f6033b = r0
        La:
            l0.b r0 = r4.f6034c
            if (r0 == 0) goto L5b
            boolean r1 = r0.a()
            if (r1 != 0) goto L15
            goto L5b
        L15:
            l0.h r1 = r3.f6001l
            r1.getClass()
            l0.b r2 = r4.f6034c
            if (r2 == 0) goto L3e
            l0.b r2 = fb.v0.b(r2)
            boolean r1 = r1.f(r2)
            r2 = 1
            if (r1 != r2) goto L3e
            fg.p r1 = r4.f6035d
            if (r1 == 0) goto L3b
            i0.o0 r4 = r3.t(r4, r0, r5)
            i0.o0 r5 = i0.o0.f5985g
            if (r4 == r5) goto L3a
            androidx.lifecycle.x r5 = r3.f6015z
            r5.m()
        L3a:
            return r4
        L3b:
            i0.o0 r4 = i0.o0.f5985g
            return r4
        L3e:
            java.lang.Object r0 = r3.f5999j
            monitor-enter(r0)
            i0.q r1 = r3.f6013x     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
            if (r1 == 0) goto L55
            i0.h0 r0 = r1.B
            boolean r1 = r0.F
            if (r1 == 0) goto L55
            boolean r4 = r0.f0(r4, r5)
            if (r4 == 0) goto L55
            i0.o0 r4 = i0.o0.f5988j
            return r4
        L55:
            i0.o0 r4 = i0.o0.f5985g
            return r4
        L58:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L5b:
            i0.o0 r4 = i0.o0.f5985g
            return r4
    }

    public final i0.o0 t(i0.r1 r20, l0.b r21, java.lang.Object r22) {
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            java.lang.Object r3 = r1.f5999j
            monitor-enter(r3)
            i0.q r4 = r1.f6013x     // Catch: java.lang.Throwable -> L44
            r5 = 0
            if (r4 == 0) goto L47
            l0.h r6 = r1.f6001l     // Catch: java.lang.Throwable -> L44
            int r7 = r1.f6014y     // Catch: java.lang.Throwable -> L44
            boolean r8 = r6.f7686m     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L1b
            java.lang.String r8 = "Writer is active"
            i0.m.a(r8)     // Catch: java.lang.Throwable -> L44
        L1b:
            if (r7 < 0) goto L22
            int r8 = r6.f7681h     // Catch: java.lang.Throwable -> L44
            if (r7 >= r8) goto L22
            goto L27
        L22:
            java.lang.String r8 = "Invalid group index"
            i0.m.a(r8)     // Catch: java.lang.Throwable -> L44
        L27:
            l0.b r8 = fb.v0.b(r21)     // Catch: java.lang.Throwable -> L44
            boolean r9 = r6.f(r8)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L41
            int[] r6 = r6.f7680g     // Catch: java.lang.Throwable -> L44
            int r9 = r7 * 5
            int r9 = r9 + 3
            r6 = r6[r9]     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + r7
            int r8 = r8.f7654a     // Catch: java.lang.Throwable -> L44
            if (r7 > r8) goto L41
            if (r8 >= r6) goto L41
            goto L42
        L41:
            r4 = r5
        L42:
            r5 = r4
            goto L47
        L44:
            r0 = move-exception
            goto Le9
        L47:
            if (r5 != 0) goto Lce
            i0.h0 r4 = r1.B     // Catch: java.lang.Throwable -> L44
            boolean r6 = r4.F     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L57
            boolean r4 = r4.f0(r0, r2)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L5e
            i0.o0 r0 = i0.o0.f5988j     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return r0
        L5e:
            if (r2 != 0) goto L68
            f.k0 r4 = r1.f6009t     // Catch: java.lang.Throwable -> L44
            i0.e r6 = i0.e.f5869l     // Catch: java.lang.Throwable -> L44
            r4.m(r0, r6)     // Catch: java.lang.Throwable -> L44
            goto Lce
        L68:
            boolean r4 = r2 instanceof i0.x     // Catch: java.lang.Throwable -> L44
            f.k0 r6 = r1.f6009t
            if (r4 != 0) goto L74
            i0.e r4 = i0.e.f5869l     // Catch: java.lang.Throwable -> L44
            r6.m(r0, r4)     // Catch: java.lang.Throwable -> L44
            goto Lce
        L74:
            java.lang.Object r4 = r6.g(r0)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lc9
            boolean r6 = r4 instanceof f.l0     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto Lc4
            f.l0 r4 = (f.l0) r4     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = r4.f2856b     // Catch: java.lang.Throwable -> L44
            long[] r4 = r4.f2855a     // Catch: java.lang.Throwable -> L44
            int r8 = r4.length     // Catch: java.lang.Throwable -> L44
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lc9
            r9 = 0
        L8a:
            r10 = r4[r9]     // Catch: java.lang.Throwable -> L44
            long r12 = ~r10     // Catch: java.lang.Throwable -> L44
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto Lbf
            int r12 = r9 - r8
            int r12 = ~r12     // Catch: java.lang.Throwable -> L44
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        La4:
            if (r14 >= r12) goto Lbd
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto Lb9
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r6[r15]     // Catch: java.lang.Throwable -> L44
            i0.e r7 = i0.e.f5869l     // Catch: java.lang.Throwable -> L44
            if (r15 != r7) goto Lb9
            goto Lce
        Lb9:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto La4
        Lbd:
            if (r12 != r13) goto Lc9
        Lbf:
            if (r9 == r8) goto Lc9
            int r9 = r9 + 1
            goto L8a
        Lc4:
            i0.e r6 = i0.e.f5869l     // Catch: java.lang.Throwable -> L44
            if (r4 != r6) goto Lc9
            goto Lce
        Lc9:
            f.k0 r4 = r1.f6009t     // Catch: java.lang.Throwable -> L44
            f8.i.c(r4, r0, r2)     // Catch: java.lang.Throwable -> L44
        Lce:
            monitor-exit(r3)
            if (r5 == 0) goto Ld8
            r3 = r21
            i0.o0 r0 = r5.t(r0, r3, r2)
            return r0
        Ld8:
            i0.o r0 = r1.f5996g
            r0.l(r1)
            i0.h0 r0 = r1.B
            boolean r0 = r0.F
            if (r0 == 0) goto Le6
            i0.o0 r0 = i0.o0.f5987i
            return r0
        Le6:
            i0.o0 r0 = i0.o0.f5986h
            return r0
        Le9:
            monitor-exit(r3)
            throw r0
    }

    public final void u(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            f.k0 r2 = r0.f6002m
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L6e
            boolean r3 = r2 instanceof f.l0
            f.k0 r4 = r0.f6008s
            if (r3 == 0) goto L61
            f.l0 r2 = (f.l0) r2
            java.lang.Object[] r3 = r2.f2856b
            long[] r2 = r2.f2855a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6e
            r6 = 0
            r7 = r6
        L1f:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L39:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            i0.r1 r13 = (i0.r1) r13
            i0.o0 r14 = r13.b(r1)
            i0.o0 r15 = i0.o0.f5988j
            if (r14 != r15) goto L56
            f8.i.c(r4, r1, r13)
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L39
        L5a:
            if (r10 != r11) goto L6e
        L5c:
            if (r7 == r5) goto L6e
            int r7 = r7 + 1
            goto L1f
        L61:
            i0.r1 r2 = (i0.r1) r2
            i0.o0 r3 = r2.b(r1)
            i0.o0 r5 = i0.o0.f5988j
            if (r3 != r5) goto L6e
            f8.i.c(r4, r1, r2)
        L6e:
            return
    }

    public final boolean v(java.util.Set r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof j0.d
            f.k0 r3 = r0.f6005p
            f.k0 r4 = r0.f6002m
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            j0.d r1 = (j0.d) r1
            f.l0 r1 = r1.f6674g
            java.lang.Object[] r2 = r1.f2856b
            long[] r1 = r1.f2855a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
    }

    public final boolean w() {
            r7 = this;
            java.lang.Object r0 = r7.f5999j
            monitor-enter(r0)
            i0.l1 r1 = r7.f6012w     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r1 == 0) goto L3e
            java.util.concurrent.atomic.AtomicReference r3 = r1.f5961h     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L3b
            i0.m1 r4 = i0.m1.f5977k     // Catch: java.lang.Throwable -> L3b
            if (r3 != r4) goto L1d
            long r3 = r1.f5962i     // Catch: java.lang.Throwable -> L3b
            long r5 = s0.i.c()     // Catch: java.lang.Throwable -> L3b
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1d
            goto L3e
        L1d:
            java.util.concurrent.atomic.AtomicReference r3 = r1.f5961h     // Catch: java.lang.Throwable -> L3b
            i0.m1 r4 = i0.m1.f5978l     // Catch: java.lang.Throwable -> L3b
            i0.m1 r5 = i0.m1.f5976j     // Catch: java.lang.Throwable -> L3b
        L23:
            boolean r6 = r3.compareAndSet(r4, r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L2a
            goto L30
        L2a:
            java.lang.Object r6 = r3.get()     // Catch: java.lang.Throwable -> L3b
            if (r6 == r4) goto L23
        L30:
            i0.z1 r1 = r1.f5965l     // Catch: java.lang.Throwable -> L3b
            f.v r1 = r1.f6126g     // Catch: java.lang.Throwable -> L3b
            r3 = 9
            r1.a(r3)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            return r2
        L3b:
            r1 = move-exception
            goto Lb3
        L3e:
            r7.n()     // Catch: java.lang.Throwable -> L3b
            f.k0 r1 = r7.f6009t     // Catch: java.lang.Throwable -> L88
            f.k0 r3 = f8.i.o()     // Catch: java.lang.Throwable -> L88
            r7.f6009t = r3     // Catch: java.lang.Throwable -> L88
            i0.h0 r3 = r7.B     // Catch: java.lang.Throwable -> L7d
            i0.e2 r4 = r7.f6011v     // Catch: java.lang.Throwable -> L7d
            m0.a r5 = r3.f5898e     // Catch: java.lang.Throwable -> L7d
            m0.l0 r5 = r5.f8437j     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r5.T()     // Catch: java.lang.Throwable -> L7d
            if (r6 != 0) goto L5c
            java.lang.String r6 = "Expected applyChanges() to have been called"
            i0.m.a(r6)     // Catch: java.lang.Throwable -> L7d
        L5c:
            int r6 = r1.f2852e     // Catch: java.lang.Throwable -> L7d
            if (r6 > 0) goto L69
            java.util.ArrayList r6 = r3.f5912s     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L69
            goto L77
        L69:
            r3.P = r4     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            r3.n(r1, r2)     // Catch: java.lang.Throwable -> L81
            r3.P = r2     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r5.T()     // Catch: java.lang.Throwable -> L7d
            r2 = r2 ^ 1
        L77:
            if (r2 != 0) goto L7f
            r7.o()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r2 = move-exception
            goto L85
        L7f:
            monitor-exit(r0)
            return r2
        L81:
            r4 = move-exception
            r3.P = r2     // Catch: java.lang.Throwable -> L7d
            throw r4     // Catch: java.lang.Throwable -> L7d
        L85:
            r7.f6009t = r1     // Catch: java.lang.Throwable -> L88
            throw r2     // Catch: java.lang.Throwable -> L88
        L88:
            r1 = move-exception
            f.n0 r2 = r7.f6000k     // Catch: java.lang.Throwable -> La7
            f.l0 r2 = r2.f2874g     // Catch: java.lang.Throwable -> La7
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto Lae
            b5.i r2 = r7.A     // Catch: java.lang.Throwable -> La7
            f.n0 r3 = r7.f6000k     // Catch: java.lang.Throwable -> La7
            i0.h0 r4 = r7.B     // Catch: java.lang.Throwable -> La7
            x0.d r4 = r4.C()     // Catch: java.lang.Throwable -> La7
            r2.i(r3, r4)     // Catch: java.lang.Throwable -> La9
            r2.b()     // Catch: java.lang.Throwable -> La9
            r2.a()     // Catch: java.lang.Throwable -> La7
            goto Lae
        La7:
            r1 = move-exception
            goto Laf
        La9:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> La7
            throw r1     // Catch: java.lang.Throwable -> La7
        Lae:
            throw r1     // Catch: java.lang.Throwable -> La7
        Laf:
            r7.a()     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L3b
        Lb3:
            monitor-exit(r0)
            throw r1
    }

    public final void x(j0.d r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f5998i
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L38
            java.lang.Object r1 = i0.r.f6025a
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L38
        L11:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L1f
            r1 = 2
            java.util.Set[] r1 = new java.util.Set[r1]
            r2 = 0
            r1[r2] = r0
            r2 = 1
            r1[r2] = r5
            goto L39
        L1f:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L30
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            int r2 = r1.length
            int r3 = r2 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r1[r2] = r5
            goto L39
        L30:
            java.lang.String r5 = "corrupt pendingModifications: "
            java.util.concurrent.atomic.AtomicReference r0 = r4.f5998i
            g1.d.h(r0, r5)
            return
        L38:
            r1 = r5
        L39:
            java.util.concurrent.atomic.AtomicReference r2 = r4.f5998i
        L3b:
            boolean r3 = r2.compareAndSet(r0, r1)
            if (r3 == 0) goto L4f
            if (r0 != 0) goto L4e
            java.lang.Object r5 = r4.f5999j
            monitor-enter(r5)
            r4.o()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return
        L4b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L4e:
            return
        L4f:
            java.lang.Object r3 = r2.get()
            if (r3 == r0) goto L3b
            goto L0
    }

    public final void y(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            i0.h0 r2 = r0.B
            int r3 = r2.A
            if (r3 <= 0) goto Lc
            goto Le8
        Lc:
            i0.r1 r2 = r2.A()
            if (r2 == 0) goto Le8
            int r3 = r2.f6033b
            r4 = 1
            r3 = r3 | r4
            r2.f6033b = r3
            r3 = r3 & 32
            if (r3 == 0) goto L1e
        L1c:
            r3 = 0
            goto L45
        L1e:
            f.b0 r3 = r2.f6037f
            if (r3 != 0) goto L29
            f.b0 r3 = new f.b0
            r3.<init>()
            r2.f6037f = r3
        L29:
            int r6 = r2.f6036e
            int r7 = r3.c(r1)
            if (r7 >= 0) goto L34
            int r7 = ~r7
            r8 = -1
            goto L38
        L34:
            int[] r8 = r3.f2776c
            r8 = r8[r7]
        L38:
            java.lang.Object[] r9 = r3.f2775b
            r9[r7] = r1
            int[] r3 = r3.f2776c
            r3[r7] = r6
            int r3 = r2.f6036e
            if (r8 != r3) goto L1c
            r3 = r4
        L45:
            androidx.lifecycle.x r6 = r0.f6015z
            r6.m()
            if (r3 != 0) goto Le8
            boolean r3 = r1 instanceof w0.v
            if (r3 == 0) goto L56
            r3 = r1
            w0.v r3 = (w0.v) r3
            r3.f(r4)
        L56:
            f.k0 r3 = r0.f6002m
            f8.i.c(r3, r1, r2)
            boolean r3 = r1 instanceof i0.x
            if (r3 == 0) goto Le8
            r3 = r1
            i0.x r3 = (i0.x) r3
            i0.w r6 = r3.h()
            f.k0 r7 = r0.f6005p
            f8.i.x0(r7, r1)
            f.b0 r8 = r6.f6063e
            java.lang.Object[] r9 = r8.f2775b
            long[] r8 = r8.f2774a
            int r10 = r8.length
            int r10 = r10 + (-2)
            if (r10 < 0) goto Ld8
            r11 = 0
        L77:
            r12 = r8[r11]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto Lcf
            int r14 = r11 - r10
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r5 = 0
        L94:
            if (r5 >= r14) goto Lca
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto Lbd
            int r17 = r11 << 3
            int r17 = r17 + r5
            r17 = r9[r17]
            r18 = r15
            r15 = r17
            w0.u r15 = (w0.u) r15
            boolean r4 = r15 instanceof w0.v
            if (r4 == 0) goto Lb8
            r4 = r15
            w0.v r4 = (w0.v) r4
            r0 = 1
            r4.f(r0)
            goto Lb9
        Lb8:
            r0 = 1
        Lb9:
            f8.i.c(r7, r15, r1)
            goto Lc0
        Lbd:
            r0 = r4
            r18 = r15
        Lc0:
            long r12 = r12 >> r18
            int r5 = r5 + 1
            r4 = r0
            r15 = r18
            r0 = r21
            goto L94
        Lca:
            r0 = r4
            r4 = r15
            if (r14 != r4) goto Ld8
            goto Ld0
        Lcf:
            r0 = r4
        Ld0:
            if (r11 == r10) goto Ld8
            int r11 = r11 + 1
            r4 = r0
            r0 = r21
            goto L77
        Ld8:
            java.lang.Object r0 = r6.f6064f
            f.k0 r1 = r2.f6038g
            if (r1 != 0) goto Le5
            f.k0 r1 = new f.k0
            r1.<init>()
            r2.f6038g = r1
        Le5:
            r1.m(r3, r0)
        Le8:
            return
    }

    public final void z(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = r14.f5999j
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
            f.k0 r1 = r14.f6005p     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof f.l0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            f.l0 r15 = (f.l0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f2856b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f2855a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            i0.x r10 = (i0.x) r10     // Catch: java.lang.Throwable -> L4f
            r14.u(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            i0.x r15 = (i0.x) r15     // Catch: java.lang.Throwable -> L4f
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
    }
}
