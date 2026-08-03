package sg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c implements sg.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f12443h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f12444i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f12445j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f12446k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12447l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12448m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12449n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12450o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f12451p = null;
    private volatile /* synthetic */ java.lang.Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ java.lang.Object bufferEndSegment$volatile;
    private volatile /* synthetic */ java.lang.Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12452g;
    private volatile /* synthetic */ java.lang.Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ java.lang.Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
            java.lang.String r0 = "sendersAndCloseStatus$volatile"
            java.lang.Class<sg.c> r1 = sg.c.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            sg.c.f12443h = r0
            java.lang.String r0 = "receivers$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            sg.c.f12444i = r0
            java.lang.String r0 = "bufferEnd$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            sg.c.f12445j = r0
            java.lang.String r0 = "completedExpandBuffersAndPauseFlag$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            sg.c.f12446k = r0
            java.lang.String r0 = "sendSegment$volatile"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            sg.c.f12447l = r0
            java.lang.String r0 = "receiveSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            sg.c.f12448m = r0
            java.lang.String r0 = "bufferEndSegment$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            sg.c.f12449n = r0
            java.lang.String r0 = "_closeCause$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            sg.c.f12450o = r0
            java.lang.String r0 = "closeHandler$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            sg.c.f12451p = r0
            return
    }

    public c(int r9) {
            r8 = this;
            r8.<init>()
            r8.f12452g = r9
            if (r9 < 0) goto L44
            sg.k r0 = sg.e.f12454a
            if (r9 == 0) goto L18
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r0) goto L12
            long r0 = (long) r9
            goto L1a
        L12:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L18:
            r0 = 0
        L1a:
            r8.bufferEnd$volatile = r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = sg.c.f12445j
            long r0 = r9.get(r8)
            r8.completedExpandBuffersAndPauseFlag$volatile = r0
            sg.k r2 = new sg.k
            r5 = 0
            r7 = 3
            r3 = 0
            r6 = r8
            r2.<init>(r3, r5, r6, r7)
            r6.sendSegment$volatile = r2
            r6.receiveSegment$volatile = r2
            boolean r9 = r8.w()
            if (r9 == 0) goto L3d
            sg.k r2 = sg.e.f12454a
            r2.getClass()
        L3d:
            r6.bufferEndSegment$volatile = r2
            l3.q r9 = sg.e.f12472s
            r6._closeCause$volatile = r9
            return
        L44:
            r6 = r8
            java.lang.String r0 = "Invalid channel capacity: "
            java.lang.String r1 = ", should be >=0"
            java.lang.String r9 = eh.a.m(r9, r0, r1)
            j8.o.q(r9)
            r9 = 0
            throw r9
    }

    public static boolean B(java.lang.Object r3) {
            boolean r0 = r3 instanceof qg.f
            r1 = 0
            if (r0 == 0) goto L18
            qg.f r3 = (qg.f) r3
            sg.k r0 = sg.e.f12454a
            r0 = 0
            sf.n r2 = sf.n.f12433a
            l3.q r0 = r3.j(r2, r0)
            if (r0 == 0) goto L17
            r3.A(r0)
            r3 = 1
            return r3
        L17:
            return r1
        L18:
            java.lang.String r0 = "Unexpected waiter: "
            okio.a.p(r3, r0)
            return r1
    }

    public static final sg.k b(sg.c r11, long r12, sg.k r14) {
            sg.k r0 = sg.e.f12454a
            sg.d r0 = sg.d.f12453n
        L4:
            java.lang.Object r1 = vg.a.b(r14, r12, r0)
            boolean r2 = vg.a.e(r1)
            if (r2 != 0) goto L4a
            vg.q r2 = vg.a.c(r1)
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = sg.c.f12447l
            java.lang.Object r4 = r3.get(r11)
            vg.q r4 = (vg.q) r4
            long r5 = r4.f14357c
            long r7 = r2.f14357c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L23
            goto L4a
        L23:
            boolean r5 = r2.i()
            if (r5 != 0) goto L2a
            goto L4
        L2a:
            boolean r5 = r3.compareAndSet(r11, r4, r2)
            if (r5 == 0) goto L3a
            boolean r0 = r4.e()
            if (r0 == 0) goto L4a
            r4.d()
            goto L4a
        L3a:
            java.lang.Object r5 = r3.get(r11)
            if (r5 == r4) goto L2a
            boolean r3 = r2.e()
            if (r3 == 0) goto L12
            r2.d()
            goto L12
        L4a:
            boolean r0 = vg.a.e(r1)
            r2 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = sg.c.f12444i
            if (r0 == 0) goto L68
            r11.u()
            long r12 = r14.f14357c
            int r0 = sg.e.f12455b
            long r0 = (long) r0
            long r12 = r12 * r0
            long r0 = r3.get(r11)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto Laa
            r14.a()
            return r2
        L68:
            vg.q r14 = vg.a.c(r1)
            sg.k r14 = (sg.k) r14
            long r0 = r14.f14357c
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 <= 0) goto Lad
            int r12 = sg.e.f12455b
            long r12 = (long) r12
            long r12 = r12 * r0
        L78:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = sg.c.f12443h
            long r7 = r4.get(r11)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r7
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L8a
            r6 = r11
            goto L9b
        L8a:
            r6 = 60
            long r9 = r7 >> r6
            int r9 = (int) r9
            long r9 = (long) r9
            long r9 = r9 << r6
            long r9 = r9 + r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = sg.c.f12443h
            r6 = r11
            boolean r11 = r5.compareAndSet(r6, r7, r9)
            if (r11 == 0) goto Lab
        L9b:
            int r11 = sg.e.f12455b
            long r11 = (long) r11
            long r0 = r0 * r11
            long r11 = r3.get(r6)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto Laa
            r14.a()
        Laa:
            return r2
        Lab:
            r11 = r6
            goto L78
        Lad:
            return r14
    }

    public static final void c(sg.c r0, java.lang.Object r1, qg.g r2) {
            java.lang.Throwable r0 = r0.o()
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r2.resumeWith(r1)
            return
    }

    public static final int e(sg.c r4, sg.k r5, int r6, java.lang.Object r7, long r8, java.lang.Object r10, boolean r11) {
            r5.m(r6, r7)
            if (r11 == 0) goto La
            int r4 = r4.D(r5, r6, r7, r8, r10, r11)
            return r4
        La:
            java.lang.Object r0 = r5.k(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2d
            boolean r0 = r4.g(r8)
            if (r0 == 0) goto L21
            l3.q r0 = sg.e.f12457d
            boolean r0 = r5.j(r2, r6, r0)
            if (r0 == 0) goto L53
            return r1
        L21:
            if (r10 != 0) goto L25
            r4 = 3
            return r4
        L25:
            boolean r0 = r5.j(r2, r6, r10)
            if (r0 == 0) goto L53
            r4 = 2
            return r4
        L2d:
            boolean r3 = r0 instanceof qg.o1
            if (r3 == 0) goto L53
            r5.m(r6, r2)
            boolean r4 = r4.A(r0, r7)
            if (r4 == 0) goto L41
            l3.q r4 = sg.e.f12462i
            r5.n(r6, r4)
            r4 = 0
            return r4
        L41:
            l3.q r4 = sg.e.f12464k
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r5.f12479f
            int r8 = r6 * 2
            int r8 = r8 + r1
            java.lang.Object r7 = r7.getAndSet(r8, r4)
            if (r7 == r4) goto L51
            r5.l(r6, r1)
        L51:
            r4 = 5
            return r4
        L53:
            int r4 = r4.D(r5, r6, r7, r8, r10, r11)
            return r4
    }

    public static void s(sg.c r7) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12446k
            r1 = 1
            long r1 = r0.addAndGet(r7, r1)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r1 & r3
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L1b
        L11:
            long r1 = r0.get(r7)
            long r1 = r1 & r3
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L1b
            goto L11
        L1b:
            return
    }

    public final boolean A(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r5 instanceof sg.b
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L26
            sg.b r5 = (sg.b) r5
            qg.g r0 = r5.f12441h
            r0.getClass()
            r5.f12441h = r3
            r5.f12440g = r6
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            sg.c r5 = r5.f12442i
            r5.getClass()
            sg.k r5 = sg.e.f12454a
            l3.q r5 = r0.j(r6, r3)
            if (r5 == 0) goto L25
            r0.A(r5)
            return r2
        L25:
            return r1
        L26:
            boolean r0 = r5 instanceof qg.f
            if (r0 == 0) goto L39
            qg.f r5 = (qg.f) r5
            sg.k r0 = sg.e.f12454a
            l3.q r6 = r5.j(r6, r3)
            if (r6 == 0) goto L38
            r5.A(r6)
            return r2
        L38:
            return r1
        L39:
            java.lang.String r6 = "Unexpected receiver type: "
            okio.a.p(r5, r6)
            return r1
    }

    public final java.lang.Object C(sg.k r9, int r10, long r11, java.lang.Object r13) {
            r8 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r9.f12479f
            java.lang.Object r1 = r9.k(r10)
            r2 = 0
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = sg.c.f12443h
            if (r1 != 0) goto L2a
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L43
            if (r13 != 0) goto L1e
            l3.q r9 = sg.e.f12467n
            return r9
        L1e:
            boolean r1 = r9.j(r1, r10, r13)
            if (r1 == 0) goto L43
            r8.k()
            l3.q r9 = sg.e.f12466m
            return r9
        L2a:
            l3.q r6 = sg.e.f12457d
            if (r1 != r6) goto L43
            l3.q r6 = sg.e.f12462i
            boolean r1 = r9.j(r1, r10, r6)
            if (r1 == 0) goto L43
            r8.k()
            int r11 = r10 * 2
            java.lang.Object r11 = r0.get(r11)
            r9.m(r10, r2)
            return r11
        L43:
            java.lang.Object r1 = r9.k(r10)
            if (r1 == 0) goto Lb9
            l3.q r6 = sg.e.f12458e
            if (r1 != r6) goto L4e
            goto Lb9
        L4e:
            l3.q r6 = sg.e.f12457d
            if (r1 != r6) goto L67
            l3.q r6 = sg.e.f12462i
            boolean r1 = r9.j(r1, r10, r6)
            if (r1 == 0) goto L43
            r8.k()
            int r11 = r10 * 2
            java.lang.Object r11 = r0.get(r11)
            r9.m(r10, r2)
            return r11
        L67:
            l3.q r6 = sg.e.f12463j
            if (r1 != r6) goto L6e
            l3.q r9 = sg.e.f12468o
            return r9
        L6e:
            l3.q r7 = sg.e.f12461h
            if (r1 != r7) goto L75
            l3.q r9 = sg.e.f12468o
            return r9
        L75:
            l3.q r7 = sg.e.f12465l
            if (r1 != r7) goto L7f
            r8.k()
            l3.q r9 = sg.e.f12468o
            return r9
        L7f:
            l3.q r7 = sg.e.f12460g
            if (r1 == r7) goto L43
            l3.q r7 = sg.e.f12459f
            boolean r7 = r9.j(r1, r10, r7)
            if (r7 == 0) goto L43
            boolean r11 = r1 instanceof sg.q
            if (r11 == 0) goto L93
            sg.q r1 = (sg.q) r1
            qg.o1 r1 = r1.f12482a
        L93:
            boolean r12 = B(r1)
            if (r12 == 0) goto Lab
            l3.q r11 = sg.e.f12462i
            r9.n(r10, r11)
            r8.k()
            int r11 = r10 * 2
            java.lang.Object r11 = r0.get(r11)
            r9.m(r10, r2)
            return r11
        Lab:
            r9.n(r10, r6)
            r9.h()
            if (r11 == 0) goto Lb6
            r8.k()
        Lb6:
            l3.q r9 = sg.e.f12468o
            return r9
        Lb9:
            long r6 = r5.get(r8)
            long r6 = r6 & r3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto Ld0
            l3.q r6 = sg.e.f12461h
            boolean r1 = r9.j(r1, r10, r6)
            if (r1 == 0) goto L43
            r8.k()
            l3.q r9 = sg.e.f12468o
            return r9
        Ld0:
            if (r13 != 0) goto Ld5
            l3.q r9 = sg.e.f12467n
            return r9
        Ld5:
            boolean r1 = r9.j(r1, r10, r13)
            if (r1 == 0) goto L43
            r8.k()
            l3.q r9 = sg.e.f12466m
            return r9
    }

    public final int D(sg.k r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.k(r7)
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L34
            boolean r0 = r5.g(r9)
            if (r0 == 0) goto L1a
            if (r12 != 0) goto L1a
            l3.q r0 = sg.e.f12457d
            boolean r0 = r6.j(r3, r7, r0)
            if (r0 == 0) goto L0
            goto L40
        L1a:
            if (r12 == 0) goto L28
            l3.q r0 = sg.e.f12463j
            boolean r0 = r6.j(r3, r7, r0)
            if (r0 == 0) goto L0
            r6.h()
            return r1
        L28:
            if (r11 != 0) goto L2c
            r6 = 3
            return r6
        L2c:
            boolean r0 = r6.j(r3, r7, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L34:
            l3.q r4 = sg.e.f12458e
            if (r0 != r4) goto L41
            l3.q r1 = sg.e.f12457d
            boolean r0 = r6.j(r0, r7, r1)
            if (r0 == 0) goto L0
        L40:
            return r2
        L41:
            l3.q r9 = sg.e.f12464k
            r10 = 5
            if (r0 != r9) goto L4a
            r6.m(r7, r3)
            return r10
        L4a:
            l3.q r11 = sg.e.f12461h
            if (r0 != r11) goto L52
            r6.m(r7, r3)
            return r10
        L52:
            l3.q r11 = sg.e.f12465l
            if (r0 != r11) goto L5d
            r6.m(r7, r3)
            r5.u()
            return r1
        L5d:
            r6.m(r7, r3)
            boolean r11 = r0 instanceof sg.q
            if (r11 == 0) goto L68
            sg.q r0 = (sg.q) r0
            qg.o1 r0 = r0.f12482a
        L68:
            boolean r8 = r5.A(r0, r8)
            if (r8 == 0) goto L75
            l3.q r8 = sg.e.f12462i
            r6.n(r7, r8)
            r6 = 0
            return r6
        L75:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r6.f12479f
            int r11 = r7 * 2
            int r11 = r11 + r2
            java.lang.Object r8 = r8.getAndSet(r11, r9)
            if (r8 == r9) goto L83
            r6.l(r7, r2)
        L83:
            return r10
    }

    public final void E(long r19) {
            r18 = this;
            r1 = r18
            boolean r0 = r1.w()
            if (r0 == 0) goto La
            goto L78
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = sg.c.f12445j
            long r2 = r6.get(r1)
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 <= 0) goto L8c
            int r0 = sg.e.f12456c
            r7 = 0
            r2 = r7
        L18:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = sg.c.f12446k
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r2 >= r0) goto L3a
            long r4 = r6.get(r1)
            long r10 = r3.get(r1)
            long r8 = r8 & r10
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L37
            long r8 = r6.get(r1)
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 != 0) goto L37
            goto L78
        L37:
            int r2 = r2 + 1
            goto L18
        L3a:
            r0 = r3
        L3b:
            long r2 = r0.get(r1)
            long r4 = r2 & r8
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r4 = r4 + r10
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L89
        L4a:
            long r2 = r6.get(r1)
            r4 = r2
            long r2 = r0.get(r1)
            long r12 = r2 & r8
            long r14 = r2 & r10
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L5f
            r14 = 1
            goto L60
        L5f:
            r14 = r7
        L60:
            int r15 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r15 != 0) goto L7c
            long r15 = r6.get(r1)
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 != 0) goto L7c
        L6c:
            long r2 = r0.get(r1)
            long r4 = r2 & r8
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L79
        L78:
            return
        L79:
            r1 = r18
            goto L6c
        L7c:
            if (r14 != 0) goto L86
            long r4 = r10 + r12
            r1 = r18
            r0.compareAndSet(r1, r2, r4)
            goto L4a
        L86:
            r1 = r18
            goto L4a
        L89:
            r1 = r18
            goto L3b
        L8c:
            r1 = r18
            goto La
    }

    @Override // sg.g
    public final void a(java.util.concurrent.CancellationException r2) {
            r1 = this;
            if (r2 != 0) goto L9
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Channel was cancelled"
            r2.<init>(r0)
        L9:
            r0 = 1
            r1.h(r2, r0)
            return
    }

    @Override // sg.g
    public final java.lang.Object d() {
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12444i
            long r1 = r0.get(r13)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = sg.c.f12443h
            long r4 = r3.get(r13)
            r6 = 1
            boolean r7 = r13.t(r4, r6)
            if (r7 == 0) goto L1d
            java.lang.Throwable r0 = r13.m()
            sg.h r1 = new sg.h
            r1.<init>(r0)
            return r1
        L1d:
            r7 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r7
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            sg.i r2 = sg.j.f12477a
            if (r1 < 0) goto L2a
            return r2
        L2a:
            l3.q r12 = sg.e.f12464k
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sg.c.f12448m
            java.lang.Object r1 = r1.get(r13)
            sg.k r1 = (sg.k) r1
        L34:
            long r4 = r3.get(r13)
            boolean r4 = r13.t(r4, r6)
            if (r4 == 0) goto L48
            java.lang.Throwable r0 = r13.m()
            sg.h r1 = new sg.h
            r1.<init>(r0)
            return r1
        L48:
            long r10 = r0.getAndIncrement(r13)
            int r4 = sg.e.f12455b
            long r4 = (long) r4
            long r7 = r10 / r4
            long r4 = r10 % r4
            int r9 = (int) r4
            long r4 = r1.f14357c
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L64
            sg.k r4 = r13.l(r7, r1)
            if (r4 != 0) goto L61
            goto L34
        L61:
            r8 = r4
        L62:
            r7 = r13
            goto L66
        L64:
            r8 = r1
            goto L62
        L66:
            java.lang.Object r1 = r7.C(r8, r9, r10, r12)
            r4 = r8
            l3.q r5 = sg.e.f12466m
            if (r1 != r5) goto L83
            boolean r0 = r12 instanceof qg.o1
            if (r0 == 0) goto L76
            qg.o1 r12 = (qg.o1) r12
            goto L77
        L76:
            r12 = 0
        L77:
            if (r12 == 0) goto L7c
            r12.a(r4, r9)
        L7c:
            r13.E(r10)
            r4.h()
            return r2
        L83:
            l3.q r5 = sg.e.f12468o
            if (r1 != r5) goto L94
            long r8 = r13.r()
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L92
            r4.a()
        L92:
            r1 = r4
            goto L34
        L94:
            l3.q r0 = sg.e.f12467n
            if (r1 == r0) goto L9c
            r4.a()
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // sg.g
    public final java.lang.Object f(wf.c r17) {
            r16 = this;
            r1 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12448m
            java.lang.Object r2 = r0.get(r1)
            sg.k r2 = (sg.k) r2
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = sg.c.f12443h
            long r3 = r7.get(r1)
            r8 = 1
            boolean r3 = r1.t(r3, r8)
            if (r3 != 0) goto Lfd
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = sg.c.f12444i
            long r4 = r9.getAndIncrement(r1)
            int r3 = sg.e.f12455b
            long r10 = (long) r3
            long r12 = r4 / r10
            long r10 = r4 % r10
            int r3 = (int) r10
            long r10 = r2.f14357c
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 == 0) goto L33
            sg.k r6 = r1.l(r12, r2)
            if (r6 != 0) goto L32
            goto La
        L32:
            r2 = r6
        L33:
            r6 = 0
            java.lang.Object r6 = r1.C(r2, r3, r4, r6)
            l3.q r10 = sg.e.f12466m
            r11 = 0
            java.lang.String r12 = "unexpected"
            if (r6 == r10) goto Lf9
            l3.q r13 = sg.e.f12468o
            if (r6 != r13) goto L51
            long r6 = r16.r()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L4e
            r2.a()
        L4e:
            r1 = r16
            goto La
        L51:
            l3.q r1 = sg.e.f12467n
            if (r6 != r1) goto Lf5
            wf.c r1 = fb.v0.x(r17)
            qg.g r6 = qg.v.l(r1)
            r1 = r16
            java.lang.Object r14 = r1.C(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L6a
            if (r14 != r10) goto L6d
            r6.a(r2, r3)     // Catch: java.lang.Throwable -> L6a
            goto Lec
        L6a:
            r0 = move-exception
            goto Lf1
        L6d:
            if (r14 != r13) goto Le6
            long r13 = r1.r()     // Catch: java.lang.Throwable -> L6a
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 >= 0) goto L7a
            r2.a()     // Catch: java.lang.Throwable -> L6a
        L7a:
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6a
            sg.k r0 = (sg.k) r0     // Catch: java.lang.Throwable -> L6a
        L80:
            long r2 = r7.get(r1)     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r1.t(r2, r8)     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L97
            java.lang.Throwable r0 = r1.n()     // Catch: java.lang.Throwable -> L6a
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            r6.resumeWith(r2)     // Catch: java.lang.Throwable -> L6a
            goto Lec
        L97:
            long r4 = r9.getAndIncrement(r1)     // Catch: java.lang.Throwable -> L6a
            int r2 = sg.e.f12455b     // Catch: java.lang.Throwable -> L6a
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L6a
            long r13 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L6a
            r15 = r9
            long r8 = r0.f14357c     // Catch: java.lang.Throwable -> L6a
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 == 0) goto Lb3
            sg.k r2 = r1.l(r13, r0)     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto Lb4
            r9 = r15
            r8 = 1
            goto L80
        Lb3:
            r2 = r0
        Lb4:
            java.lang.Object r0 = r1.C(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L6a
            l3.q r1 = sg.e.f12466m     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto Lc0
            r6.a(r2, r3)     // Catch: java.lang.Throwable -> L6a
            goto Lec
        Lc0:
            l3.q r1 = sg.e.f12468o     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto Ld5
            long r0 = r16.r()     // Catch: java.lang.Throwable -> L6a
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lcf
            r2.a()     // Catch: java.lang.Throwable -> L6a
        Lcf:
            r8 = 1
            r1 = r16
            r0 = r2
            r9 = r15
            goto L80
        Ld5:
            l3.q r1 = sg.e.f12467n     // Catch: java.lang.Throwable -> L6a
            if (r0 == r1) goto Le0
            r2.a()     // Catch: java.lang.Throwable -> L6a
            r6.y(r0, r11)     // Catch: java.lang.Throwable -> L6a
            goto Lec
        Le0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        Le6:
            r2.a()     // Catch: java.lang.Throwable -> L6a
            r6.y(r14, r11)     // Catch: java.lang.Throwable -> L6a
        Lec:
            java.lang.Object r0 = r6.o()
            return r0
        Lf1:
            r6.x()
            throw r0
        Lf5:
            r2.a()
            return r6
        Lf9:
            j8.o.A(r12)
            return r11
        Lfd:
            java.lang.Throwable r0 = r16.n()
            int r1 = vg.r.f14358a
            throw r0
    }

    public final boolean g(long r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12445j
            long r0 = r0.get(r4)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12444i
            long r0 = r0.get(r4)
            int r2 = r4.f12452g
            long r2 = (long) r2
            long r0 = r0 + r2
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L19
            goto L1b
        L19:
            r5 = 0
            return r5
        L1b:
            r5 = 1
            return r5
    }

    public final boolean h(java.lang.Throwable r13, boolean r14) {
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = sg.c.f12443h
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            sg.k r4 = sg.e.f12454a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            l3.q r5 = sg.e.f12472s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = sg.c.f12450o
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.u()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = sg.c.f12451p
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            l3.q r0 = sg.e.f12470q
            goto L7b
        L79:
            l3.q r0 = sg.e.f12471r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            gg.x.c(r9, r14)
            fg.l r14 = (fg.l) r14
            java.lang.Throwable r13 = r12.m()
            r14.invoke(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
    }

    public final sg.k i(long r13) {
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12449n
            java.lang.Object r0 = r0.get(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sg.c.f12447l
            java.lang.Object r1 = r1.get(r12)
            sg.k r1 = (sg.k) r1
            long r2 = r1.f14357c
            r4 = r0
            sg.k r4 = (sg.k) r4
            long r4 = r4.f14357c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r0 = r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sg.c.f12448m
            java.lang.Object r1 = r1.get(r12)
            sg.k r1 = (sg.k) r1
            long r2 = r1.f14357c
            r4 = r0
            sg.k r4 = (sg.k) r4
            long r4 = r4.f14357c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L2e
            r0 = r1
        L2e:
            vg.b r0 = (vg.b) r0
        L30:
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.b.f14324a
            java.lang.Object r2 = r1.get(r0)
            l3.q r3 = vg.a.f14317a
            r4 = 0
            if (r2 != r3) goto L3f
            goto L49
        L3f:
            vg.b r2 = (vg.b) r2
            if (r2 != 0) goto L12f
        L43:
            boolean r2 = r1.compareAndSet(r0, r4, r3)
            if (r2 == 0) goto L127
        L49:
            sg.k r0 = (sg.k) r0
            boolean r1 = r12.v()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto La1
            r1 = r0
        L54:
            int r5 = sg.e.f12455b
            int r5 = r5 - r2
        L57:
            r6 = -1
            if (r3 >= r5) goto L8d
            long r8 = r1.f14357c
            int r10 = sg.e.f12455b
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r5
            long r8 = r8 + r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = sg.c.f12444i
            long r10 = r10.get(r12)
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6f
        L6d:
            r8 = r6
            goto L9a
        L6f:
            java.lang.Object r10 = r1.k(r5)
            if (r10 == 0) goto L7f
            l3.q r11 = sg.e.f12458e
            if (r10 != r11) goto L7a
            goto L7f
        L7a:
            l3.q r11 = sg.e.f12457d
            if (r10 != r11) goto L8a
            goto L9a
        L7f:
            l3.q r11 = sg.e.f12465l
            boolean r10 = r1.j(r10, r5, r11)
            if (r10 == 0) goto L6f
            r1.h()
        L8a:
            int r5 = r5 + (-1)
            goto L57
        L8d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = vg.b.f14325b
            java.lang.Object r1 = r5.get(r1)
            vg.b r1 = (vg.b) r1
            sg.k r1 = (sg.k) r1
            if (r1 != 0) goto L54
            goto L6d
        L9a:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto La1
            r12.j(r8)
        La1:
            r1 = r0
        La2:
            if (r1 == 0) goto L105
            int r5 = sg.e.f12455b
            int r5 = r5 - r2
        La7:
            if (r3 >= r5) goto Lfa
            long r6 = r1.f14357c
            int r8 = sg.e.f12455b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 < 0) goto L105
        Lb5:
            java.lang.Object r6 = r1.k(r5)
            if (r6 == 0) goto Lec
            l3.q r7 = sg.e.f12458e
            if (r6 != r7) goto Lc0
            goto Lec
        Lc0:
            boolean r7 = r6 instanceof sg.q
            if (r7 == 0) goto Ld8
            l3.q r7 = sg.e.f12465l
            boolean r7 = r1.j(r6, r5, r7)
            if (r7 == 0) goto Lb5
            sg.q r6 = (sg.q) r6
            qg.o1 r6 = r6.f12482a
            java.lang.Object r4 = vg.a.f(r4, r6)
            r1.l(r5, r2)
            goto Lf7
        Ld8:
            boolean r7 = r6 instanceof qg.o1
            if (r7 == 0) goto Lf7
            l3.q r7 = sg.e.f12465l
            boolean r7 = r1.j(r6, r5, r7)
            if (r7 == 0) goto Lb5
            java.lang.Object r4 = vg.a.f(r4, r6)
            r1.l(r5, r2)
            goto Lf7
        Lec:
            l3.q r7 = sg.e.f12465l
            boolean r6 = r1.j(r6, r5, r7)
            if (r6 == 0) goto Lb5
            r1.h()
        Lf7:
            int r5 = r5 + (-1)
            goto La7
        Lfa:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = vg.b.f14325b
            java.lang.Object r1 = r5.get(r1)
            vg.b r1 = (vg.b) r1
            sg.k r1 = (sg.k) r1
            goto La2
        L105:
            if (r4 == 0) goto L126
            boolean r13 = r4 instanceof java.util.ArrayList
            if (r13 != 0) goto L111
            qg.o1 r4 = (qg.o1) r4
            r12.z(r4, r2)
            return r0
        L111:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r13 = r4.size()
            int r13 = r13 - r2
        L118:
            if (r3 >= r13) goto L126
            java.lang.Object r14 = r4.get(r13)
            qg.o1 r14 = (qg.o1) r14
            r12.z(r14, r2)
            int r13 = r13 + (-1)
            goto L118
        L126:
            return r0
        L127:
            java.lang.Object r2 = r1.get(r0)
            if (r2 == 0) goto L43
            goto L30
        L12f:
            r0 = r2
            goto L30
    }

    @Override // sg.g
    public final sg.b iterator() {
            r1 = this;
            sg.b r0 = new sg.b
            r0.<init>(r1)
            return r0
    }

    public final void j(long r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12448m
            java.lang.Object r0 = r0.get(r9)
            sg.k r0 = (sg.k) r0
        L8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = sg.c.f12444i
            long r3 = r1.get(r9)
            int r2 = r9.f12452g
            long r5 = (long) r2
            long r5 = r5 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12445j
            long r7 = r2.get(r9)
            long r5 = java.lang.Math.max(r5, r7)
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L21
            return
        L21:
            r5 = 1
            long r5 = r5 + r3
            r2 = r9
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L8
            int r1 = sg.e.f12455b
            long r5 = (long) r1
            long r7 = r3 / r5
            long r5 = r3 % r5
            int r1 = (int) r5
            long r5 = r0.f14357c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L41
            sg.k r5 = r9.l(r7, r0)
            if (r5 != 0) goto L40
            goto L8
        L40:
            r0 = r5
        L41:
            r7 = 0
            r5 = r3
            r3 = r0
            r4 = r1
            java.lang.Object r0 = r2.C(r3, r4, r5, r7)
            l3.q r1 = sg.e.f12468o
            if (r0 != r1) goto L59
            long r0 = r9.r()
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5c
            r3.a()
            goto L5c
        L59:
            r3.a()
        L5c:
            r0 = r3
            goto L8
    }

    public final void k() {
            r15 = this;
            boolean r0 = r15.w()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = sg.c.f12449n
            java.lang.Object r0 = r6.get(r15)
            sg.k r0 = (sg.k) r0
            r7 = r0
        L10:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12445j
            long r8 = r0.getAndIncrement(r15)
            int r0 = sg.e.f12455b
            long r2 = (long) r0
            long r2 = r8 / r2
            long r4 = r15.r()
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 > 0) goto L36
            long r4 = r7.f14357c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            vg.b r0 = r7.b()
            if (r0 == 0) goto L32
            r15.x(r2, r7)
        L32:
            s(r15)
            return
        L36:
            long r4 = r7.f14357c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld3
            sg.d r0 = sg.d.f12453n
        L3e:
            java.lang.Object r4 = vg.a.b(r7, r2, r0)
            boolean r5 = vg.a.e(r4)
            if (r5 != 0) goto L82
            vg.q r5 = vg.a.c(r4)
        L4c:
            java.lang.Object r10 = r6.get(r15)
            vg.q r10 = (vg.q) r10
            long r11 = r10.f14357c
            long r13 = r5.f14357c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L5b
            goto L82
        L5b:
            boolean r11 = r5.i()
            if (r11 != 0) goto L62
            goto L3e
        L62:
            boolean r11 = r6.compareAndSet(r15, r10, r5)
            if (r11 == 0) goto L72
            boolean r0 = r10.e()
            if (r0 == 0) goto L82
            r10.d()
            goto L82
        L72:
            java.lang.Object r11 = r6.get(r15)
            if (r11 == r10) goto L62
            boolean r10 = r5.e()
            if (r10 == 0) goto L4c
            r5.d()
            goto L4c
        L82:
            boolean r0 = vg.a.e(r4)
            r10 = 0
            if (r0 == 0) goto L93
            r15.u()
            r15.x(r2, r7)
            s(r15)
            goto Lce
        L93:
            vg.q r0 = vg.a.c(r4)
            sg.k r0 = (sg.k) r0
            long r4 = r0.f14357c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lcd
            r2 = 1
            long r2 = r2 + r8
            int r0 = sg.e.f12455b
            long r11 = (long) r0
            long r4 = r4 * r11
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12445j
            r1 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Lc9
            long r4 = r4 - r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12446k
            long r2 = r0.addAndGet(r15, r4)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r2 = r2 & r4
            r11 = 0
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto Lce
        Lbf:
            long r2 = r0.get(r15)
            long r2 = r2 & r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto Lce
            goto Lbf
        Lc9:
            s(r15)
            goto Lce
        Lcd:
            r10 = r0
        Lce:
            if (r10 != 0) goto Ld2
            goto L10
        Ld2:
            r7 = r10
        Ld3:
            int r0 = sg.e.f12455b
            long r2 = (long) r0
            long r2 = r8 % r2
            int r0 = (int) r2
            java.lang.Object r2 = r7.k(r0)
            boolean r3 = r2 instanceof qg.o1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = sg.c.f12444i
            if (r3 == 0) goto L109
            long r10 = r4.get(r15)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L109
            l3.q r3 = sg.e.f12460g
            boolean r3 = r7.j(r2, r0, r3)
            if (r3 == 0) goto L109
            boolean r2 = B(r2)
            if (r2 == 0) goto L100
            l3.q r2 = sg.e.f12457d
            r7.n(r0, r2)
            goto L17b
        L100:
            l3.q r2 = sg.e.f12463j
            r7.n(r0, r2)
            r7.h()
            goto L149
        L109:
            java.lang.Object r2 = r7.k(r0)
            boolean r3 = r2 instanceof qg.o1
            if (r3 == 0) goto L145
            long r10 = r4.get(r15)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L128
            sg.q r3 = new sg.q
            r5 = r2
            qg.o1 r5 = (qg.o1) r5
            r3.<init>(r5)
            boolean r2 = r7.j(r2, r0, r3)
            if (r2 == 0) goto L109
            goto L17b
        L128:
            l3.q r3 = sg.e.f12460g
            boolean r3 = r7.j(r2, r0, r3)
            if (r3 == 0) goto L109
            boolean r2 = B(r2)
            if (r2 == 0) goto L13c
            l3.q r2 = sg.e.f12457d
            r7.n(r0, r2)
            goto L17b
        L13c:
            l3.q r2 = sg.e.f12463j
            r7.n(r0, r2)
            r7.h()
            goto L149
        L145:
            l3.q r3 = sg.e.f12463j
            if (r2 != r3) goto L14e
        L149:
            s(r15)
            goto L10
        L14e:
            if (r2 != 0) goto L159
            l3.q r3 = sg.e.f12458e
            boolean r2 = r7.j(r2, r0, r3)
            if (r2 == 0) goto L109
            goto L17b
        L159:
            l3.q r3 = sg.e.f12457d
            if (r2 != r3) goto L15e
            goto L17b
        L15e:
            l3.q r3 = sg.e.f12461h
            if (r2 == r3) goto L17b
            l3.q r3 = sg.e.f12462i
            if (r2 == r3) goto L17b
            l3.q r3 = sg.e.f12464k
            if (r2 != r3) goto L16b
            goto L17b
        L16b:
            l3.q r3 = sg.e.f12465l
            if (r2 != r3) goto L170
            goto L17b
        L170:
            l3.q r3 = sg.e.f12459f
            if (r2 != r3) goto L175
            goto L109
        L175:
            java.lang.String r0 = "Unexpected cell state: "
            okio.a.p(r2, r0)
            return
        L17b:
            s(r15)
            return
    }

    public final sg.k l(long r10, sg.k r12) {
            r9 = this;
            sg.k r0 = sg.e.f12454a
            sg.d r0 = sg.d.f12453n
        L4:
            java.lang.Object r1 = vg.a.b(r12, r10, r0)
            boolean r2 = vg.a.e(r1)
            if (r2 != 0) goto L4a
            vg.q r2 = vg.a.c(r1)
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = sg.c.f12448m
            java.lang.Object r4 = r3.get(r9)
            vg.q r4 = (vg.q) r4
            long r5 = r4.f14357c
            long r7 = r2.f14357c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L23
            goto L4a
        L23:
            boolean r5 = r2.i()
            if (r5 != 0) goto L2a
            goto L4
        L2a:
            boolean r5 = r3.compareAndSet(r9, r4, r2)
            if (r5 == 0) goto L3a
            boolean r0 = r4.e()
            if (r0 == 0) goto L4a
            r4.d()
            goto L4a
        L3a:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L2a
            boolean r3 = r2.e()
            if (r3 == 0) goto L12
            r2.d()
            goto L12
        L4a:
            boolean r0 = vg.a.e(r1)
            r2 = 0
            if (r0 == 0) goto L66
            r9.u()
            long r10 = r12.f14357c
            int r0 = sg.e.f12455b
            long r0 = (long) r0
            long r10 = r10 * r0
            long r0 = r9.r()
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto Le2
            r12.a()
            return r2
        L66:
            vg.q r12 = vg.a.c(r1)
            sg.k r12 = (sg.k) r12
            long r0 = r12.f14357c
            boolean r3 = r9.w()
            if (r3 != 0) goto Lb6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = sg.c.f12445j
            long r3 = r3.get(r9)
            int r5 = sg.e.f12455b
            long r5 = (long) r5
            long r3 = r3 / r5
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 > 0) goto Lb6
        L82:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = sg.c.f12449n
            java.lang.Object r4 = r3.get(r9)
            vg.q r4 = (vg.q) r4
            long r5 = r4.f14357c
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lb6
            boolean r5 = r12.i()
            if (r5 == 0) goto Lb6
        L96:
            boolean r5 = r3.compareAndSet(r9, r4, r12)
            if (r5 == 0) goto La6
            boolean r3 = r4.e()
            if (r3 == 0) goto Lb6
            r4.d()
            goto Lb6
        La6:
            java.lang.Object r5 = r3.get(r9)
            if (r5 == r4) goto L96
            boolean r3 = r12.e()
            if (r3 == 0) goto L82
            r12.d()
            goto L82
        Lb6:
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 <= 0) goto Le3
            int r10 = sg.e.f12455b
            long r10 = (long) r10
            long r7 = r0 * r10
        Lbf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = sg.c.f12444i
            long r5 = r10.get(r9)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto Lca
            goto Ld3
        Lca:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = sg.c.f12444i
            r4 = r9
            boolean r10 = r3.compareAndSet(r4, r5, r7)
            if (r10 == 0) goto Lbf
        Ld3:
            int r10 = sg.e.f12455b
            long r10 = (long) r10
            long r0 = r0 * r10
            long r10 = r9.r()
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto Le2
            r12.a()
        Le2:
            return r2
        Le3:
            return r12
    }

    public final java.lang.Throwable m() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12450o
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    public final java.lang.Throwable n() {
            r2 = this;
            java.lang.Throwable r0 = r2.m()
            if (r0 != 0) goto Ld
            sg.l r0 = new sg.l
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
        Ld:
            return r0
    }

    public final java.lang.Throwable o() {
            r2 = this;
            java.lang.Throwable r0 = r2.m()
            if (r0 != 0) goto Ld
            sg.m r0 = new sg.m
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
        Ld:
            return r0
    }

    @Override // sg.p
    public java.lang.Object p(java.lang.Object r16) {
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = sg.c.f12443h
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.t(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.g(r1)
            r1 = r1 ^ r10
        L1b:
            sg.i r13 = sg.j.f12477a
            if (r1 == 0) goto L20
            return r13
        L20:
            l3.q r6 = sg.e.f12463j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = sg.c.f12447l
            java.lang.Object r1 = r1.get(r15)
            sg.k r1 = (sg.k) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.t(r2, r9)
            int r14 = sg.e.f12455b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f14357c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            sg.k r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.o()
            sg.h r2 = new sg.h
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            sf.n r3 = sf.n.f12433a
            if (r9 == 0) goto Lbd
            r10 = 1
            if (r9 == r10) goto Lbc
            r3 = 2
            if (r9 == r3) goto L9b
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12444i
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.o()
            sg.h r2 = new sg.h
            r2.<init>(r1)
            return r2
        L94:
            java.lang.String r1 = "unexpected"
            j8.o.A(r1)
            r1 = 0
            return r1
        L9b:
            if (r7 == 0) goto Laa
            r1.h()
            java.lang.Throwable r1 = r15.o()
            sg.h r2 = new sg.h
            r2.<init>(r1)
            return r2
        Laa:
            boolean r3 = r6 instanceof qg.o1
            if (r3 == 0) goto Lb1
            qg.o1 r6 = (qg.o1) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb8:
            r1.h()
            return r13
        Lbc:
            return r3
        Lbd:
            r1.a()
            return r3
    }

    @Override // sg.p
    public java.lang.Object q(java.lang.Object r23, wf.c r24) {
            r22 = this;
            r1 = r22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12447l
            java.lang.Object r2 = r0.get(r1)
            sg.k r2 = (sg.k) r2
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = sg.c.f12443h
            long r3 = r9.getAndIncrement(r1)
            r10 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r5 = r3 & r10
            r12 = 0
            boolean r8 = r1.t(r3, r12)
            int r13 = sg.e.f12455b
            long r3 = (long) r13
            long r14 = r5 / r3
            long r3 = r5 % r3
            int r3 = (int) r3
            r16 = r10
            long r10 = r2.f14357c
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            xf.a r10 = xf.a.f21579g
            sf.n r11 = sf.n.f12433a
            if (r4 == 0) goto L43
            sg.k r4 = b(r1, r14, r2)
            if (r4 != 0) goto L42
            if (r8 == 0) goto La
            java.lang.Object r0 = r22.y(r23, r24)
            if (r0 != r10) goto L3f
            return r0
        L3f:
            r4 = r1
            goto L177
        L42:
            r2 = r4
        L43:
            r7 = 0
            r4 = r23
            int r7 = e(r1, r2, r3, r4, r5, r7, r8)
            if (r7 == 0) goto L178
            r14 = 1
            if (r7 == r14) goto L3f
            r15 = 2
            if (r7 == r15) goto L168
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = sg.c.f12444i
            r8 = 5
            r12 = 4
            r15 = 3
            if (r7 == r15) goto L74
            if (r7 == r12) goto L62
            if (r7 == r8) goto L5e
            goto La
        L5e:
            r2.a()
            goto La
        L62:
            long r3 = r4.get(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6d
            r2.a()
        L6d:
            java.lang.Object r0 = r22.y(r23, r24)
            if (r0 != r10) goto L3f
            return r0
        L74:
            wf.c r7 = fb.v0.x(r24)
            qg.g r7 = qg.v.l(r7)
            r18 = r8
            r8 = 0
            r19 = r4
            r15 = r18
            r4 = r23
            int r8 = e(r1, r2, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Lc8
            if (r8 == 0) goto L154
            if (r8 == r14) goto L14f
            r14 = 2
            if (r8 == r14) goto L149
            if (r8 == r12) goto L139
            java.lang.String r13 = "unexpected"
            if (r8 != r15) goto L131
            r2.a()     // Catch: java.lang.Throwable -> Lc8
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc8
            sg.k r0 = (sg.k) r0     // Catch: java.lang.Throwable -> Lc8
        L9f:
            long r2 = r9.getAndIncrement(r1)     // Catch: java.lang.Throwable -> Lc8
            long r5 = r2 & r16
            r14 = 0
            boolean r8 = r1.t(r2, r14)     // Catch: java.lang.Throwable -> Lc8
            int r2 = sg.e.f12455b     // Catch: java.lang.Throwable -> Lc8
            long r14 = (long) r2     // Catch: java.lang.Throwable -> Lc8
            r20 = r13
            long r12 = r5 / r14
            long r14 = r5 % r14
            int r3 = (int) r14     // Catch: java.lang.Throwable -> Lc8
            long r14 = r0.f14357c     // Catch: java.lang.Throwable -> Lc8
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 == 0) goto Ld4
            sg.k r12 = b(r1, r12, r0)     // Catch: java.lang.Throwable -> Lc8
            if (r12 != 0) goto Ld1
            if (r8 == 0) goto Lcc
            c(r1, r4, r7)     // Catch: java.lang.Throwable -> Lc8
            r4 = r1
            goto L159
        Lc8:
            r0 = move-exception
            r4 = r1
            goto L164
        Lcc:
            r13 = r20
            r12 = 4
            r15 = 5
            goto L9f
        Ld1:
            r0 = r2
            r2 = r12
            goto Ld9
        Ld4:
            r21 = r2
            r2 = r0
            r0 = r21
        Ld9:
            int r12 = e(r1, r2, r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Lc8
            r21 = r4
            r4 = r1
            r1 = r2
            r2 = r3
            r3 = r21
            if (r12 == 0) goto L12d
            r13 = 1
            if (r12 == r13) goto L129
            r14 = 2
            if (r12 == r14) goto L11d
            r15 = 3
            if (r12 == r15) goto L115
            r0 = 4
            if (r12 == r0) goto L104
            r2 = 5
            if (r12 == r2) goto Lf6
            goto Lf9
        Lf6:
            r1.a()     // Catch: java.lang.Throwable -> L101
        Lf9:
            r12 = r0
            r0 = r1
            r15 = r2
            r1 = r4
            r13 = r20
            r4 = r3
            goto L9f
        L101:
            r0 = move-exception
            goto L164
        L104:
            r0 = r19
            long r8 = r0.get(r4)     // Catch: java.lang.Throwable -> L101
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L111
            r1.a()     // Catch: java.lang.Throwable -> L101
        L111:
            c(r4, r3, r7)     // Catch: java.lang.Throwable -> L101
            goto L159
        L115:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r1 = r20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L101
            throw r0     // Catch: java.lang.Throwable -> L101
        L11d:
            if (r8 == 0) goto L123
            r1.h()     // Catch: java.lang.Throwable -> L101
            goto L111
        L123:
            int r3 = r2 + r0
            r7.a(r1, r3)     // Catch: java.lang.Throwable -> L101
            goto L159
        L129:
            r7.resumeWith(r11)     // Catch: java.lang.Throwable -> L101
            goto L159
        L12d:
            r1.a()     // Catch: java.lang.Throwable -> L101
            goto L129
        L131:
            r4 = r1
            r1 = r13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L101
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L101
            throw r0     // Catch: java.lang.Throwable -> L101
        L139:
            r3 = r4
            r0 = r19
            r4 = r1
            long r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L101
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L111
            r2.a()     // Catch: java.lang.Throwable -> L101
            goto L111
        L149:
            r4 = r1
            int r3 = r3 + r13
            r7.a(r2, r3)     // Catch: java.lang.Throwable -> L101
            goto L159
        L14f:
            r4 = r1
            r7.resumeWith(r11)     // Catch: java.lang.Throwable -> L101
            goto L159
        L154:
            r4 = r1
            r2.a()     // Catch: java.lang.Throwable -> L101
            goto L129
        L159:
            java.lang.Object r0 = r7.o()
            if (r0 != r10) goto L160
            goto L161
        L160:
            r0 = r11
        L161:
            if (r0 != r10) goto L177
            return r0
        L164:
            r7.x()
            throw r0
        L168:
            r3 = r23
            r4 = r1
            if (r8 == 0) goto L177
            r2.h()
            java.lang.Object r0 = r22.y(r23, r24)
            if (r0 != r10) goto L177
            return r0
        L177:
            return r11
        L178:
            r4 = r1
            r2.a()
            return r11
    }

    public final long r() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12443h
            long r0 = r0.get(r4)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            return r0
    }

    public final boolean t(long r14, boolean r16) {
            r13 = this;
            r0 = 60
            long r0 = r14 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 == 0) goto L16a
            r2 = 1
            if (r0 == r2) goto L16a
            r3 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = sg.c.f12444i
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r3) goto Ldb
            r3 = 3
            if (r0 != r3) goto Ld0
            long r5 = r5 & r14
            sg.k r0 = r13.i(r5)
            r3 = 0
            r5 = r3
        L1f:
            int r6 = sg.e.f12455b
            int r6 = r6 - r2
        L22:
            r7 = -1
            if (r7 >= r6) goto La2
            long r8 = r0.f14357c
            int r10 = sg.e.f12455b
            long r10 = (long) r10
            long r8 = r8 * r10
            long r10 = (long) r6
            long r8 = r8 + r10
        L2d:
            java.lang.Object r10 = r0.k(r6)
            l3.q r11 = sg.e.f12462i
            if (r10 == r11) goto Lae
            l3.q r11 = sg.e.f12457d
            if (r10 != r11) goto L50
            long r11 = r4.get(r13)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto Lae
            l3.q r11 = sg.e.f12465l
            boolean r10 = r0.j(r10, r6, r11)
            if (r10 == 0) goto L2d
            r0.m(r6, r3)
            r0.h()
            goto L9f
        L50:
            l3.q r11 = sg.e.f12458e
            if (r10 == r11) goto L94
            if (r10 != 0) goto L57
            goto L94
        L57:
            boolean r11 = r10 instanceof qg.o1
            if (r11 != 0) goto L6c
            boolean r11 = r10 instanceof sg.q
            if (r11 == 0) goto L60
            goto L6c
        L60:
            l3.q r11 = sg.e.f12460g
            if (r10 == r11) goto Lae
            l3.q r12 = sg.e.f12459f
            if (r10 != r12) goto L69
            goto Lae
        L69:
            if (r10 == r11) goto L2d
            goto L9f
        L6c:
            long r11 = r4.get(r13)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 < 0) goto Lae
            boolean r11 = r10 instanceof sg.q
            if (r11 == 0) goto L7e
            r11 = r10
            sg.q r11 = (sg.q) r11
            qg.o1 r11 = r11.f12482a
            goto L81
        L7e:
            r11 = r10
            qg.o1 r11 = (qg.o1) r11
        L81:
            l3.q r12 = sg.e.f12465l
            boolean r10 = r0.j(r10, r6, r12)
            if (r10 == 0) goto L2d
            java.lang.Object r5 = vg.a.f(r5, r11)
            r0.m(r6, r3)
            r0.h()
            goto L9f
        L94:
            l3.q r11 = sg.e.f12465l
            boolean r10 = r0.j(r10, r6, r11)
            if (r10 == 0) goto L2d
            r0.h()
        L9f:
            int r6 = r6 + (-1)
            goto L22
        La2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = vg.b.f14325b
            java.lang.Object r0 = r6.get(r0)
            vg.b r0 = (vg.b) r0
            sg.k r0 = (sg.k) r0
            if (r0 != 0) goto L1f
        Lae:
            if (r5 == 0) goto L169
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 != 0) goto Lbb
            qg.o1 r5 = (qg.o1) r5
            r13.z(r5, r1)
            goto L169
        Lbb:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            int r0 = r0 - r2
        Lc2:
            if (r7 >= r0) goto L169
            java.lang.Object r3 = r5.get(r0)
            qg.o1 r3 = (qg.o1) r3
            r13.z(r3, r1)
            int r0 = r0 + (-1)
            goto Lc2
        Ld0:
            java.lang.String r1 = "unexpected close status: "
            java.lang.String r0 = eh.a.l(r0, r1)
            ah.a.h(r0)
            r0 = 0
            return r0
        Ldb:
            long r5 = r5 & r14
            r13.i(r5)
            if (r16 == 0) goto L169
        Le1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sg.c.f12448m
            java.lang.Object r3 = r0.get(r13)
            sg.k r3 = (sg.k) r3
            long r7 = r4.get(r13)
            long r5 = r13.r()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto Lf7
            goto L169
        Lf7:
            int r5 = sg.e.f12455b
            long r5 = (long) r5
            long r9 = r7 / r5
            long r11 = r3.f14357c
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L115
            sg.k r3 = r13.l(r9, r3)
            if (r3 != 0) goto L115
            java.lang.Object r0 = r0.get(r13)
            sg.k r0 = (sg.k) r0
            long r5 = r0.f14357c
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto Le1
            goto L169
        L115:
            r3.a()
            long r5 = r7 % r5
            int r0 = (int) r5
        L11b:
            java.lang.Object r5 = r3.k(r0)
            if (r5 == 0) goto L152
            l3.q r6 = sg.e.f12458e
            if (r5 != r6) goto L126
            goto L152
        L126:
            l3.q r0 = sg.e.f12457d
            if (r5 != r0) goto L12b
            goto L16a
        L12b:
            l3.q r0 = sg.e.f12463j
            if (r5 != r0) goto L130
            goto L15d
        L130:
            l3.q r0 = sg.e.f12465l
            if (r5 != r0) goto L135
            goto L15d
        L135:
            l3.q r0 = sg.e.f12462i
            if (r5 != r0) goto L13a
            goto L15d
        L13a:
            l3.q r0 = sg.e.f12461h
            if (r5 != r0) goto L13f
            goto L15d
        L13f:
            l3.q r0 = sg.e.f12460g
            if (r5 != r0) goto L144
            goto L16a
        L144:
            l3.q r0 = sg.e.f12459f
            if (r5 != r0) goto L149
            goto L15d
        L149:
            long r5 = r4.get(r13)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L15d
            goto L16a
        L152:
            l3.q r6 = sg.e.f12461h
            boolean r5 = r3.j(r5, r0, r6)
            if (r5 == 0) goto L11b
            r13.k()
        L15d:
            r5 = 1
            long r9 = r7 + r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = sg.c.f12444i
            r6 = r13
            r5.compareAndSet(r6, r7, r9)
            goto Le1
        L169:
            return r2
        L16a:
            return r1
    }

    public final java.lang.String toString() {
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12443h
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L1e
            if (r2 == r3) goto L18
            goto L23
        L18:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L23
        L1e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.f12452g
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            sg.k[] r2 = new sg.k[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = sg.c.f12448m
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = sg.c.f12447l
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = sg.c.f12449n
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = a.a.y0(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()
            r8 = r4
            sg.k r8 = (sg.k) r8
            sg.k r9 = sg.e.f12454a
            if (r8 == r9) goto L69
            r3.add(r4)
            goto L69
        L7e:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c1
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L93
            goto Lad
        L93:
            r4 = r3
            sg.k r4 = (sg.k) r4
            long r8 = r4.f14357c
        L98:
            java.lang.Object r4 = r2.next()
            r10 = r4
            sg.k r10 = (sg.k) r10
            long r10 = r10.f14357c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto La7
            r3 = r4
            r8 = r10
        La7:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L98
        Lad:
            sg.k r3 = (sg.k) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = sg.c.f12444i
            long r10 = r2.get(r0)
            long r12 = r0.r()
        Lb9:
            int r2 = sg.e.f12455b
            r4 = r6
        Lbc:
            if (r4 >= r2) goto L194
            long r8 = r3.f14357c
            int r14 = sg.e.f12455b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto Ld3
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto Lcf
            goto Ld3
        Lcf:
            r16 = r7
            goto L19f
        Ld3:
            java.lang.Object r15 = r3.k(r4)
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r3.f12479f
            r16 = r7
            int r7 = r4 * 2
            java.lang.Object r6 = r6.get(r7)
            boolean r7 = r15 instanceof qg.f
            if (r7 == 0) goto Lf9
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto Lef
            if (r14 < 0) goto Lef
            java.lang.String r7 = "receive"
            goto L15c
        Lef:
            if (r14 >= 0) goto Lf6
            if (r7 < 0) goto Lf6
            java.lang.String r7 = "send"
            goto L15c
        Lf6:
            java.lang.String r7 = "cont"
            goto L15c
        Lf9:
            boolean r7 = r15 instanceof sg.q
            if (r7 == 0) goto L111
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r7.<init>(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L15c
        L111:
            l3.q r7 = sg.e.f12459f
            boolean r7 = gg.l.a(r15, r7)
            if (r7 != 0) goto L15a
            l3.q r7 = sg.e.f12460g
            boolean r7 = gg.l.a(r15, r7)
            if (r7 == 0) goto L122
            goto L15a
        L122:
            if (r15 == 0) goto L18d
            l3.q r7 = sg.e.f12458e
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L18d
            l3.q r7 = sg.e.f12462i
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L18d
            l3.q r7 = sg.e.f12461h
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L18d
            l3.q r7 = sg.e.f12464k
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L18d
            l3.q r7 = sg.e.f12463j
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L18d
            l3.q r7 = sg.e.f12465l
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L155
            goto L18d
        L155:
            java.lang.String r7 = r15.toString()
            goto L15c
        L15a:
            java.lang.String r7 = "resuming_sender"
        L15c:
            if (r6 == 0) goto L17b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L18d
        L17b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L18d:
            int r4 = r4 + 1
            r7 = r16
            r6 = 0
            goto Lbc
        L194:
            r16 = r7
            vg.b r2 = r3.b()
            r3 = r2
            sg.k r3 = (sg.k) r3
            if (r3 != 0) goto L1bc
        L19f:
            char r2 = og.m.u0(r1)
            if (r2 != r5) goto L1b2
            int r2 = r1.length()
            int r2 = r2 + (-1)
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            r2.getClass()
        L1b2:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L1bc:
            r7 = r16
            r6 = 0
            goto Lb9
        L1c1:
            bsh.j.e()
            r1 = 0
            return r1
    }

    public final boolean u() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12443h
            long r0 = r0.get(r3)
            r2 = 0
            boolean r0 = r3.t(r0, r2)
            return r0
    }

    public boolean v() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean w() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = sg.c.f12445j
            long r0 = r0.get(r4)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L18
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L16
            goto L18
        L16:
            r0 = 0
            return r0
        L18:
            r0 = 1
            return r0
    }

    public final void x(long r5, sg.k r7) {
            r4 = this;
        L0:
            long r0 = r7.f14357c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            vg.b r0 = r7.b()
            sg.k r0 = (sg.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            vg.b r5 = r7.b()
            sg.k r5 = (sg.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = sg.c.f12449n
            java.lang.Object r6 = r5.get(r4)
            vg.q r6 = (vg.q) r6
            long r0 = r6.f14357c
            long r2 = r7.f14357c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
    }

    public final java.lang.Object y(java.lang.Object r2, wf.c r3) {
            r1 = this;
            qg.g r2 = new qg.g
            wf.c r3 = fb.v0.x(r3)
            r0 = 1
            r2.<init>(r0, r3)
            r2.p()
            java.lang.Throwable r3 = r1.o()
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r2.resumeWith(r0)
            java.lang.Object r2 = r2.o()
            xf.a r3 = xf.a.f21579g
            if (r2 != r3) goto L22
            return r2
        L22:
            sf.n r2 = sf.n.f12433a
            return r2
    }

    public final void z(qg.o1 r2, boolean r3) {
            r1 = this;
            boolean r0 = r2 instanceof qg.f
            if (r0 == 0) goto L1a
            wf.c r2 = (wf.c) r2
            if (r3 == 0) goto Ld
            java.lang.Throwable r3 = r1.n()
            goto L11
        Ld:
            java.lang.Throwable r3 = r1.o()
        L11:
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r2.resumeWith(r0)
            return
        L1a:
            boolean r3 = r2 instanceof sg.b
            if (r3 == 0) goto L43
            sg.b r2 = (sg.b) r2
            qg.g r3 = r2.f12441h
            r3.getClass()
            r0 = 0
            r2.f12441h = r0
            l3.q r0 = sg.e.f12465l
            r2.f12440g = r0
            sg.c r2 = r2.f12442i
            java.lang.Throwable r2 = r2.m()
            if (r2 != 0) goto L3a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3.resumeWith(r2)
            return
        L3a:
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r3.resumeWith(r0)
            return
        L43:
            java.lang.String r3 = "Unexpected waiter: "
            okio.a.p(r2, r3)
            return
    }
}
