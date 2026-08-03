package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends java.lang.Thread {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f21589o = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xg.l f21590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gg.u f21591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xg.b f21592i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f21594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xg.c f21597n;
    private volatile java.lang.Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    static {
            java.lang.Class<xg.a> r0 = xg.a.class
            java.lang.String r1 = "workerCtl$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            xg.a.f21589o = r0
            return
    }

    public a(xg.c r3, int r4) {
            r2 = this;
            r2.f21597n = r3
            r2.<init>()
            r3 = 1
            r2.setDaemon(r3)
            java.lang.Class<xg.c> r3 = xg.c.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setContextClassLoader(r3)
            xg.l r3 = new xg.l
            r3.<init>()
            r2.f21590g = r3
            gg.u r3 = new gg.u
            r3.<init>()
            r2.f21591h = r3
            xg.b r3 = xg.b.f21601j
            r2.f21592i = r3
            l3.q r3 = xg.c.f21607q
            r2.nextParkedWorker = r3
            long r0 = java.lang.System.nanoTime()
            int r3 = (int) r0
            if (r3 == 0) goto L30
            goto L32
        L30:
            r3 = 42
        L32:
            r2.f21595l = r3
            r2.f(r4)
            return
    }

    public final xg.h a(boolean r12) {
            r11 = this;
            xg.b r0 = r11.f21592i
            xg.c r2 = r11.f21597n
            r7 = 0
            r8 = 1
            xg.l r9 = r11.f21590g
            xg.b r10 = xg.b.f21598g
            if (r0 != r10) goto Le
            goto L84
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21605o
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = xg.l.f21630b
            java.lang.Object r0 = r12.get(r9)
            xg.h r0 = (xg.h) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f21621h
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r9)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = xg.l.f21632d
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xg.l.f21631c
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xg.l.f21633e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            xg.h r1 = r9.c(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            xg.f r12 = r2.f21613l
            java.lang.Object r12 = r12.d()
            xg.h r12 = (xg.h) r12
            if (r12 != 0) goto L71
            xg.h r12 = r11.i(r8)
        L71:
            return r12
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = xg.c.f21605o
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f21592i = r10
        L84:
            if (r12 == 0) goto Lb8
            int r12 = r2.f21608g
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            xg.h r12 = r11.e()
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = xg.l.f21630b
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            xg.h r12 = (xg.h) r12
            if (r12 != 0) goto Lac
            xg.h r12 = r9.b()
        Lac:
            if (r12 == 0) goto Laf
            return r12
        Laf:
            if (r8 != 0) goto Lbf
            xg.h r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lb8:
            xg.h r12 = r11.e()
            if (r12 == 0) goto Lbf
            return r12
        Lbf:
            r12 = 3
            xg.h r12 = r11.i(r12)
            return r12
    }

    public final int b() {
            r1 = this;
            int r0 = r1.indexInArray
            return r0
    }

    public final java.lang.Object c() {
            r1 = this;
            java.lang.Object r0 = r1.nextParkedWorker
            return r0
    }

    public final int d(int r4) {
            r3 = this;
            int r0 = r3.f21595l
            int r1 = r0 << 13
            r0 = r0 ^ r1
            int r1 = r0 >> 17
            r0 = r0 ^ r1
            int r1 = r0 << 5
            r0 = r0 ^ r1
            r3.f21595l = r0
            int r1 = r4 + (-1)
            r2 = r1 & r4
            if (r2 != 0) goto L16
            r4 = r0 & r1
            return r4
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            int r0 = r0 % r4
            return r0
    }

    public final xg.h e() {
            r3 = this;
            r0 = 2
            int r0 = r3.d(r0)
            xg.c r1 = r3.f21597n
            xg.f r2 = r1.f21613l
            xg.f r1 = r1.f21612k
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r1.d()
            xg.h r0 = (xg.h) r0
            if (r0 == 0) goto L16
            return r0
        L16:
            java.lang.Object r0 = r2.d()
            xg.h r0 = (xg.h) r0
            return r0
        L1d:
            java.lang.Object r0 = r2.d()
            xg.h r0 = (xg.h) r0
            if (r0 == 0) goto L26
            return r0
        L26:
            java.lang.Object r0 = r1.d()
            xg.h r0 = (xg.h) r0
            return r0
    }

    public final void f(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xg.c r1 = r2.f21597n
            java.lang.String r1 = r1.f21611j
            r0.append(r1)
            java.lang.String r1 = "-worker-"
            r0.append(r1)
            if (r3 != 0) goto L16
            java.lang.String r1 = "TERMINATED"
            goto L1a
        L16:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L1a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
            r2.indexInArray = r3
            return
    }

    public final void g(java.lang.Object r1) {
            r0 = this;
            r0.nextParkedWorker = r1
            return
    }

    public final boolean h(xg.b r7) {
            r6 = this;
            xg.b r0 = r6.f21592i
            xg.b r1 = xg.b.f21598g
            if (r0 != r1) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = xg.c.f21605o
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            xg.c r5 = r6.f21597n
            r2.addAndGet(r5, r3)
        L17:
            if (r0 == r7) goto L1b
            r6.f21592i = r7
        L1b:
            return r1
    }

    public final xg.h i(int r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = xg.c.f21605o
            xg.c r3 = r0.f21597n
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 0
            r5 = 2
            if (r2 >= r5) goto L16
            return r4
        L16:
            int r6 = r0.d(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L20:
            if (r10 >= r2) goto Lf0
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L27
            r6 = r15
        L27:
            vg.o r5 = r3.f21614m
            java.lang.Object r5 = r5.b(r6)
            xg.a r5 = (xg.a) r5
            if (r5 == 0) goto Le5
            if (r5 == r0) goto Le5
            xg.l r5 = r5.f21590g
            r7 = 3
            if (r1 != r7) goto L44
            xg.h r7 = r5.b()
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            goto L7a
        L44:
            r5.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = xg.l.f21632d
            int r7 = r7.get(r5)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = xg.l.f21631c
            int r8 = r8.get(r5)
            if (r1 != r15) goto L5c
            r9 = r15
            goto L5d
        L5c:
            r9 = 0
        L5d:
            if (r7 == r8) goto L77
            r18 = 0
            if (r9 == 0) goto L6d
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = xg.l.f21633e
            int r13 = r13.get(r5)
            if (r13 != 0) goto L6d
        L6b:
            r7 = r4
            goto L7a
        L6d:
            int r13 = r7 + 1
            xg.h r7 = r5.c(r7, r9)
            if (r7 != 0) goto L7a
            r7 = r13
            goto L5d
        L77:
            r18 = 0
            goto L6b
        L7a:
            gg.u r13 = r0.f21591h
            if (r7 == 0) goto L86
            r13.f4564g = r7
            r5 = r4
            r7 = -1
            r20 = -1
            goto Lc8
        L86:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = xg.l.f21630b
            java.lang.Object r14 = r7.get(r5)
            xg.h r14 = (xg.h) r14
            if (r14 != 0) goto L93
            r20 = -1
            goto L9f
        L93:
            r20 = -1
            boolean r8 = r14.f21621h
            if (r8 == 0) goto L9b
            r8 = r15
            goto L9c
        L9b:
            r8 = 2
        L9c:
            r8 = r8 & r1
            if (r8 != 0) goto La3
        L9f:
            r7 = -2
            r5 = r4
            goto Lc8
        La3:
            xg.g r8 = xg.j.f21628f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r23 = r5
            long r4 = r14.f21620g
            long r8 = r8 - r4
            long r4 = xg.j.f21624b
            int r24 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r24 >= 0) goto Lbb
            long r7 = r4 - r8
            r5 = 0
            goto Lc8
        Lbb:
            r4 = r23
        Lbd:
            r5 = 0
            boolean r8 = r7.compareAndSet(r4, r14, r5)
            if (r8 == 0) goto Ldc
            r13.f4564g = r14
            r7 = r20
        Lc8:
            int r4 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r4 != 0) goto Ld3
            java.lang.Object r1 = r13.f4564g
            xg.h r1 = (xg.h) r1
            r13.f4564g = r5
            return r1
        Ld3:
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 <= 0) goto Lea
            long r11 = java.lang.Math.min(r11, r7)
            goto Lea
        Ldc:
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto Lbd
            r5 = r4
            r4 = 0
            goto L86
        Le5:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lea:
            int r10 = r10 + 1
            r4 = 0
            r5 = 2
            goto L20
        Lf0:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 == 0) goto Lfc
            goto Lfe
        Lfc:
            r11 = r18
        Lfe:
            r0.f21594k = r11
            r22 = 0
            return r22
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r23 = this;
            r1 = r23
            r2 = 0
        L3:
            r0 = r2
        L4:
            xg.c r3 = r1.f21597n
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = xg.c.f21606p
            int r3 = r4.get(r3)
            if (r3 == 0) goto L10
            goto L19b
        L10:
            xg.b r3 = r1.f21592i
            xg.b r4 = xg.b.f21602k
            if (r3 == r4) goto L19b
            boolean r3 = r1.f21596m
            xg.h r3 = r1.a(r3)
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            r7 = 0
            if (r3 == 0) goto L86
            r1.f21594k = r7
            xg.c r9 = r1.f21597n
            r1.f21593j = r7
            xg.b r0 = r1.f21592i
            xg.b r7 = xg.b.f21600i
            if (r0 != r7) goto L33
            xg.b r0 = xg.b.f21599h
            r1.f21592i = r0
        L33:
            boolean r0 = r3.f21621h
            if (r0 == 0) goto L74
            xg.b r0 = xg.b.f21599h
            boolean r0 = r1.h(r0)
            if (r0 == 0) goto L56
            boolean r0 = r9.h()
            if (r0 == 0) goto L46
            goto L56
        L46:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21605o
            long r7 = r0.get(r9)
            boolean r0 = r9.g(r7)
            if (r0 == 0) goto L53
            goto L56
        L53:
            r9.h()
        L56:
            r3.run()     // Catch: java.lang.Throwable -> L5a
            goto L66
        L5a:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r7 = r3.getUncaughtExceptionHandler()
            r7.uncaughtException(r3, r0)
        L66:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21605o
            r0.addAndGet(r9, r5)
            xg.b r0 = r1.f21592i
            if (r0 == r4) goto L3
            xg.b r0 = xg.b.f21601j
            r1.f21592i = r0
            goto L3
        L74:
            r3.run()     // Catch: java.lang.Throwable -> L78
            goto L3
        L78:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r0)
            goto L3
        L86:
            r1.f21596m = r2
            long r3 = r1.f21594k
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto La5
            if (r0 != 0) goto L94
            r0 = r4
            goto L4
        L94:
            xg.b r0 = xg.b.f21600i
            r1.h(r0)
            java.lang.Thread.interrupted()
            long r3 = r1.f21594k
            java.util.concurrent.locks.LockSupport.parkNanos(r3)
            r1.f21594k = r7
            goto L3
        La5:
            java.lang.Object r3 = r1.nextParkedWorker
            l3.q r9 = xg.c.f21607q
            if (r3 == r9) goto L165
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = xg.a.f21589o
            r5 = -1
            r3.set(r1, r5)
        Lb1:
            java.lang.Object r3 = r1.nextParkedWorker
            l3.q r6 = xg.c.f21607q
            if (r3 == r6) goto L4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = xg.a.f21589o
            int r6 = r3.get(r1)
            if (r6 != r5) goto L4
            xg.c r6 = r1.f21597n
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = xg.c.f21606p
            int r6 = r9.get(r6)
            if (r6 == 0) goto Lcb
            goto L4
        Lcb:
            xg.b r6 = r1.f21592i
            xg.b r12 = xg.b.f21602k
            if (r6 != r12) goto Ld3
            goto L4
        Ld3:
            xg.b r6 = xg.b.f21600i
            r1.h(r6)
            java.lang.Thread.interrupted()
            long r13 = r1.f21593j
            int r6 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r6 != 0) goto Lf0
            long r13 = java.lang.System.nanoTime()
            xg.c r6 = r1.f21597n
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
            long r10 = r6.f21610i
            long r13 = r13 + r10
            r1.f21593j = r13
            goto Lf3
        Lf0:
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
        Lf3:
            xg.c r6 = r1.f21597n
            long r10 = r6.f21610i
            java.util.concurrent.locks.LockSupport.parkNanos(r10)
            long r10 = java.lang.System.nanoTime()
            long r13 = r1.f21593j
            long r10 = r10 - r13
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 < 0) goto Lb1
            r1.f21593j = r7
            xg.c r6 = r1.f21597n
            vg.o r10 = r6.f21614m
            monitor-enter(r10)
            int r9 = r9.get(r6)     // Catch: java.lang.Throwable -> L156
            if (r9 == 0) goto L114
            r9 = r4
            goto L115
        L114:
            r9 = r2
        L115:
            if (r9 == 0) goto L119
            monitor-exit(r10)
            goto Lb1
        L119:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = xg.c.f21605o     // Catch: java.lang.Throwable -> L156
            long r13 = r9.get(r6)     // Catch: java.lang.Throwable -> L156
            long r13 = r13 & r15
            int r11 = (int) r13     // Catch: java.lang.Throwable -> L156
            int r13 = r6.f21608g     // Catch: java.lang.Throwable -> L156
            if (r11 > r13) goto L127
            monitor-exit(r10)
            goto Lb1
        L127:
            boolean r3 = r3.compareAndSet(r1, r5, r4)     // Catch: java.lang.Throwable -> L156
            if (r3 != 0) goto L12f
            monitor-exit(r10)
            goto Lb1
        L12f:
            int r3 = r1.indexInArray     // Catch: java.lang.Throwable -> L156
            r1.f(r2)     // Catch: java.lang.Throwable -> L156
            r6.e(r1, r3, r2)     // Catch: java.lang.Throwable -> L156
            long r13 = r9.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L156
            long r13 = r13 & r15
            int r9 = (int) r13     // Catch: java.lang.Throwable -> L156
            if (r9 == r3) goto L158
            vg.o r11 = r6.f21614m     // Catch: java.lang.Throwable -> L156
            java.lang.Object r11 = r11.b(r9)     // Catch: java.lang.Throwable -> L156
            r11.getClass()     // Catch: java.lang.Throwable -> L156
            xg.a r11 = (xg.a) r11     // Catch: java.lang.Throwable -> L156
            vg.o r13 = r6.f21614m     // Catch: java.lang.Throwable -> L156
            r13.c(r3, r11)     // Catch: java.lang.Throwable -> L156
            r11.f(r3)     // Catch: java.lang.Throwable -> L156
            r6.e(r11, r9, r3)     // Catch: java.lang.Throwable -> L156
            goto L158
        L156:
            r0 = move-exception
            goto L163
        L158:
            vg.o r3 = r6.f21614m     // Catch: java.lang.Throwable -> L156
            r6 = 0
            r3.c(r9, r6)     // Catch: java.lang.Throwable -> L156
            monitor-exit(r10)
            r1.f21592i = r12
            goto Lb1
        L163:
            monitor-exit(r10)
            throw r0
        L165:
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
            xg.c r3 = r1.f21597n
            java.lang.Object r4 = r1.nextParkedWorker
            if (r4 == r9) goto L170
            goto L4
        L170:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = xg.c.f21604n
        L172:
            long r19 = r4.get(r3)
            long r7 = r19 & r15
            int r7 = (int) r7
            r8 = 2097152(0x200000, double:1.036131E-317)
            long r8 = r19 + r8
            long r8 = r8 & r5
            int r10 = r1.indexInArray
            vg.o r11 = r3.f21614m
            java.lang.Object r7 = r11.b(r7)
            r1.nextParkedWorker = r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r17 = xg.c.f21604n
            long r10 = (long) r10
            long r21 = r8 | r10
            r18 = r3
            boolean r3 = r17.compareAndSet(r18, r19, r21)
            if (r3 == 0) goto L198
            goto L4
        L198:
            r3 = r18
            goto L172
        L19b:
            xg.b r0 = xg.b.f21602k
            r1.h(r0)
            return
    }
}
