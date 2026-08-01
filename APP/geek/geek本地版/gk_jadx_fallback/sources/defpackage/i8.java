package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends defpackage.vg implements defpackage.ld, defpackage.qe {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater g = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h = null;
    private volatile int _decisionAndIndex;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;
    public final defpackage.ld d;
    public final defpackage.ge e;

    static {
            java.lang.String r0 = "_decisionAndIndex"
            java.lang.Class<i8> r1 = defpackage.i8.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            defpackage.i8.f = r0
            java.lang.String r0 = "_state"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.i8.g = r0
            java.lang.String r0 = "_parentHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.i8.h = r0
            return
    }

    public i8(defpackage.ld r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.d = r2
            ge r2 = r2.d()
            r1.e = r2
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1._decisionAndIndex = r2
            o1 r2 = defpackage.o1.a
            r1._state = r2
            return
    }

    public static void p(defpackage.ah r3, java.lang.Object r4) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", already has "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void r(defpackage.i8 r6, java.lang.Object r7, int r8) {
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i8.g
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof defpackage.ow
            r3 = 1
            if (r2 == 0) goto L59
            r2 = r1
            ow r2 = (defpackage.ow) r2
            boolean r4 = r7 instanceof defpackage.nb
            if (r4 == 0) goto L14
        L12:
            r2 = r7
            goto L2f
        L14:
            if (r8 == r3) goto L19
            r3 = 2
            if (r8 != r3) goto L12
        L19:
            boolean r3 = r2 instanceof defpackage.ah
            if (r3 != 0) goto L1e
            goto L12
        L1e:
            lb r3 = new lb
            boolean r4 = r2 instanceof defpackage.ah
            r5 = 0
            if (r4 == 0) goto L28
            ah r2 = (defpackage.ah) r2
            goto L29
        L28:
            r2 = r5
        L29:
            r4 = 16
            r3.<init>(r7, r2, r5, r4)
            r2 = r3
        L2f:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L52
            boolean r7 = r6.o()
            if (r7 != 0) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.i8.h
            java.lang.Object r0 = r7.get(r6)
            zg r0 = (defpackage.zg) r0
            if (r0 != 0) goto L46
            goto L4e
        L46:
            r0.b()
            nw r0 = defpackage.nw.a
            r7.set(r6, r0)
        L4e:
            r6.l(r8)
            return
        L52:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L2f
            goto L0
        L59:
            boolean r6 = r1 instanceof defpackage.l8
            if (r6 == 0) goto L69
            l8 r1 = (defpackage.l8) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.l8.c
            r8 = 0
            boolean r6 = r6.compareAndSet(r1, r8, r3)
            if (r6 == 0) goto L69
            return
        L69:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Already resumed, but proposed with update "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // defpackage.vg
    public final void a(java.lang.Object r5, java.util.concurrent.CancellationException r6) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.i8.g
            java.lang.Object r0 = r5.get(r4)
            boolean r1 = r0 instanceof defpackage.ow
            if (r1 != 0) goto L74
            boolean r1 = r0 instanceof defpackage.nb
            if (r1 == 0) goto Lf
            goto L6c
        Lf:
            boolean r1 = r0 instanceof defpackage.lb
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            lb r1 = (defpackage.lb) r1
            java.lang.Throwable r3 = r1.e
            if (r3 != 0) goto L57
            r3 = 15
            lb r2 = defpackage.lb.a(r1, r2, r6, r3)
        L21:
            boolean r3 = r5.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L50
            ah r5 = r1.b
            if (r5 == 0) goto L2e
            r4.j(r5, r6)
        L2e:
            sm r5 = r1.c
            if (r5 == 0) goto L6c
            r5.f(r6)     // Catch: java.lang.Throwable -> L36
            goto L4f
        L36:
            r5 = move-exception
            pb r6 = new pb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0, r5)
            ge r5 = r4.e
            defpackage.ff.u(r5, r6)
        L4f:
            return
        L50:
            java.lang.Object r3 = r5.get(r4)
            if (r3 == r0) goto L21
            goto L0
        L57:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Must be called at most once"
            r5.<init>(r6)
            throw r5
        L5f:
            lb r1 = new lb
            r3 = 14
            r1.<init>(r0, r2, r6, r3)
        L66:
            boolean r2 = r5.compareAndSet(r4, r0, r1)
            if (r2 == 0) goto L6d
        L6c:
            return
        L6d:
            java.lang.Object r2 = r5.get(r4)
            if (r2 == r0) goto L66
            goto L0
        L74:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Not completed"
            r5.<init>(r6)
            throw r5
    }

    @Override // defpackage.vg
    public final defpackage.ld b() {
            r1 = this;
            ld r0 = r1.d
            return r0
    }

    @Override // defpackage.qe
    public final defpackage.qe c() {
            r2 = this;
            ld r0 = r2.d
            boolean r1 = r0 instanceof defpackage.qe
            if (r1 == 0) goto L9
            qe r0 = (defpackage.qe) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.ld
    public final defpackage.ge d() {
            r1 = this;
            ge r0 = r1.e
            return r0
    }

    @Override // defpackage.vg
    public final java.lang.Throwable e(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.e(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // defpackage.ld
    public final void f(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = defpackage.f10.a(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            nb r3 = new nb
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            int r0 = r2.c
            r(r2, r3, r0)
            return
    }

    @Override // defpackage.vg
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.lb
            if (r0 == 0) goto L8
            lb r2 = (defpackage.lb) r2
            java.lang.Object r2 = r2.a
        L8:
            return r2
    }

    @Override // defpackage.vg
    public final java.lang.Object i() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i8.g
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public final void j(defpackage.ah r3, java.lang.Throwable r4) {
            r2 = this;
            r3.a(r4)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            pb r4 = new pb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            ge r3 = r2.e
            defpackage.ff.u(r3, r4)
            return
    }

    public final void k(java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i8.g
            java.lang.Object r1 = r0.get(r4)
            boolean r2 = r1 instanceof defpackage.ow
            if (r2 != 0) goto Lb
            return
        Lb:
            l8 r2 = new l8
            boolean r3 = r1 instanceof defpackage.ah
            r2.<init>(r4, r5, r3)
        L12:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L43
            r0 = r1
            ow r0 = (defpackage.ow) r0
            boolean r0 = r0 instanceof defpackage.ah
            if (r0 == 0) goto L24
            ah r1 = (defpackage.ah) r1
            r4.j(r1, r5)
        L24:
            boolean r5 = r4.o()
            if (r5 != 0) goto L3d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.i8.h
            java.lang.Object r0 = r5.get(r4)
            zg r0 = (defpackage.zg) r0
            if (r0 != 0) goto L35
            goto L3d
        L35:
            r0.b()
            nw r0 = defpackage.nw.a
            r5.set(r4, r0)
        L3d:
            int r5 = r4.c
            r4.l(r5)
            return
        L43:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L12
            goto L0
    }

    public final void l(int r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.i8.f
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            if (r2 == 0) goto L89
            r0 = 1
            if (r2 != r0) goto L81
            r1 = 4
            r2 = 0
            if (r7 != r1) goto L13
            r1 = r0
            goto L14
        L13:
            r1 = r2
        L14:
            ld r3 = r6.d
            if (r1 != 0) goto L7d
            boolean r4 = r3 instanceof defpackage.tg
            if (r4 == 0) goto L7d
            r4 = 2
            if (r7 == r0) goto L24
            if (r7 != r4) goto L22
            goto L24
        L22:
            r7 = r2
            goto L25
        L24:
            r7 = r0
        L25:
            int r5 = r6.c
            if (r5 == r0) goto L2b
            if (r5 != r4) goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r7 != r2) goto L7d
            r7 = r3
            tg r7 = (defpackage.tg) r7
            ke r1 = r7.d
            m50 r7 = r7.e
            ge r7 = r7.b
            defpackage.ip.l(r7)
            boolean r2 = r1.e()
            if (r2 == 0) goto L44
            r1.d(r7, r6)
            return
        L44:
            kj r7 = defpackage.t60.a()
            long r1 = r7.c
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L62
            k6 r0 = r7.e
            if (r0 != 0) goto L5e
            k6 r0 = new k6
            r0.<init>()
            r7.e = r0
        L5e:
            r0.addLast(r6)
            return
        L62:
            r7.k(r0)
            defpackage.ip.S(r6, r3, r0)     // Catch: java.lang.Throwable -> L72
        L68:
            boolean r0 = r7.l()     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L68
        L6e:
            r7.f()
            goto L96
        L72:
            r0 = move-exception
            r1 = 0
            r6.h(r0, r1)     // Catch: java.lang.Throwable -> L78
            goto L6e
        L78:
            r0 = move-exception
            r7.f()
            throw r0
        L7d:
            defpackage.ip.S(r6, r3, r1)
            return
        L81:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r7.<init>(r0)
            throw r7
        L89:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = r3 + r2
            boolean r0 = r0.compareAndSet(r6, r1, r3)
            if (r0 == 0) goto L0
        L96:
            return
    }

    public final defpackage.zg m() {
            r4 = this;
            ge r0 = r4.e
            vh r1 = defpackage.vh.h
            ee r0 = r0.b(r1)
            mp r0 = (defpackage.mp) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            ca r2 = new ca
            r2.<init>(r4)
            r3 = 2
            zg r0 = defpackage.a80.p(r0, r2, r3)
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.i8.h
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L21
            goto L27
        L21:
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L18
        L27:
            return r0
    }

    public final void n(defpackage.sm r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ah
            if (r0 == 0) goto L7
            ah r7 = (defpackage.ah) r7
            goto Le
        L7:
            ah r0 = new ah
            r1 = 1
            r0.<init>(r1, r7)
            r7 = r0
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i8.g
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof defpackage.o1
            if (r2 == 0) goto L26
        L18:
            boolean r2 = r0.compareAndSet(r6, r1, r7)
            if (r2 == 0) goto L1f
            goto L82
        L1f:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L18
            goto Le
        L26:
            boolean r2 = r1 instanceof defpackage.ah
            r3 = 0
            if (r2 != 0) goto L8a
            boolean r2 = r1 instanceof defpackage.nb
            if (r2 == 0) goto L4a
            r0 = r1
            nb r0 = (defpackage.nb) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.nb.b
            r4 = 0
            r5 = 1
            boolean r2 = r2.compareAndSet(r0, r4, r5)
            if (r2 == 0) goto L46
            boolean r1 = r1 instanceof defpackage.l8
            if (r1 == 0) goto L82
            java.lang.Throwable r0 = r0.a
            r6.j(r7, r0)
            return
        L46:
            p(r7, r1)
            throw r3
        L4a:
            boolean r2 = r1 instanceof defpackage.lb
            if (r2 == 0) goto L75
            r2 = r1
            lb r2 = (defpackage.lb) r2
            ah r4 = r2.b
            if (r4 != 0) goto L71
            java.lang.Throwable r4 = r2.e
            if (r4 == 0) goto L5d
            r6.j(r7, r4)
            return
        L5d:
            r4 = 29
            lb r2 = defpackage.lb.a(r2, r7, r3, r4)
        L63:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L6a
            goto L82
        L6a:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L63
            goto Le
        L71:
            p(r7, r1)
            throw r3
        L75:
            lb r2 = new lb
            r4 = 28
            r2.<init>(r1, r7, r3, r4)
        L7c:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L83
        L82:
            return
        L83:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L7c
            goto Le
        L8a:
            p(r7, r1)
            throw r3
    }

    public final boolean o() {
            r2 = this;
            int r0 = r2.c
            r1 = 2
            if (r0 != r1) goto L18
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            ld r1 = r2.d
            defpackage.ip.m(r0, r1)
            tg r1 = (defpackage.tg) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.tg.h
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final void q() {
            r5 = this;
            ld r0 = r5.d
            boolean r1 = r0 instanceof defpackage.tg
            r2 = 0
            if (r1 == 0) goto La
            tg r0 = (defpackage.tg) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L73
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.tg.h
        Lf:
            java.lang.Object r3 = r1.get(r0)
            l0 r4 = defpackage.a80.e
            if (r3 != r4) goto L25
        L17:
            boolean r3 = r1.compareAndSet(r0, r4, r5)
            if (r3 == 0) goto L1e
            goto L32
        L1e:
            java.lang.Object r3 = r1.get(r0)
            if (r3 == r4) goto L17
            goto Lf
        L25:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L5b
        L29:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L4c
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L32:
            if (r2 != 0) goto L35
            goto L73
        L35:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i8.h
            java.lang.Object r1 = r0.get(r5)
            zg r1 = (defpackage.zg) r1
            if (r1 != 0) goto L40
            goto L48
        L40:
            r1.b()
            nw r1 = defpackage.nw.a
            r0.set(r5, r1)
        L48:
            r5.k(r2)
            return
        L4c:
            java.lang.Object r4 = r1.get(r0)
            if (r4 != r3) goto L53
            goto L29
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            r0.<init>(r1)
            throw r0
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L73:
            return
    }

    public final void s(defpackage.ke r5) {
            r4 = this;
            vh r0 = defpackage.vh.n
            ld r1 = r4.d
            boolean r2 = r1 instanceof defpackage.tg
            r3 = 0
            if (r2 == 0) goto Lc
            tg r1 = (defpackage.tg) r1
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 == 0) goto L11
            ke r3 = r1.d
        L11:
            if (r3 != r5) goto L15
            r5 = 4
            goto L17
        L15:
            int r5 = r4.c
        L17:
            r(r4, r0, r5)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancellableContinuation("
            r0.<init>(r1)
            ld r1 = r3.d
            java.lang.String r1 = defpackage.ff.T(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.i8.g
            java.lang.Object r1 = r1.get(r3)
            boolean r2 = r1 instanceof defpackage.ow
            if (r2 == 0) goto L22
            java.lang.String r1 = "Active"
            goto L2b
        L22:
            boolean r1 = r1 instanceof defpackage.l8
            if (r1 == 0) goto L29
            java.lang.String r1 = "Cancelled"
            goto L2b
        L29:
            java.lang.String r1 = "Completed"
        L2b:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = defpackage.ff.s(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
