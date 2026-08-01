package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne implements java.util.concurrent.Executor, java.io.Closeable {
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater h = null;
    public static final java.util.concurrent.atomic.AtomicLongFieldUpdater i = null;
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater j = null;
    public static final defpackage.l0 k = null;
    private volatile int _isTerminated;
    public final int a;
    public final int b;
    public final long c;
    private volatile long controlState;
    public final java.lang.String d;
    public final defpackage.bo e;
    public final defpackage.bo f;
    public final defpackage.t00 g;
    private volatile long parkedWorkersStack;

    static {
            java.lang.String r0 = "parkedWorkersStack"
            java.lang.Class<ne> r1 = defpackage.ne.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.ne.h = r0
            java.lang.String r0 = "controlState"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.ne.i = r0
            java.lang.String r0 = "_isTerminated"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.ne.j = r0
            l0 r0 = new l0
            java.lang.String r1 = "NOT_IN_STACK"
            r2 = 27
            r0.<init>(r2, r1)
            defpackage.ne.k = r0
            return
    }

    public ne(int r3, int r4, long r5, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r7
            r7 = 1
            if (r3 < r7) goto L96
            java.lang.String r7 = "Max pool size "
            if (r4 < r3) goto L78
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r4 > r0) goto L5d
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L40
            bo r4 = new bo
            r4.<init>()
            r2.e = r4
            bo r4 = new bo
            r4.<init>()
            r2.f = r4
            t00 r4 = new t00
            int r5 = r3 + 1
            int r5 = r5 * 2
            r4.<init>(r5)
            r2.g = r4
            long r3 = (long) r3
            r5 = 42
            long r3 = r3 << r5
            r2.controlState = r3
            r3 = 0
            r2._isTerminated = r3
            return
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Idle worker keep alive time "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = " must be positive"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L5d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r4)
            java.lang.String r4 = " should not exceed maximal supported number of threads 2097150"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L78:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = " should be greater than or equals to core pool size "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L96:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Core pool size "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " should be at least 1"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public final int a() {
            r11 = this;
            t00 r0 = r11.g
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ne.j     // Catch: java.lang.Throwable -> L6d
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ne.i     // Catch: java.lang.Throwable -> L6d
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
            int r5 = r11.a     // Catch: java.lang.Throwable -> L6d
            if (r4 < r5) goto L36
            monitor-exit(r0)
            return r3
        L36:
            int r5 = r11.b     // Catch: java.lang.Throwable -> L6d
            if (r8 < r5) goto L3c
            monitor-exit(r0)
            return r3
        L3c:
            long r8 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            long r8 = r8 & r6
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 + r2
            if (r3 <= 0) goto L6f
            t00 r5 = r11.g     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r5.b(r3)     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L6f
            me r5 = new me     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r11, r3)     // Catch: java.lang.Throwable -> L6d
            t00 r8 = r11.g     // Catch: java.lang.Throwable -> L6d
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

    public final void b(java.lang.Runnable r11, defpackage.v50 r12) {
            r10 = this;
            vh r0 = defpackage.x50.f
            r0.getClass()
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r11 instanceof defpackage.u50
            if (r2 == 0) goto L14
            u50 r11 = (defpackage.u50) r11
            r11.a = r0
            r11.b = r12
            goto L1a
        L14:
            w50 r2 = new w50
            r2.<init>(r11, r0, r12)
            r11 = r2
        L1a:
            v50 r12 = r11.b
            int r12 = r12.a
            r0 = 1
            if (r12 != r0) goto L23
            r12 = r0
            goto L24
        L23:
            r12 = 0
        L24:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ne.i
            if (r12 == 0) goto L30
            r2 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r1.addAndGet(r10, r2)
            goto L32
        L30:
            r2 = 0
        L32:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r5 = r4 instanceof defpackage.me
            r6 = 0
            if (r5 == 0) goto L3e
            me r4 = (defpackage.me) r4
            goto L3f
        L3e:
            r4 = r6
        L3f:
            if (r4 == 0) goto L4a
            ne r5 = r4.h
            boolean r5 = defpackage.ip.i(r5, r10)
            if (r5 == 0) goto L4a
            goto L4b
        L4a:
            r4 = r6
        L4b:
            if (r4 != 0) goto L4e
            goto La7
        L4e:
            int r5 = r4.c
            r7 = 5
            if (r5 != r7) goto L54
            goto La7
        L54:
            v50 r7 = r11.b
            int r7 = r7.a
            if (r7 != 0) goto L5e
            r7 = 2
            if (r5 != r7) goto L5e
            goto La7
        L5e:
            r4.g = r0
            zc0 r4 = r4.a
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.zc0.b
            java.lang.Object r11 = r5.getAndSet(r4, r11)
            u50 r11 = (defpackage.u50) r11
            if (r11 != 0) goto L71
            r11 = r6
            goto La7
        L71:
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r4.a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.zc0.c
            int r7 = r6.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.zc0.d
            int r8 = r8.get(r4)
            int r7 = r7 - r8
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 != r8) goto L85
            goto La7
        L85:
            v50 r7 = r11.b
            int r7 = r7.a
            r9 = 1
            if (r7 != r9) goto L91
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.zc0.e
            r7.incrementAndGet(r4)
        L91:
            int r7 = r6.get(r4)
            r7 = r7 & r8
        L96:
            java.lang.Object r8 = r5.get(r7)
            if (r8 == 0) goto La0
            java.lang.Thread.yield()
            goto L96
        La0:
            r5.lazySet(r7, r11)
            r6.incrementAndGet(r4)
            r11 = 0
        La7:
            if (r11 == 0) goto Ld2
            v50 r4 = r11.b
            int r4 = r4.a
            if (r4 != r0) goto Lb6
            bo r0 = r10.f
            boolean r11 = r0.a(r11)
            goto Lbc
        Lb6:
            bo r0 = r10.e
            boolean r11 = r0.a(r11)
        Lbc:
            if (r11 == 0) goto Lbf
            goto Ld2
        Lbf:
            java.util.concurrent.RejectedExecutionException r11 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r10.d
            java.lang.String r1 = " was terminated"
            java.lang.String r12 = defpackage.z30.l(r12, r0, r1)
            r11.<init>(r12)
            throw r11
        Ld2:
            if (r12 == 0) goto Le6
            boolean r11 = r10.e()
            if (r11 == 0) goto Ldb
            goto Lf7
        Ldb:
            boolean r11 = r10.d(r2)
            if (r11 == 0) goto Le2
            goto Lf7
        Le2:
            r10.e()
            return
        Le6:
            boolean r11 = r10.e()
            if (r11 == 0) goto Led
            goto Lf7
        Led:
            long r11 = r1.get(r10)
            boolean r11 = r10.d(r11)
            if (r11 == 0) goto Lf8
        Lf7:
            return
        Lf8:
            r10.e()
            return
    }

    public final void c(defpackage.me r8, int r9, int r10) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.h
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
            l0 r5 = defpackage.ne.k
            if (r0 != r5) goto L21
            r0 = -1
            goto L35
        L21:
            if (r0 != 0) goto L25
            r0 = 0
            goto L35
        L25:
            me r0 = (defpackage.me) r0
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ne.h
            r2 = r7
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ne.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.me
            r3 = 0
            if (r1 == 0) goto L17
            me r0 = (defpackage.me) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            ne r1 = r0.h
            boolean r1 = defpackage.ip.i(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            t00 r1 = r8.g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.ne.i     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L36:
            t00 r5 = r8.g
            java.lang.Object r5 = r5.b(r1)
            defpackage.ip.l(r5)
            me r5 = (defpackage.me) r5
            if (r5 == r0) goto L71
        L43:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L52:
            zc0 r5 = r5.a
            bo r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.zc0.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            u50 r7 = (defpackage.u50) r7
            if (r7 == 0) goto L66
            r6.a(r7)
        L66:
            u50 r7 = r5.a()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.a(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L36
        L76:
            bo r1 = r8.f
            r1.b()
            bo r1 = r8.e
            r1.b()
        L80:
            if (r0 == 0) goto L88
            u50 r1 = r0.a(r2)
            if (r1 != 0) goto Laf
        L88:
            bo r1 = r8.e
            java.lang.Object r1 = r1.d()
            u50 r1 = (defpackage.u50) r1
            if (r1 != 0) goto Laf
            bo r1 = r8.f
            java.lang.Object r1 = r1.d()
            u50 r1 = (defpackage.u50) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.i
            r0.set(r8, r1)
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L80
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean d(long r4) {
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
            int r5 = r3.a
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

    public final boolean e() {
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.h
            long r3 = r0.get(r10)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r3
            int r0 = (int) r0
            t00 r1 = r10.g
            java.lang.Object r0 = r1.b(r0)
            me r0 = (defpackage.me) r0
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
            l0 r9 = defpackage.ne.k
            if (r5 != r9) goto L2b
            r6 = r7
            goto L37
        L2b:
            if (r5 != 0) goto L2f
            r6 = r8
            goto L37
        L2f:
            me r5 = (defpackage.me) r5
            int r6 = r5.b()
            if (r6 == 0) goto L57
        L37:
            if (r6 < 0) goto L0
            long r5 = (long) r6
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ne.h
            r2 = r10
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L0
            r0.g(r9)
        L47:
            if (r0 != 0) goto L4a
            return r8
        L4a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.me.i
            boolean r1 = r1.compareAndSet(r0, r7, r8)
            if (r1 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r0 = 1
            return r0
        L57:
            java.lang.Object r5 = r5.c()
            goto L25
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            v50 r0 = defpackage.x50.g
            r1.b(r2, r0)
            return
    }

    public final java.lang.String toString() {
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            t00 r1 = r14.g
            int r2 = r1.a()
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r4
        L12:
            if (r9 >= r2) goto Lab
            java.lang.Object r10 = r1.b(r9)
            me r10 = (defpackage.me) r10
            if (r10 != 0) goto L1e
            goto La7
        L1e:
            zc0 r11 = r10.a
            r11.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.zc0.b
            java.lang.Object r12 = r12.get(r11)
            if (r12 == 0) goto L3a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = defpackage.zc0.c
            int r12 = r12.get(r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.zc0.d
            int r11 = r13.get(r11)
            int r12 = r12 - r11
            int r12 = r12 + r4
            goto L47
        L3a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = defpackage.zc0.c
            int r12 = r12.get(r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.zc0.d
            int r11 = r13.get(r11)
            int r12 = r12 - r11
        L47:
            int r10 = r10.c
            int r10 = defpackage.z30.t(r10)
            if (r10 == 0) goto L91
            if (r10 == r4) goto L7a
            r11 = 2
            if (r10 == r11) goto L77
            r11 = 3
            if (r10 == r11) goto L5e
            r11 = 4
            if (r10 == r11) goto L5b
            goto La7
        L5b:
            int r8 = r8 + 1
            goto La7
        L5e:
            int r7 = r7 + 1
            if (r12 <= 0) goto La7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r11 = 100
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto La7
        L77:
            int r6 = r6 + 1
            goto La7
        L7a:
            int r5 = r5 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r11 = 98
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto La7
        L91:
            int r3 = r3 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r11 = 99
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
        La7:
            int r9 = r9 + 1
            goto L12
        Lab:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ne.i
            long r1 = r1.get(r14)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = r14.d
            r4.append(r9)
            r9 = 64
            r4.append(r9)
            java.lang.String r9 = defpackage.ff.s(r14)
            r4.append(r9)
            java.lang.String r9 = "[Pool Size {core = "
            r4.append(r9)
            int r9 = r14.a
            r4.append(r9)
            java.lang.String r10 = ", max = "
            r4.append(r10)
            int r10 = r14.b
            r4.append(r10)
            java.lang.String r10 = "}, Worker States {CPU = "
            r4.append(r10)
            r4.append(r3)
            java.lang.String r3 = ", blocking = "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = ", parked = "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = ", dormant = "
            r4.append(r3)
            r4.append(r7)
            java.lang.String r3 = ", terminated = "
            r4.append(r3)
            r4.append(r8)
            java.lang.String r3 = "}, running workers queues = "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r4.append(r0)
            bo r0 = r14.e
            int r0 = r0.c()
            r4.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r4.append(r0)
            bo r0 = r14.f
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
