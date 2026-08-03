package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.p f18201a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f18202b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static wb.dj f18203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static android.app.Activity f18204d;

    static {
            wb.p r0 = new wb.p
            r0.<init>()
            wb.p.f18201a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            wb.p.f18202b = r0
            return
    }

    public final synchronized void a(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = wb.p.f18202b     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r0.contains(r5)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Lb
            monitor-exit(r4)
            return
        Lb:
            java.lang.String r1 = "onActivityResult"
            ba.f r2 = new ba.f     // Catch: java.lang.Throwable -> L1a
            r3 = 29
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            de.robv.android.xposed.XposedBridge.hookAllMethods(r5, r1, r2)     // Catch: java.lang.Throwable -> L1a
            r0.add(r5)     // Catch: java.lang.Throwable -> L1a
        L1a:
            monitor-exit(r4)
            return
        L1c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
    }
}
