package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8.t f21316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f21320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f21321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f21322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x8.j f21324k;

    public n(java.lang.String r1, java.lang.String r2, x8.t r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f21314a = r1
            r0.f21315b = r2
            r0.f21316c = r3
            r0.f21317d = r4
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.f21318e = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.f21319f = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.f21320g = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r2)
            r0.f21321h = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            r0.f21322i = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r0.f21323j = r1
            x8.j r1 = new x8.j
            r2 = 1
            r1.<init>(r0, r2)
            r0.f21324k = r1
            return
    }

    public final void a(java.lang.String r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f21320g
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L21
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21336h
            java.lang.String r1 = r3.f21314a
            r0.remove(r1, r3)
            java.util.concurrent.atomic.AtomicReference r0 = r3.f21318e
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            okhttp3.WebSocket r0 = (okhttp3.WebSocket) r0
            if (r0 == 0) goto L21
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.close(r1, r4)
        L21:
            return
    }

    public final void b(x8.m r5) {
            r4 = this;
            r5.getClass()
        L3:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f21319f
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1)
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            java.lang.Object r0 = r0.get()
            if (r0 == r5) goto L3
        L13:
            r4.e()
            java.util.concurrent.ScheduledExecutorService r5 = x8.q.f21330b
            wb.cr r0 = new wb.cr
            r1 = 4
            r0.<init>(r4, r1)
            r1 = 90000(0x15f90, double:4.4466E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r5.schedule(r0, r1, r3)
            return
    }

    public final void c(okhttp3.WebSocket r3) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r2.f21318e
            r1 = 0
            boolean r1 = r0.compareAndSet(r3, r1)
            if (r1 == 0) goto L1d
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f21320g
            r0 = 1
            r3.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f21321h
            r0 = 0
            r3.set(r0)
            java.util.concurrent.ConcurrentHashMap r3 = x8.q.f21336h
            java.lang.String r0 = r2.f21314a
            r3.remove(r0, r2)
            return
        L1d:
            java.lang.Object r0 = r0.get()
            if (r0 == r3) goto L0
            return
    }

    public final void d(x8.m r6) {
            r5 = this;
            r6.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = r5.f21319f
            java.lang.Object r0 = r0.getAndSet(r6)
            x8.m r0 = (x8.m) r0
            if (r0 == 0) goto L12
            x8.d r0 = r0.f21312f
            r0.invoke()
        L12:
            r5.e()
            java.util.concurrent.atomic.AtomicReference r0 = r5.f21318e
            java.lang.Object r0 = r0.get()
            okhttp3.WebSocket r0 = (okhttp3.WebSocket) r0
            if (r0 == 0) goto L3e
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f21321h
            boolean r1 = r1.get()
            if (r1 == 0) goto L3e
            java.util.concurrent.atomic.AtomicReference r1 = r5.f21323j
            java.lang.Object r1 = r1.get()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.f21313g
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r3, r4)
            if (r2 == 0) goto L3e
            wb.o7 r6 = r6.f21307a
            r6.invoke(r0, r1)
        L3e:
            return
    }

    public final void e() {
            r3 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r3.f21322i
            long r1 = java.lang.System.currentTimeMillis()
            r0.set(r1)
            return
    }
}
