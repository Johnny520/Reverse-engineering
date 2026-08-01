package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class me extends java.lang.Thread {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater i = null;
    public final defpackage.zc0 a;
    public final defpackage.i00 b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ defpackage.ne h;
    private volatile int indexInArray;
    private volatile java.lang.Object nextParkedWorker;
    private volatile int workerCtl;

    static {
            java.lang.Class<me> r0 = defpackage.me.class
            java.lang.String r1 = "workerCtl"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.me.i = r0
            return
    }

    public me(defpackage.ne r1, int r2) {
            r0 = this;
            r0.h = r1
            r0.<init>()
            r1 = 1
            r0.setDaemon(r1)
            zc0 r1 = new zc0
            r1.<init>()
            r0.a = r1
            i00 r1 = new i00
            r1.<init>()
            r0.b = r1
            r1 = 4
            r0.c = r1
            l0 r1 = defpackage.ne.k
            r0.nextParkedWorker = r1
            m r1 = defpackage.az.a
            int r1 = r1.b()
            r0.f = r1
            r0.f(r2)
            return
    }

    public final defpackage.u50 a(boolean r11) {
            r10 = this;
            int r0 = r10.c
            ne r2 = r10.h
            r7 = 0
            r8 = 1
            zc0 r9 = r10.a
            if (r0 != r8) goto Lc
            goto L84
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.i
        Le:
            long r3 = r0.get(r2)
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r1 = 42
            long r5 = r5 >> r1
            int r1 = (int) r5
            if (r1 != 0) goto L73
            r9.getClass()
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = defpackage.zc0.b
            java.lang.Object r0 = r11.get(r9)
            u50 r0 = (defpackage.u50) r0
            if (r0 != 0) goto L2c
            goto L41
        L2c:
            v50 r1 = r0.b
            int r1 = r1.a
            if (r1 != r8) goto L41
        L32:
            boolean r1 = r11.compareAndSet(r9, r0, r7)
            if (r1 == 0) goto L3a
            r7 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r11.get(r9)
            if (r1 == r0) goto L32
            goto L21
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = defpackage.zc0.d
            int r11 = r11.get(r9)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.zc0.c
            int r0 = r0.get(r9)
        L4d:
            if (r11 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.zc0.e
            int r1 = r1.get(r9)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            u50 r1 = r9.b(r0, r8)
            if (r1 == 0) goto L4d
            r7 = r1
        L61:
            if (r7 != 0) goto L72
            bo r11 = r2.f
            java.lang.Object r11 = r11.d()
            u50 r11 = (defpackage.u50) r11
            if (r11 != 0) goto L71
            u50 r11 = r10.i(r8)
        L71:
            return r11
        L72:
            return r7
        L73:
            r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r5 = r3 - r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ne.i
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Le
            r10.c = r8
        L84:
            if (r11 == 0) goto Lb8
            int r11 = r2.a
            int r11 = r11 * 2
            int r11 = r10.d(r11)
            if (r11 != 0) goto L91
            goto L92
        L91:
            r8 = 0
        L92:
            if (r8 == 0) goto L9b
            u50 r11 = r10.e()
            if (r11 == 0) goto L9b
            return r11
        L9b:
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = defpackage.zc0.b
            java.lang.Object r11 = r11.getAndSet(r9, r7)
            u50 r11 = (defpackage.u50) r11
            if (r11 != 0) goto Lac
            u50 r11 = r9.a()
        Lac:
            if (r11 == 0) goto Laf
            return r11
        Laf:
            if (r8 != 0) goto Lbf
            u50 r11 = r10.e()
            if (r11 == 0) goto Lbf
            return r11
        Lb8:
            u50 r11 = r10.e()
            if (r11 == 0) goto Lbf
            return r11
        Lbf:
            r11 = 3
            u50 r11 = r10.i(r11)
            return r11
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
            int r0 = r3.f
            int r1 = r0 << 13
            r0 = r0 ^ r1
            int r1 = r0 >> 17
            r0 = r0 ^ r1
            int r1 = r0 << 5
            r0 = r0 ^ r1
            r3.f = r0
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

    public final defpackage.u50 e() {
            r2 = this;
            r0 = 2
            int r0 = r2.d(r0)
            ne r1 = r2.h
            if (r0 != 0) goto L1d
            bo r0 = r1.e
            java.lang.Object r0 = r0.d()
            u50 r0 = (defpackage.u50) r0
            if (r0 == 0) goto L14
            return r0
        L14:
            bo r0 = r1.f
            java.lang.Object r0 = r0.d()
            u50 r0 = (defpackage.u50) r0
            return r0
        L1d:
            bo r0 = r1.f
            java.lang.Object r0 = r0.d()
            u50 r0 = (defpackage.u50) r0
            if (r0 == 0) goto L28
            return r0
        L28:
            bo r0 = r1.e
            java.lang.Object r0 = r0.d()
            u50 r0 = (defpackage.u50) r0
            return r0
    }

    public final void f(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ne r1 = r2.h
            java.lang.String r1 = r1.d
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

    public final boolean h(int r7) {
            r6 = this;
            int r0 = r6.c
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto L15
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.ne.i
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            ne r5 = r6.h
            r2.addAndGet(r5, r3)
        L15:
            if (r0 == r7) goto L19
            r6.c = r7
        L19:
            return r1
    }

    public final defpackage.u50 i(int r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.ne.i
            ne r3 = r0.h
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
            if (r10 >= r2) goto Lf2
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L27
            r6 = r15
        L27:
            t00 r5 = r3.g
            java.lang.Object r5 = r5.b(r6)
            me r5 = (defpackage.me) r5
            if (r5 == 0) goto Le7
            if (r5 == r0) goto Le7
            zc0 r5 = r5.a
            r7 = 3
            if (r1 != r7) goto L44
            u50 r7 = r5.a()
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            goto L7a
        L44:
            r5.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.zc0.d
            int r7 = r7.get(r5)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.zc0.c
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.zc0.e
            int r13 = r13.get(r5)
            if (r13 != 0) goto L6d
        L6b:
            r7 = r4
            goto L7a
        L6d:
            int r13 = r7 + 1
            u50 r7 = r5.b(r7, r9)
            if (r7 != 0) goto L7a
            r7 = r13
            goto L5d
        L77:
            r18 = 0
            goto L6b
        L7a:
            i00 r13 = r0.b
            if (r7 == 0) goto L86
            r13.b = r7
            r5 = r4
            r7 = -1
            r20 = -1
            goto Lca
        L86:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.zc0.b
            java.lang.Object r14 = r7.get(r5)
            u50 r14 = (defpackage.u50) r14
            if (r14 != 0) goto L93
            r20 = -1
            goto La1
        L93:
            r20 = -1
            v50 r8 = r14.b
            int r8 = r8.a
            if (r8 != r15) goto L9d
            r8 = r15
            goto L9e
        L9d:
            r8 = 2
        L9e:
            r8 = r8 & r1
            if (r8 != 0) goto La5
        La1:
            r7 = -2
            r5 = r4
            goto Lca
        La5:
            vh r8 = defpackage.x50.f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r23 = r5
            long r4 = r14.a
            long r8 = r8 - r4
            long r4 = defpackage.x50.b
            int r24 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r24 >= 0) goto Lbd
            long r7 = r4 - r8
            r5 = 0
            goto Lca
        Lbd:
            r4 = r23
        Lbf:
            r5 = 0
            boolean r8 = r7.compareAndSet(r4, r14, r5)
            if (r8 == 0) goto Lde
            r13.b = r14
            r7 = r20
        Lca:
            int r4 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r4 != 0) goto Ld5
            java.lang.Object r1 = r13.b
            u50 r1 = (defpackage.u50) r1
            r13.b = r5
            return r1
        Ld5:
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 <= 0) goto Lec
            long r11 = java.lang.Math.min(r11, r7)
            goto Lec
        Lde:
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto Lbf
            r5 = r4
            r4 = 0
            goto L86
        Le7:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lec:
            int r10 = r10 + 1
            r4 = 0
            r5 = 2
            goto L20
        Lf2:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = 0
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 == 0) goto Lfe
            goto L100
        Lfe:
            r11 = r18
        L100:
            r0.e = r11
            r22 = 0
            return r22
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r24 = this;
            r1 = r24
            r2 = 0
        L3:
            r0 = r2
        L4:
            ne r3 = r1.h
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.ne.j
            int r3 = r4.get(r3)
            r4 = 5
            if (r3 == 0) goto L11
            goto L184
        L11:
            int r3 = r1.c
            if (r3 == r4) goto L184
            boolean r3 = r1.g
            u50 r3 = r1.a(r3)
            r5 = 3
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            r8 = 0
            if (r3 == 0) goto L74
            r1.e = r8
            ne r10 = r1.h
            v50 r0 = r3.b
            int r11 = r0.a
            r1.d = r8
            int r0 = r1.c
            r8 = 2
            if (r0 != r5) goto L34
            r1.c = r8
        L34:
            if (r11 != 0) goto L37
            goto L54
        L37:
            boolean r0 = r1.h(r8)
            if (r0 == 0) goto L54
            boolean r0 = r10.e()
            if (r0 == 0) goto L44
            goto L54
        L44:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.i
            long r8 = r0.get(r10)
            boolean r0 = r10.d(r8)
            if (r0 == 0) goto L51
            goto L54
        L51:
            r10.e()
        L54:
            r3.run()     // Catch: java.lang.Throwable -> L58
            goto L64
        L58:
            r0 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r5 = r3.getUncaughtExceptionHandler()
            r5.uncaughtException(r3, r0)
        L64:
            if (r11 != 0) goto L67
            goto L3
        L67:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ne.i
            r0.addAndGet(r10, r6)
            int r0 = r1.c
            if (r0 == r4) goto L3
            r0 = 4
            r1.c = r0
            goto L3
        L74:
            r1.g = r2
            long r10 = r1.e
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r10 = 1
            if (r3 == 0) goto L90
            if (r0 != 0) goto L81
            r0 = r10
            goto L4
        L81:
            r1.h(r5)
            java.lang.Thread.interrupted()
            long r3 = r1.e
            java.util.concurrent.locks.LockSupport.parkNanos(r3)
            r1.e = r8
            goto L3
        L90:
            java.lang.Object r3 = r1.nextParkedWorker
            l0 r11 = defpackage.ne.k
            if (r3 == r11) goto L14e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.me.i
            r6 = -1
            r3.set(r1, r6)
        L9c:
            java.lang.Object r3 = r1.nextParkedWorker
            l0 r7 = defpackage.ne.k
            if (r3 == r7) goto L4
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.me.i
            int r7 = r3.get(r1)
            if (r7 != r6) goto L4
            ne r7 = r1.h
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r11 = defpackage.ne.j
            int r7 = r11.get(r7)
            if (r7 == 0) goto Lb6
            goto L4
        Lb6:
            int r7 = r1.c
            if (r7 != r4) goto Lbc
            goto L4
        Lbc:
            r1.h(r5)
            java.lang.Thread.interrupted()
            long r14 = r1.d
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 != 0) goto Ld7
            long r14 = java.lang.System.nanoTime()
            ne r7 = r1.h
            r16 = 2097151(0x1fffff, double:1.0361303E-317)
            long r12 = r7.c
            long r14 = r14 + r12
            r1.d = r14
            goto Lda
        Ld7:
            r16 = 2097151(0x1fffff, double:1.0361303E-317)
        Lda:
            ne r7 = r1.h
            long r12 = r7.c
            java.util.concurrent.locks.LockSupport.parkNanos(r12)
            long r12 = java.lang.System.nanoTime()
            long r14 = r1.d
            long r12 = r12 - r14
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 < 0) goto L9c
            r1.d = r8
            ne r7 = r1.h
            t00 r12 = r7.g
            monitor-enter(r12)
            int r11 = r11.get(r7)     // Catch: java.lang.Throwable -> L13f
            if (r11 == 0) goto Lfb
            r11 = r10
            goto Lfc
        Lfb:
            r11 = r2
        Lfc:
            if (r11 == 0) goto L100
            monitor-exit(r12)
            goto L9c
        L100:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = defpackage.ne.i     // Catch: java.lang.Throwable -> L13f
            long r13 = r11.get(r7)     // Catch: java.lang.Throwable -> L13f
            long r13 = r13 & r16
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L13f
            int r14 = r7.a     // Catch: java.lang.Throwable -> L13f
            if (r13 > r14) goto L10f
            monitor-exit(r12)
            goto L9c
        L10f:
            boolean r3 = r3.compareAndSet(r1, r6, r10)     // Catch: java.lang.Throwable -> L13f
            if (r3 != 0) goto L117
            monitor-exit(r12)
            goto L9c
        L117:
            int r3 = r1.indexInArray     // Catch: java.lang.Throwable -> L13f
            r1.f(r2)     // Catch: java.lang.Throwable -> L13f
            r7.c(r1, r3, r2)     // Catch: java.lang.Throwable -> L13f
            long r13 = r11.getAndDecrement(r7)     // Catch: java.lang.Throwable -> L13f
            long r13 = r13 & r16
            int r11 = (int) r13     // Catch: java.lang.Throwable -> L13f
            if (r11 == r3) goto L141
            t00 r13 = r7.g     // Catch: java.lang.Throwable -> L13f
            java.lang.Object r13 = r13.b(r11)     // Catch: java.lang.Throwable -> L13f
            defpackage.ip.l(r13)     // Catch: java.lang.Throwable -> L13f
            me r13 = (defpackage.me) r13     // Catch: java.lang.Throwable -> L13f
            t00 r14 = r7.g     // Catch: java.lang.Throwable -> L13f
            r14.c(r3, r13)     // Catch: java.lang.Throwable -> L13f
            r13.f(r3)     // Catch: java.lang.Throwable -> L13f
            r7.c(r13, r11, r3)     // Catch: java.lang.Throwable -> L13f
            goto L141
        L13f:
            r0 = move-exception
            goto L14c
        L141:
            t00 r3 = r7.g     // Catch: java.lang.Throwable -> L13f
            r7 = 0
            r3.c(r11, r7)     // Catch: java.lang.Throwable -> L13f
            monitor-exit(r12)
            r1.c = r4
            goto L9c
        L14c:
            monitor-exit(r12)
            throw r0
        L14e:
            r16 = 2097151(0x1fffff, double:1.0361303E-317)
            ne r3 = r1.h
            java.lang.Object r4 = r1.nextParkedWorker
            if (r4 == r11) goto L159
            goto L4
        L159:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = defpackage.ne.h
        L15b:
            long r20 = r5.get(r3)
            long r8 = r20 & r16
            int r4 = (int) r8
            r8 = 2097152(0x200000, double:1.036131E-317)
            long r8 = r20 + r8
            long r8 = r8 & r6
            int r10 = r1.indexInArray
            t00 r11 = r3.g
            java.lang.Object r4 = r11.b(r4)
            r1.nextParkedWorker = r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r18 = defpackage.ne.h
            long r10 = (long) r10
            long r22 = r8 | r10
            r19 = r3
            boolean r3 = r18.compareAndSet(r19, r20, r22)
            if (r3 == 0) goto L181
            goto L4
        L181:
            r3 = r19
            goto L15b
        L184:
            r1.h(r4)
            return
    }
}
