package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements l3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f7811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3.c f7812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.a f7813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f7814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.os.Handler f7815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.util.concurrent.ThreadPoolExecutor f7816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.concurrent.ThreadPoolExecutor f7817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a7.a f7818h;

    public r(android.content.Context r2, e3.c r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f7814d = r0
            java.lang.String r0 = "Context cannot be null"
            ac.p.k(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            r1.f7811a = r2
            r1.f7812b = r3
            a2.a r2 = l3.s.f7819d
            r1.f7813c = r2
            return
    }

    @Override // l3.h
    public final void a(a7.a r10) {
            r9 = this;
            java.lang.Object r1 = r9.f7814d
            monitor-enter(r1)
            r9.f7818h = r10     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r10 = r9.f7814d
            monitor-enter(r10)
            a7.a r0 = r9.f7818h     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            goto L42
        L11:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f7816f     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L34
            java.lang.String r0 = "emojiCompat"
            l3.a r8 = new l3.a     // Catch: java.lang.Throwable -> Lf
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.LinkedBlockingDeque r7 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> Lf
            r7.<init>()     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r3 = 1
            r4 = 15
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            r1.allowCoreThreadTimeOut(r0)     // Catch: java.lang.Throwable -> Lf
            r9.f7817g = r1     // Catch: java.lang.Throwable -> Lf
            r9.f7816f = r1     // Catch: java.lang.Throwable -> Lf
        L34:
            java.util.concurrent.ThreadPoolExecutor r0 = r9.f7816f     // Catch: java.lang.Throwable -> Lf
            a1.a r1 = new a1.a     // Catch: java.lang.Throwable -> Lf
            r2 = 24
            r1.<init>(r9, r2)     // Catch: java.lang.Throwable -> Lf
            r0.execute(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            return
        L42:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r0
        L44:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r10
    }

    public final void b() {
            r4 = this;
            java.lang.Object r0 = r4.f7814d
            monitor-enter(r0)
            r1 = 0
            r4.f7818h = r1     // Catch: java.lang.Throwable -> Lf
            android.os.Handler r2 = r4.f7815e     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r3 = 0
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L20
        L11:
            r4.f7815e = r1     // Catch: java.lang.Throwable -> Lf
            java.util.concurrent.ThreadPoolExecutor r2 = r4.f7817g     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L1a
            r2.shutdown()     // Catch: java.lang.Throwable -> Lf
        L1a:
            r4.f7816f = r1     // Catch: java.lang.Throwable -> Lf
            r4.f7817g = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final e3.d c() {
            r4 = this;
            a2.a r0 = r4.f7813c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            android.content.Context r1 = r4.f7811a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            e3.c r2 = r4.f7812b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r0.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r3 = 1
            r2.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r3 = 0
            r0 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.util.Objects.requireNonNull(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            r2.add(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            a5.a r0 = e3.b.a(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4d
            int r1 = r0.f56h
            if (r1 != 0) goto L41
            java.lang.Object r0 = r0.f57i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            e3.d[] r0 = (e3.d[]) r0
            if (r0 == 0) goto L3a
            int r1 = r0.length
            if (r1 == 0) goto L3a
            r0 = r0[r3]
            return r0
        L3a:
            java.lang.String r0 = "fetchFonts failed (empty result)"
            bsh.j.g(r0)
        L3f:
            r0 = 0
            return r0
        L41:
            java.lang.String r0 = "fetchFonts failed ("
            java.lang.String r2 = ")"
            java.lang.String r0 = eh.a.m(r1, r0, r2)
            bsh.j.g(r0)
            goto L3f
        L4d:
            r0 = move-exception
            java.lang.String r1 = "provider not found"
            ah.a.p(r1, r0)
            goto L3f
    }
}
