package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends qg.g0 implements qg.y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11071m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11072n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11073o = null;
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;

    static {
            java.lang.String r0 = "_queue$volatile"
            java.lang.Class<qg.l0> r1 = qg.l0.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.l0.f11071m = r0
            java.lang.String r0 = "_delayed$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.l0.f11072n = r0
            java.lang.String r0 = "_isCompleted$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            qg.l0.f11073o = r0
            return
    }

    public l0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted$volatile = r0
            return
    }

    @Override // qg.g0
    public final long C() {
            r10 = this;
            l3.q r0 = qg.v.f11104c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.l0.f11071m
            boolean r2 = r10.D()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.F()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof vg.l
            if (r6 == 0) goto L3e
            r6 = r2
            vg.l r6 = (vg.l) r6
            java.lang.Object r7 = r6.d()
            l3.q r8 = vg.l.f14348g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            vg.l r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            tf.k r2 = r10.f11054k
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof vg.l
            if (r2 == 0) goto L8d
            vg.l r1 = (vg.l) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = vg.l.f14347f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11072n
            java.lang.Object r0 = r0.get(r10)
            qg.k0 r0 = (qg.k0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            qg.j0[] r1 = r0.f14362a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f11063g
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
    }

    public void E(java.lang.Runnable r2) {
            r1 = this;
            r1.F()
            boolean r0 = r1.G(r2)
            if (r0 == 0) goto L17
            java.lang.Thread r2 = r1.H()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r2) goto L16
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L16:
            return
        L17:
            qg.w r0 = qg.w.f11113p
            r0.E(r2)
            return
    }

    public final void F() {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11072n
            java.lang.Object r0 = r0.get(r10)
            qg.k0 r0 = (qg.k0) r0
            if (r0 == 0) goto L44
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = vg.u.f14361b
            int r1 = r1.get(r0)
            if (r1 != 0) goto L13
            return
        L13:
            long r1 = java.lang.System.nanoTime()
        L17:
            monitor-enter(r0)
            qg.j0[] r3 = r0.f14362a     // Catch: java.lang.Throwable -> L35
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L21
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L35
            goto L22
        L21:
            r3 = r4
        L22:
            if (r3 != 0) goto L26
            monitor-exit(r0)
            goto L3f
        L26:
            long r6 = r3.f11063g     // Catch: java.lang.Throwable -> L35
            long r6 = r1 - r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L37
            boolean r3 = r10.G(r3)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r1 = move-exception
            goto L42
        L37:
            r3 = r5
        L38:
            if (r3 == 0) goto L3e
            qg.j0 r4 = r0.b(r5)     // Catch: java.lang.Throwable -> L35
        L3e:
            monitor-exit(r0)
        L3f:
            if (r4 != 0) goto L17
            goto L44
        L42:
            monitor-exit(r0)
            throw r1
        L44:
            return
    }

    public final boolean G(java.lang.Runnable r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11071m
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = qg.l0.f11073o
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
            boolean r4 = r1 instanceof vg.l
            if (r4 == 0) goto L47
            r4 = r1
            vg.l r4 = (vg.l) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            vg.l r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            l3.q r4 = qg.v.f11104c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            vg.l r3 = new vg.l
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

    public abstract java.lang.Thread H();

    public void I(long r2, qg.j0 r4) {
            r1 = this;
            qg.w r0 = qg.w.f11113p
            r0.J(r2, r4)
            return
    }

    public final void J(long r6, qg.j0 r8) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11072n
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qg.l0.f11073o
            int r1 = r1.get(r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r3
            goto L37
        Le:
            java.lang.Object r1 = r0.get(r5)
            qg.k0 r1 = (qg.k0) r1
            if (r1 != 0) goto L33
            qg.k0 r4 = new qg.k0
            r4.<init>()
            r4.f11067c = r6
        L1d:
            boolean r1 = r0.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L24
            goto L2a
        L24:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L1d
        L2a:
            java.lang.Object r1 = r0.get(r5)
            r1.getClass()
            qg.k0 r1 = (qg.k0) r1
        L33:
            int r1 = r8.b(r6, r1, r5)
        L37:
            if (r1 == 0) goto L49
            if (r1 == r3) goto L45
            r6 = 2
            if (r1 != r6) goto L3f
            goto L6f
        L3f:
            java.lang.String r6 = "unexpected result"
            j8.o.A(r6)
            return
        L45:
            r5.I(r6, r8)
            return
        L49:
            java.lang.Object r6 = r0.get(r5)
            qg.k0 r6 = (qg.k0) r6
            if (r6 == 0) goto L60
            monitor-enter(r6)
            qg.j0[] r7 = r6.f14362a     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L5c
            r0 = 0
            r2 = r7[r0]     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r7 = move-exception
            goto L5e
        L5c:
            monitor-exit(r6)
            goto L60
        L5e:
            monitor-exit(r6)
            throw r7
        L60:
            if (r2 != r8) goto L6f
            java.lang.Thread r6 = r5.H()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L6f
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L6f:
            return
    }

    public final boolean isEmpty() {
            r7 = this;
            tf.k r0 = r7.f11054k
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11072n
            java.lang.Object r0 = r0.get(r7)
            qg.k0 r0 = (qg.k0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = vg.u.f14361b
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11071m
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof vg.l
            if (r3 == 0) goto L4f
            vg.l r0 = (vg.l) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = vg.l.f14347f
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
            l3.q r3 = qg.v.f11104c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
    }

    @Override // qg.y
    public qg.d0 q(long r2, qg.j1 r4, wf.g r5) {
            r1 = this;
            qg.y r0 = qg.x.f11119a
            qg.d0 r2 = r0.q(r2, r4, r5)
            return r2
    }

    @Override // qg.g0
    public void shutdown() {
            r7 = this;
            java.lang.ThreadLocal r0 = qg.h1.f11058a
            r1 = 0
            r0.set(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qg.l0.f11073o
            r2 = 1
            r0.set(r7, r2)
            l3.q r0 = qg.v.f11104c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = qg.l0.f11071m
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
            boolean r5 = r4 instanceof vg.l
            if (r5 == 0) goto L2e
            vg.l r4 = (vg.l) r4
            r4.b()
            goto L44
        L2e:
            if (r4 != r0) goto L31
            goto L44
        L31:
            vg.l r5 = new vg.l
            r6 = 8
            r5.<init>(r6, r2)
            r6 = r4
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.a(r6)
        L3e:
            boolean r6 = r3.compareAndSet(r7, r4, r5)
            if (r6 == 0) goto L79
        L44:
            long r2 = r7.C()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L44
            long r2 = java.lang.System.nanoTime()
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.l0.f11072n
            java.lang.Object r0 = r0.get(r7)
            qg.k0 r0 = (qg.k0) r0
            if (r0 == 0) goto L78
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = vg.u.f14361b     // Catch: java.lang.Throwable -> L6b
            int r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L6b
            if (r4 <= 0) goto L6d
            r4 = 0
            qg.j0 r4 = r0.b(r4)     // Catch: java.lang.Throwable -> L6b
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
            r7.I(r2, r4)
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

    @Override // qg.y
    public final void u(long r4, qg.g r6) {
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
            qg.h0 r2 = new qg.h0
            long r0 = r0 + r4
            r2.<init>(r3, r0, r6)
            r3.J(r4, r2)
            qg.e r4 = new qg.e
            r5 = 1
            r4.<init>(r2, r5)
            r6.s(r4)
        L39:
            return
    }

    @Override // qg.p
    public final void w(wf.g r1, java.lang.Runnable r2) {
            r0 = this;
            r0.E(r2)
            return
    }
}
