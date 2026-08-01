package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wp implements defpackage.mp, defpackage.lx {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    static {
            java.lang.String r0 = "_state"
            java.lang.Class<wp> r1 = defpackage.wp.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.wp.a = r0
            java.lang.String r0 = "_parentHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            defpackage.wp.b = r0
            return
    }

    public wp(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            ui r1 = defpackage.ip.l
            goto La
        L8:
            ui r1 = defpackage.ip.k
        La:
            r0._state = r1
            return
    }

    public static defpackage.ea D(defpackage.vr r2) {
        L0:
            boolean r0 = r2.j()
            if (r0 == 0) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vr.b
            vr r1 = r2.e()
            if (r1 != 0) goto L22
            java.lang.Object r2 = r0.get(r2)
            vr r2 = (defpackage.vr) r2
        L14:
            boolean r1 = r2.j()
            if (r1 != 0) goto L1b
            goto L0
        L1b:
            java.lang.Object r2 = r0.get(r2)
            vr r2 = (defpackage.vr) r2
            goto L14
        L22:
            r2 = r1
            goto L0
        L24:
            vr r2 = r2.i()
            boolean r0 = r2.j()
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof defpackage.ea
            if (r0 == 0) goto L35
            ea r2 = (defpackage.ea) r2
            return r2
        L35:
            boolean r0 = r2 instanceof defpackage.mw
            if (r0 == 0) goto L24
            r2 = 0
            return r2
    }

    public static java.lang.String I(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.up
            if (r0 == 0) goto L18
            up r1 = (defpackage.up) r1
            boolean r0 = r1.e()
            if (r0 == 0) goto Lf
            java.lang.String r1 = "Cancelling"
            return r1
        Lf:
            boolean r1 = r1.f()
            if (r1 == 0) goto L24
            java.lang.String r1 = "Completing"
            return r1
        L18:
            boolean r0 = r1 instanceof defpackage.vo
            if (r0 == 0) goto L2a
            vo r1 = (defpackage.vo) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L27
        L24:
            java.lang.String r1 = "Active"
            return r1
        L27:
            java.lang.String r1 = "New"
            return r1
        L2a:
            boolean r1 = r1 instanceof defpackage.nb
            if (r1 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            return r1
        L31:
            java.lang.String r1 = "Completed"
            return r1
    }

    public final void A(defpackage.mp r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wp.b
            nw r1 = defpackage.nw.a
            if (r7 != 0) goto La
            r0.set(r6, r1)
            return
        La:
            wp r7 = (defpackage.wp) r7
        Lc:
            java.lang.Object r2 = r7.x()
            boolean r3 = r2 instanceof defpackage.ui
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.wp.a
            if (r3 == 0) goto L31
            r3 = r2
            ui r3 = (defpackage.ui) r3
            boolean r3 = r3.a
            if (r3 == 0) goto L1e
            goto L4b
        L1e:
            ui r3 = defpackage.ip.l
        L20:
            boolean r5 = r4.compareAndSet(r7, r2, r3)
            if (r5 == 0) goto L2a
            r7.getClass()
            goto L4b
        L2a:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r2) goto L20
            goto Lc
        L31:
            boolean r3 = r2 instanceof defpackage.uo
            if (r3 == 0) goto L4b
            r3 = r2
            uo r3 = (defpackage.uo) r3
            mw r3 = r3.a
        L3a:
            boolean r5 = r4.compareAndSet(r7, r2, r3)
            if (r5 == 0) goto L44
            r7.getClass()
            goto L4b
        L44:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r2) goto L3a
            goto Lc
        L4b:
            ea r2 = new ea
            r2.<init>(r6)
            r3 = 2
            zg r7 = defpackage.a80.p(r7, r2, r3)
            da r7 = (defpackage.da) r7
            r0.set(r6, r7)
            java.lang.Object r2 = r6.x()
            boolean r2 = r2 instanceof defpackage.vo
            if (r2 != 0) goto L68
            r7.b()
            r0.set(r6, r1)
        L68:
            return
    }

    public boolean B() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.Object C(java.lang.Object r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.x()
            java.lang.Object r0 = r4.J(r0, r5)
            l0 r1 = defpackage.ip.f
            if (r0 != r1) goto L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            boolean r2 = r5 instanceof defpackage.nb
            r3 = 0
            if (r2 == 0) goto L2c
            nb r5 = (defpackage.nb) r5
            goto L2d
        L2c:
            r5 = r3
        L2d:
            if (r5 == 0) goto L31
            java.lang.Throwable r3 = r5.a
        L31:
            r0.<init>(r1, r3)
            throw r0
        L35:
            l0 r1 = defpackage.ip.h
            if (r0 == r1) goto L0
            return r0
    }

    public final void E(defpackage.mw r7, java.lang.Throwable r8) {
            r6 = this;
            java.lang.Object r0 = r7.h()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            defpackage.ip.m(r1, r0)
            vr r0 = (defpackage.vr) r0
            r1 = 0
        Lc:
            boolean r2 = r0.equals(r7)
            if (r2 != 0) goto L44
            boolean r2 = r0 instanceof defpackage.op
            if (r2 == 0) goto L3f
            r2 = r0
            sp r2 = (defpackage.sp) r2
            r2.l(r8)     // Catch: java.lang.Throwable -> L1d
            goto L3f
        L1d:
            r3 = move-exception
            if (r1 == 0) goto L24
            defpackage.ip.f(r1, r3)
            goto L3f
        L24:
            pb r1 = new pb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception in completion handler "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " for "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2, r3)
        L3f:
            vr r0 = r0.i()
            goto Lc
        L44:
            if (r1 == 0) goto L49
            r6.z(r1)
        L49:
            r6.n(r8)
            return
    }

    public void F(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void G() {
            r0 = this;
            return
    }

    public final void H(defpackage.sp r4) {
            r3 = this;
            mw r0 = new mw
            r0.<init>()
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.vr.b
            r1.lazySet(r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.vr.a
            r1.lazySet(r0, r4)
        L12:
            java.lang.Object r2 = r4.h()
            if (r2 == r4) goto L19
            goto L22
        L19:
            boolean r2 = r1.compareAndSet(r4, r4, r0)
            if (r2 == 0) goto L36
            r0.g(r4)
        L22:
            vr r2 = r4.i()
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wp.a
            boolean r1 = r0.compareAndSet(r3, r4, r2)
            if (r1 == 0) goto L2f
            return
        L2f:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L26
            return
        L36:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r4) goto L19
            goto L12
    }

    public final java.lang.Object J(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.vo
            if (r0 != 0) goto L7
            l0 r7 = defpackage.ip.f
            return r7
        L7:
            boolean r0 = r7 instanceof defpackage.ui
            if (r0 != 0) goto Lf
            boolean r0 = r7 instanceof defpackage.sp
            if (r0 == 0) goto L41
        Lf:
            boolean r0 = r7 instanceof defpackage.ea
            if (r0 != 0) goto L41
            boolean r0 = r8 instanceof defpackage.nb
            if (r0 != 0) goto L41
            r0 = r7
            vo r0 = (defpackage.vo) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.wp.a
            boolean r7 = r8 instanceof defpackage.vo
            if (r7 == 0) goto L2a
            wo r7 = new wo
            r2 = r8
            vo r2 = (defpackage.vo) r2
            r7.<init>(r2)
            r2 = r7
            goto L2b
        L2a:
            r2 = r8
        L2b:
            boolean r7 = r1.compareAndSet(r6, r0, r2)
            if (r7 == 0) goto L38
            r6.F(r8)
            r6.q(r0, r8)
            return r8
        L38:
            java.lang.Object r7 = r1.get(r6)
            if (r7 == r0) goto L2b
            l0 r7 = defpackage.ip.h
            return r7
        L41:
            vo r7 = (defpackage.vo) r7
            mw r0 = r6.w(r7)
            if (r0 != 0) goto L4c
            l0 r7 = defpackage.ip.h
            return r7
        L4c:
            boolean r1 = r7 instanceof defpackage.up
            r2 = 0
            if (r1 == 0) goto L55
            r1 = r7
            up r1 = (defpackage.up) r1
            goto L56
        L55:
            r1 = r2
        L56:
            if (r1 != 0) goto L5d
            up r1 = new up
            r1.<init>(r0, r2)
        L5d:
            monitor-enter(r1)
            boolean r3 = r1.f()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6b
            l0 r7 = defpackage.ip.f     // Catch: java.lang.Throwable -> L68
            monitor-exit(r1)
            return r7
        L68:
            r7 = move-exception
            goto Lde
        L6b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.up.b     // Catch: java.lang.Throwable -> L68
            r4 = 1
            r3.set(r1, r4)     // Catch: java.lang.Throwable -> L68
            if (r1 == r7) goto L86
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.wp.a     // Catch: java.lang.Throwable -> L68
        L75:
            boolean r5 = r3.compareAndSet(r6, r7, r1)     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L7c
            goto L86
        L7c:
            java.lang.Object r5 = r3.get(r6)     // Catch: java.lang.Throwable -> L68
            if (r5 == r7) goto L75
            l0 r7 = defpackage.ip.h     // Catch: java.lang.Throwable -> L68
            monitor-exit(r1)
            return r7
        L86:
            boolean r3 = r1.e()     // Catch: java.lang.Throwable -> L68
            boolean r5 = r8 instanceof defpackage.nb     // Catch: java.lang.Throwable -> L68
            if (r5 == 0) goto L92
            r5 = r8
            nb r5 = (defpackage.nb) r5     // Catch: java.lang.Throwable -> L68
            goto L93
        L92:
            r5 = r2
        L93:
            if (r5 == 0) goto L9a
            java.lang.Throwable r5 = r5.a     // Catch: java.lang.Throwable -> L68
            r1.b(r5)     // Catch: java.lang.Throwable -> L68
        L9a:
            java.lang.Throwable r5 = r1.c()     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto La1
            goto La2
        La1:
            r5 = r2
        La2:
            monitor-exit(r1)
            if (r5 == 0) goto La8
            r6.E(r0, r5)
        La8:
            boolean r0 = r7 instanceof defpackage.ea
            if (r0 == 0) goto Lb0
            r0 = r7
            ea r0 = (defpackage.ea) r0
            goto Lb1
        Lb0:
            r0 = r2
        Lb1:
            if (r0 != 0) goto Lbe
            mw r7 = r7.d()
            if (r7 == 0) goto Lbf
            ea r2 = D(r7)
            goto Lbf
        Lbe:
            r2 = r0
        Lbf:
            if (r2 == 0) goto Ld9
        Lc1:
            wp r7 = r2.e
            tp r0 = new tp
            r0.<init>(r6, r1, r2, r8)
            zg r7 = defpackage.a80.p(r7, r0, r4)
            nw r0 = defpackage.nw.a
            if (r7 == r0) goto Ld3
            l0 r7 = defpackage.ip.g
            return r7
        Ld3:
            ea r2 = D(r2)
            if (r2 != 0) goto Lc1
        Ld9:
            java.lang.Object r7 = r6.s(r1, r8)
            return r7
        Lde:
            monitor-exit(r1)
            throw r7
    }

    @Override // defpackage.mp
    public boolean a() {
            r2 = this;
            java.lang.Object r0 = r2.x()
            boolean r1 = r0 instanceof defpackage.vo
            if (r1 == 0) goto L12
            vo r0 = (defpackage.vo) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // defpackage.ge
    public final defpackage.ee b(defpackage.fe r2) {
            r1 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r2)
            vh r0 = defpackage.vh.h
            boolean r2 = defpackage.ip.i(r0, r2)
            if (r2 == 0) goto Le
            return r1
        Le:
            r2 = 0
            return r2
    }

    @Override // defpackage.ge
    public final defpackage.ge g(defpackage.fe r1) {
            r0 = this;
            ge r1 = defpackage.ff.B(r0, r1)
            return r1
    }

    @Override // defpackage.ee
    public final defpackage.fe getKey() {
            r1 = this;
            vh r0 = defpackage.vh.h
            return r0
    }

    @Override // defpackage.ge
    public final java.lang.Object h(java.lang.Object r1, defpackage.wm r2) {
            r0 = this;
            java.lang.Object r1 = r2.e(r1, r0)
            return r1
    }

    @Override // defpackage.ge
    public final defpackage.ge i(defpackage.ge r1) {
            r0 = this;
            ge r1 = defpackage.ff.E(r0, r1)
            return r1
    }

    public final boolean j(defpackage.vo r4, defpackage.mw r5, defpackage.sp r6) {
            r3 = this;
            vp r0 = new vp
            r0.<init>(r6, r3, r4)
        L5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.vr.b
            vr r1 = r5.e()
            if (r1 != 0) goto L21
            java.lang.Object r1 = r4.get(r5)
            vr r1 = (defpackage.vr) r1
        L13:
            boolean r2 = r1.j()
            if (r2 != 0) goto L1a
            goto L21
        L1a:
            java.lang.Object r1 = r4.get(r1)
            vr r1 = (defpackage.vr) r1
            goto L13
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.vr.b
            r4.lazySet(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.vr.a
            r4.lazySet(r6, r5)
            r0.c = r5
        L2d:
            boolean r2 = r4.compareAndSet(r1, r5, r0)
            if (r2 == 0) goto L3d
            java.lang.Object r4 = r0.a(r1)
            if (r4 != 0) goto L3b
            r4 = 1
            return r4
        L3b:
            r4 = 0
            return r4
        L3d:
            java.lang.Object r2 = r4.get(r1)
            if (r2 == r5) goto L2d
            goto L5
    }

    public void k(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void l(java.lang.Object r1) {
            r0 = this;
            r0.k(r1)
            return
    }

    public final boolean m(java.lang.Object r10) {
            r9 = this;
            l0 r0 = defpackage.ip.f
            boolean r1 = r9.v()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3a
        La:
            java.lang.Object r0 = r9.x()
            boolean r1 = r0 instanceof defpackage.vo
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof defpackage.up
            if (r1 == 0) goto L20
            r1 = r0
            up r1 = (defpackage.up) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L20
            goto L32
        L20:
            nb r1 = new nb
            java.lang.Throwable r4 = r9.r(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.J(r0, r1)
            l0 r1 = defpackage.ip.h
            if (r0 == r1) goto La
            goto L34
        L32:
            l0 r0 = defpackage.ip.f
        L34:
            l0 r1 = defpackage.ip.g
            if (r0 != r1) goto L3a
            goto Lfc
        L3a:
            l0 r1 = defpackage.ip.f
            if (r0 != r1) goto Lf3
            r0 = 0
            r1 = r0
        L40:
            java.lang.Object r4 = r9.x()
            boolean r5 = r4 instanceof defpackage.up
            if (r5 == 0) goto L8f
            monitor-enter(r4)
            r5 = r4
            up r5 = (defpackage.up) r5     // Catch: java.lang.Throwable -> L61
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.up.d     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> L61
            l0 r6 = defpackage.ip.j     // Catch: java.lang.Throwable -> L61
            if (r5 != r6) goto L58
            r5 = r3
            goto L59
        L58:
            r5 = r2
        L59:
            if (r5 == 0) goto L63
            l0 r10 = defpackage.ip.i     // Catch: java.lang.Throwable -> L61
            monitor-exit(r4)
        L5e:
            r0 = r10
            goto Lf3
        L61:
            r10 = move-exception
            goto L8d
        L63:
            r5 = r4
            up r5 = (defpackage.up) r5     // Catch: java.lang.Throwable -> L61
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto L70
            java.lang.Throwable r1 = r9.r(r10)     // Catch: java.lang.Throwable -> L61
        L70:
            r10 = r4
            up r10 = (defpackage.up) r10     // Catch: java.lang.Throwable -> L61
            r10.b(r1)     // Catch: java.lang.Throwable -> L61
            r10 = r4
            up r10 = (defpackage.up) r10     // Catch: java.lang.Throwable -> L61
            java.lang.Throwable r10 = r10.c()     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L80
            r0 = r10
        L80:
            monitor-exit(r4)
            if (r0 == 0) goto L8a
            up r4 = (defpackage.up) r4
            mw r10 = r4.a
            r9.E(r10, r0)
        L8a:
            l0 r10 = defpackage.ip.f
            goto L5e
        L8d:
            monitor-exit(r4)
            throw r10
        L8f:
            boolean r5 = r4 instanceof defpackage.vo
            if (r5 == 0) goto Lef
            if (r1 != 0) goto L99
            java.lang.Throwable r1 = r9.r(r10)
        L99:
            r5 = r4
            vo r5 = (defpackage.vo) r5
            boolean r6 = r5.a()
            if (r6 == 0) goto Lc4
            mw r6 = r9.w(r5)
            if (r6 != 0) goto La9
            goto L40
        La9:
            up r7 = new up
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.wp.a
        Lb0:
            boolean r4 = r8.compareAndSet(r9, r5, r7)
            if (r4 == 0) goto Lbc
            r9.E(r6, r1)
            l0 r10 = defpackage.ip.f
            goto L5e
        Lbc:
            java.lang.Object r4 = r8.get(r9)
            if (r4 == r5) goto Lb0
            goto L40
        Lc4:
            nb r5 = new nb
            r5.<init>(r1, r2)
            java.lang.Object r5 = r9.J(r4, r5)
            l0 r6 = defpackage.ip.f
            if (r5 == r6) goto Ld7
            l0 r4 = defpackage.ip.h
            if (r5 == r4) goto L40
            r0 = r5
            goto Lf3
        Ld7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot happen in "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lef:
            l0 r10 = defpackage.ip.i
            goto L5e
        Lf3:
            l0 r10 = defpackage.ip.f
            if (r0 != r10) goto Lf8
            goto Lfc
        Lf8:
            l0 r10 = defpackage.ip.g
            if (r0 != r10) goto Lfd
        Lfc:
            return r3
        Lfd:
            l0 r10 = defpackage.ip.i
            if (r0 != r10) goto L102
            return r2
        L102:
            r9.k(r0)
            return r3
    }

    public final boolean n(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.B()
            if (r0 == 0) goto L7
            goto L23
        L7:
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.wp.b
            java.lang.Object r1 = r1.get(r3)
            da r1 = (defpackage.da) r1
            if (r1 == 0) goto L25
            nw r2 = defpackage.nw.a
            if (r1 != r2) goto L18
            goto L25
        L18:
            boolean r4 = r1.c(r4)
            if (r4 != 0) goto L23
            if (r0 == 0) goto L21
            goto L23
        L21:
            r4 = 0
            return r4
        L23:
            r4 = 1
            return r4
        L25:
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    public boolean p(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r2 = r1.m(r2)
            if (r2 == 0) goto L13
            boolean r2 = r1.u()
            if (r2 == 0) goto L13
        L11:
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final void q(defpackage.vo r8, java.lang.Object r9) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wp.b
            java.lang.Object r1 = r0.get(r7)
            da r1 = (defpackage.da) r1
            if (r1 == 0) goto L12
            r1.b()
            nw r1 = defpackage.nw.a
            r0.set(r7, r1)
        L12:
            boolean r0 = r9 instanceof defpackage.nb
            r1 = 0
            if (r0 == 0) goto L1a
            nb r9 = (defpackage.nb) r9
            goto L1b
        L1a:
            r9 = r1
        L1b:
            if (r9 == 0) goto L20
            java.lang.Throwable r9 = r9.a
            goto L21
        L20:
            r9 = r1
        L21:
            boolean r0 = r8 instanceof defpackage.sp
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4c
            r0 = r8
            sp r0 = (defpackage.sp) r0     // Catch: java.lang.Throwable -> L30
            r0.l(r9)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r9 = move-exception
            pb r0 = new pb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r8)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r9)
            r7.z(r0)
            goto L96
        L4c:
            mw r8 = r8.d()
            if (r8 == 0) goto L96
            java.lang.Object r0 = r8.h()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            defpackage.ip.m(r4, r0)
            vr r0 = (defpackage.vr) r0
        L5d:
            boolean r4 = r0.equals(r8)
            if (r4 != 0) goto L91
            boolean r4 = r0 instanceof defpackage.sp
            if (r4 == 0) goto L8c
            r4 = r0
            sp r4 = (defpackage.sp) r4
            r4.l(r9)     // Catch: java.lang.Throwable -> L6e
            goto L8c
        L6e:
            r5 = move-exception
            if (r1 == 0) goto L75
            defpackage.ip.f(r1, r5)
            goto L8c
        L75:
            pb r1 = new pb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r4)
            r6.append(r2)
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            r1.<init>(r4, r5)
        L8c:
            vr r0 = r0.i()
            goto L5d
        L91:
            if (r1 == 0) goto L96
            r7.z(r1)
        L96:
            return
    }

    public final java.lang.Throwable r(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Throwable
            if (r0 == 0) goto L7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            return r5
        L7:
            lx r5 = (defpackage.lx) r5
            wp r5 = (defpackage.wp) r5
            java.lang.Object r0 = r5.x()
            boolean r1 = r0 instanceof defpackage.up
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r0
            up r1 = (defpackage.up) r1
            java.lang.Throwable r1 = r1.c()
            goto L2b
        L1c:
            boolean r1 = r0 instanceof defpackage.nb
            if (r1 == 0) goto L26
            r1 = r0
            nb r1 = (defpackage.nb) r1
            java.lang.Throwable r1 = r1.a
            goto L2b
        L26:
            boolean r1 = r0 instanceof defpackage.vo
            if (r1 != 0) goto L44
            r1 = r2
        L2b:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L32
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L32:
            if (r2 != 0) goto L43
            np r2 = new np
            java.lang.String r0 = I(r0)
            java.lang.String r3 = "Parent job is "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0, r1, r5)
        L43:
            return r2
        L44:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot be cancelling child in this state: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public final java.lang.Object s(defpackage.up r11, java.lang.Object r12) {
            r10 = this;
            boolean r0 = r12 instanceof defpackage.nb
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r12
            nb r0 = (defpackage.nb) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r0.a
            goto L10
        Lf:
            r0 = r1
        L10:
            monitor-enter(r11)
            r11.e()     // Catch: java.lang.Throwable -> Ld3
            java.util.ArrayList r2 = r11.g(r0)     // Catch: java.lang.Throwable -> Ld3
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld3
            r4 = 0
            if (r3 == 0) goto L30
            boolean r3 = r11.e()     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto L50
            np r3 = new np     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = r10.o()     // Catch: java.lang.Throwable -> Ld3
            r3.<init>(r5, r1, r10)     // Catch: java.lang.Throwable -> Ld3
            r1 = r3
            goto L50
        L30:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            r5 = r4
        L35:
            if (r5 >= r3) goto L45
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> Ld3
            int r5 = r5 + 1
            r7 = r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> Ld3
            boolean r7 = r7 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Ld3
            if (r7 != 0) goto L35
            r1 = r6
        L45:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Ld3
            if (r1 == 0) goto L4a
            goto L50
        L4a:
            java.lang.Object r1 = r2.get(r4)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Ld3
        L50:
            r3 = 1
            if (r1 == 0) goto L88
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            if (r5 > r3) goto L5a
            goto L88
        L5a:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> Ld3
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Ld3
            java.util.Set r5 = java.util.Collections.newSetFromMap(r6)     // Catch: java.lang.Throwable -> Ld3
            int r6 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            r7 = r4
        L6c:
            if (r7 >= r6) goto L88
            java.lang.Object r8 = r2.get(r7)     // Catch: java.lang.Throwable -> Ld3
            int r7 = r7 + 1
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> Ld3
            if (r8 == r1) goto L6c
            if (r8 == r1) goto L6c
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Ld3
            if (r9 != 0) goto L6c
            boolean r9 = r5.add(r8)     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto L6c
            defpackage.ip.f(r1, r8)     // Catch: java.lang.Throwable -> Ld3
            goto L6c
        L88:
            monitor-exit(r11)
            if (r1 != 0) goto L8c
            goto L94
        L8c:
            if (r1 != r0) goto L8f
            goto L94
        L8f:
            nb r12 = new nb
            r12.<init>(r1, r4)
        L94:
            if (r1 == 0) goto Laf
            boolean r0 = r10.n(r1)
            if (r0 != 0) goto La2
            boolean r0 = r10.y(r1)
            if (r0 == 0) goto Laf
        La2:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            defpackage.ip.m(r0, r12)
            r0 = r12
            nb r0 = (defpackage.nb) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.nb.b
            r1.compareAndSet(r0, r4, r3)
        Laf:
            r10.F(r12)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wp.a
            boolean r1 = r12 instanceof defpackage.vo
            if (r1 == 0) goto Lc1
            wo r1 = new wo
            r2 = r12
            vo r2 = (defpackage.vo) r2
            r1.<init>(r2)
            goto Lc2
        Lc1:
            r1 = r12
        Lc2:
            boolean r2 = r0.compareAndSet(r10, r11, r1)
            if (r2 == 0) goto Lc9
            goto Lcf
        Lc9:
            java.lang.Object r2 = r0.get(r10)
            if (r2 == r11) goto Lc2
        Lcf:
            r10.q(r11, r12)
            return r12
        Ld3:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
    }

    public final java.util.concurrent.CancellationException t() {
            r4 = this;
            java.lang.Object r0 = r4.x()
            boolean r1 = r0 instanceof defpackage.up
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L4d
            up r0 = (defpackage.up) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L37
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = r1.concat(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L28
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L28:
            if (r3 != 0) goto L36
            np r2 = new np
            if (r1 != 0) goto L32
            java.lang.String r1 = r4.o()
        L32:
            r2.<init>(r1, r0, r4)
            return r2
        L36:
            return r3
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4d:
            boolean r1 = r0 instanceof defpackage.vo
            if (r1 != 0) goto L81
            boolean r1 = r0 instanceof defpackage.nb
            if (r1 == 0) goto L6d
            nb r0 = (defpackage.nb) r0
            java.lang.Throwable r0 = r0.a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L60
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L60:
            if (r3 != 0) goto L6c
            np r1 = new np
            java.lang.String r2 = r4.o()
            r1.<init>(r2, r0, r4)
            return r1
        L6c:
            return r3
        L6d:
            np r0 = new np
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3, r4)
            return r0
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object r2 = r3.x()
            java.lang.String r2 = I(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.ff.s(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean u() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean v() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final defpackage.mw w(defpackage.vo r4) {
            r3 = this;
            mw r0 = r4.d()
            if (r0 != 0) goto L33
            boolean r0 = r4 instanceof defpackage.ui
            if (r0 == 0) goto L10
            mw r4 = new mw
            r4.<init>()
            return r4
        L10:
            boolean r0 = r4 instanceof defpackage.sp
            if (r0 == 0) goto L1b
            sp r4 = (defpackage.sp) r4
            r3.H(r4)
            r4 = 0
            return r4
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "State should have list: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L33:
            return r0
    }

    public final java.lang.Object x() {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.wp.a
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof defpackage.dx
            if (r1 != 0) goto Lb
            return r0
        Lb:
            dx r0 = (defpackage.dx) r0
            r0.a(r2)
            goto L0
    }

    public boolean y(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void z(defpackage.pb r1) {
            r0 = this;
            throw r1
    }
}
