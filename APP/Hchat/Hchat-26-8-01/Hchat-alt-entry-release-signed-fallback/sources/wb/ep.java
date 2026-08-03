package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.ep f16002a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f16003b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static wb.dp f16004c;

    static {
            wb.ep r0 = new wb.ep
            r0.<init>()
            wb.ep.f16002a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            wb.ep.f16003b = r0
            return
    }

    public final synchronized void a(java.lang.Class r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.HashSet r0 = wb.ep.f16003b     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.add(r4)     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            java.lang.String r0 = "onActivityResult"
            wb.yo r1 = new wb.yo     // Catch: java.lang.Throwable -> L18
            r2 = 1
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
            java.util.HashSet r0 = wb.ep.f16003b     // Catch: java.lang.Throwable -> L2b
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
