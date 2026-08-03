package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a1.d f217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a1.d f218h;

    public final synchronized void a() {
            r2 = this;
            monitor-enter(r2)
            a1.d r0 = r2.f218h     // Catch: java.lang.Throwable -> L14
            r2.f217g = r0     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2.f218h = r1     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            java.util.concurrent.Executor r0 = ac.p.w()     // Catch: java.lang.Throwable -> L14
            a1.d r1 = r2.f217g     // Catch: java.lang.Throwable -> L14
            r0.execute(r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r2)
            return
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(java.lang.Runnable r3) {
            r2 = this;
            monitor-enter(r2)
            a1.d r0 = r2.f217g     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            a1.d r0 = new a1.d     // Catch: java.lang.Throwable -> L17
            r1 = 2
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L17
            r2.f217g = r0     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Executor r3 = ac.p.w()     // Catch: java.lang.Throwable -> L17
            a1.d r0 = r2.f217g     // Catch: java.lang.Throwable -> L17
            r3.execute(r0)     // Catch: java.lang.Throwable -> L17
            goto L25
        L17:
            r3 = move-exception
            goto L27
        L19:
            a1.d r0 = r2.f218h     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L25
            a1.d r0 = new a1.d     // Catch: java.lang.Throwable -> L17
            r1 = 2
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L17
            r2.f218h = r0     // Catch: java.lang.Throwable -> L17
        L25:
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }
}
