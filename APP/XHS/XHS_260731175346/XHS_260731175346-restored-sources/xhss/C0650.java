package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛴᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0650 extends java.lang.Thread {

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f2218 = null;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f2219 = 0;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0400 f2220;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0144 f2221;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public long f2222;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.ExecutorC0335 f2223;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public boolean f2224;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public int f2225;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2226;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public long f2227;

    static {
            java.lang.Class<xhss.ᛷᛴᛵᛶ> r0 = xhss.C0650.class
            java.lang.String r1 = "workerCtl$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            xhss.C0650.f2218 = r2
            sun.misc.Unsafe r2 = xhss.AbstractC1067.f3442
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            long r0 = r2.objectFieldOffset(r0)
            xhss.C0650.f2219 = r0
            return
    }

    public C0650(xhss.ExecutorC0335 r3, int r4) {
            r2 = this;
            r2.f2223 = r3
            r2.<init>()
            r3 = 1
            r2.setDaemon(r3)
            java.lang.Class<xhss.ᛴᛱᲀᛴ> r3 = xhss.ExecutorC0335.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setContextClassLoader(r3)
            xhss.ᛴᛸᲈᛸ r3 = new xhss.ᛴᛸᲈᛸ
            r3.<init>()
            r2.f2220 = r3
            xhss.ᛲᛳᛴᲁ r3 = new xhss.ᛲᛳᛴᲁ
            r3.<init>()
            r2.f2221 = r3
            r3 = 4
            r2.f2226 = r3
            xhss.ᛶᛲᛷᛵ r3 = xhss.ExecutorC0335.f1249
            r2.nextParkedWorker = r3
            long r0 = java.lang.System.nanoTime()
            int r3 = (int) r0
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 42
        L31:
            r2.f2225 = r3
            r2.m1142(r4)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r18 = this;
            r1 = r18
            r6 = 0
        L3:
            r7 = r6
        L4:
            xhss.ᛴᛱᲀᛴ r0 = r1.f2223
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = xhss.ExecutorC0335.f1252
            int r0 = r2.get(r0)
            r8 = 5
            if (r0 == 0) goto L12
        Lf:
            r2 = r8
            goto L18b
        L12:
            int r0 = r1.f2226
            if (r0 == r8) goto Lf
            boolean r0 = r1.f2224
            xhss.ᛲᛲᛲᛲ r0 = r1.m1137(r0)
            r9 = 3
            r2 = -2097152(0xffffffffffe00000, double:NaN)
            r10 = 0
            if (r0 == 0) goto L80
            r1.f2227 = r10
            xhss.ᛴᛱᲀᛴ r4 = r1.f2223
            r1.f2222 = r10
            int r5 = r1.f2226
            r7 = 2
            if (r5 != r9) goto L31
            r1.f2226 = r7
        L31:
            boolean r5 = r0.f589
            if (r5 == 0) goto L6f
            boolean r5 = r1.m1139(r7)
            if (r5 == 0) goto L52
            boolean r5 = r4.m679()
            if (r5 == 0) goto L42
            goto L52
        L42:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = xhss.ExecutorC0335.f1251
            long r9 = r5.get(r4)
            boolean r5 = r4.m680(r9)
            if (r5 == 0) goto L4f
            goto L52
        L4f:
            r4.m679()
        L52:
            r0.run()     // Catch: java.lang.Throwable -> L56
            goto L62
        L56:
            r0 = move-exception
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r7 = r5.getUncaughtExceptionHandler()
            r7.uncaughtException(r5, r0)
        L62:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xhss.ExecutorC0335.f1251
            r0.addAndGet(r4, r2)
            int r0 = r1.f2226
            if (r0 == r8) goto L3
            r0 = 4
            r1.f2226 = r0
            goto L3
        L6f:
            r0.run()     // Catch: java.lang.Throwable -> L73
            goto L3
        L73:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r2.getUncaughtExceptionHandler()
            r3.uncaughtException(r2, r0)
            goto L3
        L80:
            r1.f2224 = r6
            long r4 = r1.f2227
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L9c
            if (r7 != 0) goto L8d
            r7 = 1
            goto L4
        L8d:
            r1.m1139(r9)
            java.lang.Thread.interrupted()
            long r2 = r1.f2227
            java.util.concurrent.locks.LockSupport.parkNanos(r2)
            r1.f2227 = r10
            goto L3
        L9c:
            java.lang.Object r0 = r1.nextParkedWorker
            xhss.ᛶᛲᛷᛵ r4 = xhss.ExecutorC0335.f1249
            if (r0 == r4) goto L15d
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0650.f2219
            r15 = -1
            r0.putIntVolatile(r1, r2, r15)
        Laa:
            java.lang.Object r0 = r1.nextParkedWorker
            xhss.ᛶᛲᛷᛵ r2 = xhss.ExecutorC0335.f1249
            if (r0 == r2) goto L4
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0650.f2219
            int r4 = r0.getIntVolatile(r1, r2)
            if (r4 != r15) goto L4
            xhss.ᛴᛱᲀᛴ r4 = r1.f2223
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = xhss.ExecutorC0335.f1252
            int r4 = r5.get(r4)
            if (r4 == 0) goto Lc6
            goto L4
        Lc6:
            int r4 = r1.f2226
            if (r4 != r8) goto Lcc
            goto L4
        Lcc:
            r1.m1139(r9)
            java.lang.Thread.interrupted()
            r16 = 2097151(0x1fffff, double:1.0361303E-317)
            long r12 = r1.f2222
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 != 0) goto Le6
            long r12 = java.lang.System.nanoTime()
            xhss.ᛴᛱᲀᛴ r4 = r1.f2223
            long r8 = r4.f1258
            long r12 = r12 + r8
            r1.f2222 = r12
        Le6:
            xhss.ᛴᛱᲀᛴ r4 = r1.f2223
            long r8 = r4.f1258
            java.util.concurrent.locks.LockSupport.parkNanos(r8)
            long r8 = java.lang.System.nanoTime()
            long r12 = r1.f2222
            long r8 = r8 - r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L159
            r1.f2222 = r10
            xhss.ᛴᛱᲀᛴ r8 = r1.f2223
            xhss.ᛱᛷᛳᛴ r9 = r8.f1256
            monitor-enter(r9)
            int r4 = r5.get(r8)     // Catch: java.lang.Throwable -> L14a
            if (r4 == 0) goto L107
            r4 = 1
            goto L108
        L107:
            r4 = r6
        L108:
            if (r4 == 0) goto L10c
            monitor-exit(r9)
            goto L159
        L10c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = xhss.ExecutorC0335.f1251     // Catch: java.lang.Throwable -> L14a
            long r4 = r12.get(r8)     // Catch: java.lang.Throwable -> L14a
            long r4 = r4 & r16
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L14a
            int r5 = r8.f1253     // Catch: java.lang.Throwable -> L14a
            if (r4 > r5) goto L11b
            monitor-exit(r9)
            goto L159
        L11b:
            r4 = -1
            r5 = 1
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L14a
            if (r0 != 0) goto L125
            monitor-exit(r9)
            goto L159
        L125:
            int r0 = r1.indexInArray     // Catch: java.lang.Throwable -> L14a
            r1.m1142(r6)     // Catch: java.lang.Throwable -> L14a
            r8.m681(r1, r0, r6)     // Catch: java.lang.Throwable -> L14a
            long r2 = r12.getAndDecrement(r8)     // Catch: java.lang.Throwable -> L14a
            long r2 = r2 & r16
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L14a
            if (r2 == r0) goto L14c
            xhss.ᛱᛷᛳᛴ r3 = r8.f1256     // Catch: java.lang.Throwable -> L14a
            java.lang.Object r3 = r3.m176(r2)     // Catch: java.lang.Throwable -> L14a
            xhss.ᛷᛴᛵᛶ r3 = (xhss.C0650) r3     // Catch: java.lang.Throwable -> L14a
            xhss.ᛱᛷᛳᛴ r4 = r8.f1256     // Catch: java.lang.Throwable -> L14a
            r4.m177(r0, r3)     // Catch: java.lang.Throwable -> L14a
            r3.m1142(r0)     // Catch: java.lang.Throwable -> L14a
            r8.m681(r3, r2, r0)     // Catch: java.lang.Throwable -> L14a
            goto L14c
        L14a:
            r0 = move-exception
            goto L157
        L14c:
            xhss.ᛱᛷᛳᛴ r0 = r8.f1256     // Catch: java.lang.Throwable -> L14a
            r3 = 0
            r0.m177(r2, r3)     // Catch: java.lang.Throwable -> L14a
            monitor-exit(r9)
            r2 = 5
            r1.f2226 = r2
            goto L159
        L157:
            monitor-exit(r9)
            throw r0
        L159:
            r8 = 5
            r9 = 3
            goto Laa
        L15d:
            r16 = 2097151(0x1fffff, double:1.0361303E-317)
            xhss.ᛴᛱᲀᛴ r11 = r1.f2223
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = xhss.ExecutorC0335.f1250
            java.lang.Object r0 = r1.nextParkedWorker
            if (r0 == r4) goto L16a
            goto L4
        L16a:
            long r12 = r10.get(r11)
            long r4 = r12 & r16
            int r0 = (int) r4
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r12
            long r4 = r4 & r2
            int r8 = r1.indexInArray
            xhss.ᛱᛷᛳᛴ r9 = r11.f1256
            java.lang.Object r0 = r9.m176(r0)
            r1.nextParkedWorker = r0
            long r8 = (long) r8
            long r14 = r4 | r8
            boolean r0 = r10.compareAndSet(r11, r12, r14)
            if (r0 == 0) goto L16a
            goto L4
        L18b:
            r1.m1139(r2)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m1134() {
            r0 = this;
            int r0 = r0.indexInArray
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object m1135() {
            r0 = this;
            java.lang.Object r0 = r0.nextParkedWorker
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.AbstractRunnableC0130 m1136() {
            r2 = this;
            r0 = 2
            int r0 = r2.m1141(r0)
            xhss.ᛴᛱᲀᛴ r2 = r2.f2223
            xhss.ᛷᲈᛲᲀ r1 = r2.f1257
            xhss.ᛷᲈᛲᲀ r2 = r2.f1259
            if (r0 != 0) goto L1d
            java.lang.Object r2 = r2.m1435()
            xhss.ᛲᛲᛲᛲ r2 = (xhss.AbstractRunnableC0130) r2
            if (r2 == 0) goto L16
            return r2
        L16:
            java.lang.Object r2 = r1.m1435()
            xhss.ᛲᛲᛲᛲ r2 = (xhss.AbstractRunnableC0130) r2
            return r2
        L1d:
            java.lang.Object r0 = r1.m1435()
            xhss.ᛲᛲᛲᛲ r0 = (xhss.AbstractRunnableC0130) r0
            if (r0 == 0) goto L26
            return r0
        L26:
            java.lang.Object r2 = r2.m1435()
            xhss.ᛲᛲᛲᛲ r2 = (xhss.AbstractRunnableC0130) r2
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractRunnableC0130 m1137(boolean r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.f2226
            xhss.ᛴᛱᲀᛴ r3 = r0.f2223
            r8 = 0
            r9 = 1
            xhss.ᛴᛸᲈᛸ r11 = r0.f2220
            if (r1 != r9) goto Le
            goto L8f
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = xhss.ExecutorC0335.f1251
        L10:
            long r4 = r1.get(r3)
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r2 = 42
            long r6 = r6 >> r2
            int r2 = (int) r6
            if (r2 != 0) goto L7e
            r11.getClass()
            long r1 = xhss.C0400.f1418
        L25:
            sun.misc.Unsafe r4 = xhss.AbstractC1067.f3442
            java.lang.Object r5 = r4.getObjectVolatile(r11, r1)
            r14 = r5
            xhss.ᛲᛲᛲᛲ r14 = (xhss.AbstractRunnableC0130) r14
            if (r14 != 0) goto L31
            goto L49
        L31:
            boolean r5 = r14.f589
            if (r5 != r9) goto L49
        L35:
            sun.misc.Unsafe r10 = xhss.AbstractC1067.f3442
            long r12 = xhss.C0400.f1418
            r15 = 0
            boolean r4 = r10.compareAndSwapObject(r11, r12, r14, r15)
            if (r4 == 0) goto L42
            r8 = r14
            goto L6b
        L42:
            java.lang.Object r4 = r10.getObjectVolatile(r11, r1)
            if (r4 == r14) goto L35
            goto L25
        L49:
            long r1 = xhss.C0400.f1415
            int r1 = r4.getIntVolatile(r11, r1)
            long r5 = xhss.C0400.f1416
            int r2 = r4.getIntVolatile(r11, r5)
        L55:
            if (r1 == r2) goto L6b
            sun.misc.Unsafe r4 = xhss.AbstractC1067.f3442
            long r5 = xhss.C0400.f1417
            int r4 = r4.getIntVolatile(r11, r5)
            if (r4 != 0) goto L62
            goto L6b
        L62:
            int r2 = r2 + (-1)
            xhss.ᛲᛲᛲᛲ r4 = r11.m794(r2, r9)
            if (r4 == 0) goto L55
            r8 = r4
        L6b:
            if (r8 != 0) goto L7d
            xhss.ᛷᲈᛲᲀ r1 = r3.f1257
            java.lang.Object r1 = r1.m1435()
            xhss.ᛲᛲᛲᛲ r1 = (xhss.AbstractRunnableC0130) r1
            if (r1 != 0) goto L7c
            xhss.ᛲᛲᛲᛲ r0 = r0.m1138(r9)
            return r0
        L7c:
            return r1
        L7d:
            return r8
        L7e:
            r6 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = xhss.ExecutorC0335.f1251
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L10
            r0.f2226 = r9
        L8f:
            if (r17 == 0) goto Lc5
            int r1 = r3.f1253
            int r1 = r1 * 2
            int r1 = r0.m1141(r1)
            if (r1 != 0) goto L9c
            goto L9d
        L9c:
            r9 = 0
        L9d:
            if (r9 == 0) goto La6
            xhss.ᛲᛲᛲᛲ r1 = r0.m1136()
            if (r1 == 0) goto La6
            return r1
        La6:
            r11.getClass()
            sun.misc.Unsafe r1 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0400.f1418
            java.lang.Object r1 = r1.getAndSetObject(r11, r2, r8)
            xhss.ᛲᛲᛲᛲ r1 = (xhss.AbstractRunnableC0130) r1
            if (r1 != 0) goto Lb9
            xhss.ᛲᛲᛲᛲ r1 = r11.m793()
        Lb9:
            if (r1 == 0) goto Lbc
            return r1
        Lbc:
            if (r9 != 0) goto Lcc
            xhss.ᛲᛲᛲᛲ r1 = r0.m1136()
            if (r1 == 0) goto Lcc
            return r1
        Lc5:
            xhss.ᛲᛲᛲᛲ r1 = r0.m1136()
            if (r1 == 0) goto Lcc
            return r1
        Lcc:
            r1 = 3
            xhss.ᛲᛲᛲᛲ r0 = r0.m1138(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.AbstractRunnableC0130 m1138(int r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = xhss.ExecutorC0335.f1251
            xhss.ᛴᛱᲀᛴ r3 = r0.f2223
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 0
            r5 = 2
            if (r2 >= r5) goto L16
            return r4
        L16:
            int r6 = r0.m1141(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L20:
            if (r10 >= r2) goto L107
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L27
            r6 = r15
        L27:
            xhss.ᛱᛷᛳᛴ r5 = r3.f1256
            java.lang.Object r5 = r5.m176(r6)
            xhss.ᛷᛴᛵᛶ r5 = (xhss.C0650) r5
            if (r5 == 0) goto Lf8
            if (r5 == r0) goto Lf8
            xhss.ᛴᛸᲈᛸ r5 = r5.f2220
            r7 = 3
            if (r1 != r7) goto L45
            xhss.ᛲᛲᛲᛲ r7 = r5.m793()
            r14 = r2
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = 0
            goto L85
        L45:
            r5.getClass()
            sun.misc.Unsafe r7 = xhss.AbstractC1067.f3442
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = xhss.C0400.f1415
            int r8 = r7.getIntVolatile(r5, r8)
            r24 = 0
            long r13 = xhss.C0400.f1416
            int r7 = r7.getIntVolatile(r5, r13)
            if (r1 != r15) goto L61
            r9 = r15
            goto L62
        L61:
            r9 = 0
        L62:
            if (r8 == r7) goto L83
            if (r9 == 0) goto L73
            sun.misc.Unsafe r13 = xhss.AbstractC1067.f3442
            r14 = r2
            long r1 = xhss.C0400.f1417
            int r1 = r13.getIntVolatile(r5, r1)
            if (r1 != 0) goto L74
        L71:
            r7 = r4
            goto L85
        L73:
            r14 = r2
        L74:
            int r1 = r8 + 1
            xhss.ᛲᛲᛲᛲ r2 = r5.m794(r8, r9)
            if (r2 != 0) goto L81
            r8 = r1
            r2 = r14
            r1 = r29
            goto L62
        L81:
            r7 = r2
            goto L85
        L83:
            r14 = r2
            goto L71
        L85:
            xhss.ᛲᛳᛴᲁ r8 = r0.f2221
            if (r7 == 0) goto L90
            r8.f617 = r7
            r1 = -1
            r26 = -1
            goto Lda
        L90:
            r26 = -1
            long r1 = xhss.C0400.f1418
        L94:
            sun.misc.Unsafe r7 = xhss.AbstractC1067.f3442
            java.lang.Object r7 = r7.getObjectVolatile(r5, r1)
            xhss.ᛲᛲᛲᛲ r7 = (xhss.AbstractRunnableC0130) r7
            if (r7 != 0) goto L9f
            goto Laa
        L9f:
            boolean r9 = r7.f589
            if (r9 == 0) goto La5
            r9 = r15
            goto La6
        La5:
            r9 = 2
        La6:
            r9 = r9 & r29
            if (r9 != 0) goto Lad
        Laa:
            r1 = -2
            goto Lda
        Lad:
            xhss.ᛳᛴᲀᲁ r9 = xhss.AbstractC0662.f2273
            r9.getClass()
            long r16 = java.lang.System.nanoTime()
            r13 = r5
            long r4 = r7.f588
            long r16 = r16 - r4
            long r4 = xhss.AbstractC0662.f2268
            int r18 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r18 >= 0) goto Lc4
            long r1 = r4 - r16
            goto Lda
        Lc4:
            sun.misc.Unsafe r16 = xhss.AbstractC1067.f3442
            long r18 = xhss.C0400.f1418
            r21 = 0
            r20 = r7
            r17 = r13
            boolean r4 = r16.compareAndSwapObject(r17, r18, r20, r21)
            r5 = r16
            if (r4 == 0) goto Lef
            r8.f617 = r7
            r1 = r26
        Lda:
            int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r4 != 0) goto Le6
            java.lang.Object r0 = r8.f617
            xhss.ᛲᛲᛲᛲ r0 = (xhss.AbstractRunnableC0130) r0
            r9 = 0
            r8.f617 = r9
            return r0
        Le6:
            int r4 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r4 <= 0) goto Lfe
            long r11 = java.lang.Math.min(r11, r1)
            goto Lfe
        Lef:
            java.lang.Object r4 = r5.getObjectVolatile(r13, r1)
            if (r4 == r7) goto Lc4
            r5 = r13
            r4 = 0
            goto L94
        Lf8:
            r14 = r2
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lfe:
            int r10 = r10 + 1
            r1 = r29
            r2 = r14
            r4 = 0
            r5 = 2
            goto L20
        L107:
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = 0
            int r1 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r1 == 0) goto L113
            goto L115
        L113:
            r11 = r24
        L115:
            r0.f2227 = r11
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean m1139(int r7) {
            r6 = this;
            int r0 = r6.f2226
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto L15
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = xhss.ExecutorC0335.f1251
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            xhss.ᛴᛱᲀᛴ r5 = r6.f2223
            r2.addAndGet(r5, r3)
        L15:
            if (r0 == r7) goto L19
            r6.f2226 = r7
        L19:
            return r1
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m1140(java.lang.Object r1) {
            r0 = this;
            r0.nextParkedWorker = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int m1141(int r3) {
            r2 = this;
            int r0 = r2.f2225
            int r1 = r0 << 13
            r0 = r0 ^ r1
            int r1 = r0 >> 17
            r0 = r0 ^ r1
            int r1 = r0 << 5
            r0 = r0 ^ r1
            r2.f2225 = r0
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

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1142(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᛴᛱᲀᛴ r1 = r2.f2223
            java.lang.String r1 = r1.f1255
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
}
