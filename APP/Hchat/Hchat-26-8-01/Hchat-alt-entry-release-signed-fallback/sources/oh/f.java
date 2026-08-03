package oh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements mh.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f9852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f9854i;

    public f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9852g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f9853h = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.f9854i = r0
            return
    }

    @Override // mh.a
    public final synchronized mh.b d(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r3.f9853h     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1a
            oh.e r0 = (oh.e) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            oh.e r0 = new oh.e     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.LinkedBlockingQueue r1 = r3.f9854i     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r3.f9852g     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.ConcurrentHashMap r1 = r3.f9853h     // Catch: java.lang.Throwable -> L1a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r3)
            return r0
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }
}
