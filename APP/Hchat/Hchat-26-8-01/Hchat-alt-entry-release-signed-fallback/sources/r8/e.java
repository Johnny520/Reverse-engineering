package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f11615a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f11616b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f11617c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f11618d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f11619e = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r8.e.f11615a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r8.e.f11616b = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            r8.e.f11617c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r8.e.f11618d = r0
            c9.q r0 = new c9.q
            r1 = 23
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            r8.e.f11619e = r0
            return
    }

    public static void a(r8.c r3) {
        L0:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.e.f11617c
            int r1 = r0.get()
            int r2 = r3.f11606g
            if (r1 < r2) goto Lb
            goto L11
        Lb:
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L0
        L11:
            java.util.concurrent.ConcurrentHashMap r3 = r8.e.f11616b
            java.util.Set r3 = r3.entrySet()
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r3, r1)
            o9.e r3 = new o9.e
            r1 = 29
            r3.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r0, r2, r3)
            r4.m r3 = new r4.m
            r0 = 3
            r3.<init>(r0)
            c9.a0 r0 = new c9.a0
            r2 = 26
            r0.<init>(r3, r2)
            c9.a0 r3 = new c9.a0
            r2 = 27
            r3.<init>(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ng.m.a0(r1, r0)
            tf.q.g1(r0, r3)
            java.util.Iterator r3 = r0.iterator()
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r1 = r0.getKey()
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            r8.d r0 = (r8.d) r0
            d(r1, r0)
            goto L52
        L77:
            return
    }

    public static boolean b(r8.c r1) {
            java.util.concurrent.atomic.AtomicInteger r0 = r8.e.f11617c
            int r0 = r0.get()
            int r1 = r1.f11606g
            if (r0 < r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static final void c(java.lang.Runnable r1) {
            java.lang.Object r0 = r8.e.f11618d
            monitor-enter(r0)
            r1.run()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public static void d(java.lang.String r4, r8.d r5) {
            r8.c r0 = r5.f11608b
            boolean r0 = b(r0)
            if (r0 != 0) goto L9
            goto L2c
        L9:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f11611e
            boolean r0 = r0.get()
            if (r0 == 0) goto L12
            goto L2c
        L12:
            fg.a r0 = r5.f11610d
            if (r0 == 0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f11612f
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 != 0) goto L21
            goto L2c
        L21:
            java.util.concurrent.ExecutorService r1 = r8.e.f11619e
            r8.b r2 = new r8.b
            r3 = 0
            r2.<init>(r5, r4, r0, r3)
            r1.execute(r2)
        L2c:
            return
    }

    public static void e(int r4, fg.a r5, java.lang.String r6, java.lang.String r7, r8.c r8) {
            r8.getClass()
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto La
            goto L31
        La:
            java.util.concurrent.ConcurrentHashMap r0 = r8.e.f11616b
            ca.s r1 = new ca.s
            r2 = 16
            r1.<init>(r7, r2)
            bc.j r2 = new bc.j
            r3 = 12
            r2.<init>(r1, r3)
            java.lang.Object r0 = r0.computeIfAbsent(r6, r2)
            r0.getClass()
            r8.d r0 = (r8.d) r0
            r0.f11607a = r7
            r0.f11608b = r8
            r0.f11609c = r4
            r0.f11610d = r5
            boolean r4 = b(r8)
            if (r4 != 0) goto L32
        L31:
            return
        L32:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f11611e
            boolean r4 = r4.get()
            if (r4 != 0) goto L59
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f11612f
            boolean r4 = r4.get()
            if (r4 != 0) goto L59
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f11613g
            boolean r4 = r4.get()
            if (r4 != 0) goto L59
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f11614h
            int r4 = r4.get()
            r5 = 6
            if (r4 < r5) goto L59
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f11614h
            r5 = 0
            r4.set(r5)
        L59:
            d(r6, r0)
            return
    }

    public static /* synthetic */ void f(int r1, fg.a r2, java.lang.String r3, java.lang.String r4, r8.c r5) {
            r0 = r1 & 4
            if (r0 == 0) goto L6
            r8.c r5 = r8.c.f11603i
        L6:
            r1 = r1 & 8
            if (r1 == 0) goto Lc
            r1 = 0
            goto Le
        Lc:
            r1 = -100
        Le:
            e(r1, r2, r3, r4, r5)
            return
    }
}
