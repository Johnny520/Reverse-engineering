package p000;

/* JADX INFO: renamed from: yp */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1029yp extends java.lang.Thread {

    /* JADX INFO: renamed from: ν */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f12712 = null;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: ε */
    public final p000.fd2 f12713;

    /* JADX INFO: renamed from: ζ */
    public final p000.um1 f12714;

    /* JADX INFO: renamed from: η */
    public p000.EnumC1066zp f12715;

    /* JADX INFO: renamed from: θ */
    public long f12716;

    /* JADX INFO: renamed from: ι */
    public long f12717;

    /* JADX INFO: renamed from: κ */
    public int f12718;

    /* JADX INFO: renamed from: λ */
    public boolean f12719;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.ExecutorC0049aq f12720;

    static {
            java.lang.Class<yp> r0 = p000.C1029yp.class
            java.lang.String r1 = "workerCtl$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p000.C1029yp.f12712 = r0
            return
    }

    public C1029yp(p000.ExecutorC0049aq r3, int r4) {
            r2 = this;
            r2.f12720 = r3
            r2.<init>()
            r3 = 1
            r2.setDaemon(r3)
            java.lang.Class<aq> r3 = p000.ExecutorC0049aq.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setContextClassLoader(r3)
            fd2 r3 = new fd2
            r3.<init>()
            r2.f12713 = r3
            um1 r3 = new um1
            r3.<init>()
            r2.f12714 = r3
            zp r3 = p000.EnumC1066zp.f13235
            r2.f12715 = r3
            uy r3 = p000.ExecutorC0049aq.f1276
            r2.nextParkedWorker = r3
            long r0 = java.lang.System.nanoTime()
            int r3 = (int) r0
            if (r3 == 0) goto L30
            goto L32
        L30:
            r3 = 42
        L32:
            r2.f12718 = r3
            r2.m6962(r4)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r23 = this;
            r1 = r23
            r2 = 0
        L3:
            r0 = r2
        L4:
            aq r3 = r1.f12720
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = p000.ExecutorC0049aq.f1275
            int r3 = r4.get(r3)
            if (r3 == 0) goto L10
            goto L19b
        L10:
            zp r3 = r1.f12715
            zp r4 = p000.EnumC1066zp.f13236
            if (r3 == r4) goto L19b
            boolean r3 = r1.f12719
            u22 r3 = r1.m6957(r3)
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            r7 = 0
            if (r3 == 0) goto L86
            r1.f12717 = r7
            aq r9 = r1.f12720
            r1.f12716 = r7
            zp r0 = r1.f12715
            zp r7 = p000.EnumC1066zp.f13234
            if (r0 != r7) goto L33
            zp r0 = p000.EnumC1066zp.f13233
            r1.f12715 = r0
        L33:
            boolean r0 = r3.f10575
            if (r0 == 0) goto L74
            zp r0 = p000.EnumC1066zp.f13233
            boolean r0 = r1.m6964(r0)
            if (r0 == 0) goto L56
            boolean r0 = r9.m578()
            if (r0 == 0) goto L46
            goto L56
        L46:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1274
            long r7 = r0.get(r9)
            boolean r0 = r9.m577(r7)
            if (r0 == 0) goto L53
            goto L56
        L53:
            r9.m578()
        L56:
            r3.run()     // Catch: java.lang.Throwable -> L5a
            goto L66
        L5a:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r7 = r3.getUncaughtExceptionHandler()
            r7.uncaughtException(r3, r0)
        L66:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1274
            r0.addAndGet(r9, r5)
            zp r0 = r1.f12715
            if (r0 == r4) goto L3
            zp r0 = p000.EnumC1066zp.f13235
            r1.f12715 = r0
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
            r1.f12719 = r2
            long r3 = r1.f12717
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto La5
            if (r0 != 0) goto L94
            r0 = r4
            goto L4
        L94:
            zp r0 = p000.EnumC1066zp.f13234
            r1.m6964(r0)
            java.lang.Thread.interrupted()
            long r3 = r1.f12717
            java.util.concurrent.locks.LockSupport.parkNanos(r3)
            r1.f12717 = r7
            goto L3
        La5:
            java.lang.Object r3 = r1.nextParkedWorker
            uy r9 = p000.ExecutorC0049aq.f1276
            if (r3 == r9) goto L165
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.C1029yp.f12712
            r5 = -1
            r3.set(r1, r5)
        Lb1:
            java.lang.Object r3 = r1.nextParkedWorker
            uy r6 = p000.ExecutorC0049aq.f1276
            if (r3 == r6) goto L4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.C1029yp.f12712
            int r6 = r3.get(r1)
            if (r6 != r5) goto L4
            aq r6 = r1.f12720
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = p000.ExecutorC0049aq.f1275
            int r6 = r9.get(r6)
            if (r6 == 0) goto Lcb
            goto L4
        Lcb:
            zp r6 = r1.f12715
            zp r12 = p000.EnumC1066zp.f13236
            if (r6 != r12) goto Ld3
            goto L4
        Ld3:
            zp r6 = p000.EnumC1066zp.f13234
            r1.m6964(r6)
            java.lang.Thread.interrupted()
            long r13 = r1.f12716
            int r6 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r6 != 0) goto Lf0
            long r13 = java.lang.System.nanoTime()
            aq r6 = r1.f12720
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
            long r10 = r6.f1279
            long r13 = r13 + r10
            r1.f12716 = r13
            goto Lf3
        Lf0:
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
        Lf3:
            aq r6 = r1.f12720
            long r10 = r6.f1279
            java.util.concurrent.locks.LockSupport.parkNanos(r10)
            long r10 = java.lang.System.nanoTime()
            long r13 = r1.f12716
            long r10 = r10 - r13
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 < 0) goto Lb1
            r1.f12716 = r7
            aq r6 = r1.f12720
            pn1 r10 = r6.f1283
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
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = p000.ExecutorC0049aq.f1274     // Catch: java.lang.Throwable -> L156
            long r13 = r9.get(r6)     // Catch: java.lang.Throwable -> L156
            long r13 = r13 & r15
            int r11 = (int) r13     // Catch: java.lang.Throwable -> L156
            int r13 = r6.f1277     // Catch: java.lang.Throwable -> L156
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
            r1.m6962(r2)     // Catch: java.lang.Throwable -> L156
            r6.m576(r1, r3, r2)     // Catch: java.lang.Throwable -> L156
            long r13 = r9.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L156
            long r13 = r13 & r15
            int r9 = (int) r13     // Catch: java.lang.Throwable -> L156
            if (r9 == r3) goto L158
            pn1 r11 = r6.f1283     // Catch: java.lang.Throwable -> L156
            java.lang.Object r11 = r11.m4557(r9)     // Catch: java.lang.Throwable -> L156
            r11.getClass()     // Catch: java.lang.Throwable -> L156
            yp r11 = (p000.C1029yp) r11     // Catch: java.lang.Throwable -> L156
            pn1 r13 = r6.f1283     // Catch: java.lang.Throwable -> L156
            r13.m4558(r3, r11)     // Catch: java.lang.Throwable -> L156
            r11.m6962(r3)     // Catch: java.lang.Throwable -> L156
            r6.m576(r11, r9, r3)     // Catch: java.lang.Throwable -> L156
            goto L158
        L156:
            r0 = move-exception
            goto L163
        L158:
            pn1 r3 = r6.f1283     // Catch: java.lang.Throwable -> L156
            r6 = 0
            r3.m4558(r9, r6)     // Catch: java.lang.Throwable -> L156
            monitor-exit(r10)
            r1.f12715 = r12
            goto Lb1
        L163:
            monitor-exit(r10)
            throw r0
        L165:
            r15 = 2097151(0x1fffff, double:1.0361303E-317)
            aq r3 = r1.f12720
            java.lang.Object r4 = r1.nextParkedWorker
            if (r4 == r9) goto L170
            goto L4
        L170:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.ExecutorC0049aq.f1273
        L172:
            long r19 = r4.get(r3)
            long r7 = r19 & r15
            int r7 = (int) r7
            r8 = 2097152(0x200000, double:1.036131E-317)
            long r8 = r19 + r8
            long r8 = r8 & r5
            int r10 = r1.indexInArray
            pn1 r11 = r3.f1283
            java.lang.Object r7 = r11.m4557(r7)
            r1.nextParkedWorker = r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r17 = p000.ExecutorC0049aq.f1273
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
            zp r0 = p000.EnumC1066zp.f13236
            r1.m6964(r0)
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.u22 m6957(boolean r12) {
            r11 = this;
            zp r0 = r11.f12715
            aq r2 = r11.f12720
            r7 = 0
            r8 = 1
            fd2 r9 = r11.f12713
            zp r10 = p000.EnumC1066zp.f13232
            if (r0 != r10) goto Le
            goto L85
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0049aq.f1274
        L10:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L74
            r9.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p000.fd2.f3901
            java.lang.Object r0 = r12.get(r9)
            u22 r0 = (p000.u22) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f10575
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = p000.fd2.f3903
            int r12 = r12.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.fd2.f3902
            int r0 = r0.get(r9)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.fd2.f3904
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            u22 r1 = r9.m2101(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L73
            ra0 r12 = r2.f1282
            java.lang.Object r12 = r12.m2329()
            u22 r12 = (p000.u22) r12
            if (r12 != 0) goto L72
            u22 r11 = r11.m6965(r8)
            return r11
        L72:
            return r12
        L73:
            return r7
        L74:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p000.ExecutorC0049aq.f1274
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L10
            r11.f12715 = r10
        L85:
            if (r12 == 0) goto Lb9
            int r12 = r2.f1277
            int r12 = r12 * 2
            int r12 = r11.m6960(r12)
            if (r12 != 0) goto L92
            goto L93
        L92:
            r8 = 0
        L93:
            if (r8 == 0) goto L9c
            u22 r12 = r11.m6961()
            if (r12 == 0) goto L9c
            return r12
        L9c:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = p000.fd2.f3901
            java.lang.Object r12 = r12.getAndSet(r9, r7)
            u22 r12 = (p000.u22) r12
            if (r12 != 0) goto Lad
            u22 r12 = r9.m2100()
        Lad:
            if (r12 == 0) goto Lb0
            return r12
        Lb0:
            if (r8 != 0) goto Lc0
            u22 r12 = r11.m6961()
            if (r12 == 0) goto Lc0
            return r12
        Lb9:
            u22 r12 = r11.m6961()
            if (r12 == 0) goto Lc0
            return r12
        Lc0:
            r12 = 3
            u22 r11 = r11.m6965(r12)
            return r11
    }

    /* JADX INFO: renamed from: β */
    public final int m6958() {
            r0 = this;
            int r0 = r0.indexInArray
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m6959() {
            r0 = this;
            java.lang.Object r0 = r0.nextParkedWorker
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final int m6960(int r3) {
            r2 = this;
            int r0 = r2.f12718
            int r1 = r0 << 13
            r0 = r0 ^ r1
            int r1 = r0 >> 17
            r0 = r0 ^ r1
            int r1 = r0 << 5
            r0 = r0 ^ r1
            r2.f12718 = r0
            int r2 = r3 + (-1)
            r1 = r2 & r3
            if (r1 != 0) goto L15
            r2 = r2 & r0
            return r2
        L15:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            int r2 = r2 % r3
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public final p000.u22 m6961() {
            r2 = this;
            r0 = 2
            int r0 = r2.m6960(r0)
            aq r2 = r2.f12720
            ra0 r1 = r2.f1282
            ra0 r2 = r2.f1281
            if (r0 != 0) goto L1d
            java.lang.Object r2 = r2.m2329()
            u22 r2 = (p000.u22) r2
            if (r2 == 0) goto L16
            return r2
        L16:
            java.lang.Object r2 = r1.m2329()
            u22 r2 = (p000.u22) r2
            return r2
        L1d:
            java.lang.Object r0 = r1.m2329()
            u22 r0 = (p000.u22) r0
            if (r0 == 0) goto L26
            return r0
        L26:
            java.lang.Object r2 = r2.m2329()
            u22 r2 = (p000.u22) r2
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public final void m6962(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            aq r1 = r2.f12720
            java.lang.String r1 = r1.f1280
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

    /* JADX INFO: renamed from: η */
    public final void m6963(java.lang.Object r1) {
            r0 = this;
            r0.nextParkedWorker = r1
            return
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m6964(p000.EnumC1066zp r7) {
            r6 = this;
            zp r0 = r6.f12715
            zp r1 = p000.EnumC1066zp.f13232
            if (r0 != r1) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.ExecutorC0049aq.f1274
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            aq r5 = r6.f12720
            r2.addAndGet(r5, r3)
        L17:
            if (r0 == r7) goto L1b
            r6.f12715 = r7
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public final p000.u22 m6965(int r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = p000.ExecutorC0049aq.f1274
            aq r3 = r0.f12720
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 0
            r5 = 2
            if (r2 >= r5) goto L16
            return r4
        L16:
            int r6 = r0.m6960(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L20:
            if (r10 >= r2) goto Lf0
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L27
            r6 = r15
        L27:
            pn1 r5 = r3.f1283
            java.lang.Object r5 = r5.m4557(r6)
            yp r5 = (p000.C1029yp) r5
            if (r5 == 0) goto Le5
            if (r5 == r0) goto Le5
            fd2 r5 = r5.f12713
            r7 = 3
            if (r1 != r7) goto L44
            u22 r7 = r5.m2100()
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            goto L7a
        L44:
            r5.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = p000.fd2.f3903
            int r7 = r7.get(r5)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = p000.fd2.f3902
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = p000.fd2.f3904
            int r13 = r13.get(r5)
            if (r13 != 0) goto L6d
        L6b:
            r7 = r4
            goto L7a
        L6d:
            int r13 = r7 + 1
            u22 r7 = r5.m2101(r7, r9)
            if (r7 != 0) goto L7a
            r7 = r13
            goto L5d
        L77:
            r18 = 0
            goto L6b
        L7a:
            um1 r13 = r0.f12714
            if (r7 == 0) goto L86
            r13.f10912 = r7
            r5 = r4
            r7 = -1
            r20 = -1
            goto Lc8
        L86:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.fd2.f3901
            java.lang.Object r14 = r7.get(r5)
            u22 r14 = (p000.u22) r14
            if (r14 != 0) goto L93
            r20 = -1
            goto L9f
        L93:
            r20 = -1
            boolean r8 = r14.f10575
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
            xn0 r8 = p000.y22.f12434
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r23 = r5
            long r4 = r14.f10574
            long r8 = r8 - r4
            long r4 = p000.y22.f12430
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
            r13.f10912 = r14
            r7 = r20
        Lc8:
            int r4 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r4 != 0) goto Ld3
            java.lang.Object r0 = r13.f10912
            u22 r0 = (p000.u22) r0
            r13.f10912 = r5
            return r0
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
            r0.f12717 = r11
            r22 = 0
            return r22
    }
}
