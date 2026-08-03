package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class g extends qg.b0 implements qg.f, yf.d, qg.o1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f11046l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11047m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11048n = null;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wf.c f11049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wf.g f11050k;

    static {
            java.lang.String r0 = "_decisionAndIndex$volatile"
            java.lang.Class<qg.g> r1 = qg.g.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            qg.g.f11046l = r0
            java.lang.String r0 = "_state$volatile"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.g.f11047m = r0
            java.lang.String r0 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.g.f11048n = r0
            return
    }

    public g(int r1, wf.c r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f11049j = r2
            wf.g r1 = r2.getContext()
            r0.f11050k = r1
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0._decisionAndIndex$volatile = r1
            qg.b r1 = qg.b.f11033a
            r0._state$volatile = r1
            return
    }

    public static java.lang.Object C(qg.d1 r6, java.lang.Object r7, int r8, fg.q r9) {
            boolean r0 = r7 instanceof qg.n
            if (r0 == 0) goto L5
            return r7
        L5:
            r0 = 1
            if (r8 == r0) goto Ld
            r0 = 2
            if (r8 != r0) goto Lc
            goto Ld
        Lc:
            return r7
        Ld:
            if (r9 != 0) goto L14
            boolean r8 = r6 instanceof qg.e
            if (r8 != 0) goto L14
            return r7
        L14:
            qg.m r0 = new qg.m
            boolean r8 = r6 instanceof qg.e
            if (r8 == 0) goto L1e
            qg.e r6 = (qg.e) r6
        L1c:
            r2 = r6
            goto L20
        L1e:
            r6 = 0
            goto L1c
        L20:
            r4 = 0
            r5 = 16
            r1 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static void u(qg.d1 r3, java.lang.Object r4) {
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

    @Override // qg.f
    public final void A(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f11034i
            r0.m(r1)
            return
    }

    public final void B(qg.p r4, java.lang.Object r5) {
            r3 = this;
            wf.c r0 = r3.f11049j
            boolean r1 = r0 instanceof vg.f
            r2 = 0
            if (r1 == 0) goto La
            vg.f r0 = (vg.f) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L10
            qg.p r0 = r0.f14330j
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != r4) goto L15
            r4 = 4
            goto L17
        L15:
            int r4 = r3.f11034i
        L17:
            r3.z(r5, r4, r2)
            return
    }

    @Override // qg.o1
    public final void a(vg.q r5, int r6) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qg.g.f11046l
            int r1 = r0.get(r4)
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r1 & r2
            if (r3 != r2) goto L1c
            int r2 = r1 >> 29
            int r2 = r2 << 29
            int r2 = r2 + r6
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 == 0) goto L0
            r4.s(r5)
            return
        L1c:
            java.lang.String r5 = "invokeOnCancellation should be called at most once"
            j8.o.A(r5)
            return
    }

    @Override // qg.b0
    public final void b(java.util.concurrent.CancellationException r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof qg.d1
            if (r1 != 0) goto L5f
            boolean r1 = r2 instanceof qg.n
            if (r1 == 0) goto Lf
            goto L56
        Lf:
            boolean r1 = r2 instanceof qg.m
            if (r1 == 0) goto L46
            r1 = r2
            qg.m r1 = (qg.m) r1
            java.lang.Throwable r3 = r1.f11079e
            if (r3 != 0) goto L40
            r3 = 0
            r4 = 15
            qg.m r3 = qg.m.a(r1, r3, r8, r4)
        L21:
            boolean r4 = r0.compareAndSet(r7, r2, r3)
            if (r4 == 0) goto L38
            qg.e r0 = r1.f11076b
            if (r0 == 0) goto L2e
            r7.h(r0, r8)
        L2e:
            fg.q r0 = r1.f11077c
            if (r0 == 0) goto L56
            java.lang.Object r1 = r1.f11075a
            r7.i(r0, r8, r1)
            return
        L38:
            java.lang.Object r4 = r0.get(r7)
            if (r4 == r2) goto L21
            r5 = r8
            goto L5d
        L40:
            java.lang.String r8 = "Must be called at most once"
            j8.o.A(r8)
            return
        L46:
            qg.m r1 = new qg.m
            r4 = 0
            r6 = 14
            r3 = 0
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
        L50:
            boolean r8 = r0.compareAndSet(r7, r2, r1)
            if (r8 == 0) goto L57
        L56:
            return
        L57:
            java.lang.Object r8 = r0.get(r7)
            if (r8 == r2) goto L50
        L5d:
            r8 = r5
            goto L0
        L5f:
            java.lang.String r8 = "Not completed"
            j8.o.A(r8)
            return
    }

    @Override // qg.b0
    public final wf.c c() {
            r1 = this;
            wf.c r0 = r1.f11049j
            return r0
    }

    @Override // qg.b0
    public final java.lang.Throwable d(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.d(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // qg.b0
    public final java.lang.Object e(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof qg.m
            if (r0 == 0) goto L8
            qg.m r2 = (qg.m) r2
            java.lang.Object r2 = r2.f11075a
        L8:
            return r2
    }

    @Override // qg.b0
    public final java.lang.Object g() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // yf.d
    public final yf.d getCallerFrame() {
            r2 = this;
            wf.c r0 = r2.f11049j
            boolean r1 = r0 instanceof yf.d
            if (r1 == 0) goto L9
            yf.d r0 = (yf.d) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.g r0 = r1.f11050k
            return r0
    }

    public final void h(qg.e r3, java.lang.Throwable r4) {
            r2 = this;
            int r0 = r3.f11041a     // Catch: java.lang.Throwable -> L15
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }     // Catch: java.lang.Throwable -> L15
        L5:
            java.lang.Object r3 = r3.f11042b     // Catch: java.lang.Throwable -> L15
            qg.d0 r3 = (qg.d0) r3     // Catch: java.lang.Throwable -> L15
            r3.a()     // Catch: java.lang.Throwable -> L15
            goto L14
        Ld:
            java.lang.Object r3 = r3.f11042b     // Catch: java.lang.Throwable -> L15
            fg.l r3 = (fg.l) r3     // Catch: java.lang.Throwable -> L15
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L15
        L14:
            return
        L15:
            r3 = move-exception
            af.d r4 = new af.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            wf.g r3 = r2.f11050k
            qg.v.m(r4, r3)
            return
    }

    public final void i(fg.q r3, java.lang.Throwable r4, java.lang.Object r5) {
            r2 = this;
            wf.g r0 = r2.f11050k
            r3.b(r4, r5, r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            af.d r4 = new af.d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            r5.<init>(r1)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5, r3)
            qg.v.m(r4, r0)
            return
    }

    @Override // qg.f
    public final l3.q j(java.lang.Object r6, fg.q r7) {
            r5 = this;
            l3.q r0 = qg.v.f11102a
        L2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.g.f11047m
            java.lang.Object r2 = r1.get(r5)
            boolean r3 = r2 instanceof qg.d1
            if (r3 == 0) goto L2c
            r3 = r2
            qg.d1 r3 = (qg.d1) r3
            int r4 = r5.f11034i
            java.lang.Object r3 = C(r3, r6, r4, r7)
        L15:
            boolean r4 = r1.compareAndSet(r5, r2, r3)
            if (r4 == 0) goto L25
            boolean r6 = r5.t()
            if (r6 != 0) goto L24
            r5.l()
        L24:
            return r0
        L25:
            java.lang.Object r4 = r1.get(r5)
            if (r4 == r2) goto L15
            goto L2
        L2c:
            r6 = 0
            return r6
    }

    public final void k(vg.q r4, java.lang.Throwable r5) {
            r3 = this;
            wf.g r5 = r3.f11050k
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qg.g.f11046l
            int r0 = r0.get(r3)
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = r0 & r1
            if (r0 == r1) goto L2a
            r4.g(r0, r5)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            af.d r0 = new af.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            qg.v.m(r0, r5)
            return
        L2a:
            java.lang.String r4 = "The index for Segment.onCancellation(..) is broken"
            j8.o.A(r4)
            return
    }

    public final void l() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11048n
            java.lang.Object r1 = r0.get(r2)
            qg.d0 r1 = (qg.d0) r1
            if (r1 != 0) goto Lb
            return
        Lb:
            r1.a()
            qg.c1 r1 = qg.c1.f11039g
            r0.set(r2, r1)
            return
    }

    public final void m(int r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qg.g.f11046l
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            if (r2 == 0) goto L7a
            r0 = 1
            if (r2 != r0) goto L74
            r1 = 4
            r2 = 0
            if (r7 != r1) goto L13
            r1 = r0
            goto L14
        L13:
            r1 = r2
        L14:
            wf.c r3 = r6.f11049j
            if (r1 != 0) goto L70
            boolean r4 = r3 instanceof vg.f
            if (r4 == 0) goto L70
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
            int r5 = r6.f11034i
            if (r5 == r0) goto L2b
            if (r5 != r4) goto L2c
        L2b:
            r2 = r0
        L2c:
            if (r7 != r2) goto L70
            r7 = r3
            vg.f r7 = (vg.f) r7
            qg.p r1 = r7.f14330j
            yf.c r7 = r7.f14331k
            wf.g r7 = r7.getContext()
            boolean r2 = r1.x(r7)
            if (r2 == 0) goto L43
            r1.w(r7, r6)
            return
        L43:
            qg.g0 r7 = qg.h1.a()
            long r1 = r7.f11052i
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L56
            r7.A(r6)
            return
        L56:
            r7.B(r0)
            qg.v.s(r6, r3, r0)     // Catch: java.lang.Throwable -> L66
        L5c:
            boolean r1 = r7.D()     // Catch: java.lang.Throwable -> L66
            if (r1 != 0) goto L5c
        L62:
            r7.z(r0)
            goto L87
        L66:
            r1 = move-exception
            r6.f(r1)     // Catch: java.lang.Throwable -> L6b
            goto L62
        L6b:
            r1 = move-exception
            r7.z(r0)
            throw r1
        L70:
            qg.v.s(r6, r3, r1)
            return
        L74:
            java.lang.String r7 = "Already resumed"
            j8.o.A(r7)
            return
        L7a:
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r1
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = r3 + r2
            boolean r0 = r0.compareAndSet(r6, r1, r3)
            if (r0 == 0) goto L0
        L87:
            return
    }

    public java.lang.Throwable n(qg.y0 r1) {
            r0 = this;
            java.util.concurrent.CancellationException r1 = r1.h()
            return r1
    }

    public final java.lang.Object o() {
            r5 = this;
            boolean r0 = r5.t()
        L4:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qg.g.f11046l
            int r2 = r1.get(r5)
            int r3 = r2 >> 29
            if (r3 == 0) goto L53
            r1 = 2
            if (r3 != r1) goto L4c
            if (r0 == 0) goto L16
            r5.x()
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r0 = r0.get(r5)
            boolean r2 = r0 instanceof qg.n
            if (r2 != 0) goto L47
            int r2 = r5.f11034i
            r3 = 1
            if (r2 == r3) goto L27
            if (r2 != r1) goto L42
        L27:
            wf.g r1 = r5.f11050k
            qg.q r2 = qg.q.f11090h
            wf.e r1 = r1.s(r2)
            qg.r0 r1 = (qg.r0) r1
            if (r1 == 0) goto L42
            boolean r2 = r1.b()
            if (r2 == 0) goto L3a
            goto L42
        L3a:
            java.util.concurrent.CancellationException r0 = r1.h()
            r5.b(r0)
            throw r0
        L42:
            java.lang.Object r0 = r5.e(r0)
            return r0
        L47:
            qg.n r0 = (qg.n) r0
            java.lang.Throwable r0 = r0.f11082a
            throw r0
        L4c:
            java.lang.String r0 = "Already suspended"
            j8.o.A(r0)
            r0 = 0
            return r0
        L53:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r2
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r4 = r4 + r3
            boolean r1 = r1.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.g.f11048n
            java.lang.Object r1 = r1.get(r5)
            qg.d0 r1 = (qg.d0) r1
            if (r1 != 0) goto L6d
            r5.q()
        L6d:
            if (r0 == 0) goto L72
            r5.x()
        L72:
            xf.a r0 = xf.a.f21579g
            return r0
    }

    public final void p() {
            r2 = this;
            qg.d0 r0 = r2.q()
            if (r0 != 0) goto L7
            goto L1b
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.g.f11047m
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r1 instanceof qg.d1
            if (r1 != 0) goto L1b
            r0.a()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11048n
            qg.c1 r1 = qg.c1.f11039g
            r0.set(r2, r1)
        L1b:
            return
    }

    public final qg.d0 q() {
            r4 = this;
            wf.g r0 = r4.f11050k
            qg.q r1 = qg.q.f11090h
            wf.e r0 = r0.s(r1)
            qg.r0 r0 = (qg.r0) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            qg.i r2 = new qg.i
            r3 = 0
            r2.<init>(r4, r3)
            r3 = 1
            qg.d0 r0 = qg.v.n(r0, r3, r2)
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = qg.g.f11048n
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L22
            goto L28
        L22:
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L19
        L28:
            return r0
    }

    public final void r(fg.l r3) {
            r2 = this;
            qg.e r0 = new qg.e
            r1 = 0
            r0.<init>(r3, r1)
            r2.s(r0)
            return
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            qg.n r3 = new qg.n
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            int r0 = r2.f11034i
            r1 = 0
            r2.z(r3, r0, r1)
            return
    }

    public final void s(qg.d1 r8) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof qg.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof qg.e
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof vg.q
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof qg.n
            if (r1 == 0) goto L4d
            r0 = r2
            qg.n r0 = (qg.n) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qg.n.f11081b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof qg.h
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f11082a
            boolean r1 = r8 instanceof qg.e
            if (r1 == 0) goto L43
            qg.e r8 = (qg.e) r8
            r7.h(r8, r0)
            return
        L43:
            vg.q r8 = (vg.q) r8
            r7.k(r8, r0)
            return
        L49:
            u(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof qg.m
            if (r1 == 0) goto L80
            r1 = r2
            qg.m r1 = (qg.m) r1
            qg.e r4 = r1.f11076b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof vg.q
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            qg.e r4 = (qg.e) r4
            java.lang.Throwable r5 = r1.f11079e
            if (r5 == 0) goto L68
            r7.h(r4, r5)
            return
        L68:
            r5 = 29
            qg.m r1 = qg.m.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            u(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof vg.q
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            qg.e r3 = (qg.e) r3
            qg.m r1 = new qg.m
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            u(r8, r2)
            throw r3
    }

    public final boolean t() {
            r2 = this;
            int r0 = r2.f11034i
            r1 = 2
            if (r0 != r1) goto L13
            wf.c r0 = r2.f11049j
            vg.f r0 = (vg.f) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.f.f14329n
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.v()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            wf.c r1 = r3.f11049j
            java.lang.String r1 = qg.v.u(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.g.f11047m
            java.lang.Object r1 = r1.get(r3)
            boolean r2 = r1 instanceof qg.d1
            if (r2 == 0) goto L2c
            java.lang.String r1 = "Active"
            goto L35
        L2c:
            boolean r1 = r1 instanceof qg.h
            if (r1 == 0) goto L33
            java.lang.String r1 = "Cancelled"
            goto L35
        L33:
            java.lang.String r1 = "Completed"
        L35:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = qg.v.j(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String v() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    @Override // qg.f
    public final boolean w(java.lang.Throwable r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof qg.d1
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            qg.h r2 = new qg.h
            boolean r4 = r1 instanceof qg.e
            r5 = 1
            if (r4 != 0) goto L17
            boolean r4 = r1 instanceof vg.q
            if (r4 == 0) goto L18
        L17:
            r3 = r5
        L18:
            r2.<init>(r6, r7, r3)
        L1b:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L46
            r0 = r1
            qg.d1 r0 = (qg.d1) r0
            boolean r2 = r0 instanceof qg.e
            if (r2 == 0) goto L2e
            qg.e r1 = (qg.e) r1
            r6.h(r1, r7)
            goto L37
        L2e:
            boolean r0 = r0 instanceof vg.q
            if (r0 == 0) goto L37
            vg.q r1 = (vg.q) r1
            r6.k(r1, r7)
        L37:
            boolean r7 = r6.t()
            if (r7 != 0) goto L40
            r6.l()
        L40:
            int r7 = r6.f11034i
            r6.m(r7)
            return r5
        L46:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L1b
            goto L0
    }

    public final void x() {
            r5 = this;
            wf.c r0 = r5.f11049j
            boolean r1 = r0 instanceof vg.f
            r2 = 0
            if (r1 == 0) goto La
            vg.f r0 = (vg.f) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.f.f14329n
        Lf:
            java.lang.Object r3 = r1.get(r0)
            l3.q r4 = vg.a.f14319c
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
            if (r4 == 0) goto L49
        L29:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L3c
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L32:
            if (r2 != 0) goto L35
            goto L4e
        L35:
            r5.l()
            r5.w(r2)
            return
        L3c:
            java.lang.Object r4 = r1.get(r0)
            if (r4 != r3) goto L43
            goto L29
        L43:
            java.lang.String r0 = "Failed requirement."
            j8.o.t(r0)
            return
        L49:
            java.lang.String r0 = "Inconsistent state "
            okio.a.p(r3, r0)
        L4e:
            return
    }

    public final void y(java.lang.Object r2, fg.q r3) {
            r1 = this;
            int r0 = r1.f11034i
            r1.z(r2, r0, r3)
            return
    }

    public final void z(java.lang.Object r5, int r6, fg.q r7) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r1 = r0.get(r4)
            boolean r2 = r1 instanceof qg.d1
            if (r2 == 0) goto L2b
            r2 = r1
            qg.d1 r2 = (qg.d1) r2
            java.lang.Object r2 = C(r2, r5, r6, r7)
        L11:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L24
            boolean r5 = r4.t()
            if (r5 != 0) goto L20
            r4.l()
        L20:
            r4.m(r6)
            return
        L24:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L11
            goto L0
        L2b:
            boolean r6 = r1 instanceof qg.h
            if (r6 == 0) goto L43
            qg.h r1 = (qg.h) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = qg.h.f11055c
            r0 = 0
            r2 = 1
            boolean r6 = r6.compareAndSet(r1, r0, r2)
            if (r6 == 0) goto L43
            if (r7 == 0) goto L42
            java.lang.Throwable r6 = r1.f11082a
            r4.i(r7, r6, r5)
        L42:
            return
        L43:
            java.lang.String r6 = "Already resumed, but proposed with update "
            okio.a.p(r5, r6)
            return
    }
}
