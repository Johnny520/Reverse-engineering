package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class y0 implements qg.r0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11124g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f11125h = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            java.lang.String r0 = "_state$volatile"
            java.lang.Class<qg.y0> r1 = qg.y0.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.y0.f11124g = r0
            java.lang.String r0 = "_parentHandle$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            qg.y0.f11125h = r0
            return
    }

    public y0(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            qg.f0 r1 = qg.v.f11111j
            goto La
        L8:
            qg.f0 r1 = qg.v.f11110i
        La:
            r0._state$volatile = r1
            return
    }

    public static qg.k Q(vg.i r2) {
        L0:
            boolean r0 = r2.i()
            if (r0 == 0) goto L24
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14342h
            vg.i r1 = r2.f()
            if (r1 != 0) goto L22
            java.lang.Object r2 = r0.get(r2)
            vg.i r2 = (vg.i) r2
        L14:
            boolean r1 = r2.i()
            if (r1 != 0) goto L1b
            goto L0
        L1b:
            java.lang.Object r2 = r0.get(r2)
            vg.i r2 = (vg.i) r2
            goto L14
        L22:
            r2 = r1
            goto L0
        L24:
            vg.i r2 = r2.h()
            boolean r0 = r2.i()
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof qg.k
            if (r0 == 0) goto L35
            qg.k r2 = (qg.k) r2
            return r2
        L35:
            boolean r0 = r2 instanceof qg.a1
            if (r0 == 0) goto L24
            r2 = 0
            return r2
    }

    public static java.lang.String X(java.lang.Object r2) {
            boolean r0 = r2 instanceof qg.x0
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1d
            qg.x0 r2 = (qg.x0) r2
            boolean r0 = r2.e()
            if (r0 == 0) goto L11
            java.lang.String r2 = "Cancelling"
            return r2
        L11:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = qg.x0.f11120h
            int r2 = r0.get(r2)
            if (r2 == 0) goto L1c
            java.lang.String r2 = "Completing"
            return r2
        L1c:
            return r1
        L1d:
            boolean r0 = r2 instanceof qg.o0
            if (r0 == 0) goto L2d
            qg.o0 r2 = (qg.o0) r2
            boolean r2 = r2.b()
            if (r2 == 0) goto L2a
            return r1
        L2a:
            java.lang.String r2 = "New"
            return r2
        L2d:
            boolean r2 = r2 instanceof qg.n
            if (r2 == 0) goto L34
            java.lang.String r2 = "Cancelled"
            return r2
        L34:
            java.lang.String r2 = "Completed"
            return r2
    }

    public boolean B(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5
            goto L11
        L5:
            boolean r2 = r1.v(r2)
            if (r2 == 0) goto L13
            boolean r2 = r1.G()
            if (r2 == 0) goto L13
        L11:
            r2 = 1
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final void C(qg.o0 r7, java.lang.Object r8) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11125h
            java.lang.Object r1 = r0.get(r6)
            qg.j r1 = (qg.j) r1
            if (r1 == 0) goto L12
            r1.a()
            qg.c1 r1 = qg.c1.f11039g
            r0.set(r6, r1)
        L12:
            boolean r0 = r8 instanceof qg.n
            r1 = 0
            if (r0 == 0) goto L1a
            qg.n r8 = (qg.n) r8
            goto L1b
        L1a:
            r8 = r1
        L1b:
            if (r8 == 0) goto L20
            java.lang.Throwable r8 = r8.f11082a
            goto L21
        L20:
            r8 = r1
        L21:
            boolean r0 = r7 instanceof qg.u0
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4c
            r0 = r7
            qg.u0 r0 = (qg.u0) r0     // Catch: java.lang.Throwable -> L30
            r0.l(r8)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r8 = move-exception
            af.d r0 = new af.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8)
            r6.K(r0)
            goto L9f
        L4c:
            qg.a1 r7 = r7.d()
            if (r7 == 0) goto L9f
            vg.h r0 = new vg.h
            r4 = 1
            r0.<init>(r4)
            r7.e(r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14341g
            java.lang.Object r0 = r0.get(r7)
            r0.getClass()
            vg.i r0 = (vg.i) r0
        L66:
            boolean r4 = r0.equals(r7)
            if (r4 != 0) goto L9a
            boolean r4 = r0 instanceof qg.u0
            if (r4 == 0) goto L95
            r4 = r0
            qg.u0 r4 = (qg.u0) r4     // Catch: java.lang.Throwable -> L77
            r4.l(r8)     // Catch: java.lang.Throwable -> L77
            goto L95
        L77:
            r4 = move-exception
            if (r1 == 0) goto L7e
            ac.p.e(r1, r4)
            goto L95
        L7e:
            af.d r1 = new af.d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r0)
            r5.append(r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
        L95:
            vg.i r0 = r0.h()
            goto L66
        L9a:
            if (r1 == 0) goto L9f
            r6.K(r1)
        L9f:
            return
    }

    public final java.lang.Throwable D(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Throwable
            if (r0 == 0) goto L7
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            return r5
        L7:
            qg.y0 r5 = (qg.y0) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r5)
            boolean r1 = r0 instanceof qg.x0
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r0
            qg.x0 r1 = (qg.x0) r1
            java.lang.Throwable r1 = r1.c()
            goto L2b
        L1c:
            boolean r1 = r0 instanceof qg.n
            if (r1 == 0) goto L26
            r1 = r0
            qg.n r1 = (qg.n) r1
            java.lang.Throwable r1 = r1.f11082a
            goto L2b
        L26:
            boolean r1 = r0 instanceof qg.o0
            if (r1 != 0) goto L44
            r1 = r2
        L2b:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L32
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L32:
            if (r2 != 0) goto L43
            qg.s0 r2 = new qg.s0
            java.lang.String r0 = X(r0)
            java.lang.String r3 = "Parent job is "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0, r1, r5)
        L43:
            return r2
        L44:
            java.lang.String r5 = "Cannot be cancelling child in this state: "
            okio.a.p(r0, r5)
            r5 = 0
            return r5
    }

    public final java.lang.Object E(qg.x0 r8, java.lang.Object r9) {
            r7 = this;
            boolean r0 = r9 instanceof qg.n
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r9
            qg.n r0 = (qg.n) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            java.lang.Throwable r1 = r0.f11082a
        Le:
            monitor-enter(r8)
            r8.e()     // Catch: java.lang.Throwable -> L9d
            java.util.ArrayList r0 = r8.f(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Throwable r2 = r7.F(r8, r0)     // Catch: java.lang.Throwable -> L9d
            r3 = 1
            if (r2 == 0) goto L53
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L9d
            if (r4 > r3) goto L24
            goto L53
        L24:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L9d
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L9d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            java.util.Set r4 = java.util.Collections.newSetFromMap(r5)     // Catch: java.lang.Throwable -> L9d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9d
        L35:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L53
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L9d
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Throwable -> L9d
            if (r5 == r2) goto L35
            if (r5 == r2) goto L35
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L9d
            if (r6 != 0) goto L35
            boolean r6 = r4.add(r5)     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L35
            ac.p.e(r2, r5)     // Catch: java.lang.Throwable -> L9d
            goto L35
        L53:
            monitor-exit(r8)
            r0 = 0
            if (r2 != 0) goto L58
            goto L60
        L58:
            if (r2 != r1) goto L5b
            goto L60
        L5b:
            qg.n r9 = new qg.n
            r9.<init>(r2, r0)
        L60:
            if (r2 == 0) goto L79
            boolean r1 = r7.y(r2)
            if (r1 != 0) goto L6e
            boolean r1 = r7.J(r2)
            if (r1 == 0) goto L79
        L6e:
            r9.getClass()
            r1 = r9
            qg.n r1 = (qg.n) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = qg.n.f11081b
            r2.compareAndSet(r1, r0, r3)
        L79:
            r7.S(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            boolean r1 = r9 instanceof qg.o0
            if (r1 == 0) goto L8b
            qg.p0 r1 = new qg.p0
            r2 = r9
            qg.o0 r2 = (qg.o0) r2
            r1.<init>(r2)
            goto L8c
        L8b:
            r1 = r9
        L8c:
            boolean r2 = r0.compareAndSet(r7, r8, r1)
            if (r2 == 0) goto L93
            goto L99
        L93:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r8) goto L8c
        L99:
            r7.C(r8, r9)
            return r9
        L9d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
    }

    public final java.lang.Throwable F(qg.x0 r4, java.util.ArrayList r5) {
            r3 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r4 = r4.e()
            if (r4 == 0) goto L17
            qg.s0 r4 = new qg.s0
            java.lang.String r5 = r3.z()
            r4.<init>(r5, r1, r3)
            return r4
        L17:
            return r1
        L18:
            java.util.Iterator r4 = r5.iterator()
        L1c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L1c
            goto L2f
        L2e:
            r0 = r1
        L2f:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L34
            return r0
        L34:
            r4 = 0
            java.lang.Object r4 = r5.get(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r0 = r4 instanceof qg.i1
            if (r0 == 0) goto L5c
            java.util.Iterator r5 = r5.iterator()
        L43:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r4) goto L43
            boolean r2 = r2 instanceof qg.i1
            if (r2 == 0) goto L43
            r1 = r0
        L57:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L5c
            return r1
        L5c:
            return r4
    }

    public boolean G() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean H() {
            r1 = this;
            boolean r0 = r1 instanceof qg.l
            return r0
    }

    public final qg.a1 I(qg.o0 r2) {
            r1 = this;
            qg.a1 r0 = r2.d()
            if (r0 != 0) goto L22
            boolean r0 = r2 instanceof qg.f0
            if (r0 == 0) goto L10
            qg.a1 r2 = new qg.a1
            r2.<init>()
            return r2
        L10:
            boolean r0 = r2 instanceof qg.u0
            if (r0 == 0) goto L1b
            qg.u0 r2 = (qg.u0) r2
            r1.V(r2)
            r2 = 0
            return r2
        L1b:
            java.lang.String r0 = "State should have list: "
            okio.a.p(r2, r0)
            r2 = 0
            return r2
        L22:
            return r0
    }

    public boolean J(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void K(af.d r1) {
            r0 = this;
            throw r1
    }

    public final void L(qg.r0 r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11125h
            qg.c1 r1 = qg.c1.f11039g
            if (r4 != 0) goto La
            r0.set(r3, r1)
            return
        La:
            r4.start()
            qg.j r4 = r4.l(r3)
            r0.set(r3, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = qg.y0.f11124g
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r2 instanceof qg.o0
            if (r2 != 0) goto L24
            r4.a()
            r0.set(r3, r1)
        L24:
            return
    }

    public final qg.d0 M(boolean r8, qg.u0 r9) {
            r7 = this;
            r9.f11101j = r7
        L2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r1 = r0.get(r7)
            boolean r2 = r1 instanceof qg.f0
            qg.c1 r3 = qg.c1.f11039g
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L29
            r2 = r1
            qg.f0 r2 = (qg.f0) r2
            boolean r6 = r2.f11045g
            if (r6 == 0) goto L25
        L17:
            boolean r2 = r0.compareAndSet(r7, r1, r9)
            if (r2 == 0) goto L1e
            goto L68
        L1e:
            java.lang.Object r2 = r0.get(r7)
            if (r2 == r1) goto L17
            goto L2
        L25:
            r7.U(r2)
            goto L2
        L29:
            boolean r2 = r1 instanceof qg.o0
            if (r2 == 0) goto L67
            r2 = r1
            qg.o0 r2 = (qg.o0) r2
            qg.a1 r6 = r2.d()
            if (r6 != 0) goto L3c
            qg.u0 r1 = (qg.u0) r1
            r7.V(r1)
            goto L2
        L3c:
            boolean r1 = r9.k()
            if (r1 == 0) goto L60
            boolean r1 = r2 instanceof qg.x0
            if (r1 == 0) goto L49
            qg.x0 r2 = (qg.x0) r2
            goto L4a
        L49:
            r2 = r5
        L4a:
            if (r2 == 0) goto L51
            java.lang.Throwable r1 = r2.c()
            goto L52
        L51:
            r1 = r5
        L52:
            if (r1 != 0) goto L5a
            r1 = 5
            boolean r1 = r6.e(r9, r1)
            goto L64
        L5a:
            if (r8 == 0) goto L80
            r9.l(r1)
            return r3
        L60:
            boolean r1 = r6.e(r9, r4)
        L64:
            if (r1 == 0) goto L2
            goto L68
        L67:
            r4 = 0
        L68:
            if (r4 == 0) goto L6b
            return r9
        L6b:
            if (r8 == 0) goto L80
            java.lang.Object r8 = r0.get(r7)
            boolean r0 = r8 instanceof qg.n
            if (r0 == 0) goto L78
            qg.n r8 = (qg.n) r8
            goto L79
        L78:
            r8 = r5
        L79:
            if (r8 == 0) goto L7d
            java.lang.Throwable r5 = r8.f11082a
        L7d:
            r9.l(r5)
        L80:
            return r3
    }

    public boolean N() {
            r1 = this;
            boolean r0 = r1 instanceof qg.c
            return r0
    }

    public final java.lang.Object O(java.lang.Object r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r4)
            java.lang.Object r0 = r4.Y(r0, r5)
            l3.q r1 = qg.v.f11105d
            if (r0 != r1) goto L37
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Job "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            boolean r2 = r5 instanceof qg.n
            r3 = 0
            if (r2 == 0) goto L2e
            qg.n r5 = (qg.n) r5
            goto L2f
        L2e:
            r5 = r3
        L2f:
            if (r5 == 0) goto L33
            java.lang.Throwable r3 = r5.f11082a
        L33:
            r0.<init>(r1, r3)
            throw r0
        L37:
            l3.q r1 = qg.v.f11107f
            if (r0 == r1) goto L0
            return r0
    }

    public java.lang.String P() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public final void R(qg.a1 r6, java.lang.Throwable r7) {
            r5 = this;
            vg.h r0 = new vg.h
            r1 = 4
            r0.<init>(r1)
            r6.e(r0, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14341g
            java.lang.Object r0 = r0.get(r6)
            r0.getClass()
            vg.i r0 = (vg.i) r0
            r1 = 0
        L15:
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L56
            boolean r2 = r0 instanceof qg.u0
            if (r2 == 0) goto L51
            r2 = r0
            qg.u0 r2 = (qg.u0) r2
            boolean r2 = r2.k()
            if (r2 == 0) goto L51
            r2 = r0
            qg.u0 r2 = (qg.u0) r2     // Catch: java.lang.Throwable -> L2f
            r2.l(r7)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r2 = move-exception
            if (r1 == 0) goto L36
            ac.p.e(r1, r2)
            goto L51
        L36:
            af.d r1 = new af.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
        L51:
            vg.i r0 = r0.h()
            goto L15
        L56:
            if (r1 == 0) goto L5b
            r5.K(r1)
        L5b:
            r5.y(r7)
            return
    }

    public void S(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void T() {
            r0 = this;
            return
    }

    public final void U(qg.f0 r4) {
            r3 = this;
            qg.a1 r0 = new qg.a1
            r0.<init>()
            boolean r1 = r4.f11045g
            if (r1 == 0) goto La
            goto L10
        La:
            qg.n0 r1 = new qg.n0
            r1.<init>(r0)
            r0 = r1
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.y0.f11124g
            boolean r2 = r1.compareAndSet(r3, r4, r0)
            if (r2 == 0) goto L19
            goto L1f
        L19:
            java.lang.Object r1 = r1.get(r3)
            if (r1 == r4) goto L10
        L1f:
            return
    }

    public final void V(qg.u0 r4) {
            r3 = this;
            qg.a1 r0 = new qg.a1
            r0.<init>()
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.i.f14342h
            r1.set(r0, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = vg.i.f14341g
            r1.set(r0, r4)
        L12:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r4) goto L19
            goto L22
        L19:
            boolean r2 = r1.compareAndSet(r4, r4, r0)
            if (r2 == 0) goto L36
            r0.g(r4)
        L22:
            vg.i r2 = r4.h()
        L26:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
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

    public final int W(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof qg.f0
            r1 = 1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = qg.y0.f11124g
            if (r0 == 0) goto L22
            r0 = r5
            qg.f0 r0 = (qg.f0) r0
            boolean r0 = r0.f11045g
            if (r0 == 0) goto Lf
            goto L3d
        Lf:
            qg.f0 r0 = qg.v.f11111j
        L11:
            boolean r3 = r2.compareAndSet(r4, r5, r0)
            if (r3 == 0) goto L1b
            r4.T()
            return r1
        L1b:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r5) goto L11
            goto L3b
        L22:
            boolean r0 = r5 instanceof qg.n0
            if (r0 == 0) goto L3d
            r0 = r5
            qg.n0 r0 = (qg.n0) r0
            qg.a1 r0 = r0.f11083g
        L2b:
            boolean r3 = r2.compareAndSet(r4, r5, r0)
            if (r3 == 0) goto L35
            r4.T()
            return r1
        L35:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r5) goto L2b
        L3b:
            r5 = -1
            return r5
        L3d:
            r5 = 0
            return r5
    }

    public final java.lang.Object Y(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r7 instanceof qg.o0
            if (r0 != 0) goto L7
            l3.q r7 = qg.v.f11105d
            return r7
        L7:
            boolean r0 = r7 instanceof qg.f0
            if (r0 != 0) goto Lf
            boolean r0 = r7 instanceof qg.u0
            if (r0 == 0) goto L41
        Lf:
            boolean r0 = r7 instanceof qg.k
            if (r0 != 0) goto L41
            boolean r0 = r8 instanceof qg.n
            if (r0 != 0) goto L41
            r0 = r7
            qg.o0 r0 = (qg.o0) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.y0.f11124g
            boolean r7 = r8 instanceof qg.o0
            if (r7 == 0) goto L2a
            qg.p0 r7 = new qg.p0
            r2 = r8
            qg.o0 r2 = (qg.o0) r2
            r7.<init>(r2)
            r2 = r7
            goto L2b
        L2a:
            r2 = r8
        L2b:
            boolean r7 = r1.compareAndSet(r6, r0, r2)
            if (r7 == 0) goto L38
            r6.S(r8)
            r6.C(r0, r8)
            return r8
        L38:
            java.lang.Object r7 = r1.get(r6)
            if (r7 == r0) goto L2b
            l3.q r7 = qg.v.f11107f
            return r7
        L41:
            qg.o0 r7 = (qg.o0) r7
            qg.a1 r0 = r6.I(r7)
            if (r0 != 0) goto L4c
            l3.q r7 = qg.v.f11107f
            return r7
        L4c:
            boolean r1 = r7 instanceof qg.x0
            r2 = 0
            if (r1 == 0) goto L55
            r1 = r7
            qg.x0 r1 = (qg.x0) r1
            goto L56
        L55:
            r1 = r2
        L56:
            if (r1 != 0) goto L5d
            qg.x0 r1 = new qg.x0
            r1.<init>(r0, r2)
        L5d:
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = qg.x0.f11120h     // Catch: java.lang.Throwable -> L70
            int r4 = r3.get(r1)     // Catch: java.lang.Throwable -> L70
            r5 = 1
            if (r4 == 0) goto L69
            r4 = r5
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r4 == 0) goto L72
            l3.q r7 = qg.v.f11105d     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            return r7
        L70:
            r7 = move-exception
            goto Ld7
        L72:
            r3.set(r1, r5)     // Catch: java.lang.Throwable -> L70
            if (r1 == r7) goto L8a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = qg.y0.f11124g     // Catch: java.lang.Throwable -> L70
        L79:
            boolean r4 = r3.compareAndSet(r6, r7, r1)     // Catch: java.lang.Throwable -> L70
            if (r4 == 0) goto L80
            goto L8a
        L80:
            java.lang.Object r4 = r3.get(r6)     // Catch: java.lang.Throwable -> L70
            if (r4 == r7) goto L79
            l3.q r7 = qg.v.f11107f     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            return r7
        L8a:
            boolean r7 = r1.e()     // Catch: java.lang.Throwable -> L70
            boolean r3 = r8 instanceof qg.n     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L96
            r3 = r8
            qg.n r3 = (qg.n) r3     // Catch: java.lang.Throwable -> L70
            goto L97
        L96:
            r3 = r2
        L97:
            if (r3 == 0) goto L9e
            java.lang.Throwable r3 = r3.f11082a     // Catch: java.lang.Throwable -> L70
            r1.a(r3)     // Catch: java.lang.Throwable -> L70
        L9e:
            java.lang.Throwable r3 = r1.c()     // Catch: java.lang.Throwable -> L70
            if (r7 != 0) goto La5
            r2 = r3
        La5:
            monitor-exit(r1)
            if (r2 == 0) goto Lab
            r6.R(r0, r2)
        Lab:
            qg.k r7 = Q(r0)
            if (r7 == 0) goto Lba
            boolean r7 = r6.Z(r1, r7, r8)
            if (r7 == 0) goto Lba
            l3.q r7 = qg.v.f11106e
            return r7
        Lba:
            vg.h r7 = new vg.h
            r2 = 2
            r7.<init>(r2)
            r0.e(r7, r2)
            qg.k r7 = Q(r0)
            if (r7 == 0) goto Ld2
            boolean r7 = r6.Z(r1, r7, r8)
            if (r7 == 0) goto Ld2
            l3.q r7 = qg.v.f11106e
            return r7
        Ld2:
            java.lang.Object r7 = r6.E(r1, r8)
            return r7
        Ld7:
            monitor-exit(r1)
            throw r7
    }

    public final boolean Z(qg.x0 r4, qg.k r5, java.lang.Object r6) {
            r3 = this;
        L0:
            qg.y0 r0 = r5.f11066k
            qg.w0 r1 = new qg.w0
            r1.<init>(r3, r4, r5, r6)
            r2 = 0
            qg.d0 r0 = qg.v.n(r0, r2, r1)
            qg.c1 r1 = qg.c1.f11039g
            if (r0 == r1) goto L12
            r4 = 1
            return r4
        L12:
            qg.k r5 = Q(r5)
            if (r5 != 0) goto L0
            return r2
    }

    @Override // qg.r0
    public void a(java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            qg.s0 r3 = new qg.s0
            java.lang.String r0 = r2.z()
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.x(r3)
            return
    }

    @Override // qg.r0
    public boolean b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof qg.o0
            if (r1 == 0) goto L14
            qg.o0 r0 = (qg.o0) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // qg.r0
    public final qg.d0 c(boolean r2, boolean r3, p8.p r4) {
            r1 = this;
            if (r2 == 0) goto L8
            qg.q0 r2 = new qg.q0
            r2.<init>(r4)
            goto Le
        L8:
            qg.e0 r2 = new qg.e0
            r0 = 1
            r2.<init>(r4, r0)
        Le:
            qg.d0 r2 = r1.M(r3, r2)
            return r2
    }

    @Override // wf.g
    public final wf.g e(wf.g r1) {
            r0 = this;
            wf.g r1 = f8.i.q0(r0, r1)
            return r1
    }

    @Override // qg.r0
    public final java.lang.Object g(yf.c r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r4)
            boolean r1 = r0 instanceof qg.o0
            sf.n r2 = sf.n.f12433a
            if (r1 != 0) goto L14
            wf.g r5 = r5.getContext()
            qg.v.g(r5)
            return r2
        L14:
            int r0 = r4.W(r0)
            if (r0 < 0) goto L0
            qg.g r0 = new qg.g
            wf.c r5 = fb.v0.x(r5)
            r1 = 1
            r0.<init>(r1, r5)
            r0.p()
            qg.i r5 = new qg.i
            r3 = 1
            r5.<init>(r0, r3)
            qg.d0 r5 = qg.v.n(r4, r1, r5)
            qg.e r1 = new qg.e
            r1.<init>(r5, r3)
            r0.s(r1)
            java.lang.Object r5 = r0.o()
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L42
            goto L43
        L42:
            r5 = r2
        L43:
            if (r5 != r0) goto L46
            return r5
        L46:
            return r2
    }

    @Override // wf.e
    public final wf.f getKey() {
            r1 = this;
            qg.q r0 = qg.q.f11090h
            return r0
    }

    @Override // qg.r0
    public final java.util.concurrent.CancellationException h() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r4)
            boolean r1 = r0 instanceof qg.x0
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L38
            qg.x0 r0 = (qg.x0) r0
            java.lang.Throwable r0 = r0.c()
            if (r0 == 0) goto L33
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = r1.concat(r2)
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L2a
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L2a:
            if (r3 != 0) goto L32
            qg.s0 r2 = new qg.s0
            r2.<init>(r1, r0, r4)
            return r2
        L32:
            return r3
        L33:
            okio.a.p(r4, r2)
            r0 = 0
            return r0
        L38:
            boolean r1 = r0 instanceof qg.o0
            if (r1 != 0) goto L6c
            boolean r1 = r0 instanceof qg.n
            if (r1 == 0) goto L58
            qg.n r0 = (qg.n) r0
            java.lang.Throwable r0 = r0.f11082a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L4b
            r3 = r0
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L4b:
            if (r3 != 0) goto L57
            qg.s0 r1 = new qg.s0
            java.lang.String r2 = r4.z()
            r1.<init>(r2, r0, r4)
            return r1
        L57:
            return r3
        L58:
            qg.s0 r0 = new qg.s0
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1, r3, r4)
            return r0
        L6c:
            okio.a.p(r4, r2)
            r0 = 0
            return r0
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r2, r0)
            return r1
    }

    @Override // qg.r0
    public final qg.j l(qg.y0 r6) {
            r5 = this;
            qg.k r0 = new qg.k
            r0.<init>(r6)
            r0.f11101j = r5
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = qg.y0.f11124g
            java.lang.Object r1 = r6.get(r5)
            boolean r2 = r1 instanceof qg.f0
            if (r2 == 0) goto L2a
            r2 = r1
            qg.f0 r2 = (qg.f0) r2
            boolean r3 = r2.f11045g
            if (r3 == 0) goto L26
        L18:
            boolean r2 = r6.compareAndSet(r5, r1, r0)
            if (r2 == 0) goto L1f
            goto L6d
        L1f:
            java.lang.Object r2 = r6.get(r5)
            if (r2 == r1) goto L18
            goto L7
        L26:
            r5.U(r2)
            goto L7
        L2a:
            boolean r2 = r1 instanceof qg.o0
            qg.c1 r3 = qg.c1.f11039g
            r4 = 0
            if (r2 == 0) goto L6f
            r2 = r1
            qg.o0 r2 = (qg.o0) r2
            qg.a1 r2 = r2.d()
            if (r2 != 0) goto L40
            qg.u0 r1 = (qg.u0) r1
            r5.V(r1)
            goto L7
        L40:
            r1 = 7
            boolean r1 = r2.e(r0, r1)
            if (r1 == 0) goto L48
            goto L6d
        L48:
            r1 = 3
            boolean r1 = r2.e(r0, r1)
            java.lang.Object r6 = r6.get(r5)
            boolean r2 = r6 instanceof qg.x0
            if (r2 == 0) goto L5c
            qg.x0 r6 = (qg.x0) r6
            java.lang.Throwable r4 = r6.c()
            goto L68
        L5c:
            boolean r2 = r6 instanceof qg.n
            if (r2 == 0) goto L63
            qg.n r6 = (qg.n) r6
            goto L64
        L63:
            r6 = r4
        L64:
            if (r6 == 0) goto L68
            java.lang.Throwable r4 = r6.f11082a
        L68:
            r0.l(r4)
            if (r1 == 0) goto L6e
        L6d:
            return r0
        L6e:
            return r3
        L6f:
            java.lang.Object r6 = r6.get(r5)
            boolean r1 = r6 instanceof qg.n
            if (r1 == 0) goto L7a
            qg.n r6 = (qg.n) r6
            goto L7b
        L7a:
            r6 = r4
        L7b:
            if (r6 == 0) goto L7f
            java.lang.Throwable r4 = r6.f11082a
        L7f:
            r0.l(r4)
            return r3
    }

    @Override // qg.r0
    public final qg.d0 o(fg.l r3) {
            r2 = this;
            qg.e0 r0 = new qg.e0
            r1 = 1
            r0.<init>(r3, r1)
            r3 = 1
            qg.d0 r3 = r2.M(r3, r0)
            return r3
    }

    public void r(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // wf.g
    public final wf.e s(wf.f r1) {
            r0 = this;
            wf.e r1 = f8.i.w(r0, r1)
            return r1
    }

    @Override // qg.r0
    public final boolean start() {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r2)
            int r0 = r2.W(r0)
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 == r1) goto L10
            goto L0
        L10:
            return r1
        L11:
            r0 = 0
            return r0
    }

    @Override // wf.g
    public final wf.g t(wf.f r1) {
            r0 = this;
            wf.g r1 = f8.i.l0(r0, r1)
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.P()
            r1.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = qg.y0.f11124g
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = X(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = qg.v.j(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void u(java.lang.Object r1) {
            r0 = this;
            r0.r(r1)
            return
    }

    public final boolean v(java.lang.Object r10) {
            r9 = this;
            l3.q r0 = qg.v.f11105d
            boolean r1 = r9.H()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.y0.f11124g
            java.lang.Object r0 = r0.get(r9)
            boolean r1 = r0 instanceof qg.o0
            if (r1 == 0) goto L36
            boolean r1 = r0 instanceof qg.x0
            if (r1 == 0) goto L24
            r1 = r0
            qg.x0 r1 = (qg.x0) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = qg.x0.f11120h
            int r1 = r4.get(r1)
            if (r1 == 0) goto L24
            goto L36
        L24:
            qg.n r1 = new qg.n
            java.lang.Throwable r4 = r9.D(r10)
            r1.<init>(r4, r2)
            java.lang.Object r0 = r9.Y(r0, r1)
            l3.q r1 = qg.v.f11107f
            if (r0 == r1) goto La
            goto L38
        L36:
            l3.q r0 = qg.v.f11105d
        L38:
            l3.q r1 = qg.v.f11106e
            if (r0 != r1) goto L3e
            goto Le8
        L3e:
            l3.q r1 = qg.v.f11105d
            if (r0 != r1) goto Ldf
            r0 = 0
            r1 = r0
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = qg.y0.f11124g
            java.lang.Object r5 = r4.get(r9)
            boolean r6 = r5 instanceof qg.x0
            if (r6 == 0) goto L90
            monitor-enter(r5)
            r4 = r5
            qg.x0 r4 = (qg.x0) r4     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = qg.x0.f11122j     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> L62
            l3.q r6 = qg.v.f11109h     // Catch: java.lang.Throwable -> L62
            if (r4 != r6) goto L64
            l3.q r10 = qg.v.f11108g     // Catch: java.lang.Throwable -> L62
            monitor-exit(r5)
        L5f:
            r0 = r10
            goto Ldf
        L62:
            r10 = move-exception
            goto L8e
        L64:
            r4 = r5
            qg.x0 r4 = (qg.x0) r4     // Catch: java.lang.Throwable -> L62
            boolean r4 = r4.e()     // Catch: java.lang.Throwable -> L62
            if (r1 != 0) goto L71
            java.lang.Throwable r1 = r9.D(r10)     // Catch: java.lang.Throwable -> L62
        L71:
            r10 = r5
            qg.x0 r10 = (qg.x0) r10     // Catch: java.lang.Throwable -> L62
            r10.a(r1)     // Catch: java.lang.Throwable -> L62
            r10 = r5
            qg.x0 r10 = (qg.x0) r10     // Catch: java.lang.Throwable -> L62
            java.lang.Throwable r10 = r10.c()     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L81
            r0 = r10
        L81:
            monitor-exit(r5)
            if (r0 == 0) goto L8b
            qg.x0 r5 = (qg.x0) r5
            qg.a1 r10 = r5.f11123g
            r9.R(r10, r0)
        L8b:
            l3.q r10 = qg.v.f11105d
            goto L5f
        L8e:
            monitor-exit(r5)
            throw r10
        L90:
            boolean r6 = r5 instanceof qg.o0
            if (r6 == 0) goto Ldc
            if (r1 != 0) goto L9a
            java.lang.Throwable r1 = r9.D(r10)
        L9a:
            r6 = r5
            qg.o0 r6 = (qg.o0) r6
            boolean r7 = r6.b()
            if (r7 == 0) goto Lc2
            qg.a1 r7 = r9.I(r6)
            if (r7 != 0) goto Laa
            goto L44
        Laa:
            qg.x0 r8 = new qg.x0
            r8.<init>(r7, r1)
        Laf:
            boolean r5 = r4.compareAndSet(r9, r6, r8)
            if (r5 == 0) goto Lbb
            r9.R(r7, r1)
            l3.q r10 = qg.v.f11105d
            goto L5f
        Lbb:
            java.lang.Object r5 = r4.get(r9)
            if (r5 == r6) goto Laf
            goto L44
        Lc2:
            qg.n r4 = new qg.n
            r4.<init>(r1, r2)
            java.lang.Object r4 = r9.Y(r5, r4)
            l3.q r6 = qg.v.f11105d
            if (r4 == r6) goto Ld5
            l3.q r5 = qg.v.f11107f
            if (r4 == r5) goto L44
            r0 = r4
            goto Ldf
        Ld5:
            java.lang.String r10 = "Cannot happen in "
            okio.a.p(r5, r10)
            r10 = 0
            return r10
        Ldc:
            l3.q r10 = qg.v.f11108g
            goto L5f
        Ldf:
            l3.q r10 = qg.v.f11105d
            if (r0 != r10) goto Le4
            goto Le8
        Le4:
            l3.q r10 = qg.v.f11106e
            if (r0 != r10) goto Le9
        Le8:
            return r3
        Le9:
            l3.q r10 = qg.v.f11108g
            if (r0 != r10) goto Lee
            return r2
        Lee:
            r9.r(r0)
            return r3
    }

    public void x(java.util.concurrent.CancellationException r1) {
            r0 = this;
            r0.v(r1)
            return
    }

    public final boolean y(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.N()
            if (r0 == 0) goto L7
            goto L23
        L7:
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.y0.f11125h
            java.lang.Object r1 = r1.get(r3)
            qg.j r1 = (qg.j) r1
            if (r1 == 0) goto L25
            qg.c1 r2 = qg.c1.f11039g
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

    public java.lang.String z() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }
}
