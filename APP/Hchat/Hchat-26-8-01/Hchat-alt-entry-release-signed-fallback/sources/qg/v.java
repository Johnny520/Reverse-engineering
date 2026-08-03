package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3.q f11102a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3.q f11103b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3.q f11104c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l3.q f11105d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l3.q f11106e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l3.q f11107f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l3.q f11108g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l3.q f11109h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qg.f0 f11110i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qg.f0 f11111j = null;

    static {
            l3.q r0 = new l3.q
            java.lang.String r1 = "RESUME_TOKEN"
            r2 = 1
            r0.<init>(r1, r2)
            qg.v.f11102a = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "REMOVED_TASK"
            r0.<init>(r1, r2)
            qg.v.f11103b = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "CLOSED_EMPTY"
            r0.<init>(r1, r2)
            qg.v.f11104c = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "COMPLETING_ALREADY"
            r0.<init>(r1, r2)
            qg.v.f11105d = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1, r2)
            qg.v.f11106e = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1, r2)
            qg.v.f11107f = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1, r2)
            qg.v.f11108g = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "SEALED"
            r0.<init>(r1, r2)
            qg.v.f11109h = r0
            qg.f0 r0 = new qg.f0
            r1 = 0
            r0.<init>(r1)
            qg.v.f11110i = r0
            qg.f0 r0 = new qg.f0
            r1 = 1
            r0.<init>(r1)
            qg.v.f11111j = r0
            return
    }

    public static final vg.c a(wf.g r3) {
            vg.c r0 = new vg.c
            qg.q r1 = qg.q.f11090h
            wf.e r1 = r3.s(r1)
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            qg.t0 r1 = new qg.t0
            r2 = 0
            r1.<init>(r2)
            wf.g r3 = r3.e(r1)
        L15:
            r0.<init>(r3)
            return r0
    }

    public static final void b(yf.c r4) {
            boolean r0 = r4 instanceof qg.z
            if (r0 == 0) goto L13
            r0 = r4
            qg.z r0 = (qg.z) r0
            int r1 = r0.f11127h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11127h = r1
            goto L18
        L13:
            qg.z r0 = new qg.z
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f11126g
            int r1 = r0.f11127h
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            return
        L27:
            f8.i.I0(r4)
            goto L45
        L2b:
            f8.i.I0(r4)
            r0.f11127h = r2
            qg.g r4 = new qg.g
            wf.c r0 = fb.v0.x(r0)
            r4.<init>(r2, r0)
            r4.p()
            java.lang.Object r4 = r4.o()
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L45
            return
        L45:
            okio.a.c()
            return
    }

    public static final void c(qg.t r2, s1.w r3) {
            wf.g r0 = r2.n()
            qg.q r1 = qg.q.f11090h
            wf.e r0 = r0.s(r1)
            qg.r0 r0 = (qg.r0) r0
            if (r0 == 0) goto L12
            r0.a(r3)
            return
        L12:
            java.lang.String r3 = "Scope cannot be cancelled because it does not have a job: "
            okio.a.p(r2, r3)
            return
    }

    public static final java.lang.Object d(qg.r0 r1, yf.i r2) {
            r0 = 0
            r1.a(r0)
            java.lang.Object r1 = r1.g(r2)
            xf.a r2 = xf.a.f21579g
            if (r1 != r2) goto Ld
            return r1
        Ld:
            sf.n r1 = sf.n.f12433a
            return r1
    }

    public static final java.lang.Object e(fg.p r2, wf.c r3) {
            vg.p r0 = new vg.p
            wf.g r1 = r3.getContext()
            r0.<init>(r3, r1)
            java.lang.Object r2 = fb.v0.L(r0, r0, r2)
            return r2
    }

    public static final java.lang.Object f(long r3, wf.c r5) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            goto L2f
        L7:
            qg.g r0 = new qg.g
            wf.c r5 = fb.v0.x(r5)
            r1 = 1
            r0.<init>(r1, r5)
            r0.p()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L26
            wf.g r5 = r0.f11050k
            qg.y r5 = i(r5)
            r5.u(r3, r0)
        L26:
            java.lang.Object r3 = r0.o()
            xf.a r4 = xf.a.f21579g
            if (r3 != r4) goto L2f
            return r3
        L2f:
            sf.n r3 = sf.n.f12433a
            return r3
    }

    public static final void g(wf.g r1) {
            qg.q r0 = qg.q.f11090h
            wf.e r1 = r1.s(r0)
            qg.r0 r1 = (qg.r0) r1
            if (r1 == 0) goto L16
            boolean r0 = r1.b()
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.util.concurrent.CancellationException r1 = r1.h()
            throw r1
        L16:
            return
    }

    public static final wf.g h(wf.g r3, wf.g r4, boolean r5) {
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            i2.y r0 = new i2.y
            r1 = 13
            r0.<init>(r1)
            java.lang.Object r0 = r3.k(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            i2.y r1 = new i2.y
            r2 = 13
            r1.<init>(r2)
            java.lang.Object r5 = r4.k(r1, r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r0 != 0) goto L2d
            if (r5 != 0) goto L2d
            wf.g r3 = r3.e(r4)
            return r3
        L2d:
            i2.y r0 = new i2.y
            r1 = 11
            r0.<init>(r1)
            wf.h r1 = wf.h.f20786g
            java.lang.Object r3 = r3.k(r0, r1)
            wf.g r3 = (wf.g) r3
            if (r5 == 0) goto L4b
            wf.g r4 = (wf.g) r4
            i2.y r5 = new i2.y
            r0 = 12
            r5.<init>(r0)
            java.lang.Object r4 = r4.k(r5, r1)
        L4b:
            wf.g r4 = (wf.g) r4
            wf.g r3 = r3.e(r4)
            return r3
    }

    public static final qg.y i(wf.g r1) {
            wf.d r0 = wf.d.f20785g
            wf.e r1 = r1.s(r0)
            boolean r0 = r1 instanceof qg.y
            if (r0 == 0) goto Ld
            qg.y r1 = (qg.y) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L12
            qg.y r1 = qg.x.f11119a
        L12:
            return r1
    }

    public static final java.lang.String j(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public static final qg.r0 k(wf.g r1) {
            qg.q r0 = qg.q.f11090h
            wf.e r0 = r1.s(r0)
            qg.r0 r0 = (qg.r0) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Current context doesn't contain Job in it: "
            okio.a.p(r1, r0)
            r1 = 0
            return r1
    }

    public static final qg.g l(wf.c r6) {
            boolean r0 = r6 instanceof vg.f
            if (r0 != 0) goto Lb
            qg.g r0 = new qg.g
            r1 = 1
            r0.<init>(r1, r6)
            return r0
        Lb:
            r0 = r6
            vg.f r0 = (vg.f) r0
            l3.q r1 = vg.a.f14319c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = vg.f.f14329n
        L12:
            java.lang.Object r3 = r2.get(r0)
            r4 = 0
            if (r3 != 0) goto L1e
            r2.set(r0, r1)
            r3 = r4
            goto L2a
        L1e:
            boolean r5 = r3 instanceof qg.g
            if (r5 == 0) goto L60
        L22:
            boolean r5 = r2.compareAndSet(r0, r3, r1)
            if (r5 == 0) goto L59
            qg.g r3 = (qg.g) r3
        L2a:
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof qg.m
            if (r2 == 0) goto L40
            qg.m r1 = (qg.m) r1
            java.lang.Object r1 = r1.f11078d
            if (r1 == 0) goto L40
            r3.l()
            goto L4e
        L40:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qg.g.f11046l
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r3, r2)
            qg.b r1 = qg.b.f11033a
            r0.set(r3, r1)
            r4 = r3
        L4e:
            if (r4 != 0) goto L51
            goto L52
        L51:
            return r4
        L52:
            qg.g r0 = new qg.g
            r1 = 2
            r0.<init>(r1, r6)
            return r0
        L59:
            java.lang.Object r5 = r2.get(r0)
            if (r5 == r3) goto L22
            goto L12
        L60:
            if (r3 == r1) goto L12
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L67
            goto L12
        L67:
            java.lang.String r6 = "Inconsistent state "
            okio.a.p(r3, r6)
            r6 = 0
            return r6
    }

    public static final void m(java.lang.Throwable r3, wf.g r4) {
            qg.q r0 = qg.q.f11089g     // Catch: java.lang.Throwable -> Le
            wf.e r0 = r4.s(r0)     // Catch: java.lang.Throwable -> Le
            qg.r r0 = (qg.r) r0     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            r0.m(r3, r4)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r0 = move-exception
            goto L14
        L10:
            vg.a.d(r3, r4)
            return
        L14:
            if (r3 != r0) goto L17
            goto L22
        L17:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Exception while trying to handle coroutine exception"
            r1.<init>(r2, r0)
            ac.p.e(r1, r3)
            r3 = r1
        L22:
            vg.a.d(r3, r4)
            return
    }

    public static final qg.d0 n(qg.r0 r10, boolean r11, qg.u0 r12) {
            boolean r0 = r10 instanceof qg.y0
            if (r0 == 0) goto Lb
            qg.y0 r10 = (qg.y0) r10
            qg.d0 r10 = r10.M(r11, r12)
            return r10
        Lb:
            boolean r0 = r12.k()
            p8.p r1 = new p8.p
            r8 = 0
            r9 = 13
            r2 = 1
            java.lang.Class<qg.u0> r4 = qg.u0.class
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "invoke(Ljava/lang/Throwable;)V"
            r7 = 0
            r3 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            qg.d0 r10 = r10.c(r0, r11, r1)
            return r10
    }

    public static final boolean o(qg.t r1) {
            wf.g r1 = r1.n()
            qg.q r0 = qg.q.f11090h
            wf.e r1 = r1.s(r0)
            qg.r0 r1 = (qg.r0) r1
            if (r1 == 0) goto L13
            boolean r1 = r1.b()
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static final boolean p(wf.g r1) {
            qg.q r0 = qg.q.f11090h
            wf.e r1 = r1.s(r0)
            qg.r0 r1 = (qg.r0) r1
            if (r1 == 0) goto Lf
            boolean r1 = r1.b()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static qg.e1 q(qg.t r2, wf.g r3, fg.p r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            wf.h r3 = wf.h.f20786g
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Ld
            qg.u r5 = qg.u.f11096g
            goto Lf
        Ld:
            qg.u r5 = qg.u.f11099j
        Lf:
            wf.g r2 = r2.n()
            r0 = 1
            wf.g r2 = h(r2, r3, r0)
            xg.e r3 = qg.c0.f11038a
            if (r2 == r3) goto L28
            wf.d r1 = wf.d.f20785g
            wf.e r1 = r2.s(r1)
            if (r1 != 0) goto L28
            wf.g r2 = r2.e(r3)
        L28:
            qg.u r3 = qg.u.f11097h
            if (r5 != r3) goto L32
            qg.z0 r3 = new qg.z0
            r3.<init>(r2, r4)
            goto L37
        L32:
            qg.e1 r3 = new qg.e1
            r3.<init>(r2, r0)
        L37:
            r3.c0(r5, r3, r4)
            return r3
    }

    public static final java.lang.Object r(java.lang.Object r1) {
            boolean r0 = r1 instanceof qg.n
            if (r0 == 0) goto Lc
            qg.n r1 = (qg.n) r1
            java.lang.Throwable r1 = r1.f11082a
            sf.f r1 = f8.i.q(r1)
        Lc:
            return r1
    }

    public static final void s(qg.g r2, wf.c r3, boolean r4) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qg.g.f11047m
            java.lang.Object r0 = r0.get(r2)
            java.lang.Throwable r1 = r2.d(r0)
            if (r1 == 0) goto L12
            sf.f r2 = new sf.f
            r2.<init>(r1)
            goto L16
        L12:
            java.lang.Object r2 = r2.e(r0)
        L16:
            if (r4 == 0) goto L51
            r3.getClass()
            vg.f r3 = (vg.f) r3
            yf.c r4 = r3.f14331k
            java.lang.Object r3 = r3.f14333m
            wf.g r0 = r4.getContext()
            java.lang.Object r3 = vg.a.l(r0, r3)
            l3.q r1 = vg.a.f14320d
            if (r3 == r1) goto L32
            qg.m1 r1 = w(r4, r0, r3)
            goto L33
        L32:
            r1 = 0
        L33:
            r4.resumeWith(r2)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L40
            boolean r2 = r1.d0()
            if (r2 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            vg.a.g(r0, r3)
            return
        L44:
            r2 = move-exception
            if (r1 == 0) goto L4d
            boolean r4 = r1.d0()
            if (r4 == 0) goto L50
        L4d:
            vg.a.g(r0, r3)
        L50:
            throw r2
        L51:
            r3.resumeWith(r2)
            return
    }

    public static final java.lang.Object t(qg.j1 r4, fg.p r5) {
            wf.c r0 = r4.f14355j
            wf.g r0 = r0.getContext()
            qg.y r0 = i(r0)
            long r1 = r4.f11065k
            wf.g r3 = r4.f11031i
            qg.d0 r0 = r0.q(r1, r4, r3)
            qg.e0 r1 = new qg.e0
            r2 = 0
            r1.<init>(r0, r2)
            r0 = 1
            n(r4, r0, r1)
            boolean r0 = r5 instanceof yf.a     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L27
            java.lang.Object r5 = fb.v0.Q(r5, r4, r4)     // Catch: java.lang.Throwable -> L25
            goto L37
        L25:
            r5 = move-exception
            goto L30
        L27:
            r0 = 2
            gg.x.c(r0, r5)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r5.invoke(r4, r4)     // Catch: java.lang.Throwable -> L25
            goto L37
        L30:
            qg.n r0 = new qg.n
            r1 = 0
            r0.<init>(r5, r1)
            r5 = r0
        L37:
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L3c
            goto L68
        L3c:
            java.lang.Object r1 = r4.O(r5)
            l3.q r2 = qg.v.f11106e
            if (r1 != r2) goto L45
            goto L68
        L45:
            boolean r0 = r1 instanceof qg.n
            if (r0 == 0) goto L63
            qg.n r1 = (qg.n) r1
            java.lang.Throwable r0 = r1.f11082a
            boolean r1 = r0 instanceof qg.i1
            if (r1 == 0) goto L62
            r1 = r0
            qg.i1 r1 = (qg.i1) r1
            qg.j1 r1 = r1.f11062g
            if (r1 != r4) goto L62
            boolean r4 = r5 instanceof qg.n
            if (r4 != 0) goto L5d
            goto L67
        L5d:
            qg.n r5 = (qg.n) r5
            java.lang.Throwable r4 = r5.f11082a
            throw r4
        L62:
            throw r0
        L63:
            java.lang.Object r5 = v(r1)
        L67:
            r0 = r5
        L68:
            return r0
    }

    public static final java.lang.String u(wf.c r3) {
            boolean r0 = r3 instanceof vg.f
            if (r0 == 0) goto Lb
            vg.f r3 = (vg.f) r3
            java.lang.String r3 = r3.toString()
            return r3
        Lb:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = j(r3)     // Catch: java.lang.Throwable -> L24
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L2b:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 != 0) goto L32
            goto L50
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = j(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L50:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static final java.lang.Object v(java.lang.Object r1) {
            boolean r0 = r1 instanceof qg.p0
            if (r0 == 0) goto L8
            r0 = r1
            qg.p0 r0 = (qg.p0) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            qg.o0 r0 = r0.f11088a
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            return r1
    }

    public static final qg.m1 w(wf.c r2, wf.g r3, java.lang.Object r4) {
            boolean r0 = r2 instanceof yf.d
            r1 = 0
            if (r0 != 0) goto L6
            goto L28
        L6:
            qg.n1 r0 = qg.n1.f11084g
            wf.e r0 = r3.s(r0)
            if (r0 == 0) goto L28
            yf.d r2 = (yf.d) r2
        L10:
            boolean r0 = r2 instanceof qg.a0
            if (r0 == 0) goto L15
            goto L23
        L15:
            yf.d r2 = r2.getCallerFrame()
            if (r2 != 0) goto L1c
            goto L23
        L1c:
            boolean r0 = r2 instanceof qg.m1
            if (r0 == 0) goto L10
            r1 = r2
            qg.m1 r1 = (qg.m1) r1
        L23:
            if (r1 == 0) goto L28
            r1.e0(r3, r4)
        L28:
            return r1
    }

    public static final java.lang.Object x(wf.g r4, fg.p r5, wf.c r6) {
            wf.g r0 = r6.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i2.y r2 = new i2.y
            r3 = 13
            r2.<init>(r3)
            java.lang.Object r1 = r4.k(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 != 0) goto L1f
            wf.g r4 = r0.e(r4)
            goto L23
        L1f:
            wf.g r4 = h(r0, r4, r2)
        L23:
            g(r4)
            if (r4 != r0) goto L32
            vg.p r0 = new vg.p
            r0.<init>(r6, r4)
            java.lang.Object r4 = fb.v0.L(r0, r0, r5)
            goto L9d
        L32:
            wf.d r1 = wf.d.f20785g
            wf.e r3 = r4.s(r1)
            wf.e r0 = r0.s(r1)
            boolean r0 = gg.l.a(r3, r0)
            if (r0 == 0) goto L5c
            qg.m1 r0 = new qg.m1
            r0.<init>(r6, r4)
            r4 = 0
            wf.g r6 = r0.f11031i
            java.lang.Object r4 = vg.a.l(r6, r4)
            java.lang.Object r5 = fb.v0.L(r0, r0, r5)     // Catch: java.lang.Throwable -> L57
            vg.a.g(r6, r4)
            r4 = r5
            goto L9d
        L57:
            r5 = move-exception
            vg.a.g(r6, r4)
            throw r5
        L5c:
            qg.a0 r0 = new qg.a0
            r0.<init>(r6, r4)
            wf.c r4 = fb.v0.j(r5, r0, r0)     // Catch: java.lang.Throwable -> L9e
            wf.c r4 = fb.v0.x(r4)     // Catch: java.lang.Throwable -> L9e
            sf.n r5 = sf.n.f12433a     // Catch: java.lang.Throwable -> L9e
            vg.a.h(r5, r4)     // Catch: java.lang.Throwable -> L9e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = qg.a0.f11032k
        L70:
            int r5 = r4.get(r0)
            if (r5 == 0) goto L94
            r4 = 2
            if (r5 != r4) goto L8d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = qg.y0.f11124g
            java.lang.Object r4 = r4.get(r0)
            java.lang.Object r4 = v(r4)
            boolean r5 = r4 instanceof qg.n
            if (r5 != 0) goto L88
            goto L9d
        L88:
            qg.n r4 = (qg.n) r4
            java.lang.Throwable r4 = r4.f11082a
            throw r4
        L8d:
            java.lang.String r4 = "Already suspended"
            j8.o.A(r4)
            r4 = 0
            return r4
        L94:
            r5 = 1
            boolean r5 = r4.compareAndSet(r0, r2, r5)
            if (r5 == 0) goto L70
            xf.a r4 = xf.a.f21579g
        L9d:
            return r4
        L9e:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r0.resumeWith(r5)
            throw r4
    }

    public static final java.lang.Object y(long r5, fg.p r7, yf.c r8) {
            boolean r0 = r8 instanceof qg.k1
            if (r0 == 0) goto L13
            r0 = r8
            qg.k1 r0 = (qg.k1) r0
            int r1 = r0.f11070i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11070i = r1
            goto L18
        L13:
            qg.k1 r0 = new qg.k1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11069h
            int r1 = r0.f11070i
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            gg.u r5 = r0.f11068g
            f8.i.I0(r8)     // Catch: qg.i1 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L56
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L30:
            f8.i.I0(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3a
            goto L5c
        L3a:
            gg.u r8 = new gg.u
            r8.<init>()
            r0.f11068g = r8     // Catch: qg.i1 -> L54
            r0.f11070i = r2     // Catch: qg.i1 -> L54
            qg.j1 r1 = new qg.j1     // Catch: qg.i1 -> L54
            r1.<init>(r5, r0)     // Catch: qg.i1 -> L54
            r8.f4564g = r1     // Catch: qg.i1 -> L54
            java.lang.Object r5 = t(r1, r7)     // Catch: qg.i1 -> L54
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L53
            return r6
        L53:
            return r5
        L54:
            r6 = move-exception
            r5 = r8
        L56:
            qg.j1 r7 = r6.f11062g
            java.lang.Object r5 = r5.f4564g
            if (r7 != r5) goto L5e
        L5c:
            r5 = 0
            return r5
        L5e:
            throw r6
    }
}
