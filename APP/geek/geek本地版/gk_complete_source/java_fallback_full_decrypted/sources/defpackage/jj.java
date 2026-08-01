package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jj extends defpackage.kj implements defpackage.eg {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater g = null;
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater h = null;
    private volatile java.lang.Object _delayed;
    private volatile int _isCompleted;
    private volatile java.lang.Object _queue;

    static {
            java.lang.String r0 = "_queue"
            java.lang.Class<jj> r1 = defpackage.jj.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.jj.f = r0
            java.lang.String r0 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.jj.g = r0
            java.lang.String r0 = "_isCompleted"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.jj.h = r0
            return
    }

    public jj() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted = r0
            return
    }

    @Override // defpackage.eg
    public final void c(long r4, defpackage.i8 r6) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L1a
        L7:
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L16
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1a
        L16:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r4
        L1a:
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L39
            long r4 = java.lang.System.nanoTime()
            gj r2 = new gj
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            r3.r(r4, r2)
            ah r4 = new ah
            r5 = 0
            r4.<init>(r5, r2)
            r6.n(r4)
        L39:
            return
    }

    @Override // defpackage.ke
    public final void d(defpackage.ge r1, java.lang.Runnable r2) {
            r0 = this;
            r0.n(r2)
            return
    }

    public void n(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.o(r2)
            if (r0 == 0) goto L14
            java.lang.Thread r2 = r1.j()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r2) goto L13
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L13:
            return
        L14:
            kf r0 = defpackage.kf.i
            r0.n(r2)
            return
    }

    public final boolean o(java.lang.Runnable r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.jj.h
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof defpackage.yr
            if (r4 == 0) goto L47
            r4 = r1
            yr r4 = (defpackage.yr) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            yr r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            l0 r4 = defpackage.ip.e
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            yr r3 = new yr
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
    }

    public final boolean p() {
            r7 = this;
            k6 r0 = r7.e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.g
            java.lang.Object r0 = r0.get(r7)
            ij r0 = (defpackage.ij) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.u60.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.f
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof defpackage.yr
            if (r3 == 0) goto L4f
            yr r0 = (defpackage.yr) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.yr.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            l0 r3 = defpackage.ip.e
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
    }

    public final long q() {
            r11 = this;
            boolean r0 = r11.l()
            r1 = 0
            if (r0 == 0) goto La
            goto Lfc
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.g
            java.lang.Object r0 = r0.get(r11)
            ij r0 = (defpackage.ij) r0
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L4f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.u60.b
            int r5 = r5.get(r0)
            if (r5 != 0) goto L1f
            goto L4f
        L1f:
            long r5 = java.lang.System.nanoTime()
        L23:
            monitor-enter(r0)
            hj[] r7 = r0.a     // Catch: java.lang.Throwable -> L3e
            if (r7 == 0) goto L2b
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L3e
            goto L2c
        L2b:
            r7 = r4
        L2c:
            if (r7 != 0) goto L31
            monitor-exit(r0)
            r7 = r4
            goto L4a
        L31:
            long r8 = r7.a     // Catch: java.lang.Throwable -> L3e
            long r8 = r5 - r8
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 < 0) goto L40
            boolean r7 = r11.o(r7)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r1 = move-exception
            goto L4d
        L40:
            r7 = r3
        L41:
            if (r7 == 0) goto L48
            hj r7 = r0.b(r3)     // Catch: java.lang.Throwable -> L3e
            goto L49
        L48:
            r7 = r4
        L49:
            monitor-exit(r0)
        L4a:
            if (r7 != 0) goto L23
            goto L4f
        L4d:
            monitor-exit(r0)
            throw r1
        L4f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.f
        L51:
            java.lang.Object r5 = r0.get(r11)
            if (r5 != 0) goto L59
        L57:
            r7 = r4
            goto L8b
        L59:
            boolean r6 = r5 instanceof defpackage.yr
            if (r6 == 0) goto L7d
            r6 = r5
            yr r6 = (defpackage.yr) r6
            java.lang.Object r7 = r6.d()
            l0 r8 = defpackage.yr.g
            if (r7 == r8) goto L6b
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L8b
        L6b:
            yr r6 = r6.c()
        L6f:
            boolean r7 = r0.compareAndSet(r11, r5, r6)
            if (r7 == 0) goto L76
            goto L51
        L76:
            java.lang.Object r7 = r0.get(r11)
            if (r7 == r5) goto L6f
            goto L51
        L7d:
            l0 r6 = defpackage.ip.e
            if (r5 != r6) goto L82
            goto L57
        L82:
            boolean r6 = r0.compareAndSet(r11, r5, r4)
            if (r6 == 0) goto L101
            r7 = r5
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L8b:
            if (r7 == 0) goto L91
            r7.run()
            return r1
        L91:
            k6 r0 = r11.e
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L9c
        L9a:
            r7 = r5
            goto La4
        L9c:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La3
            goto L9a
        La3:
            r7 = r1
        La4:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto La9
            goto Lfc
        La9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.f
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto Ld9
            boolean r7 = r0 instanceof defpackage.yr
            if (r7 == 0) goto Ld4
            yr r0 = (defpackage.yr) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = defpackage.yr.f
            long r7 = r7.get(r0)
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r7
            int r0 = (int) r9
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r9
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
            if (r0 != r7) goto Ld0
            r0 = 1
            goto Ld1
        Ld0:
            r0 = r3
        Ld1:
            if (r0 != 0) goto Ld9
            goto Lfc
        Ld4:
            l0 r3 = defpackage.ip.e
            if (r0 != r3) goto Lfc
            goto L100
        Ld9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.g
            java.lang.Object r0 = r0.get(r11)
            ij r0 = (defpackage.ij) r0
            if (r0 == 0) goto L100
            monitor-enter(r0)
            hj[] r7 = r0.a     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto Led
            r4 = r7[r3]     // Catch: java.lang.Throwable -> Leb
            goto Led
        Leb:
            r1 = move-exception
            goto Lfe
        Led:
            monitor-exit(r0)
            if (r4 != 0) goto Lf1
            goto L100
        Lf1:
            long r3 = r4.a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lfd
        Lfc:
            return r1
        Lfd:
            return r3
        Lfe:
            monitor-exit(r0)
            throw r1
        L100:
            return r5
        L101:
            java.lang.Object r6 = r0.get(r11)
            if (r6 == r5) goto L82
            goto L51
    }

    public final void r(long r6, defpackage.hj r8) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.g
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.jj.h
            int r1 = r1.get(r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r3
            goto L37
        Le:
            java.lang.Object r1 = r0.get(r5)
            ij r1 = (defpackage.ij) r1
            if (r1 != 0) goto L33
            ij r4 = new ij
            r4.<init>()
            r4.c = r6
        L1d:
            boolean r1 = r0.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L24
            goto L2a
        L24:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L1d
        L2a:
            java.lang.Object r1 = r0.get(r5)
            defpackage.ip.l(r1)
            ij r1 = (defpackage.ij) r1
        L33:
            int r1 = r8.a(r6, r1, r5)
        L37:
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L47
            r6 = 2
            if (r1 != r6) goto L3f
            goto L71
        L3f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            r6.<init>(r7)
            throw r6
        L47:
            r5.m(r6, r8)
            return
        L4b:
            java.lang.Object r6 = r0.get(r5)
            ij r6 = (defpackage.ij) r6
            if (r6 == 0) goto L62
            monitor-enter(r6)
            hj[] r7 = r6.a     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L5e
            r0 = 0
            r2 = r7[r0]     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r7 = move-exception
            goto L60
        L5e:
            monitor-exit(r6)
            goto L62
        L60:
            monitor-exit(r6)
            throw r7
        L62:
            if (r2 != r8) goto L71
            java.lang.Thread r6 = r5.j()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L71
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L71:
            return
    }

    @Override // defpackage.kj
    public void shutdown() {
            r7 = this;
            java.lang.ThreadLocal r0 = defpackage.t60.a
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.jj.h
            r2 = 1
            r0.set(r7, r2)
            l0 r0 = defpackage.ip.e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.jj.f
        L10:
            java.lang.Object r4 = r3.get(r7)
            if (r4 != 0) goto L24
        L16:
            boolean r4 = r3.compareAndSet(r7, r1, r0)
            if (r4 == 0) goto L1d
            goto L44
        L1d:
            java.lang.Object r4 = r3.get(r7)
            if (r4 == 0) goto L16
            goto L10
        L24:
            boolean r5 = r4 instanceof defpackage.yr
            if (r5 == 0) goto L2e
            yr r4 = (defpackage.yr) r4
            r4.b()
            goto L44
        L2e:
            if (r4 != r0) goto L31
            goto L44
        L31:
            yr r5 = new yr
            r6 = 8
            r5.<init>(r6, r2)
            r6 = r4
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.a(r6)
        L3e:
            boolean r6 = r3.compareAndSet(r7, r4, r5)
            if (r6 == 0) goto L79
        L44:
            long r2 = r7.q()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            long r2 = java.lang.System.nanoTime()
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.jj.g
            java.lang.Object r0 = r0.get(r7)
            ij r0 = (defpackage.ij) r0
            if (r0 == 0) goto L78
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.u60.b     // Catch: java.lang.Throwable -> L6b
            int r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L6b
            if (r4 <= 0) goto L6d
            r4 = 0
            hj r4 = r0.b(r4)     // Catch: java.lang.Throwable -> L6b
            goto L6e
        L6b:
            r1 = move-exception
            goto L76
        L6d:
            r4 = r1
        L6e:
            monitor-exit(r0)
            if (r4 != 0) goto L72
            goto L78
        L72:
            r7.m(r2, r4)
            goto L52
        L76:
            monitor-exit(r0)
            throw r1
        L78:
            return
        L79:
            java.lang.Object r6 = r3.get(r7)
            if (r6 == r4) goto L3e
            goto L10
    }
}
