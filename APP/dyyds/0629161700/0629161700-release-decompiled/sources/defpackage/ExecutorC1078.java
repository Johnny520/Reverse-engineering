package defpackage;

/* JADX INFO: renamed from: ᛶᛵᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1078 implements java.util.concurrent.Executor, java.io.Closeable {

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f4842 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f4843 = null;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final defpackage.C0454 f4844 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f4845 = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1139 f4846;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C2222 f4847;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final long f4848;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f4849;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4850;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.String f4851;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1139 f4852;

    static {
            java.lang.String r0 = "parkedWorkersStack$volatile"
            java.lang.Class<ᛶᛵᛸᲁ> r1 = defpackage.ExecutorC1078.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.ExecutorC1078.f4845 = r0
            java.lang.String r0 = "controlState$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            defpackage.ExecutorC1078.f4842 = r0
            java.lang.String r0 = "_isTerminated$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.ExecutorC1078.f4843 = r0
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "NOT_IN_STACK"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ExecutorC1078.f4844 = r0
            return
    }

    public ExecutorC1078(long r3, java.lang.String r5, int r6, int r7) {
            r2 = this;
            r2.<init>()
            r2.f4850 = r6
            r2.f4849 = r7
            r2.f4848 = r3
            r2.f4851 = r5
            r5 = 1
            r0 = 0
            if (r6 < r5) goto L6e
            java.lang.String r5 = "Max pool size "
            if (r7 < r6) goto L64
            r1 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r7 > r1) goto L5e
            r0 = 0
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L41
            ᛶᲀᛱᲀ r3 = new ᛶᲀᛱᲀ
            r3.<init>()
            r2.f4852 = r3
            ᛶᲀᛱᲀ r3 = new ᛶᲀᛱᲀ
            r3.<init>()
            r2.f4846 = r3
            ᲈᛴᛵᛷ r3 = new ᲈᛴᛵᛷ
            int r4 = r6 + 1
            int r4 = r4 * 2
            r3.<init>(r4)
            r2.f4847 = r3
            long r3 = (long) r6
            r5 = 42
            long r3 = r3 << r5
            r2.controlState$volatile = r3
            r3 = 0
            r2._isTerminated$volatile = r3
            return
        L41:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Idle worker keep alive time "
            r2.<init>(r5)
            r2.append(r3)
            java.lang.String r3 = " must be positive"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L5e:
            java.lang.String r2 = " should not exceed maximal supported number of threads 2097150"
            defpackage.C0086.m546(r5, r7, r2)
            throw r0
        L64:
            java.lang.String r2 = " should be greater than or equals to core pool size "
            java.lang.String r2 = defpackage.AbstractC1124.m2143(r7, r6, r5, r2)
            defpackage.C2264.m3678(r2)
            throw r0
        L6e:
            java.lang.String r2 = "Core pool size "
            java.lang.String r3 = " should be at least 1"
            defpackage.C0086.m546(r2, r6, r3)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ExecutorC1078.f4843
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.C2038
            r3 = 0
            if (r1 == 0) goto L17
            ᲇᛴᛷᛷ r0 = (defpackage.C2038) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1e
            ᛶᛵᛸᲁ r1 = r0.f8783
            if (r1 == r10) goto L1f
        L1e:
            r0 = r3
        L1f:
            ᲈᛴᛵᛷ r1 = r10.f4847
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.ExecutorC1078.f4842     // Catch: java.lang.Throwable -> Lbc
            long r4 = r4.get(r10)     // Catch: java.lang.Throwable -> Lbc
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L72
            r1 = r2
        L31:
            ᲈᛴᛵᛷ r5 = r10.f4847
            java.lang.Object r5 = r5.m3614(r1)
            ᲇᛴᛷᛷ r5 = (defpackage.C2038) r5
            if (r5 == r0) goto L6d
        L3b:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L4c
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L3b
        L4c:
            ᛲᛷᲇᛴ r5 = r5.f8782
            ᛶᲀᛱᲀ r6 = r10.f4846
            r5.getClass()
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569
            long r8 = defpackage.C0329.f1701
            java.lang.Object r7 = r7.getAndSetObject(r5, r8, r3)
            ᛷᛳᲇᛲ r7 = (defpackage.AbstractRunnableC1247) r7
            if (r7 == 0) goto L62
            r6.m1093(r7)
        L62:
            ᛷᛳᲇᛲ r7 = r5.m1001()
            if (r7 != 0) goto L69
            goto L6d
        L69:
            r6.m1093(r7)
            goto L62
        L6d:
            if (r1 == r4) goto L72
            int r1 = r1 + 1
            goto L31
        L72:
            ᛶᲀᛱᲀ r1 = r10.f4846
            r1.m1094()
            ᛶᲀᛱᲀ r1 = r10.f4852
            r1.m1094()
        L7c:
            if (r0 == 0) goto L84
            ᛷᛳᲇᛲ r1 = r0.m3428(r2)
            if (r1 != 0) goto Lab
        L84:
            ᛶᲀᛱᲀ r1 = r10.f4852
            java.lang.Object r1 = r1.m1091()
            ᛷᛳᲇᛲ r1 = (defpackage.AbstractRunnableC1247) r1
            if (r1 != 0) goto Lab
            ᛶᲀᛱᲀ r1 = r10.f4846
            java.lang.Object r1 = r1.m1091()
            ᛷᛳᲇᛲ r1 = (defpackage.AbstractRunnableC1247) r1
            if (r1 != 0) goto Lab
            if (r0 == 0) goto L9e
            r1 = 5
            r0.m3423(r1)
        L9e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC1078.f4845
            r1 = 0
            r0.set(r10, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC1078.f4842
            r0.set(r10, r1)
            return
        Lab:
            r1.run()     // Catch: java.lang.Throwable -> Laf
            goto L7c
        Laf:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7c
        Lbc:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.m2058(r2, r0)
            return
    }

    public final java.lang.String toString() {
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ᲈᛴᛵᛷ r1 = r15.f4847
            int r2 = r1.m3613()
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r4
        L12:
            if (r9 >= r2) goto L9b
            java.lang.Object r10 = r1.m3614(r9)
            ᲇᛴᛷᛷ r10 = (defpackage.C2038) r10
            if (r10 != 0) goto L1e
            goto L97
        L1e:
            ᛲᛷᲇᛴ r11 = r10.f8782
            r11.getClass()
            sun.misc.Unsafe r12 = defpackage.AbstractC0051.f569
            long r13 = defpackage.C0329.f1701
            java.lang.Object r12 = r12.getObjectVolatile(r11, r13)
            int r11 = r11.m1000()
            if (r12 == 0) goto L32
            int r11 = r11 + r4
        L32:
            int r10 = r10.f8780
            int r10 = defpackage.AbstractC0225.m812(r10)
            if (r10 == 0) goto L81
            if (r10 == r4) goto L6a
            r12 = 2
            if (r10 == r12) goto L67
            r12 = 3
            if (r10 == r12) goto L4e
            r11 = 4
            if (r10 != r11) goto L48
            int r8 = r8 + 1
            goto L97
        L48:
            ᛸᛵᛳᲀ r15 = new ᛸᛵᛳᲀ
            r15.<init>()
            throw r15
        L4e:
            int r7 = r7 + 1
            if (r11 <= 0) goto L97
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r11 = 100
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto L97
        L67:
            int r6 = r6 + 1
            goto L97
        L6a:
            int r5 = r5 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r11 = 98
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
            goto L97
        L81:
            int r3 = r3 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r11 = 99
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.add(r10)
        L97:
            int r9 = r9 + 1
            goto L12
        L9b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ExecutorC1078.f4842
            long r1 = r1.get(r15)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = r15.f4851
            r4.append(r9)
            r9 = 64
            r4.append(r9)
            java.lang.String r9 = defpackage.AbstractC0762.m1681(r15)
            r4.append(r9)
            java.lang.String r9 = "[Pool Size {core = "
            r4.append(r9)
            int r9 = r15.f4850
            r4.append(r9)
            java.lang.String r10 = ", max = "
            r4.append(r10)
            int r10 = r15.f4849
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
            ᛶᲀᛱᲀ r0 = r15.f4852
            int r0 = r0.m1092()
            r4.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r4.append(r0)
            ᛶᲀᛱᲀ r15 = r15.f4846
            int r15 = r15.m1092()
            r4.append(r15)
            java.lang.String r15 = ", Control State {created workers= "
            r4.append(r15)
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r15 = (int) r5
            r4.append(r15)
            java.lang.String r15 = ", blocking tasks = "
            r4.append(r15)
            r5 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r1
            r15 = 21
            long r5 = r5 >> r15
            int r15 = (int) r5
            r4.append(r15)
            java.lang.String r15 = ", CPUs acquired = "
            r4.append(r15)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r1 & r5
            r15 = 42
            long r0 = r0 >> r15
            int r15 = (int) r0
            int r9 = r9 - r15
            r4.append(r9)
            java.lang.String r15 = "}]"
            r4.append(r15)
            java.lang.String r15 = r4.toString()
            return r15
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m2054(long r4) {
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
            int r5 = r3.f4850
            if (r0 >= r5) goto L27
            int r0 = r3.m2057()
            r1 = 1
            if (r0 != r1) goto L24
            if (r5 <= r1) goto L24
            r3.m2057()
        L24:
            if (r0 <= 0) goto L27
            return r1
        L27:
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean m2055() {
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC1078.f4845
            long r2 = r0.get(r13)
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r2
            int r1 = (int) r4
            ᲈᛴᛵᛷ r4 = r13.f4847
            java.lang.Object r1 = r4.m3614(r1)
            r6 = r1
            ᲇᛴᛷᛷ r6 = (defpackage.C2038) r6
            r7 = -1
            r8 = 0
            if (r6 != 0) goto L1b
            r6 = 0
            r0 = r13
            goto L48
        L1b:
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r9 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r9
            java.lang.Object r1 = r6.m3427()
        L27:
            ᛳᛴᛵᛱ r9 = defpackage.ExecutorC1078.f4844
            if (r1 != r9) goto L2d
            r10 = r7
            goto L39
        L2d:
            if (r1 != 0) goto L31
            r10 = r8
            goto L39
        L31:
            ᲇᛴᛷᛷ r1 = (defpackage.C2038) r1
            int r10 = r1.m3429()
            if (r10 == 0) goto L5a
        L39:
            if (r10 < 0) goto L0
            long r10 = (long) r10
            long r4 = r4 | r10
            r1 = r13
            boolean r13 = r0.compareAndSet(r1, r2, r4)
            r0 = r1
            if (r13 == 0) goto L58
            r6.m3431(r9)
        L48:
            if (r6 != 0) goto L4b
            return r8
        L4b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.C2038.f8776
            boolean r13 = r13.compareAndSet(r6, r7, r8)
            if (r13 == 0) goto L58
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r13 = 1
            return r13
        L58:
            r13 = r0
            goto L0
        L5a:
            r12 = r0
            r0 = r13
            r13 = r12
            java.lang.Object r1 = r1.m3427()
            r12 = r0
            r0 = r13
            r13 = r12
            goto L27
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m2056(defpackage.C2038 r9, int r10, int r11) {
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC1078.f4845
            long r2 = r0.get(r8)
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r2
            int r1 = (int) r4
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            if (r1 != r10) goto L35
            if (r11 != 0) goto L34
            java.lang.Object r1 = r9.m3427()
        L1b:
            ᛳᛴᛵᛱ r6 = defpackage.ExecutorC1078.f4844
            if (r1 != r6) goto L21
            r1 = -1
            goto L35
        L21:
            if (r1 != 0) goto L25
            r1 = 0
            goto L35
        L25:
            ᲇᛴᛷᛷ r1 = (defpackage.C2038) r1
            int r6 = r1.m3429()
            if (r6 == 0) goto L2f
            r1 = r6
            goto L35
        L2f:
            java.lang.Object r1 = r1.m3427()
            goto L1b
        L34:
            r1 = r11
        L35:
            if (r1 < 0) goto L0
            long r6 = (long) r1
            long r4 = r4 | r6
            r1 = r8
            boolean r8 = r0.compareAndSet(r1, r2, r4)
            if (r8 == 0) goto L41
            return
        L41:
            r8 = r1
            goto L0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m2057() {
            r11 = this;
            ᲈᛴᛵᛷ r0 = r11.f4847
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.ExecutorC1078.f4843     // Catch: java.lang.Throwable -> L6d
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
            r11 = -1
            return r11
        L15:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ExecutorC1078.f4842     // Catch: java.lang.Throwable -> L6d
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
            int r5 = r11.f4850     // Catch: java.lang.Throwable -> L6d
            if (r4 < r5) goto L36
            monitor-exit(r0)
            return r3
        L36:
            int r5 = r11.f4849     // Catch: java.lang.Throwable -> L6d
            if (r8 < r5) goto L3c
            monitor-exit(r0)
            return r3
        L3c:
            long r8 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            long r8 = r8 & r6
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 + r2
            if (r3 <= 0) goto L6f
            ᲈᛴᛵᛷ r5 = r11.f4847     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r5.m3614(r3)     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L6f
            ᲇᛴᛷᛷ r5 = new ᲇᛴᛷᛷ     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r11, r3)     // Catch: java.lang.Throwable -> L6d
            ᲈᛴᛵᛷ r8 = r11.f4847     // Catch: java.lang.Throwable -> L6d
            r8.m3612(r3, r5)     // Catch: java.lang.Throwable -> L6d
            long r8 = r1.incrementAndGet(r11)     // Catch: java.lang.Throwable -> L6d
            long r6 = r6 & r8
            int r11 = (int) r6
            if (r3 != r11) goto L65
            int r4 = r4 + r2
            monitor-exit(r0)
            r5.start()
            return r4
        L65:
            java.lang.String r11 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L6d:
            r11 = move-exception
            goto L77
        L6f:
            java.lang.String r11 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L77:
            monitor-exit(r0)
            throw r11
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m2058(java.lang.Runnable r11, boolean r12) {
            r10 = this;
            ᲀᛴᛱᛱ r0 = defpackage.AbstractC1155.f5254
            r0.getClass()
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r11 instanceof defpackage.AbstractRunnableC1247
            if (r2 == 0) goto L14
            ᛷᛳᲇᛲ r11 = (defpackage.AbstractRunnableC1247) r11
            r11.f5577 = r0
            r11.f5576 = r12
            goto L1a
        L14:
            ᛷᛸᛸᲀ r2 = new ᛷᛸᛸᲀ
            r2.<init>(r11, r0, r12)
            r11 = r2
        L1a:
            boolean r12 = r11.f5576
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ExecutorC1078.f4842
            if (r12 == 0) goto L28
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r0.addAndGet(r10, r1)
            goto L2a
        L28:
            r1 = 0
        L2a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r4 = r3 instanceof defpackage.C2038
            r5 = 0
            if (r4 == 0) goto L36
            ᲇᛴᛷᛷ r3 = (defpackage.C2038) r3
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L3d
            ᛶᛵᛸᲁ r4 = r3.f8783
            if (r4 == r10) goto L3e
        L3d:
            r3 = r5
        L3e:
            if (r3 != 0) goto L41
            goto L95
        L41:
            int r4 = r3.f8780
            r6 = 5
            if (r4 != r6) goto L47
            goto L95
        L47:
            boolean r6 = r11.f5576
            if (r6 != 0) goto L4f
            r6 = 2
            if (r4 != r6) goto L4f
            goto L95
        L4f:
            r4 = 1
            r3.f8779 = r4
            ᛲᛷᲇᛴ r3 = r3.f8782
            r3.getClass()
            sun.misc.Unsafe r4 = defpackage.AbstractC0051.f569
            long r6 = defpackage.C0329.f1701
            java.lang.Object r11 = r4.getAndSetObject(r3, r6, r11)
            ᛷᛳᲇᛲ r11 = (defpackage.AbstractRunnableC1247) r11
            if (r11 != 0) goto L65
        L63:
            r11 = r5
            goto L95
        L65:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r3.f1703
            int r6 = r3.m1000()
            r7 = 127(0x7f, float:1.78E-43)
            if (r6 != r7) goto L70
            goto L95
        L70:
            boolean r6 = r11.f5576
            if (r6 == 0) goto L79
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.C0329.f1699
            r6.incrementAndGet(r3)
        L79:
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569
            long r8 = defpackage.C0329.f1702
            int r6 = r6.getIntVolatile(r3, r8)
            r6 = r6 & r7
        L82:
            java.lang.Object r7 = r4.get(r6)
            if (r7 == 0) goto L8c
            java.lang.Thread.yield()
            goto L82
        L8c:
            r4.lazySet(r6, r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = defpackage.C0329.f1700
            r11.incrementAndGet(r3)
            goto L63
        L95:
            if (r11 == 0) goto Lc4
            boolean r3 = r11.f5576
            if (r3 == 0) goto La2
            ᛶᲀᛱᲀ r3 = r10.f4846
            boolean r11 = r3.m1093(r11)
            goto La8
        La2:
            ᛶᲀᛱᲀ r3 = r10.f4852
            boolean r11 = r3.m1093(r11)
        La8:
            if (r11 == 0) goto Lab
            goto Lc4
        Lab:
            java.util.concurrent.RejectedExecutionException r11 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r10 = r10.f4851
            r12.append(r10)
            java.lang.String r10 = " was terminated"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        Lc4:
            if (r12 == 0) goto Ld8
            boolean r11 = r10.m2055()
            if (r11 == 0) goto Lcd
            goto Le9
        Lcd:
            boolean r11 = r10.m2054(r1)
            if (r11 == 0) goto Ld4
            goto Le9
        Ld4:
            r10.m2055()
            return
        Ld8:
            boolean r11 = r10.m2055()
            if (r11 == 0) goto Ldf
            goto Le9
        Ldf:
            long r11 = r0.get(r10)
            boolean r11 = r10.m2054(r11)
            if (r11 == 0) goto Lea
        Le9:
            return
        Lea:
            r10.m2055()
            return
    }
}
