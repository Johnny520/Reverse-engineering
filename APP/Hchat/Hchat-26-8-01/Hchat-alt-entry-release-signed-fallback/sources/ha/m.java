package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f5257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f5258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b9.b f5259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ScheduledExecutorService f5260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5261e;

    public m(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f5257a = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_auto_refresh_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f5258b = r1
            b9.b r1 = new b9.b
            r2 = 5
            r1.<init>(r0, r2)
            r0.f5259c = r1
            return
    }

    public final synchronized void a() {
            r9 = this;
            monitor-enter(r9)
            android.content.SharedPreferences r0 = r9.f5258b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L1f
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r0 = r9.f5260d     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r0.shutdownNow()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L1d
        L17:
            r0 = 0
            r9.f5260d = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r9)
            return
        L1d:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L2a
        L1f:
            java.util.concurrent.ScheduledExecutorService r0 = r9.f5260d     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            boolean r0 = r0.isShutdown()     // Catch: java.lang.Throwable -> L2a
            r2 = r0 ^ 1
            goto L2c
        L2a:
            r0 = move-exception
            goto L53
        L2c:
            if (r2 == 0) goto L30
            monitor-exit(r9)
            return
        L30:
            r0 = 0
            r9.f5261e = r0     // Catch: java.lang.Throwable -> L2a
            c9.q r0 = new c9.q     // Catch: java.lang.Throwable -> L2a
            r1 = 13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)     // Catch: java.lang.Throwable -> L2a
            a1.a r3 = new a1.a     // Catch: java.lang.Throwable -> L2a
            r0 = 10
            r3.<init>(r9, r0)     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L2a
            r4 = 1
            r6 = 1
            r2.scheduleWithFixedDelay(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L2a
            r9.f5260d = r2     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r9)
            return
        L53:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2a
            throw r0
    }
}
