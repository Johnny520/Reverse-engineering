package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3.q f14317a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3.q f14318b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3.q f14319c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l3.q f14320d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i2.y f14321e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vg.t f14322f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vg.t f14323g = null;

    static {
            l3.q r0 = new l3.q
            java.lang.String r1 = "CLOSED"
            r2 = 1
            r0.<init>(r1, r2)
            vg.a.f14317a = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1, r2)
            vg.a.f14318b = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1, r2)
            vg.a.f14319c = r0
            l3.q r0 = new l3.q
            java.lang.String r1 = "NO_THREAD_ELEMENTS"
            r0.<init>(r1, r2)
            vg.a.f14320d = r0
            i2.y r0 = new i2.y
            r1 = 29
            r0.<init>(r1)
            vg.a.f14321e = r0
            vg.t r0 = new vg.t
            r1 = 0
            r0.<init>(r1)
            vg.a.f14322f = r0
            vg.t r0 = new vg.t
            r1 = 1
            r0.<init>(r1)
            vg.a.f14323g = r0
            return
    }

    public static final void a(int r1) {
            r0 = 1
            if (r1 < r0) goto L4
            return
        L4:
            java.lang.String r0 = "Expected positive parallelism level, but got "
            java.lang.String r1 = eh.a.l(r1, r0)
            j8.o.q(r1)
            return
    }

    public static final java.lang.Object b(vg.q r5, long r6, fg.p r8) {
        L0:
            long r0 = r5.f14357c
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto Le
            boolean r0 = r5.c()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            return r5
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.b.f14324a
            java.lang.Object r1 = r0.get(r5)
            l3.q r2 = vg.a.f14317a
            if (r1 != r2) goto L19
            return r2
        L19:
            vg.b r1 = (vg.b) r1
            vg.q r1 = (vg.q) r1
            if (r1 == 0) goto L21
        L1f:
            r5 = r1
            goto L0
        L21:
            long r1 = r5.f14357c
            r3 = 1
            long r1 = r1 + r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r8.invoke(r1, r5)
            vg.q r1 = (vg.q) r1
        L30:
            r2 = 0
            boolean r2 = r0.compareAndSet(r5, r2, r1)
            if (r2 == 0) goto L41
            boolean r0 = r5.c()
            if (r0 == 0) goto L1f
            r5.d()
            goto L1f
        L41:
            java.lang.Object r2 = r0.get(r5)
            if (r2 == 0) goto L30
            goto L0
    }

    public static final vg.q c(java.lang.Object r1) {
            l3.q r0 = vg.a.f14317a
            if (r1 == r0) goto L7
            vg.q r1 = (vg.q) r1
            return r1
        L7:
            java.lang.String r1 = "Does not contain segment"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final void d(java.lang.Throwable r4, wf.g r5) {
            java.util.List r0 = vg.d.f14327a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            qg.r r1 = (qg.r) r1
            r1.m(r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            if (r4 != r1) goto L1b
            r2 = r4
            goto L25
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Exception while trying to handle coroutine exception"
            r2.<init>(r3, r1)
            ac.p.e(r2, r4)
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r1.getUncaughtExceptionHandler()
            r3.uncaughtException(r1, r2)
            goto L6
        L31:
            vg.e r0 = new vg.e     // Catch: java.lang.Throwable -> L39
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L39
            ac.p.e(r4, r0)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r5.getUncaughtExceptionHandler()
            r0.uncaughtException(r5, r4)
            return
    }

    public static final boolean e(java.lang.Object r1) {
            l3.q r0 = vg.a.f14317a
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static final java.lang.Object f(java.lang.Object r2, java.lang.Object r3) {
            if (r2 != 0) goto L3
            return r3
        L3:
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 == 0) goto Le
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            return r2
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            return r0
    }

    public static final void g(wf.g r3, java.lang.Object r4) {
            l3.q r0 = vg.a.f14320d
            if (r4 != r0) goto L5
            goto L27
        L5:
            boolean r0 = r4 instanceof vg.v
            if (r0 == 0) goto L28
            vg.v r4 = (vg.v) r4
            i0.o2[] r3 = r4.f14365c
            int r0 = r3.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L27
        L12:
            int r1 = r0 + (-1)
            r2 = r3[r0]
            r2.getClass()
            java.lang.Object[] r2 = r4.f14364b
            r0 = r2[r0]
            sf.n r0 = (sf.n) r0
            android.os.Trace.endSection()
            if (r1 >= 0) goto L25
            goto L27
        L25:
            r0 = r1
            goto L12
        L27:
            return
        L28:
            r0 = 0
            vg.t r1 = vg.a.f14322f
            java.lang.Object r3 = r3.k(r1, r0)
            r3.getClass()
            i0.o2 r3 = (i0.o2) r3
            sf.n r4 = (sf.n) r4
            android.os.Trace.endSection()
            return
    }

    public static final void h(java.lang.Object r9, wf.c r10) {
            boolean r0 = r10 instanceof vg.f
            if (r0 == 0) goto Lae
            vg.f r10 = (vg.f) r10
            qg.p r0 = r10.f14330j
            yf.c r1 = r10.f14331k
            java.lang.Throwable r2 = sf.g.b(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            qg.n r3 = new qg.n
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            wf.g r2 = r1.getContext()
            boolean r2 = r0.x(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f14332l = r3
            r10.f11034i = r4
            wf.g r9 = r1.getContext()
            r0.w(r9, r10)
            return
        L2f:
            qg.g0 r0 = qg.h1.a()
            long r5 = r0.f11052i
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f14332l = r3
            r10.f11034i = r4
            r0.A(r10)
            goto La8
        L46:
            r0.B(r4)
            wf.g r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            qg.q r3 = qg.q.f11090h     // Catch: java.lang.Throwable -> L69
            wf.e r2 = r2.s(r3)     // Catch: java.lang.Throwable -> L69
            qg.r0 r2 = (qg.r0) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.h()     // Catch: java.lang.Throwable -> L69
            sf.f r9 = f8.i.q(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f14333m     // Catch: java.lang.Throwable -> L69
            wf.g r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = l(r3, r2)     // Catch: java.lang.Throwable -> L69
            l3.q r5 = vg.a.f14320d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            qg.m1 r5 = qg.v.w(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.d0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.D()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.z(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.d0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.f(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.z(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
    }

    public static final long i(java.lang.String r4, long r5, long r7, long r9) {
            int r0 = vg.s.f14359a
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lb
            return r5
        Lb:
            java.lang.Long r5 = og.t.g0(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L43
            long r2 = r5.longValue()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L22
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 > 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "' should be in range "
            java.lang.StringBuilder r4 = eh.a.v(r1, r4, r0, r7)
            java.lang.String r7 = ".."
            java.lang.String r8 = ", but is '"
            j8.b.s(r4, r7, r9, r8)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L43:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static int j(int r7, int r8, java.lang.String r9) {
            r8 = r8 & 8
            if (r8 == 0) goto L8
            r8 = 2147483647(0x7fffffff, float:NaN)
            goto Lb
        L8:
            r8 = 2097150(0x1ffffe, float:2.938733E-39)
        Lb:
            long r1 = (long) r7
            r7 = 1
            long r3 = (long) r7
            long r5 = (long) r8
            r0 = r9
            long r7 = i(r0, r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    public static final java.lang.Object k(wf.g r2) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            i2.y r1 = vg.a.f14321e
            java.lang.Object r2 = r2.k(r1, r0)
            r2.getClass()
            return r2
    }

    public static final java.lang.Object l(wf.g r1, java.lang.Object r2) {
            if (r2 != 0) goto L6
            java.lang.Object r2 = k(r1)
        L6:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r2 != r0) goto L10
            l3.q r1 = vg.a.f14320d
            return r1
        L10:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L26
            vg.v r0 = new vg.v
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.<init>(r2, r1)
            vg.t r2 = vg.a.f14323g
            java.lang.Object r1 = r1.k(r2, r0)
            return r1
        L26:
            i0.o2 r2 = (i0.o2) r2
            r1 = 0
            android.os.Trace.beginSection(r1)
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
