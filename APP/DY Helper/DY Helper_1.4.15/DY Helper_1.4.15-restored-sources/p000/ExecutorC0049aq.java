package p000;

/* JADX INFO: renamed from: aq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0049aq implements java.util.concurrent.Executor, java.io.Closeable {

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f1273 = null;

    /* JADX INFO: renamed from: ν */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f1274 = null;

    /* JADX INFO: renamed from: ξ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f1275 = null;

    /* JADX INFO: renamed from: ο */
    public static final p000.C0889uy f1276 = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ε */
    public final int f1277;

    /* JADX INFO: renamed from: ζ */
    public final int f1278;

    /* JADX INFO: renamed from: η */
    public final long f1279;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f1280;

    /* JADX INFO: renamed from: ι */
    public final p000.ra0 f1281;

    /* JADX INFO: renamed from: κ */
    public final p000.ra0 f1282;

    /* JADX INFO: renamed from: λ */
    public final p000.pn1 f1283;

    static {
            java.lang.String r0 = "parkedWorkersStack$volatile"
            java.lang.Class<aq> r1 = p000.ExecutorC0049aq.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.ExecutorC0049aq.f1273 = r0
            java.lang.String r0 = "controlState$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            p000.ExecutorC0049aq.f1274 = r0
            java.lang.String r0 = "_isTerminated$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            p000.ExecutorC0049aq.f1275 = r0
            uy r0 = new uy
            java.lang.String r1 = "NOT_IN_STACK"
            r2 = 1
            r0.<init>(r1, r2)
            p000.ExecutorC0049aq.f1276 = r0
            return
    }

    public ExecutorC0049aq(int r3, int r4, long r5, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.f1277 = r3
            r2.f1278 = r4
            r2.f1279 = r5
            r2.f1280 = r7
            r7 = 1
            if (r3 < r7) goto L73
            java.lang.String r7 = "Max pool size "
            if (r4 < r3) goto L68
            r0 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r4 > r0) goto L5d
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L40
            ra0 r4 = new ra0
            r4.<init>()
            r2.f1281 = r4
            ra0 r4 = new ra0
            r4.<init>()
            r2.f1282 = r4
            pn1 r4 = new pn1
            int r5 = r3 + 1
            int r5 = r5 * 2
            r4.<init>(r5)
            r2.f1283 = r4
            long r3 = (long) r3
            r5 = 42
            long r3 = r3 << r5
            r2.controlState$volatile = r3
            r3 = 0
            r2._isTerminated$volatile = r3
            return
        L40:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Idle worker keep alive time "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " must be positive"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L5d:
            java.lang.String r2 = " should not exceed maximal supported number of threads 2097150"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r7, r4, r2)
            p000.C1080.m7266(r2)
            r2 = 0
            throw r2
        L68:
            java.lang.String r2 = " should be greater than or equals to core pool size "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r4, r3, r7, r2)
            p000.C1080.m7266(r2)
            r2 = 0
            throw r2
        L73:
            java.lang.String r2 = "Core pool size "
            java.lang.String r4 = " should be at least 1"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r2, r3, r4)
            p000.C1080.m7266(r2)
            r2 = 0
            throw r2
    }

    /* JADX INFO: renamed from: θ */
    public static /* synthetic */ void m573(p000.ExecutorC0049aq r1, java.lang.Runnable r2, int r3) {
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = 1
        L8:
            r1.m575(r2, r0, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ExecutorC0049aq.f1275
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p000.C1029yp
            r3 = 0
            if (r1 == 0) goto L17
            yp r0 = (p000.C1029yp) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            aq r1 = r0.f12720
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            pn1 r1 = r8.f1283
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.ExecutorC0049aq.f1274     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            pn1 r5 = r8.f1283
            java.lang.Object r5 = r5.m4557(r1)
            r5.getClass()
            yp r5 = (p000.C1029yp) r5
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
            fd2 r5 = r5.f12713
            ra0 r6 = r8.f1282
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.fd2.f3901
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            u22 r7 = (p000.u22) r7
            if (r7 == 0) goto L68
            r6.m2326(r7)
        L68:
            u22 r7 = r5.m2100()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.m2326(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            ra0 r1 = r8.f1282
            r1.m2327()
            ra0 r1 = r8.f1281
            r1.m2327()
        L82:
            if (r0 == 0) goto L8a
            u22 r1 = r0.m6957(r2)
            if (r1 != 0) goto Lb2
        L8a:
            ra0 r1 = r8.f1281
            java.lang.Object r1 = r1.m2329()
            u22 r1 = (p000.u22) r1
            if (r1 != 0) goto Lb2
            ra0 r1 = r8.f1282
            java.lang.Object r1 = r1.m2329()
            u22 r1 = (p000.u22) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            zp r1 = p000.EnumC1066zp.f13236
            r0.m6964(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1273
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1274
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
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            r0 = 6
            m573(r1, r2, r0)
            return
    }

    public final java.lang.String toString() {
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            pn1 r1 = r14.f1283
            int r2 = r1.m4556()
            r3 = 0
            r4 = 1
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r4
        L12:
            if (r9 >= r2) goto Laf
            java.lang.Object r10 = r1.m4557(r9)
            yp r10 = (p000.C1029yp) r10
            if (r10 != 0) goto L1e
            goto Lab
        L1e:
            fd2 r11 = r10.f12713
            r11.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p000.fd2.f3901
            java.lang.Object r12 = r12.get(r11)
            if (r12 == 0) goto L3a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = p000.fd2.f3902
            int r12 = r12.get(r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = p000.fd2.f3903
            int r11 = r13.get(r11)
            int r12 = r12 - r11
            int r12 = r12 + r4
            goto L47
        L3a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = p000.fd2.f3902
            int r12 = r12.get(r11)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = p000.fd2.f3903
            int r11 = r13.get(r11)
            int r12 = r12 - r11
        L47:
            zp r10 = r10.f12715
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
            p000.C1080.m7272()
            r14 = 0
            return r14
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0049aq.f1274
            long r1 = r1.get(r14)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = r14.f1280
            r4.append(r9)
            r9 = 64
            r4.append(r9)
            java.lang.String r9 = p000.AbstractC1021yh.m6855(r14)
            r4.append(r9)
            java.lang.String r9 = "[Pool Size {core = "
            r4.append(r9)
            int r9 = r14.f1277
            r4.append(r9)
            java.lang.String r10 = ", max = "
            r4.append(r10)
            java.lang.String r10 = "}, Worker States {CPU = "
            java.lang.String r11 = ", blocking = "
            int r12 = r14.f1278
            p000.AbstractC0602nx.m4117(r4, r12, r10, r3, r11)
            java.lang.String r3 = ", parked = "
            java.lang.String r10 = ", dormant = "
            p000.AbstractC0602nx.m4117(r4, r5, r3, r6, r10)
            java.lang.String r3 = ", terminated = "
            java.lang.String r5 = "}, running workers queues = "
            p000.AbstractC0602nx.m4117(r4, r7, r3, r8, r5)
            r4.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r4.append(r0)
            ra0 r0 = r14.f1281
            int r0 = r0.m2328()
            r4.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r4.append(r0)
            ra0 r14 = r14.f1282
            int r14 = r14.m2328()
            r4.append(r14)
            java.lang.String r14 = ", Control State {created workers= "
            r4.append(r14)
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r14 = (int) r5
            r4.append(r14)
            java.lang.String r14 = ", blocking tasks = "
            r4.append(r14)
            r5 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r1
            r14 = 21
            long r5 = r5 >> r14
            int r14 = (int) r5
            r4.append(r14)
            java.lang.String r14 = ", CPUs acquired = "
            r4.append(r14)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r1 & r5
            r14 = 42
            long r0 = r0 >> r14
            int r14 = (int) r0
            int r9 = r9 - r14
            r4.append(r9)
            java.lang.String r14 = "}]"
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            return r14
    }

    /* JADX INFO: renamed from: δ */
    public final int m574() {
            r11 = this;
            pn1 r0 = r11.f1283
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.ExecutorC0049aq.f1275     // Catch: java.lang.Throwable -> L6d
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0049aq.f1274     // Catch: java.lang.Throwable -> L6d
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
            int r5 = r11.f1277     // Catch: java.lang.Throwable -> L6d
            if (r4 < r5) goto L36
            monitor-exit(r0)
            return r3
        L36:
            int r5 = r11.f1278     // Catch: java.lang.Throwable -> L6d
            if (r8 < r5) goto L3c
            monitor-exit(r0)
            return r3
        L3c:
            long r8 = r1.get(r11)     // Catch: java.lang.Throwable -> L6d
            long r8 = r8 & r6
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L6d
            int r3 = r3 + r2
            if (r3 <= 0) goto L6f
            pn1 r5 = r11.f1283     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r5 = r5.m4557(r3)     // Catch: java.lang.Throwable -> L6d
            if (r5 != 0) goto L6f
            yp r5 = new yp     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r11, r3)     // Catch: java.lang.Throwable -> L6d
            pn1 r8 = r11.f1283     // Catch: java.lang.Throwable -> L6d
            r8.m4558(r3, r5)     // Catch: java.lang.Throwable -> L6d
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

    /* JADX INFO: renamed from: η */
    public final void m575(java.lang.Runnable r9, boolean r10, boolean r11) {
            r8 = this;
            xn0 r0 = p000.y22.f12434
            r0.getClass()
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r9 instanceof p000.u22
            if (r2 == 0) goto L14
            u22 r9 = (p000.u22) r9
            r9.f10574 = r0
            r9.f10575 = r10
            goto L1a
        L14:
            v22 r2 = new v22
            r2.<init>(r9, r0, r10)
            r9 = r2
        L1a:
            boolean r10 = r9.f10575
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1274
            if (r10 == 0) goto L28
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r0.addAndGet(r8, r1)
            goto L2a
        L28:
            r1 = 0
        L2a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r4 = r3 instanceof p000.C1029yp
            r5 = 0
            if (r4 == 0) goto L36
            yp r3 = (p000.C1029yp) r3
            goto L37
        L36:
            r3 = r5
        L37:
            if (r3 == 0) goto L42
            aq r4 = r3.f12720
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
            zp r6 = r3.f12715
            zp r7 = p000.EnumC1066zp.f13236
            if (r6 != r7) goto L4e
            goto L75
        L4e:
            boolean r7 = r9.f10575
            if (r7 != 0) goto L57
            zp r7 = p000.EnumC1066zp.f13233
            if (r6 != r7) goto L57
            goto L75
        L57:
            r3.f12719 = r4
            fd2 r6 = r3.f12713
            if (r11 == 0) goto L62
            u22 r9 = r6.m2099(r9)
            goto L75
        L62:
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.fd2.f3901
            java.lang.Object r9 = r7.getAndSet(r6, r9)
            u22 r9 = (p000.u22) r9
            if (r9 != 0) goto L71
            r9 = r5
            goto L75
        L71:
            u22 r9 = r6.m2099(r9)
        L75:
            if (r9 == 0) goto L9e
            boolean r5 = r9.f10575
            if (r5 == 0) goto L82
            ra0 r5 = r8.f1282
            boolean r9 = r5.m2326(r9)
            goto L88
        L82:
            ra0 r5 = r8.f1281
            boolean r9 = r5.m2326(r9)
        L88:
            if (r9 == 0) goto L8b
            goto L9e
        L8b:
            java.util.concurrent.RejectedExecutionException r9 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r8 = r8.f1280
            java.lang.String r11 = " was terminated"
            java.lang.String r8 = p000.lz1.m3691(r10, r8, r11)
            r9.<init>(r8)
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
            boolean r9 = r8.m578()
            if (r9 == 0) goto Lb0
            goto Lcf
        Lb0:
            boolean r9 = r8.m577(r1)
            if (r9 == 0) goto Lb7
            goto Lcf
        Lb7:
            r8.m578()
            return
        Lbb:
            if (r4 == 0) goto Lbe
            goto Lcf
        Lbe:
            boolean r9 = r8.m578()
            if (r9 == 0) goto Lc5
            goto Lcf
        Lc5:
            long r9 = r0.get(r8)
            boolean r9 = r8.m577(r9)
            if (r9 == 0) goto Ld0
        Lcf:
            return
        Ld0:
            r8.m578()
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m576(p000.C1029yp r8, int r9, int r10) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1273
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
            java.lang.Object r0 = r8.m6959()
        L1b:
            uy r5 = p000.ExecutorC0049aq.f1276
            if (r0 != r5) goto L21
            r0 = -1
            goto L35
        L21:
            if (r0 != 0) goto L25
            r0 = 0
            goto L35
        L25:
            yp r0 = (p000.C1029yp) r0
            int r5 = r0.m6958()
            if (r5 == 0) goto L2f
            r0 = r5
            goto L35
        L2f:
            java.lang.Object r0 = r0.m6959()
            goto L1b
        L34:
            r0 = r10
        L35:
            if (r0 < 0) goto L0
            long r5 = (long) r0
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0049aq.f1273
            r2 = r7
            boolean r7 = r1.compareAndSet(r2, r3, r5)
            if (r7 == 0) goto L43
            return
        L43:
            r7 = r2
            goto L0
    }

    /* JADX INFO: renamed from: λ */
    public final boolean m577(long r4) {
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
            int r5 = r3.f1277
            if (r0 >= r5) goto L27
            int r0 = r3.m574()
            r1 = 1
            if (r0 != r1) goto L24
            if (r5 <= r1) goto L24
            r3.m574()
        L24:
            if (r0 <= 0) goto L27
            return r1
        L27:
            return r4
    }

    /* JADX INFO: renamed from: ξ */
    public final boolean m578() {
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1273
            long r3 = r0.get(r11)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r3
            int r0 = (int) r0
            pn1 r1 = r11.f1283
            java.lang.Object r0 = r1.m4557(r0)
            yp r0 = (p000.C1029yp) r0
            r7 = -1
            r8 = 0
            if (r0 != 0) goto L1a
            r0 = 0
            r3 = r11
            goto L49
        L1a:
            r1 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            java.lang.Object r5 = r0.m6959()
        L26:
            uy r9 = p000.ExecutorC0049aq.f1276
            if (r5 != r9) goto L2c
            r6 = r7
            goto L38
        L2c:
            if (r5 != 0) goto L30
            r6 = r8
            goto L38
        L30:
            yp r5 = (p000.C1029yp) r5
            int r6 = r5.m6958()
            if (r6 == 0) goto L5b
        L38:
            if (r6 < 0) goto L0
            long r5 = (long) r6
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0049aq.f1273
            r2 = r11
            boolean r11 = r1.compareAndSet(r2, r3, r5)
            r3 = r2
            if (r11 == 0) goto L59
            r0.m6963(r9)
        L49:
            if (r0 != 0) goto L4c
            return r8
        L4c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = p000.C1029yp.f12712
            boolean r11 = r11.compareAndSet(r0, r7, r8)
            if (r11 == 0) goto L59
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r11 = 1
            return r11
        L59:
            r11 = r3
            goto L0
        L5b:
            r9 = r3
            r3 = r11
            java.lang.Object r5 = r5.m6959()
            r3 = r9
            goto L26
    }
}
