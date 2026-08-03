package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ba.g f563a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f564b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f565c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f566d = null;

    static {
            ba.g r0 = new ba.g
            r0.<init>()
            ba.g.f563a = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 27408(0x6b10, float:3.8407E-41)
            r0.<init>(r1)
            ba.g.f564b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            ba.g.f565c = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            ba.g.f566d = r0
            return
    }

    public final synchronized void a(java.lang.Class r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = ba.g.f566d     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.add(r4)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.lang.String r0 = "onActivityResult"
            ba.f r1 = new ba.f     // Catch: java.lang.Throwable -> L18
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L18
            java.util.Set r0 = de.robv.android.xposed.XposedBridge.hookAllMethods(r4, r0, r1)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r0 = move-exception
            sf.f r1 = new sf.f     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r0 = r1
        L1f:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = ba.g.f566d     // Catch: java.lang.Throwable -> L2b
            r0.remove(r4)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r4 = move-exception
            goto L2f
        L2d:
            monitor-exit(r3)
            return
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }
}
