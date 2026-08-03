package xg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.concurrent.Executor, java.io.Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f21604n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f21605o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f21606p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l3.q f21607q = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f21610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f21611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xg.f f21612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xg.f f21613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vg.o f21614m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
            java.lang.String r0 = "parkedWorkersStack$volatile"
            java.lang.Class<xg.c> r1 = xg.c.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            xg.c.f21604n = r0
            java.lang.String r0 = "controlState$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            xg.c.f21605o = r0
            java.lang.String r0 = "_isTerminated$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            xg.c.f21606p = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "NOT_IN_STACK"
            r2 = 1
            r0.<init>(r1, r2)
            xg.c.f21607q = r0
            return
    }

    public c(int r3, int r4, long r5, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.f21608g = r3
            r2.f21609h = r4
            r2.f21610i = r5
            r2.f21611j = r7
            r7 = 1
            if (r3 < r7) goto L5f
            java.lang.String r7 = "Max pool size "
            if (r4 < r3) goto L54
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r4 > r0) goto L49
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L40
            xg.f r4 = new xg.f
            r4.<init>()
            r2.f21612k = r4
            xg.f r4 = new xg.f
            r4.<init>()
            r2.f21613l = r4
            vg.o r4 = new vg.o
            int r5 = r3 + 1
            int r5 = r5 * 2
            r4.<init>(r5)
            r2.f21614m = r4
            long r3 = (long) r3
            r5 = 42
            long r3 = r3 << r5
            r2.controlState$volatile = r3
            r3 = 0
            r2._isTerminated$volatile = r3
            return
        L40:
            java.lang.String r3 = "Idle worker keep alive time "
            java.lang.String r4 = " must be positive"
            okio.a.f(r5, r3, r4)
            r3 = 0
            throw r3
        L49:
            java.lang.String r3 = " should not exceed maximal supported number of threads 2097150"
            java.lang.String r3 = eh.a.m(r4, r7, r3)
            j8.o.q(r3)
            r3 = 0
            throw r3
        L54:
            java.lang.String r5 = " should be greater than or equals to core pool size "
            java.lang.String r3 = p.a.j(r4, r7, r5, r3)
            j8.o.q(r3)
            r3 = 0
            throw r3
        L5f:
            java.lang.String r4 = "Core pool size "
            java.lang.String r5 = " should be at least 1"
            java.lang.String r3 = eh.a.m(r3, r4, r5)
            j8.o.q(r3)
            r3 = 0
            throw r3
    }

    public static /* synthetic */ void c(xg.c r1, java.lang.Runnable r2, int r3) {
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = 1
        L8:
            r1.b(r2, r0, r3)
            return
    }

    public final int a() {
            r11 = this;
            vg.o r0 = r11.f21614m
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xg.c.f21606p     // Catch: java.lang.Throwable -> L6d
            int r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r1 == 0) goto L15
            monitor-exit(r0)
            r0 = -1
            return r0
        L15:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = xg.c.f21605o     // Catch: java.lang.Throwable -> L6d
            long r4 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r8 = r4 & r6
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L6d
            r9 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r4 = r4 & r9
            r9 = 21
            long r4 = r4 >> r9
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L6d
            int r4 = r8 - r4
            if (r4 >= 0) goto L30
            r4 = r3
        L30:
            int r5 = r11.f21608g     // Catch: java.lang.Throwable -> L6d
            if (r4 < r5) goto L36
            monitor-exit(r0)
            return r3
        L36:
            int r5 = r11.f21609h     // Catch: java.lang.Throwable -> L6d
            if (r8 < r5) goto L3c
            monitor-exit(r0)
            return r3
        L3c:
            long r8 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            long r8 = r8 & r6
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 + r2
            if (r3 <= 0) goto L6f
            vg.o r5 = r11.f21614m     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r5.b(r3)     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L6f
            xg.a r5 = new xg.a     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r11, r3)     // Catch: java.lang.Throwable -> L6d
            vg.o r8 = r11.f21614m     // Catch: java.lang.Throwable -> L6d
            r8.c(r3, r5)     // Catch: java.lang.Throwable -> L6d
            long r8 = r1.incrementAndGet(r11)     // Catch: java.lang.Throwable -> L6d
            long r6 = r6 & r8
            int r1 = (int) r6
            if (r3 != r1) goto L65
            int r4 = r4 + r2
            monitor-exit(r0)
            r5.start()
            return r4
        L65:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L6d:
            r1 = move-exception
            goto L77
        L6f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L77:
            monitor-exit(r0)
            throw r1
    }

    public final void b(java.lang.Runnable r9, boolean r10, boolean r11) {
            r8 = this;
            xg.g r0 = xg.j.f21628f
            r0.getClass()
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r9 instanceof xg.h
            if (r2 == 0) goto L14
            xg.h r9 = (xg.h) r9
            r9.f21620g = r0
            r9.f21621h = r10
            goto L1a
        L14:
            xg.i r2 = new xg.i
            r2.<init>(r9, r0, r10)
            r9 = r2
        L1a:
            boolean r10 = r9.f21621h
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21605o
            if (r10 == 0) goto L28
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r0.addAndGet(r8, r1)
            goto L2a
        L28:
            r1 = 0
        L2a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r4 = r3 instanceof xg.a
            r5 = 0
            if (r4 == 0) goto L36
            xg.a r3 = (xg.a) r3
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L42
            xg.c r4 = r3.f21597n
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L42
            goto L43
        L42:
            r3 = r5
        L43:
            r4 = 1
            if (r3 != 0) goto L47
            goto L75
        L47:
            xg.b r6 = r3.f21592i
            xg.b r7 = xg.b.f21602k
            if (r6 != r7) goto L4e
            goto L75
        L4e:
            boolean r7 = r9.f21621h
            if (r7 != 0) goto L57
            xg.b r7 = xg.b.f21599h
            if (r6 != r7) goto L57
            goto L75
        L57:
            r3.f21596m = r4
            xg.l r6 = r3.f21590g
            if (r11 == 0) goto L62
            xg.h r9 = r6.a(r9)
            goto L75
        L62:
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = xg.l.f21630b
            java.lang.Object r9 = r7.getAndSet(r6, r9)
            xg.h r9 = (xg.h) r9
            if (r9 != 0) goto L71
            r9 = r5
            goto L75
        L71:
            xg.h r9 = r6.a(r9)
        L75:
            if (r9 == 0) goto L9e
            boolean r5 = r9.f21621h
            if (r5 == 0) goto L82
            xg.f r5 = r8.f21613l
            boolean r9 = r5.a(r9)
            goto L88
        L82:
            xg.f r5 = r8.f21612k
            boolean r9 = r5.a(r9)
        L88:
            if (r9 == 0) goto L8b
            goto L9e
        L8b:
            java.util.concurrent.RejectedExecutionException r9 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r8.f21611j
            java.lang.String r0 = " was terminated"
            java.lang.String r10 = eh.a.r(r10, r11, r0)
            r9.<init>(r10)
            throw r9
        L9e:
            if (r11 == 0) goto La3
            if (r3 == 0) goto La3
            goto La4
        La3:
            r4 = 0
        La4:
            if (r10 == 0) goto Lbb
            if (r4 == 0) goto La9
            goto Lcf
        La9:
            boolean r9 = r8.h()
            if (r9 == 0) goto Lb0
            goto Lcf
        Lb0:
            boolean r9 = r8.g(r1)
            if (r9 == 0) goto Lb7
            goto Lcf
        Lb7:
            r8.h()
            return
        Lbb:
            if (r4 == 0) goto Lbe
            goto Lcf
        Lbe:
            boolean r9 = r8.h()
            if (r9 == 0) goto Lc5
            goto Lcf
        Lc5:
            long r9 = r0.get(r8)
            boolean r9 = r8.g(r9)
            if (r9 == 0) goto Ld0
        Lcf:
            return
        Ld0:
            r8.h()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xg.c.f21606p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof xg.a
            r3 = 0
            if (r1 == 0) goto L17
            xg.a r0 = (xg.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            xg.c r1 = r0.f21597n
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            vg.o r1 = r8.f21614m
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = xg.c.f21605o     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            vg.o r5 = r8.f21614m
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            xg.a r5 = (xg.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            xg.l r5 = r5.f21590g
            xg.f r6 = r8.f21613l
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = xg.l.f21630b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            xg.h r7 = (xg.h) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            xg.h r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            xg.f r1 = r8.f21613l
            r1.b()
            xg.f r1 = r8.f21612k
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            xg.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            xg.f r1 = r8.f21612k
            java.lang.Object r1 = r1.d()
            xg.h r1 = (xg.h) r1
            if (r1 != 0) goto Lb2
            xg.f r1 = r8.f21613l
            java.lang.Object r1 = r1.d()
            xg.h r1 = (xg.h) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            xg.b r1 = xg.b.f21602k
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21604n
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21605o
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void e(xg.a r8, int r9, int r10) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21604n
            long r3 = r0.get(r7)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            if (r0 != r9) goto L35
            if (r10 != 0) goto L34
            java.lang.Object r0 = r8.c()
        L1b:
            l3.q r5 = xg.c.f21607q
            if (r0 != r5) goto L21
            r0 = -1
            goto L35
        L21:
            if (r0 != 0) goto L25
            r0 = 0
            goto L35
        L25:
            xg.a r0 = (xg.a) r0
            int r5 = r0.b()
            if (r5 == 0) goto L2f
            r0 = r5
            goto L35
        L2f:
            java.lang.Object r0 = r0.c()
            goto L1b
        L34:
            r0 = r10
        L35:
            if (r0 < 0) goto L0
            long r5 = (long) r0
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = xg.c.f21604n
            r2 = r7
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L0
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r0 = 6
            c(r1, r2, r0)
            return
    }

    public final boolean g(long r4) {
            r3 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r4
            int r0 = (int) r0
            r1 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r4 = r4 & r1
            r1 = 21
            long r4 = r4 >> r1
            int r4 = (int) r4
            int r0 = r0 - r4
            r4 = 0
            if (r0 >= 0) goto L14
            r0 = r4
        L14:
            int r5 = r3.f21608g
            if (r0 >= r5) goto L27
            int r0 = r3.a()
            r1 = 1
            if (r0 != r1) goto L24
            if (r5 <= r1) goto L24
            r3.a()
        L24:
            if (r0 <= 0) goto L27
            return r1
        L27:
            return r4
    }

    public final boolean h() {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xg.c.f21604n
            long r3 = r0.get(r10)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r3
            int r0 = (int) r0
            vg.o r1 = r10.f21614m
            java.lang.Object r0 = r1.b(r0)
            xg.a r0 = (xg.a) r0
            r7 = -1
            r8 = 0
            if (r0 != 0) goto L19
            r0 = 0
            goto L47
        L19:
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            java.lang.Object r5 = r0.c()
        L25:
            l3.q r9 = xg.c.f21607q
            if (r5 != r9) goto L2b
            r6 = r7
            goto L37
        L2b:
            if (r5 != 0) goto L2f
            r6 = r8
            goto L37
        L2f:
            xg.a r5 = (xg.a) r5
            int r6 = r5.b()
            if (r6 == 0) goto L57
        L37:
            if (r6 < 0) goto L0
            long r5 = (long) r6
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = xg.c.f21604n
            r2 = r10
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L0
            r0.g(r9)
        L47:
            if (r0 != 0) goto L4a
            return r8
        L4a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xg.a.f21589o
            boolean r1 = r1.compareAndSet(r0, r7, r8)
            if (r1 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r0 = 1
            return r0
        L57:
            java.lang.Object r5 = r5.c()
            goto L25
    }

    public final java.lang.String toString() {
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            vg.o r1 = r14.f21614m
            int r2 = r1.a()
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r4
        L12:
            if (r9 >= r2) goto Laf
            java.lang.Object r10 = r1.b(r9)
            xg.a r10 = (xg.a) r10
            if (r10 != 0) goto L1e
            goto Lab
        L1e:
            xg.l r11 = r10.f21590g
            r11.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = xg.l.f21630b
            java.lang.Object r12 = r12.get(r11)
            if (r12 == 0) goto L3a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = xg.l.f21631c
            int r12 = r12.get(r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = xg.l.f21632d
            int r11 = r13.get(r11)
            int r12 = r12 - r11
            int r12 = r12 + r4
            goto L47
        L3a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = xg.l.f21631c
            int r12 = r12.get(r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = xg.l.f21632d
            int r11 = r13.get(r11)
            int r12 = r12 - r11
        L47:
            xg.b r10 = r10.f21592i
            int r10 = r10.ordinal()
            if (r10 == 0) goto L95
            if (r10 == r4) goto L7e
            r11 = 2
            if (r10 == r11) goto L7b
            r11 = 3
            if (r10 == r11) goto L62
            r11 = 4
            if (r10 != r11) goto L5d
            int r8 = r8 + 1
            goto Lab
        L5d:
            okio.a.k()
            r0 = 0
            return r0
        L62:
            int r7 = r7 + 1
            if (r12 <= 0) goto Lab
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r11 = 100
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto Lab
        L7b:
            int r6 = r6 + 1
            goto Lab
        L7e:
            int r5 = r5 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r11 = 98
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto Lab
        L95:
            int r3 = r3 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r11 = 99
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
        Lab:
            int r9 = r9 + 1
            goto L12
        Laf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = xg.c.f21605o
            long r1 = r1.get(r14)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = r14.f21611j
            r4.append(r9)
            r9 = 64
            r4.append(r9)
            java.lang.String r9 = qg.v.j(r14)
            r4.append(r9)
            java.lang.String r9 = "[Pool Size {core = "
            r4.append(r9)
            int r9 = r14.f21608g
            r4.append(r9)
            java.lang.String r10 = ", max = "
            r4.append(r10)
            java.lang.String r10 = "}, Worker States {CPU = "
            java.lang.String r11 = ", blocking = "
            int r12 = r14.f21609h
            wb.en.p(r4, r12, r10, r3, r11)
            java.lang.String r3 = ", parked = "
            java.lang.String r10 = ", dormant = "
            wb.en.p(r4, r5, r3, r6, r10)
            java.lang.String r3 = ", terminated = "
            java.lang.String r5 = "}, running workers queues = "
            wb.en.p(r4, r7, r3, r8, r5)
            r4.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r4.append(r0)
            xg.f r0 = r14.f21612k
            int r0 = r0.c()
            r4.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r4.append(r0)
            xg.f r0 = r14.f21613l
            int r0 = r0.c()
            r4.append(r0)
            java.lang.String r0 = ", Control State {created workers= "
            r4.append(r0)
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r0 = (int) r5
            r4.append(r0)
            java.lang.String r0 = ", blocking tasks = "
            r4.append(r0)
            r5 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r1
            r0 = 21
            long r5 = r5 >> r0
            int r0 = (int) r5
            r4.append(r0)
            java.lang.String r0 = ", CPUs acquired = "
            r4.append(r0)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r1 & r5
            r2 = 42
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r9 = r9 - r0
            r4.append(r9)
            java.lang.String r0 = "}]"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
